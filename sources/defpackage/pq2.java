package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pq2  reason: default package */
public final class pq2 extends ffe implements e66 {
    public /* synthetic */ e52 X;
    public /* synthetic */ jqe Y;
    public /* synthetic */ jqe Z;
    public final /* synthetic */ rq2 s0;
    public final /* synthetic */ je7 t0;
    public final /* synthetic */ je7 u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pq2(rq2 rq2, je7 je7, je7 je72, Continuation continuation) {
        super(4, continuation);
        this.s0 = rq2;
        this.t0 = je7;
        this.u0 = je72;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        pq2 pq2 = new pq2(this.s0, this.t0, this.u0, (Continuation) obj4);
        pq2.X = (e52) obj;
        pq2.Y = (jqe) obj2;
        pq2.Z = (jqe) obj3;
        return pq2.o(e5f.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: od0} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0128, code lost:
        if ((!(r4 == null || r4.length() == 0)) != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0180, code lost:
        if (r2.u() == true) goto L_0x0184;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r30) {
        /*
            r29 = this;
            r0 = r29
            defpackage.od2.a0(r30)
            e52 r1 = r0.X
            jqe r2 = r0.Y
            jqe r3 = r0.Z
            rq2 r4 = r0.s0
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "toolbarParams update"
            defpackage.hm9.h0(r4, r5, new java.lang.Object[0])
            uj3 r4 = r1.l()
            if (r4 == 0) goto L_0x0025
            long r7 = r4.n()
            goto L_0x0027
        L_0x0025:
            r7 = 0
        L_0x0027:
            rq2 r4 = r0.s0
            w7c r4 = r4.Y0
            j0e r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            e52 r4 = (defpackage.e52) r4
            if (r4 == 0) goto L_0x003a
            k92 r4 = r4.b
            long r9 = r4.a
            goto L_0x003c
        L_0x003a:
            r9 = 0
        L_0x003c:
            rq2 r4 = r0.s0
            w7c r4 = r4.Y0
            j0e r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            e52 r4 = (defpackage.e52) r4
            r11 = 0
            if (r4 == 0) goto L_0x0054
            k10 r4 = r4.r()
            if (r4 == 0) goto L_0x0054
            java.lang.String r4 = r4.c
            goto L_0x0055
        L_0x0054:
            r4 = r11
        L_0x0055:
            uj3 r12 = r1.l()
            if (r12 == 0) goto L_0x0060
            boolean r12 = r12.s()
            goto L_0x0064
        L_0x0060:
            boolean r12 = r1.G()
        L_0x0064:
            je7 r13 = r0.t0
            java.lang.Object r13 = r13.getValue()
            q33 r13 = (defpackage.q33) r13
            hyc r13 = (defpackage.hyc) r13
            long r13 = r13.t()
            k92 r15 = r1.b
            boolean r13 = r15.f(r13)
            r14 = 1
            r12 = r12 ^ r14
            boolean r15 = r1.P()
            r16 = 0
            if (r15 == 0) goto L_0x0096
            je7 r15 = r0.u0
            java.lang.Object r15 = r15.getValue()
            qe5 r15 = (defpackage.qe5) r15
            se5 r15 = (defpackage.se5) r15
            boolean r15 = r15.r()
            if (r15 == 0) goto L_0x0096
            if (r12 == 0) goto L_0x0096
            r15 = r14
            goto L_0x0098
        L_0x0096:
            r15 = r16
        L_0x0098:
            boolean r17 = r1.K()
            if (r17 == 0) goto L_0x00b8
            pka r4 = new pka
            vka r5 = new vka
            int r6 = defpackage.woc.O0
            rq2 r7 = r0.s0
            mq2 r8 = new mq2
            r9 = 0
            r8.<init>(r7, r9)
            r5.<init>(r6, r8)
            r4.<init>(r11, r5)
        L_0x00b2:
            r18 = r2
        L_0x00b4:
            r27 = r4
            goto L_0x013f
        L_0x00b8:
            if (r13 == 0) goto L_0x00cf
            pka r4 = new pka
            vka r5 = new vka
            int r6 = defpackage.woc.O0
            rq2 r7 = r0.s0
            mq2 r8 = new mq2
            r9 = 1
            r8.<init>(r7, r9)
            r5.<init>(r6, r8)
            r4.<init>(r11, r5)
            goto L_0x00b2
        L_0x00cf:
            vka r11 = new vka
            int r14 = defpackage.woc.t0
            rq2 r5 = r0.s0
            xa1 r6 = new xa1
            r18 = r2
            r2 = 2
            r6.<init>((java.lang.Object) r5, (boolean) r12, (int) r2)
            r11.<init>(r14, r6)
            boolean r2 = r1.H()
            if (r2 == 0) goto L_0x00e8
        L_0x00e6:
            r2 = 0
            goto L_0x0138
        L_0x00e8:
            rq2 r2 = r0.s0
            boolean r2 = r2.w()
            if (r2 == 0) goto L_0x0108
            r5 = 0
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0108
            if (r12 == 0) goto L_0x0108
            vka r2 = new vka
            int r4 = defpackage.woc.c0
            rq2 r5 = r0.s0
            nq2 r6 = new nq2
            r9 = 0
            r6.<init>(r5, r7, r9)
            r2.<init>(r4, r6)
            goto L_0x0138
        L_0x0108:
            boolean r2 = r1.J()
            if (r2 == 0) goto L_0x00e6
            if (r15 == 0) goto L_0x00e6
            r5 = 0
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x012a
            if (r4 == 0) goto L_0x0123
            int r2 = r4.length()
            if (r2 != 0) goto L_0x011f
            goto L_0x0123
        L_0x011f:
            r17 = r16
            r2 = 1
            goto L_0x0126
        L_0x0123:
            r2 = 1
            r17 = 1
        L_0x0126:
            r5 = r17 ^ 1
            if (r5 == 0) goto L_0x00e6
        L_0x012a:
            vka r2 = new vka
            int r5 = defpackage.woc.c0
            rq2 r6 = r0.s0
            oq2 r7 = new oq2
            r7.<init>(r6, r9, r4)
            r2.<init>(r5, r7)
        L_0x0138:
            pka r4 = new pka
            r4.<init>(r2, r11)
            goto L_0x00b4
        L_0x013f:
            if (r13 == 0) goto L_0x014b
            int r2 = defpackage.oda.y0
            eqe r3 = new eqe
            r3.<init>(r2)
        L_0x0148:
            r23 = r3
            goto L_0x0169
        L_0x014b:
            boolean r2 = r1.H()
            if (r2 == 0) goto L_0x0159
            int r2 = defpackage.oda.u
            eqe r3 = new eqe
            r3.<init>(r2)
            goto L_0x0148
        L_0x0159:
            if (r3 != 0) goto L_0x0148
            if (r18 != 0) goto L_0x0167
            java.lang.CharSequence r2 = r1.p()
            iqe r3 = new iqe
            r3.<init>(r2)
            goto L_0x0148
        L_0x0167:
            r23 = r18
        L_0x0169:
            long r20 = r1.f()
            if (r13 != 0) goto L_0x0187
            boolean r2 = r1.X()
            if (r2 != 0) goto L_0x0183
            uj3 r2 = r1.l()
            if (r2 == 0) goto L_0x0187
            boolean r2 = r2.u()
            r3 = 1
            if (r2 != r3) goto L_0x0187
            goto L_0x0184
        L_0x0183:
            r3 = 1
        L_0x0184:
            r24 = r3
            goto L_0x0189
        L_0x0187:
            r24 = r16
        L_0x0189:
            boolean r2 = r1.K()
            if (r2 == 0) goto L_0x0194
            java.lang.String r2 = ""
        L_0x0191:
            r26 = r2
            goto L_0x019a
        L_0x0194:
            r1.l0()
            java.lang.CharSequence r2 = r1.x0
            goto L_0x0191
        L_0x019a:
            r1.k0()
            java.lang.CharSequence r2 = r1.u0
            kk0 r3 = defpackage.kk0.b
            jk0 r4 = defpackage.jk0.a
            java.lang.String r25 = r1.g(r3, r4)
            rq2 r0 = r0.s0
            y7g r0 = r0.v0
            boolean r1 = r1.K()
            if (r1 == 0) goto L_0x01bf
            java.lang.Object r0 = r0.c
            je7 r0 = (defpackage.je7) r0
            java.lang.Object r0 = r0.getValue()
            r11 = r0
            od0 r11 = (defpackage.od0) r11
            r28 = r11
            goto L_0x01c4
        L_0x01bf:
            r0.getClass()
            r28 = 0
        L_0x01c4:
            ls2 r0 = new ls2
            r19 = r0
            r22 = r2
            r19.<init>(r20, r22, r23, r24, r25, r26, r27, r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pq2.o(java.lang.Object):java.lang.Object");
    }
}
