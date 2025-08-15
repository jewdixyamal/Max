package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jo3  reason: default package */
public final class jo3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ oo3 Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jo3(int i, oo3 oo3, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = oo3;
        this.s0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jo3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jo3(this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = 2
            r3 = 1
            tx3 r4 = defpackage.tx3.a
            int r5 = r0.X
            e5f r6 = defpackage.e5f.a
            r7 = 4
            r8 = 3
            oo3 r9 = r0.Z
            if (r5 == 0) goto L_0x0034
            if (r5 == r3) goto L_0x002e
            if (r5 == r2) goto L_0x0027
            if (r5 == r8) goto L_0x0022
            if (r5 != r7) goto L_0x001a
            goto L_0x0022
        L_0x001a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0022:
            defpackage.od2.a0(r17)
            goto L_0x028f
        L_0x0027:
            defpackage.od2.a0(r17)
            r0 = r17
            goto L_0x01a9
        L_0x002e:
            defpackage.od2.a0(r17)
            r0 = r17
            goto L_0x0089
        L_0x0034:
            defpackage.od2.a0(r17)
            int r5 = defpackage.z8a.d
            long r10 = r0.s0
            int r12 = r0.Y
            if (r12 != r5) goto L_0x005e
            s35 r0 = r9.C0
            tr3 r1 = defpackage.tr3.c
            r1.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ":profile?id="
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r2 = "&type=contact"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.wg0.k(r1, r0)
            goto L_0x028f
        L_0x005e:
            int r5 = defpackage.z8a.f
            if (r12 != r5) goto L_0x0072
            s35 r0 = r9.C0
            wla r1 = new wla
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r1.<init>(r2)
            defpackage.pnf.o(r0, r1)
            goto L_0x028f
        L_0x0072:
            int r5 = defpackage.z8a.i
            if (r12 != r5) goto L_0x00a8
            je7 r1 = r9.Y
            java.lang.Object r1 = r1.getValue()
            iy2 r1 = (defpackage.iy2) r1
            r0.X = r3
            jz2 r1 = (defpackage.jz2) r1
            java.lang.Object r0 = r1.u(r10, r0)
            if (r0 != r4) goto L_0x0089
            return r4
        L_0x0089:
            e52 r0 = (defpackage.e52) r0
            if (r0 == 0) goto L_0x028f
            s35 r1 = r9.C0
            tr3 r2 = defpackage.tr3.c
            r2.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ":chats?id="
            r2.<init>(r3)
            long r3 = r0.a
            java.lang.String r0 = "&type=local"
            java.lang.String r0 = defpackage.zr6.k(r2, r3, r0)
            defpackage.wg0.k(r0, r1)
            goto L_0x028f
        L_0x00a8:
            int r5 = defpackage.z8a.e
            if (r12 != r5) goto L_0x00ae
            goto L_0x028f
        L_0x00ae:
            int r5 = defpackage.z8a.b
            if (r12 != r5) goto L_0x010b
            je7 r0 = r9.X
            java.lang.Object r0 = r0.getValue()
            ds3 r0 = (defpackage.ds3) r0
            el3 r0 = r0.a
            java.util.concurrent.ConcurrentHashMap r2 = r0.a
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            java.lang.Object r2 = r2.get(r4)
            uj3 r2 = (defpackage.uj3) r2
            if (r2 == 0) goto L_0x00cb
            goto L_0x00cf
        L_0x00cb:
            uj3 r2 = r0.i(r10, r1)
        L_0x00cf:
            if (r2 != 0) goto L_0x00d2
            return r6
        L_0x00d2:
            mg3 r0 = defpackage.wj3.a
            end r0 = new end
            long r11 = r2.n()
            int r2 = defpackage.a9a.d
            eqe r13 = new eqe
            r13.<init>(r2)
            int r2 = defpackage.a9a.c
            eqe r14 = new eqe
            r14.<init>(r2)
            mg3 r2 = new mg3
            int r4 = defpackage.z8a.j
            int r5 = defpackage.a9a.b
            eqe r7 = new eqe
            r7.<init>(r5)
            r2.<init>(r4, r7, r3, r1)
            mg3 r1 = defpackage.wj3.a
            mg3[] r1 = new defpackage.mg3[]{r2, r1}
            java.util.List r15 = defpackage.y53.M(r1)
            r10 = r0
            r10.<init>(r11, r13, r14, r15)
            s35 r1 = r9.D0
            defpackage.pnf.o(r1, r0)
            goto L_0x028f
        L_0x010b:
            int r5 = defpackage.z8a.c
            if (r12 != r5) goto L_0x0172
            je7 r0 = r9.X
            java.lang.Object r0 = r0.getValue()
            ds3 r0 = (defpackage.ds3) r0
            el3 r0 = r0.a
            java.util.concurrent.ConcurrentHashMap r2 = r0.a
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            java.lang.Object r2 = r2.get(r4)
            uj3 r2 = (defpackage.uj3) r2
            if (r2 == 0) goto L_0x0128
            goto L_0x012c
        L_0x0128:
            uj3 r2 = r0.i(r10, r1)
        L_0x012c:
            if (r2 != 0) goto L_0x012f
            return r6
        L_0x012f:
            mg3 r0 = defpackage.wj3.a
            end r0 = new end
            long r11 = r2.n()
            int r4 = defpackage.a9a.f
            java.lang.String r2 = r2.d()
            if (r2 != 0) goto L_0x0141
            java.lang.String r2 = ""
        L_0x0141:
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            gqe r13 = new gqe
            java.util.List r2 = defpackage.ys.m0(r2)
            r13.<init>(r4, r2)
            mg3 r2 = new mg3
            int r4 = defpackage.z8a.l
            int r5 = defpackage.a9a.e
            eqe r7 = new eqe
            r7.<init>(r5)
            r2.<init>(r4, r7, r3, r1)
            mg3 r1 = defpackage.wj3.a
            mg3[] r1 = new defpackage.mg3[]{r2, r1}
            java.util.List r15 = defpackage.y53.M(r1)
            r14 = 0
            r10 = r0
            r10.<init>(r11, r13, r14, r15)
            s35 r1 = r9.D0
            defpackage.pnf.o(r1, r0)
            goto L_0x028f
        L_0x0172:
            int r5 = defpackage.z8a.a
            if (r12 != r5) goto L_0x0182
            s35 r0 = r9.C0
            fyd r2 = new fyd
            r2.<init>(r10, r1)
            defpackage.pnf.o(r0, r2)
            goto L_0x028f
        L_0x0182:
            int r5 = defpackage.z8a.h
            if (r12 != r5) goto L_0x0192
            s35 r0 = r9.C0
            fyd r1 = new fyd
            r1.<init>(r10, r3)
            defpackage.pnf.o(r0, r1)
            goto L_0x028f
        L_0x0192:
            int r5 = defpackage.z8a.g
            if (r12 != r5) goto L_0x01c7
            je7 r3 = r9.Y
            java.lang.Object r3 = r3.getValue()
            iy2 r3 = (defpackage.iy2) r3
            r0.X = r2
            jz2 r3 = (defpackage.jz2) r3
            java.lang.Object r0 = r3.u(r10, r0)
            if (r0 != r4) goto L_0x01a9
            return r4
        L_0x01a9:
            e52 r0 = (defpackage.e52) r0
            if (r0 == 0) goto L_0x028f
            s35 r2 = r9.D0
            dnd r3 = new dnd
            int r4 = defpackage.a9a.l
            eqe r5 = new eqe
            r5.<init>(r4)
            ao3 r4 = new ao3
            long r7 = r0.a
            r4.<init>(r9, r7, r1)
            r3.<init>(r5, r4)
            defpackage.pnf.o(r2, r3)
            goto L_0x028f
        L_0x01c7:
            int r1 = defpackage.z8a.l
            r5 = 0
            if (r12 != r1) goto L_0x01f8
            s35 r1 = r9.D0
            dnd r2 = new dnd
            int r7 = defpackage.a9a.h
            eqe r12 = new eqe
            r12.<init>(r7)
            ao3 r7 = new ao3
            r7.<init>(r9, r10, r3)
            r2.<init>(r12, r7)
            defpackage.pnf.o(r1, r2)
            kke r1 = r9.c
            w9a r1 = (defpackage.w9a) r1
            nx3 r1 = r1.b()
            ho3 r2 = new ho3
            r2.<init>(r9, r10, r5)
            r0.X = r8
            java.lang.Object r0 = defpackage.j47.t0(r1, r2, r0)
            if (r0 != r4) goto L_0x028f
            return r4
        L_0x01f8:
            int r1 = defpackage.z8a.j
            if (r12 != r1) goto L_0x0228
            s35 r1 = r9.D0
            dnd r3 = new dnd
            int r8 = defpackage.a9a.g
            eqe r12 = new eqe
            r12.<init>(r8)
            ao3 r8 = new ao3
            r8.<init>(r9, r10, r2)
            r3.<init>(r12, r8)
            defpackage.pnf.o(r1, r3)
            kke r1 = r9.c
            w9a r1 = (defpackage.w9a) r1
            nx3 r1 = r1.b()
            io3 r2 = new io3
            r2.<init>(r9, r10, r5)
            r0.X = r7
            java.lang.Object r0 = defpackage.j47.t0(r1, r2, r0)
            if (r0 != r4) goto L_0x028f
            return r4
        L_0x0228:
            int r0 = defpackage.z8a.q
            if (r12 != r0) goto L_0x0234
            s35 r0 = r9.D0
            p9 r1 = defpackage.p9.a
            defpackage.pnf.o(r0, r1)
            goto L_0x028f
        L_0x0234:
            int r0 = defpackage.z8a.r
            if (r12 != r0) goto L_0x0240
            s35 r0 = r9.D0
            dz3 r1 = defpackage.dz3.a
            defpackage.pnf.o(r0, r1)
            goto L_0x028f
        L_0x0240:
            int r0 = defpackage.gca.e
            if (r12 != r0) goto L_0x0256
            s35 r0 = r9.C0
            tr3 r1 = defpackage.tr3.c
            r1.getClass()
            c64 r1 = new c64
            java.lang.String r2 = ":invite/phone"
            r1.<init>(r2)
            defpackage.pnf.o(r0, r1)
            goto L_0x028f
        L_0x0256:
            int r0 = defpackage.gca.k
            if (r12 != r0) goto L_0x0277
            je7 r0 = r9.y0
            java.lang.Object r0 = r0.getValue()
            l67 r0 = (defpackage.l67) r0
            r0.b()
            tr3 r0 = defpackage.tr3.c
            r0.getClass()
            c64 r0 = new c64
            java.lang.String r1 = ":invite/qr"
            r0.<init>(r1)
            s35 r1 = r9.C0
            defpackage.pnf.o(r1, r0)
            goto L_0x028f
        L_0x0277:
            int r0 = defpackage.gca.d
            if (r12 != r0) goto L_0x028f
            je7 r0 = r9.y0
            java.lang.Object r0 = r0.getValue()
            l67 r0 = (defpackage.l67) r0
            java.lang.String r1 = "click_link"
            java.lang.String r2 = "plus"
            java.lang.String r3 = "invite_friends"
            r0.a(r1, r2, r3)
            r9.r()
        L_0x028f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo3.o(java.lang.Object):java.lang.Object");
    }
}
