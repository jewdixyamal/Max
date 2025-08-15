package defpackage;

/* renamed from: vle  reason: default package */
public final /* synthetic */ class vle implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vle(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0223, code lost:
        r5 = r0.b();
        r6 = r13.a;
        r8 = r4.o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            r0 = 2
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.Object r4 = r13.c
            java.lang.Object r5 = r13.b
            int r13 = r13.a
            switch(r13) {
                case 0: goto L_0x01a0;
                case 1: goto L_0x0145;
                case 2: goto L_0x00d7;
                case 3: goto L_0x00ac;
                case 4: goto L_0x0041;
                case 5: goto L_0x0023;
                default: goto L_0x000d;
            }
        L_0x000d:
            wef r5 = (defpackage.wef) r5
            r5.getClass()
            lef r4 = (defpackage.lef) r4
            java.lang.Object[] r13 = new java.lang.Object[]{r4}
            java.lang.String r0 = "wef"
            java.lang.String r1 = "onDispose: conversionData = %s"
            defpackage.hm9.m(r0, r1, r13)
            r5.a(r4)
            return
        L_0x0023:
            c7f r5 = (defpackage.c7f) r5
            r5.getClass()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "onDisposeUpload: data="
            r13.<init>(r0)
            d7f r4 = (defpackage.d7f) r4
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "c7f"
            defpackage.hm9.k(r0, r13)
            r5.c(r4)
            return
        L_0x0041:
            wle r5 = (defpackage.wle) r5
            je7 r13 = r5.i
            java.lang.Object r13 = r13.getValue()
            s7d r13 = (defpackage.s7d) r13
            je7 r13 = r13.g
            java.lang.Object r13 = r13.getValue()
            ts9 r13 = (defpackage.ts9) r13
            r13.getClass()
            ss9 r4 = (defpackage.ss9) r4
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            java.lang.String r1 = defpackage.ts9.d
            java.lang.String r5 = "onNotifMsgDeleteRange: %s"
            defpackage.hm9.m(r1, r5, r0)
            bc7[] r0 = defpackage.ts9.c
            r1 = r0[r2]
            rm4 r1 = r13.a
            java.lang.Object r5 = r1.get()
            p82 r5 = (defpackage.p82) r5
            f52 r6 = r4.c
            java.util.List r6 = java.util.Collections.singletonList(r6)
            r5.c0(r6)
            r5 = r0[r2]
            java.lang.Object r5 = r1.get()
            p82 r5 = (defpackage.p82) r5
            f52 r6 = r4.c
            long r6 = r6.a
            e52 r5 = r5.z(r6)
            if (r5 == 0) goto L_0x00ab
            r3 = r0[r3]
            rm4 r13 = r13.b
            java.lang.Object r13 = r13.get()
            r6 = r13
            au8 r6 = (defpackage.au8) r6
            long r9 = r4.o
            long r11 = r4.X
            long r7 = r5.a
            r6.b(r7, r9, r11)
            r13 = r0[r2]
            java.lang.Object r13 = r1.get()
            p82 r13 = (defpackage.p82) r13
            long r0 = r5.a
            r13.w(r0)
        L_0x00ab:
            return
        L_0x00ac:
            wle r5 = (defpackage.wle) r5
            je7 r13 = r5.n
            java.lang.Object r13 = r13.getValue()
            kr1 r13 = (defpackage.kr1) r13
            wr1 r13 = (defpackage.wr1) r13
            je7 r2 = r13.r
            java.lang.Object r2 = r2.getValue()
            kke r2 = (defpackage.kke) r2
            w9a r2 = (defpackage.w9a) r2
            cx7 r2 = r2.c()
            cx7 r2 = r2.getImmediate()
            sr1 r3 = new sr1
            yg1 r4 = (defpackage.yg1) r4
            r3.<init>(r4, r13, r1)
            jr1 r13 = r13.a
            defpackage.j47.T(r13, r2, r1, r3, r0)
            return
        L_0x00d7:
            wle r5 = (defpackage.wle) r5
            je7 r13 = r5.i
            java.lang.Object r13 = r13.getValue()
            s7d r13 = (defpackage.s7d) r13
            je7 r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            xr9 r13 = (defpackage.xr9) r13
            r13.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onNotifDebug, response = "
            r0.<init>(r1)
            s44 r4 = (defpackage.s44) r4
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = defpackage.xr9.e
            defpackage.hm9.m(r1, r0, new java.lang.Object[0])
            fm5 r0 = r4.c
            fm5 r1 = defpackage.fm5.f
            boolean r1 = defpackage.tpa.f(r0, r1)
            if (r1 == 0) goto L_0x011a
            ru.ok.tamtam.util.HandledException r0 = new ru.ok.tamtam.util.HandledException
            java.lang.String r1 = "onNotifDebug"
            r0.<init>(r1)
            o45 r13 = r13.a
            cba r13 = (defpackage.cba) r13
            r13.c(r0, r3)
            goto L_0x0144
        L_0x011a:
            fm5 r1 = defpackage.fm5.g
            boolean r0 = defpackage.tpa.f(r0, r1)
            if (r0 == 0) goto L_0x0144
            bc7[] r0 = defpackage.xr9.d
            r1 = r0[r2]
            rm4 r1 = r13.b
            java.lang.Object r1 = r1.get()
            c34 r1 = (defpackage.c34) r1
            k24 r1 = (defpackage.k24) r1
            wlc r1 = r1.e
            r1.a()
            r0 = r0[r3]
            rm4 r13 = r13.c
            java.lang.Object r13 = r13.get()
            bva r13 = (defpackage.bva) r13
            jva r13 = (defpackage.jva) r13
            r13.c()
        L_0x0144:
            return
        L_0x0145:
            wle r5 = (defpackage.wle) r5
            je7 r13 = r5.i
            java.lang.Object r13 = r13.getValue()
            s7d r13 = (defpackage.s7d) r13
            je7 r13 = r13.l
            java.lang.Object r13 = r13.getValue()
            as9 r13 = (defpackage.as9) r13
            m7b r1 = r13.a()
            p7b r1 = (defpackage.p7b) r1
            t33 r1 = r1.a
            yr9 r4 = (defpackage.yr9) r4
            long r2 = r4.X
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "user.draftsLastSync"
            r1.l(r3, r2)
            m7b r1 = r13.a()
            p7b r1 = (defpackage.p7b) r1
            z7d r1 = r1.b
            boolean r1 = r1.u()
            if (r1 != 0) goto L_0x0182
            java.lang.String r13 = defpackage.as9.e
            java.lang.String r0 = "onNotifDraft: Drafts sync disabled"
            defpackage.hm9.m(r13, r0, new java.lang.Object[0])
            goto L_0x019f
        L_0x0182:
            bc7[] r1 = defpackage.as9.d
            r0 = r1[r0]
            rm4 r13 = r13.c
            java.lang.Object r13 = r13.get()
            gn4 r13 = (defpackage.gn4) r13
            long r0 = r4.c
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r4.o
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            n7d r2 = r4.Y
            r13.a(r0, r1, r2)
        L_0x019f:
            return
        L_0x01a0:
            wle r5 = (defpackage.wle) r5
            je7 r13 = r5.i
            java.lang.Object r13 = r13.getValue()
            s7d r13 = (defpackage.s7d) r13
            je7 r13 = r13.m
            java.lang.Object r13 = r13.getValue()
            vs9 r13 = (defpackage.vs9) r13
            je7 r0 = r13.b
            java.lang.Object r0 = r0.getValue()
            y7d r0 = (defpackage.y7d) r0
            r0.getClass()
            us9 r4 = (defpackage.us9) r4
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            java.lang.String r2 = "vs9"
            java.lang.String r5 = "reactions, onNotifReactionsChanged, %s"
            defpackage.hm9.m(r2, r5, r0)
            je7 r0 = r13.a
            java.lang.Object r0 = r0.getValue()
            lx8 r0 = (defpackage.lx8) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r5 = r4.Y
            r6 = 10
            int r6 = defpackage.z53.S(r5, r6)
            r2.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        L_0x01e3:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0208
            java.lang.Object r6 = r5.next()
            cx8 r6 = (defpackage.cx8) r6
            hx8 r7 = new hx8
            je7 r8 = r13.c
            java.lang.Object r8 = r8.getValue()
            jx8 r8 = (defpackage.jx8) r8
            bx8 r9 = r6.a
            c6c r8 = r8.d(r9)
            int r6 = r6.b
            r7.<init>(r8, r6)
            r2.add(r7)
            goto L_0x01e3
        L_0x0208:
            je7 r13 = r0.b
            java.lang.Object r13 = r13.getValue()
            iy2 r13 = (defpackage.iy2) r13
            jz2 r13 = (defpackage.jz2) r13
            long r5 = r4.c
            w7c r13 = r13.n(r5)
            j0e r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            e52 r13 = (defpackage.e52) r13
            if (r13 != 0) goto L_0x0223
            goto L_0x0277
        L_0x0223:
            au8 r5 = r0.b()
            long r6 = r13.a
            long r8 = r4.o
            cu8 r13 = r5.j(r6, r8)
            if (r13 != 0) goto L_0x0232
            goto L_0x0277
        L_0x0232:
            vx8 r5 = defpackage.vx8.DELETED
            vx8 r10 = r13.v0
            if (r10 != r5) goto L_0x0239
            goto L_0x0277
        L_0x0239:
            ix8 r5 = r13.S0
            if (r5 == 0) goto L_0x023f
            c6c r1 = r5.c
        L_0x023f:
            ix8 r10 = new ix8
            int r4 = r4.X
            r10.<init>(r2, r4, r1)
            java.util.Set r1 = defpackage.lx8.a(r5, r10)
            boolean r2 = defpackage.tpa.f(r10, r5)
            r2 = r2 ^ r3
            java.lang.Object[] r4 = new java.lang.Object[]{r1}
            java.lang.String r5 = "lx8"
            java.lang.String r11 = "reactions, NOTIF_REACTIONS_CHANGED, reactionsDiff = %s"
            defpackage.hm9.m(r5, r11, r4)
            au8 r4 = r0.b()
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            java.util.Map r5 = java.util.Collections.singletonMap(r5, r10)
            r4.h(r5)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r0.d(r4, r13, r1, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r0.g(r2, r13, r1, r3)
        L_0x0277:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vle.run():void");
    }
}
