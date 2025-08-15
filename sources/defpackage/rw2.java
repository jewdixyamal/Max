package defpackage;

/* renamed from: rw2  reason: default package */
public final class rw2 implements on5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on5 b;
    public final /* synthetic */ nx2 c;

    public /* synthetic */ rw2(on5 on5, nx2 nx2, int i) {
        this.a = i;
        this.b = on5;
        this.c = nx2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x019e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            r0 = 0
            e5f r1 = defpackage.e5f.a
            on5 r2 = r11.b
            nx2 r3 = r11.c
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            tx3 r6 = defpackage.tx3.a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = r11.a
            switch(r8) {
                case 0: goto L_0x0176;
                case 1: goto L_0x012b;
                case 2: goto L_0x00ec;
                case 3: goto L_0x0085;
                default: goto L_0x0013;
            }
        L_0x0013:
            boolean r8 = r13 instanceof defpackage.jx2
            if (r8 == 0) goto L_0x0024
            r8 = r13
            jx2 r8 = (defpackage.jx2) r8
            int r9 = r8.X
            r10 = r9 & r7
            if (r10 == 0) goto L_0x0024
            int r9 = r9 - r7
            r8.X = r9
            goto L_0x0029
        L_0x0024:
            jx2 r8 = new jx2
            r8.<init>(r11, r13)
        L_0x0029:
            java.lang.Object r11 = r8.o
            int r13 = r8.X
            if (r13 == 0) goto L_0x003b
            if (r13 != r5) goto L_0x0035
            defpackage.od2.a0(r11)
            goto L_0x0084
        L_0x0035:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x003b:
            defpackage.od2.a0(r11)
            java.util.List r12 = (java.util.List) r12
            gi9 r11 = new gi9
            r11.<init>((java.lang.Object) r0)
            java.util.Iterator r12 = r12.iterator()
        L_0x0049:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x007b
            java.lang.Object r13 = r12.next()
            java.lang.Number r13 = (java.lang.Number) r13
            long r9 = r13.longValue()
            iy2 r13 = defpackage.nx2.r(r3)
            jz2 r13 = (defpackage.jz2) r13
            w7c r13 = r13.m(r9)
            j0e r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            e52 r13 = (defpackage.e52) r13
            if (r13 == 0) goto L_0x0049
            uj3 r13 = r13.l()
            if (r13 == 0) goto L_0x0049
            long r9 = r13.n()
            r11.a(r9)
            goto L_0x0049
        L_0x007b:
            r8.X = r5
            java.lang.Object r11 = r2.a(r11, r8)
            if (r11 != r6) goto L_0x0084
            r1 = r6
        L_0x0084:
            return r1
        L_0x0085:
            boolean r8 = r13 instanceof defpackage.fx2
            if (r8 == 0) goto L_0x0096
            r8 = r13
            fx2 r8 = (defpackage.fx2) r8
            int r9 = r8.X
            r10 = r9 & r7
            if (r10 == 0) goto L_0x0096
            int r9 = r9 - r7
            r8.X = r9
            goto L_0x009b
        L_0x0096:
            fx2 r8 = new fx2
            r8.<init>(r11, r13)
        L_0x009b:
            java.lang.Object r11 = r8.o
            int r13 = r8.X
            if (r13 == 0) goto L_0x00ad
            if (r13 != r5) goto L_0x00a7
            defpackage.od2.a0(r11)
            goto L_0x00eb
        L_0x00a7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x00ad:
            defpackage.od2.a0(r11)
            kpa r12 = (defpackage.kpa) r12
            java.lang.Object r11 = r12.a
            mt2 r11 = (defpackage.mt2) r11
            java.lang.Object r12 = r12.b
            java.util.List r12 = (java.util.List) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x00be:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00d6
            java.lang.Object r13 = r12.next()
            r4 = r13
            at5 r4 = (defpackage.at5) r4
            java.lang.String r4 = r4.a
            java.lang.String r7 = r3.c
            boolean r4 = defpackage.tpa.f(r4, r7)
            if (r4 == 0) goto L_0x00be
            goto L_0x00d7
        L_0x00d6:
            r13 = r0
        L_0x00d7:
            at5 r13 = (defpackage.at5) r13
            if (r13 == 0) goto L_0x00dd
            java.util.List r0 = r13.B0
        L_0x00dd:
            kpa r12 = new kpa
            r12.<init>(r11, r0)
            r8.X = r5
            java.lang.Object r11 = r2.a(r12, r8)
            if (r11 != r6) goto L_0x00eb
            r1 = r6
        L_0x00eb:
            return r1
        L_0x00ec:
            boolean r0 = r13 instanceof defpackage.ww2
            if (r0 == 0) goto L_0x00fd
            r0 = r13
            ww2 r0 = (defpackage.ww2) r0
            int r8 = r0.X
            r9 = r8 & r7
            if (r9 == 0) goto L_0x00fd
            int r8 = r8 - r7
            r0.X = r8
            goto L_0x0102
        L_0x00fd:
            ww2 r0 = new ww2
            r0.<init>(r11, r13)
        L_0x0102:
            java.lang.Object r11 = r0.o
            int r13 = r0.X
            if (r13 == 0) goto L_0x0114
            if (r13 != r5) goto L_0x010e
            defpackage.od2.a0(r11)
            goto L_0x012a
        L_0x010e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x0114:
            defpackage.od2.a0(r11)
            java.lang.Number r12 = (java.lang.Number) r12
            r12.longValue()
            qn3 r11 = r3.b
            r11.b()
            r0.X = r5
            java.lang.Object r11 = r2.a(r1, r0)
            if (r11 != r6) goto L_0x012a
            r1 = r6
        L_0x012a:
            return r1
        L_0x012b:
            boolean r0 = r13 instanceof defpackage.vw2
            if (r0 == 0) goto L_0x013c
            r0 = r13
            vw2 r0 = (defpackage.vw2) r0
            int r8 = r0.X
            r9 = r8 & r7
            if (r9 == 0) goto L_0x013c
            int r8 = r8 - r7
            r0.X = r8
            goto L_0x0141
        L_0x013c:
            vw2 r0 = new vw2
            r0.<init>(r11, r13)
        L_0x0141:
            java.lang.Object r11 = r0.o
            int r13 = r0.X
            if (r13 == 0) goto L_0x0153
            if (r13 != r5) goto L_0x014d
            defpackage.od2.a0(r11)
            goto L_0x0175
        L_0x014d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x0153:
            defpackage.od2.a0(r11)
            r11 = r12
            java.lang.Number r11 = (java.lang.Number) r11
            r11.longValue()
            w7c r11 = r3.H0
            j0e r11 = r11.a
            java.lang.Object r11 = r11.getValue()
            mt2 r11 = (defpackage.mt2) r11
            boolean r11 = defpackage.nx2.q(r3, r11)
            if (r11 == 0) goto L_0x0175
            r0.X = r5
            java.lang.Object r11 = r2.a(r12, r0)
            if (r11 != r6) goto L_0x0175
            r1 = r6
        L_0x0175:
            return r1
        L_0x0176:
            boolean r0 = r13 instanceof defpackage.qw2
            if (r0 == 0) goto L_0x0187
            r0 = r13
            qw2 r0 = (defpackage.qw2) r0
            int r8 = r0.X
            r9 = r8 & r7
            if (r9 == 0) goto L_0x0187
            int r8 = r8 - r7
            r0.X = r8
            goto L_0x018c
        L_0x0187:
            qw2 r0 = new qw2
            r0.<init>(r11, r13)
        L_0x018c:
            java.lang.Object r11 = r0.o
            int r13 = r0.X
            if (r13 == 0) goto L_0x019e
            if (r13 != r5) goto L_0x0198
            defpackage.od2.a0(r11)
            goto L_0x01c9
        L_0x0198:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x019e:
            defpackage.od2.a0(r11)
            r11 = r12
            mt2 r11 = (defpackage.mt2) r11
            bc7[] r13 = defpackage.nx2.X0
            r3.getClass()
            mt2 r13 = defpackage.mt2.c
            boolean r11 = defpackage.tpa.f(r11, r13)
            if (r11 != 0) goto L_0x01b3
            r11 = 0
            goto L_0x01be
        L_0x01b3:
            q0e r11 = r3.G0
            java.lang.Object r11 = r11.getValue()
            boolean r11 = defpackage.tpa.f(r11, r13)
            r11 = r11 ^ r5
        L_0x01be:
            if (r11 != 0) goto L_0x01c9
            r0.X = r5
            java.lang.Object r11 = r2.a(r12, r0)
            if (r11 != r6) goto L_0x01c9
            r1 = r6
        L_0x01c9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw2.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
