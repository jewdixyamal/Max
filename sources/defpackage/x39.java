package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: x39  reason: default package */
public final class x39 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ fv0 Y;
    public final /* synthetic */ n59 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ z07 t0;
    public final /* synthetic */ kv0 u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x39(fv0 fv0, n59 n59, long j, z07 z07, kv0 kv0, Continuation continuation) {
        super(2, continuation);
        this.Y = fv0;
        this.Z = n59;
        this.s0 = j;
        this.t0 = z07;
        this.u0 = kv0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x39) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new x39(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        if (r7.n(ru.ok.tamtam.android.prefs.PmsKey.f13botstartparam, true) != false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            r19 = this;
            r6 = r19
            tx3 r8 = defpackage.tx3.a
            int r0 = r6.X
            e5f r9 = defpackage.e5f.a
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x001d
            if (r0 == r2) goto L_0x0010
            if (r0 != r1) goto L_0x0015
        L_0x0010:
            defpackage.od2.a0(r20)
            goto L_0x0136
        L_0x0015:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001d:
            defpackage.od2.a0(r20)
            fv0 r0 = r6.Y
            nv0 r3 = r0.b
            if (r3 != 0) goto L_0x0028
            r3 = -1
            goto L_0x0030
        L_0x0028:
            int[] r4 = defpackage.w39.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r4[r3]
        L_0x0030:
            z07 r4 = r6.t0
            n59 r5 = r6.Z
            switch(r3) {
                case 1: goto L_0x0121;
                case 2: goto L_0x0121;
                case 3: goto L_0x00df;
                case 4: goto L_0x00d9;
                case 5: goto L_0x00ac;
                case 6: goto L_0x0081;
                case 7: goto L_0x003d;
                case 8: goto L_0x0136;
                default: goto L_0x0037;
            }
        L_0x0037:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x003d:
            w7c r1 = r5.o1
            j0e r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            e52 r1 = (defpackage.e52) r1
            if (r1 == 0) goto L_0x0080
            u29 r3 = defpackage.u29.c
            java.lang.Long r4 = new java.lang.Long
            long r6 = r1.a
            r4.<init>(r6)
            java.lang.String r1 = r0.X
            r6 = 0
            if (r1 == 0) goto L_0x006d
            je7 r7 = r5.D0
            java.lang.Object r7 = r7.getValue()
            y7d r7 = (defpackage.y7d) r7
            qyc r7 = (defpackage.qyc) r7
            r7.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r8 = ru.ok.tamtam.android.prefs.PmsKey.f13botstartparam
            boolean r2 = r7.n(r8, r2)
            if (r2 == 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r1 = r6
        L_0x006e:
            osf r2 = defpackage.osf.INLINE_BUTTON
            r3.getClass()
            long r6 = r0.Z
            c64 r0 = defpackage.u29.b2(r6, r2, r4, r1)
            s35 r1 = r5.v1
            defpackage.pnf.o(r1, r0)
            goto L_0x0136
        L_0x0080:
            return r9
        L_0x0081:
            w7c r2 = r5.o1
            j0e r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            e52 r2 = (defpackage.e52) r2
            if (r2 == 0) goto L_0x00ab
            je7 r3 = r5.c1
            java.lang.Object r3 = r3.getValue()
            o89 r3 = (defpackage.o89) r3
            r6.X = r1
            r5 = 0
            r7 = 24
            long r1 = r2.a
            java.lang.String r4 = r0.a
            r10 = 0
            r0 = r3
            r3 = r4
            r4 = r10
            r6 = r19
            java.lang.Object r0 = defpackage.o89.b(r0, r1, r3, r4, r5, r6, r7)
            if (r0 != r8) goto L_0x0136
            return r8
        L_0x00ab:
            return r9
        L_0x00ac:
            w7c r0 = r5.o1
            j0e r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            e52 r0 = (defpackage.e52) r0
            if (r0 == 0) goto L_0x00d8
            u29 r1 = defpackage.u29.c
            r1.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ":location/pick?request_code=1001&chat_id="
            r1.<init>(r2)
            long r2 = r0.a
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            c64 r1 = new c64
            r1.<init>(r0)
            s35 r0 = r5.v1
            defpackage.pnf.o(r0, r1)
            goto L_0x0136
        L_0x00d8:
            return r9
        L_0x00d9:
            java.lang.String r0 = r0.o
            r5.E(r0)
            goto L_0x0136
        L_0x00df:
            s35 r0 = r5.u1
            mg3 r1 = defpackage.hs8.a
            java.lang.String r13 = r4.b
            ond r1 = new ond
            int r2 = defpackage.oda.H0
            eqe r3 = new eqe
            r3.<init>(r2)
            int r2 = defpackage.oda.G0
            eqe r4 = new eqe
            r4.<init>(r2)
            mg3 r2 = new mg3
            int r5 = defpackage.mda.S
            int r7 = defpackage.oda.F0
            eqe r8 = new eqe
            r8.<init>(r7)
            r7 = 0
            r10 = 3
            r2.<init>(r5, r8, r10, r7)
            mg3 r5 = defpackage.hs8.a
            mg3[] r2 = new defpackage.mg3[]{r2, r5}
            java.util.List r18 = defpackage.y53.M(r2)
            kv0 r14 = r6.u0
            fv0 r15 = r6.Y
            long r11 = r6.s0
            r10 = r1
            r16 = r3
            r17 = r4
            r10.<init>(r11, r13, r14, r15, r16, r17, r18)
            defpackage.pnf.o(r0, r1)
            goto L_0x0136
        L_0x0121:
            m5d r0 = r5.x0
            java.lang.String r3 = r4.b
            r6.X = r2
            kv0 r4 = r6.u0
            fv0 r5 = r6.Y
            long r1 = r6.s0
            r6 = r19
            java.lang.Object r0 = r0.D(r1, r3, r4, r5, r6)
            if (r0 != r8) goto L_0x0136
            return r8
        L_0x0136:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x39.o(java.lang.Object):java.lang.Object");
    }
}
