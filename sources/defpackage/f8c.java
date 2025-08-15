package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;

/* renamed from: f8c  reason: default package */
public final class f8c extends cp6 {
    public Socket b;
    public Socket c;
    public fi6 d;
    public sob e;
    public kp6 f;
    public y7c g;
    public x7c h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n = 1;
    public final ArrayList o = new ArrayList();
    public long p = Long.MAX_VALUE;
    public final xnc q;

    public f8c(xnc xnc) {
        this.q = xnc;
    }

    public static void d(u2a u2a, xnc xnc, IOException iOException) {
        if (xnc.b.type() != Proxy.Type.DIRECT) {
            y9 y9Var = xnc.a;
            y9Var.k.connectFailed(y9Var.a.h(), xnc.b.address(), iOException);
        }
        wd6 wd6 = u2a.N0;
        synchronized (wd6) {
            ((LinkedHashSet) wd6.b).add(xnc);
        }
    }

    public final synchronized void a(ded ded) {
        this.n = (ded.a & 16) != 0 ? ded.b[4] : Integer.MAX_VALUE;
    }

    public final void b(rp6 rp6) {
        rp6.c(8, (IOException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r6, int r7, int r8, int r9, boolean r10, defpackage.b8c r11, defpackage.dp3 r12) {
        /*
            r5 = this;
            sob r11 = r5.e
            if (r11 != 0) goto L_0x0116
            xnc r11 = r5.q
            y9 r11 = r11.a
            java.util.List r0 = r11.c
            sh3 r1 = new sh3
            r1.<init>(r0)
            javax.net.ssl.SSLSocketFactory r2 = r11.f
            if (r2 != 0) goto L_0x004e
            rh3 r11 = defpackage.rh3.f
            boolean r11 = r0.contains(r11)
            if (r11 == 0) goto L_0x0041
            xnc r11 = r5.q
            y9 r11 = r11.a
            vq6 r11 = r11.a
            java.lang.String r11 = r11.e
            q2b r0 = defpackage.q2b.a
            q2b r0 = defpackage.q2b.a
            boolean r0 = r0.h(r11)
            if (r0 == 0) goto L_0x002e
            goto L_0x0058
        L_0x002e:
            okhttp3.internal.connection.RouteException r5 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r6 = new java.net.UnknownServiceException
            java.lang.String r7 = "CLEARTEXT communication to "
            java.lang.String r8 = " not permitted by network security policy"
            java.lang.String r7 = defpackage.zr6.i(r7, r11, r8)
            r6.<init>(r7)
            r5.<init>(r6)
            throw r5
        L_0x0041:
            okhttp3.internal.connection.RouteException r5 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r6 = new java.net.UnknownServiceException
            java.lang.String r7 = "CLEARTEXT communication not enabled for client"
            r6.<init>(r7)
            r5.<init>(r6)
            throw r5
        L_0x004e:
            java.util.List r11 = r11.b
            sob r0 = defpackage.sob.H2_PRIOR_KNOWLEDGE
            boolean r11 = r11.contains(r0)
            if (r11 != 0) goto L_0x0109
        L_0x0058:
            r11 = 0
            r0 = r11
        L_0x005a:
            r2 = 1
            xnc r3 = r5.q     // Catch:{ IOException -> 0x007a }
            y9 r4 = r3.a     // Catch:{ IOException -> 0x007a }
            javax.net.ssl.SSLSocketFactory r4 = r4.f     // Catch:{ IOException -> 0x007a }
            if (r4 == 0) goto L_0x006f
            java.net.Proxy r3 = r3.b     // Catch:{ IOException -> 0x007a }
            java.net.Proxy$Type r3 = r3.type()     // Catch:{ IOException -> 0x007a }
            java.net.Proxy$Type r4 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x007a }
            if (r3 != r4) goto L_0x006f
            r3 = r2
            goto L_0x0070
        L_0x006f:
            r3 = 0
        L_0x0070:
            if (r3 == 0) goto L_0x007c
            r5.f(r6, r7, r8, r12)     // Catch:{ IOException -> 0x007a }
            java.net.Socket r3 = r5.b     // Catch:{ IOException -> 0x007a }
            if (r3 != 0) goto L_0x007f
            goto L_0x0086
        L_0x007a:
            r3 = move-exception
            goto L_0x00b1
        L_0x007c:
            r5.e(r6, r7, r12)     // Catch:{ IOException -> 0x007a }
        L_0x007f:
            r5.g(r1, r9, r12)     // Catch:{ IOException -> 0x007a }
            xnc r3 = r5.q     // Catch:{ IOException -> 0x007a }
            java.net.InetSocketAddress r6 = r3.c     // Catch:{ IOException -> 0x007a }
        L_0x0086:
            xnc r6 = r5.q
            y9 r7 = r6.a
            javax.net.ssl.SSLSocketFactory r7 = r7.f
            if (r7 == 0) goto L_0x00aa
            java.net.Proxy r6 = r6.b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.HTTP
            if (r6 != r7) goto L_0x00aa
            java.net.Socket r6 = r5.b
            if (r6 == 0) goto L_0x009d
            goto L_0x00aa
        L_0x009d:
            okhttp3.internal.connection.RouteException r5 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r7 = "Too many tunnel connections attempted: 21"
            r6.<init>(r7)
            r5.<init>(r6)
            throw r5
        L_0x00aa:
            long r6 = java.lang.System.nanoTime()
            r5.p = r6
            return
        L_0x00b1:
            java.net.Socket r4 = r5.c
            if (r4 == 0) goto L_0x00b8
            defpackage.naf.d(r4)
        L_0x00b8:
            java.net.Socket r4 = r5.b
            if (r4 == 0) goto L_0x00bf
            defpackage.naf.d(r4)
        L_0x00bf:
            r5.c = r11
            r5.b = r11
            r5.g = r11
            r5.h = r11
            r5.d = r11
            r5.e = r11
            r5.f = r11
            r5.n = r2
            xnc r4 = r5.q
            java.net.InetSocketAddress r4 = r4.c
            if (r0 != 0) goto L_0x00db
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            r0.<init>(r3)
            goto L_0x00e2
        L_0x00db:
            java.io.IOException r4 = r0.b
            defpackage.j47.e(r4, r3)
            r0.a = r3
        L_0x00e2:
            if (r10 == 0) goto L_0x0108
            r1.c = r2
            boolean r2 = r1.b
            if (r2 == 0) goto L_0x0108
            boolean r2 = r3 instanceof java.net.ProtocolException
            if (r2 != 0) goto L_0x0108
            boolean r2 = r3 instanceof java.io.InterruptedIOException
            if (r2 != 0) goto L_0x0108
            boolean r2 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r2 == 0) goto L_0x00fe
            java.lang.Throwable r2 = r3.getCause()
            boolean r2 = r2 instanceof java.security.cert.CertificateException
            if (r2 != 0) goto L_0x0108
        L_0x00fe:
            boolean r2 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r2 != 0) goto L_0x0108
            boolean r2 = r3 instanceof javax.net.ssl.SSLException
            if (r2 == 0) goto L_0x0108
            goto L_0x005a
        L_0x0108:
            throw r0
        L_0x0109:
            okhttp3.internal.connection.RouteException r5 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r6 = new java.net.UnknownServiceException
            java.lang.String r7 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r6.<init>(r7)
            r5.<init>(r6)
            throw r5
        L_0x0116:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "already connected"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8c.c(int, int, int, int, boolean, b8c, dp3):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r5 = defpackage.c8c.$EnumSwitchMapping$0[r5.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(int r8, int r9, defpackage.dp3 r10) {
        /*
            r7 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            xnc r3 = r7.q
            java.net.Proxy r4 = r3.b
            y9 r3 = r3.a
            java.net.Proxy$Type r5 = r4.type()
            if (r5 != 0) goto L_0x0010
            goto L_0x001c
        L_0x0010:
            int[] r6 = defpackage.c8c.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 == r2) goto L_0x0022
            if (r5 == r1) goto L_0x0022
        L_0x001c:
            java.net.Socket r3 = new java.net.Socket
            r3.<init>(r4)
            goto L_0x0028
        L_0x0022:
            javax.net.SocketFactory r3 = r3.e
            java.net.Socket r3 = r3.createSocket()
        L_0x0028:
            r7.b = r3
            xnc r4 = r7.q
            java.net.InetSocketAddress r4 = r4.c
            r10.getClass()
            r3.setSoTimeout(r9)
            q2b r9 = defpackage.q2b.a     // Catch:{ ConnectException -> 0x008a }
            q2b r9 = defpackage.q2b.a     // Catch:{ ConnectException -> 0x008a }
            xnc r10 = r7.q     // Catch:{ ConnectException -> 0x008a }
            java.net.InetSocketAddress r10 = r10.c     // Catch:{ ConnectException -> 0x008a }
            r9.e(r3, r10, r8)     // Catch:{ ConnectException -> 0x008a }
            java.util.logging.Logger r8 = defpackage.x2a.a     // Catch:{ NullPointerException -> 0x0076 }
            qp6 r8 = new qp6     // Catch:{ NullPointerException -> 0x0076 }
            r8.<init>(r1, r3)     // Catch:{ NullPointerException -> 0x0076 }
            vx r9 = new vx     // Catch:{ NullPointerException -> 0x0076 }
            java.io.InputStream r10 = r3.getInputStream()     // Catch:{ NullPointerException -> 0x0076 }
            r9.<init>(r10, r2, r8)     // Catch:{ NullPointerException -> 0x0076 }
            vx r10 = new vx     // Catch:{ NullPointerException -> 0x0076 }
            r10.<init>(r8, r0, r9)     // Catch:{ NullPointerException -> 0x0076 }
            y7c r8 = new y7c     // Catch:{ NullPointerException -> 0x0076 }
            r8.<init>(r10)     // Catch:{ NullPointerException -> 0x0076 }
            r7.g = r8     // Catch:{ NullPointerException -> 0x0076 }
            qp6 r8 = new qp6     // Catch:{ NullPointerException -> 0x0076 }
            r8.<init>(r1, r3)     // Catch:{ NullPointerException -> 0x0076 }
            ux r9 = new ux     // Catch:{ NullPointerException -> 0x0076 }
            java.io.OutputStream r10 = r3.getOutputStream()     // Catch:{ NullPointerException -> 0x0076 }
            r9.<init>(r10, r2, r8)     // Catch:{ NullPointerException -> 0x0076 }
            ux r10 = new ux     // Catch:{ NullPointerException -> 0x0076 }
            r10.<init>(r8, r0, r9)     // Catch:{ NullPointerException -> 0x0076 }
            x7c r8 = new x7c     // Catch:{ NullPointerException -> 0x0076 }
            r8.<init>(r10)     // Catch:{ NullPointerException -> 0x0076 }
            r7.h = r8     // Catch:{ NullPointerException -> 0x0076 }
            goto L_0x0083
        L_0x0076:
            r7 = move-exception
            java.lang.String r8 = r7.getMessage()
            java.lang.String r9 = "throw with null exception"
            boolean r8 = defpackage.tpa.f(r8, r9)
            if (r8 != 0) goto L_0x0084
        L_0x0083:
            return
        L_0x0084:
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r7)
            throw r8
        L_0x008a:
            r8 = move-exception
            java.net.ConnectException r9 = new java.net.ConnectException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to connect to "
            r10.<init>(r0)
            xnc r7 = r7.q
            java.net.InetSocketAddress r7 = r7.c
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r9.<init>(r7)
            r9.initCause(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8c.e(int, int, dp3):void");
    }

    public final void f(int i2, int i3, int i4, dp3 dp3) {
        l84 l84 = new l84();
        xnc xnc = this.q;
        l84.a = xnc.a.a;
        l84.G("CONNECT", (tfg) null);
        y9 y9Var = xnc.a;
        ((bj6) l84.c).h(HTTP.TARGET_HOST, naf.v(y9Var.a, true));
        ((bj6) l84.c).h("Proxy-Connection", HTTP.CONN_KEEP_ALIVE);
        ((bj6) l84.c).h(HTTP.USER_AGENT, "okhttp/4.9.2");
        mhc r = l84.r();
        xic xic = new xic();
        xic.a = r;
        xic.b = sob.HTTP_1_1;
        xic.c = HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED;
        xic.d = "Preemptive Authenticate";
        xic.g = naf.c;
        xic.k = -1;
        xic.l = -1;
        xic.f.h(AUTH.PROXY_AUTH, "OkHttp-Preemptive");
        xic.a();
        y9Var.i.getClass();
        e(i2, i3, dp3);
        y7c y7c = this.g;
        x7c x7c = this.h;
        x8 x8Var = new x8((u2a) null, this, y7c, x7c);
        oue p2 = y7c.c.p();
        long j2 = (long) i3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        p2.g(j2, timeUnit);
        x7c.c.p().g((long) i4, timeUnit);
        x8Var.R(r.d, "CONNECT " + naf.v(r.b, true) + " HTTP/1.1");
        x8Var.b();
        xic e2 = x8Var.e(false);
        e2.a = r;
        yic a = e2.a();
        long j3 = naf.j(a);
        if (j3 != -1) {
            xo6 F = x8Var.F(j3);
            naf.t(F, Integer.MAX_VALUE, timeUnit);
            F.close();
        }
        int i5 = a.o;
        if (i5 != 200) {
            if (i5 == 407) {
                y9Var.i.getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(zr6.h(i5, "Unexpected response code for CONNECT: "));
        } else if (!y7c.a.B() || !x7c.a.B()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.sh3 r17, int r18, defpackage.dp3 r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = 2
            r3 = 1
            r4 = 0
            xnc r5 = r0.q
            y9 r5 = r5.a
            javax.net.ssl.SSLSocketFactory r6 = r5.f
            sob r7 = defpackage.sob.HTTP_1_1
            if (r6 != 0) goto L_0x002c
            java.util.List r2 = r5.b
            sob r3 = defpackage.sob.H2_PRIOR_KNOWLEDGE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x0025
            java.net.Socket r2 = r0.b
            r0.c = r2
            r0.e = r3
            r0.l(r1)
            return
        L_0x0025:
            java.net.Socket r1 = r0.b
            r0.c = r1
            r0.e = r7
            return
        L_0x002c:
            r19.getClass()
            java.lang.String r5 = "Hostname "
            java.lang.String r6 = "\n              |Hostname "
            xnc r8 = r0.q
            y9 r8 = r8.a
            javax.net.ssl.SSLSocketFactory r9 = r8.f
            java.net.Socket r11 = r0.b     // Catch:{ all -> 0x01b0 }
            vq6 r12 = r8.a     // Catch:{ all -> 0x01b0 }
            java.lang.String r13 = r12.e     // Catch:{ all -> 0x01b0 }
            int r12 = r12.f     // Catch:{ all -> 0x01b0 }
            java.net.Socket r9 = r9.createSocket(r11, r13, r12, r3)     // Catch:{ all -> 0x01b0 }
            if (r9 == 0) goto L_0x01b4
            javax.net.ssl.SSLSocket r9 = (javax.net.ssl.SSLSocket) r9     // Catch:{ all -> 0x01b0 }
            r11 = r17
            rh3 r11 = r11.a(r9)     // Catch:{ all -> 0x0061 }
            boolean r12 = r11.b     // Catch:{ all -> 0x0061 }
            if (r12 == 0) goto L_0x0065
            q2b r12 = defpackage.q2b.a     // Catch:{ all -> 0x0061 }
            q2b r12 = defpackage.q2b.a     // Catch:{ all -> 0x0061 }
            vq6 r13 = r8.a     // Catch:{ all -> 0x0061 }
            java.lang.String r13 = r13.e     // Catch:{ all -> 0x0061 }
            java.util.List r14 = r8.b     // Catch:{ all -> 0x0061 }
            r12.d(r9, r13, r14)     // Catch:{ all -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            r10 = r9
            goto L_0x01bf
        L_0x0065:
            r9.startHandshake()     // Catch:{ all -> 0x0061 }
            javax.net.ssl.SSLSession r12 = r9.getSession()     // Catch:{ all -> 0x0061 }
            fi6 r13 = defpackage.oag.o(r12)     // Catch:{ all -> 0x0061 }
            javax.net.ssl.HostnameVerifier r14 = r8.g     // Catch:{ all -> 0x0061 }
            vq6 r15 = r8.a     // Catch:{ all -> 0x0061 }
            java.lang.String r15 = r15.e     // Catch:{ all -> 0x0061 }
            boolean r12 = r14.verify(r15, r12)     // Catch:{ all -> 0x0061 }
            if (r12 != 0) goto L_0x0124
            java.util.List r0 = r13.a()     // Catch:{ all -> 0x0061 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0061 }
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0109
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0095
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r0.<init>(r1)     // Catch:{ all -> 0x0061 }
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0095:
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ all -> 0x0061 }
            javax.net.ssl.SSLPeerUnverifiedException r1 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r3.<init>(r6)     // Catch:{ all -> 0x0061 }
            vq6 r4 = r8.a     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r4.e     // Catch:{ all -> 0x0061 }
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = " not verified:\n              |    certificate: "
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            e12 r4 = defpackage.e12.c     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            java.lang.String r5 = "sha256/"
            r4.<init>(r5)     // Catch:{ all -> 0x0061 }
            java.security.PublicKey r5 = r0.getPublicKey()     // Catch:{ all -> 0x0061 }
            byte[] r5 = r5.getEncoded()     // Catch:{ all -> 0x0061 }
            aw0 r5 = defpackage.oq9.k(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = "SHA-256"
            aw0 r5 = r5.b(r6)     // Catch:{ all -> 0x0061 }
            java.lang.String r5 = r5.a()     // Catch:{ all -> 0x0061 }
            r4.append(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0061 }
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "\n              |    DN: "
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            java.security.Principal r4 = r0.getSubjectDN()     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0061 }
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "\n              |    subjectAltNames: "
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            r4 = 7
            java.util.List r4 = defpackage.s2a.a(r0, r4)     // Catch:{ all -> 0x0061 }
            java.util.List r0 = defpackage.s2a.a(r0, r2)     // Catch:{ all -> 0x0061 }
            java.util.ArrayList r0 = defpackage.x53.t0(r4, r0)     // Catch:{ all -> 0x0061 }
            r3.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "\n              "
            r3.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = defpackage.x9e.c0(r0)     // Catch:{ all -> 0x0061 }
            r1.<init>(r0)     // Catch:{ all -> 0x0061 }
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0109:
            javax.net.ssl.SSLPeerUnverifiedException r0 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r1.<init>(r5)     // Catch:{ all -> 0x0061 }
            vq6 r2 = r8.a     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = r2.e     // Catch:{ all -> 0x0061 }
            r1.append(r2)     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = " not verified (no certificates)"
            r1.append(r2)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0061 }
            r0.<init>(r1)     // Catch:{ all -> 0x0061 }
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0124:
            e12 r5 = r8.h     // Catch:{ all -> 0x0061 }
            fi6 r6 = new fi6     // Catch:{ all -> 0x0061 }
            awe r12 = r13.b     // Catch:{ all -> 0x0061 }
            u13 r14 = r13.c     // Catch:{ all -> 0x0061 }
            java.util.List r15 = r13.d     // Catch:{ all -> 0x0061 }
            d8c r10 = new d8c     // Catch:{ all -> 0x0061 }
            r10.<init>(r5, r13, r8, r4)     // Catch:{ all -> 0x0061 }
            r6.<init>(r12, r14, r15, r10)     // Catch:{ all -> 0x0061 }
            r0.d = r6     // Catch:{ all -> 0x0061 }
            vq6 r6 = r8.a     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = r6.e     // Catch:{ all -> 0x0061 }
            java.util.Set r5 = r5.a     // Catch:{ all -> 0x0061 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0061 }
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0061 }
            if (r6 != 0) goto L_0x01a7
            boolean r5 = r11.b     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0155
            q2b r5 = defpackage.q2b.a     // Catch:{ all -> 0x0061 }
            q2b r5 = defpackage.q2b.a     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = r5.f(r9)     // Catch:{ all -> 0x0061 }
            goto L_0x0156
        L_0x0155:
            r10 = 0
        L_0x0156:
            r0.c = r9     // Catch:{ all -> 0x0061 }
            java.util.logging.Logger r5 = defpackage.x2a.a     // Catch:{ all -> 0x0061 }
            qp6 r5 = new qp6     // Catch:{ all -> 0x0061 }
            r5.<init>(r2, r9)     // Catch:{ all -> 0x0061 }
            vx r6 = new vx     // Catch:{ all -> 0x0061 }
            java.io.InputStream r8 = r9.getInputStream()     // Catch:{ all -> 0x0061 }
            r6.<init>(r8, r3, r5)     // Catch:{ all -> 0x0061 }
            vx r8 = new vx     // Catch:{ all -> 0x0061 }
            r8.<init>(r5, r4, r6)     // Catch:{ all -> 0x0061 }
            y7c r5 = new y7c     // Catch:{ all -> 0x0061 }
            r5.<init>(r8)     // Catch:{ all -> 0x0061 }
            r0.g = r5     // Catch:{ all -> 0x0061 }
            qp6 r5 = new qp6     // Catch:{ all -> 0x0061 }
            r5.<init>(r2, r9)     // Catch:{ all -> 0x0061 }
            ux r2 = new ux     // Catch:{ all -> 0x0061 }
            java.io.OutputStream r6 = r9.getOutputStream()     // Catch:{ all -> 0x0061 }
            r2.<init>(r6, r3, r5)     // Catch:{ all -> 0x0061 }
            ux r3 = new ux     // Catch:{ all -> 0x0061 }
            r3.<init>(r5, r4, r2)     // Catch:{ all -> 0x0061 }
            x7c r2 = new x7c     // Catch:{ all -> 0x0061 }
            r2.<init>(r3)     // Catch:{ all -> 0x0061 }
            r0.h = r2     // Catch:{ all -> 0x0061 }
            if (r10 == 0) goto L_0x0194
            sob r7 = defpackage.ema.q(r10)     // Catch:{ all -> 0x0061 }
        L_0x0194:
            r0.e = r7     // Catch:{ all -> 0x0061 }
            q2b r2 = defpackage.q2b.a
            q2b r2 = defpackage.q2b.a
            r2.a(r9)
            sob r2 = r0.e
            sob r3 = defpackage.sob.HTTP_2
            if (r2 != r3) goto L_0x01a6
            r0.l(r1)
        L_0x01a6:
            return
        L_0x01a7:
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0061 }
            defpackage.au1.r(r0)     // Catch:{ all -> 0x0061 }
            r1 = 0
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x01b0:
            r0 = move-exception
            r1 = 0
        L_0x01b2:
            r10 = r1
            goto L_0x01bf
        L_0x01b4:
            r1 = 0
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01bd }
            java.lang.String r2 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r0.<init>(r2)     // Catch:{ all -> 0x01bd }
            throw r0     // Catch:{ all -> 0x01bd }
        L_0x01bd:
            r0 = move-exception
            goto L_0x01b2
        L_0x01bf:
            if (r10 == 0) goto L_0x01c8
            q2b r1 = defpackage.q2b.a
            q2b r1 = defpackage.q2b.a
            r1.a(r10)
        L_0x01c8:
            if (r10 == 0) goto L_0x01cd
            defpackage.naf.d(r10)
        L_0x01cd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8c.g(sh3, int, dp3):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (defpackage.s2a.c(r0, (java.security.cert.X509Certificate) r10) != false) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(defpackage.y9 r9, java.util.ArrayList r10) {
        /*
            r8 = this;
            byte[] r0 = defpackage.naf.a
            java.util.ArrayList r0 = r8.o
            int r0 = r0.size()
            int r1 = r8.n
            r2 = 0
            if (r0 >= r1) goto L_0x00d2
            boolean r0 = r8.i
            if (r0 == 0) goto L_0x0013
            goto L_0x00d2
        L_0x0013:
            xnc r0 = r8.q
            y9 r1 = r0.a
            boolean r1 = r1.a(r9)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            vq6 r1 = r9.a
            java.lang.String r3 = r1.e
            y9 r4 = r0.a
            vq6 r5 = r4.a
            java.lang.String r5 = r5.e
            boolean r3 = defpackage.tpa.f(r3, r5)
            r5 = 1
            if (r3 == 0) goto L_0x0030
            return r5
        L_0x0030:
            kp6 r3 = r8.f
            if (r3 != 0) goto L_0x0035
            return r2
        L_0x0035:
            if (r10 == 0) goto L_0x00d2
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L_0x003f
            goto L_0x00d2
        L_0x003f:
            java.util.Iterator r10 = r10.iterator()
        L_0x0043:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x00d2
            java.lang.Object r3 = r10.next()
            xnc r3 = (defpackage.xnc) r3
            java.net.Proxy r6 = r3.b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L_0x0043
            java.net.Proxy r6 = r0.b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L_0x0043
            java.net.InetSocketAddress r3 = r3.c
            java.net.InetSocketAddress r6 = r0.c
            boolean r3 = defpackage.tpa.f(r6, r3)
            if (r3 == 0) goto L_0x0043
            s2a r10 = defpackage.s2a.a
            javax.net.ssl.HostnameVerifier r0 = r9.g
            if (r0 == r10) goto L_0x0072
            return r2
        L_0x0072:
            byte[] r10 = defpackage.naf.a
            vq6 r10 = r4.a
            int r0 = r10.f
            int r3 = r1.f
            if (r3 == r0) goto L_0x007d
            goto L_0x00d2
        L_0x007d:
            java.lang.String r0 = r1.e
            java.lang.String r10 = r10.e
            boolean r10 = defpackage.tpa.f(r0, r10)
            if (r10 == 0) goto L_0x0088
            goto L_0x00a9
        L_0x0088:
            boolean r10 = r8.j
            if (r10 != 0) goto L_0x00d2
            fi6 r10 = r8.d
            if (r10 == 0) goto L_0x00d2
            java.util.List r10 = r10.a()
            boolean r1 = r10.isEmpty()
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x00d2
            java.lang.Object r10 = r10.get(r2)
            if (r10 == 0) goto L_0x00ca
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = defpackage.s2a.c(r0, r10)
            if (r10 == 0) goto L_0x00d2
        L_0x00a9:
            e12 r9 = r9.h     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            fi6 r8 = r8.d     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            r8.a()     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            r9.getClass()     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            java.util.Set r8 = r9.a     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            boolean r9 = r8.hasNext()     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            if (r9 != 0) goto L_0x00c0
            return r5
        L_0x00c0:
            java.lang.Object r8 = r8.next()     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            defpackage.au1.r(r8)     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            r8 = 0
            throw r8     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
        L_0x00c9:
            return r2
        L_0x00ca:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r8.<init>(r9)
            throw r8
        L_0x00d2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8c.h(y9, java.util.ArrayList):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = defpackage.naf.a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.b
            java.net.Socket r3 = r9.c
            y7c r4 = r9.g
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L_0x0075
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L_0x0075
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L_0x0075
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L_0x0026
            goto L_0x0075
        L_0x0026:
            kp6 r2 = r9.f
            r6 = 1
            if (r2 == 0) goto L_0x0049
            monitor-enter(r2)
            boolean r9 = r2.Z     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x0032
            monitor-exit(r2)
            goto L_0x0046
        L_0x0032:
            long r9 = r2.A0     // Catch:{ all -> 0x0042 }
            long r3 = r2.z0     // Catch:{ all -> 0x0042 }
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x0044
            long r9 = r2.B0     // Catch:{ all -> 0x0042 }
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x0044
            monitor-exit(r2)
            goto L_0x0046
        L_0x0042:
            r9 = move-exception
            goto L_0x0047
        L_0x0044:
            monitor-exit(r2)
            r5 = r6
        L_0x0046:
            return r5
        L_0x0047:
            monitor-exit(r2)     // Catch:{ all -> 0x0042 }
            throw r9
        L_0x0049:
            monitor-enter(r9)
            long r7 = r9.p     // Catch:{ all -> 0x0072 }
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0071
            if (r10 == 0) goto L_0x0071
            int r9 = r3.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x006f, IOException -> 0x0070 }
            r3.setSoTimeout(r6)     // Catch:{ all -> 0x006a }
            boolean r10 = r4.B()     // Catch:{ all -> 0x006a }
            r10 = r10 ^ r6
            r3.setSoTimeout(r9)     // Catch:{ SocketTimeoutException -> 0x006f, IOException -> 0x0070 }
            r5 = r10
            goto L_0x0070
        L_0x006a:
            r10 = move-exception
            r3.setSoTimeout(r9)     // Catch:{ SocketTimeoutException -> 0x006f, IOException -> 0x0070 }
            throw r10     // Catch:{ SocketTimeoutException -> 0x006f, IOException -> 0x0070 }
        L_0x006f:
            r5 = r6
        L_0x0070:
            return r5
        L_0x0071:
            return r6
        L_0x0072:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x0075:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8c.i(boolean):boolean");
    }

    public final u45 j(u2a u2a, h8c h8c) {
        Socket socket = this.c;
        y7c y7c = this.g;
        x7c x7c = this.h;
        kp6 kp6 = this.f;
        if (kp6 != null) {
            return new lp6(u2a, this, h8c, kp6);
        }
        int i2 = h8c.d;
        socket.setSoTimeout(i2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        y7c.c.p().g((long) i2, timeUnit);
        x7c.c.p().g((long) h8c.e, timeUnit);
        return new x8(u2a, this, y7c, x7c);
    }

    public final synchronized void k() {
        this.i = true;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [gb0, java.lang.Object] */
    public final void l(int i2) {
        Socket socket = this.c;
        y7c y7c = this.g;
        x7c x7c = this.h;
        socket.setSoTimeout(0);
        foe foe = foe.h;
        ? obj = new Object();
        obj.g = foe;
        obj.f = cp6.a;
        String str = this.q.a.a.e;
        obj.c = socket;
        obj.a = naf.g + ' ' + str;
        obj.d = y7c;
        obj.e = x7c;
        obj.f = this;
        obj.b = i2;
        kp6 kp6 = new kp6(obj);
        this.f = kp6;
        ded ded = kp6.M0;
        this.n = (ded.a & 16) != 0 ? ded.b[4] : Integer.MAX_VALUE;
        sp6 sp6 = kp6.J0;
        synchronized (sp6) {
            try {
                if (sp6.c) {
                    throw new IOException("closed");
                } else if (sp6.Y) {
                    Logger logger = sp6.Z;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(naf.h(">> CONNECTION " + zo6.a.d(), new Object[0]));
                    }
                    sp6.X.M(zo6.a);
                    sp6.X.flush();
                }
            } finally {
            }
        }
        sp6 sp62 = kp6.J0;
        ded ded2 = kp6.C0;
        synchronized (sp62) {
            try {
                if (!sp62.c) {
                    sp62.g(0, Integer.bitCount(ded2.a) * 6, 4, 0);
                    int i3 = 0;
                    while (i3 < 10) {
                        boolean z = true;
                        if (((1 << i3) & ded2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            sp62.X.y(i3 != 4 ? i3 != 7 ? i3 : 4 : 3);
                            sp62.X.A(ded2.b[i3]);
                        }
                        i3++;
                    }
                    sp62.X.flush();
                } else {
                    throw new IOException("closed");
                }
            } finally {
            }
        }
        int a = kp6.C0.a();
        if (a != 65535) {
            kp6.J0.S(0, (long) (a - 65535));
        }
        foe.f().c(new ip6(kp6.K0, kp6.o, 2), 0);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        xnc xnc = this.q;
        sb.append(xnc.a.a.e);
        sb.append(':');
        sb.append(xnc.a.a.f);
        sb.append(", proxy=");
        sb.append(xnc.b);
        sb.append(" hostAddress=");
        sb.append(xnc.c);
        sb.append(" cipherSuite=");
        fi6 fi6 = this.d;
        if (fi6 == null || (obj = fi6.c) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
