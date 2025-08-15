package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ik1  reason: default package */
public final class ik1 extends ffe implements g66 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ Comparable Z;
    public /* synthetic */ Object s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ pnf u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ik1(pnf pnf, Continuation continuation, int i) {
        super(5, continuation);
        this.X = i;
        this.u0 = pnf;
    }

    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.X) {
            case 0:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ik1 ik1 = new ik1((el1) this.u0, (Continuation) obj5, 0);
                ik1.Z = (Long) obj;
                ik1.s0 = (la1) obj2;
                ik1.Y = booleanValue;
                ik1.t0 = (CharSequence) obj4;
                e5f e5f = e5f.a;
                ik1.o(e5f);
                return e5f;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                ik1 ik12 = new ik1((n59) this.u0, (Continuation) obj5, 1);
                ik12.Y = booleanValue2;
                ik12.Z = (e52) obj2;
                ik12.s0 = (z2e) obj3;
                ik12.t0 = (uj3) obj4;
                return ik12.o(e5f.a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018a, code lost:
        if (r9 == 0) goto L_0x018c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 0
            pnf r1 = r14.u0
            int r2 = r14.X
            switch(r2) {
                case 0: goto L_0x010a;
                default: goto L_0x0008;
            }
        L_0x0008:
            defpackage.od2.a0(r15)
            boolean r15 = r14.Y
            java.lang.Comparable r2 = r14.Z
            e52 r2 = (defpackage.e52) r2
            java.lang.Object r3 = r14.s0
            z2e r3 = (defpackage.z2e) r3
            java.lang.Object r14 = r14.t0
            uj3 r14 = (defpackage.uj3) r14
            jk0 r4 = defpackage.jk0.a
            kk0 r5 = defpackage.kk0.c
            n59 r1 = (defpackage.n59) r1
            if (r15 == 0) goto L_0x004a
            q33 r6 = r1.y0
            hyc r6 = (defpackage.hyc) r6
            long r6 = r6.t()
            k92 r8 = r2.b
            boolean r6 = r8.f(r6)
            if (r6 == 0) goto L_0x004a
            zz4 r0 = new zz4
            java.lang.String r14 = r2.g(r5, r4)
            int r15 = defpackage.oda.v0
            eqe r1 = new eqe
            r1.<init>(r15)
            int r15 = defpackage.oda.u0
            eqe r2 = new eqe
            r2.<init>(r15)
            r0.<init>(r14, r1, r2)
            goto L_0x0109
        L_0x004a:
            r6 = 64
            if (r15 == 0) goto L_0x009f
            boolean r7 = r2.W()
            if (r7 == 0) goto L_0x009f
            k92 r7 = r2.b
            fm5 r7 = r7.J
            boolean r7 = r7.b(r6)
            if (r7 != 0) goto L_0x009f
            if (r14 == 0) goto L_0x0067
            ql3 r14 = r14.a
            pl3 r14 = r14.c
            ml3 r14 = r14.w
            goto L_0x0068
        L_0x0067:
            r14 = r0
        L_0x0068:
            int r15 = defpackage.oda.d
            eqe r12 = new eqe
            r12.<init>(r15)
            int r15 = defpackage.oda.c
            eqe r13 = new eqe
            r13.<init>(r15)
            if (r14 == 0) goto L_0x007f
            xz4 r14 = defpackage.n59.q(r1, r14, r2, r12, r13)
        L_0x007c:
            r0 = r14
            goto L_0x0109
        L_0x007f:
            bc7[] r14 = defpackage.n59.D1
            r1.getClass()
            java.lang.String r7 = r2.g(r5, r4)
            uj3 r14 = r2.l()
            if (r14 == 0) goto L_0x0092
            java.lang.CharSequence r0 = r14.m()
        L_0x0092:
            r8 = r0
            long r9 = r2.f()
            xz4 r14 = new xz4
            r11 = 0
            r6 = r14
            r6.<init>(r7, r8, r9, r11, r12, r13)
            goto L_0x007c
        L_0x009f:
            if (r15 == 0) goto L_0x00f0
            boolean r7 = r2.H()
            if (r7 == 0) goto L_0x00f0
            k92 r7 = r2.b
            fm5 r7 = r7.J
            boolean r6 = r7.b(r6)
            if (r6 != 0) goto L_0x00f0
            if (r14 == 0) goto L_0x00ba
            ql3 r14 = r14.a
            pl3 r14 = r14.c
            ml3 r14 = r14.w
            goto L_0x00bb
        L_0x00ba:
            r14 = r0
        L_0x00bb:
            int r15 = defpackage.oda.b
            eqe r12 = new eqe
            r12.<init>(r15)
            int r15 = defpackage.oda.a
            eqe r13 = new eqe
            r13.<init>(r15)
            if (r14 == 0) goto L_0x00d0
            xz4 r14 = defpackage.n59.q(r1, r14, r2, r12, r13)
            goto L_0x007c
        L_0x00d0:
            bc7[] r14 = defpackage.n59.D1
            r1.getClass()
            java.lang.String r7 = r2.g(r5, r4)
            uj3 r14 = r2.l()
            if (r14 == 0) goto L_0x00e3
            java.lang.CharSequence r0 = r14.m()
        L_0x00e3:
            r8 = r0
            long r9 = r2.f()
            xz4 r14 = new xz4
            r11 = 0
            r6 = r14
            r6.<init>(r7, r8, r9, r11, r12, r13)
            goto L_0x007c
        L_0x00f0:
            if (r15 == 0) goto L_0x0109
            boolean r14 = r2.M()
            if (r14 == 0) goto L_0x0109
            boolean r14 = r2.H()
            if (r14 != 0) goto L_0x0109
            boolean r14 = r2.G()
            if (r14 != 0) goto L_0x0109
            yz4 r0 = new yz4
            r0.<init>(r3)
        L_0x0109:
            return r0
        L_0x010a:
            defpackage.od2.a0(r15)
            java.lang.Comparable r15 = r14.Z
            java.lang.Long r15 = (java.lang.Long) r15
            java.lang.Object r2 = r14.s0
            la1 r2 = (defpackage.la1) r2
            boolean r3 = r14.Y
            java.lang.Object r14 = r14.t0
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            el1 r1 = (defpackage.el1) r1
            q0e r4 = r1.J0
        L_0x0121:
            java.lang.Object r5 = r4.getValue()
            r6 = r5
            cn1 r6 = (defpackage.cn1) r6
            m31 r7 = r2.f
            if (r7 == 0) goto L_0x012f
            java.lang.CharSequence r7 = r7.b
            goto L_0x0130
        L_0x012f:
            r7 = r0
        L_0x0130:
            boolean r8 = r1.u()
            boolean r9 = r2.d
            i95 r10 = r2.e
            boolean r11 = r2.m
            boolean r12 = r2.g
            bn1 r13 = r1.Y
            if (r8 == 0) goto L_0x0198
            r13.getClass()
            java.lang.String r8 = defpackage.bn1.e(r15)
            java.lang.String r9 = r13.f(r12, r9, r11, r10)
            if (r9 == 0) goto L_0x0153
            cxe r8 = new cxe
            r8.<init>(r9)
            goto L_0x0193
        L_0x0153:
            if (r12 == 0) goto L_0x0162
            boolean r9 = r10 instanceof defpackage.h95
            if (r9 == 0) goto L_0x0162
            android.content.Context r8 = r13.a
            int r9 = defpackage.b8a.f0
            java.lang.String r8 = r8.getString(r9)
            goto L_0x018d
        L_0x0162:
            if (r12 == 0) goto L_0x0184
            if (r8 == 0) goto L_0x0182
            int r9 = r8.length()
            if (r9 != 0) goto L_0x016d
            goto L_0x0182
        L_0x016d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = " · "
            r9.append(r8)
            r9.append(r14)
            java.lang.String r8 = r9.toString()
            goto L_0x018d
        L_0x0182:
            r8 = r14
            goto L_0x018d
        L_0x0184:
            if (r8 == 0) goto L_0x018c
            int r9 = r8.length()
            if (r9 != 0) goto L_0x018d
        L_0x018c:
            r8 = r0
        L_0x018d:
            bxe r9 = new bxe
            r9.<init>(r8)
            r8 = r9
        L_0x0193:
            java.lang.CharSequence r8 = r8.q()
            goto L_0x019c
        L_0x0198:
            java.lang.String r8 = r13.f(r12, r9, r11, r10)
        L_0x019c:
            if (r8 != 0) goto L_0x01a5
            r13.getClass()
            java.lang.String r8 = defpackage.bn1.e(r15)
        L_0x01a5:
            boolean r9 = r10 instanceof defpackage.e95
            r10 = 1
            if (r9 == 0) goto L_0x01b8
            if (r12 == 0) goto L_0x01ad
            goto L_0x01af
        L_0x01ad:
            int r10 = r6.a
        L_0x01af:
            r6.getClass()
            cn1 r6 = new cn1
            r6.<init>(r10, r7, r8)
            goto L_0x01c8
        L_0x01b8:
            if (r12 != 0) goto L_0x01c0
            if (r3 == 0) goto L_0x01bf
            if (r11 == 0) goto L_0x01bf
            goto L_0x01c0
        L_0x01bf:
            r10 = 2
        L_0x01c0:
            r6.getClass()
            cn1 r6 = new cn1
            r6.<init>(r10, r7, r8)
        L_0x01c8:
            je7 r7 = r1.Q0
            java.lang.Object r7 = r7.getValue()
            en1 r7 = (defpackage.en1) r7
            r7.b = r6
            java.util.LinkedHashSet r7 = r7.a
            java.util.Iterator r7 = r7.iterator()
        L_0x01d8:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01e8
            java.lang.Object r8 = r7.next()
            dn1 r8 = (defpackage.dn1) r8
            r8.x(r6)
            goto L_0x01d8
        L_0x01e8:
            boolean r5 = r4.c(r5, r6)
            if (r5 == 0) goto L_0x0121
            e5f r14 = defpackage.e5f.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik1.o(java.lang.Object):java.lang.Object");
    }
}
