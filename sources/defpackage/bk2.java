package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bk2  reason: default package */
public final class bk2 extends ffe implements a66 {
    public cj2 X;
    public int Y;
    public int Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ ck2 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bk2(ck2 ck2, Continuation continuation) {
        super(2, continuation);
        this.t0 = ck2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bk2) n((kpa) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bk2 bk2 = new bk2(this.t0, continuation);
        bk2.s0 = obj;
        return bk2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = 1
            tx3 r2 = defpackage.tx3.a
            int r3 = r0.Z
            e5f r4 = defpackage.e5f.a
            r5 = 0
            r6 = 0
            r7 = 3
            r8 = 2
            r10 = 4
            if (r3 == 0) goto L_0x0052
            if (r3 == r1) goto L_0x0046
            if (r3 == r8) goto L_0x003b
            if (r3 == r7) goto L_0x002b
            if (r3 != r10) goto L_0x0023
            int r2 = r0.Y
            java.lang.Object r3 = r0.s0
            java.util.List r3 = (java.util.List) r3
            defpackage.od2.a0(r19)
            goto L_0x019a
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002b:
            int r3 = r0.Y
            cj2 r7 = r0.X
            java.lang.Object r8 = r0.s0
            java.util.List r8 = (java.util.List) r8
            defpackage.od2.a0(r19)
            r11 = r7
        L_0x0037:
            r7 = r3
            r3 = r8
            goto L_0x012d
        L_0x003b:
            cj2 r3 = r0.X
            java.lang.Object r8 = r0.s0
            java.util.List r8 = (java.util.List) r8
            defpackage.od2.a0(r19)
            goto L_0x00c1
        L_0x0046:
            cj2 r3 = r0.X
            java.lang.Object r11 = r0.s0
            java.util.List r11 = (java.util.List) r11
            defpackage.od2.a0(r19)
            r12 = r19
            goto L_0x00ab
        L_0x0052:
            defpackage.od2.a0(r19)
            java.lang.Object r3 = r0.s0
            kpa r3 = (defpackage.kpa) r3
            java.lang.Object r3 = r3.a
            java.util.List r3 = (java.util.List) r3
            ck2 r11 = r0.t0
            java.lang.String r11 = r11.w0
            ir6 r12 = defpackage.hm9.m
            if (r12 != 0) goto L_0x0066
            goto L_0x007b
        L_0x0066:
            boolean r13 = r12.c()
            if (r13 == 0) goto L_0x007b
            us7 r13 = defpackage.us7.X
            int r14 = r3.size()
            java.lang.String r15 = "Media viewer. Get result from loader size:"
            java.lang.String r14 = defpackage.zr6.h(r14, r15)
            r12.d(r13, r11, r14, r5)
        L_0x007b:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L_0x0082
            return r4
        L_0x0082:
            ck2 r11 = r0.t0
            q0e r11 = r11.P0
            java.lang.Object r11 = r11.getValue()
            cj2 r11 = (defpackage.cj2) r11
            r11.getClass()
            cj2 r12 = defpackage.cj2.c
            if (r11 != r12) goto L_0x0115
            ck2 r12 = r0.t0
            r79 r13 = r12.s0
            long r14 = r12.o
            r0.s0 = r3
            r0.X = r11
            r0.Z = r1
            java.lang.Object r12 = r13.a(r14, r0)
            if (r12 != r2) goto L_0x00a6
            return r2
        L_0x00a6:
            r17 = r11
            r11 = r3
            r3 = r17
        L_0x00ab:
            cu8 r12 = (defpackage.cu8) r12
            if (r12 == 0) goto L_0x00c7
            ck2 r13 = r0.t0
            r0.s0 = r11
            r0.X = r3
            r0.Z = r8
            bc7[] r8 = defpackage.ck2.d1
            java.lang.Object r8 = r13.F(r12, r0)
            if (r8 != r2) goto L_0x00c0
            return r2
        L_0x00c0:
            r8 = r11
        L_0x00c1:
            r17 = r8
            r8 = r3
            r3 = r17
            goto L_0x00c9
        L_0x00c7:
            r8 = r3
            r3 = r11
        L_0x00c9:
            ck2 r11 = r0.t0
            java.util.Iterator r12 = r3.iterator()
            r13 = r6
        L_0x00d0:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x00f6
            java.lang.Object r14 = r12.next()
            sb8 r14 = (defpackage.sb8) r14
            long r15 = r14.j()
            long r9 = r11.o
            int r9 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x00f3
            java.lang.String r9 = r14.x()
            java.lang.String r10 = r11.c
            boolean r9 = defpackage.tpa.f(r9, r10)
            if (r9 == 0) goto L_0x00f3
            goto L_0x00f7
        L_0x00f3:
            int r13 = r13 + r1
            r10 = 4
            goto L_0x00d0
        L_0x00f6:
            r13 = -1
        L_0x00f7:
            ck2 r9 = r0.t0
            java.lang.String r9 = r9.w0
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L_0x0100
            goto L_0x0111
        L_0x0100:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x0111
            us7 r11 = defpackage.us7.X
            java.lang.String r12 = "Media viewer. Found initialPos: "
            java.lang.String r12 = defpackage.zr6.h(r13, r12)
            r10.d(r11, r9, r12, r5)
        L_0x0111:
            r11 = r8
            r8 = r3
            r3 = r13
            goto L_0x011c
        L_0x0115:
            int r8 = r11.b
            r17 = r8
            r8 = r3
            r3 = r17
        L_0x011c:
            ck2 r9 = r0.t0
            r0.s0 = r8
            r0.X = r11
            r0.Y = r3
            r0.Z = r7
            java.lang.Object r7 = defpackage.ck2.q(r9, r8, r0)
            if (r7 != r2) goto L_0x0037
            return r2
        L_0x012d:
            ck2 r8 = r0.t0
            q0e r8 = r8.P0
            java.lang.Object r8 = r8.getValue()
            cj2 r8 = (defpackage.cj2) r8
            int r8 = r8.b
            r11.getClass()
            cj2 r9 = defpackage.cj2.c
            if (r11 != r9) goto L_0x0142
            r6 = r8
            goto L_0x016e
        L_0x0142:
            ck2 r9 = r0.t0
            java.util.Iterator r10 = r3.iterator()
        L_0x0148:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x016d
            java.lang.Object r11 = r10.next()
            sb8 r11 = (defpackage.sb8) r11
            long r12 = r11.j()
            long r14 = r9.o
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x016b
            java.lang.String r11 = r11.x()
            java.lang.String r12 = r9.c
            boolean r11 = defpackage.tpa.f(r11, r12)
            if (r11 == 0) goto L_0x016b
            goto L_0x016e
        L_0x016b:
            int r6 = r6 + r1
            goto L_0x0148
        L_0x016d:
            r6 = -1
        L_0x016e:
            if (r8 < 0) goto L_0x0185
            if (r8 == r6) goto L_0x0185
            ck2 r7 = r0.t0
            java.lang.String r7 = r7.w0
            java.lang.String r9 = "Media viewer. Initial position changed, prev:"
            java.lang.String r10 = ", new:"
            java.lang.String r11 = ". Recalculate counter."
            java.lang.String r8 = defpackage.wg0.h(r9, r8, r10, r6, r11)
            defpackage.hm9.m(r7, r8, new java.lang.Object[0])
            r9 = -1
            goto L_0x0187
        L_0x0185:
            r6 = r7
            r9 = r6
        L_0x0187:
            ck2 r7 = r0.t0
            r0.s0 = r3
            r0.X = r5
            r0.Y = r6
            r8 = 4
            r0.Z = r8
            java.lang.Object r7 = defpackage.ck2.s(r7, r9, r3, r0)
            if (r7 != r2) goto L_0x0199
            return r2
        L_0x0199:
            r2 = r6
        L_0x019a:
            ck2 r6 = r0.t0
            q0e r6 = r6.P0
            cj2 r7 = new cj2
            r7.<init>(r2, r3)
            r6.m(r5, r7)
            ck2 r2 = r0.t0
            java.util.concurrent.atomic.AtomicReference r2 = r2.J0
            java.lang.Object r2 = r2.get()
            bj2 r2 = (defpackage.bj2) r2
            boolean r2 = r2.b
            if (r2 == 0) goto L_0x01dc
            boolean r2 = r3.isEmpty()
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x01dc
            ck2 r1 = r0.t0
            java.lang.String r1 = r1.w0
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x01c4
            goto L_0x01d1
        L_0x01c4:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x01d1
            us7 r3 = defpackage.us7.X
            java.lang.String r6 = "Media viewer. Call load next after get result."
            r2.d(r3, r1, r6, r5)
        L_0x01d1:
            ck2 r0 = r0.t0
            t29 r0 = r0.F0
            if (r0 == 0) goto L_0x01dc
            bx r0 = (defpackage.bx) r0
            r0.w()
        L_0x01dc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk2.o(java.lang.Object):java.lang.Object");
    }
}
