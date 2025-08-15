package defpackage;

/* renamed from: px  reason: default package */
public final class px implements uu, pfc {
    public final long a;
    public final mg4 b;
    public final ome c;
    public final wmc d;
    public final jc2 e;
    public final xb9 f;
    public final uu g;
    public final wxc h;
    public final String i = px.class.getName();
    public sk6 j;

    public px(long j2, mg4 mg4, ome ome, wmc wmc, jc2 jc2, xb9 xb9, ix ixVar, wxc wxc) {
        this.a = j2;
        this.b = mg4;
        this.c = ome;
        this.d = wmc;
        this.e = jc2;
        this.f = xb9;
        this.g = ixVar;
        this.h = wxc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: e52} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: kec} */
    /* JADX WARNING: type inference failed for: r2v7, types: [dc2, kec, lec] */
    /* JADX WARNING: type inference failed for: r4v7, types: [kec, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v9, types: [kec, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Object, lec] */
    /* JADX WARNING: type inference failed for: r10v3, types: [java.lang.Object, lec] */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: type inference failed for: r2v33 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0221 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x026e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r36, int r38, int r39, long r40, long r42, kotlin.coroutines.Continuation r44) {
        /*
            r35 = this;
            r0 = r35
            r14 = r36
            r1 = r44
            boolean r2 = r1 instanceof defpackage.kx
            if (r2 == 0) goto L_0x001a
            r2 = r1
            kx r2 = (defpackage.kx) r2
            int r3 = r2.y0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.y0 = r3
        L_0x0018:
            r13 = r2
            goto L_0x0020
        L_0x001a:
            kx r2 = new kx
            r2.<init>(r0, r1)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r1 = r13.w0
            tx3 r12 = defpackage.tx3.a
            int r2 = r13.y0
            r10 = 3
            r11 = 2
            r9 = 1
            if (r2 == 0) goto L_0x0099
            if (r2 == r9) goto L_0x0079
            if (r2 == r11) goto L_0x0048
            if (r2 != r10) goto L_0x0040
            java.lang.Object r0 = r13.Y
            dc2 r0 = (defpackage.dc2) r0
            java.lang.Object r2 = r13.X
            kec r2 = (defpackage.kec) r2
            px r3 = r13.o
            defpackage.od2.a0(r1)
            goto L_0x0271
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            long r2 = r13.v0
            dc2 r4 = r13.u0
            lec r5 = r13.t0
            lec r6 = r13.s0
            kec r8 = r13.Z
            java.lang.Object r0 = r13.Y
            r9 = r0
            kec r9 = (defpackage.kec) r9
            java.lang.Object r0 = r13.X
            r11 = r0
            e52 r11 = (defpackage.e52) r11
            px r14 = r13.o
            defpackage.od2.a0(r1)     // Catch:{ all -> 0x006c }
            r0 = r14
            r14 = r2
            r3 = r13
            r2 = 0
            r32 = r12
            r12 = r11
            r11 = r32
            goto L_0x0227
        L_0x006c:
            r0 = move-exception
            r1 = r0
            r0 = r14
            r14 = r2
            r3 = r13
            r2 = 0
            r32 = r12
            r12 = r11
            r11 = r32
            goto L_0x0238
        L_0x0079:
            long r2 = r13.v0
            lec r0 = r13.t0
            lec r4 = r13.s0
            kec r5 = r13.Z
            java.lang.Object r6 = r13.Y
            kec r6 = (defpackage.kec) r6
            java.lang.Object r8 = r13.X
            e52 r8 = (defpackage.e52) r8
            px r9 = r13.o
            defpackage.od2.a0(r1)
            r7 = r5
            r10 = r6
            r11 = r12
            r6 = r4
            r12 = r8
            r8 = r0
            r4 = r2
            r3 = r13
            r2 = 0
            goto L_0x01e6
        L_0x0099:
            defpackage.od2.a0(r1)
            java.lang.Long r1 = new java.lang.Long
            long r2 = r0.a
            r1.<init>(r2)
            wmc r2 = r0.d
            java.lang.Object r2 = r2.a
            je7 r2 = (defpackage.je7) r2
            java.lang.Object r2 = r2.getValue()
            iy2 r2 = (defpackage.iy2) r2
            long r3 = r1.longValue()
            jz2 r2 = (defpackage.jz2) r2
            w7c r1 = r2.m(r3)
            j0e r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            r8 = r1
            e52 r8 = (defpackage.e52) r8
            java.lang.String r1 = r0.i
            if (r8 == 0) goto L_0x029e
            k92 r2 = r8.b
            long r3 = r2.a
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x00de
            wxc r3 = r0.h
            long r3 = r3.a()
            boolean r3 = r2.f(r3)
            if (r3 != 0) goto L_0x00de
            goto L_0x029e
        L_0x00de:
            kec r4 = new kec
            r4.<init>()
            r3 = r39
            r4.a = r3
            kec r3 = new kec
            r3.<init>()
            r7 = r38
            r3.a = r7
            lec r7 = new lec
            r7.<init>()
            r9 = r40
            r7.a = r9
            lec r10 = new lec
            r10.<init>()
            r17 = r12
            r11 = r42
            r10.a = r11
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r14)
            java.lang.String r9 = defpackage.nu0.G(r9)
            int r11 = r3.a
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            int r11 = r4.a
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r11)
            r20 = r13
            long r13 = r10.a
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r13)
            long r13 = r10.a
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r13)
            java.lang.Object[] r5 = new java.lang.Object[]{r9, r12, r5, r6, r11}
            java.lang.String r6 = "getMessages: %s, backwardCount: %s, forwardCount: %d, backwardLimit: %s, forwardLimit: %s"
            defpackage.hm9.m(r1, r6, r5)
            long r5 = r7.a
            r11 = 0
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x013e
            r7.a = r11
        L_0x013e:
            long r5 = r10.a
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x0146
            r10.a = r11
        L_0x0146:
            mg4 r1 = defpackage.mg4.DELAYED
            mg4 r15 = r0.b
            if (r15 != r1) goto L_0x015c
            int r1 = r4.a
            long r5 = r10.a
            int r9 = r3.a
            r4.a = r9
            long r11 = r7.a
            r10.a = r11
            r3.a = r1
            r7.a = r5
        L_0x015c:
            au r14 = new au
            int r6 = r4.a
            long r11 = r10.a
            int r9 = r3.a
            r13 = r9
            r38 = r10
            long r9 = r7.a
            java.lang.String r18 = ""
            r19 = 0
            long r1 = r2.a
            r21 = 1
            r22 = r1
            r1 = r14
            r5 = r3
            r2 = r22
            r24 = r4
            r25 = r5
            r4 = r36
            r27 = r7
            r26 = r8
            r7 = r11
            r10 = r9
            r12 = 1
            r9 = r13
            r28 = r38
            r13 = 3
            r29 = r17
            r12 = r19
            r30 = r20
            r13 = r21
            r31 = r14
            r14 = r18
            r1.<init>(r2, r4, r6, r7, r9, r10, r12, r13, r14, r15)
            lx r1 = new lx
            r3 = r31
            r2 = 0
            r1.<init>(r0, r3, r2)
            mqc r3 = new mqc
            r3.<init>(r1)
            mx r1 = new mx
            r1.<init>(r0, r2)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            ac r1 = defpackage.od2.S(r3, r4, r1)
            r3 = r30
            r3.o = r0
            r4 = r26
            r3.X = r4
            r5 = r24
            r3.Y = r5
            r6 = r25
            r3.Z = r6
            r7 = r27
            r3.s0 = r7
            r8 = r28
            r3.t0 = r8
            r9 = r36
            r3.v0 = r9
            r11 = 1
            r3.y0 = r11
            java.lang.Object r1 = defpackage.od2.A(r1, r3)
            r11 = r29
            if (r1 != r11) goto L_0x01da
            return r11
        L_0x01da:
            r12 = r4
            r32 = r9
            r9 = r0
            r10 = r5
            r4 = r32
            r34 = r7
            r7 = r6
            r6 = r34
        L_0x01e6:
            dc2 r1 = (defpackage.dc2) r1
            java.lang.String r0 = r9.i
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "response received "
            r13.<init>(r14)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            defpackage.hm9.m(r0, r13, new java.lang.Object[0])
            xb9 r0 = r9.f     // Catch:{ all -> 0x0235 }
            int r13 = defpackage.ft4.o     // Catch:{ all -> 0x0235 }
            kt4 r13 = defpackage.kt4.SECONDS     // Catch:{ all -> 0x0235 }
            r15 = r4
            r14 = 2
            long r4 = defpackage.z7.R(r14, r13)     // Catch:{ all -> 0x0232 }
            r3.o = r9     // Catch:{ all -> 0x0232 }
            r3.X = r12     // Catch:{ all -> 0x0232 }
            r3.Y = r10     // Catch:{ all -> 0x0232 }
            r3.Z = r7     // Catch:{ all -> 0x0232 }
            r3.s0 = r6     // Catch:{ all -> 0x0232 }
            r3.t0 = r8     // Catch:{ all -> 0x0232 }
            r3.u0 = r1     // Catch:{ all -> 0x0232 }
            r14 = r15
            r3.v0 = r14     // Catch:{ all -> 0x022a }
            r13 = 2
            r3.y0 = r13     // Catch:{ all -> 0x022a }
            java.lang.Object r0 = r0.l(r1, r4, r3)     // Catch:{ all -> 0x022a }
            if (r0 != r11) goto L_0x0222
            return r11
        L_0x0222:
            r4 = r1
            r5 = r8
            r0 = r9
            r9 = r10
            r8 = r7
        L_0x0227:
            r1 = r0
            r0 = r4
            goto L_0x0240
        L_0x022a:
            r0 = move-exception
        L_0x022b:
            r4 = r1
            r5 = r8
            r1 = r0
            r8 = r7
            r0 = r9
            r9 = r10
            goto L_0x0238
        L_0x0232:
            r0 = move-exception
            r14 = r15
            goto L_0x022b
        L_0x0235:
            r0 = move-exception
            r14 = r4
            goto L_0x022b
        L_0x0238:
            java.lang.String r7 = r0.i
            java.lang.String r10 = "fail to request missed contacts"
            defpackage.hm9.p(r7, r10, r1)
            goto L_0x0227
        L_0x0240:
            jx r4 = new jx
            r35 = r4
            r36 = r1
            r37 = r12
            r38 = r14
            r40 = r9
            r41 = r5
            r42 = r8
            r43 = r6
            r44 = r0
            r35.<init>(r36, r37, r38, r40, r41, r42, r43, r44)
            r3.o = r1
            r3.X = r9
            r3.Y = r0
            r3.Z = r2
            r3.s0 = r2
            r3.t0 = r2
            r3.u0 = r2
            r2 = 3
            r3.y0 = r2
            java.lang.Object r2 = defpackage.ema.C(r4, r3)
            if (r2 != r11) goto L_0x026f
            return r11
        L_0x026f:
            r3 = r1
            r2 = r9
        L_0x0271:
            sk6 r1 = r3.j
            if (r1 == 0) goto L_0x0292
            mg4 r1 = r3.b
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0292
            int r1 = r2.a
            if (r1 == 0) goto L_0x0292
            java.util.List r1 = r0.c
            int r1 = r1.size()
            r2 = 40
            if (r1 >= r2) goto L_0x0292
            sk6 r1 = r3.j
            if (r1 == 0) goto L_0x0292
            r1.b()
        L_0x0292:
            java.util.List r0 = r0.c
            int r0 = r0.size()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x029e:
            java.lang.String r0 = "getMessages: chat is null or chat.getServerId() == 0, return"
            defpackage.hm9.m(r1, r0, new java.lang.Object[0])
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px.a(long, int, int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(int r17, long r18, long r20, kotlin.coroutines.Continuation r22) {
        /*
            r16 = this;
            r10 = r16
            r0 = r22
            boolean r1 = r0 instanceof defpackage.ox
            if (r1 == 0) goto L_0x0018
            r1 = r0
            ox r1 = (defpackage.ox) r1
            int r2 = r1.u0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.u0 = r2
        L_0x0016:
            r11 = r1
            goto L_0x001e
        L_0x0018:
            ox r1 = new ox
            r1.<init>(r10, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r11.s0
            tx3 r12 = defpackage.tx3.a
            int r1 = r11.u0
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r2) goto L_0x003a
            if (r1 != r13) goto L_0x0032
            px r1 = r11.o
            defpackage.od2.a0(r0)
            goto L_0x0088
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            long r1 = r11.Y
            int r3 = r11.Z
            long r4 = r11.X
            px r6 = r11.o
            defpackage.od2.a0(r0)
            r14 = r4
            r10 = r6
            goto L_0x0070
        L_0x0048:
            defpackage.od2.a0(r0)
            r11.o = r10
            r14 = r18
            r11.X = r14
            r9 = r17
            r11.Z = r9
            r7 = r20
            r11.Y = r7
            r11.u0 = r2
            r3 = 0
            r5 = 0
            r0 = r16
            r1 = r18
            r4 = r17
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L_0x006c
            return r12
        L_0x006c:
            r3 = r17
            r1 = r20
        L_0x0070:
            uu r0 = r10.g
            r11.o = r10
            r11.u0 = r13
            r16 = r0
            r17 = r3
            r18 = r14
            r20 = r1
            r22 = r11
            java.lang.Object r0 = r16.b(r17, r18, r20, r22)
            if (r0 != r12) goto L_0x0087
            return r12
        L_0x0087:
            r1 = r10
        L_0x0088:
            java.util.List r0 = (java.util.List) r0
            java.lang.String r1 = r1.i
            int r2 = r0.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getMessages: result count: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.hm9.m(r1, r2, new java.lang.Object[0])
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px.b(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(sk6 sk6) {
        this.j = sk6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(int r19, long r20, long r22, kotlin.coroutines.Continuation r24) {
        /*
            r18 = this;
            r10 = r18
            r0 = r24
            boolean r1 = r0 instanceof defpackage.nx
            if (r1 == 0) goto L_0x0018
            r1 = r0
            nx r1 = (defpackage.nx) r1
            int r2 = r1.u0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.u0 = r2
        L_0x0016:
            r11 = r1
            goto L_0x001e
        L_0x0018:
            nx r1 = new nx
            r1.<init>(r10, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r11.s0
            tx3 r12 = defpackage.tx3.a
            int r1 = r11.u0
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r2) goto L_0x003a
            if (r1 != r13) goto L_0x0032
            px r1 = r11.o
            defpackage.od2.a0(r0)
            goto L_0x008f
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            long r1 = r11.Y
            int r3 = r11.Z
            long r4 = r11.X
            px r6 = r11.o
            defpackage.od2.a0(r0)
            r14 = r4
            r10 = r6
            goto L_0x0077
        L_0x0048:
            defpackage.od2.a0(r0)
            r11.o = r10
            r14 = r20
            r11.X = r14
            r9 = r19
            r11.Z = r9
            r7 = r22
            r11.Y = r7
            r11.u0 = r2
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r0 = r18
            r1 = r20
            r3 = r19
            r5 = r22
            r7 = r16
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L_0x0073
            return r12
        L_0x0073:
            r3 = r19
            r1 = r22
        L_0x0077:
            uu r0 = r10.g
            r11.o = r10
            r11.u0 = r13
            r18 = r0
            r19 = r3
            r20 = r14
            r22 = r1
            r24 = r11
            java.lang.Object r0 = r18.d(r19, r20, r22, r24)
            if (r0 != r12) goto L_0x008e
            return r12
        L_0x008e:
            r1 = r10
        L_0x008f:
            java.util.List r0 = (java.util.List) r0
            java.lang.String r1 = r1.i
            int r2 = r0.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getMessages: result count: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.hm9.m(r1, r2, new java.lang.Object[0])
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px.d(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
