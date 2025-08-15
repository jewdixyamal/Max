package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Locale;
import java.util.NoSuchElementException;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: ane  reason: default package */
public final class ane implements X509TrustManager {
    public final String a;
    public final String b;
    public final X509TrustManager c;
    public final X509TrustManagerExtensions d;

    public ane(String str) {
        this.a = str;
        String name = ane.class.getName();
        this.b = name;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, name, "init, useX509Extension=true", (Throwable) null);
        }
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        X509TrustManager x509TrustManager = (X509TrustManager) instance.getTrustManagers()[0];
        this.c = x509TrustManager;
        this.d = new X509TrustManagerExtensions(x509TrustManager);
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        String str2 = this.b;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str2, wg0.i("checkClientTrusted, authType=", str), (Throwable) null);
        }
        this.c.checkClientTrusted(x509CertificateArr, str);
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        String str2 = this.b;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str2, wg0.i("checkServerTrusted, authType=", str), (Throwable) null);
        }
        try {
            if (this.d != null) {
                String str3 = this.b;
                ir6 ir62 = hm9.m;
                if (ir62 != null) {
                    if (ir62.c()) {
                        ir62.d(us7.X, str3, "checkServerTrusted, use X509 extension, host=" + this.a, (Throwable) null);
                    }
                }
                this.d.checkServerTrusted(x509CertificateArr, str, this.a);
                return;
            }
            this.c.checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            hm9.p(this.b, "server certificate chain not trusted", e);
            if (x509CertificateArr != null) {
                String str4 = this.b;
                ir6 ir63 = hm9.m;
                if (ir63 != null && ir63.c()) {
                    us7 us7 = us7.X;
                    StringBuilder sb = new StringBuilder("\n");
                    int length = x509CertificateArr.length;
                    for (int i = 0; i < length; i++) {
                        sb.append(i);
                        sb.append('.');
                        sb.append(' ');
                        tpa.c(sb, x509CertificateArr[i]);
                    }
                    ir63.d(us7, str4, "server certificate chain: " + sb, (Throwable) null);
                }
            }
            try {
                Locale locale = Locale.getDefault();
                StringBuilder sb2 = new StringBuilder();
                X509Certificate[] acceptedIssuers = this.c.getAcceptedIssuers();
                int i2 = 0;
                while (i2 < acceptedIssuers.length) {
                    int i3 = i2 + 1;
                    X509Certificate x509Certificate = acceptedIssuers[i2];
                    Principal issuerDN = x509Certificate.getIssuerDN();
                    String name = issuerDN != null ? issuerDN.getName() : null;
                    Principal subjectDN = x509Certificate.getSubjectDN();
                    String name2 = subjectDN != null ? subjectDN.getName() : null;
                    if (name != null) {
                        if (w9e.p0(name.toLowerCase(locale), "comodo", false)) {
                            tpa.c(sb2, x509Certificate);
                            i2 = i3;
                        }
                    }
                    if (name2 != null) {
                        if (!w9e.p0(name2.toLowerCase(locale), "comodo", false)) {
                        }
                        tpa.c(sb2, x509Certificate);
                    }
                    i2 = i3;
                }
                String str5 = this.b;
                ir6 ir64 = hm9.m;
                if (ir64 != null && ir64.c()) {
                    ir64.d(us7.X, str5, "trusted store certificates: " + sb2, (Throwable) null);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new NoSuchElementException(e2.getMessage());
            } catch (GeneralSecurityException e3) {
                hm9.p(this.b, "failed to log trusted store certificates", e3);
            }
            throw e;
        }
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return this.c.getAcceptedIssuers();
    }
}
