package defpackage;

import java.util.Locale;

/* renamed from: u9d  reason: default package */
public final class u9d implements Runnable {
    public int X;
    public final /* synthetic */ x9d Y;
    public final String a;
    public final Locale b = Locale.ENGLISH;
    public long c;
    public long o;

    public u9d(x9d x9d) {
        this.Y = x9d;
        this.a = zr6.h(x9d.k, "[CONN_WATCHDOG]#");
    }

    public final int a() {
        if (this.o > 0) {
            return this.X;
        }
        return -1;
    }

    public final void b(String str) {
        hm9.m(this.Y.a, "%s: %s", this.a, str);
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [e47, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v16, types: [qpd, java.util.Map] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r34 = this;
            r1 = r34
            r3 = 1
            java.lang.String r4 = "%s: %s"
            java.lang.String r0 = "started ->"
            r1.b(r0)
            long r5 = java.lang.System.currentTimeMillis()
            r1.c = r5
            r5 = -1
            r7 = r5
        L_0x0013:
            x9d r0 = r1.Y
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x04ac
            x9d r0 = r1.Y
            aqb r0 = r0.y
            r0.getClass()
            r0.b(r7)     // Catch:{ InterruptedException -> 0x047d }
            x9d r0 = r1.Y
            boolean r0 = r0.l()
            r7 = 2
            r8 = 0
            if (r0 != 0) goto L_0x0059
            java.util.Locale r0 = r1.b
            long r2 = java.lang.System.currentTimeMillis()
            long r5 = r1.c
            long r2 = r2 - r5
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "detect CLOSED session in %dms, EXIT"
            java.lang.String r0 = java.lang.String.format(r0, r3, r2)
            x9d r2 = r1.Y
            java.lang.String r2 = r2.a
            java.lang.String r3 = r1.a
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            defpackage.hm9.k0(r2, r8, r4, r0)
            goto L_0x04ac
        L_0x0059:
            x9d r0 = r1.Y
            java.util.concurrent.atomic.AtomicInteger r0 = r0.c
            int r0 = r0.get()
            if (r0 == 0) goto L_0x009c
            if (r0 == r3) goto L_0x0084
            if (r0 == r7) goto L_0x0068
            goto L_0x00c1
        L_0x0068:
            java.util.Locale r0 = r1.b
            int r7 = r34.a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r8 = "active_conn#%d, detect loggedIn status"
            java.lang.String r0 = java.lang.String.format(r0, r8, r7)
            r1.b(r0)
        L_0x007f:
            r31 = r4
        L_0x0081:
            r3 = 0
            goto L_0x0474
        L_0x0084:
            java.util.Locale r0 = r1.b
            int r7 = r34.a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r8 = "active_conn#%d, detect connected status"
            java.lang.String r0 = java.lang.String.format(r0, r8, r7)
            r1.b(r0)
            goto L_0x007f
        L_0x009c:
            java.util.Locale r0 = r1.b
            int r9 = r34.a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "active_conn#%d, detect disconnected status"
            java.lang.String r0 = java.lang.String.format(r0, r10, r9)
            x9d r9 = r1.Y
            java.lang.String r9 = r9.a
            java.lang.String r10 = r1.a
            java.lang.Object[] r0 = new java.lang.Object[]{r10, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            defpackage.hm9.k0(r9, r8, r4, r0)
        L_0x00c1:
            x9d r0 = r1.Y
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.e
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00cc
        L_0x00cb:
            goto L_0x007f
        L_0x00cc:
            java.util.Locale r0 = r1.b
            int r9 = r34.a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "active_conn#%d, detect tryToConnect status ..."
            java.lang.String r0 = java.lang.String.format(r0, r10, r9)
            r1.b(r0)
            x9d r0 = r1.Y
            java.util.concurrent.atomic.AtomicLong r0 = r0.i
            long r9 = r0.get()
            x9d r0 = r1.Y
            r0.getClass()
            long r11 = defpackage.x9d.t()
            java.util.Locale r0 = r1.b
            java.lang.Long r13 = java.lang.Long.valueOf(r11)
            java.lang.Long r14 = java.lang.Long.valueOf(r9)
            long r15 = r9 - r11
            java.lang.Long r2 = java.lang.Long.valueOf(r15)
            java.lang.Object[] r2 = new java.lang.Object[]{r13, r14, r2}
            java.lang.String r13 = "curr_epoch=%dms, next conn_epoch=%dms | in %dms"
            java.lang.String r0 = java.lang.String.format(r0, r13, r2)
            r1.b(r0)
            r13 = 0
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0131
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0131
            java.util.Locale r0 = r1.b
            java.lang.Long r2 = java.lang.Long.valueOf(r15)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r7 = "setup waiting timeout=%dms"
            java.lang.String r0 = java.lang.String.format(r0, r7, r2)
            r1.b(r0)
            r7 = r15
            goto L_0x0013
        L_0x0131:
            x9d r0 = r1.Y
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x007f
            x9d r0 = r1.Y
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x0177
            long r9 = r1.o
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0175
            int r0 = r1.X
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            long r9 = java.lang.System.currentTimeMillis()
            long r11 = r1.o
            long r9 = r9 - r11
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.util.Locale r2 = r1.b
            java.lang.String r9 = "active_conn#%d, finished in %dms <-"
            java.lang.String r0 = java.lang.String.format(r2, r9, r0)
            x9d r2 = r1.Y
            java.lang.String r2 = r2.a
            java.lang.String r9 = r1.a
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            defpackage.hm9.k0(r2, r8, r4, r0)
        L_0x0175:
            r1.o = r5
        L_0x0177:
            long r9 = java.lang.System.currentTimeMillis()
            x9d r2 = r1.Y
            boolean r0 = r2.k()
            if (r0 == 0) goto L_0x007f
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.m
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x018d
            goto L_0x00cb
        L_0x018d:
            long r11 = defpackage.x9d.t()
            java.util.concurrent.atomic.AtomicLong r0 = r2.l
            r0.set(r11)
            r5 = -9223372036854775808
            java.lang.String r0 = r2.a     // Catch:{ Exception -> 0x041f }
            java.lang.String r15 = "Connect"
            defpackage.hm9.m(r0, r15, new java.lang.Object[0])     // Catch:{ Exception -> 0x041f }
            r2.g()     // Catch:{ Exception -> 0x041f }
            k33 r0 = r2.n     // Catch:{ Exception -> 0x041f }
            java.net.Socket r0 = r0.connect()     // Catch:{ Exception -> 0x041f }
            r2.q = r0     // Catch:{ Exception -> 0x041f }
            java.util.concurrent.atomic.AtomicLong r0 = r2.l     // Catch:{ Exception -> 0x041f }
            r0.set(r5)     // Catch:{ Exception -> 0x041f }
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.m     // Catch:{ Exception -> 0x041f }
            boolean r0 = r0.get()     // Catch:{ Exception -> 0x041f }
            if (r0 != 0) goto L_0x01b9
            r0 = 0
            goto L_0x01bd
        L_0x01b9:
            r2.g()     // Catch:{ Exception -> 0x041f }
            r0 = r3
        L_0x01bd:
            if (r0 == 0) goto L_0x01c6
            java.util.concurrent.atomic.AtomicLong r0 = r2.l
            r0.set(r5)
            goto L_0x007f
        L_0x01c6:
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x041f }
            java.net.Socket r15 = r2.q     // Catch:{ Exception -> 0x041f }
            java.io.OutputStream r15 = r15.getOutputStream()     // Catch:{ Exception -> 0x041f }
            r0.<init>(r15)     // Catch:{ Exception -> 0x041f }
            r2.r = r0     // Catch:{ Exception -> 0x041f }
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ Exception -> 0x041f }
            java.net.Socket r15 = r2.q     // Catch:{ Exception -> 0x041f }
            java.io.InputStream r15 = r15.getInputStream()     // Catch:{ Exception -> 0x041f }
            r0.<init>(r15)     // Catch:{ Exception -> 0x041f }
            r2.s = r0     // Catch:{ Exception -> 0x041f }
            r2.p(r3)     // Catch:{ Exception -> 0x041f }
            java.lang.String r0 = r2.a     // Catch:{ Exception -> 0x041f }
            java.lang.String r15 = "Connect success, time: %s, host: %s, port: %s"
            long r17 = defpackage.x9d.t()     // Catch:{ Exception -> 0x041f }
            long r17 = r17 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x041f }
            k33 r12 = r2.n     // Catch:{ Exception -> 0x041f }
            java.lang.String r12 = r12.i()     // Catch:{ Exception -> 0x041f }
            k33 r7 = r2.n     // Catch:{ Exception -> 0x041f }
            int r7 = r7.d()     // Catch:{ Exception -> 0x041f }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x041f }
            java.lang.Object[] r7 = new java.lang.Object[]{r11, r12, r7}     // Catch:{ Exception -> 0x041f }
            defpackage.hm9.m(r0, r15, r7)     // Catch:{ Exception -> 0x041f }
            java.util.concurrent.atomic.AtomicLong r0 = r2.d     // Catch:{ Exception -> 0x041f }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x041f }
            r0.set(r11)     // Catch:{ Exception -> 0x041f }
            boolean r0 = r2.l()     // Catch:{ Exception -> 0x041f }
            if (r0 == 0) goto L_0x0220
            mh3 r0 = r2.t     // Catch:{ Exception -> 0x041f }
            jbd r0 = (defpackage.jbd) r0     // Catch:{ Exception -> 0x041f }
            r0.i = r3     // Catch:{ Exception -> 0x041f }
            r0.b()     // Catch:{ Exception -> 0x041f }
        L_0x0220:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.h     // Catch:{ Exception -> 0x041f }
            r7 = 0
            r0.set(r7)     // Catch:{ Exception -> 0x041f }
            java.util.concurrent.atomic.AtomicLong r0 = r2.i     // Catch:{ Exception -> 0x041f }
            r0.set(r13)     // Catch:{ Exception -> 0x041f }
            java.util.concurrent.atomic.AtomicLong r0 = r2.l
            r0.set(r5)
            x9d r0 = r1.Y
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.j
            r5 = 0
            boolean r2 = r2.compareAndSet(r5, r3)
            if (r2 != 0) goto L_0x023c
            goto L_0x0291
        L_0x023c:
            java.lang.String r2 = r0.a
            java.lang.String r5 = "tryToCreateOtherThreads"
            defpackage.hm9.m(r2, r5, new java.lang.Object[0])
            r0.r()
            java.lang.String r2 = r0.a
            ir6 r5 = defpackage.hm9.m
            if (r5 != 0) goto L_0x024d
            goto L_0x025b
        L_0x024d:
            boolean r6 = r5.c()
            if (r6 != 0) goto L_0x0254
            goto L_0x025b
        L_0x0254:
            us7 r6 = defpackage.us7.X
            java.lang.String r7 = "startPacketReader"
            r5.d(r6, r2, r7, r8)
        L_0x025b:
            mbd r2 = r0.E
            v9d r5 = new v9d
            r6 = 0
            r5.<init>(r0, r6)
            java.lang.String r6 = "session-reader-packet"
            java.lang.Thread r2 = r2.a(r6, r5)
            r2.start()
            java.lang.String r2 = r0.a
            ir6 r5 = defpackage.hm9.m
            if (r5 != 0) goto L_0x0273
            goto L_0x0281
        L_0x0273:
            boolean r6 = r5.c()
            if (r6 != 0) goto L_0x027a
            goto L_0x0281
        L_0x027a:
            us7 r6 = defpackage.us7.X
            java.lang.String r7 = "startPacketSender"
            r5.d(r6, r2, r7, r8)
        L_0x0281:
            mbd r2 = r0.E
            v9d r5 = new v9d
            r5.<init>(r0, r3)
            java.lang.String r0 = "session-sender-packet"
            java.lang.Thread r0 = r2.a(r0, r5)
            r0.start()
        L_0x0291:
            int r0 = r1.X
            int r0 = r0 + r3
            r1.X = r0
            x9d r0 = r1.Y
            k33 r0 = r0.n
            tg3 r0 = r0.k()
            int r2 = r1.X
            r0.c = r2
            ug3 r2 = new ug3
            long r5 = r0.a
            long r7 = r0.b
            long r11 = r0.a
            r13 = 1
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x02ba
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x02ba
            long r7 = r0.b
            long r11 = r0.a
            long r7 = r7 - r11
            goto L_0x02bc
        L_0x02ba:
            r7 = -1
        L_0x02bc:
            long r11 = r0.d
            long r13 = r0.e
            r15 = r4
            long r3 = r0.f
            r31 = r15
            java.lang.String r15 = r0.g
            r32 = r9
            int r9 = r0.h
            int r0 = r0.c
            r17 = r2
            r18 = r5
            r20 = r7
            r22 = r11
            r24 = r13
            r26 = r3
            r28 = r15
            r29 = r9
            r30 = r0
            r17.<init>(r18, r20, r22, r24, r26, r28, r29, r30)
            x9d r0 = r1.Y
            bs9 r0 = r0.u
            wle r0 = (defpackage.wle) r0
            je7 r10 = r0.b
            java.lang.Object r10 = r10.getValue()
            ad r10 = (defpackage.ad) r10
            r17 = r2
            je7 r2 = r0.d
            java.lang.Object r2 = r2.getValue()
            gh3 r2 = (defpackage.gh3) r2
            zh3 r2 = r2.b()
            je7 r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            ri4 r0 = (defpackage.ri4) r0
            boolean r0 = r0.d()
            js7 r18 = r10.a()
            boolean r18 = r18.c()
            if (r18 == 0) goto L_0x0316
            goto L_0x03e3
        L_0x0316:
            e47 r1 = new e47
            r1.<init>()
            r1.a = r5
            java.lang.String r5 = "CONN"
            r1.c = r5
            je7 r5 = r10.a
            java.lang.Object r5 = r5.getValue()
            q33 r5 = (defpackage.q33) r5
            hyc r5 = (defpackage.hyc) r5
            long r5 = r5.t()
            r1.b = r5
            java.lang.String r5 = "TOTAL_CONNECT"
            r1.o = r5
            us r5 = new us
            r6 = 0
            r5.<init>(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            r18 = r11
            java.lang.String r11 = "dns_resolve"
            r5.put(r11, r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            java.lang.String r12 = "tcp_handshake"
            r5.put(r12, r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r20 = r3
            java.lang.String r3 = "tls_handshake"
            r5.put(r3, r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            java.lang.String r6 = "total_connect"
            r5.put(r6, r4)
            r4 = 1
            r0 = r0 ^ r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r22 = r6
            java.lang.String r6 = "background"
            r5.put(r6, r4)
            java.lang.String r4 = r2.a()
            java.lang.String r6 = "conn"
            r5.put(r6, r4)
            je7 r4 = r10.a
            java.lang.Object r4 = r4.getValue()
            q33 r4 = (defpackage.q33) r4
            hyc r4 = (defpackage.hyc) r4
            java.util.Locale r4 = r4.v()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r6 = new java.lang.Object[]{r15, r6}
            r9 = 2
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r9)
            java.lang.String r9 = "%s:%d"
            java.lang.String r4 = java.lang.String.format(r4, r9, r6)
            java.lang.String r6 = "value"
            r5.put(r6, r4)
            r1.b(r5)
            ms7 r1 = r1.c()
            boolean r1 = r10.j(r1)
            if (r1 == 0) goto L_0x03e1
            je7 r1 = r10.c
            java.lang.Object r1 = r1.getValue()
            cd r1 = (defpackage.cd) r1
            op r1 = (defpackage.op) r1
            r1.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            kpa r1 = new kpa
            java.lang.String r4 = "in_background"
            r1.<init>(r4, r0)
            kpa r0 = new kpa
            java.lang.String r4 = "connection_type"
            r0.<init>(r4, r2)
            kpa[] r0 = new defpackage.kpa[]{r1, r0}
            r1 = r18
            defpackage.op.a(r11, r1, r0)
            defpackage.op.a(r12, r13, r0)
            r1 = r20
            defpackage.op.a(r3, r1, r0)
            r1 = r22
            defpackage.op.a(r1, r7, r0)
        L_0x03e1:
            r1 = r34
        L_0x03e3:
            java.util.Locale r0 = r1.b
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r32
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = r17.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "connectToSocket() took %dms, perf_metrics=%s"
            java.lang.String r0 = java.lang.String.format(r0, r3, r2)
            r1.b(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r1.o = r2
            int r0 = r1.X
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.util.Locale r2 = r1.b
            java.lang.String r3 = "active_conn#%d, started ->"
            java.lang.String r0 = java.lang.String.format(r2, r3, r0)
            r1.b(r0)
            goto L_0x0081
        L_0x041d:
            r0 = move-exception
            goto L_0x046e
        L_0x041f:
            r0 = move-exception
            r31 = r4
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.m     // Catch:{ all -> 0x041d }
            boolean r3 = r3.get()     // Catch:{ all -> 0x041d }
            if (r3 != 0) goto L_0x042c
            r7 = 0
            goto L_0x0430
        L_0x042c:
            r2.g()     // Catch:{ all -> 0x041d }
            r7 = 1
        L_0x0430:
            if (r7 == 0) goto L_0x0439
            java.util.concurrent.atomic.AtomicLong r0 = r2.l
            r0.set(r5)
            goto L_0x0081
        L_0x0439:
            java.lang.String r3 = r2.a     // Catch:{ all -> 0x041d }
            java.lang.String r4 = "connectToSocket failure!"
            defpackage.hm9.p(r3, r4, r0)     // Catch:{ all -> 0x041d }
            boolean r3 = r0 instanceof java.net.ConnectException     // Catch:{ all -> 0x041d }
            if (r3 == 0) goto L_0x0456
            o6a r3 = r2.D     // Catch:{ all -> 0x041d }
            if (r3 == 0) goto L_0x0456
            java.lang.String r3 = "TTSession"
            java.lang.String r4 = "disableConnProblems"
            defpackage.hm9.G(r3, r4, r8)     // Catch:{ all -> 0x041d }
            int r3 = defpackage.i9e.a     // Catch:{ all -> 0x041d }
            android.os.StrictMode$VmPolicy r3 = android.os.StrictMode.VmPolicy.LAX     // Catch:{ all -> 0x041d }
            android.os.StrictMode.setVmPolicy(r3)     // Catch:{ all -> 0x041d }
        L_0x0456:
            r3 = 0
            r2.p(r3)     // Catch:{ all -> 0x041d }
            java.util.concurrent.atomic.AtomicBoolean r4 = r2.g     // Catch:{ all -> 0x041d }
            r4.set(r3)     // Catch:{ all -> 0x041d }
            r2.n()     // Catch:{ all -> 0x041d }
            r2.o(r0)     // Catch:{ all -> 0x041d }
            r2.s(r0)     // Catch:{ all -> 0x041d }
            java.util.concurrent.atomic.AtomicLong r0 = r2.l
            r0.set(r5)
            goto L_0x0474
        L_0x046e:
            java.util.concurrent.atomic.AtomicLong r1 = r2.l
            r1.set(r5)
            throw r0
        L_0x0474:
            r4 = r31
            r3 = 1
            r5 = -1
            r7 = -1
            goto L_0x0013
        L_0x047d:
            r31 = r4
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.util.Locale r0 = r1.b
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.c
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "waiting was interrupted in %dms, EXIT"
            java.lang.String r0 = java.lang.String.format(r0, r3, r2)
            x9d r2 = r1.Y
            java.lang.String r2 = r2.a
            java.lang.String r3 = r1.a
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            r3 = r31
            defpackage.hm9.q(r2, r3, r0)
        L_0x04ac:
            java.util.Locale r0 = r1.b
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.c
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "finished in %dms <-"
            java.lang.String r0 = java.lang.String.format(r0, r3, r2)
            r1.b(r0)
            x9d r0 = r1.Y
            defpackage.x9d.a(r0)
            x9d r0 = r1.Y
            defpackage.x9d.d(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9d.run():void");
    }
}
