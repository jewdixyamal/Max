package defpackage;

import android.net.TrafficStats;
import android.os.SystemClock;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import one.me.net.client.impl.internal.SocketFactoryCreateException;
import one.me.net.ssl.api.InvalidSslSessionException;

/* renamed from: di0  reason: default package */
public abstract class di0 implements k33 {
    public static final Pattern i = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    public final cjg a;
    public final ai3 b;
    public final zwd c;
    public Socket d;
    public sqd e;
    public final eh3 f;
    public tg3 g = new tg3(false);
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    public di0(cjg cjg, eh3 eh3, zwd zwd, ai3 ai3) {
        this.a = cjg;
        this.b = ai3;
        this.c = zwd;
        this.f = eh3;
    }

    public static Socket n(SocketFactory socketFactory) {
        hm9.m("di0", "createSocket", new Object[0]);
        try {
            Socket createSocket = socketFactory.createSocket();
            if (createSocket != null) {
                TrafficStats.tagSocket(createSocket);
            }
            createSocket.setKeepAlive(false);
            createSocket.setTcpNoDelay(true);
            return createSocket;
        } catch (IOException e2) {
            p((Socket) null);
            throw e2;
        } catch (Throwable th) {
            p((Socket) null);
            throw new IOException("Failed to create socket", th);
        }
    }

