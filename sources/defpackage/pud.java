package defpackage;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: pud  reason: default package */
public final class pud extends SSLSocketFactory {
    public final String a;
    public final SSLCertificateSocketFactory b;

    public pud(Context context, String str) {
        SSLSessionCache sSLSessionCache;
        String name = pud.class.getName();
        this.a = name;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, name, "init, useX509Extension=true", (Throwable) null);
        }
        try {
            sSLSessionCache = new SSLSessionCache(context.getDir("tamtam_sslcache", 0));
        } catch (IOException e) {
            hm9.p(this.a, "failed to create ssl cache with specified dir", e);
            sSLSessionCache = new SSLSessionCache(context);
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(5000, sSLSessionCache);
        this.b = sSLCertificateSocketFactory;
        try {
            sSLCertificateSocketFactory.setTrustManagers((TrustManager[]) new ane[]{new ane(str)});
        } catch (Throwable th) {
            hm9.p(this.a, "failed set tam trust manager to default ssl socket factory", th);
            throw th;
        }
    }

    public final Socket createSocket() {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket createSocket = sSLCertificateSocketFactory.createSocket();
        sSLCertificateSocketFactory.setUseSessionTickets(createSocket, true);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.b.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.b.getSupportedCipherSuites();
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket createSocket = sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLCertificateSocketFactory.setUseSessionTickets(createSocket, true);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket createSocket = sSLCertificateSocketFactory.createSocket(socket, str, i, z);
        sSLCertificateSocketFactory.setUseSessionTickets(createSocket, true);
        return createSocket;
    }

    public final Socket createSocket(String str, int i) {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket createSocket = sSLCertificateSocketFactory.createSocket(str, i);
        sSLCertificateSocketFactory.setUseSessionTickets(createSocket, true);
        return createSocket;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket createSocket = sSLCertificateSocketFactory.createSocket(str, i, inetAddress, i2);
        sSLCertificateSocketFactory.setUseSessionTickets(createSocket, true);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket createSocket = sSLCertificateSocketFactory.createSocket(inetAddress, i, inetAddress2, i2);
        sSLCertificateSocketFactory.setUseSessionTickets(createSocket, true);
        return createSocket;
    }
}
