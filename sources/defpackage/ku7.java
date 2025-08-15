package defpackage;

/* renamed from: ku7  reason: default package */
public final class ku7 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final je7 n;
    public final je7 o;
    public final je7 p;
    public final je7 q;
    public final je7 r;
    public final je7 s;
    public final je7 t;
    public final je7 u;
    public final je7 v;
    public final je7 w;

    public ku7(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78, je7 je79, je7 je710, je7 je711, je7 je712, je7 je713, je7 je714, je7 je715, je7 je716, je7 je717, je7 je718, je7 je719, je7 je720, je7 je721, je7 je722, je7 je723) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
        this.f = je76;
        this.g = je77;
        this.h = je78;
        this.i = je79;
        this.j = je710;
        this.k = je711;
        this.l = je712;
        this.m = je713;
        this.n = je714;
        this.o = je715;
        this.p = je716;
        this.q = je717;
        this.r = je718;
        this.s = je719;
        this.t = je720;
        this.u = je721;
        this.v = je722;
        this.w = je723;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(31:87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|143|(8:145|146|147|(1:151)|152|154|155|(1:159))|160|(2:164|162)|210|165|(14:166|167|168|169|170|171|172|(6:175|176|177|213|211|173)|212|180|181|182|185|186)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x048f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x04af */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 21
            r1 = 3
            r2 = 12
            r3 = 1
            r4 = 0
            r5 = 2
            java.lang.Class<ku7> r6 = defpackage.ku7.class
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "process: start"
            defpackage.hm9.m(r6, r7, new java.lang.Object[0])
            je7 r6 = r13.j
            java.lang.Object r6 = r6.getValue()
            mle r6 = (defpackage.mle) r6
            tle r6 = (defpackage.tle) r6
            r6.getClass()
            java.lang.String r7 = defpackage.tle.B0
            java.lang.String r8 = "restartSynchronous"
            defpackage.hm9.m(r7, r8, new java.lang.Object[0])
            if (r14 != 0) goto L_0x0077
            ju7 r8 = new ju7
            je7 r9 = r6.Y
            java.lang.Object r9 = r9.getValue()
            m7b r9 = (defpackage.m7b) r9
            p7b r9 = (defpackage.p7b) r9
            t33 r9 = r9.a
            long r9 = r9.o()
            je7 r11 = r6.Z
            java.lang.Object r11 = r11.getValue()
            ri4 r11 = (defpackage.ri4) r11
            ti4 r11 = (defpackage.ti4) r11
            je7 r11 = r11.i
            java.lang.Object r11 = r11.getValue()
            xie r11 = (defpackage.xie) r11
            java.lang.String r11 = r11.d()
            r8.<init>(r9, r11)
            r6.b(r8, r8, r4)
            khe r8 = r6.y0
            java.lang.Object r8 = r8.getValue()
            java.util.concurrent.ExecutorService r8 = (java.util.concurrent.ExecutorService) r8
            r8.shutdown()
            java.util.concurrent.CountDownLatch r8 = r6.b
            if (r8 == 0) goto L_0x0082
            java.util.concurrent.CountDownLatch r8 = r6.b     // Catch:{ InterruptedException -> 0x0070 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0070 }
            r10 = 5
            r8.await(r10, r9)     // Catch:{ InterruptedException -> 0x0070 }
            goto L_0x0082
        L_0x0070:
            r8 = move-exception
            java.lang.String r9 = "syncLogoutLatch timeout"
            defpackage.hm9.l(r7, r9, r8)
            goto L_0x0082
        L_0x0077:
            khe r8 = r6.y0
            java.lang.Object r8 = r8.getValue()
            java.util.concurrent.ExecutorService r8 = (java.util.concurrent.ExecutorService) r8
            r8.shutdownNow()
        L_0x0082:
            rzd r8 = new rzd
            r9 = 8
            r8.<init>(r9, r6)
            khe r9 = new khe
            r9.<init>(r8)
            r6.y0 = r9
            if (r14 != 0) goto L_0x00a5
            je7 r14 = r6.x0
            java.lang.Object r14 = r14.getValue()
            yle r14 = (defpackage.yle) r14
            java.util.concurrent.atomic.AtomicReference r14 = r14.Y
            oe2 r6 = new oe2
            r6.<init>(r2)
            r14.getAndUpdate(r6)
            goto L_0x00b0
        L_0x00a5:
            je7 r14 = r6.x0
            java.lang.Object r14 = r14.getValue()
            yle r14 = (defpackage.yle) r14
            r14.i()
        L_0x00b0:
            java.lang.String r14 = "restartSynchronous finished"
            defpackage.hm9.m(r7, r14, new java.lang.Object[0])
            je7 r14 = r13.a
            java.lang.Object r14 = r14.getValue()
            m7b r14 = (defpackage.m7b) r14
            p7b r14 = (defpackage.p7b) r14
            t33 r6 = r14.a
            r6.c()
            z7d r6 = r14.b
            r6.c()
            jp r6 = r14.c
            r6.c()
            g80 r6 = r14.d
            r6.c()
            se5 r14 = r14.e
            r14.c()
            je7 r14 = r13.b
            java.lang.Object r14 = r14.getValue()
            el3 r14 = (defpackage.el3) r14
            r14.b()
            java.util.concurrent.ConcurrentHashMap r6 = r14.a
            r6.clear()
            java.util.concurrent.ConcurrentHashMap r6 = r14.b
            r6.clear()
            java.util.concurrent.CopyOnWriteArraySet r14 = r14.c
            r14.clear()
            je7 r14 = r13.c
            java.lang.Object r14 = r14.getValue()
            u7b r14 = (defpackage.u7b) r14
            java.util.concurrent.ConcurrentHashMap r14 = r14.o
            r14.clear()
            je7 r14 = r13.d
            java.lang.Object r14 = r14.getValue()
            p82 r14 = (defpackage.p82) r14
            r14.e()
            s72 r6 = new s72
            r6.<init>(r14, r3)
            java.lang.String r7 = "clear"
            r14.f0(r7, r6)
            je7 r14 = r13.e
            java.lang.Object r14 = r14.getValue()
            p7c r14 = (defpackage.p7c) r14
            r14.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.concurrent.ConcurrentHashMap r14 = r14.i
            java.util.Collection r7 = r14.values()
            r6.<init>(r7)
            r14.clear()
            java.util.Iterator r14 = r6.iterator()
        L_0x0131:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x0141
            java.lang.Object r6 = r14.next()
            zl4 r6 = (defpackage.zl4) r6
            defpackage.cqc.b(r6)
            goto L_0x0131
        L_0x0141:
            je7 r14 = r13.f
            java.lang.Object r14 = r14.getValue()
            t6b r14 = (defpackage.t6b) r14
            if (r14 == 0) goto L_0x014e
            r14.a()
        L_0x014e:
            je7 r14 = r13.g
            java.lang.Object r14 = r14.getValue()
            o2e r14 = (defpackage.o2e) r14
            r14.getClass()
            java.lang.String r6 = "o2e"
            java.lang.String r7 = "Clear"
            defpackage.hm9.m(r6, r7, new java.lang.Object[0])
            java.util.concurrent.ConcurrentHashMap r6 = r14.a
            r6.clear()
            java.util.concurrent.ConcurrentHashMap r6 = r14.b
            r6.clear()
            m7b r6 = r14.d
            p7b r6 = (defpackage.p7b) r6
            t33 r6 = r6.a
            r7 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.String r8 = "user.stickersLastSync"
            r6.l(r8, r7)
            rm4 r6 = r14.j
            java.lang.Object r6 = r6.get()
            x9c r6 = (defpackage.x9c) r6
            r6.getClass()
            java.lang.String r7 = "x9c"
            java.lang.String r8 = "Clear"
            defpackage.hm9.m(r7, r8, new java.lang.Object[0])
            msf r7 = r6.f
            r7.d()
            p9c r6 = r6.b()
            uqd r6 = r6.b()
            p4c r7 = new p4c
            r8 = 11
            r7.<init>(r8)
            qa3 r8 = new qa3
            r8.<init>(r6, r5, r7)
            qy9 r6 = r8.l()
            kj6 r7 = defpackage.ft.e
            m2e r8 = new m2e
            r9 = 9
            r8.<init>(r9)
            fa4 r9 = new fa4
            r10 = 10
            r9.<init>(r10)
            defpackage.nd7.U(r6, r7, r8, r9)
            monitor-enter(r14)
            rm4 r6 = r14.e     // Catch:{ all -> 0x06b2 }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x06b2 }
            zi5 r6 = (defpackage.zi5) r6     // Catch:{ all -> 0x06b2 }
            kk5 r6 = (defpackage.kk5) r6     // Catch:{ all -> 0x06b2 }
            java.io.File r6 = r6.p()     // Catch:{ all -> 0x06b2 }
            r6.delete()     // Catch:{ all -> 0x06b2 }
            monitor-exit(r14)
            iq1 r6 = r14.k
            defpackage.cqc.b(r6)
            r6 = 0
            defpackage.cqc.b(r6)
            ml0 r14 = r14.l
            java.util.List r7 = java.util.Collections.emptyList()
            r14.e(r7)
            je7 r14 = r13.m
            java.lang.Object r14 = r14.getValue()
            dq0 r14 = (defpackage.dq0) r14
            if (r14 == 0) goto L_0x01ff
            w4d r7 = defpackage.cqc.a
            e5 r8 = new e5
            r8.<init>(r5, r14)
            un0 r14 = new un0
            r14.<init>(r3)
            java.lang.Object r7 = r7.b
            ztc r7 = (defpackage.ztc) r7
            defpackage.cqc.a(r8, r7, r6, r14, r6)
        L_0x01ff:
            je7 r14 = r13.n
            java.lang.Object r14 = r14.getValue()
            jy8 r14 = (defpackage.jy8) r14
            r14.getClass()
            java.lang.String r7 = "jy8"
            java.lang.String r8 = "clear: "
            defpackage.hm9.m(r7, r8, new java.lang.Object[0])
            je7 r8 = r14.a     // Catch:{ all -> 0x0245 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ all -> 0x0245 }
            py8 r8 = (defpackage.py8) r8     // Catch:{ all -> 0x0245 }
            o28 r8 = r8.a()     // Catch:{ all -> 0x0245 }
            nz4 r9 = defpackage.nz4.a     // Catch:{ all -> 0x0245 }
            java.lang.Object r8 = r8.c(r9)     // Catch:{ all -> 0x0245 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0245 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0245 }
        L_0x0229:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0245 }
            if (r9 == 0) goto L_0x024b
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0245 }
            iy8 r9 = (defpackage.iy8) r9     // Catch:{ all -> 0x0245 }
            je7 r10 = r14.c     // Catch:{ all -> 0x0245 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ all -> 0x0245 }
            dg5 r10 = (defpackage.dg5) r10     // Catch:{ all -> 0x0245 }
            nw8 r9 = r9.a     // Catch:{ all -> 0x0245 }
            long r11 = r9.a     // Catch:{ all -> 0x0245 }
            r10.a(r11)     // Catch:{ all -> 0x0245 }
            goto L_0x0229
        L_0x0245:
            r8 = move-exception
            java.lang.String r9 = "clear failure!"
            defpackage.hm9.p(r7, r9, r8)
        L_0x024b:
            je7 r14 = r14.a     // Catch:{ Exception -> 0x026c }
            java.lang.Object r14 = r14.getValue()     // Catch:{ Exception -> 0x026c }
            py8 r14 = (defpackage.py8) r14     // Catch:{ Exception -> 0x026c }
            uqd r14 = r14.b()     // Catch:{ Exception -> 0x026c }
            hj8 r8 = new hj8     // Catch:{ Exception -> 0x026c }
            r9 = 18
            r8.<init>(r9)     // Catch:{ Exception -> 0x026c }
            qa3 r9 = new qa3     // Catch:{ Exception -> 0x026c }
            r9.<init>(r14, r5, r8)     // Catch:{ Exception -> 0x026c }
            r9.a()     // Catch:{ Exception -> 0x026c }
            java.lang.String r14 = "clear: cleared message upload repository"
            defpackage.hm9.m(r7, r14, new java.lang.Object[0])     // Catch:{ Exception -> 0x026c }
            goto L_0x0272
        L_0x026c:
            r14 = move-exception
            java.lang.String r8 = "clear: failed to clear message upload repository"
            defpackage.hm9.p(r7, r8, r14)
        L_0x0272:
            je7 r14 = r13.o
            java.lang.Object r14 = r14.getValue()
            mp4 r14 = (defpackage.mp4) r14
            if (r14 == 0) goto L_0x0327
            java.lang.String r7 = defpackage.mp4.g
            java.lang.String r8 = "clear: "
            defpackage.hm9.m(r7, r8, new java.lang.Object[0])
            bc7[] r8 = defpackage.mp4.f     // Catch:{ all -> 0x02ba }
            r8 = r8[r5]     // Catch:{ all -> 0x02ba }
            rm4 r8 = r14.d     // Catch:{ all -> 0x02ba }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x02ba }
            up4 r8 = (defpackage.up4) r8     // Catch:{ all -> 0x02ba }
            uqd r8 = r8.a()     // Catch:{ all -> 0x02ba }
            huc r9 = defpackage.huc.Z     // Catch:{ all -> 0x02ba }
            o28 r10 = new o28     // Catch:{ all -> 0x02ba }
            r10.<init>(r8, r5, r9)     // Catch:{ all -> 0x02ba }
            crd r8 = defpackage.crd.Z     // Catch:{ all -> 0x02ba }
            q28 r9 = new q28     // Catch:{ all -> 0x02ba }
            r9.<init>(r10, r8, r4)     // Catch:{ all -> 0x02ba }
            b46 r8 = defpackage.b46.t0     // Catch:{ all -> 0x02ba }
            e0a r10 = new e0a     // Catch:{ all -> 0x02ba }
            r10.<init>(r9, r8, r1)     // Catch:{ all -> 0x02ba }
            vy9 r8 = r10.v()     // Catch:{ all -> 0x02ba }
            xxc r9 = defpackage.xxc.X     // Catch:{ all -> 0x02ba }
            o28 r10 = new o28     // Catch:{ all -> 0x02ba }
            r10.<init>(r8, r5, r9)     // Catch:{ all -> 0x02ba }
            java.lang.Object r8 = r10.b()     // Catch:{ all -> 0x02ba }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x02ba }
            goto L_0x02c1
        L_0x02ba:
            r8 = move-exception
            njc r9 = new njc
            r9.<init>(r8)
            r8 = r9
        L_0x02c1:
            nz4 r9 = defpackage.nz4.a
            boolean r10 = r8 instanceof defpackage.njc
            if (r10 == 0) goto L_0x02c8
            r8 = r9
        L_0x02c8:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x0301
            java.util.Iterator r8 = r8.iterator()
        L_0x02d0:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0301
            java.lang.Object r9 = r8.next()
            lp4 r9 = (defpackage.lp4) r9
            ep4 r9 = r9.a
            long r9 = r9.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "cancel: chatId = "
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            defpackage.hm9.m(r7, r11, new java.lang.Object[0])
            bc7[] r11 = defpackage.mp4.f
            r11 = r11[r3]
            rm4 r11 = r14.c
            java.lang.Object r11 = r11.get()
            dg5 r11 = (defpackage.dg5) r11
            r11.b(r9)
            goto L_0x02d0
        L_0x0301:
            bc7[] r3 = defpackage.mp4.f     // Catch:{ all -> 0x0321 }
            r3 = r3[r5]     // Catch:{ all -> 0x0321 }
            rm4 r14 = r14.d     // Catch:{ all -> 0x0321 }
            java.lang.Object r14 = r14.get()     // Catch:{ all -> 0x0321 }
            up4 r14 = (defpackage.up4) r14     // Catch:{ all -> 0x0321 }
            uqd r14 = r14.a()     // Catch:{ all -> 0x0321 }
            hx9 r3 = defpackage.hx9.Z     // Catch:{ all -> 0x0321 }
            qa3 r8 = new qa3     // Catch:{ all -> 0x0321 }
            r8.<init>(r14, r5, r3)     // Catch:{ all -> 0x0321 }
            r8.a()     // Catch:{ all -> 0x0321 }
            java.lang.String r14 = "clear: cleared draft upload repository"
            defpackage.hm9.m(r7, r14, new java.lang.Object[0])     // Catch:{ all -> 0x0321 }
            goto L_0x0327
        L_0x0321:
            r14 = move-exception
            java.lang.String r3 = "clear: failed to clear draft upload repository"
            defpackage.hm9.p(r7, r3, r14)
        L_0x0327:
            je7 r14 = r13.p
            java.lang.Object r14 = r14.getValue()
            r3 = r14
            c7f r3 = (defpackage.c7f) r3
            monitor-enter(r3)
            java.lang.String r14 = "c7f"
            java.lang.String r7 = "clear: "
            defpackage.hm9.m(r14, r7, new java.lang.Object[0])     // Catch:{ all -> 0x06af }
            msf r14 = r3.i     // Catch:{ all -> 0x06af }
            r14.d()     // Catch:{ all -> 0x06af }
            java.util.concurrent.ConcurrentHashMap r14 = r3.h     // Catch:{ all -> 0x06af }
            r14.clear()     // Catch:{ all -> 0x06af }
            y8f r14 = r3.a     // Catch:{ all -> 0x06af }
            pa3 r14 = r14.clear()     // Catch:{ all -> 0x06af }
            qy9 r14 = r14.l()     // Catch:{ all -> 0x06af }
            kj6 r7 = defpackage.ft.e     // Catch:{ all -> 0x06af }
            n2f r8 = new n2f     // Catch:{ all -> 0x06af }
            r9 = 4
            r8.<init>(r9)     // Catch:{ all -> 0x06af }
            fa4 r9 = new fa4     // Catch:{ all -> 0x06af }
            r9.<init>(r2)     // Catch:{ all -> 0x06af }
            defpackage.nd7.U(r14, r7, r8, r9)     // Catch:{ all -> 0x06af }
            monitor-exit(r3)
            je7 r14 = r13.q
            java.lang.Object r14 = r14.getValue()
            wef r14 = (defpackage.wef) r14
            monitor-enter(r14)
            java.lang.String r2 = "wef"
            java.lang.String r3 = "clear: "
            defpackage.hm9.m(r2, r3, new java.lang.Object[0])     // Catch:{ all -> 0x06ac }
            msf r2 = r14.h     // Catch:{ all -> 0x06ac }
            r2.d()     // Catch:{ all -> 0x06ac }
            java.util.HashMap r2 = r14.i     // Catch:{ all -> 0x06ac }
            r2.clear()     // Catch:{ all -> 0x06ac }
            yef r2 = r14.b     // Catch:{ all -> 0x06ac }
            uqd r2 = r2.a()     // Catch:{ all -> 0x06ac }
            n2f r3 = new n2f     // Catch:{ all -> 0x06ac }
            r8 = 19
            r3.<init>(r8)     // Catch:{ all -> 0x06ac }
            qa3 r8 = new qa3     // Catch:{ all -> 0x06ac }
            r8.<init>(r2, r5, r3)     // Catch:{ all -> 0x06ac }
            qy9 r2 = r8.l()     // Catch:{ all -> 0x06ac }
            n2f r3 = new n2f     // Catch:{ all -> 0x06ac }
            r8 = 16
            r3.<init>(r8)     // Catch:{ all -> 0x06ac }
            fa4 r8 = new fa4     // Catch:{ all -> 0x06ac }
            r9 = 13
            r8.<init>(r9)     // Catch:{ all -> 0x06ac }
            defpackage.nd7.U(r2, r7, r3, r8)     // Catch:{ all -> 0x06ac }
            monitor-exit(r14)
            je7 r14 = r13.h
            java.lang.Object r14 = r14.getValue()
            cea r14 = (defpackage.cea) r14
            o44 r2 = r14.b()
            r2.getClass()
            java.lang.String r3 = defpackage.o44.k
            java.lang.String r7 = "cancelAll"
            defpackage.hm9.m(r3, r7, new java.lang.Object[0])
            g44 r3 = new g44
            r3.<init>(r2, r6, r4)
            r2.c(r3)
            je7 r2 = r14.a
            java.lang.Object r2 = r2.getValue()
            bea r2 = (defpackage.bea) r2
            r2.a(r5)
            je7 r2 = r14.a
            java.lang.Object r2 = r2.getValue()
            bea r2 = (defpackage.bea) r2
            r3 = 6
            r2.a(r3)
            je7 r14 = r14.b
            java.lang.Object r14 = r14.getValue()
            vr7 r14 = (defpackage.vr7) r14
            r14.getClass()
            je7 r14 = r13.i
            java.lang.Object r14 = r14.getValue()
            c34 r14 = (defpackage.c34) r14
            k24 r14 = (defpackage.k24) r14
            java.lang.String r2 = "deleteAllExceptStats end"
            java.lang.String r3 = "k24"
            pfa r4 = r14.a
            java.lang.String r6 = "deleteAllExceptStats start"
            defpackage.hm9.m(r3, r6, new java.lang.Object[0])     // Catch:{ all -> 0x04d2 }
            ilc r6 = r4.m()     // Catch:{ all -> 0x04d2 }
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r6 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r6     // Catch:{ all -> 0x04d2 }
            r6.c()     // Catch:{ all -> 0x04d2 }
            vlc r6 = r14.c     // Catch:{ all -> 0x04d2 }
            t19 r6 = r6.d()     // Catch:{ all -> 0x04d2 }
            ilc r7 = r6.a     // Catch:{ all -> 0x04d2 }
            r7.b()     // Catch:{ all -> 0x04d2 }
            p19 r6 = r6.q     // Catch:{ all -> 0x04d2 }
            q36 r8 = r6.f()     // Catch:{ all -> 0x04d2 }
            r7.c()     // Catch:{ all -> 0x04f2 }
            r8.n()     // Catch:{ all -> 0x04ed }
            r7.r()     // Catch:{ all -> 0x04ed }
            r7.l()     // Catch:{ all -> 0x04f2 }
            r6.t(r8)     // Catch:{ all -> 0x04d2 }
            elc r6 = r14.b     // Catch:{ all -> 0x04d2 }
            r6.b()     // Catch:{ all -> 0x04d2 }
            glc r6 = r14.d     // Catch:{ all -> 0x04d2 }
            ir3 r6 = r6.h()     // Catch:{ all -> 0x04d2 }
            ilc r7 = r6.a     // Catch:{ all -> 0x04d2 }
            r7.c()     // Catch:{ all -> 0x04d2 }
            defpackage.ir3.a(r6)     // Catch:{ all -> 0x04e8 }
            r7.r()     // Catch:{ all -> 0x04e8 }
            r7.l()     // Catch:{ all -> 0x04d2 }
            wlc r6 = r14.e     // Catch:{ all -> 0x04d2 }
            r6.a()     // Catch:{ all -> 0x04d2 }
            jmc r6 = r14.f     // Catch:{ all -> 0x04d2 }
            hoe r6 = r6.b()     // Catch:{ all -> 0x04d2 }
            ilc r7 = r6.a     // Catch:{ all -> 0x04d2 }
            r7.b()     // Catch:{ all -> 0x04d2 }
            zkc r6 = r6.h     // Catch:{ all -> 0x04d2 }
            q36 r8 = r6.f()     // Catch:{ all -> 0x04d2 }
            r7.c()     // Catch:{ all -> 0x04e3 }
            r8.n()     // Catch:{ all -> 0x04de }
            r7.r()     // Catch:{ all -> 0x04de }
            r7.l()     // Catch:{ all -> 0x04e3 }
            r6.t(r8)     // Catch:{ all -> 0x04d2 }
            imc r6 = r14.h     // Catch:{ all -> 0x04d2 }
            java.lang.Object r6 = r6.c     // Catch:{ all -> 0x04d2 }
            khe r6 = (defpackage.khe) r6     // Catch:{ all -> 0x04d2 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x04d2 }
            n4e r6 = (defpackage.n4e) r6     // Catch:{ all -> 0x04d2 }
            ilc r7 = r6.a     // Catch:{ all -> 0x04d2 }
            r7.b()     // Catch:{ all -> 0x04d2 }
            zkc r6 = r6.c     // Catch:{ all -> 0x04d2 }
            q36 r8 = r6.f()     // Catch:{ all -> 0x04d2 }
            r7.c()     // Catch:{ all -> 0x04d9 }
            r8.n()     // Catch:{ all -> 0x04d4 }
            r7.r()     // Catch:{ all -> 0x04d4 }
            r7.l()     // Catch:{ all -> 0x04d9 }
            r6.t(r8)     // Catch:{ all -> 0x04d2 }
            gj r6 = r14.u     // Catch:{ all -> 0x04d2 }
            r6.d()     // Catch:{ all -> 0x04d2 }
            a9f r6 = r14.j     // Catch:{ all -> 0x048f }
            pa3 r6 = r6.clear()     // Catch:{ all -> 0x048f }
            r6.a()     // Catch:{ all -> 0x048f }
        L_0x048f:
            c4e r14 = r14.p     // Catch:{ all -> 0x04af }
            jlc r14 = r14.a     // Catch:{ all -> 0x04af }
            q1a r14 = r14.n()     // Catch:{ all -> 0x04af }
            m2e r6 = new m2e     // Catch:{ all -> 0x04af }
            r6.<init>(r0)     // Catch:{ all -> 0x04af }
            uqd r14 = r14.h(r6)     // Catch:{ all -> 0x04af }
            m2e r6 = new m2e     // Catch:{ all -> 0x04af }
            r7 = 17
            r6.<init>(r7)     // Catch:{ all -> 0x04af }
            qa3 r7 = new qa3     // Catch:{ all -> 0x04af }
            r7.<init>(r14, r5, r6)     // Catch:{ all -> 0x04af }
            r7.a()     // Catch:{ all -> 0x04af }
        L_0x04af:
            ilc r14 = r4.m()     // Catch:{ all -> 0x04d2 }
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r14 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r14     // Catch:{ all -> 0x04d2 }
            kw9 r14 = r14.H()     // Catch:{ all -> 0x04d2 }
            r14.a()     // Catch:{ all -> 0x04d2 }
            ilc r14 = r4.m()     // Catch:{ all -> 0x04d2 }
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r14 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r14     // Catch:{ all -> 0x04d2 }
            r14.r()     // Catch:{ all -> 0x04d2 }
            ilc r14 = r4.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r14 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r14
        L_0x04cb:
            r14.l()
            defpackage.hm9.m(r3, r2, new java.lang.Object[0])
            goto L_0x0503
        L_0x04d2:
            r14 = move-exception
            goto L_0x04f7
        L_0x04d4:
            r14 = move-exception
            r7.l()     // Catch:{ all -> 0x04d9 }
            throw r14     // Catch:{ all -> 0x04d9 }
        L_0x04d9:
            r14 = move-exception
            r6.t(r8)     // Catch:{ all -> 0x04d2 }
            throw r14     // Catch:{ all -> 0x04d2 }
        L_0x04de:
            r14 = move-exception
            r7.l()     // Catch:{ all -> 0x04e3 }
            throw r14     // Catch:{ all -> 0x04e3 }
        L_0x04e3:
            r14 = move-exception
            r6.t(r8)     // Catch:{ all -> 0x04d2 }
            throw r14     // Catch:{ all -> 0x04d2 }
        L_0x04e8:
            r14 = move-exception
            r7.l()     // Catch:{ all -> 0x04d2 }
            throw r14     // Catch:{ all -> 0x04d2 }
        L_0x04ed:
            r14 = move-exception
            r7.l()     // Catch:{ all -> 0x04f2 }
            throw r14     // Catch:{ all -> 0x04f2 }
        L_0x04f2:
            r14 = move-exception
            r6.t(r8)     // Catch:{ all -> 0x04d2 }
            throw r14     // Catch:{ all -> 0x04d2 }
        L_0x04f7:
            java.lang.String r6 = "During deleting got exception"
            defpackage.hm9.p(r3, r6, r14)     // Catch:{ all -> 0x069e }
            ilc r14 = r4.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r14 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r14
            goto L_0x04cb
        L_0x0503:
            je7 r14 = r13.k
            java.lang.Object r14 = r14.getValue()
            ri4 r14 = (defpackage.ri4) r14
            r14.getClass()
            je7 r14 = r13.l
            java.lang.Object r14 = r14.getValue()
            eca r14 = (defpackage.eca) r14
            if (r14 == 0) goto L_0x0573
            java.lang.String r2 = "OneMeInitialDataStorage"
            java.lang.String r3 = "reset"
            defpackage.hm9.m(r2, r3, new java.lang.Object[0])
            khe r2 = r14.b
            java.lang.Object r2 = r2.getValue()
            na9 r2 = (defpackage.na9) r2
            java.lang.Object r3 = r2.c
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3
            nz4 r4 = defpackage.nz4.a
            r3.set(r4)
            zy r2 = r2.b()     // Catch:{ all -> 0x0549 }
            java.io.File r3 = r2.c     // Catch:{ all -> 0x0549 }
            boolean r3 = r3.delete()     // Catch:{ all -> 0x0549 }
            if (r3 == 0) goto L_0x0549
            java.io.File r3 = r2.d     // Catch:{ all -> 0x0549 }
            boolean r3 = r3.delete()     // Catch:{ all -> 0x0549 }
            if (r3 == 0) goto L_0x0549
            java.io.File r2 = r2.e     // Catch:{ all -> 0x0549 }
            r2.delete()     // Catch:{ all -> 0x0549 }
        L_0x0549:
            khe r14 = r14.c
            java.lang.Object r14 = r14.getValue()
            ya9 r14 = (defpackage.ya9) r14
            java.lang.Object r2 = r14.c
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            nz4 r3 = defpackage.nz4.a
            r2.set(r3)
            zy r14 = r14.b()     // Catch:{ all -> 0x0573 }
            java.io.File r2 = r14.c     // Catch:{ all -> 0x0573 }
            boolean r2 = r2.delete()     // Catch:{ all -> 0x0573 }
            if (r2 == 0) goto L_0x0573
            java.io.File r2 = r14.d     // Catch:{ all -> 0x0573 }
            boolean r2 = r2.delete()     // Catch:{ all -> 0x0573 }
            if (r2 == 0) goto L_0x0573
            java.io.File r14 = r14.e     // Catch:{ all -> 0x0573 }
            r14.delete()     // Catch:{ all -> 0x0573 }
        L_0x0573:
            je7 r14 = r13.r
            java.lang.Object r14 = r14.getValue()
            cn7 r14 = (defpackage.cn7) r14
            je7 r14 = r13.s
            java.lang.Object r14 = r14.getValue()
            cde r14 = (defpackage.cde) r14
            java.util.concurrent.ConcurrentHashMap r14 = r14.a
            java.util.Collection r2 = r14.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x058d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x059d
            java.lang.Object r3 = r2.next()
            bde r3 = (defpackage.bde) r3
            r3.clear()
            goto L_0x058d
        L_0x059d:
            r14.clear()
            je7 r14 = r13.t
            java.lang.Object r14 = r14.getValue()
            dz r14 = (defpackage.dz) r14
            java.util.concurrent.ConcurrentHashMap r14 = r14.a
            r14.clear()
            je7 r14 = r13.u
            java.lang.Object r14 = r14.getValue()
            md5 r14 = (defpackage.md5) r14
            r14.getClass()
            java.lang.String r2 = "md5"
            java.lang.String r3 = "clear: "
            defpackage.hm9.m(r2, r3, new java.lang.Object[0])
            rm4 r2 = r14.g
            java.lang.Object r2 = r2.get()
            hd5 r2 = (defpackage.hd5) r2
            r2.getClass()
            java.lang.String r3 = "hd5"
            java.lang.String r4 = "cancelRequests: "
            defpackage.hm9.m(r3, r4, new java.lang.Object[0])
            java.util.concurrent.ConcurrentHashMap r3 = r2.f
            r3.clear()
            hc3 r2 = r2.g
            r2.d()
            hc3 r2 = r14.h
            r2.d()
            rm4 r14 = r14.a
            java.lang.Object r14 = r14.get()
            hc5 r14 = (defpackage.hc5) r14
            uqd r14 = r14.a()
            ta4 r2 = new ta4
            r2.<init>(r0)
            qa3 r0 = new qa3
            r0.<init>(r14, r5, r2)
            qy9 r14 = r0.l()
            kj6 r0 = defpackage.ft.e
            nc5 r2 = new nc5
            r3 = 22
            r2.<init>(r3)
            fa4 r3 = new fa4
            r3.<init>(r1)
            defpackage.nd7.U(r14, r0, r2, r3)
            je7 r14 = r13.w
            java.lang.Object r14 = r14.getValue()
            blb r14 = (defpackage.blb) r14
            adb r14 = r14.a
            java.lang.Object r0 = r14.a
            ilc r0 = (defpackage.ilc) r0
            r0.b()
            java.lang.Object r14 = r14.c
            p19 r14 = (defpackage.p19) r14
            q36 r1 = r14.f()
            r0.c()     // Catch:{ all -> 0x0699 }
            r1.n()     // Catch:{ all -> 0x0694 }
            r0.r()     // Catch:{ all -> 0x0694 }
            r0.l()     // Catch:{ all -> 0x0699 }
            r14.t(r1)
            je7 r14 = r13.v
            java.lang.Object r14 = r14.getValue()
            java.util.List r14 = (java.util.List) r14
            java.util.Iterator r14 = r14.iterator()
        L_0x063f:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x066d
            java.lang.Object r0 = r14.next()
            qu7 r0 = (defpackage.qu7) r0
            r0.a()     // Catch:{ all -> 0x064f }
            goto L_0x063f
        L_0x064f:
            r1 = move-exception
            java.lang.Class<ku7> r2 = defpackage.ku7.class
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "notifyListeners: listener "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " failed!"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            defpackage.hm9.p(r2, r0, r1)
            goto L_0x063f
        L_0x066d:
            je7 r13 = r13.i
            java.lang.Object r13 = r13.getValue()
            c34 r13 = (defpackage.c34) r13
            k24 r13 = (defpackage.k24) r13
            r13.getClass()
            pfa r13 = r13.a     // Catch:{ all -> 0x0680 }
            r13.close()     // Catch:{ all -> 0x0680 }
            goto L_0x0688
        L_0x0680:
            r13 = move-exception
            java.lang.String r14 = "k24"
            java.lang.String r0 = "Got error during closing database"
            defpackage.hm9.p(r14, r0, r13)
        L_0x0688:
            java.lang.Class<ku7> r13 = defpackage.ku7.class
            java.lang.String r13 = r13.getName()
            java.lang.String r14 = "process: done"
            defpackage.hm9.m(r13, r14, new java.lang.Object[0])
            return
        L_0x0694:
            r13 = move-exception
            r0.l()     // Catch:{ all -> 0x0699 }
            throw r13     // Catch:{ all -> 0x0699 }
        L_0x0699:
            r13 = move-exception
            r14.t(r1)
            throw r13
        L_0x069e:
            r13 = move-exception
            ilc r14 = r4.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r14 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r14
            r14.l()
            defpackage.hm9.m(r3, r2, new java.lang.Object[0])
            throw r13
        L_0x06ac:
            r13 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x06ac }
            throw r13
        L_0x06af:
            r13 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x06af }
            throw r13
        L_0x06b2:
            r13 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x06b2 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku7.a(boolean):void");
    }
}
