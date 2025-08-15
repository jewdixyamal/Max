package defpackage;

import android.view.View;

/* renamed from: hp1  reason: default package */
public final class hp1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hp1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: type inference failed for: r9v11, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayoutChange(android.view.View r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
        /*
            r2 = this;
            r4 = 1
            r5 = 0
            java.lang.Object r6 = r2.c
            java.lang.Object r7 = r2.b
            int r8 = r2.a
            switch(r8) {
                case 0: goto L_0x01eb;
                case 1: goto L_0x01b0;
                case 2: goto L_0x0111;
                case 3: goto L_0x00f7;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00af;
                default: goto L_0x000b;
            }
        L_0x000b:
            r3.removeOnLayoutChangeListener(r2)
            r2 = 16
            float r2 = (float) r2
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r4 = defpackage.tu0.G(r4)
            q8b r7 = (defpackage.q8b) r7
            android.content.Context r8 = r7.getContext()
            int r8 = defpackage.br7.D(r8)
            int r4 = r4 * 2
            int r8 = r8 - r4
            r9 = 40
            float r9 = (float) r9
            android.content.res.Resources r10 = defpackage.fk4.d()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r9 = r9 * r10
            int r9 = defpackage.tu0.G(r9)
            android.content.res.Resources r10 = defpackage.fk4.d()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            int r2 = defpackage.rh4.c(r2, r10, r9)
            android.view.ViewParent r9 = r3.getParent()
            boolean r10 = r9 instanceof android.view.ViewGroup
            r11 = 0
            if (r10 == 0) goto L_0x0059
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            goto L_0x005a
        L_0x0059:
            r9 = r11
        L_0x005a:
            if (r9 == 0) goto L_0x006c
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            boolean r10 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r10 == 0) goto L_0x0067
            r11 = r9
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
        L_0x0067:
            if (r11 == 0) goto L_0x006c
            int r9 = r11.bottomMargin
            goto L_0x006d
        L_0x006c:
            r9 = r5
        L_0x006d:
            int r10 = r3.getMeasuredHeight()
            int r11 = r3.getPaddingBottom()
            int r10 = r10 - r11
            int r3 = r3.getPaddingTop()
            int r10 = r10 - r3
            int r10 = r10 - r9
            int r10 = r10 - r2
            int r10 = r10 - r4
            int r2 = java.lang.Math.min(r8, r10)
            if (r2 != 0) goto L_0x0096
            r2 = 352(0x160, float:4.93E-43)
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = defpackage.tu0.G(r2)
        L_0x0096:
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r2, r2)
            r4 = 17
            r3.gravity = r4
            r7.setLayoutParams(r3)
            r7.setVisibility(r5)
            g8b r3 = r7.getSurfaceProvider()
            one.me.chatscreen.videomsg.VideoMessageWidget r6 = (one.me.chatscreen.videomsg.VideoMessageWidget) r6
            one.me.chatscreen.videomsg.VideoMessageWidget.n0(r6, r2, r2, r3)
            return
        L_0x00af:
            android.view.View r7 = (android.view.View) r7
            int r2 = r7.getVisibility()
            if (r2 != 0) goto L_0x00bc
            gje r6 = (defpackage.gje) r6
            r6.d(r7)
        L_0x00bc:
            return
        L_0x00bd:
            r3.removeOnLayoutChangeListener(r2)
            bc7[] r2 = one.me.login.neuroavatars.NeuroAvatarsScreen.M0
            one.me.login.neuroavatars.NeuroAvatarsScreen r6 = (one.me.login.neuroavatars.NeuroAvatarsScreen) r6
            r6.getClass()
            bc7[] r2 = one.me.login.neuroavatars.NeuroAvatarsScreen.M0
            r3 = 6
            r4 = r2[r3]
            q7c r5 = r6.v0
            java.lang.Object r4 = r5.T0(r6, r4)
            android.view.View r4 = (android.view.View) r4
            int r4 = r4.getMeasuredHeight()
            r2 = r2[r3]
            java.lang.Object r2 = r5.T0(r6, r2)
            android.view.View r2 = (android.view.View) r2
            int r2 = r2.getPaddingBottom()
            int r2 = r2 + r4
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            int r3 = r7.getPaddingLeft()
            int r4 = r7.getPaddingTop()
            int r5 = r7.getPaddingRight()
            r7.setPadding(r3, r4, r5, r2)
            return
        L_0x00f7:
            r3.removeOnLayoutChangeListener(r2)
            csb r7 = (defpackage.csb) r7
            android.widget.TextView r2 = r7.getTitleView()
            boolean r2 = defpackage.qqe.c(r2)
            if (r2 == 0) goto L_0x0110
            bc7[] r2 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            one.me.sdk.messagewrite.MessageWriteWidget r6 = (one.me.sdk.messagewrite.MessageWriteWidget) r6
            r6.getClass()
            one.me.sdk.messagewrite.MessageWriteWidget.B0(r7, r4)
        L_0x0110:
            return
        L_0x0111:
            r3.removeOnLayoutChangeListener(r2)
            sv8 r7 = (defpackage.sv8) r7
            qv8 r2 = r7.c
            int r2 = r2.getMeasuredHeight()
            android.widget.ImageView r3 = r7.b
            int r8 = r3.getMeasuredHeight()
            je7 r9 = r7.s0
            int r10 = defpackage.br7.A(r9)
            int r8 = java.lang.Math.min(r8, r10)
            if (r2 <= r8) goto L_0x012f
            goto L_0x0130
        L_0x012f:
            r4 = r5
        L_0x0130:
            if (r4 == 0) goto L_0x014b
            kqe r2 = defpackage.os2.l
            du4 r6 = (defpackage.du4) r6
            long r10 = r2.g(r6)
            android.content.Context r2 = r7.getContext()
            float r2 = defpackage.ck4.c(r10, r2)
            double r10 = (double) r2
            r0 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r10 = r10 * r0
            int r2 = (int) r10
            goto L_0x014c
        L_0x014b:
            r2 = r5
        L_0x014c:
            r6 = 4
            float r6 = (float) r6
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            int r6 = defpackage.rh4.c(r6, r8, r2)
            r7.a = r6
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            java.lang.String r8 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            if (r6 == 0) goto L_0x01aa
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r10 = r7.a
            r6.bottomMargin = r10
            r3.setLayoutParams(r6)
            boolean r3 = r9.a()
            if (r3 == 0) goto L_0x0191
            java.lang.Object r3 = r9.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            if (r6 == 0) goto L_0x018b
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r9 = r7.a
            r6.bottomMargin = r9
            r3.setLayoutParams(r6)
            goto L_0x0191
        L_0x018b:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r8)
            throw r2
        L_0x0191:
            android.widget.ImageView r3 = r7.v0
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            if (r6 == 0) goto L_0x01a4
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            if (r4 == 0) goto L_0x019e
            r5 = r2
        L_0x019e:
            r6.bottomMargin = r5
            r3.setLayoutParams(r6)
            return
        L_0x01a4:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r8)
            throw r2
        L_0x01aa:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r8)
            throw r2
        L_0x01b0:
            r3.removeOnLayoutChangeListener(r2)
            bc7[] r2 = one.me.sdk.gallery.MediaGalleryWidget.Z
            one.me.sdk.gallery.MediaGalleryWidget r7 = (one.me.sdk.gallery.MediaGalleryWidget) r7
            z96 r2 = r7.o0()
            w86 r2 = r2.y0
            int r2 = r2.c
            z96 r3 = r7.o0()
            w86 r3 = r3.y0
            int r3 = r3.d
            z96 r4 = r7.o0()
            w86 r4 = r4.y0
            int r4 = r4.d
            int r4 = r4 / r2
            int r3 = r3 - r4
            android.view.View r6 = (android.view.View) r6
            int r4 = r6.getWidth()
            int r4 = r4 / r2
            int r4 = r4 - r3
            s86 r2 = r7.n0()
            r2.getClass()
            p86 r3 = new p86
            r3.<init>(r4)
            s35 r2 = r2.c
            defpackage.pnf.o(r2, r3)
            return
        L_0x01eb:
            r3.removeOnLayoutChangeListener(r2)
            ip1 r7 = (defpackage.ip1) r7
            ugf r2 = r7.getVideoLayoutUpdatesController()
            if (r2 == 0) goto L_0x0201
            mec r6 = (defpackage.mec) r6
            java.lang.Object r3 = r6.a
            android.view.View r3 = (android.view.View) r3
            llf r4 = r7.v0
            r2.a(r3, r4)
        L_0x0201:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp1.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }

    public hp1(gje gje, View view) {
        this.a = 5;
        this.c = gje;
        this.b = view;
    }
}
