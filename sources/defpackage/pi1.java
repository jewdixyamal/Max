package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: pi1  reason: default package */
public final class pi1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pi1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.Y = callScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((pi1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pi1 pi1 = new pi1(continuation, this.Y);
        pi1.X = obj;
        return pi1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: android.media.projection.MediaProjectionManager} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [znc] */
    /* JADX WARNING: type inference failed for: r6v3, types: [znc] */
    /* JADX WARNING: type inference failed for: r6v5, types: [znc] */
    /* JADX WARNING: type inference failed for: r6v7, types: [znc] */
    /* JADX WARNING: type inference failed for: r6v9, types: [znc] */
    /* JADX WARNING: type inference failed for: r6v11, types: [znc] */
    /* JADX WARNING: type inference failed for: r6v19, types: [znc] */
    /* JADX WARNING: type inference failed for: r6v21, types: [znc] */
    /* JADX WARNING: type inference failed for: r6v23 */
    /* JADX WARNING: type inference failed for: r6v24 */
    /* JADX WARNING: type inference failed for: r6v25 */
    /* JADX WARNING: type inference failed for: r6v26 */
    /* JADX WARNING: type inference failed for: r6v27 */
    /* JADX WARNING: type inference failed for: r6v28 */
    /* JADX WARNING: type inference failed for: r6v29 */
    /* JADX WARNING: type inference failed for: r6v30 */
    /* JADX WARNING: type inference failed for: r6v31 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 3
            r2 = 2
            r3 = 1
            defpackage.od2.a0(r18)
            java.lang.Object r4 = r0.X
            wm9 r4 = (defpackage.wm9) r4
            boolean r5 = r4 instanceof defpackage.wj1
            if (r5 == 0) goto L_0x04da
            wj1 r4 = (defpackage.wj1) r4
            yxc r5 = one.me.calls.ui.ui.call.CallScreen.R0
            one.me.calls.ui.ui.call.CallScreen r0 = r0.Y
            r0.getClass()
            boolean r5 = r4 instanceof defpackage.gj1
            r6 = 0
            r7 = 0
            java.lang.String r8 = "BottomSheetWidget"
            if (r5 == 0) goto L_0x005d
            bc7[] r1 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet r10 = new one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet
            r10.<init>()
            r10.setTargetController(r0)
            r1 = r0
        L_0x002c:
            uu3 r2 = r1.getParentController()
            if (r2 == 0) goto L_0x0037
            uu3 r1 = r1.getParentController()
            goto L_0x002c
        L_0x0037:
            boolean r2 = r1 instanceof defpackage.foc
            if (r2 == 0) goto L_0x003e
            foc r1 = (defpackage.foc) r1
            goto L_0x003f
        L_0x003e:
            r1 = r6
        L_0x003f:
            if (r1 == 0) goto L_0x0045
            znc r6 = r1.T()
        L_0x0045:
            r10.z0(r0)
            if (r6 == 0) goto L_0x04e5
            coc r0 = new coc
            r12 = 0
            r15 = -1
            r11 = 0
            r13 = 0
            r14 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            defpackage.wg0.l(r7, r0, r3, r8)
            r6.G(r0)
            goto L_0x04e5
        L_0x005d:
            boolean r5 = r4 instanceof defpackage.kj1
            if (r5 == 0) goto L_0x00ab
            bc7[] r1 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet r10 = new one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet
            kj1 r4 = (defpackage.kj1) r4
            gg1 r1 = r4.D
            uv3 r2 = r0.z0()
            ov3 r2 = r2.k
            int r2 = r2.b()
            r10.<init>(r1, r2)
            r10.setTargetController(r0)
            r1 = r0
        L_0x007a:
            uu3 r2 = r1.getParentController()
            if (r2 == 0) goto L_0x0085
            uu3 r1 = r1.getParentController()
            goto L_0x007a
        L_0x0085:
            boolean r2 = r1 instanceof defpackage.foc
            if (r2 == 0) goto L_0x008c
            foc r1 = (defpackage.foc) r1
            goto L_0x008d
        L_0x008c:
            r1 = r6
        L_0x008d:
            if (r1 == 0) goto L_0x0093
            znc r6 = r1.T()
        L_0x0093:
            r10.z0(r0)
            if (r6 == 0) goto L_0x04e5
            coc r0 = new coc
            r12 = 0
            r15 = -1
            r11 = 0
            r13 = 0
            r14 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            defpackage.wg0.l(r7, r0, r3, r8)
            r6.G(r0)
            goto L_0x04e5
        L_0x00ab:
            boolean r5 = r4 instanceof defpackage.tj1
            if (r5 == 0) goto L_0x00e1
            tj1 r4 = (defpackage.tj1) r4
            v31 r1 = r4.D
            qt3 r2 = defpackage.dy7.c(r3)
            qt3 r2 = r2.y()
            android.os.Bundle r3 = r1.a
            qt3 r2 = r2.S(r3)
            qt3 r2 = r2.s()
            android.graphics.Point r3 = r1.d
            if (r3 == 0) goto L_0x00d2
            int r4 = r3.x
            float r4 = (float) r4
            int r3 = r3.y
            float r3 = (float) r3
            r2.L(r4, r3)
        L_0x00d2:
            java.util.List r1 = r1.b
            qt3 r1 = r2.I(r1)
            rt3 r1 = r1.build()
            r1.q(r0)
            goto L_0x04e5
        L_0x00e1:
            boolean r5 = r4 instanceof defpackage.uj1
            je7 r9 = r0.P0
            if (r5 == 0) goto L_0x0108
            java.lang.Object r1 = r9.getValue()
            tnd r1 = (defpackage.tnd) r1
            uj1 r4 = (defpackage.uj1) r4
            uv3 r3 = r0.z0()
            ov3 r3 = r3.k
            int r3 = r3.b()
            r1.getClass()
            dj1 r1 = defpackage.dj1.a
            s25 r5 = new s25
            r5.<init>(r4, r0, r3, r2)
            defpackage.tnd.b(r1, r5)
            goto L_0x04e5
        L_0x0108:
            boolean r5 = r4 instanceof defpackage.vj1
            if (r5 == 0) goto L_0x012d
            java.lang.Object r1 = r9.getValue()
            tnd r1 = (defpackage.tnd) r1
            vj1 r4 = (defpackage.vj1) r4
            uv3 r2 = r0.z0()
            ov3 r2 = r2.k
            int r2 = r2.b()
            r1.getClass()
            dj1 r1 = defpackage.dj1.b
            s25 r5 = new s25
            r5.<init>(r0, r4, r2, r3)
            defpackage.tnd.b(r1, r5)
            goto L_0x04e5
        L_0x012d:
            boolean r5 = r4 instanceof defpackage.ij1
            if (r5 == 0) goto L_0x0180
            el1 r1 = r0.D0()
            la1 r1 = r1.s()
            m31 r1 = r1.f
            if (r1 == 0) goto L_0x0140
            java.lang.Long r1 = r1.a
            goto L_0x0141
        L_0x0140:
            r1 = r6
        L_0x0141:
            if (r1 == 0) goto L_0x04e5
            bt1 r7 = r0.y0()
            el1 r2 = r0.D0()
            la1 r2 = r2.s()
            java.lang.String r9 = r2.a
            el1 r0 = r0.D0()
            la1 r0 = r0.s()
            boolean r14 = r0.g
            r7.getClass()
            r12 = 0
            r13 = 0
            java.lang.String r8 = "PROFILE_OPENED"
            r10 = 0
            r11 = 0
            r15 = 60
            defpackage.bt1.c(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            je1 r0 = defpackage.je1.c
            long r1 = r1.longValue()
            f64 r0 = r0.P1()
            java.lang.String r3 = ":profile?id="
            java.lang.String r4 = "&type=local_chat"
            java.lang.String r1 = defpackage.ey8.i(r1, r3, r4)
            r0.b(r1, r6)
            goto L_0x04e5
        L_0x0180:
            boolean r5 = r4 instanceof defpackage.hj1
            if (r5 == 0) goto L_0x01df
            el1 r0 = r0.D0()
            la1 r1 = r0.s()
            m31 r1 = r1.f
            if (r1 == 0) goto L_0x04e5
            java.lang.Long r1 = r1.a
            if (r1 == 0) goto L_0x04e5
            long r1 = r1.longValue()
            je7 r3 = r0.v0
            java.lang.Object r3 = r3.getValue()
            r4 = r3
            bt1 r4 = (defpackage.bt1) r4
            la1 r3 = r0.s()
            java.lang.String r6 = r3.a
            la1 r3 = r0.s()
            boolean r11 = r3.g
            r4.getClass()
            r8 = 0
            r12 = 60
            java.lang.String r5 = "CHAT_OPENED"
            r7 = 0
            r9 = 0
            r10 = 0
            defpackage.bt1.c(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            je1 r3 = defpackage.je1.c
            r3.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ":chats?id="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "&type=local"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            c64 r2 = new c64
            r2.<init>(r1)
            s35 r0 = r0.M0
            defpackage.pnf.o(r0, r2)
            goto L_0x04e5
        L_0x01df:
            boolean r5 = r4 instanceof defpackage.aj1
            if (r5 == 0) goto L_0x01e8
            r0.s0(r3)
            goto L_0x04e5
        L_0x01e8:
            boolean r5 = r4 instanceof defpackage.rj1
            if (r5 == 0) goto L_0x023d
            rj1 r4 = (defpackage.rj1) r4
            boolean r1 = r4.D
            el1 r2 = r0.D0()
            la1 r2 = r2.s()
            ak1 r2 = r2.i
            boolean r2 = r2.a()
            if (r1 != 0) goto L_0x020b
            if (r2 == 0) goto L_0x020b
            el1 r0 = r0.D0()
            r0.w(r7, r6)
            goto L_0x04e5
        L_0x020b:
            if (r1 == 0) goto L_0x0211
            if (r2 == 0) goto L_0x0211
            goto L_0x04e5
        L_0x0211:
            im r1 = r0.requireActivity()
            java.lang.String r2 = "media_projection"
            java.lang.Object r1 = r1.getSystemService(r2)
            boolean r2 = r1 instanceof android.media.projection.MediaProjectionManager
            if (r2 == 0) goto L_0x0222
            r6 = r1
            android.media.projection.MediaProjectionManager r6 = (android.media.projection.MediaProjectionManager) r6
        L_0x0222:
            if (r6 != 0) goto L_0x0234
            el1 r0 = r0.D0()
            r0.getClass()
            uj1 r1 = defpackage.wj1.q
            s35 r0 = r0.M0
            defpackage.pnf.o(r0, r1)
            goto L_0x04e5
        L_0x0234:
            android.content.Intent r1 = r6.createScreenCaptureIntent()
            r0.startActivityForResult(r1, r3)
            goto L_0x04e5
        L_0x023d:
            boolean r5 = r4 instanceof defpackage.mj1
            if (r5 == 0) goto L_0x02c0
            el1 r0 = r0.D0()
            mj1 r4 = (defpackage.mj1) r4
            java.lang.CharSequence r1 = r4.D
            ir1 r0 = r0.c
            r0.getClass()
            ru.ok.android.externcalls.sdk.record.RecordManager$StartParams$Builder r2 = new ru.ok.android.externcalls.sdk.record.RecordManager$StartParams$Builder
            r2.<init>()
            ru.ok.android.externcalls.sdk.record.RecordManager$StartParams$Builder r2 = r2.isStream(r7)
            ru.ok.android.externcalls.sdk.record.RecordManager$StartParams$Builder r1 = r2.withName(r1)
            ru.ok.android.externcalls.sdk.record.RecordManager$StartParams r3 = r1.build()
            lvc r0 = r0.i
            vvc r0 = (defpackage.vvc) r0
            r0.getClass()
            java.lang.String r1 = "startRecordBroadcast"
            java.lang.String r2 = "ScreenRecordControllerTag"
            defpackage.hm9.h0(r2, r1, new java.lang.Object[0])
            java.util.concurrent.locks.ReentrantLock r1 = r0.Z
            r1.lock()
            q0e r4 = r0.t0     // Catch:{ all -> 0x028a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x028a }
            wvc r4 = (defpackage.wvc) r4     // Catch:{ all -> 0x028a }
            xvc r4 = r4.a     // Catch:{ all -> 0x028a }
            xvc r5 = defpackage.xvc.a     // Catch:{ all -> 0x028a }
            if (r4 != r5) goto L_0x028c
            java.lang.String r0 = "startRecordBroadcast already started"
            defpackage.hm9.h0(r2, r0, new java.lang.Object[0])     // Catch:{ all -> 0x028a }
            r1.unlock()
            goto L_0x04e5
        L_0x028a:
            r0 = move-exception
            goto L_0x02bc
        L_0x028c:
            je7 r2 = r0.X     // Catch:{ all -> 0x028a }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x028a }
            r4 = r2
            bt1 r4 = (defpackage.bt1) r4     // Catch:{ all -> 0x028a }
            r4.getClass()     // Catch:{ all -> 0x028a }
            r5 = 1
            java.lang.Long r8 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x028a }
            java.lang.String r5 = "CALL_RECORDING"
            r9 = 0
            r12 = 54
            r10 = 0
            r11 = 1
            r6 = 0
            r7 = 0
            defpackage.bt1.c(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x028a }
            ru.ok.android.externcalls.sdk.record.RecordManager r2 = r0.b()     // Catch:{ all -> 0x028a }
            if (r2 == 0) goto L_0x02b7
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            ru.ok.android.externcalls.sdk.record.RecordManager.startRecord$default(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x028a }
        L_0x02b7:
            r1.unlock()
            goto L_0x04e5
        L_0x02bc:
            r1.unlock()
            throw r0
        L_0x02c0:
            boolean r5 = r4 instanceof defpackage.cj1
            if (r5 == 0) goto L_0x02c9
            r0.s0(r7)
            goto L_0x04e5
        L_0x02c9:
            boolean r5 = r4 instanceof defpackage.bj1
            if (r5 == 0) goto L_0x02dc
            el1 r0 = r0.D0()
            bj1 r4 = (defpackage.bj1) r4
            nnf r1 = r4.D
            ir1 r0 = r0.c
            r0.a(r1)
            goto L_0x04e5
        L_0x02dc:
            boolean r5 = r4 instanceof defpackage.sj1
            java.lang.String r9 = r0.s0
            if (r5 == 0) goto L_0x02f3
            je1 r0 = defpackage.je1.c
            f64 r0 = r0.P1()
            java.lang.String r1 = ":call-opponents-list?arg_key_scope_id="
            java.lang.String r1 = r1.concat(r9)
            r0.b(r1, r6)
            goto L_0x04e5
        L_0x02f3:
            boolean r5 = r4 instanceof defpackage.ej1
            if (r5 == 0) goto L_0x032f
            ej1 r4 = (defpackage.ej1) r4
            java.lang.String r2 = r4.D
            android.content.Context r3 = r0.getContext()
            defpackage.tpa.o(r3, r2)
            boolean r2 = defpackage.tpa.s()
            if (r2 == 0) goto L_0x04e5
            android.content.Context r2 = r0.getContext()
            int r3 = defpackage.f0c.call_link_share_dialog_share_link_copy
            java.lang.String r2 = r2.getString(r3)
            wha r3 = new wha
            r3.<init>((one.me.sdk.arch.Widget) r0)
            r3.h(r2)
            ho1 r0 = new ho1
            r0.<init>(r1, r6)
            r3.d(r0)
            eia r0 = new eia
            r0.<init>(r7, r7, r7, r1)
            r3.c(r0)
            r3.i()
            goto L_0x04e5
        L_0x032f:
            boolean r1 = r4 instanceof defpackage.oj1
            if (r1 == 0) goto L_0x036e
            bc7[] r1 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet r11 = new one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet
            be1 r1 = defpackage.be1.b
            r11.<init>(r9, r1, r6)
            r11.setTargetController(r0)
        L_0x033f:
            uu3 r1 = r0.getParentController()
            if (r1 == 0) goto L_0x034a
            uu3 r0 = r0.getParentController()
            goto L_0x033f
        L_0x034a:
            boolean r1 = r0 instanceof defpackage.foc
            if (r1 == 0) goto L_0x0351
            foc r0 = (defpackage.foc) r0
            goto L_0x0352
        L_0x0351:
            r0 = r6
        L_0x0352:
            if (r0 == 0) goto L_0x0358
            znc r6 = r0.T()
        L_0x0358:
            if (r6 == 0) goto L_0x04e5
            coc r0 = new coc
            r13 = 0
            r16 = -1
            r12 = 0
            r14 = 0
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            defpackage.wg0.l(r7, r0, r3, r8)
            r6.G(r0)
            goto L_0x04e5
        L_0x036e:
            boolean r1 = r4 instanceof defpackage.lj1
            if (r1 == 0) goto L_0x03b3
            bc7[] r1 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet r11 = new one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet
            lj1 r4 = (defpackage.lj1) r4
            gg1 r1 = r4.D
            r11.<init>(r9, r1, r6)
            r11.setTargetController(r0)
            r1 = r0
        L_0x0381:
            uu3 r2 = r1.getParentController()
            if (r2 == 0) goto L_0x038c
            uu3 r1 = r1.getParentController()
            goto L_0x0381
        L_0x038c:
            boolean r2 = r1 instanceof defpackage.foc
            if (r2 == 0) goto L_0x0393
            foc r1 = (defpackage.foc) r1
            goto L_0x0394
        L_0x0393:
            r1 = r6
        L_0x0394:
            if (r1 == 0) goto L_0x039a
            znc r6 = r1.T()
        L_0x039a:
            r11.z0(r0)
            if (r6 == 0) goto L_0x04e5
            coc r0 = new coc
            r13 = 0
            r16 = -1
            r12 = 0
            r14 = 0
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            defpackage.wg0.l(r7, r0, r3, r8)
            r6.G(r0)
            goto L_0x04e5
        L_0x03b3:
            boolean r1 = r4 instanceof defpackage.nj1
            if (r1 == 0) goto L_0x03f4
            bc7[] r1 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet r11 = new one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet
            r11.<init>(r9, r6)
            r11.setTargetController(r0)
            r1 = r0
        L_0x03c2:
            uu3 r2 = r1.getParentController()
            if (r2 == 0) goto L_0x03cd
            uu3 r1 = r1.getParentController()
            goto L_0x03c2
        L_0x03cd:
            boolean r2 = r1 instanceof defpackage.foc
            if (r2 == 0) goto L_0x03d4
            foc r1 = (defpackage.foc) r1
            goto L_0x03d5
        L_0x03d4:
            r1 = r6
        L_0x03d5:
            if (r1 == 0) goto L_0x03db
            znc r6 = r1.T()
        L_0x03db:
            r11.z0(r0)
            if (r6 == 0) goto L_0x04e5
            coc r0 = new coc
            r13 = 0
            r16 = -1
            r12 = 0
            r14 = 0
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            defpackage.wg0.l(r7, r0, r3, r8)
            r6.G(r0)
            goto L_0x04e5
        L_0x03f4:
            boolean r1 = r4 instanceof defpackage.pj1
            if (r1 == 0) goto L_0x0436
            bc7[] r1 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet r10 = new one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet
            ccc r1 = defpackage.ccc.b
            r10.<init>(r1, r6, r2, r6)
            r10.setTargetController(r0)
            r1 = r0
        L_0x0405:
            uu3 r2 = r1.getParentController()
            if (r2 == 0) goto L_0x0410
            uu3 r1 = r1.getParentController()
            goto L_0x0405
        L_0x0410:
            boolean r2 = r1 instanceof defpackage.foc
            if (r2 == 0) goto L_0x0417
            foc r1 = (defpackage.foc) r1
            goto L_0x0418
        L_0x0417:
            r1 = r6
        L_0x0418:
            if (r1 == 0) goto L_0x041e
            znc r6 = r1.T()
        L_0x041e:
            r10.z0(r0)
            if (r6 == 0) goto L_0x04e5
            coc r0 = new coc
            r12 = 0
            r15 = -1
            r11 = 0
            r13 = 0
            r14 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            defpackage.wg0.l(r7, r0, r3, r8)
            r6.G(r0)
            goto L_0x04e5
        L_0x0436:
            boolean r1 = r4 instanceof defpackage.fj1
            if (r1 == 0) goto L_0x0478
            bc7[] r1 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet r10 = new one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet
            ccc r1 = defpackage.ccc.a
            r10.<init>(r1, r6, r2, r6)
            r10.setTargetController(r0)
            r1 = r0
        L_0x0447:
            uu3 r2 = r1.getParentController()
            if (r2 == 0) goto L_0x0452
            uu3 r1 = r1.getParentController()
            goto L_0x0447
        L_0x0452:
            boolean r2 = r1 instanceof defpackage.foc
            if (r2 == 0) goto L_0x0459
            foc r1 = (defpackage.foc) r1
            goto L_0x045a
        L_0x0459:
            r1 = r6
        L_0x045a:
            if (r1 == 0) goto L_0x0460
            znc r6 = r1.T()
        L_0x0460:
            r10.z0(r0)
            if (r6 == 0) goto L_0x04e5
            coc r0 = new coc
            r12 = 0
            r15 = -1
            r11 = 0
            r13 = 0
            r14 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            defpackage.wg0.l(r7, r0, r3, r8)
            r6.G(r0)
            goto L_0x04e5
        L_0x0478:
            boolean r1 = r4 instanceof defpackage.jj1
            if (r1 == 0) goto L_0x04b6
            bc7[] r1 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet r11 = new one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet
            be1 r1 = defpackage.be1.a
            r11.<init>(r9, r1, r6)
            r11.setTargetController(r0)
        L_0x0488:
            uu3 r1 = r0.getParentController()
            if (r1 == 0) goto L_0x0493
            uu3 r0 = r0.getParentController()
            goto L_0x0488
        L_0x0493:
            boolean r1 = r0 instanceof defpackage.foc
            if (r1 == 0) goto L_0x049a
            foc r0 = (defpackage.foc) r0
            goto L_0x049b
        L_0x049a:
            r0 = r6
        L_0x049b:
            if (r0 == 0) goto L_0x04a1
            znc r6 = r0.T()
        L_0x04a1:
            if (r6 == 0) goto L_0x04e5
            coc r0 = new coc
            r13 = 0
            r16 = -1
            r12 = 0
            r14 = 0
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            defpackage.wg0.l(r7, r0, r3, r8)
            r6.G(r0)
            goto L_0x04e5
        L_0x04b6:
            boolean r1 = r4 instanceof defpackage.qj1
            if (r1 == 0) goto L_0x04d4
            je1 r1 = defpackage.je1.c
            android.content.Context r0 = r0.getContext()
            int r2 = defpackage.b8a.O1
            java.lang.String r0 = r0.getString(r2)
            qj1 r4 = (defpackage.qj1) r4
            java.lang.String r2 = r4.D
            java.lang.Class<one.me.calls.ui.ui.call.CallScreen> r3 = one.me.calls.ui.ui.call.CallScreen.class
            java.lang.String r3 = r3.getName()
            r1.Z1(r2, r0, r3)
            goto L_0x04e5
        L_0x04d4:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04da:
            boolean r0 = r4 instanceof defpackage.c64
            if (r0 == 0) goto L_0x04e5
            je1 r0 = defpackage.je1.c
            c64 r4 = (defpackage.c64) r4
            r0.R1(r4)
        L_0x04e5:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi1.o(java.lang.Object):java.lang.Object");
    }
}
