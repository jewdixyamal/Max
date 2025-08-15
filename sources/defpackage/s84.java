package defpackage;

import android.os.SystemClock;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: s84  reason: default package */
public final class s84 extends di0 {
    public final mm4 j;
    public final g47 k;
    public volatile List l = new ArrayList();
    public int m = 0;
    public final AtomicBoolean n = new AtomicBoolean();

    public s84(cjg cjg, String str, String str2, zwd zwd, nm4 nm4, ai3 ai3, ztc ztc) {
        super(cjg, new eh3(str, str2, true), zwd, ai3);
        this.j = nm4;
        this.k = nm4 != null ? new g47(zwd) : null;
        r();
    }

    public final void close() {
    }

    public final Socket connect() {
        try {
            Socket connect = super.connect();
            this.m = 0;
            return connect;
        } catch (Exception e) {
            synchronized (this) {
                this.m = (this.m + 1) % this.l.size();
                throw e;
            }
        }
    }

    public final int d() {
        return ((Number) q().d.getValue()).intValue();
    }

    public final void g(boolean z) {
        this.n.set(z);
    }

    public final String i() {
        return q().a;
    }

    public final int j() {
        return 15000;
    }

    public final void l(Socket socket, String str, int i, int i2) {
        InetAddress[] inetAddressArr;
        r84 r84;
        ReentrantLock reentrantLock;
        Object obj;
        String str2 = str;
        mm4 mm4 = this.j;
        if (mm4 == null) {
            super.l(socket, str, i, i2);
            return;
        }
        r84 r842 = new r84(this, socket, i, i2);
        nm4 nm4 = (nm4) mm4;
        String str3 = nm4.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.o, str3, zr6.i("resolve, host=", str2, " ..."), (Throwable) null);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str4 = nm4.a;
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            ir62.d(us7.o, str4, "retrieveInetAddresses, host=".concat(str2), (Throwable) null);
        }
        try {
            inetAddressArr = InetAddress.getAllByName(str);
        } catch (UnknownHostException e) {
            hm9.p(nm4.a, "could not find ip addresses for ".concat(str2), e);
            inetAddressArr = new InetAddress[0];
        } catch (SecurityException e2) {
            SecurityException securityException = e2;
            hm9.p(nm4.a, "failed to find ip addresses for " + str2 + " due to security violation", securityException);
            inetAddressArr = new InetAddress[0];
        }
        ReentrantLock reentrantLock2 = nm4.b;
        reentrantLock2.lock();
        try {
            long j2 = elapsedRealtime - nm4.c;
            long j3 = nm4.f;
            if (j2 > j3) {
                String str5 = nm4.a;
                ir6 ir63 = hm9.m;
                if (ir63 != null && ir63.c()) {
                    r84 = r842;
                    ir63.d(us7.o, str5, "resolve, cache expired, elapsed=" + j2 + " ms, ttl=" + j3 + " ms", (Throwable) null);
                } else {
                    r84 = r842;
                }
                nm4.b();
            } else {
                r84 = r842;
            }
            if (!(inetAddressArr.length == 0)) {
                nm4.c(str2, inetAddressArr);
            }
            nm4.c = elapsedRealtime;
            String str6 = nm4.a;
            ir6 ir64 = hm9.m;
            if (ir64 != null) {
                if (ir64.c()) {
                    ir64.d(us7.o, str6, nm4.a(nm4), (Throwable) null);
                }
            }
            ArrayList arrayList = (ArrayList) nm4.d.get(str2);
            v67 a = arrayList != null ? nm4.e.a(arrayList) : null;
            reentrantLock2.unlock();
            if (a == null) {
                super.l(socket, str, i, i2);
                InetAddress inetAddress = socket.getInetAddress();
                if (inetAddress != null) {
                    nm4 nm42 = (nm4) this.j;
                    String str7 = nm42.a;
                    ir6 ir65 = hm9.m;
                    if (ir65 != null && ir65.c()) {
                        ir65.d(us7.o, str7, "addInetAddress, host=" + str2 + ", address=" + inetAddress, (Throwable) null);
                    }
                    reentrantLock2 = nm42.b;
                    reentrantLock2.lock();
                    try {
                        HashMap hashMap = nm42.d;
                        Object obj2 = hashMap.get(str2);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            hashMap.put(str2, obj2);
                        }
                        ArrayList arrayList2 = (ArrayList) obj2;
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (tpa.f(((v67) obj).a, inetAddress)) {
                                break;
                            }
                        }
                        v67 v67 = (v67) obj;
                        if (v67 == null) {
                            v67 = new v67(inetAddress);
                            arrayList2.add(v67);
                        }
                        reentrantLock2.unlock();
                        String str8 = nm42.a;
                        ir6 ir66 = hm9.m;
                        if (ir66 != null && ir66.c()) {
                            ir66.d(us7.o, str8, "addInetAddress, " + v67 + " added to cache", (Throwable) null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                String str9 = nm4.a;
                ir6 ir67 = hm9.m;
                if (ir67 != null && ir67.c()) {
                    ir67.d(us7.o, str9, "for " + str2 + " selected " + a, (Throwable) null);
                }
                try {
                    r84.a(str2, a.a, elapsedRealtime2);
                    reentrantLock = nm4.b;
                    reentrantLock.lock();
                    try {
                        a.b--;
                        a.d++;
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (Throwable th2) {
                    reentrantLock = nm4.b;
                    reentrantLock.lock();
                    a.b--;
                    throw th2;
                } finally {
                    reentrantLock.unlock();
                }
            }
        } finally {
            reentrantLock2.unlock();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: one.me.net.client.api.AddressUnreachableException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1 A[SYNTHETIC, Splitter:B:40:0x00b1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.Socket m(javax.net.SocketFactory r11, java.lang.String r12, int r13) {
        /*
            r10 = this;
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r1 = "s84"
            java.lang.String r2 = "createConnection"
            defpackage.hm9.m(r1, r2, new java.lang.Object[0])
            r2 = 3000(0xbb8, float:4.204E-42)
        L_0x000b:
            java.util.concurrent.atomic.AtomicBoolean r3 = r10.n
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x0135
            java.net.Socket r3 = defpackage.di0.n(r11)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r5 = 15000(0x3a98, float:2.102E-41)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r6}
            java.lang.String r6 = "try to connect socket, timeout=%dms, max=%dms ..."
            defpackage.hm9.m(r1, r6, r4)
            long r6 = android.os.SystemClock.elapsedRealtime()
            r10.l(r3, r12, r13, r2)     // Catch:{ ConnectException | SocketTimeoutException | AddressUnreachableException -> 0x0043, IOException -> 0x003e, all -> 0x0032 }
            return r3
        L_0x0032:
            r10 = move-exception
            defpackage.di0.p(r3)
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Failed to create connection"
            r11.<init>(r12, r10)
            throw r11
        L_0x003e:
            r10 = move-exception
            defpackage.di0.p(r3)
            throw r10
        L_0x0043:
            r4 = move-exception
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r8 = r8 - r6
            defpackage.di0.p(r3)
            if (r2 < r5) goto L_0x0121
            boolean r11 = r4 instanceof one.me.net.client.api.AddressUnreachableException
            if (r11 == 0) goto L_0x0120
            r11 = r4
            one.me.net.client.api.AddressUnreachableException r11 = (one.me.net.client.api.AddressUnreachableException) r11
            g47 r12 = r10.k
            if (r12 == 0) goto L_0x011d
            java.lang.String r13 = "gstatic.com"
            java.lang.String r2 = r12.b
            ir6 r3 = defpackage.hm9.m
            r5 = 0
            if (r3 != 0) goto L_0x0063
            goto L_0x0070
        L_0x0063:
            boolean r6 = r3.c()
            if (r6 == 0) goto L_0x0070
            us7 r6 = defpackage.us7.o
            java.lang.String r7 = "check, connectTimeoutMs=1000"
            r3.d(r6, r2, r7, r5)
        L_0x0070:
            java.lang.String r2 = "failed to create socket"
            java.lang.String r3 = r12.b
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x0079
            goto L_0x0086
        L_0x0079:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x0086
            us7 r7 = defpackage.us7.o
            java.lang.String r8 = "createSocket"
            r6.d(r7, r3, r8, r5)
        L_0x0086:
            zwd r3 = r12.a     // Catch:{ IOException -> 0x00a8 }
            axd r3 = (defpackage.axd) r3     // Catch:{ IOException -> 0x00a8 }
            pud r3 = r3.a(r13)     // Catch:{ IOException -> 0x00a8 }
            java.net.Socket r3 = r3.createSocket()     // Catch:{ IOException -> 0x00a8 }
            android.net.TrafficStats.tagSocket(r3)     // Catch:{ IOException -> 0x009e }
            r6 = 0
            r3.setKeepAlive(r6)     // Catch:{ IOException -> 0x009e }
            r6 = 1
            r3.setTcpNoDelay(r6)     // Catch:{ IOException -> 0x009e }
            goto L_0x00af
        L_0x009e:
            r6 = move-exception
            java.lang.String r7 = r12.b
            defpackage.hm9.p(r7, r2, r6)
            r12.a(r3)
            goto L_0x00ae
        L_0x00a8:
            r3 = move-exception
            java.lang.String r6 = r12.b
            defpackage.hm9.p(r6, r2, r3)
        L_0x00ae:
            r3 = r5
        L_0x00af:
            if (r3 == 0) goto L_0x011d
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress     // Catch:{ Exception -> 0x010d }
            r6 = 443(0x1bb, float:6.21E-43)
            r2.<init>(r13, r6)     // Catch:{ Exception -> 0x010d }
            r3.connect(r2, r0)     // Catch:{ Exception -> 0x010d }
            r12.b(r3)     // Catch:{ Exception -> 0x010d }
            r12.a(r3)
            ir6 r12 = defpackage.hm9.m
            if (r12 != 0) goto L_0x00c6
            goto L_0x00e0
        L_0x00c6:
            boolean r13 = r12.c()
            if (r13 != 0) goto L_0x00cd
            goto L_0x00e0
        L_0x00cd:
            us7 r13 = defpackage.us7.Z
            java.util.Locale r0 = java.util.Locale.ROOT
            java.net.InetAddress r11 = r11.a
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r2 = "looks like the %s is unreachable"
            java.lang.String r11 = java.lang.String.format(r0, r2, r11)
            r12.d(r13, r1, r11, r5)
        L_0x00e0:
            mm4 r10 = r10.j
            if (r10 == 0) goto L_0x010a
            nm4 r10 = (defpackage.nm4) r10
            java.lang.String r11 = r10.a
            ir6 r12 = defpackage.hm9.m
            if (r12 == 0) goto L_0x00f9
            boolean r13 = r12.c()
            if (r13 == 0) goto L_0x00f9
            us7 r13 = defpackage.us7.o
            java.lang.String r0 = "reset"
            r12.d(r13, r11, r0, r5)
        L_0x00f9:
            java.util.concurrent.locks.ReentrantLock r11 = r10.b
            r11.lock()
            r10.b()     // Catch:{ all -> 0x0105 }
            r11.unlock()
            goto L_0x010a
        L_0x0105:
            r10 = move-exception
            r11.unlock()
            throw r10
        L_0x010a:
            throw r4
        L_0x010b:
            r10 = move-exception
            goto L_0x0119
        L_0x010d:
            r10 = move-exception
            java.lang.String r13 = r12.b     // Catch:{ all -> 0x010b }
            java.lang.String r0 = "failed to check internet access"
            defpackage.hm9.p(r13, r0, r10)     // Catch:{ all -> 0x010b }
            r12.a(r3)
            goto L_0x011d
        L_0x0119:
            r12.a(r3)
            throw r10
        L_0x011d:
            java.io.IOException r10 = r11.b
            throw r10
        L_0x0120:
            throw r4
        L_0x0121:
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r5}
            java.lang.String r5 = "socket failed to connect, after=%dms (timeout=%dms), try again ..."
            defpackage.hm9.k0(r1, r4, r5, r3)
            int r2 = r2 + r0
            goto L_0x000b
        L_0x0135:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException
            java.lang.String r11 = "Socket connection canceled"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s84.m(javax.net.SocketFactory, java.lang.String, int):java.net.Socket");
    }

    public final synchronized eh3 q() {
        return (eh3) this.l.get(this.m);
    }

    public final synchronized void r() {
        List list;
        try {
            this.l.clear();
            eh3 v = s5c.v(this.a);
            if (v != null) {
                hm9.m("s84", "default host = %s", v.toString());
                this.l.add(v);
            }
            ((ri4) this.a.a).e();
            this.l.addAll(s5c.B(this.a));
            this.l.add(this.f);
            List list2 = this.l;
            if (list2.size() <= 1) {
                list = Collections.unmodifiableList(list2);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object next : list2) {
                    if (!arrayList.contains(next)) {
                        arrayList.add(next);
                    }
                }
                list = arrayList;
            }
            this.l = list;
            this.m = 0;
        } finally {
            while (true) {
            }
        }
    }
}
