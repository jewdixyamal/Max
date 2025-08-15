package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ew2  reason: default package */
public final class ew2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ gw2 Y;
    public final /* synthetic */ td6 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ew2(gw2 gw2, td6 td6, Continuation continuation) {
        super(2, continuation);
        this.Y = gw2;
        this.Z = td6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ew2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ew2(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r11.X
            e5f r2 = defpackage.e5f.a
            r3 = 2
            r4 = 1
            td6 r5 = r11.Z
            gw2 r6 = r11.Y
            if (r1 == 0) goto L_0x0023
            if (r1 == r4) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            defpackage.od2.a0(r12)
            goto L_0x0091
        L_0x0017:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x001f:
            defpackage.od2.a0(r12)
            goto L_0x0065
        L_0x0023:
            defpackage.od2.a0(r12)
            bc7[] r12 = defpackage.gw2.Q0
            je7 r12 = r6.t0
            java.lang.Object r12 = r12.getValue()
            q33 r12 = (defpackage.q33) r12
            hyc r12 = (defpackage.hyc) r12
            long r7 = r12.t()
            long r9 = r5.c
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 != 0) goto L_0x004e
            int r11 = defpackage.jpc.A2
            eqe r12 = new eqe
            r12.<init>(r11)
            rnd r11 = new rnd
            r11.<init>(r12)
            s35 r12 = r6.I0
            defpackage.pnf.o(r12, r11)
            return r2
        L_0x004e:
            kke r12 = r6.Z
            w9a r12 = (defpackage.w9a) r12
            nx3 r12 = r12.b()
            dw2 r1 = new dw2
            r7 = 0
            r1.<init>(r6, r5, r7)
            r11.X = r4
            java.lang.Object r12 = defpackage.j47.t0(r12, r1, r11)
            if (r12 != r0) goto L_0x0065
            return r0
        L_0x0065:
            wm3 r12 = r5.v0
            vm3 r1 = defpackage.vm3.BOT
            java.util.List r12 = r12.u0
            boolean r12 = r12.contains(r1)
            long r7 = r5.c
            if (r12 != 0) goto L_0x0080
            bc7[] r11 = defpackage.gw2.Q0
            iy2 r11 = r6.s()
            jz2 r11 = (defpackage.jz2) r11
            e52 r11 = r11.q(r7)
            goto L_0x0094
        L_0x0080:
            bc7[] r12 = defpackage.gw2.Q0
            iy2 r12 = r6.s()
            r11.X = r3
            jz2 r12 = (defpackage.jz2) r12
            java.lang.Object r12 = r12.u(r7, r11)
            if (r12 != r0) goto L_0x0091
            return r0
        L_0x0091:
            r11 = r12
            e52 r11 = (defpackage.e52) r11
        L_0x0094:
            if (r11 == 0) goto L_0x009f
            gy2 r12 = defpackage.gy2.c
            long r0 = r11.a
            c64 r11 = defpackage.gy2.a2(r12, r0)
            goto L_0x00bf
        L_0x009f:
            gy2 r11 = defpackage.gy2.c
            long r0 = r5.c
            r11.getClass()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = ":profile?id="
            r11.<init>(r12)
            r11.append(r0)
            java.lang.String r12 = "&type=contact"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            c64 r12 = new c64
            r12.<init>(r11)
            r11 = r12
        L_0x00bf:
            s35 r12 = r6.H0
            defpackage.pnf.o(r12, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew2.o(java.lang.Object):java.lang.Object");
    }
}
