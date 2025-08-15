package defpackage;

import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: eo1  reason: default package */
public final class eo1 {
    public static final /* synthetic */ bc7[] k;
    public final k56 a;
    public final ir1 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final w4d h = mqd.D();
    public final kld i;
    public final v7c j;

    static {
        oi9 oi9 = new oi9(eo1.class, "actionHandlerJob", "getActionHandlerJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        k = new bc7[]{oi9};
    }

    public eo1(k56 k56, ir1 ir1, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75) {
        this.a = k56;
        this.b = ir1;
        this.c = je7;
        this.d = je74;
        this.e = je72;
        this.f = je73;
        this.g = je75;
        kld b2 = lld.b(0, Integer.MAX_VALUE, 0, 4);
        this.i = b2;
        this.j = new v7c(b2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0287  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.v31 a(defpackage.gg1 r22, android.graphics.Point r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            gg1 r2 = defpackage.gg1.c
            boolean r2 = r1.equals(r2)
            r3 = 0
            if (r2 != 0) goto L_0x02c9
            ir1 r2 = r0.b
            q0e r4 = r2.b()
            java.lang.Object r4 = r4.getValue()
            d04 r4 = (defpackage.d04) r4
            boolean r4 = r4.h
            if (r4 == 0) goto L_0x02c9
            q0e r4 = r2.b()
            java.lang.Object r4 = r4.getValue()
            d04 r4 = (defpackage.d04) r4
            boolean r4 = r4.f
            if (r4 != 0) goto L_0x002d
            goto L_0x02c9
        L_0x002d:
            w7c r4 = r2.o
            j0e r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            to1 r4 = (defpackage.to1) r4
            gg1 r4 = r4.a
            boolean r4 = defpackage.tpa.f(r4, r1)
            fqa r5 = r2.d()
            ig1 r5 = r5.a
            gg1 r5 = r5.getId()
            boolean r5 = defpackage.tpa.f(r5, r1)
            if (r5 == 0) goto L_0x0052
            fqa r1 = r2.d()
            goto L_0x0068
        L_0x0052:
            j0e r5 = r2.e()
            w7c r5 = (defpackage.w7c) r5
            j0e r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            pqa r5 = (defpackage.pqa) r5
            java.util.Map r5 = r5.c
            java.lang.Object r1 = r5.get(r1)
            fqa r1 = (defpackage.fqa) r1
        L_0x0068:
            je7 r0 = r0.g
            java.lang.Object r0 = r0.getValue()
            qe5 r0 = (defpackage.qe5) r0
            se5 r0 = (defpackage.se5) r0
            boolean r0 = r0.q()
            fqa r2 = r2.d()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            kl7 r6 = defpackage.j1e.l()
            ig1 r2 = r2.a
            gg1 r7 = r2.getId()
            if (r1 == 0) goto L_0x0092
            ig1 r8 = r1.a
            gg1 r8 = r8.getId()
            goto L_0x0093
        L_0x0092:
            r8 = r3
        L_0x0093:
            boolean r7 = defpackage.tpa.f(r7, r8)
            r8 = r7 ^ 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r9 = "message"
            r5.put(r9, r8)
            if (r7 == 0) goto L_0x00a5
            goto L_0x00c0
        L_0x00a5:
            tt3 r7 = new tt3
            int r11 = defpackage.y7a.F
            int r8 = defpackage.b8a.Z1
            eqe r12 = new eqe
            r12.<init>(r8)
            int r8 = defpackage.x7a.c0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r15 = 20
            r14 = 0
            r10 = r7
            r10.<init>((int) r11, (defpackage.jqe) r12, (java.lang.Integer) r13, (java.lang.Integer) r14, (int) r15)
            r6.add(r7)
        L_0x00c0:
            gg1 r7 = r2.getId()
            if (r1 == 0) goto L_0x00cd
            ig1 r8 = r1.a
            gg1 r8 = r8.getId()
            goto L_0x00ce
        L_0x00cd:
            r8 = r3
        L_0x00ce:
            boolean r7 = defpackage.tpa.f(r7, r8)
            if (r7 == 0) goto L_0x00f5
            boolean r7 = r2.a()
            if (r7 == 0) goto L_0x00f5
            tt3 r7 = new tt3
            int r9 = defpackage.y7a.B
            int r8 = defpackage.b8a.c2
            eqe r10 = new eqe
            r10.<init>(r8)
            int r8 = defpackage.x7a.l0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r13 = 20
            r12 = 0
            r8 = r7
            r8.<init>((int) r9, (defpackage.jqe) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (int) r13)
            r6.add(r7)
        L_0x00f5:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            java.lang.String r8 = "pin"
            r5.put(r8, r7)
            if (r4 == 0) goto L_0x011c
            tt3 r4 = new tt3
            int r10 = defpackage.y7a.E
            int r7 = defpackage.b8a.b2
            eqe r11 = new eqe
            r11.<init>(r7)
            int r7 = defpackage.x7a.x0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r14 = 20
            r13 = 0
            r9 = r4
            r9.<init>((int) r10, (defpackage.jqe) r11, (java.lang.Integer) r12, (java.lang.Integer) r13, (int) r14)
            r6.add(r4)
            goto L_0x013a
        L_0x011c:
            tt3 r4 = new tt3
            int r16 = defpackage.y7a.D
            int r7 = defpackage.b8a.a2
            eqe r8 = new eqe
            r8.<init>(r7)
            int r7 = defpackage.x7a.f0
            java.lang.Integer r18 = java.lang.Integer.valueOf(r7)
            r20 = 20
            r19 = 0
            r15 = r4
            r17 = r8
            r15.<init>((int) r16, (defpackage.jqe) r17, (java.lang.Integer) r18, (java.lang.Integer) r19, (int) r20)
            r6.add(r4)
        L_0x013a:
            r4 = 0
            if (r0 == 0) goto L_0x02ab
            boolean r0 = r2.m()
            r7 = 1
            if (r0 == 0) goto L_0x015f
            if (r1 == 0) goto L_0x015f
            ig1 r0 = r1.a
            gg1 r8 = r0.getId()
            gg1 r9 = r2.getId()
            boolean r8 = defpackage.tpa.f(r8, r9)
            if (r8 != 0) goto L_0x015f
            boolean r0 = r0.isScreenCaptureEnabled()
            if (r0 != 0) goto L_0x015d
            goto L_0x015f
        L_0x015d:
            r0 = r4
            goto L_0x0160
        L_0x015f:
            r0 = r7
        L_0x0160:
            r8 = r0 ^ 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r9 = "screenshare"
            r5.put(r9, r8)
            if (r0 == 0) goto L_0x016e
            goto L_0x0189
        L_0x016e:
            tt3 r0 = new tt3
            int r11 = defpackage.y7a.Y0
            int r8 = defpackage.b8a.c1
            eqe r12 = new eqe
            r12.<init>(r8)
            int r8 = defpackage.x7a.q
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r15 = 20
            r14 = 0
            r10 = r0
            r10.<init>((int) r11, (defpackage.jqe) r12, (java.lang.Integer) r13, (java.lang.Integer) r14, (int) r15)
            r6.add(r0)
        L_0x0189:
            boolean r0 = r2.m()
            if (r0 == 0) goto L_0x01aa
            if (r1 == 0) goto L_0x01aa
            ig1 r0 = r1.a
            gg1 r8 = r0.getId()
            gg1 r9 = r2.getId()
            boolean r8 = defpackage.tpa.f(r8, r9)
            if (r8 != 0) goto L_0x01aa
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x01a8
            goto L_0x01aa
        L_0x01a8:
            r0 = r4
            goto L_0x01ab
        L_0x01aa:
            r0 = r7
        L_0x01ab:
            r8 = r0 ^ 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r9 = "microphone"
            r5.put(r9, r8)
            if (r0 == 0) goto L_0x01b9
            goto L_0x01d4
        L_0x01b9:
            tt3 r0 = new tt3
            int r11 = defpackage.y7a.X0
            int r8 = defpackage.b8a.b1
            eqe r12 = new eqe
            r12.<init>(r8)
            int r8 = defpackage.x7a.o
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r15 = 20
            r14 = 0
            r10 = r0
            r10.<init>((int) r11, (defpackage.jqe) r12, (java.lang.Integer) r13, (java.lang.Integer) r14, (int) r15)
            r6.add(r0)
        L_0x01d4:
            boolean r0 = r2.m()
            if (r0 == 0) goto L_0x01f5
            if (r1 == 0) goto L_0x01f5
            ig1 r0 = r1.a
            gg1 r8 = r0.getId()
            gg1 r9 = r2.getId()
            boolean r8 = defpackage.tpa.f(r8, r9)
            if (r8 != 0) goto L_0x01f5
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x01f3
            goto L_0x01f5
        L_0x01f3:
            r0 = r4
            goto L_0x01f6
        L_0x01f5:
            r0 = r7
        L_0x01f6:
            r8 = r0 ^ 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r9 = "camera"
            r5.put(r9, r8)
            if (r0 == 0) goto L_0x0204
            goto L_0x021f
        L_0x0204:
            tt3 r0 = new tt3
            int r11 = defpackage.y7a.W0
            int r8 = defpackage.b8a.a1
            eqe r12 = new eqe
            r12.<init>(r8)
            int r8 = defpackage.x7a.n
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r15 = 20
            r14 = 0
            r10 = r0
            r10.<init>((int) r11, (defpackage.jqe) r12, (java.lang.Integer) r13, (java.lang.Integer) r14, (int) r15)
            r6.add(r0)
        L_0x021f:
            boolean r0 = r2.m()
            if (r0 == 0) goto L_0x0259
            if (r1 == 0) goto L_0x0259
            ig1 r0 = r1.a
            gg1 r8 = r0.getId()
            gg1 r9 = r2.getId()
            boolean r8 = defpackage.tpa.f(r8, r9)
            if (r8 == 0) goto L_0x0238
            goto L_0x0259
        L_0x0238:
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0259
            tt3 r0 = new tt3
            int r9 = defpackage.y7a.C
            int r8 = defpackage.b8a.Y0
            eqe r10 = new eqe
            r10.<init>(r8)
            int r8 = defpackage.x7a.s
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r13 = 20
            r12 = 0
            r8 = r0
            r8.<init>((int) r9, (defpackage.jqe) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (int) r13)
            r6.add(r0)
        L_0x0259:
            boolean r0 = r2.m()
            if (r0 == 0) goto L_0x0279
            if (r1 == 0) goto L_0x0279
            ig1 r0 = r1.a
            gg1 r8 = r0.getId()
            gg1 r2 = r2.getId()
            boolean r2 = defpackage.tpa.f(r8, r2)
            if (r2 != 0) goto L_0x0279
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x0278
            goto L_0x0279
        L_0x0278:
            r7 = r4
        L_0x0279:
            r0 = r7 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r2 = "kick"
            r5.put(r2, r0)
            if (r7 == 0) goto L_0x0287
            goto L_0x02ab
        L_0x0287:
            int r9 = defpackage.y7a.V0
            int r0 = defpackage.b8a.Z0
            eqe r10 = new eqe
            r10.<init>(r0)
            int r0 = defpackage.x7a.p
            int r2 = defpackage.wfa.P
            int r7 = defpackage.wfa.U
            tt3 r14 = new tt3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            r8 = r14
            r8.<init>((int) r9, (defpackage.jqe) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (java.lang.Integer) r13)
            r6.add(r14)
        L_0x02ab:
            kl7 r0 = defpackage.j1e.d(r6)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r4)
            if (r1 == 0) goto L_0x02bc
            ig1 r1 = r1.a
            gg1 r3 = r1.getId()
        L_0x02bc:
            java.lang.String r1 = "call_participant_id"
            r2.putParcelable(r1, r3)
            v31 r1 = new v31
            r3 = r23
            r1.<init>(r2, r0, r5, r3)
            return r1
        L_0x02c9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo1.a(gg1, android.graphics.Point):v31");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        r13 = (defpackage.yz0) ((defpackage.ez0) r4.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
        r13 = (defpackage.yz0) ((defpackage.ez0) r4.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d1, code lost:
        r13 = (defpackage.yz0) ((defpackage.ez0) r4.getValue());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r13, android.os.Bundle r14) {
        /*
            r12 = this;
            int r0 = defpackage.y7a.V0
            java.lang.String r1 = "call_participant_id"
            r2 = 1
            if (r13 != r0) goto L_0x0037
            if (r14 == 0) goto L_0x01a1
            android.os.Parcelable r13 = r14.getParcelable(r1)
            gg1 r13 = (defpackage.gg1) r13
            if (r13 != 0) goto L_0x0013
            goto L_0x01a1
        L_0x0013:
            ir1 r14 = r12.b
            b31 r14 = r14.f
            l31 r14 = (defpackage.l31) r14
            q0e r14 = r14.k
            java.lang.Object r14 = r14.getValue()
            y21 r14 = (defpackage.y21) r14
            boolean r14 = r14.g
            r14 = r14 ^ r2
            if (r14 == 0) goto L_0x0032
            kld r12 = r12.i
            kj1 r14 = new kj1
            r14.<init>(r13)
            r12.g(r14)
            goto L_0x01a1
        L_0x0032:
            r12.d(r13)
            goto L_0x01a1
        L_0x0037:
            int r0 = defpackage.y7a.W0
            rd8 r3 = defpackage.rd8.b
            je7 r4 = r12.d
            if (r13 != r0) goto L_0x007e
            if (r14 == 0) goto L_0x01a1
            android.os.Parcelable r12 = r14.getParcelable(r1)
            gg1 r12 = (defpackage.gg1) r12
            if (r12 != 0) goto L_0x004b
            goto L_0x01a1
        L_0x004b:
            java.lang.Object r13 = r4.getValue()
            ez0 r13 = (defpackage.ez0) r13
            yz0 r13 = (defpackage.yz0) r13
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r4 = r13.e()
            if (r4 == 0) goto L_0x01a1
            ru.ok.android.externcalls.sdk.id.ParticipantId r6 = defpackage.mqa.d(r12)
            ky7 r14 = new ky7
            r14.<init>()
            qd8 r0 = defpackage.qd8.b
            r14.put(r0, r3)
            ky7 r5 = r14.b()
            fz0 r8 = new fz0
            r14 = 2
            r8.<init>(r13, r12, r14)
            mz0 r9 = new mz0
            r9.<init>(r13, r12, r14)
            r10 = 4
            r11 = 0
            r7 = 0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.updateMediaOptionsForParticipant$default(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x01a1
        L_0x007e:
            int r0 = defpackage.y7a.X0
            if (r13 != r0) goto L_0x00c1
            if (r14 == 0) goto L_0x01a1
            android.os.Parcelable r12 = r14.getParcelable(r1)
            gg1 r12 = (defpackage.gg1) r12
            if (r12 != 0) goto L_0x008e
            goto L_0x01a1
        L_0x008e:
            java.lang.Object r13 = r4.getValue()
            ez0 r13 = (defpackage.ez0) r13
            yz0 r13 = (defpackage.yz0) r13
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r4 = r13.e()
            if (r4 == 0) goto L_0x01a1
            ru.ok.android.externcalls.sdk.id.ParticipantId r6 = defpackage.mqa.d(r12)
            ky7 r14 = new ky7
            r14.<init>()
            qd8 r0 = defpackage.qd8.a
            r14.put(r0, r3)
            ky7 r5 = r14.b()
            fz0 r8 = new fz0
            r14 = 1
            r8.<init>(r13, r12, r14)
            mz0 r9 = new mz0
            r9.<init>(r13, r12, r14)
            r10 = 4
            r11 = 0
            r7 = 0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.updateMediaOptionsForParticipant$default(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x01a1
        L_0x00c1:
            int r0 = defpackage.y7a.Y0
            if (r13 != r0) goto L_0x0104
            if (r14 == 0) goto L_0x01a1
            android.os.Parcelable r12 = r14.getParcelable(r1)
            gg1 r12 = (defpackage.gg1) r12
            if (r12 != 0) goto L_0x00d1
            goto L_0x01a1
        L_0x00d1:
            java.lang.Object r13 = r4.getValue()
            ez0 r13 = (defpackage.ez0) r13
            yz0 r13 = (defpackage.yz0) r13
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r4 = r13.e()
            if (r4 == 0) goto L_0x01a1
            ru.ok.android.externcalls.sdk.id.ParticipantId r6 = defpackage.mqa.d(r12)
            ky7 r14 = new ky7
            r14.<init>()
            qd8 r0 = defpackage.qd8.c
            r14.put(r0, r3)
            ky7 r5 = r14.b()
            fz0 r8 = new fz0
            r14 = 0
            r8.<init>(r13, r12, r14)
            mz0 r9 = new mz0
            r9.<init>(r13, r12, r14)
            r10 = 4
            r11 = 0
            r7 = 0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.updateMediaOptionsForParticipant$default(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x01a1
        L_0x0104:
            int r0 = defpackage.y7a.D
            if (r13 != r0) goto L_0x0119
            if (r14 == 0) goto L_0x01a1
            android.os.Parcelable r13 = r14.getParcelable(r1)
            gg1 r13 = (defpackage.gg1) r13
            if (r13 != 0) goto L_0x0114
            goto L_0x01a1
        L_0x0114:
            r12.c(r13)
            goto L_0x01a1
        L_0x0119:
            int r0 = defpackage.y7a.E
            if (r13 != r0) goto L_0x012e
            if (r14 == 0) goto L_0x01a1
            android.os.Parcelable r13 = r14.getParcelable(r1)
            gg1 r13 = (defpackage.gg1) r13
            if (r13 != 0) goto L_0x0129
            goto L_0x01a1
        L_0x0129:
            r12.c(r13)
            goto L_0x01a1
        L_0x012e:
            int r0 = defpackage.y7a.B
            if (r13 != r0) goto L_0x0136
            r12.e()
            goto L_0x01a1
        L_0x0136:
            int r0 = defpackage.y7a.F
            r3 = 0
            if (r13 != r0) goto L_0x0174
            if (r14 == 0) goto L_0x01a1
            android.os.Parcelable r13 = r14.getParcelable(r1)
            gg1 r13 = (defpackage.gg1) r13
            if (r13 != 0) goto L_0x0146
            goto L_0x01a1
        L_0x0146:
            k56 r14 = r12.a
            java.lang.Object r14 = r14.invoke()
            sx3 r14 = (defpackage.sx3) r14
            je7 r0 = r12.c
            java.lang.Object r0 = r0.getValue()
            kke r0 = (defpackage.kke) r0
            w9a r0 = (defpackage.w9a) r0
            nx3 r0 = r0.b()
            vx3 r1 = defpackage.vx3.b
            co1 r4 = new co1
            r5 = 0
            long r6 = r13.a
            r4.<init>(r12, r6, r5)
            vxd r13 = defpackage.j47.S(r14, r0, r1, r4)
            bc7[] r14 = k
            r14 = r14[r3]
            w4d r0 = r12.h
            r0.o1(r12, r14, r13)
            goto L_0x01a1
        L_0x0174:
            int r12 = defpackage.y7a.C
            if (r13 != r12) goto L_0x01a0
            if (r14 == 0) goto L_0x01a1
            android.os.Parcelable r12 = r14.getParcelable(r1)
            gg1 r12 = (defpackage.gg1) r12
            if (r12 != 0) goto L_0x0183
            goto L_0x01a1
        L_0x0183:
            java.lang.Object r13 = r4.getValue()
            ez0 r13 = (defpackage.ez0) r13
            yz0 r13 = (defpackage.yz0) r13
            ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager r14 = r13.f()
            if (r14 == 0) goto L_0x0198
            ru.ok.android.externcalls.sdk.id.ParticipantId r12 = defpackage.mqa.d(r12)
            r14.lowerHandParticipant(r12)
        L_0x0198:
            kld r12 = r13.C0
            gb r13 = defpackage.gb.a
            r12.g(r13)
            goto L_0x01a1
        L_0x01a0:
            r2 = r3
        L_0x01a1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo1.b(int, android.os.Bundle):boolean");
    }

    public final void c(gg1 gg1) {
        ir1 ir1 = this.b;
        boolean z = ((d04) ir1.b().getValue()).e;
        if (!gg1.equals(gg1.c) && ((d04) ir1.b().getValue()).h && z) {
            ir1.i(gg1, false);
        }
    }

    public final void d(gg1 gg1) {
        String name;
        fqa fqa = (fqa) ((pqa) ((w7c) this.b.e()).a.getValue()).c.get(gg1);
        if (fqa != null && (name = fqa.b.getName()) != null) {
            kld kld = this.i;
            uj1 uj1 = wj1.b;
            kld.g(new vj1(new gqe(b8a.R0, ys.m0(new Object[]{name})), new a81(this, gg1, name, 1)));
        }
    }

    public final void e() {
        ir1 ir1 = this.b;
        bt1 bt1 = (bt1) ir1.m.getValue();
        String str = ir1.c().c;
        r21 r21 = ir1.e;
        long j2 = r21.b() ? 2 : 1;
        boolean z = ir1.c().h;
        bt1.getClass();
        bt1.c(bt1, "CAMERA_CHANGED", str, (String) null, Long.valueOf(j2), (String) null, (String) null, z, 52);
        int i2 = r21.b() ? 2 : 1;
        CameraManager a2 = r21.a();
        if (a2 != null) {
            a2.switchCamera(new jx1(i2));
        }
    }
}
