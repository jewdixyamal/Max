package defpackage;

import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: q58  reason: default package */
public final /* synthetic */ class q58 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ q58(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: one.me.sdk.gallery.selectalbum.SelectAlbumWidget} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v33, types: [yb4] */
    /* JADX WARNING: type inference failed for: r1v74 */
    /* JADX WARNING: type inference failed for: r1v75 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r21 = this;
            r0 = r21
            r3 = 7
            r4 = 16
            fg7 r5 = defpackage.fg7.o
            r6 = 3
            r7 = 13
            r8 = 12
            r9 = 8
            e5f r11 = defpackage.e5f.a
            r12 = 4
            r14 = -2
            r15 = 1
            r10 = 5
            r1 = 0
            r2 = -1
            one.me.chatscreen.mediabar.MediaBarWidget r13 = r0.b
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x055e;
                case 1: goto L_0x0509;
                case 2: goto L_0x04dc;
                case 3: goto L_0x04c3;
                case 4: goto L_0x04aa;
                case 5: goto L_0x039c;
                case 6: goto L_0x036d;
                case 7: goto L_0x02d2;
                case 8: goto L_0x023c;
                case 9: goto L_0x01e8;
                case 10: goto L_0x01db;
                case 11: goto L_0x01cc;
                case 12: goto L_0x01bd;
                case 13: goto L_0x0154;
                case 14: goto L_0x00d9;
                case 15: goto L_0x00d6;
                case 16: goto L_0x00b8;
                case 17: goto L_0x00a7;
                case 18: goto L_0x0051;
                case 19: goto L_0x0046;
                case 20: goto L_0x0039;
                default: goto L_0x001d;
            }
        L_0x001d:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            w12 r0 = new w12
            android.content.Context r1 = r13.getContext()
            r0.<init>(r1)
            int r1 = defpackage.t8a.A
            r0.setId(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            r0.setVisibility(r9)
            return r0
        L_0x0039:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            s86 r0 = new s86
            q58 r1 = new q58
            r1.<init>(r13, r8)
            r0.<init>(r1)
            return r0
        L_0x0046:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            android.content.Context r0 = r13.getContext()
            w86 r0 = defpackage.tpa.a(r0)
            return r0
        L_0x0051:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r3 = r13.getContext()
            r0.<init>(r3)
            r0.setOrientation(r15)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r2, r14)
            r2 = 80
            r3.gravity = r2
            r0.setLayoutParams(r3)
            bc7[] r2 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            r3 = r2[r7]
            qm0 r3 = r13.J0
            java.lang.Object r3 = r3.getValue()
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0.addView(r3)
            sv8 r3 = r13.w0()
            r0.addView(r3)
            r2 = r2[r4]
            qm0 r2 = r13.P0
            java.lang.Object r2 = r2.getValue()
            w12 r2 = (defpackage.w12) r2
            r0.addView(r2)
            x27 r2 = one.me.chatscreen.mediabar.MediaBarWidget.e1
            defpackage.br7.d(r0, r2, r1)
            o r2 = new o
            r2.<init>(r6, r1, r10)
            defpackage.v3c.y(r2, r0)
            i61 r1 = new i61
            r1.<init>(r6, r13)
            r0.addOnLayoutChangeListener(r1)
            r0.setClickable(r15)
            return r0
        L_0x00a7:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            w12 r0 = new w12
            android.content.Context r1 = r13.getContext()
            r0.<init>(r1)
            int r1 = defpackage.vvb.media_bar__bottom_container
            r0.setId(r1)
            return r0
        L_0x00b8:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            p58 r0 = r13.B0()
            h7b r0 = r0.v0
            r0.z(r12)
            android.widget.LinearLayout r0 = r13.r0()
            x27 r2 = one.me.chatscreen.mediabar.MediaBarWidget.e1
            defpackage.br7.d(r0, r2, r1)
            sv8 r0 = r13.w0()
            int r1 = defpackage.woc.a1
            r0.setLeftIcon(r1)
            return r11
        L_0x00d6:
            tz5 r0 = r13.a1
            return r0
        L_0x00d9:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r4 = r13.getContext()
            r0.<init>(r4)
            int r4 = defpackage.vvb.media_bar__draggable_container
            r0.setId(r4)
            r0.setOrientation(r15)
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r2, r2)
            r0.setLayoutParams(r4)
            xq0 r4 = r13.L0
            r0.setOutlineProvider(r4)
            android.graphics.drawable.ColorDrawable r4 = r13.M0
            r0.setForeground(r4)
            ee1 r4 = new ee1
            r4.<init>(r6, r1, r15)
            defpackage.v3c.y(r4, r0)
            bc7[] r1 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            r4 = r1[r10]
            qm0 r4 = r13.w0
            java.lang.Object r4 = r4.getValue()
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r0.addView(r4)
            cla r4 = r13.A0()
            r0.addView(r4)
            r4 = 9
            r4 = r1[r4]
            qm0 r4 = r13.B0
            java.lang.Object r4 = r4.getValue()
            w12 r4 = (defpackage.w12) r4
            r0.addView(r4)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            android.content.Context r5 = r0.getContext()
            r4.<init>(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r2, r2)
            r4.setLayoutParams(r5)
            r1 = r1[r3]
            qm0 r1 = r13.y0
            java.lang.Object r1 = r1.getValue()
            w12 r1 = (defpackage.w12) r1
            r4.addView(r1)
            w12 r1 = r13.z0()
            r4.addView(r1)
            r0.addView(r4)
            return r0
        L_0x0154:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            f6b r0 = r13.x0()
            d6b r0 = r0.getScrollState()
            d6b r2 = defpackage.d6b.c
            if (r0 == r2) goto L_0x0163
            goto L_0x01bc
        L_0x0163:
            w12 r0 = r13.z0()
            r2 = 0
            r0.setVisibility(r2)
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            r2 = 18
            r3 = r0[r2]
            q7c r4 = r13.V0
            java.lang.Object r3 = r4.T0(r13, r3)
            j03 r3 = (defpackage.j03) r3
            java.lang.String r5 = r3.c()
            java.lang.String r6 = "select_album_widget"
            boolean r5 = defpackage.tpa.f(r5, r6)
            if (r5 != 0) goto L_0x01a4
            one.me.sdk.gallery.selectalbum.SelectAlbumWidget r15 = new one.me.sdk.gallery.selectalbum.SelectAlbumWidget
            java.lang.String r5 = r13.a
            r15.<init>(r5, r1)
            coc r5 = new coc
            r17 = 0
            r20 = -1
            r16 = 0
            r18 = 0
            r19 = 0
            r14 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r5.d(r6)
            znc r3 = r3.a
            r3.R(r5)
        L_0x01a4:
            r0 = r0[r2]
            java.lang.Object r0 = r4.T0(r13, r0)
            j03 r0 = (defpackage.j03) r0
            uu3 r0 = r0.b()
            boolean r2 = r0 instanceof one.me.sdk.gallery.selectalbum.SelectAlbumWidget
            if (r2 == 0) goto L_0x01b7
            r1 = r0
            one.me.sdk.gallery.selectalbum.SelectAlbumWidget r1 = (one.me.sdk.gallery.selectalbum.SelectAlbumWidget) r1
        L_0x01b7:
            if (r1 == 0) goto L_0x01bc
            r1.p0()
        L_0x01bc:
            return r11
        L_0x01bd:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            p58 r0 = r13.B0()
            boolean r0 = r0.s()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x01cc:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            p58 r0 = r13.B0()
            bc7[] r1 = defpackage.p58.I0
            h7b r0 = r0.v0
            r1 = 0
            r0.z(r1)
            return r11
        L_0x01db:
            r1 = 0
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            p58 r0 = r13.B0()
            bc7[] r2 = defpackage.p58.I0
            r0.t(r1)
            return r11
        L_0x01e8:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            sv8 r0 = new sv8
            android.content.Context r1 = r13.getContext()
            r0.<init>(r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r2, r14)
            r0.setLayoutParams(r1)
            r0.setVisibility(r9)
            lv8 r1 = defpackage.lv8.a
            r0.setRightOuterIconActionState(r1)
            int r1 = defpackage.u8a.J
            r0.setInputHint((int) r1)
            s58 r1 = new s58
            r1.<init>(r13, r15)
            vf1 r2 = new vf1
            r2.<init>(r1, r3, r0)
            qv8 r1 = r0.c
            r1.addTextChangedListener(r2)
            android.content.Context r1 = r0.getContext()
            q58 r2 = new q58
            r3 = 10
            r2.<init>(r13, r3)
            q46 r1 = defpackage.s5c.a(r1, r2)
            r0.setRightOuterIconTouchListener(r1)
            android.content.Context r1 = r0.getContext()
            q58 r2 = new q58
            r3 = 11
            r2.<init>(r13, r3)
            q46 r1 = defpackage.s5c.a(r1, r2)
            r0.setLeftInnerIconTouchListener(r1)
            return r0
        L_0x023c:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r2 = r13.getContext()
            r0.<init>(r2)
            r0.setVerticalGravity(r4)
            one.me.sdk.uikit.common.button.OneMeButton r2 = new one.me.sdk.uikit.common.button.OneMeButton
            android.content.Context r3 = r0.getContext()
            r2.<init>(r3, r1)
            b7a r3 = defpackage.b7a.b
            r2.setMode(r3)
            z6a r3 = defpackage.z6a.c
            r2.setAppearance(r3)
            int r3 = defpackage.s8a.f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.setEndIcon((java.lang.Integer) r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r14, r14)
            float r4 = (float) r9
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r4
            int r6 = defpackage.tu0.G(r6)
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r4 = r4 * r7
            int r4 = defpackage.tu0.G(r4)
            int r7 = r3.topMargin
            int r9 = r3.bottomMargin
            r3.setMargins(r6, r7, r4, r9)
            r2.setLayoutParams(r3)
            xx5 r3 = new xx5
            r3.<init>(r8, r13)
            defpackage.tu0.K(r2, 300, r3)
            r0.addView(r2)
            bc7[] r2 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            r2 = r2[r8]
            qm0 r2 = r13.I0
            java.lang.Object r2 = r2.getValue()
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r0.addView(r2)
            p58 r2 = r13.B0()
            w7c r2 = r2.E0
            eh7 r3 = r13.getViewLifecycleOwner()
            gh7 r3 = r3.Q()
            kq1 r2 = defpackage.tu0.g(r2, r3, r5)
            j68 r3 = new j68
            r3.<init>(r1, r0, r13)
            zn5 r1 = new zn5
            r1.<init>(r2, r3, r10)
            pg7 r2 = r13.getViewLifecycleScope()
            defpackage.od2.L(r1, r2)
            return r0
        L_0x02d2:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            androidx.recyclerview.widget.RecyclerView r0 = new androidx.recyclerview.widget.RecyclerView
            android.content.Context r2 = r13.getContext()
            r0.<init>(r2, r1)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r2.<init>(r4, r14, r3)
            float r3 = (float) r12
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r4 = defpackage.tu0.G(r4)
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r3 = r3 * r5
            int r3 = defpackage.tu0.G(r3)
            r5 = 6
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r5 = r5 * r6
            int r5 = defpackage.tu0.G(r5)
            int r6 = r2.leftMargin
            r2.setMargins(r6, r4, r5, r3)
            r0.setLayoutParams(r2)
            mdc r2 = r0.getItemAnimator()
            boolean r3 = r2 instanceof defpackage.yb4
            if (r3 == 0) goto L_0x0328
            r1 = r2
            yb4 r1 = (defpackage.yb4) r1
        L_0x0328:
            if (r1 == 0) goto L_0x032d
            r2 = 0
            r1.g = r2
        L_0x032d:
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1094713344(0x41400000, float:12.0)
            float r2 = r2 * r3
            r1.setCornerRadius(r2)
            r0.setBackground(r1)
            r0.setClipToOutline(r15)
            bc7[] r1 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            r2 = 11
            r1 = r1[r2]
            qm0 r1 = r13.H0
            java.lang.Object r1 = r1.getValue()
            u4d r1 = (defpackage.u4d) r1
            en3 r2 = new en3
            r2.<init>(r0, r15, r13)
            r1.Y = r2
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.getContext()
            r1.<init>()
            r3 = 0
            r1.o1(r3)
            r0.setLayoutManager(r1)
            return r0
        L_0x036d:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            u4d r0 = new u4d
            p58 r2 = r13.B0()
            r0.<init>(r2)
            p58 r2 = r13.B0()
            q0e r2 = r2.x0
            eh7 r3 = r13.getViewLifecycleOwner()
            gh7 r3 = r3.Q()
            kq1 r2 = defpackage.tu0.g(r2, r3, r5)
            i68 r3 = new i68
            r3.<init>(r1, r0)
            zn5 r1 = new zn5
            r1.<init>(r2, r3, r10)
            pg7 r2 = r13.getViewLifecycleScope()
            defpackage.od2.L(r1, r2)
            return r0
        L_0x039c:
            r3 = 0
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            ew1 r0 = new ew1
            android.content.Context r4 = r13.getContext()
            r0.<init>(r4)
            r0.setListener(r13)
            je7 r4 = r13.z0
            java.lang.Object r4 = r4.getValue()
            urb r4 = (defpackage.urb) r4
            to2 r6 = defpackage.to2.a
            v4 r6 = r6.getAccessor()
            java.lang.Class<iba> r8 = defpackage.iba.class
            java.lang.Object r6 = r6.c(r8)
            iba r6 = (defpackage.iba) r6
            java.util.concurrent.ExecutorService r6 = r6.d()
            rrb r8 = r0.a
            if (r8 == 0) goto L_0x03ca
            goto L_0x03cb
        L_0x03ca:
            r15 = r3
        L_0x03cb:
            if (r15 == 0) goto L_0x03cf
            goto L_0x0481
        L_0x03cf:
            rrb r3 = new rrb
            android.content.Context r8 = r0.getContext()
            r3.<init>(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r2, r2)
            r3.setLayoutParams(r8)
            r0.a = r3
            w4d r2 = new w4d
            r8 = 6
            r2.<init>((int) r8, (java.lang.Object) r0)
            r3.o = r4
            r3.t0 = r2
            r3.s0 = r6
            hv1 r2 = r3.getCameraApi()
            rxd r6 = new rxd
            r8 = 26
            r6.<init>(r8, r3)
            r2.setCameraListener(r6)
            eh7 r2 = defpackage.lnf.a(r3)
            gh7 r2 = r2.Q()
            s35 r6 = r4.v0
            kq1 r2 = defpackage.tu0.g(r6, r2, r5)
            orb r6 = new orb
            r6.<init>(r1, r3)
            zn5 r8 = new zn5
            r8.<init>(r2, r6, r10)
            eh7 r2 = defpackage.lnf.a(r3)
            rg7 r2 = defpackage.f46.J(r2)
            defpackage.od2.L(r8, r2)
            eh7 r2 = defpackage.lnf.a(r3)
            gh7 r2 = r2.Q()
            q0e r6 = r4.u0
            kq1 r2 = defpackage.tu0.g(r6, r2, r5)
            prb r6 = new prb
            r6.<init>(r1, r3)
            zn5 r8 = new zn5
            r8.<init>(r2, r6, r10)
            eh7 r2 = defpackage.lnf.a(r3)
            rg7 r2 = defpackage.f46.J(r2)
            defpackage.od2.L(r8, r2)
            eh7 r2 = defpackage.lnf.a(r3)
            gh7 r2 = r2.Q()
            q0e r4 = r4.t0
            kq1 r2 = defpackage.tu0.g(r4, r2, r5)
            qrb r4 = new qrb
            r4.<init>(r1, r3)
            zn5 r6 = new zn5
            r6.<init>(r2, r4, r10)
            eh7 r2 = defpackage.lnf.a(r3)
            rg7 r2 = defpackage.f46.J(r2)
            defpackage.od2.L(r6, r2)
            rrb r2 = r0.a
            if (r2 != 0) goto L_0x046a
            r2 = r1
        L_0x046a:
            r0.addView(r2)
            rrb r2 = r0.a
            if (r2 != 0) goto L_0x0472
            r2 = r1
        L_0x0472:
            hv1 r2 = r2.getCameraApi()
            r2.e()
            c5 r2 = new c5
            r2.<init>((int) r7, (java.lang.Object) r0)
            defpackage.tu0.K(r0, 300, r2)
        L_0x0481:
            p58 r2 = r13.B0()
            t03 r2 = r2.C0
            eh7 r3 = r13.getViewLifecycleOwner()
            gh7 r3 = r3.Q()
            kq1 r2 = defpackage.tu0.g(r2, r3, r5)
            u58 r3 = new u58
            r3.<init>(r1, r0)
            zn5 r1 = new zn5
            r1.<init>(r2, r3, r10)
            pg7 r2 = r13.getViewLifecycleScope()
            defpackage.od2.L(r1, r2)
            android.graphics.drawable.ColorDrawable r1 = r13.C0
            r0.setForeground(r1)
            return r0
        L_0x04aa:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            w12 r0 = new w12
            android.content.Context r1 = r13.getContext()
            r0.<init>(r1)
            int r1 = defpackage.vvb.media_bar__partial_media_access_container
            r0.setId(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r2, r14)
            r0.setLayoutParams(r1)
            return r0
        L_0x04c3:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            w12 r0 = new w12
            android.content.Context r1 = r13.getContext()
            r0.<init>(r1)
            int r1 = defpackage.vvb.media_bar__primary_container
            r0.setId(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            return r0
        L_0x04dc:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            cla r0 = new cla
            android.content.Context r1 = r13.getContext()
            r2 = 6
            r0.<init>(r1, r2)
            int r1 = defpackage.vvb.media_bar__album_chooser
            r0.setId(r1)
            int r1 = defpackage.k0c.media_bar_recent
            r0.setTitle((int) r1)
            lka r1 = new lka
            s58 r2 = new s58
            r3 = 2
            r2.<init>(r13, r3)
            r1.<init>(r2)
            r0.setLeftActions(r1)
            q58 r1 = new q58
            r1.<init>(r13, r7)
            r0.setTitleClickListener(r1)
            return r0
        L_0x0509:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r1 = r13.getContext()
            r0.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r3 = 10
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = defpackage.tu0.G(r3)
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            r1 = 6
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = defpackage.tu0.G(r1)
            int r2 = r0.getPaddingLeft()
            int r3 = r0.getPaddingRight()
            int r4 = r0.getPaddingBottom()
            r0.setPadding(r2, r1, r3, r4)
            bc7[] r1 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            r1 = r1[r12]
            qm0 r1 = r13.v0
            java.lang.Object r1 = r1.getValue()
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.addView(r1)
            return r0
        L_0x055e:
            bc7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r1 = r13.getContext()
            r0.<init>(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = 40
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = defpackage.tu0.G(r2)
            float r3 = (float) r12
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = defpackage.tu0.G(r3)
            r1.<init>(r2, r3)
            r2 = 17
            r1.gravity = r2
            r0.setLayoutParams(r1)
            ix3 r1 = new ix3
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1109393408(0x42200000, float:40.0)
            float r2 = r2 * r3
            r1.<init>(r2)
            r0.setOutlineProvider(r1)
            pq9 r1 = defpackage.qp4.u0
            fka r1 = r1.j(r0)
            bs6 r1 = r1.getIcon()
            int r1 = r1.h
            r0.setBackgroundColor(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q58.invoke():java.lang.Object");
    }
}
