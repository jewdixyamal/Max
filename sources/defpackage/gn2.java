package defpackage;

import one.me.chatscreen.ChatScreen;

/* renamed from: gn2  reason: default package */
public final /* synthetic */ class gn2 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatScreen b;

    public /* synthetic */ gn2(ChatScreen chatScreen, int i) {
        this.a = i;
        this.b = chatScreen;
    }

    /* JADX WARNING: type inference failed for: r1v21, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 8
            r1 = 6
            r2 = 4
            r3 = 1
            r4 = 3
            r5 = 5
            r6 = -2
            r7 = 2
            r8 = -1
            r9 = 0
            e5f r10 = defpackage.e5f.a
            r11 = 0
            one.me.chatscreen.ChatScreen r12 = r14.b
            int r14 = r14.a
            switch(r14) {
                case 0: goto L_0x0346;
                case 1: goto L_0x032c;
                case 2: goto L_0x01f7;
                case 3: goto L_0x0174;
                case 4: goto L_0x0128;
                case 5: goto L_0x008e;
                default: goto L_0x0015;
            }
        L_0x0015:
            android.view.View r15 = (android.view.View) r15
            bc7[] r14 = one.me.chatscreen.ChatScreen.k1
            xz8 r14 = r12.F0()
            zy8 r14 = r14.v()
            if (r14 == 0) goto L_0x0027
            r12.S0(r11)
            goto L_0x008d
        L_0x0027:
            int r14 = defpackage.vc7.a
            int r14 = defpackage.vc7.c
            boolean r14 = defpackage.vc7.b(r14)
            if (r14 == 0) goto L_0x003a
            one.me.sdk.messagewrite.MessageWriteWidget r14 = r12.G0()
            if (r14 == 0) goto L_0x003a
            r14.m()
        L_0x003a:
            r12.R0(r9)
            rq2 r14 = r12.P0()
            x95 r14 = r14.c
            av0 r15 = r14.a
            r15.f(r14)
            je7 r14 = r12.K0
            java.lang.Object r14 = r14.getValue()
            jac r14 = (defpackage.jac) r14
            q0e r15 = r14.Y
            java.lang.Object r15 = r15.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x0066
            cac r15 = defpackage.cac.a
            s35 r14 = r14.c
            defpackage.pnf.o(r14, r15)
            goto L_0x008d
        L_0x0066:
            vo2 r14 = defpackage.vo2.c
            f64 r15 = r14.P1()
            boolean r15 = r15.d()
            if (r15 != 0) goto L_0x008d
            f64 r14 = r14.P1()
            x54 r14 = r14.a()
            haa r14 = (defpackage.haa) r14
            foc r14 = r14.f()
            znc r14 = r14.C()
            android.app.Activity r14 = r14.d()
            if (r14 == 0) goto L_0x008d
            r14.finish()
        L_0x008d:
            return r10
        L_0x008e:
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            bc7[] r14 = one.me.chatscreen.ChatScreen.k1
            cla r14 = new cla
            android.content.Context r0 = r15.getContext()
            r14.<init>(r0, r1)
            int r0 = defpackage.t8a.o
            r14.setId(r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r8, r6)
            r14.setLayoutParams(r0)
            uka r0 = defpackage.uka.c
            r14.setForm(r0)
            java.lang.String r0 = ""
            r14.setTitle((java.lang.CharSequence) r0)
            r14.setSubtitle((java.lang.CharSequence) r0)
            kka r0 = new kka
            gn2 r2 = new gn2
            r2.<init>(r12, r1)
            r0.<init>(r2)
            r14.setLeftActions(r0)
            fn2 r0 = new fn2
            r1 = 11
            r0.<init>(r12, r1)
            r14.setTitleClickListener(r0)
            r15.addView(r14)
            eha r14 = new eha
            android.content.Context r0 = r15.getContext()
            r14.<init>(r0)
            int r0 = defpackage.t8a.m
            r14.setId(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r8, r6)
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = defpackage.tu0.G(r1)
            r0.setMarginEnd(r1)
            r1 = 8388629(0x800015, float:1.1754973E-38)
            r0.gravity = r1
            r14.setLayoutParams(r0)
            r14.setShouldShowSearchIcon(r11)
            qo2 r0 = new qo2
            r0.<init>(r12)
            r14.setListener(r0)
            rq2 r0 = r12.P0()
            boolean r0 = r0.v()
            if (r0 == 0) goto L_0x0117
            int r0 = defpackage.u8a.k
            goto L_0x0119
        L_0x0117:
            int r0 = defpackage.u8a.r
        L_0x0119:
            android.content.Context r1 = r12.getContext()
            java.lang.String r0 = defpackage.z7.B(r1, r0)
            r14.setSearchHint(r0)
            r15.addView(r14)
            return r10
        L_0x0128:
            x6g r15 = (defpackage.x6g) r15
            hc8 r14 = r12.U0
            if (r14 == 0) goto L_0x0173
            boolean r15 = r14.l
            if (r15 == 0) goto L_0x0173
            boolean r15 = r14.g
            if (r15 != 0) goto L_0x0137
            goto L_0x0173
        L_0x0137:
            int r15 = r14.c()
            android.view.View r0 = r14.b
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x0148
            r9 = r1
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
        L_0x0148:
            if (r9 == 0) goto L_0x014d
            int r1 = r9.bottomMargin
            goto L_0x014e
        L_0x014d:
            r1 = r11
        L_0x014e:
            int r15 = r15 + r1
            android.view.View r1 = r14.c
            int r2 = r1.getPaddingBottom()
            if (r2 == r15) goto L_0x0173
            r14.g = r11
            android.animation.AnimatorSet r14 = r14.i
            if (r14 == 0) goto L_0x0160
            r14.cancel()
        L_0x0160:
            r14 = 0
            r0.setTranslationY(r14)
            int r14 = r1.getPaddingLeft()
            int r0 = r1.getPaddingTop()
            int r2 = r1.getPaddingRight()
            r1.setPadding(r14, r0, r2, r15)
        L_0x0173:
            return r10
        L_0x0174:
            android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
            bc7[] r14 = one.me.chatscreen.ChatScreen.k1
            gn2 r14 = new gn2
            r14.<init>(r12, r5)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r1 = r15.getContext()
            r0.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r8, r6)
            r0.setLayoutParams(r1)
            defpackage.br7.e(r0)
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setElevation(r1)
            ro2 r2 = new ro2
            r2.<init>(r4, r9, r11)
            defpackage.v3c.y(r2, r0)
            r14.invoke(r0)
            r15.addView(r0)
            android.content.Context r14 = r15.getContext()
            w12 r14 = defpackage.s36.b(r14)
            int r0 = defpackage.t8a.l
            r14.setId(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r8, r6)
            r14.setLayoutParams(r0)
            mo2 r0 = new mo2
            r0.<init>(r4, r9, r11)
            defpackage.v3c.y(r0, r14)
            r14.setElevation(r1)
            r15.addView(r14)
            w12 r14 = new w12
            android.content.Context r0 = r15.getContext()
            r14.<init>(r0)
            int r0 = defpackage.t8a.k
            r14.setId(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r8, r11, r1)
            r14.setLayoutParams(r0)
            boolean r0 = r12.Q0()
            if (r0 != 0) goto L_0x01e6
            goto L_0x01f3
        L_0x01e6:
            x27 r0 = new x27
            yq0 r1 = new yq0
            r1.<init>(r3, r7, r3)
            r0.<init>(r11, r1, r3)
            defpackage.br7.d(r14, r0, r9)
        L_0x01f3:
            r15.addView(r14)
            return r10
        L_0x01f7:
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            bc7[] r14 = one.me.chatscreen.ChatScreen.k1
            gn2 r14 = new gn2
            r14.<init>(r12, r4)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r13 = r15.getContext()
            r1.<init>(r13)
            int r13 = defpackage.t8a.h
            r1.setId(r13)
            r1.setOrientation(r3)
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r8, r8)
            r1.setLayoutParams(r13)
            r14.invoke(r1)
            r15.addView(r1)
            w12 r14 = new w12
            android.content.Context r1 = r15.getContext()
            r14.<init>(r1)
            int r1 = defpackage.t8a.p
            r14.setId(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r8, r8)
            r14.setLayoutParams(r1)
            r14.setVisibility(r0)
            boolean r0 = r12.Q0()
            if (r0 != 0) goto L_0x023f
            goto L_0x024c
        L_0x023f:
            x27 r0 = new x27
            yq0 r1 = new yq0
            r1.<init>(r2, r7, r3)
            r0.<init>(r11, r1, r3)
            defpackage.br7.d(r14, r0, r9)
        L_0x024c:
            r15.addView(r14)
            w12 r14 = new w12
            android.content.Context r0 = r15.getContext()
            r14.<init>(r0)
            int r0 = defpackage.t8a.b
            r14.setId(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r8, r6)
            r1 = 80
            r0.gravity = r1
            r14.setLayoutParams(r0)
            boolean r0 = r12.Q0()
            if (r0 != 0) goto L_0x0270
            goto L_0x027d
        L_0x0270:
            x27 r0 = new x27
            yq0 r13 = new yq0
            r13.<init>(r2, r7, r3)
            r0.<init>(r11, r13, r3)
            defpackage.br7.d(r14, r0, r9)
        L_0x027d:
            i61 r0 = new i61
            r0.<init>(r7, r12)
            r14.addOnLayoutChangeListener(r0)
            br r0 = new br
            r0.<init>((int) r4, (kotlin.coroutines.Continuation) r9, (int) r2)
            defpackage.v3c.y(r0, r14)
            r15.addView(r14)
            w12 r14 = new w12
            android.content.Context r0 = r15.getContext()
            r14.<init>(r0)
            int r0 = defpackage.t8a.n
            r14.setId(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r8, r8)
            r0.gravity = r1
            r4 = 48
            float r4 = (float) r4
            android.content.res.Resources r13 = defpackage.fk4.d()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r4 = r4 * r13
            int r4 = defpackage.tu0.G(r4)
            r0.bottomMargin = r4
            r14.setLayoutParams(r0)
            boolean r0 = r12.Q0()
            if (r0 != 0) goto L_0x02c3
            goto L_0x02d0
        L_0x02c3:
            x27 r0 = new x27
            yq0 r4 = new yq0
            r4.<init>(r2, r7, r3)
            r0.<init>(r11, r4, r3)
            defpackage.br7.d(r14, r0, r9)
        L_0x02d0:
            r15.addView(r14)
            w12 r14 = new w12
            android.content.Context r0 = r15.getContext()
            r14.<init>(r0)
            int r0 = defpackage.t8a.j
            r14.setId(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r8, r6)
            r0.gravity = r1
            r14.setLayoutParams(r0)
            int r0 = defpackage.vc7.a
            android.content.Context r0 = r14.getContext()
            int r0 = defpackage.vc7.a(r0)
            float r0 = (float) r0
            r14.setTranslationY(r0)
            boolean r0 = r12.Q0()
            if (r0 != 0) goto L_0x0300
            goto L_0x0312
        L_0x0300:
            x27 r0 = new x27
            yq0 r1 = new yq0
            r1.<init>(r5, r3, r3)
            r0.<init>(r11, r1, r3)
            gn2 r1 = new gn2
            r1.<init>(r12, r2)
            defpackage.br7.d(r14, r0, r1)
        L_0x0312:
            r15.addView(r14)
            boolean r14 = r12.Q0()
            if (r14 == 0) goto L_0x031e
            x27 r14 = defpackage.x27.c
            goto L_0x0328
        L_0x031e:
            x27 r14 = defpackage.x27.d
            x27 r0 = new x27
            yq0 r14 = r14.b
            r0.<init>(r11, r14)
            r14 = r0
        L_0x0328:
            defpackage.br7.d(r15, r14, r9)
            return r10
        L_0x032c:
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            bc7[] r15 = one.me.chatscreen.ChatScreen.k1
            g39 r15 = r12.H0()
            r15.getClass()
            y29 r0 = new y29
            r0.<init>(r14)
            s35 r14 = r15.s0
            defpackage.pnf.o(r14, r0)
            return r10
        L_0x0346:
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            bc7[] r14 = one.me.chatscreen.ChatScreen.k1
            int r14 = defpackage.vvb.chat__root_container
            r15.setId(r14)
            android.view.View r14 = new android.view.View
            android.content.Context r1 = r15.getContext()
            r14.<init>(r1)
            int r1 = defpackage.t8a.a
            r14.setId(r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r8, r8)
            r14.setLayoutParams(r1)
            x27 r1 = new x27
            yq0 r2 = new yq0
            r2.<init>(r5, r3, r3)
            r1.<init>(r5, r2)
            defpackage.br7.d(r14, r1, r9)
            r15.addView(r14)
            gn2 r14 = new gn2
            r14.<init>(r12, r7)
            uo2 r1 = new uo2
            android.content.Context r2 = r15.getContext()
            r1.<init>(r2)
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r8, r8)
            r1.setLayoutParams(r2)
            r14.invoke(r1)
            r15.addView(r1)
            w12 r14 = new w12
            android.content.Context r1 = r15.getContext()
            r14.<init>(r1)
            int r1 = defpackage.t8a.i
            r14.setId(r1)
            r14.setVisibility(r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r8, r8)
            r14.setLayoutParams(r0)
            r15.addView(r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn2.invoke(java.lang.Object):java.lang.Object");
    }
}
