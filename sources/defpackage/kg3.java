package defpackage;

import android.view.View;

/* renamed from: kg3  reason: default package */
public final /* synthetic */ class kg3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ kg3(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
        this.c = i;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [uu3] */
    /* JADX WARNING: type inference failed for: r1v6, types: [uu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            r9 = 4
            r0 = 0
            r1 = 5
            int r2 = r8.c
            java.lang.Object r3 = r8.b
            r4 = 1
            int r8 = r8.a
            switch(r8) {
                case 0: goto L_0x00dd;
                case 1: goto L_0x009f;
                default: goto L_0x000d;
            }
        L_0x000d:
            g5c r3 = (defpackage.g5c) r3
            r3.G0 = r2
            r8 = 0
            r9 = r8
        L_0x0013:
            if (r9 >= r1) goto L_0x004f
            android.view.View r0 = r3.getChildAt(r9)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r9 > r2) goto L_0x0023
            int r5 = defpackage.vba.b
            r0.setImageResource(r5)
            goto L_0x004d
        L_0x0023:
            one.me.sdk.richvector.EnhancedVectorDrawable r5 = new one.me.sdk.richvector.EnhancedVectorDrawable
            android.content.Context r6 = r3.getContext()
            int r7 = defpackage.vba.c
            r5.<init>((android.content.Context) r6, (int) r7)
            pq9 r6 = defpackage.qp4.u0
            fka r6 = r6.j(r3)
            gae r6 = r6.i()
            lae r6 = r6.b
            int r6 = r6.b
            java.lang.String r7 = "stroke"
            one.me.sdk.richvector.VectorPath r7 = r5.findPath(r7)
            if (r7 == 0) goto L_0x004a
            r7.setStrokeColor(r6)
            r5.invalidatePath()
        L_0x004a:
            r0.setImageDrawable(r5)
        L_0x004d:
            int r9 = r9 + r4
            goto L_0x0013
        L_0x004f:
            android.content.res.Resources r9 = r3.getResources()
            int r0 = defpackage.xba.a
            int r2 = r3.getSelected()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5}
            java.lang.String r9 = r9.getQuantityString(r0, r1, r2)
            r3.setContentDescription(r9)
            f5c r9 = r3.H0
            if (r9 == 0) goto L_0x009e
            int r0 = r3.getSelected()
            u00 r9 = (defpackage.u00) r9
            bc7[] r1 = one.me.inappreview.ui.FakeInAppReviewBottomSheet.H0
            java.lang.Object r1 = r9.b
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1.setPressed(r8)
            java.lang.Object r8 = r9.c
            one.me.inappreview.ui.FakeInAppReviewBottomSheet r8 = (one.me.inappreview.ui.FakeInAppReviewBottomSheet) r8
            khe r2 = r8.E0
            java.lang.Object r2 = r2.getValue()
            android.graphics.drawable.RippleDrawable r2 = (android.graphics.drawable.RippleDrawable) r2
            r1.setBackground(r2)
            r2 = -1
            r1.setTextColor(r2)
            p23 r2 = new p23
            java.lang.Object r9 = r9.o
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            r2.<init>(r8, r0, r9, r4)
            defpackage.tu0.K(r1, 300, r2)
        L_0x009e:
            return
        L_0x009f:
            bc7[] r8 = one.me.sdk.bottomsheet.ConfirmationBottomSheet.G0
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r3 = (one.me.sdk.bottomsheet.ConfirmationBottomSheet) r3
            r3.getClass()
            bc7[] r8 = one.me.sdk.bottomsheet.ConfirmationBottomSheet.G0
            r5 = r8[r1]
            fs r5 = r3.E0
            java.lang.Object r6 = r5.a(r3)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x00d9
            r1 = r8[r1]
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.b(r3, r1)
            uu3 r1 = r3.getTargetController()
            boolean r5 = r1 instanceof defpackage.ng3
            if (r5 == 0) goto L_0x00ca
            r0 = r1
            ng3 r0 = (defpackage.ng3) r0
        L_0x00ca:
            if (r0 == 0) goto L_0x00d9
            r8 = r8[r9]
            fs r8 = r3.C0
            java.lang.Object r8 = r8.a(r3)
            android.os.Bundle r8 = (android.os.Bundle) r8
            r0.h(r2, r8)
        L_0x00d9:
            r3.s0(r4)
            return
        L_0x00dd:
            bc7[] r8 = one.me.sdk.bottomsheet.ConfirmationBottomSheet.G0
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r3 = (one.me.sdk.bottomsheet.ConfirmationBottomSheet) r3
            r3.getClass()
            bc7[] r8 = one.me.sdk.bottomsheet.ConfirmationBottomSheet.G0
            r5 = r8[r1]
            fs r5 = r3.E0
            java.lang.Object r6 = r5.a(r3)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0117
            r1 = r8[r1]
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.b(r3, r1)
            uu3 r1 = r3.getTargetController()
            boolean r5 = r1 instanceof defpackage.ng3
            if (r5 == 0) goto L_0x0108
            r0 = r1
            ng3 r0 = (defpackage.ng3) r0
        L_0x0108:
            if (r0 == 0) goto L_0x0117
            r8 = r8[r9]
            fs r8 = r3.C0
            java.lang.Object r8 = r8.a(r3)
            android.os.Bundle r8 = (android.os.Bundle) r8
            r0.h(r2, r8)
        L_0x0117:
            r3.s0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg3.onClick(android.view.View):void");
    }
}
