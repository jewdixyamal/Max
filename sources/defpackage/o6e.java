package defpackage;

import kotlin.coroutines.Continuation;
import one.me.stickerssettings.StickersSettingsScreen;

/* renamed from: o6e  reason: default package */
public final class o6e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o6e(Continuation continuation, StickersSettingsScreen stickersSettingsScreen) {
        super(2, continuation);
        this.Y = stickersSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((o6e) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        o6e o6e = new o6e(continuation, this.Y);
        o6e.X = obj;
        return o6e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [znc] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            defpackage.od2.a0(r12)
            java.lang.Object r12 = r11.X
            ved r12 = (defpackage.ved) r12
            bc7[] r0 = one.me.stickerssettings.StickersSettingsScreen.Y
            one.me.stickerssettings.StickersSettingsScreen r11 = r11.Y
            r11.getClass()
            boolean r0 = r12 instanceof defpackage.ted
            if (r0 == 0) goto L_0x002c
            ted r12 = (defpackage.ted) r12
            java.util.List r12 = r12.a
            r0 = 2
            qt3 r0 = defpackage.dy7.c(r0)
            qt3 r12 = r0.I(r12)
            qt3 r12 = r12.d0()
            rt3 r12 = r12.build()
            r12.q(r11)
            goto L_0x010c
        L_0x002c:
            boolean r0 = r12 instanceof defpackage.qed
            r1 = 0
            if (r0 == 0) goto L_0x0062
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = "android.intent.action.SEND"
            r0.setAction(r2)
            qed r12 = (defpackage.qed) r12
            java.lang.String r12 = r12.a
            java.lang.String r2 = "android.intent.extra.TEXT"
            r0.putExtra(r2, r12)
            java.lang.String r12 = "text/plain"
            r0.setType(r12)
            znc r11 = r11.getRouter()
            java.util.ArrayList r11 = r11.e()
            java.lang.Object r11 = defpackage.x53.q0(r11)
            coc r11 = (defpackage.coc) r11
            if (r11 == 0) goto L_0x005b
            java.lang.String r1 = r11.b
        L_0x005b:
            l6e r11 = defpackage.l6e.c
            r11.Z1(r0, r1)
            goto L_0x010c
        L_0x0062:
            boolean r0 = r12 instanceof defpackage.red
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = defpackage.o37.a
            android.content.Context r11 = r11.getContext()
            red r12 = (defpackage.red) r12
            java.lang.String r12 = r12.a
            defpackage.o37.d(r11, r12, r1)
            goto L_0x010c
        L_0x0075:
            boolean r0 = r12 instanceof defpackage.sed
            if (r0 == 0) goto L_0x00e3
            sed r12 = (defpackage.sed) r12
            bc7[] r0 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            jqe r0 = r12.a
            r2 = 6
            lg3 r0 = defpackage.od2.a(r0, r1, r2)
            jqe r2 = r12.b
            r0.f(r2)
            jk2 r2 = new jk2
            java.lang.Class<lg3> r6 = defpackage.lg3.class
            java.lang.String r7 = "addButton"
            r4 = 1
            java.lang.String r8 = "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;"
            r9 = 8
            r10 = 13
            r3 = r2
            r5 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            hk2 r3 = new hk2
            r4 = 11
            r3.<init>(r2, r4)
            java.util.List r12 = r12.c
            r12.forEach(r3)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r5 = r0.e()
            r5.setTargetController(r11)
            r12 = r11
        L_0x00af:
            uu3 r0 = r12.getParentController()
            if (r0 == 0) goto L_0x00ba
            uu3 r12 = r12.getParentController()
            goto L_0x00af
        L_0x00ba:
            boolean r0 = r12 instanceof defpackage.foc
            if (r0 == 0) goto L_0x00c1
            foc r12 = (defpackage.foc) r12
            goto L_0x00c2
        L_0x00c1:
            r12 = r1
        L_0x00c2:
            if (r12 == 0) goto L_0x00c8
            znc r1 = r12.T()
        L_0x00c8:
            r5.z0(r11)
            if (r1 == 0) goto L_0x010c
            coc r11 = new coc
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            r10 = -1
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12 = 0
            r0 = 1
            java.lang.String r2 = "BottomSheetWidget"
            defpackage.wg0.l(r12, r11, r0, r2)
            r1.G(r11)
            goto L_0x010c
        L_0x00e3:
            boolean r0 = r12 instanceof defpackage.ued
            if (r0 == 0) goto L_0x010f
            wha r0 = new wha
            r0.<init>((one.me.sdk.arch.Widget) r11)
            kia r1 = new kia
            ued r12 = (defpackage.ued) r12
            int r2 = r12.a
            r1.<init>(r2)
            r0.e(r1)
            android.content.Context r11 = r11.getContext()
            jqe r12 = r12.b
            java.lang.CharSequence r11 = r12.b(r11)
            if (r11 != 0) goto L_0x0106
            java.lang.String r11 = ""
        L_0x0106:
            r0.h(r11)
            r0.i()
        L_0x010c:
            e5f r11 = defpackage.e5f.a
            return r11
        L_0x010f:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o6e.o(java.lang.Object):java.lang.Object");
    }
}
