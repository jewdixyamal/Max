package defpackage;

/* renamed from: d06  reason: default package */
public final class d06 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public d06(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75) {
        this.a = je7;
        this.b = je72;
        this.c = je74;
        this.d = je73;
        this.e = je75;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x015c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.cu8 r19, java.lang.Long r20, kotlin.coroutines.Continuation r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof defpackage.b06
            if (r4 == 0) goto L_0x001c
            r4 = r3
            b06 r4 = (defpackage.b06) r4
            int r5 = r4.v0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.v0 = r5
        L_0x001a:
            r10 = r4
            goto L_0x0022
        L_0x001c:
            b06 r4 = new b06
            r4.<init>(r0, r3)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r3 = r10.t0
            tx3 r4 = defpackage.tx3.a
            int r5 = r10.v0
            java.lang.String r6 = ""
            r8 = 2
            r12 = 0
            r13 = 1
            if (r5 == 0) goto L_0x0067
            if (r5 == r13) goto L_0x004e
            if (r5 != r8) goto L_0x0046
            int r0 = r10.s0
            java.lang.Object r1 = r10.Z
            jqe r1 = (defpackage.jqe) r1
            java.lang.Comparable r2 = r10.Y
            e52 r2 = (defpackage.e52) r2
            cu8 r4 = r10.X
            d06 r5 = r10.o
            defpackage.od2.a0(r3)
            goto L_0x0163
        L_0x0046:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004e:
            java.lang.Object r0 = r10.Z
            e52 r0 = (defpackage.e52) r0
            java.lang.Comparable r1 = r10.Y
            java.lang.Long r1 = (java.lang.Long) r1
            cu8 r2 = r10.X
            d06 r5 = r10.o
            defpackage.od2.a0(r3)
            r7 = r3
            r3 = r0
            r0 = r5
            r17 = r2
            r2 = r1
            r1 = r17
            goto L_0x00f6
        L_0x0067:
            defpackage.od2.a0(r3)
            je7 r3 = r0.c
            java.lang.Object r3 = r3.getValue()
            iy2 r3 = (defpackage.iy2) r3
            long r14 = r1.t0
            jz2 r3 = (defpackage.jz2) r3
            w7c r3 = r3.m(r14)
            j0e r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            e52 r3 = (defpackage.e52) r3
            je7 r5 = r0.a
            java.lang.Object r5 = r5.getValue()
            q33 r5 = (defpackage.q33) r5
            hyc r5 = (defpackage.hyc) r5
            long r14 = r5.t()
            long r7 = r1.Y
            int r9 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r9 != 0) goto L_0x00a3
            int r6 = defpackage.r8a.R
            eqe r7 = new eqe
            r7.<init>(r6)
        L_0x009d:
            r8 = r2
            r14 = r3
            r3 = r7
            r2 = r12
            goto L_0x0125
        L_0x00a3:
            if (r2 == 0) goto L_0x00ad
            int r6 = defpackage.r8a.T
            eqe r7 = new eqe
            r7.<init>(r6)
            goto L_0x009d
        L_0x00ad:
            r9 = 4
            int r11 = r1.V0
            if (r11 != r9) goto L_0x00dd
            if (r3 == 0) goto L_0x00bc
            boolean r7 = r3.X()
            if (r7 != r13) goto L_0x00bc
            r7 = r13
            goto L_0x00bd
        L_0x00bc:
            r7 = r12
        L_0x00bd:
            int r8 = defpackage.r8a.S
            if (r3 == 0) goto L_0x00c6
            java.lang.String r9 = r3.q()
            goto L_0x00c7
        L_0x00c6:
            r9 = 0
        L_0x00c7:
            if (r9 != 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r6 = r9
        L_0x00cb:
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            gqe r9 = new gqe
            java.util.List r6 = defpackage.ys.m0(r6)
            r9.<init>(r8, r6)
            r8 = r2
            r14 = r3
            r2 = r7
            r3 = r9
            goto L_0x0125
        L_0x00dd:
            je7 r9 = r0.b
            java.lang.Object r9 = r9.getValue()
            ds3 r9 = (defpackage.ds3) r9
            r10.o = r0
            r10.X = r1
            r10.Y = r2
            r10.Z = r3
            r10.v0 = r13
            java.lang.Comparable r7 = r9.b(r7, r10)
            if (r7 != r4) goto L_0x00f6
            return r4
        L_0x00f6:
            uj3 r7 = (defpackage.uj3) r7
            if (r7 == 0) goto L_0x0102
            boolean r8 = r7.u()
            if (r8 != r13) goto L_0x0102
            r8 = r13
            goto L_0x0103
        L_0x0102:
            r8 = r12
        L_0x0103:
            int r9 = defpackage.r8a.S
            if (r7 == 0) goto L_0x010c
            java.lang.String r7 = r7.d()
            goto L_0x010d
        L_0x010c:
            r7 = 0
        L_0x010d:
            if (r7 != 0) goto L_0x0110
            goto L_0x0111
        L_0x0110:
            r6 = r7
        L_0x0111:
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            gqe r7 = new gqe
            java.util.List r6 = defpackage.ys.m0(r6)
            r7.<init>(r9, r6)
            r14 = r3
            r3 = r7
            r17 = r8
            r8 = r2
            r2 = r17
        L_0x0125:
            je7 r6 = r0.d
            java.lang.Object r6 = r6.getValue()
            kz r6 = (defpackage.kz) r6
            kqe r7 = defpackage.i4f.m
            du4 r9 = defpackage.du4.b
            long r15 = r7.g(r9)
            float r7 = defpackage.ck4.e(r15)
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r7 = r7 * r9
            int r9 = (int) r7
            r10.o = r0
            r10.X = r1
            r10.Y = r14
            r10.Z = r3
            r10.s0 = r2
            r5 = 2
            r10.v0 = r5
            r7 = 0
            r11 = 2
            r5 = r6
            r6 = r1
            java.lang.Object r5 = defpackage.kz.b(r5, r6, r7, r8, r9, r10, r11)
            if (r5 != r4) goto L_0x015d
            return r4
        L_0x015d:
            r4 = r1
            r1 = r3
            r3 = r5
            r5 = r0
            r0 = r2
            r2 = r14
        L_0x0163:
            ez r3 = (defpackage.ez) r3
            a06 r6 = new a06
            if (r0 == 0) goto L_0x016a
            r12 = r13
        L_0x016a:
            je7 r0 = r5.e
            java.lang.Object r0 = r0.getValue()
            cb6 r0 = (defpackage.cb6) r0
            java.util.List r4 = java.util.Collections.singletonList(r4)
            boolean r0 = r0.a(r2, r4)
            r6.<init>(r1, r12, r3, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d06.a(cu8, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(long r5, java.util.List r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.c06
            if (r0 == 0) goto L_0x0013
            r0 = r8
            c06 r0 = (defpackage.c06) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            c06 r0 = new c06
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.util.List r7 = r0.X
            d06 r4 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.od2.a0(r8)
            je7 r8 = r4.c
            java.lang.Object r8 = r8.getValue()
            iy2 r8 = (defpackage.iy2) r8
            r0.o = r4
            r0.X = r7
            r0.s0 = r3
            java.lang.Object r8 = r8.d(r5, r0)
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            e52 r8 = (defpackage.e52) r8
            r8.k0()
            java.lang.CharSequence r5 = r8.u0
            boolean r6 = r8.X()
            int r0 = r7.size()
            a06 r1 = new a06
            int r2 = defpackage.q8a.a
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
            java.lang.Object[] r5 = new java.lang.Object[]{r3, r5}
            cqe r3 = new cqe
            java.util.List r5 = defpackage.ys.m0(r5)
            r3.<init>(r5, r2, r0)
            je7 r4 = r4.e
            java.lang.Object r4 = r4.getValue()
            cb6 r4 = (defpackage.cb6) r4
            boolean r4 = r4.a(r8, r7)
            r5 = 0
            r1.<init>(r3, r6, r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d06.b(long, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
