package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kj2  reason: default package */
public final class kj2 extends ffe implements a66 {
    public sb8 X;
    public int Y;
    public int Z;
    public int s0;
    public final /* synthetic */ ck2 t0;
    public final /* synthetic */ int u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kj2(ck2 ck2, int i, Continuation continuation) {
        super(2, continuation);
        this.t0 = ck2;
        this.u0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kj2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kj2(this.t0, this.u0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 4
            r1 = 1
            tx3 r2 = defpackage.tx3.a
            int r3 = r13.s0
            e5f r4 = defpackage.e5f.a
            r5 = 0
            r6 = 2
            if (r3 == 0) goto L_0x002f
            if (r3 == r1) goto L_0x0023
            if (r3 != r6) goto L_0x001b
            int r2 = r13.Z
            int r3 = r13.Y
            sb8 r6 = r13.X
            defpackage.od2.a0(r14)
            goto L_0x00e3
        L_0x001b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0023:
            int r3 = r13.Z
            int r7 = r13.Y
            sb8 r8 = r13.X
            defpackage.od2.a0(r14)
            r14 = r8
            goto L_0x00cd
        L_0x002f:
            defpackage.od2.a0(r14)
            ck2 r14 = r13.t0
            q0e r14 = r14.P0
            java.lang.Object r14 = r14.getValue()
            cj2 r14 = (defpackage.cj2) r14
            java.util.List r14 = r14.a
            int r3 = r13.u0
            java.lang.Object r14 = r14.get(r3)
            sb8 r14 = (defpackage.sb8) r14
            ck2 r3 = r13.t0
            java.util.concurrent.atomic.AtomicReference r3 = r3.K0
            iz0 r7 = new iz0
            r7.<init>(r0, r14)
            java.lang.Object r3 = r3.getAndUpdate(r7)
            java.lang.String r3 = (java.lang.String) r3
            ck2 r7 = r13.t0
            q0e r7 = r7.P0
            java.lang.Object r7 = r7.getValue()
            cj2 r7 = (defpackage.cj2) r7
            java.util.List r7 = r7.a
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
        L_0x0066:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x007f
            java.lang.Object r9 = r7.next()
            sb8 r9 = (defpackage.sb8) r9
            java.lang.String r9 = r9.x()
            boolean r9 = defpackage.tpa.f(r9, r3)
            if (r9 == 0) goto L_0x007d
            goto L_0x0080
        L_0x007d:
            int r8 = r8 + r1
            goto L_0x0066
        L_0x007f:
            r8 = -1
        L_0x0080:
            java.lang.String r7 = r14.x()
            boolean r3 = defpackage.tpa.f(r3, r7)
            if (r3 == 0) goto L_0x008b
            return r4
        L_0x008b:
            ck2 r3 = r13.t0
            java.lang.String r3 = r3.w0
            int r7 = r13.u0
            ir6 r9 = defpackage.hm9.m
            if (r9 != 0) goto L_0x0096
            goto L_0x00a9
        L_0x0096:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x00a9
            us7 r10 = defpackage.us7.X
            java.lang.String r11 = "Media viewer. On new page selected newPos:"
            java.lang.String r12 = ", prev:"
            java.lang.String r7 = defpackage.rh4.h(r11, r7, r8, r12)
            r9.d(r10, r3, r7, r5)
        L_0x00a9:
            ck2 r3 = r13.t0
            q0e r3 = r3.P0
            java.lang.Object r3 = r3.getValue()
            cj2 r3 = (defpackage.cj2) r3
            java.util.List r3 = r3.a
            int r3 = r3.size()
            ck2 r7 = r13.t0
            int r9 = r13.u0
            r13.X = r14
            r13.Y = r8
            r13.Z = r3
            r13.s0 = r1
            java.lang.Object r7 = r7.D(r9, r14, r3, r13)
            if (r7 != r2) goto L_0x00cc
            return r2
        L_0x00cc:
            r7 = r8
        L_0x00cd:
            ck2 r8 = r13.t0
            r13.X = r14
            r13.Y = r7
            r13.Z = r3
            r13.s0 = r6
            bc7[] r6 = defpackage.ck2.d1
            java.lang.Object r6 = r8.C(r14, r13)
            if (r6 != r2) goto L_0x00e0
            return r2
        L_0x00e0:
            r6 = r14
            r2 = r3
            r3 = r7
        L_0x00e3:
            ck2 r14 = r13.t0
            java.util.concurrent.atomic.AtomicReference r14 = r14.J0
            java.lang.Object r14 = r14.get()
            bj2 r14 = (defpackage.bj2) r14
            ck2 r7 = r13.t0
            boolean r8 = r7.X
            r9 = 5
            if (r8 == 0) goto L_0x012f
            boolean r8 = r14.b
            if (r8 == 0) goto L_0x0111
            int r8 = r13.u0
            if (r3 <= r8) goto L_0x0111
            if (r8 > r9) goto L_0x0111
            java.lang.String r14 = r7.w0
            java.lang.String r2 = "Media viewer. Call load next, desc order"
            defpackage.hm9.m(r14, r2, new java.lang.Object[0])
            ck2 r14 = r13.t0
            t29 r14 = r14.F0
            if (r14 == 0) goto L_0x0169
            bx r14 = (defpackage.bx) r14
            r14.w()
            goto L_0x0169
        L_0x0111:
            boolean r14 = r14.a
            if (r14 == 0) goto L_0x0169
            int r14 = r13.u0
            if (r3 >= r14) goto L_0x0169
            int r2 = r2 - r14
            if (r2 > r9) goto L_0x0169
            java.lang.String r14 = r7.w0
            java.lang.String r2 = "Media viewer. Call load prev, desc order"
            defpackage.hm9.m(r14, r2, new java.lang.Object[0])
            ck2 r14 = r13.t0
            t29 r14 = r14.F0
            if (r14 == 0) goto L_0x0169
            bx r14 = (defpackage.bx) r14
            r14.y()
            goto L_0x0169
        L_0x012f:
            boolean r8 = r14.b
            if (r8 == 0) goto L_0x014d
            int r8 = r13.u0
            if (r3 >= r8) goto L_0x014d
            int r2 = r2 - r8
            if (r2 > r9) goto L_0x014d
            java.lang.String r14 = r7.w0
            java.lang.String r2 = "Media viewer. Call load next"
            defpackage.hm9.m(r14, r2, new java.lang.Object[0])
            ck2 r14 = r13.t0
            t29 r14 = r14.F0
            if (r14 == 0) goto L_0x0169
            bx r14 = (defpackage.bx) r14
            r14.w()
            goto L_0x0169
        L_0x014d:
            boolean r14 = r14.a
            if (r14 == 0) goto L_0x0169
            int r14 = r13.u0
            if (r3 <= r14) goto L_0x0169
            if (r14 > r9) goto L_0x0169
            java.lang.String r14 = r7.w0
            java.lang.String r2 = "Media viewer. Call load prev"
            defpackage.hm9.m(r14, r2, new java.lang.Object[0])
            ck2 r14 = r13.t0
            t29 r14 = r14.F0
            if (r14 == 0) goto L_0x0169
            bx r14 = (defpackage.bx) r14
            r14.y()
        L_0x0169:
            ck2 r14 = r13.t0
            q0e r14 = r14.P0
            java.lang.Object r14 = r14.getValue()
            cj2 r14 = (defpackage.cj2) r14
            java.util.List r14 = r14.a
            java.lang.Object r14 = defpackage.x53.j0(r3, r14)
            sb8 r14 = (defpackage.sb8) r14
            if (r14 == 0) goto L_0x0189
            ck2 r2 = r13.t0
            s35 r2 = r2.N0
            l35 r3 = new l35
            r3.<init>(r14)
            defpackage.pnf.o(r2, r3)
        L_0x0189:
            boolean r14 = r6 instanceof defpackage.qb8
            if (r14 == 0) goto L_0x01a6
            ck2 r14 = r13.t0
            s35 r14 = r14.N0
            j35 r2 = new j35
            r2.<init>(r0, r1)
            defpackage.pnf.o(r14, r2)
            ck2 r14 = r13.t0
            r0 = r6
            qb8 r0 = (defpackage.qb8) r0
            long r1 = r0.a
            java.lang.String r0 = r0.X
            r14.v(r1, r0)
            goto L_0x01dc
        L_0x01a6:
            boolean r14 = r6 instanceof defpackage.jb8
            if (r14 == 0) goto L_0x01cf
            r14 = r6
            jb8 r14 = (defpackage.jb8) r14
            boolean r0 = r14.X
            if (r0 == 0) goto L_0x01cf
            yt6 r14 = r14.o
            android.net.Uri r0 = r14.l
            if (r0 == 0) goto L_0x01c1
            xc6 r1 = new xc6
            int r2 = r14.c
            int r14 = r14.d
            r1.<init>(r0, r2, r14)
            goto L_0x01c2
        L_0x01c1:
            r1 = r5
        L_0x01c2:
            ck2 r14 = r13.t0
            q0e r14 = r14.V0
            ej2 r0 = new ej2
            r0.<init>((defpackage.sb8) r6, (defpackage.gef) r1)
            r14.m(r5, r0)
            goto L_0x01dc
        L_0x01cf:
            ck2 r14 = r13.t0
            q0e r14 = r14.V0
            ej2 r0 = new ej2
            r1 = 3
            r0.<init>((defpackage.qb8) r5, (int) r1)
            r14.m(r5, r0)
        L_0x01dc:
            ck2 r13 = r13.t0
            s35 r13 = r13.N0
            k35 r14 = new k35
            r14.<init>(r6)
            defpackage.pnf.o(r13, r14)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj2.o(java.lang.Object):java.lang.Object");
    }
}
