package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* renamed from: jd  reason: default package */
public final class jd extends a14 {
    public final X509TrustManager j;
    public final X509TrustManagerExtensions k;

    public jd(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.j = x509TrustManager;
        this.k = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jd) && ((jd) obj).j == this.j;
    }

    public final int hashCode() {
        return System.identityHashCode(this.j);
    }

    public final List i(String str, List list) {
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                return this.k.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
