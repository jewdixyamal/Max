package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;

/* renamed from: ur0  reason: default package */
public final class ur0 implements p37 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ur0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static int d(yic yic, int i) {
        String a2 = yic.a(yic, "Retry-After");
        if (a2 == null) {
            return i;
        }
        if (Pattern.compile("\\d+").matcher(a2).matches()) {
            return Integer.valueOf(a2).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final yic a(h8c h8c) {
        i8c i8c;
        boolean z;
        int i;
        List list;
        e12 e12;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        h8c h8c2 = h8c;
        switch (this.a) {
            case 0:
                mhc mhc = (mhc) h8c2.i;
                l84 a2 = mhc.a();
                tfg tfg = mhc.e;
                if (tfg != null) {
                    rl8 h = tfg.h();
                    if (h != null) {
                        a2.D(HTTP.CONTENT_TYPE, h.a);
                    }
                    long g = tfg.g();
                    if (g != -1) {
                        a2.D(HTTP.CONTENT_LEN, String.valueOf(g));
                        a2.J(HTTP.TRANSFER_ENCODING);
                    } else {
                        a2.D(HTTP.TRANSFER_ENCODING, HTTP.CHUNK_CODING);
                        a2.J(HTTP.CONTENT_LEN);
                    }
                }
                cj6 cj6 = mhc.d;
                String a3 = cj6.a(HTTP.TARGET_HOST);
                boolean z2 = false;
                vq6 vq6 = mhc.b;
                if (a3 == null) {
                    a2.D(HTTP.TARGET_HOST, naf.v(vq6, false));
                }
                if (cj6.a(HTTP.CONN_DIRECTIVE) == null) {
                    a2.D(HTTP.CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
                }
                if (cj6.a("Accept-Encoding") == null && cj6.a("Range") == null) {
                    a2.D("Accept-Encoding", "gzip");
                    z2 = true;
                }
                kj6 kj6 = (kj6) this.b;
                kj6.getClass();
                if (cj6.a(HTTP.USER_AGENT) == null) {
                    a2.D(HTTP.USER_AGENT, "okhttp/4.9.2");
                }
                yic d = h8c2.d(a2.r());
                cj6 cj62 = d.Y;
                mq6.b(kj6, vq6, cj62);
                xic n = d.n();
                n.a = mhc;
                if (z2) {
                    String a4 = cj62.a(HTTP.CONTENT_ENCODING);
                    String str = null;
                    if (a4 == null) {
                        a4 = null;
                    }
                    if ("gzip".equalsIgnoreCase(a4) && mq6.a(d) && (i8c = d.Z) != null) {
                        hh6 hh6 = new hh6(i8c.S());
                        bj6 c = cj62.c();
                        c.g(HTTP.CONTENT_ENCODING);
                        c.g(HTTP.CONTENT_LEN);
                        n.f = c.c().c();
                        String a5 = cj62.a(HTTP.CONTENT_TYPE);
                        if (a5 != null) {
                            str = a5;
                        }
                        n.g = new i8c(str, -1, new y7c(hh6));
                    }
                }
                return n.a();
            case 1:
                mhc mhc2 = (mhc) h8c2.i;
                Class<Object> cls = Object.class;
                String str2 = cls.cast(mhc2.f.get(cls)) instanceof String ? (String) cls.cast(mhc2.f.get(cls)) : "NO_TAG";
                long nanoTime = System.nanoTime();
                Locale locale = Locale.US;
                od odVar = (od) h8c2.h;
                f8c f8c = odVar != null ? (f8c) odVar.b : null;
                String str3 = (String) this.b;
                hm9.m(str3, "Sending request: url = " + mhc2.b + ", tag = " + str2 + ", connection = " + f8c + ", headers = {" + mhc2.d.toString().replace("\n", ", ") + "}", new Object[0]);
                try {
                    yic d2 = h8c2.d(mhc2);
                    long convert = TimeUnit.MILLISECONDS.convert(Math.abs(System.nanoTime() - nanoTime), TimeUnit.NANOSECONDS);
                    vq6 vq62 = d2.a.b;
                    int i2 = d2.o;
                    if (!(i2 == 307 || i2 == 308)) {
                        switch (i2) {
                            case HttpStatus.SC_MULTIPLE_CHOICES /*300*/:
                            case HttpStatus.SC_MOVED_PERMANENTLY /*301*/:
                            case HttpStatus.SC_MOVED_TEMPORARILY /*302*/:
                            case HttpStatus.SC_SEE_OTHER /*303*/:
                                break;
                            default:
                                z = false;
                                break;
                        }
                    }
                    z = true;
                    String replace = d2.Y.toString().replace("\n", ", ");
                    StringBuilder sb = new StringBuilder("Received response: url = ");
                    sb.append(vq62);
                    sb.append(", tag = ");
                    sb.append(str2);
                    sb.append(", code = ");
                    sb.append(i2);
                    sb.append(", isRedirect=");
                    sb.append(z);
                    sb.append(". Takes ");
                    ms2.j(convert, "ms, headers = {", replace, sb);
                    sb.append("}");
                    String sb2 = sb.toString();
                    if (d2.m()) {
                        hm9.m(str3, sb2, new Object[0]);
                    } else {
                        hm9.p(str3, sb2, (Throwable) null);
                    }
                    return d2;
                } catch (ClassCastException unused) {
                    throw new IOException("ClassCastException");
                }
            default:
                b8c b8c = (b8c) h8c2.f;
                boolean z3 = true;
                List list2 = nz4.a;
                yic yic = null;
                int i3 = 0;
                mhc mhc3 = (mhc) h8c2.i;
                boolean z4 = true;
                while (b8c.t0 == null) {
                    synchronized (b8c) {
                        try {
                            if (!(b8c.v0 ^ z3)) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                            } else if (!(b8c.u0 ^ z3)) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (z4) {
                        g8c g8c = b8c.a;
                        vq6 vq63 = mhc3.b;
                        boolean z5 = vq63.a;
                        u2a u2a = b8c.A0;
                        if (z5) {
                            SSLSocketFactory sSLSocketFactory2 = u2a.A0;
                            if (sSLSocketFactory2 != null) {
                                HostnameVerifier hostnameVerifier2 = u2a.E0;
                                e12 = u2a.F0;
                                sSLSocketFactory = sSLSocketFactory2;
                                hostnameVerifier = hostnameVerifier2;
                            } else {
                                throw new IllegalStateException("CLEARTEXT-only client");
                            }
                        } else {
                            sSLSocketFactory = null;
                            hostnameVerifier = null;
                            e12 = null;
                        }
                        list = list2;
                        i = i3;
                        b8c.Y = new v45(g8c, new y9(vq63.e, vq63.f, u2a.v0, u2a.z0, sSLSocketFactory, hostnameVerifier, e12, u2a.y0, u2a.w0, u2a.D0, u2a.C0, u2a.x0), b8c);
                    } else {
                        list = list2;
                        i = i3;
                    }
                    try {
                        if (!b8c.x0) {
                            yic d3 = h8c2.d(mhc3);
                            if (yic != null) {
                                xic n2 = d3.n();
                                xic n3 = yic.n();
                                n3.g = null;
                                yic a6 = n3.a();
                                if (a6.Z == null) {
                                    n2.j = a6;
                                    d3 = n2.a();
                                } else {
                                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                                }
                            }
                            yic = d3;
                            od odVar2 = b8c.t0;
                            mhc3 = b(yic, odVar2);
                            if (mhc3 == null) {
                                if (odVar2 != null && odVar2.a) {
                                    if (!b8c.s0) {
                                        b8c.s0 = true;
                                        b8c.c.j();
                                    } else {
                                        throw new IllegalStateException("Check failed.".toString());
                                    }
                                }
                                b8c.g(false);
                                return yic;
                            }
                            i8c i8c2 = yic.Z;
                            if (i8c2 != null) {
                                naf.c(i8c2);
                            }
                            i3 = i + 1;
                            if (i3 <= 20) {
                                b8c.g(true);
                                list2 = list;
                                z4 = true;
                                z3 = true;
                            } else {
                                throw new ProtocolException("Too many follow-up requests: " + i3);
                            }
                        } else {
                            throw new IOException("Canceled");
                        }
                    } catch (RouteException e) {
                        List list3 = list;
                        RouteException routeException = e;
                        if (c(routeException.a, b8c, mhc3, false)) {
                            list2 = x53.u0(list3, routeException.b);
                            b8c.g(true);
                            z3 = true;
                            z4 = false;
                            i3 = i;
                        } else {
                            IOException iOException = routeException.b;
                            naf.z(iOException, list3);
                            throw iOException;
                        }
                    } catch (IOException e2) {
                        IOException iOException2 = e2;
                        if (c(iOException2, b8c, mhc3, !(iOException2 instanceof ConnectionShutdownException))) {
                            list2 = x53.u0(list, iOException2);
                            b8c.g(true);
                            z3 = true;
                            i3 = i;
                            z4 = false;
                        } else {
                            naf.z(iOException2, list);
                            throw iOException2;
                        }
                    } catch (Throwable th2) {
                        b8c.g(true);
                        throw th2;
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = (defpackage.f8c) r11.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.mhc b(defpackage.yic r10, defpackage.od r11) {
        /*
            r9 = this;
            r0 = 0
            if (r11 == 0) goto L_0x000c
            java.lang.Object r1 = r11.b
            f8c r1 = (defpackage.f8c) r1
            if (r1 == 0) goto L_0x000c
            xnc r1 = r1.q
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            int r2 = r10.o
            mhc r3 = r10.a
            java.lang.String r3 = r3.c
            r4 = 0
            r5 = 308(0x134, float:4.32E-43)
            r6 = 307(0x133, float:4.3E-43)
            r7 = 1
            if (r2 == r6) goto L_0x00bc
            if (r2 == r5) goto L_0x00bc
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto L_0x00b2
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L_0x0083
            r11 = 503(0x1f7, float:7.05E-43)
            if (r2 == r11) goto L_0x006d
            r11 = 407(0x197, float:5.7E-43)
            if (r2 == r11) goto L_0x0051
            r11 = 408(0x198, float:5.72E-43)
            if (r2 == r11) goto L_0x0035
            switch(r2) {
                case 300: goto L_0x00bc;
                case 301: goto L_0x00bc;
                case 302: goto L_0x00bc;
                case 303: goto L_0x00bc;
                default: goto L_0x0034;
            }
        L_0x0034:
            return r0
        L_0x0035:
            java.lang.Object r9 = r9.b
            u2a r9 = (defpackage.u2a) r9
            boolean r9 = r9.Y
            if (r9 != 0) goto L_0x003e
            return r0
        L_0x003e:
            yic r9 = r10.u0
            if (r9 == 0) goto L_0x0047
            int r9 = r9.o
            if (r9 != r11) goto L_0x0047
            return r0
        L_0x0047:
            int r9 = d(r10, r4)
            if (r9 <= 0) goto L_0x004e
            return r0
        L_0x004e:
            mhc r9 = r10.a
            return r9
        L_0x0051:
            java.net.Proxy r10 = r1.b
            java.net.Proxy$Type r10 = r10.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.HTTP
            if (r10 != r11) goto L_0x0065
            java.lang.Object r9 = r9.b
            u2a r9 = (defpackage.u2a) r9
            ob6 r9 = r9.y0
            r9.getClass()
            return r0
        L_0x0065:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.String r10 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r9.<init>(r10)
            throw r9
        L_0x006d:
            yic r9 = r10.u0
            if (r9 == 0) goto L_0x0076
            int r9 = r9.o
            if (r9 != r11) goto L_0x0076
            return r0
        L_0x0076:
            r9 = 2147483647(0x7fffffff, float:NaN)
            int r9 = d(r10, r9)
            if (r9 != 0) goto L_0x0082
            mhc r9 = r10.a
            return r9
        L_0x0082:
            return r0
        L_0x0083:
            if (r11 == 0) goto L_0x00b1
            java.lang.Object r9 = r11.X
            v45 r9 = (defpackage.v45) r9
            y9 r9 = r9.h
            vq6 r9 = r9.a
            java.lang.String r9 = r9.e
            java.lang.Object r1 = r11.b
            f8c r1 = (defpackage.f8c) r1
            xnc r1 = r1.q
            y9 r1 = r1.a
            vq6 r1 = r1.a
            java.lang.String r1 = r1.e
            boolean r9 = defpackage.tpa.f(r9, r1)
            r9 = r9 ^ r7
            if (r9 != 0) goto L_0x00a3
            goto L_0x00b1
        L_0x00a3:
            java.lang.Object r9 = r11.b
            f8c r9 = (defpackage.f8c) r9
            monitor-enter(r9)
            r9.j = r7     // Catch:{ all -> 0x00ae }
            monitor-exit(r9)
            mhc r9 = r10.a
            return r9
        L_0x00ae:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00ae }
            throw r10
        L_0x00b1:
            return r0
        L_0x00b2:
            java.lang.Object r9 = r9.b
            u2a r9 = (defpackage.u2a) r9
            ob6 r9 = r9.Z
            r9.getClass()
            return r0
        L_0x00bc:
            java.lang.Object r9 = r9.b
            u2a r9 = (defpackage.u2a) r9
            boolean r11 = r9.s0
            if (r11 != 0) goto L_0x00c6
            goto L_0x0155
        L_0x00c6:
            java.lang.String r11 = "Location"
            cj6 r1 = r10.Y
            java.lang.String r11 = r1.a(r11)
            if (r11 == 0) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r11 = r0
        L_0x00d2:
            if (r11 == 0) goto L_0x0155
            mhc r1 = r10.a
            vq6 r2 = r1.b
            r2.getClass()
            od3 r8 = new od3     // Catch:{ IllegalArgumentException -> 0x00e4 }
            r8.<init>()     // Catch:{ IllegalArgumentException -> 0x00e4 }
            r8.j(r2, r11)     // Catch:{ IllegalArgumentException -> 0x00e4 }
            goto L_0x00e5
        L_0x00e4:
            r8 = r0
        L_0x00e5:
            if (r8 == 0) goto L_0x00ec
            vq6 r11 = r8.b()
            goto L_0x00ed
        L_0x00ec:
            r11 = r0
        L_0x00ed:
            if (r11 == 0) goto L_0x0155
            vq6 r2 = r1.b
            java.lang.String r2 = r2.b
            java.lang.String r8 = r11.b
            boolean r2 = defpackage.tpa.f(r8, r2)
            if (r2 != 0) goto L_0x0100
            boolean r9 = r9.t0
            if (r9 != 0) goto L_0x0100
            goto L_0x0155
        L_0x0100:
            l84 r9 = r1.a()
            boolean r2 = defpackage.tu0.z(r3)
            if (r2 == 0) goto L_0x0142
            java.lang.String r2 = "PROPFIND"
            boolean r8 = r3.equals(r2)
            int r10 = r10.o
            if (r8 != 0) goto L_0x0118
            if (r10 == r5) goto L_0x0118
            if (r10 != r6) goto L_0x0119
        L_0x0118:
            r4 = r7
        L_0x0119:
            boolean r2 = r3.equals(r2)
            r2 = r2 ^ r7
            if (r2 == 0) goto L_0x012a
            if (r10 == r5) goto L_0x012a
            if (r10 == r6) goto L_0x012a
            java.lang.String r10 = "GET"
            r9.G(r10, r0)
            goto L_0x0131
        L_0x012a:
            if (r4 == 0) goto L_0x012e
            tfg r0 = r1.e
        L_0x012e:
            r9.G(r3, r0)
        L_0x0131:
            if (r4 != 0) goto L_0x0142
            java.lang.String r10 = "Transfer-Encoding"
            r9.J(r10)
            java.lang.String r10 = "Content-Length"
            r9.J(r10)
            java.lang.String r10 = "Content-Type"
            r9.J(r10)
        L_0x0142:
            vq6 r10 = r1.b
            boolean r10 = defpackage.naf.a(r10, r11)
            if (r10 != 0) goto L_0x014f
            java.lang.String r10 = "Authorization"
            r9.J(r10)
        L_0x014f:
            r9.a = r11
            mhc r0 = r9.r()
        L_0x0155:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur0.b(yic, od):mhc");
    }

    public boolean c(IOException iOException, b8c b8c, mhc mhc, boolean z) {
        boolean z2;
        gb0 gb0;
        f8c f8c;
        if (!((u2a) this.b).Y) {
            return false;
        }
        if ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        v45 v45 = b8c.Y;
        int i = v45.c;
        if (i == 0 && v45.d == 0 && v45.e == 0) {
            z2 = false;
        } else {
            if (v45.f == null) {
                xnc xnc = null;
                if (i <= 1 && v45.d <= 1 && v45.e <= 0 && (f8c = v45.i.Z) != null) {
                    synchronized (f8c) {
                        if (f8c.k == 0) {
                            if (naf.a(f8c.q.a.a, v45.h.a)) {
                                xnc = f8c.q;
                            }
                        }
                    }
                }
                if (xnc != null) {
                    v45.f = xnc;
                } else {
                    df4 df4 = v45.a;
                    if ((df4 == null || !df4.e()) && (gb0 = v45.b) != null) {
                        z2 = gb0.c();
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }
}