    public static long o(int i2, boolean z) {
        if (i2 > 6) {
            i2 = 6;
        }
        double pow = (double) ((long) (Math.pow(2.0d, (double) i2) * 1000.0d));
        long random = (long) (((pow / 2.0d) * Math.random()) + pow);
        if (z && random > 15000) {
            random = 15000;
        }
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "di0", "getConnectionTimeout: errorsCount: " + i2 + " timeout: " + random, (Throwable) null);
        }
        return random;
    }

    public static void p(Socket socket) {
        if (socket != null) {
            hm9.m("di0", "releaseSocketSafely", new Object[0]);
            try {
                socket.close();
            } catch (Throwable th) {
                hm9.l0("di0", "failed to close socket", th);
            }
        }
    }

    public final ai3 a() {
        return this.b;
    }

    public final void b() {
        this.h.clear();
    }

    public final void c(Socket socket) {
        if (socket != null) {
            TrafficStats.untagSocket(socket);
        }
    }

    public Socket connect() {
        String str;
        int i2;
        long j;
        hm9.m("di0", "connect ->", new Object[0]);
        this.g = new tg3(true);
        TrafficStats.setThreadStatsTag((i() + d()).hashCode());
        String i3 = i();
        int d2 = d();
        try {
            SocketFactory socketFactory = (SocketFactory) this.h.computeIfAbsent(i3, new di(21, this));
            tg3 tg3 = this.g;
            tg3.g = i3;
            tg3.h = d2;
            Socket m = m(socketFactory, i3, d2);
            this.d = m;
            if (!(m instanceof SSLSocket)) {
                tg3 tg32 = this.g;
                tg32.getClass();
                tg32.b = System.currentTimeMillis();
                return this.d;
            }
            zwd zwd = this.c;
            SSLSocket sSLSocket = (SSLSocket) m;
            String str2 = i.matcher(i3).matches() ? this.f.a : i3;
            axd axd = (axd) zwd;
            String str3 = axd.a;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, str3, zr6.i("verifySocket, host=", str2, " ->"), (Throwable) null);
            }
            long currentTimeMillis = System.currentTimeMillis();
            bxd bxd = (bxd) axd.d.b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i4 = d2;
            try {
                SSLSession session = sSLSocket.getSession();
                if (!session.isValid()) {
                    throw new InvalidSslSessionException("session is not valid " + session, 2);
                } else if (!"SSL_NULL_WITH_NULL_NULL".equalsIgnoreCase(session.getCipherSuite())) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (elapsedRealtime2 >= 0) {
                        bxd.g = elapsedRealtime2;
                        bxd.h += elapsedRealtime2;
                        bxd.i++;
                    } else {
                        bxd.getClass();
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    long currentTimeMillis3 = System.currentTimeMillis();
                    bxd bxd2 = (bxd) axd.d.b;
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    try {
                        if (HttpsURLConnection.getDefaultHostnameVerifier().verify(str2, sSLSocket.getSession())) {
                            bxd2.a(SystemClock.elapsedRealtime() - elapsedRealtime3);
                            long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                            String str4 = axd.a;
                            ir6 ir62 = hm9.m;
                            if (ir62 != null && ir62.c()) {
                                ir62.d(us7.X, str4, ey8.i(currentTimeMillis2 + currentTimeMillis4, "<- verifySocket, took=", "ms"), (Throwable) null);
                            }
                            tg3 tg33 = this.g;
                            tg33.getClass();
                            tg33.b = System.currentTimeMillis();
                            hm9.m("di0", "ssl session is ok", new Object[0]);
                            sqd sqd = this.e;
                            if (sqd == null || !((nqd) sqd).h()) {
                                int i5 = i4;
                                bxd bxd3 = ((axd) this.c).c;
                                long j2 = bxd3.a;
                                int i6 = bxd3.c;
                                long j3 = bxd3.b;
                                if (i6 > 1) {
                                    j3 /= (long) bxd3.c;
                                }
                                long j4 = j3;
                                int i7 = bxd3.c;
                                long j5 = bxd3.d;
                                long j6 = bxd3.f > 1 ? bxd3.e / ((long) bxd3.f) : bxd3.e;
                                int i8 = bxd3.f;
                                long j7 = bxd3.g;
                                String str5 = "di0";
                                if (bxd3.i > 1) {
                                    str = i3;
                                    i2 = i5;
                                    j = bxd3.h / ((long) bxd3.i);
                                } else {
                                    str = i3;
                                    i2 = i5;
                                    j = bxd3.h;
                                }
                                cxd cxd = new cxd(j2, j4, i7, j5, j6, i8, j7, j, bxd3.i);
                                tg3 tg34 = this.g;
                                long j8 = cxd.l;
                                tg34.getClass();
                                tg34.f = Math.max(j8, 0);
                                hm9.m(str5, "<- connect, socket connected to %s:%d, ssl_metrics=%s", str, Integer.valueOf(i2), cxd.toString());
                                return this.d;
                            }
                            String str6 = "emitter was disposed " + i3 + ":" + i4;
                            hm9.m("di0", str6, new Object[0]);
                            throw new IOException(str6);
                        }
                        throw new SSLPeerUnverifiedException("Failed to verify host=".concat(str2));
                    } catch (SSLPeerUnverifiedException e2) {
                        bxd2.a(SystemClock.elapsedRealtime() - elapsedRealtime3);
                        hm9.p(axd.a, mqd.i(sSLSocket, str2), (Throwable) null);
                        throw e2;
                    } catch (Throwable th) {
                        bxd2.a(SystemClock.elapsedRealtime() - elapsedRealtime3);
                        hm9.p(axd.a, mqd.i(sSLSocket, str2), (Throwable) null);
                        SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException("Failed to verify host=".concat(str2));
                        sSLPeerUnverifiedException.initCause(th);
                        throw sSLPeerUnverifiedException;
                    }
                } else {
                    throw new InvalidSslSessionException("Illegal session cipher suite", 2);
                }
            } catch (InvalidSslSessionException e3) {
                throw e3;
            } catch (Throwable th2) {
                long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (elapsedRealtime4 >= 0) {
                    bxd.g = elapsedRealtime4;
                    bxd.h += elapsedRealtime4;
                    bxd.i++;
                } else {
                    bxd.getClass();
                }
                throw th2;
            }
        } catch (SocketFactoryCreateException e4) {
            throw e4.a;
        }
    }

    public final boolean e() {
        return true;
    }

    public final void f() {
        ai3 ai3 = this.b;
        ((AtomicInteger) ai3.c).incrementAndGet();
        String name = ai3.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, name, zr6.h(((AtomicInteger) ai3.c).get(), "tryNextRequestTimeout "), (Throwable) null);
        }
    }

    public final long h(int i2) {
        return o(i2, ((ri4) this.a.a).d());
    }

    public final tg3 k() {
        return this.g;
    }

    public void l(Socket socket, String str, int i2, int i3) {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "di0", String.format(Locale.ROOT, "connectSocket, socket=%s, host=%s:%d, timeout=%dms", new Object[]{socket, str, Integer.valueOf(i2), Integer.valueOf(i3)}), (Throwable) null);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i2);
        if (inetSocketAddress.getAddress() != null) {
            tg3 tg3 = this.g;
            tg3.getClass();
            tg3.d = Math.max(SystemClock.elapsedRealtime() - elapsedRealtime, 0);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        hm9.m("Socket", "socket connect", new Object[0]);
        socket.connect(inetSocketAddress, i3);
        hm9.m("Socket", "socket connected", new Object[0]);
        tg3 tg32 = this.g;
        tg32.getClass();
        tg32.e = Math.max(SystemClock.elapsedRealtime() - elapsedRealtime2, 0);
    }

    public Socket m(SocketFactory socketFactory, String str, int i2) {
        hm9.m("di0", "createConnection", new Object[0]);
        Socket n = n(socketFactory);
        try {
            l(n, str, i2, j());
            return n;
        } catch (IOException e2) {
            p(n);
            throw e2;
        } catch (Throwable th) {
            p(n);
            throw new IOException("Failed to create connection", th);
        }
    }
}
