package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: lcb  reason: default package */
public final class lcb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileChangeLinkScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lcb(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.Y = profileChangeLinkScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lcb) n((vcb) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lcb lcb = new lcb(continuation, this.Y);
        lcb.X = obj;
        return lcb;
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [znc] */
    /* JADX WARNING: type inference failed for: r8v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            defpackage.od2.a0(r19)
            java.lang.Object r2 = r0.X
            vcb r2 = (defpackage.vcb) r2
            boolean r3 = r2 instanceof defpackage.tcb
            e5f r4 = defpackage.e5f.a
            r5 = 1
            r6 = 2
            one.me.profileedit.screens.changelink.ProfileChangeLinkScreen r0 = r0.Y
            if (r3 == 0) goto L_0x003c
            defpackage.mr0.G(r0)
            qt3 r1 = defpackage.dy7.c(r5)
            tcb r2 = (defpackage.tcb) r2
            java.util.List r2 = r2.b
            qt3 r1 = r1.I(r2)
            bc7[] r2 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.v0
            r2 = r2[r6]
            q7c r3 = r0.Z
            java.lang.Object r2 = r3.T0(r0, r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            qt3 r1 = r1.Y(r2)
            rt3 r1 = r1.build()
            r1.q(r0)
            goto L_0x01ef
        L_0x003c:
            boolean r3 = r2 instanceof defpackage.ucb
            r7 = 6
            r8 = 0
            if (r3 == 0) goto L_0x00d1
            ucb r2 = (defpackage.ucb) r2
            jqe r3 = r2.b
            if (r3 == 0) goto L_0x00d0
            android.content.Context r9 = r0.getContext()
            java.lang.CharSequence r3 = r3.b(r9)
            if (r3 != 0) goto L_0x0054
            goto L_0x00d0
        L_0x0054:
            jqe r9 = r2.c
            if (r9 == 0) goto L_0x0060
            android.content.Context r8 = r0.getContext()
            java.lang.CharSequence r8 = r9.b(r8)
        L_0x0060:
            wha r9 = new wha
            r9.<init>((one.me.sdk.arch.Widget) r0)
            r9.h(r3)
            r9.b(r8)
            boolean r3 = r2.d
            if (r3 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r5 = r6
        L_0x0071:
            uia r10 = r9.b
            eia r3 = r10.X
            eia r15 = defpackage.eia.a(r3, r5, r1, r1, r7)
            r13 = 0
            r17 = 47
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            uia r3 = defpackage.uia.a(r10, r11, r12, r13, r14, r15, r16, r17)
            r9.b = r3
            eia r3 = new eia
            one.me.sdk.uikit.common.button.OneMeButton r5 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.m0(r0)
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x00b0
            one.me.sdk.uikit.common.button.OneMeButton r0 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.m0(r0)
            int r0 = r0.getMeasuredHeight()
            r5 = 12
            float r5 = (float) r5
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r5 = r5 * r7
            int r5 = defpackage.tu0.G(r5)
            int r5 = r5 * r6
            int r5 = r5 + r0
            goto L_0x00b1
        L_0x00b0:
            r5 = r1
        L_0x00b1:
            r0 = 3
            r3.<init>(r1, r1, r5, r0)
            r9.c(r3)
            java.lang.Integer r0 = r2.e
            if (r0 == 0) goto L_0x00c6
            kia r1 = new kia
            int r0 = r0.intValue()
            r1.<init>(r0)
            goto L_0x00c8
        L_0x00c6:
            lia r1 = defpackage.lia.a
        L_0x00c8:
            r9.e(r1)
            r9.i()
            goto L_0x01ef
        L_0x00d0:
            return r4
        L_0x00d1:
            boolean r3 = r2 instanceof defpackage.rcb
            if (r3 == 0) goto L_0x012f
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r3 = "android.intent.action.SEND"
            r1.setAction(r3)
            rcb r2 = (defpackage.rcb) r2
            jqe r2 = r2.b
            android.content.Context r3 = r0.getContext()
            java.lang.CharSequence r2 = r2.b(r3)
            java.lang.String r3 = "android.intent.extra.TEXT"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "text/plain"
            r1.setType(r2)
            gfb r2 = defpackage.gfb.c
            int r3 = defpackage.vea.Q1
            android.content.Context r0 = r0.getContext()
            java.lang.String r0 = defpackage.z7.B(r0, r3)
            java.lang.Class<one.me.profileedit.screens.changelink.ProfileChangeLinkScreen> r3 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.class
            java.lang.String r3 = r3.getName()
            f64 r2 = r2.P1()
            kpa r5 = new kpa
            java.lang.String r6 = "oneme:share:data"
            r5.<init>(r6, r1)
            kpa r1 = new kpa
            java.lang.String r6 = "oneme:share:title"
            r1.<init>(r6, r0)
            kpa r0 = new kpa
            java.lang.String r6 = "tag"
            r0.<init>(r6, r3)
            kpa[] r0 = new defpackage.kpa[]{r5, r1, r0}
            android.os.Bundle r0 = defpackage.dy7.g(r0)
            java.lang.String r1 = ":chats/share"
            r2.b(r1, r0)
            goto L_0x01ef
        L_0x012f:
            boolean r3 = r2 instanceof defpackage.ocb
            if (r3 == 0) goto L_0x014e
            android.content.Context r0 = r0.getContext()
            ocb r2 = (defpackage.ocb) r2
            java.lang.String r1 = r2.b
            java.lang.String r2 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            java.lang.String r2 = "Copied Text"
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r2, r1)
            r0.setPrimaryClip(r1)
            goto L_0x01ef
        L_0x014e:
            boolean r3 = r2 instanceof defpackage.scb
            if (r3 == 0) goto L_0x01b8
            bc7[] r3 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            scb r2 = (defpackage.scb) r2
            jqe r3 = r2.b
            lg3 r3 = defpackage.od2.a(r3, r8, r7)
            jqe r6 = r2.c
            r3.f(r6)
            jk2 r6 = new jk2
            java.lang.String r14 = "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;"
            r15 = 8
            r10 = 1
            java.lang.Class<lg3> r12 = defpackage.lg3.class
            java.lang.String r13 = "addButton"
            r16 = 8
            r9 = r6
            r11 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            hk2 r7 = new hk2
            r9 = 7
            r7.<init>(r6, r9)
            java.util.List r2 = r2.d
            r2.forEach(r7)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r10 = r3.e()
            r10.setTargetController(r0)
            r2 = r0
        L_0x0186:
            uu3 r3 = r2.getParentController()
            if (r3 == 0) goto L_0x0191
            uu3 r2 = r2.getParentController()
            goto L_0x0186
        L_0x0191:
            boolean r3 = r2 instanceof defpackage.foc
            if (r3 == 0) goto L_0x0198
            foc r2 = (defpackage.foc) r2
            goto L_0x0199
        L_0x0198:
            r2 = r8
        L_0x0199:
            if (r2 == 0) goto L_0x019f
            znc r8 = r2.T()
        L_0x019f:
            r10.z0(r0)
            if (r8 == 0) goto L_0x01ef
            coc r0 = new coc
            r12 = 0
            r15 = -1
            r11 = 0
            r13 = 0
            r14 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            java.lang.String r2 = "BottomSheetWidget"
            defpackage.wg0.l(r1, r0, r5, r2)
            r8.G(r0)
            goto L_0x01ef
        L_0x01b8:
            boolean r3 = r2 instanceof defpackage.pcb
            if (r3 == 0) goto L_0x01d6
            java.lang.String r1 = defpackage.o37.a
            android.content.Context r1 = r0.getContext()
            pcb r2 = (defpackage.pcb) r2
            jqe r2 = r2.b
            android.content.Context r0 = r0.getContext()
            java.lang.CharSequence r0 = r2.b(r0)
            if (r0 != 0) goto L_0x01d2
            java.lang.String r0 = ""
        L_0x01d2:
            defpackage.o37.d(r1, r0, r8)
            goto L_0x01ef
        L_0x01d6:
            boolean r3 = r2 instanceof defpackage.qcb
            if (r3 == 0) goto L_0x01f0
            gfb r3 = defpackage.gfb.c
            wz7 r5 = new wz7
            r6 = 24
            r5.<init>(r0, r2, r6)
            f64 r0 = r3.P1()
            ffb r2 = new ffb
            r2.<init>(r1, r5)
            r0.e(r2)
        L_0x01ef:
            return r4
        L_0x01f0:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcb.o(java.lang.Object):java.lang.Object");
    }
}
