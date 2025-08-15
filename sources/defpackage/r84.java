package defpackage;

import java.util.List;

/* renamed from: r84  reason: default package */
public final /* synthetic */ class r84 implements u98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ r84(Object obj, Object obj2, int i, int i2) {
        this.c = obj;
        this.o = obj2;
        this.a = i;
        this.b = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: v67} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: v67} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: v67} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: v67} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: v67} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r11, java.net.InetAddress r12, long r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.c
            s84 r0 = (defpackage.s84) r0
            java.lang.Object r1 = r10.o
            java.net.Socket r1 = (java.net.Socket) r1
            int r2 = r10.a
            int r10 = r10.b
            tg3 r3 = r0.g
            r3.getClass()
            r4 = 0
            long r13 = java.lang.Math.max(r13, r4)
            r3.d = r13
            ir6 r13 = defpackage.hm9.m
            java.lang.String r14 = "s84"
            r3 = 0
            if (r13 != 0) goto L_0x0021
            goto L_0x0041
        L_0x0021:
            boolean r6 = r13.c()
            if (r6 != 0) goto L_0x0028
            goto L_0x0041
        L_0x0028:
            us7 r6 = defpackage.us7.X
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r8 = new java.lang.Object[]{r12, r8, r9}
            java.lang.String r9 = "connectSocket, address=%s:%d, timeout=%dms"
            java.lang.String r7 = java.lang.String.format(r7, r9, r8)
            r13.d(r6, r14, r7, r3)
        L_0x0041:
            long r6 = android.os.SystemClock.elapsedRealtime()
            java.net.InetSocketAddress r13 = new java.net.InetSocketAddress     // Catch:{ SocketTimeoutException -> 0x007b }
            r13.<init>(r12, r2)     // Catch:{ SocketTimeoutException -> 0x007b }
            r1.connect(r13, r10)     // Catch:{ SocketTimeoutException -> 0x007b }
            tg3 r10 = r0.g
            long r11 = android.os.SystemClock.elapsedRealtime()
            long r11 = r11 - r6
            r10.getClass()
            long r11 = java.lang.Math.max(r11, r4)
            r10.e = r11
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L_0x0062
            goto L_0x007a
        L_0x0062:
            boolean r11 = r10.c()
            if (r11 != 0) goto L_0x0069
            goto L_0x007a
        L_0x0069:
            us7 r11 = defpackage.us7.X
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r13 = "connected %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r1}
            java.lang.String r12 = java.lang.String.format(r12, r13, r0)
            r10.d(r11, r14, r12, r3)
        L_0x007a:
            return
        L_0x007b:
            r10 = move-exception
            mm4 r13 = r0.j
            if (r13 == 0) goto L_0x00ce
            nm4 r13 = (defpackage.nm4) r13
            java.util.concurrent.locks.ReentrantLock r14 = r13.b
            r14.lock()
            java.util.HashMap r13 = r13.d     // Catch:{ all -> 0x00ac }
            java.lang.Object r11 = r13.get(r11)     // Catch:{ all -> 0x00ac }
            java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch:{ all -> 0x00ac }
            if (r11 == 0) goto L_0x00b0
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x00ac }
        L_0x0095:
            boolean r13 = r11.hasNext()     // Catch:{ all -> 0x00ac }
            if (r13 == 0) goto L_0x00ae
            java.lang.Object r13 = r11.next()     // Catch:{ all -> 0x00ac }
            r0 = r13
            v67 r0 = (defpackage.v67) r0     // Catch:{ all -> 0x00ac }
            java.net.InetAddress r0 = r0.a     // Catch:{ all -> 0x00ac }
            boolean r0 = defpackage.tpa.f(r0, r12)     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0095
            r3 = r13
            goto L_0x00ae
        L_0x00ac:
            r10 = move-exception
            goto L_0x00ca
        L_0x00ae:
            v67 r3 = (defpackage.v67) r3     // Catch:{ all -> 0x00ac }
        L_0x00b0:
            r11 = 1
            r13 = 2
            if (r3 != 0) goto L_0x00b5
            goto L_0x00bf
        L_0x00b5:
            int r0 = r3.c     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x00ba
            goto L_0x00bf
        L_0x00ba:
            int r0 = r3.d     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x00bf
            r11 = r13
        L_0x00bf:
            r14.unlock()
            if (r11 != r13) goto L_0x00ce
            one.me.net.client.api.AddressUnreachableException r11 = new one.me.net.client.api.AddressUnreachableException
            r11.<init>(r12, r10)
            throw r11
        L_0x00ca:
            r14.unlock()
            throw r10
        L_0x00ce:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r84.a(java.lang.String, java.net.InetAddress, long):void");
    }

    public void c(qr6 qr6, int i) {
        w98 w98 = (w98) this.c;
        w98.getClass();
        ww6 i2 = zw6.i();
        int i3 = 0;
        while (true) {
            List list = (List) this.o;
            if (i3 >= list.size()) {
                break;
            }
            i2.a(((tb8) list.get(i3)).d(true));
            i3++;
        }
        pu0 pu0 = new pu0(i2.j());
        obd obd = w98.k;
        obd.getClass();
        int f = obd.a.f();
        int i4 = this.a;
        int i5 = this.b;
        if (f >= 2) {
            qr6.N(w98.c, i, i4, i5, pu0);
            return;
        }
        ga8 ga8 = w98.c;
        qr6.U(ga8, i, i5, pu0);
        qr6.K(ga8, i, i4, i5);
    }
}
