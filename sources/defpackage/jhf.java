package defpackage;

/* renamed from: jhf  reason: default package */
public final class jhf {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;

    public jhf(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
        this.f = je76;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c3, code lost:
        r5 = r3.z0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.e52 r30, defpackage.o00 r31, kotlin.coroutines.Continuation r32) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r32
            boolean r4 = r3 instanceof defpackage.bhf
            if (r4 == 0) goto L_0x001c
            r4 = r3
            bhf r4 = (defpackage.bhf) r4
            int r5 = r4.u0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.u0 = r5
        L_0x001a:
            r12 = r4
            goto L_0x0022
        L_0x001c:
            bhf r4 = new bhf
            r4.<init>(r0, r3)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r3 = r12.s0
            tx3 r4 = defpackage.tx3.a
            int r5 = r12.u0
            e5f r13 = defpackage.e5f.a
            r6 = 0
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r5 == 0) goto L_0x006a
            if (r5 == r10) goto L_0x0066
            if (r5 == r9) goto L_0x0055
            if (r5 == r8) goto L_0x0046
            if (r5 != r7) goto L_0x003e
            defpackage.od2.a0(r3)
            goto L_0x0163
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            l20 r0 = r12.Z
            java.lang.Object r1 = r12.Y
            cu8 r1 = (defpackage.cu8) r1
            e52 r2 = r12.X
            jhf r4 = r12.o
            defpackage.od2.a0(r3)
            goto L_0x00fd
        L_0x0055:
            java.lang.Object r0 = r12.Y
            wgf r0 = (defpackage.wgf) r0
            e52 r1 = r12.X
            jhf r2 = r12.o
            defpackage.od2.a0(r3)
            r28 = r2
            r2 = r0
            r0 = r28
            goto L_0x00bf
        L_0x0066:
            defpackage.od2.a0(r3)
            goto L_0x0099
        L_0x006a:
            defpackage.od2.a0(r3)
            boolean r3 = r2 instanceof defpackage.wgf
            if (r3 == 0) goto L_0x0074
            wgf r2 = (defpackage.wgf) r2
            goto L_0x0075
        L_0x0074:
            r2 = r6
        L_0x0075:
            if (r2 != 0) goto L_0x0078
            return r13
        L_0x0078:
            boolean r3 = r2.e()
            if (r3 == 0) goto L_0x009a
            je7 r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            r5 = r0
            k6f r5 = (defpackage.k6f) r5
            long r6 = r1.a
            long r8 = r2.a
            java.lang.String r0 = r2.b
            d20 r11 = defpackage.d20.b
            r12.u0 = r10
            r10 = r0
            java.lang.Object r0 = r5.a(r6, r8, r10, r11, r12)
            if (r0 != r4) goto L_0x0099
            return r4
        L_0x0099:
            return r13
        L_0x009a:
            b00 r3 = r2.e
            boolean r3 = r3 instanceof defpackage.yz
            if (r3 == 0) goto L_0x014e
            boolean r3 = r2.e()
            if (r3 != 0) goto L_0x014e
            je7 r3 = r0.c
            java.lang.Object r3 = r3.getValue()
            r79 r3 = (defpackage.r79) r3
            long r10 = r2.a
            r12.o = r0
            r12.X = r1
            r12.Y = r2
            r12.u0 = r9
            java.lang.Object r3 = r3.a(r10, r12)
            if (r3 != r4) goto L_0x00bf
            return r4
        L_0x00bf:
            cu8 r3 = (defpackage.cu8) r3
            if (r3 == 0) goto L_0x00cf
            k8g r5 = r3.z0
            if (r5 == 0) goto L_0x00cf
            java.lang.String r7 = r2.b
            l20 r5 = r5.j(r7)
            r14 = r5
            goto L_0x00d0
        L_0x00cf:
            r14 = r6
        L_0x00d0:
            if (r3 == 0) goto L_0x012d
            if (r14 != 0) goto L_0x00d5
            goto L_0x012d
        L_0x00d5:
            je7 r2 = r0.a
            java.lang.Object r2 = r2.getValue()
            r5 = r2
            k6f r5 = (defpackage.k6f) r5
            long r6 = r1.a
            long r9 = r3.b
            java.lang.String r2 = r14.r
            d20 r11 = defpackage.d20.X
            r12.o = r0
            r12.X = r1
            r12.Y = r3
            r12.Z = r14
            r12.u0 = r8
            r8 = r9
            r10 = r2
            java.lang.Object r2 = r5.a(r6, r8, r10, r11, r12)
            if (r2 != r4) goto L_0x00f9
            return r4
        L_0x00f9:
            r4 = r0
            r2 = r1
            r1 = r3
            r0 = r14
        L_0x00fd:
            je7 r3 = r4.d
            java.lang.Object r3 = r3.getValue()
            pk r3 = (defpackage.pk) r3
            k20 r4 = r0.d
            long r5 = r4.a
            k92 r2 = r2.b
            long r7 = r2.a
            long r9 = r1.c
            long r1 = r1.b
            java.lang.String r0 = r0.r
            java.lang.String r4 = r4.m
            r14 = r3
            k4a r14 = (defpackage.k4a) r14
            r25 = 1
            r26 = 0
            r15 = 0
            r16 = r5
            r18 = r7
            r20 = r9
            r22 = r1
            r24 = r0
            r27 = r4
            r14.L(r15, r16, r18, r20, r22, r24, r25, r26, r27)
            goto L_0x0163
        L_0x012d:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x013a
            goto L_0x014d
        L_0x013a:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x014d
            us7 r3 = defpackage.us7.s0
            java.lang.String r2 = r2.b
            java.lang.String r4 = "Couldn't get attach with id = "
            java.lang.String r2 = defpackage.wg0.i(r4, r2)
            r1.d(r3, r0, r2, r6)
        L_0x014d:
            return r13
        L_0x014e:
            b00 r3 = r2.e
            boolean r3 = r3 instanceof defpackage.zz
            if (r3 == 0) goto L_0x0163
            boolean r3 = r2.e()
            if (r3 != 0) goto L_0x0163
            r12.u0 = r7
            java.lang.Object r0 = r0.b(r1, r2, r6, r12)
            if (r0 != r4) goto L_0x0163
            return r4
        L_0x0163:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhf.a(e52, o00, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ba A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.e52 r16, defpackage.wgf r17, java.lang.Float r18, kotlin.coroutines.Continuation r19) {
        /*
            r15 = this;
            r0 = r15
            r4 = r17
            r1 = r19
            boolean r2 = r1 instanceof defpackage.chf
            if (r2 == 0) goto L_0x0019
            r2 = r1
            chf r2 = (defpackage.chf) r2
            int r3 = r2.t0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r3 & r5
            if (r6 == 0) goto L_0x0019
            int r3 = r3 - r5
            r2.t0 = r3
        L_0x0017:
            r8 = r2
            goto L_0x001f
        L_0x0019:
            chf r2 = new chf
            r2.<init>(r15, r1)
            goto L_0x0017
        L_0x001f:
            java.lang.Object r1 = r8.Z
            tx3 r9 = defpackage.tx3.a
            int r2 = r8.t0
            e5f r10 = defpackage.e5f.a
            r3 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r11 = 1
            r12 = 0
            if (r2 == 0) goto L_0x0061
            if (r2 == r11) goto L_0x0055
            if (r2 == r7) goto L_0x0050
            if (r2 == r6) goto L_0x004b
            if (r2 == r5) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            defpackage.od2.a0(r1)
            goto L_0x0135
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            defpackage.od2.a0(r1)
            goto L_0x0105
        L_0x004b:
            defpackage.od2.a0(r1)
            goto L_0x0121
        L_0x0050:
            defpackage.od2.a0(r1)
            goto L_0x00ba
        L_0x0055:
            long r2 = r8.Y
            wgf r0 = r8.X
            jhf r4 = r8.o
            defpackage.od2.a0(r1)
            r5 = r2
            r3 = r4
            goto L_0x00a8
        L_0x0061:
            defpackage.od2.a0(r1)
            r1 = r16
            k92 r1 = r1.b
            long r13 = r1.a
            ijf r1 = r17.d()
            je7 r2 = r0.f
            if (r1 == 0) goto L_0x00bb
            ijf r1 = r17.d()
            if (r1 == 0) goto L_0x0083
            long r5 = r4.a
            long r3 = r1.a
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0083
            r4 = r17
            goto L_0x00bb
        L_0x0083:
            java.lang.Object r1 = r2.getValue()
            kke r1 = (defpackage.kke) r1
            w9a r1 = (defpackage.w9a) r1
            cx7 r1 = r1.c()
            dhf r2 = new dhf
            r2.<init>(r15, r12)
            r8.o = r0
            r4 = r17
            r8.X = r4
            r8.Y = r13
            r8.t0 = r11
            java.lang.Object r1 = defpackage.j47.t0(r1, r2, r8)
            if (r1 != r9) goto L_0x00a5
            return r9
        L_0x00a5:
            r3 = r0
            r0 = r4
            r5 = r13
        L_0x00a8:
            nif r4 = r3.d()
            r8.o = r12
            r8.X = r12
            r8.t0 = r7
            r7 = r0
            java.lang.Object r0 = r3.c(r4, r5, r7, r8)
            if (r0 != r9) goto L_0x00ba
            return r9
        L_0x00ba:
            return r10
        L_0x00bb:
            ijf r1 = r17.d()
            if (r1 == 0) goto L_0x00c4
            int r1 = r1.X
            goto L_0x00c5
        L_0x00c4:
            r1 = 0
        L_0x00c5:
            r3 = -1
            if (r1 != 0) goto L_0x00ca
            r1 = r3
            goto L_0x00d2
        L_0x00ca:
            int[] r5 = defpackage.ahf.$EnumSwitchMapping$0
            int r1 = defpackage.au1.s(r1)
            r1 = r5[r1]
        L_0x00d2:
            if (r1 == r3) goto L_0x0122
            if (r1 == r11) goto L_0x0106
            if (r1 == r7) goto L_0x0106
            r3 = 3
            if (r1 == r3) goto L_0x00e8
            r3 = 4
            if (r1 == r3) goto L_0x00e8
            r3 = 5
            if (r1 != r3) goto L_0x00e2
            goto L_0x0122
        L_0x00e2:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00e8:
            java.lang.Object r1 = r2.getValue()
            kke r1 = (defpackage.kke) r1
            w9a r1 = (defpackage.w9a) r1
            cx7 r1 = r1.c()
            fhf r2 = new fhf
            r3 = r18
            r2.<init>(r3, r15, r12)
            r0 = 4
            r8.t0 = r0
            java.lang.Object r0 = defpackage.j47.t0(r1, r2, r8)
            if (r0 != r9) goto L_0x0105
            return r9
        L_0x0105:
            return r10
        L_0x0106:
            java.lang.Object r1 = r2.getValue()
            kke r1 = (defpackage.kke) r1
            w9a r1 = (defpackage.w9a) r1
            cx7 r1 = r1.c()
            ehf r2 = new ehf
            r2.<init>(r15, r12)
            r0 = 3
            r8.t0 = r0
            java.lang.Object r0 = defpackage.j47.t0(r1, r2, r8)
            if (r0 != r9) goto L_0x0121
            return r9
        L_0x0121:
            return r10
        L_0x0122:
            nif r1 = r15.d()
            r2 = 5
            r8.t0 = r2
            r0 = r15
            r2 = r13
            r4 = r17
            r5 = r8
            java.lang.Object r0 = r0.c(r1, r2, r4, r5)
            if (r0 != r9) goto L_0x0135
            return r9
        L_0x0135:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhf.b(e52, wgf, java.lang.Float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0125 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.nif r21, long r22, defpackage.wgf r24, kotlin.coroutines.Continuation r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r24
            r3 = r25
            boolean r4 = r3 instanceof defpackage.ghf
            if (r4 == 0) goto L_0x001b
            r4 = r3
            ghf r4 = (defpackage.ghf) r4
            int r5 = r4.v0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.v0 = r5
            goto L_0x0020
        L_0x001b:
            ghf r4 = new ghf
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.t0
            tx3 r12 = defpackage.tx3.a
            int r5 = r4.v0
            e5f r13 = defpackage.e5f.a
            r6 = 1
            r14 = 0
            java.lang.String r15 = ")"
            r11 = 4
            r7 = 3
            r8 = 2
            if (r5 == 0) goto L_0x006c
            if (r5 == r6) goto L_0x0068
            if (r5 == r8) goto L_0x0059
            if (r5 == r7) goto L_0x0046
            if (r5 != r11) goto L_0x003e
            defpackage.od2.a0(r3)
            goto L_0x0184
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            cu8 r0 = r4.Z
            wgf r1 = r4.Y
            nif r2 = r4.X
            jhf r5 = r4.o
            defpackage.od2.a0(r3)
            r14 = r11
            r19 = r2
            r2 = r1
            r1 = r19
            goto L_0x012c
        L_0x0059:
            long r0 = r4.s0
            wgf r2 = r4.Y
            nif r5 = r4.X
            jhf r6 = r4.o
            defpackage.od2.a0(r3)
            r9 = r0
            r1 = r5
            r0 = r6
            goto L_0x00cb
        L_0x0068:
            defpackage.od2.a0(r3)
            goto L_0x00ad
        L_0x006c:
            defpackage.od2.a0(r3)
            ijf r3 = r24.d()
            if (r3 == 0) goto L_0x0078
            int r3 = r3.X
            goto L_0x0079
        L_0x0078:
            r3 = 0
        L_0x0079:
            if (r3 != r6) goto L_0x007c
            return r13
        L_0x007c:
            je7 r3 = r0.e
            java.lang.Object r3 = r3.getValue()
            rff r3 = (defpackage.rff) r3
            java.lang.String r5 = r2.b
            ief r3 = r3.e
            r3.getClass()
            gef r3 = defpackage.ief.a(r5)
            if (r3 == 0) goto L_0x00ae
            je7 r0 = r0.f
            java.lang.Object r0 = r0.getValue()
            kke r0 = (defpackage.kke) r0
            w9a r0 = (defpackage.w9a) r0
            cx7 r0 = r0.c()
            hhf r5 = new hhf
            r5.<init>(r1, r2, r3, r14)
            r4.v0 = r6
            java.lang.Object r0 = defpackage.j47.t0(r0, r5, r4)
            if (r0 != r12) goto L_0x00ad
            return r12
        L_0x00ad:
            return r13
        L_0x00ae:
            je7 r3 = r0.c
            java.lang.Object r3 = r3.getValue()
            r79 r3 = (defpackage.r79) r3
            long r5 = r2.a
            r4.o = r0
            r4.X = r1
            r4.Y = r2
            r9 = r22
            r4.s0 = r9
            r4.v0 = r8
            java.lang.Object r3 = r3.a(r5, r4)
            if (r3 != r12) goto L_0x00cb
            return r12
        L_0x00cb:
            cu8 r3 = (defpackage.cu8) r3
            if (r3 != 0) goto L_0x00d0
            return r13
        L_0x00d0:
            k8g r5 = r3.z0
            if (r5 == 0) goto L_0x0184
            java.lang.String r6 = r2.b
            l20 r6 = r5.j(r6)
            if (r6 != 0) goto L_0x00de
            goto L_0x0184
        L_0x00de:
            java.lang.Class r5 = r1.getClass()
            java.lang.String r5 = r5.getName()
            ir6 r8 = defpackage.hm9.m
            if (r8 != 0) goto L_0x00eb
            goto L_0x0103
        L_0x00eb:
            boolean r16 = r8.c()
            if (r16 == 0) goto L_0x0103
            us7 r11 = defpackage.us7.X
            r20 = r8
            long r7 = r3.b
            java.lang.String r14 = "Start video content fetching (msgId = "
            java.lang.String r7 = defpackage.ey8.i(r7, r14, r15)
            r14 = r20
            r8 = 0
            r14.d(r11, r5, r7, r8)
        L_0x0103:
            je7 r5 = r0.e
            java.lang.Object r5 = r5.getValue()
            rff r5 = (defpackage.rff) r5
            long r7 = r3.c
            r4.o = r0
            r4.X = r1
            r4.Y = r2
            r4.Z = r3
            r11 = 3
            r4.v0 = r11
            r17 = r7
            r7 = r9
            r9 = r17
            r14 = 4
            r11 = r4
            java.lang.Object r5 = r5.c(r6, r7, r9, r11)
            if (r5 != r12) goto L_0x0126
            return r12
        L_0x0126:
            r19 = r5
            r5 = r0
            r0 = r3
            r3 = r19
        L_0x012c:
            gef r3 = (defpackage.gef) r3
            if (r3 != 0) goto L_0x0152
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x013d
            goto L_0x0151
        L_0x013d:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0151
            us7 r3 = defpackage.us7.Z
            long r4 = r0.b
            java.lang.String r0 = "Something went wrong with video fetching (msgId = "
            java.lang.String r0 = defpackage.ey8.i(r4, r0, r15)
            r4 = 0
            r2.d(r3, r1, r0, r4)
        L_0x0151:
            return r13
        L_0x0152:
            je7 r5 = r5.f
            java.lang.Object r5 = r5.getValue()
            kke r5 = (defpackage.kke) r5
            w9a r5 = (defpackage.w9a) r5
            cx7 r5 = r5.c()
            ihf r6 = new ihf
            r7 = 0
            r20 = r6
            r21 = r1
            r22 = r0
            r23 = r2
            r24 = r3
            r25 = r7
            r20.<init>(r21, r22, r23, r24, r25)
            r0 = 0
            r4.o = r0
            r4.X = r0
            r4.Y = r0
            r4.Z = r0
            r4.v0 = r14
            java.lang.Object r0 = defpackage.j47.t0(r5, r6, r4)
            if (r0 != r12) goto L_0x0184
            return r12
        L_0x0184:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhf.c(nif, long, wgf, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final nif d() {
        return (nif) this.b.getValue();
    }
}
