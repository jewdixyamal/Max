package defpackage;

import android.view.View;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: vr2  reason: default package */
public final /* synthetic */ class vr2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatTitleIconScreen b;

    public /* synthetic */ vr2(ChatTitleIconScreen chatTitleIconScreen, int i) {
        this.a = i;
        this.b = chatTitleIconScreen;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: type inference failed for: r13v2, types: [znc] */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: type inference failed for: r13v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            r13 = 0
            one.me.startconversation.chattitleicon.ChatTitleIconScreen r0 = r12.b
            r1 = 0
            r2 = 2
            r3 = 1
            int r12 = r12.a
            switch(r12) {
                case 0: goto L_0x00a8;
                default: goto L_0x000b;
            }
        L_0x000b:
            bc7[] r12 = one.me.startconversation.chattitleicon.ChatTitleIconScreen.z0
            defpackage.mr0.G(r0)
            one.me.sdk.uikit.common.button.OneMeButton r12 = r0.p0()
            r12.setProgressEnabled(r3)
            ks2 r12 = r0.r0()
            pyd r0 = r12.c
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x004c
            if (r0 != r3) goto L_0x0046
            je7 r0 = r12.Z
            java.lang.Object r0 = r0.getValue()
            kke r0 = (defpackage.kke) r0
            w9a r0 = (defpackage.w9a) r0
            nx3 r0 = r0.b()
            is2 r3 = new is2
            r3.<init>(r12, r13)
            vxd r13 = defpackage.pnf.n(r12, r0, r13, r3, r2)
            bc7[] r0 = defpackage.ks2.I0
            r0 = r0[r1]
            w4d r1 = r12.D0
            r1.o1(r12, r0, r13)
            goto L_0x00a7
        L_0x0046:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x004c:
            je7 r0 = r12.t0
            java.lang.Object r0 = r0.getValue()
            p82 r0 = (defpackage.p82) r0
            long[] r4 = r12.b
            java.util.List r4 = defpackage.ys.l0(r4)
            java.lang.String r5 = r12.G0
            q0e r6 = r12.y0
            java.lang.Object r6 = r6.getValue()
            ds2 r6 = (defpackage.ds2) r6
            java.lang.String r6 = r6.b
            if (r6 == 0) goto L_0x006f
            java.lang.String r6 = defpackage.j47.O(r6)
            if (r6 == 0) goto L_0x006f
            r13 = r6
        L_0x006f:
            v02 r6 = new v02
            r7 = 13
            r6.<init>(r7, r12)
            r0.getClass()
            n82 r12 = new n82
            r12.<init>(r0, r4, r5, r13)
            ztc r13 = defpackage.muc.b()
            w4d r4 = defpackage.cqc.a
            bqc r4 = new bqc
            r4.<init>(r1, r12)
            q1a r12 = new q1a
            r12.<init>(r3, r4)
            drd r12 = r12.m(r13)
            ztc r13 = r0.u
            drd r12 = r12.i(r13)
            p4c r13 = new p4c
            r0 = 12
            r13.<init>(r0)
            iq1 r0 = new iq1
            r0.<init>(r6, r2, r13)
            r12.k(r0)
        L_0x00a7:
            return
        L_0x00a8:
            bc7[] r12 = one.me.startconversation.chattitleicon.ChatTitleIconScreen.z0
            defpackage.mr0.G(r0)
            ks2 r12 = r0.r0()
            r12.getClass()
            mg3 r12 = new mg3
            int r4 = defpackage.zia.b
            int r5 = defpackage.aja.j
            eqe r6 = new eqe
            r6.<init>(r5)
            r5 = 3
            r12.<init>(r4, r6, r5, r1)
            mg3 r4 = new mg3
            int r6 = defpackage.zia.c
            int r7 = defpackage.aja.k
            eqe r8 = new eqe
            r8.<init>(r7)
            r4.<init>(r6, r8, r5, r1)
            mg3 r5 = new mg3
            int r6 = defpackage.zia.a
            int r7 = defpackage.aja.i
            eqe r8 = new eqe
            r8.<init>(r7)
            r5.<init>(r6, r8, r2, r1)
            mg3[] r12 = new defpackage.mg3[]{r12, r4, r5}
            java.util.List r12 = defpackage.y53.M(r12)
            bc7[] r2 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            int r2 = defpackage.aja.h
            r4 = 6
            lg3 r2 = defpackage.wg0.e(r2, r4, r13)
            java.util.Iterator r12 = r12.iterator()
        L_0x00f4:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x0108
            java.lang.Object r4 = r12.next()
            mg3 r4 = (defpackage.mg3) r4
            mg3[] r4 = new defpackage.mg3[]{r4}
            r2.a(r4)
            goto L_0x00f4
        L_0x0108:
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r6 = r2.e()
            r6.setTargetController(r0)
            r12 = r0
        L_0x0110:
            uu3 r2 = r12.getParentController()
            if (r2 == 0) goto L_0x011b
            uu3 r12 = r12.getParentController()
            goto L_0x0110
        L_0x011b:
            boolean r2 = r12 instanceof defpackage.foc
            if (r2 == 0) goto L_0x0122
            foc r12 = (defpackage.foc) r12
            goto L_0x0123
        L_0x0122:
            r12 = r13
        L_0x0123:
            if (r12 == 0) goto L_0x0129
            znc r13 = r12.T()
        L_0x0129:
            r6.z0(r0)
            if (r13 == 0) goto L_0x0141
            coc r12 = new coc
            r9 = 0
            r10 = 0
            r7 = 0
            r8 = 0
            r11 = -1
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = "BottomSheetWidget"
            defpackage.wg0.l(r1, r12, r3, r0)
            r13.G(r12)
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr2.onClick(android.view.View):void");
    }
}
