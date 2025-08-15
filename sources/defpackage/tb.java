package defpackage;

import android.view.View;

/* renamed from: tb  reason: default package */
public final /* synthetic */ class tb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tb(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: ph} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v7, types: [xt3] */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            ys1 r0 = defpackage.ys1.a
            r1 = 1
            r2 = 2
            vx3 r3 = defpackage.vx3.b
            r4 = 0
            r5 = 0
            java.lang.Object r6 = r14.b
            java.lang.Object r7 = r14.c
            int r14 = r14.a
            switch(r14) {
                case 0: goto L_0x0448;
                case 1: goto L_0x043e;
                case 2: goto L_0x0428;
                case 3: goto L_0x040a;
                case 4: goto L_0x03f1;
                case 5: goto L_0x03af;
                case 6: goto L_0x037e;
                case 7: goto L_0x0374;
                case 8: goto L_0x0364;
                case 9: goto L_0x0353;
                case 10: goto L_0x034b;
                case 11: goto L_0x0343;
                case 12: goto L_0x033b;
                case 13: goto L_0x0333;
                case 14: goto L_0x032b;
                case 15: goto L_0x01d3;
                case 16: goto L_0x01c5;
                case 17: goto L_0x01b8;
                case 18: goto L_0x0170;
                case 19: goto L_0x0162;
                case 20: goto L_0x015a;
                case 21: goto L_0x014e;
                case 22: goto L_0x0142;
                case 23: goto L_0x00ff;
                case 24: goto L_0x00ee;
                case 25: goto L_0x00e6;
                case 26: goto L_0x00ba;
                case 27: goto L_0x00ac;
                case 28: goto L_0x002c;
                default: goto L_0x0011;
            }
        L_0x0011:
            ky4 r7 = (defpackage.ky4) r7
            d02 r14 = r7.J0
            if (r14 == 0) goto L_0x002b
            android.view.View r15 = r7.a
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            android.graphics.drawable.ShapeDrawable r0 = r7.F0
            r15.setBackground(r0)
            int r14 = r14.a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            m56 r6 = (defpackage.m56) r6
            r6.invoke(r14)
        L_0x002b:
            return
        L_0x002c:
            mw4 r6 = (defpackage.mw4) r6
            qx4 r14 = r6.F0
            if (r14 == 0) goto L_0x00ab
            bkg r7 = (defpackage.bkg) r7
            java.lang.Object r15 = r7.b
            one.me.keyboardmedia.emoji.KeyboardEmojiWidget r15 = (one.me.keyboardmedia.emoji.KeyboardEmojiWidget) r15
            android.view.View r0 = r15.getView()
            if (r0 == 0) goto L_0x0043
            mi6 r1 = defpackage.mi6.KEYBOARD_TAP
            defpackage.pag.F(r0, r1)
        L_0x0043:
            je7 r15 = r15.b
            java.lang.Object r15 = r15.getValue()
            cc8 r15 = (defpackage.cc8) r15
            long r7 = r14.Y
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0067
            je7 r0 = r15.o
            java.lang.Object r0 = r0.getValue()
            gj r0 = (defpackage.gj) r0
            ti9 r0 = r0.i(r7)
            java.lang.Object r0 = r0.getValue()
            r5 = r0
            ph r5 = (defpackage.ph) r5
            goto L_0x006a
        L_0x0067:
            r15.getClass()
        L_0x006a:
            java.lang.CharSequence r11 = r14.c
            r14 = 20
            if (r5 == 0) goto L_0x008b
            float r14 = (float) r14
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r14 = r14 * r0
            int r12 = defpackage.tu0.G(r14)
            tx4 r6 = r15.b
            java.lang.String r9 = r5.c
            java.lang.String r10 = r5.e
            java.lang.CharSequence r14 = r6.d(r7, r9, r10, r11, r12)
            goto L_0x00a1
        L_0x008b:
            float r14 = (float) r14
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r14 = r14 * r0
            int r14 = defpackage.tu0.G(r14)
            tx4 r0 = r15.b
            java.lang.CharSequence r14 = r0.b(r14, r11)
        L_0x00a1:
            wb8 r0 = new wb8
            r0.<init>(r14)
            s35 r14 = r15.X
            defpackage.pnf.o(r14, r0)
        L_0x00ab:
            return
        L_0x00ac:
            uy3 r7 = (defpackage.uy3) r7
            int r14 = r7.a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            m56 r6 = (defpackage.m56) r6
            r6.invoke(r14)
            return
        L_0x00ba:
            lu3 r6 = (defpackage.lu3) r6
            ey1 r14 = r6.I0
            if (r14 == 0) goto L_0x00e5
            pw8 r7 = (defpackage.pw8) r7
            long r0 = r7.a
            bc7[] r15 = one.me.messages.list.ui.MessagesListWidget.X0
            java.lang.Object r14 = r14.b
            one.me.messages.list.ui.MessagesListWidget r14 = (one.me.messages.list.ui.MessagesListWidget) r14
            n59 r14 = r14.x0()
            l89 r14 = r14.B()
            r14.getClass()
            c89 r15 = new c89
            r15.<init>(r14, r0, r5)
            sx3 r0 = r14.c
            nx3 r1 = r14.b
            vxd r15 = defpackage.j47.S(r0, r1, r3, r15)
            r14.f(r15)
        L_0x00e5:
            return
        L_0x00e6:
            m56 r6 = (defpackage.m56) r6
            tt3 r7 = (defpackage.tt3) r7
            r6.invoke(r7)
            return
        L_0x00ee:
            st3 r6 = (defpackage.st3) r6
            k56 r14 = r6.e
            r14.invoke()
            cu3 r7 = (defpackage.cu3) r7
            boolean r14 = r7.c
            if (r14 == 0) goto L_0x00fe
            r7.dismiss()
        L_0x00fe:
            return
        L_0x00ff:
            bc7[] r14 = one.me.sdk.contextmenu.popup.ContextMenuPopupWindow.u0
            one.me.sdk.contextmenu.popup.ContextMenuPopupWindow r6 = (one.me.sdk.contextmenu.popup.ContextMenuPopupWindow) r6
            r6.getClass()
            bc7[] r14 = one.me.sdk.contextmenu.popup.ContextMenuPopupWindow.u0
            r15 = 6
            r0 = r14[r15]
            fs r0 = r6.Z
            java.lang.Object r1 = r0.a(r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x013e
            r15 = r14[r15]
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            r0.b(r6, r15)
            uu3 r15 = r6.getTargetController()
            boolean r0 = r15 instanceof defpackage.xt3
            if (r0 == 0) goto L_0x012b
            r5 = r15
            xt3 r5 = (defpackage.xt3) r5
        L_0x012b:
            if (r5 == 0) goto L_0x013e
            r14 = r14[r4]
            fs r14 = r6.a
            java.lang.Object r14 = r14.a(r6)
            android.os.Bundle r14 = (android.os.Bundle) r14
            tt3 r7 = (defpackage.tt3) r7
            int r15 = r7.a
            r5.y(r15, r14)
        L_0x013e:
            r6.dismiss()
            return
        L_0x0142:
            sr3 r6 = (defpackage.sr3) r6
            wq3 r14 = r6.F0
            yq3 r7 = (defpackage.yq3) r7
            int r15 = r7.a
            r14.getClass()
            return
        L_0x014e:
            gr3 r6 = (defpackage.gr3) r6
            wq3 r14 = r6.F0
            yq3 r7 = (defpackage.yq3) r7
            int r15 = r7.a
            r14.getClass()
            return
        L_0x015a:
            m56 r6 = (defpackage.m56) r6
            jq3 r7 = (defpackage.jq3) r7
            r6.invoke(r7)
            return
        L_0x0162:
            nn3 r7 = (defpackage.nn3) r7
            long r14 = r7.a
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            m56 r6 = (defpackage.m56) r6
            r6.invoke(r14)
            return
        L_0x0170:
            int r14 = one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet.A0
            one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet r6 = (one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet) r6
            je7 r14 = r6.y0
            java.lang.Object r14 = r14.getValue()
            ve3 r14 = (defpackage.ve3) r14
            yz2 r7 = (defpackage.yz2) r7
            boolean r10 = r7.isChecked()
            b31 r15 = r14.b
            l31 r15 = (defpackage.l31) r15
            q0e r15 = r15.k
            java.lang.Object r15 = r15.getValue()
            y21 r15 = (defpackage.y21) r15
            java.lang.Long r15 = r15.a
            if (r15 == 0) goto L_0x01b7
            long r11 = r15.longValue()
            vxd r15 = r14.X
            if (r15 == 0) goto L_0x019b
            goto L_0x01b7
        L_0x019b:
            je7 r15 = r14.o
            java.lang.Object r15 = r15.getValue()
            kke r15 = (defpackage.kke) r15
            w9a r15 = (defpackage.w9a) r15
            nx3 r15 = r15.b()
            ue3 r0 = new ue3
            r13 = 0
            r8 = r0
            r9 = r14
            r8.<init>(r9, r10, r11, r13)
            vxd r15 = defpackage.pnf.n(r14, r15, r5, r0, r2)
            r14.X = r15
        L_0x01b7:
            return
        L_0x01b8:
            q23 r6 = (defpackage.q23) r6
            androidx.appcompat.widget.AppCompatCheckBox r14 = r6.F0
            r14.toggle()
            android.view.View$OnClickListener r7 = (android.view.View.OnClickListener) r7
            r7.onClick(r15)
            return
        L_0x01c5:
            nl2 r7 = (defpackage.nl2) r7
            long r14 = r7.a
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            m56 r6 = (defpackage.m56) r6
            r6.invoke(r14)
            return
        L_0x01d3:
            bc7[] r14 = one.me.chatscreen.chatstatus.ChatStatusBottomWidget.c
            int[] r14 = defpackage.zq2.$EnumSwitchMapping$0
            yq2 r7 = (defpackage.yq2) r7
            int r15 = r7.ordinal()
            r14 = r14[r15]
            one.me.chatscreen.chatstatus.ChatStatusBottomWidget r6 = (one.me.chatscreen.chatstatus.ChatStatusBottomWidget) r6
            java.lang.String r15 = ""
            switch(r14) {
                case -1: goto L_0x032a;
                case 0: goto L_0x01e6;
                case 1: goto L_0x0314;
                case 2: goto L_0x0303;
                case 3: goto L_0x02fb;
                case 4: goto L_0x02d7;
                case 5: goto L_0x02b2;
                case 6: goto L_0x029a;
                case 7: goto L_0x0243;
                case 8: goto L_0x01ec;
                case 9: goto L_0x032a;
                default: goto L_0x01e6;
            }
        L_0x01e6:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x01ec:
            rq2 r14 = r6.m0()
            w7c r0 = r14.Y0
            j0e r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            e52 r0 = (defpackage.e52) r0
            if (r0 == 0) goto L_0x0200
            java.lang.String r5 = r0.q()
        L_0x0200:
            if (r5 != 0) goto L_0x0203
            goto L_0x0204
        L_0x0203:
            r15 = r5
        L_0x0204:
            bp2 r0 = new bp2
            int r3 = defpackage.u8a.c
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            gqe r5 = new gqe
            java.util.List r15 = defpackage.ys.m0(r15)
            r5.<init>(r3, r15)
            mg3 r15 = new mg3
            int r3 = defpackage.t8a.r
            int r6 = defpackage.u8a.b
            eqe r7 = new eqe
            r7.<init>(r6)
            r15.<init>(r3, r7, r1, r4)
            mg3 r1 = new mg3
            int r3 = defpackage.t8a.q
            int r6 = defpackage.u8a.a
            eqe r7 = new eqe
            r7.<init>(r6)
            r1.<init>(r3, r7, r2, r4)
            mg3[] r15 = new defpackage.mg3[]{r15, r1}
            java.util.List r15 = defpackage.y53.M(r15)
            r0.<init>(r5, r15)
            s35 r14 = r14.b1
            defpackage.pnf.o(r14, r0)
            goto L_0x032a
        L_0x0243:
            rq2 r14 = r6.m0()
            w7c r0 = r14.Y0
            j0e r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            e52 r0 = (defpackage.e52) r0
            if (r0 == 0) goto L_0x0257
            java.lang.String r5 = r0.q()
        L_0x0257:
            if (r5 != 0) goto L_0x025a
            goto L_0x025b
        L_0x025a:
            r15 = r5
        L_0x025b:
            bp2 r0 = new bp2
            int r3 = defpackage.u8a.e
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            gqe r5 = new gqe
            java.util.List r15 = defpackage.ys.m0(r15)
            r5.<init>(r3, r15)
            mg3 r15 = new mg3
            int r3 = defpackage.t8a.s
            int r6 = defpackage.u8a.d
            eqe r7 = new eqe
            r7.<init>(r6)
            r15.<init>(r3, r7, r1, r4)
            mg3 r1 = new mg3
            int r3 = defpackage.t8a.q
            int r6 = defpackage.u8a.a
            eqe r7 = new eqe
            r7.<init>(r6)
            r1.<init>(r3, r7, r2, r4)
            mg3[] r15 = new defpackage.mg3[]{r15, r1}
            java.util.List r15 = defpackage.y53.M(r15)
            r0.<init>(r5, r15)
            s35 r14 = r14.b1
            defpackage.pnf.o(r14, r0)
            goto L_0x032a
        L_0x029a:
            rq2 r14 = r6.m0()
            kke r15 = r14.u()
            w9a r15 = (defpackage.w9a) r15
            nx3 r15 = r15.b()
            rp2 r0 = new rp2
            r0.<init>(r14, r5)
            defpackage.pnf.n(r14, r15, r5, r0, r2)
            goto L_0x032a
        L_0x02b2:
            rq2 r14 = r6.m0()
            kke r15 = r14.u()
            w9a r15 = (defpackage.w9a) r15
            nx3 r15 = r15.b()
            lq2 r0 = new lq2
            r0.<init>(r14, r5)
            kotlinx.coroutines.internal.ContextScope r1 = r14.a
            vxd r15 = defpackage.j47.S(r1, r15, r3, r0)
            bc7[] r0 = defpackage.rq2.f1
            r1 = 8
            r0 = r0[r1]
            w4d r1 = r14.T0
            r1.o1(r14, r0, r15)
            goto L_0x032a
        L_0x02d7:
            rq2 r14 = r6.m0()
            kke r15 = r14.u()
            w9a r15 = (defpackage.w9a) r15
            nx3 r15 = r15.b()
            op2 r0 = new op2
            r0.<init>(r14, r5)
            kotlinx.coroutines.internal.ContextScope r1 = r14.a
            vxd r15 = defpackage.j47.S(r1, r15, r3, r0)
            bc7[] r0 = defpackage.rq2.f1
            r1 = 7
            r0 = r0[r1]
            w4d r1 = r14.S0
            r1.o1(r14, r0, r15)
            goto L_0x032a
        L_0x02fb:
            rq2 r14 = r6.m0()
            r14.x()
            goto L_0x032a
        L_0x0303:
            rq2 r14 = r6.m0()
            r14.getClass()
            qq2 r15 = new qq2
            r15.<init>(r14, r5)
            r0 = 3
            defpackage.pnf.n(r14, r5, r5, r15, r0)
            goto L_0x032a
        L_0x0314:
            rq2 r14 = r6.m0()
            kke r15 = r14.u()
            w9a r15 = (defpackage.w9a) r15
            nx3 r15 = r15.b()
            mp2 r0 = new mp2
            r0.<init>(r14, r5)
            defpackage.pnf.n(r14, r15, r5, r0, r2)
        L_0x032a:
            return
        L_0x032b:
            m56 r6 = (defpackage.m56) r6
            vq2 r7 = (defpackage.vq2) r7
            r6.invoke(r7)
            return
        L_0x0333:
            m56 r6 = (defpackage.m56) r6
            wm8 r7 = (defpackage.wm8) r7
            r6.invoke(r7)
            return
        L_0x033b:
            m56 r6 = (defpackage.m56) r6
            um8 r7 = (defpackage.um8) r7
            r6.invoke(r7)
            return
        L_0x0343:
            m56 r6 = (defpackage.m56) r6
            c62 r7 = (defpackage.c62) r7
            r6.invoke(r7)
            return
        L_0x034b:
            m56 r6 = (defpackage.m56) r6
            qm8 r7 = (defpackage.qm8) r7
            r6.invoke(r7)
            return
        L_0x0353:
            z32 r7 = (defpackage.z32) r7
            androidx.appcompat.widget.AppCompatTextView r14 = r7.H0
            java.lang.CharSequence r14 = r14.getText()
            if (r14 != 0) goto L_0x035e
            goto L_0x0363
        L_0x035e:
            m56 r6 = (defpackage.m56) r6
            r6.invoke(r14)
        L_0x0363:
            return
        L_0x0364:
            ze1 r6 = (defpackage.ze1) r6
            java.lang.Object r14 = r6.G0
            m56 r14 = (defpackage.m56) r14
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r15 = r7.toString()
            r14.invoke(r15)
            return
        L_0x0374:
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            if (r6 == 0) goto L_0x037d
            d12 r7 = (defpackage.d12) r7
            r6.onClick(r7)
        L_0x037d:
            return
        L_0x037e:
            int[] r14 = new int[r2]
            androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
            r6.getLocationOnScreen(r14)
            android.graphics.Point r15 = new android.graphics.Point
            r0 = r14[r4]
            r14 = r14[r1]
            r15.<init>(r0, r14)
            int r14 = r15.y
            int r0 = r6.getHeight()
            int r0 = r0 + r14
            r15.y = r0
            dm1 r7 = (defpackage.dm1) r7
            cm1 r14 = r7.M0
            if (r14 == 0) goto L_0x03ae
            gg1 r0 = r7.R0
            w4d r14 = (defpackage.w4d) r14
            yxc r1 = one.me.calls.ui.ui.call.CallScreen.R0
            java.lang.Object r14 = r14.b
            one.me.calls.ui.ui.call.CallScreen r14 = (one.me.calls.ui.ui.call.CallScreen) r14
            el1 r14 = r14.D0()
            r14.x(r0, r15)
        L_0x03ae:
            return
        L_0x03af:
            bf1 r6 = (defpackage.bf1) r6
            ey1 r14 = r6.F0
            if (r14 == 0) goto L_0x03f0
            r6.h()
            bc7[] r15 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.H0
            java.lang.Object r14 = r14.b
            one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget r14 = (one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget) r14
            of1 r14 = r14.r0()
            eo1 r14 = r14.c
            k56 r15 = r14.a
            java.lang.Object r15 = r15.invoke()
            sx3 r15 = (defpackage.sx3) r15
            je7 r0 = r14.c
            java.lang.Object r0 = r0.getValue()
            kke r0 = (defpackage.kke) r0
            w9a r0 = (defpackage.w9a) r0
            nx3 r0 = r0.b()
            do1 r1 = new do1
            gg1 r7 = (defpackage.gg1) r7
            long r6 = r7.a
            r1.<init>(r14, r6, r5)
            vxd r15 = defpackage.j47.S(r15, r0, r3, r1)
            bc7[] r0 = defpackage.eo1.k
            r0 = r0[r4]
            w4d r1 = r14.h
            r1.o1(r14, r0, r15)
        L_0x03f0:
            return
        L_0x03f1:
            b46 r14 = one.me.calllist.ui.callinfo.CallLinkInfoScreen.B0
            one.me.calllist.ui.callinfo.CallLinkInfoScreen r6 = (one.me.calllist.ui.callinfo.CallLinkInfoScreen) r6
            bt1 r14 = r6.m0()
            r14.e(r0, r4)
            dd1 r14 = r6.n0()
            mc1 r7 = (defpackage.mc1) r7
            long r0 = r7.getItemId()
            r14.q(r0)
            return
        L_0x040a:
            b46 r14 = one.me.calllist.ui.callinfo.CallLinkInfoScreen.B0
            rc1 r6 = (defpackage.rc1) r6
            qc1 r14 = r6.d
            boolean r14 = r14 instanceof defpackage.pc1
            if (r14 == 0) goto L_0x0427
            one.me.calllist.ui.callinfo.CallLinkInfoScreen r7 = (one.me.calllist.ui.callinfo.CallLinkInfoScreen) r7
            bt1 r14 = r7.m0()
            r14.e(r0, r4)
            dd1 r14 = r7.n0()
            int r15 = defpackage.r7a.f
            long r0 = (long) r15
            r14.q(r0)
        L_0x0427:
            return
        L_0x0428:
            ol7 r7 = (defpackage.ol7) r7
            long r14 = r7.getItemId()
            b46 r0 = one.me.calllist.ui.callinfo.CallLinkInfoScreen.B0
            bkg r6 = (defpackage.bkg) r6
            java.lang.Object r0 = r6.b
            one.me.calllist.ui.callinfo.CallLinkInfoScreen r0 = (one.me.calllist.ui.callinfo.CallLinkInfoScreen) r0
            dd1 r0 = r0.n0()
            r0.q(r14)
            return
        L_0x043e:
            cm0 r6 = (defpackage.cm0) r6
            m56 r14 = r6.G0
            ov5 r7 = (defpackage.ov5) r7
            r14.invoke(r7)
            return
        L_0x0448:
            ba r7 = (defpackage.ba) r7
            long r14 = r7.a
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            m56 r6 = (defpackage.m56) r6
            r6.invoke(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb.onClick(android.view.View):void");
    }

    public /* synthetic */ tb(Object obj, m56 m56, int i) {
        this.a = i;
        this.c = obj;
        this.b = m56;
    }
}
