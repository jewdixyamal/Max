package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cjf  reason: default package */
public final class cjf extends ffe implements a66 {
    public long X;
    public long Y;
    public long Z;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ ejf u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cjf(ejf ejf, Continuation continuation) {
        super(2, continuation);
        this.u0 = ejf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cjf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cjf cjf = new cjf(this.u0, continuation);
        cjf.t0 = obj;
        return cjf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d A[EDGE_INSN: B:33:0x008d->B:22:0x008d ?: BREAK  
    EDGE_INSN: B:35:0x008d->B:22:0x008d ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0035
            if (r2 == r3) goto L_0x0027
            if (r2 != r4) goto L_0x001f
            long r5 = r0.Z
            long r7 = r0.Y
            long r9 = r0.X
            java.lang.Object r2 = r0.t0
            sx3 r2 = (defpackage.sx3) r2
            defpackage.od2.a0(r18)
        L_0x001b:
            r15 = r5
            r5 = r9
            r9 = r15
            goto L_0x0063
        L_0x001f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0027:
            long r5 = r0.Z
            long r7 = r0.Y
            long r9 = r0.X
            java.lang.Object r2 = r0.t0
            sx3 r2 = (defpackage.sx3) r2
            defpackage.od2.a0(r18)
            goto L_0x0070
        L_0x0035:
            defpackage.od2.a0(r18)
            java.lang.Object r2 = r0.t0
            sx3 r2 = (defpackage.sx3) r2
            int r5 = defpackage.ft4.o
            ejf r5 = r0.u0
            je7 r5 = r5.X
            java.lang.Object r5 = r5.getValue()
            qe5 r5 = (defpackage.qe5) r5
            se5 r5 = (defpackage.se5) r5
            r5.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f78maxvideomessagelength
            r7 = 60
            long r5 = r5.o(r6, r7)
            kt4 r7 = defpackage.kt4.SECONDS
            long r5 = defpackage.z7.S(r5, r7)
            long r5 = defpackage.ft4.e(r5)
            r7 = 0
            r9 = 100
        L_0x0063:
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x00c4
            boolean r11 = defpackage.j1e.z(r2)
            if (r11 == 0) goto L_0x00c4
            r15 = r5
            r5 = r9
            r9 = r15
        L_0x0070:
            ejf r11 = r0.u0
            boolean r11 = r11.C0
            if (r11 == 0) goto L_0x008d
            boolean r11 = defpackage.j1e.z(r2)
            if (r11 == 0) goto L_0x008d
            r0.t0 = r2
            r0.X = r9
            r0.Y = r7
            r0.Z = r5
            r0.s0 = r3
            java.lang.Object r11 = defpackage.j47.x(r5, r0)
            if (r11 != r1) goto L_0x0070
            return r1
        L_0x008d:
            long r7 = r7 + r5
            ejf r11 = r0.u0
            gte r11 = r11.B0
            if (r11 == 0) goto L_0x00b3
            float r12 = (float) r7
            float r13 = (float) r9
            float r12 = r12 / r13
            r13 = 1120403456(0x42c80000, float:100.0)
            float r12 = r12 * r13
            bc7[] r13 = one.me.chatscreen.videomsg.VideoMessageWidget.y0
            java.lang.Object r11 = r11.b
            one.me.chatscreen.videomsg.VideoMessageWidget r11 = (one.me.chatscreen.videomsg.VideoMessageWidget) r11
            r11.getClass()
            bc7[] r13 = one.me.chatscreen.videomsg.VideoMessageWidget.y0
            r14 = 3
            r13 = r13[r14]
            q7c r14 = r11.Z
            java.lang.Object r11 = r14.T0(r11, r13)
            ohf r11 = (defpackage.ohf) r11
            defpackage.ohf.k(r11, r12)
        L_0x00b3:
            r0.t0 = r2
            r0.X = r9
            r0.Y = r7
            r0.Z = r5
            r0.s0 = r4
            java.lang.Object r11 = defpackage.j47.x(r5, r0)
            if (r11 != r1) goto L_0x001b
            return r1
        L_0x00c4:
            ejf r0 = r0.u0
            ubc r0 = r0.Y
            if (r0 == 0) goto L_0x00cf
            cbc r0 = (defpackage.cbc) r0
            r0.y()
        L_0x00cf:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjf.o(java.lang.Object):java.lang.Object");
    }
}
