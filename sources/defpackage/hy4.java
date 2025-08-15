package defpackage;

import android.content.Context;

/* renamed from: hy4  reason: default package */
public final /* synthetic */ class hy4 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ hy4(iy4 iy4, Context context) {
        this.a = 0;
        this.b = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r12 = this;
            r0 = 0
            r1 = 17
            r2 = 0
            r3 = 3
            r4 = 12
            r5 = 4
            r6 = -1
            r7 = 1
            r8 = -2
            r9 = 0
            int r10 = r12.a
            switch(r10) {
                case 0: goto L_0x043c;
                case 1: goto L_0x0427;
                case 2: goto L_0x03eb;
                case 3: goto L_0x03ca;
                case 4: goto L_0x03c2;
                case 5: goto L_0x03ba;
                case 6: goto L_0x0360;
                case 7: goto L_0x0353;
                case 8: goto L_0x034c;
                case 9: goto L_0x02f9;
                case 10: goto L_0x02de;
                case 11: goto L_0x0284;
                case 12: goto L_0x0277;
                case 13: goto L_0x0263;
                case 14: goto L_0x01fe;
                case 15: goto L_0x01f6;
                case 16: goto L_0x01de;
                case 17: goto L_0x01aa;
                case 18: goto L_0x0179;
                case 19: goto L_0x0152;
                case 20: goto L_0x0148;
                case 21: goto L_0x013e;
                case 22: goto L_0x0134;
                case 23: goto L_0x010a;
                case 24: goto L_0x00d4;
                case 25: goto L_0x006f;
                case 26: goto L_0x004d;
                case 27: goto L_0x0025;
                case 28: goto L_0x001b;
                default: goto L_0x0011;
            }
        L_0x0011:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = defpackage.m2c.Theme_MaterialComponents
            android.content.Context r12 = r12.b
            r0.<init>(r12, r1)
            return r0
        L_0x001b:
            one.me.sdk.richvector.EnhancedVectorDrawable r0 = new one.me.sdk.richvector.EnhancedVectorDrawable
            int r1 = defpackage.yfa.l
            android.content.Context r12 = r12.b
            r0.<init>((android.content.Context) r12, (int) r1)
            return r0
        L_0x0025:
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            int r12 = defpackage.xoc.n
            r0.setId(r12)
            ti3 r12 = new ti3
            r12.<init>(r8, r8)
            int r1 = defpackage.xoc.o
            r12.i = r1
            r12.v = r1
            r12.l = r1
            r12.t = r1
            r0.setLayoutParams(r12)
            ze2 r12 = new ze2
            r1 = 2
            r12.<init>(r3, r9, r1)
            defpackage.v3c.y(r12, r0)
            return r0
        L_0x004d:
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            android.content.Context r12 = r12.b
            r0.<init>(r12, r9)
            int r12 = defpackage.xoc.l
            r0.setId(r12)
            ti3 r12 = new ti3
            r12.<init>(r2, r2)
            r12.t = r2
            r12.i = r2
            r12.v = r2
            r12.l = r2
            r0.setLayoutParams(r12)
            android.widget.ImageView$ScaleType r12 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r12)
            return r0
        L_0x006f:
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r12 = r12.b
            r0.<init>(r12, r9)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r6, r6)
            float r1 = (float) r5
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = defpackage.tu0.G(r1)
            r12.topMargin = r1
            r1 = 6
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = defpackage.tu0.G(r2)
            r12.leftMargin = r2
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = defpackage.tu0.G(r1)
            r12.rightMargin = r1
            r0.setLayoutParams(r12)
            r0.setGravity(r7)
            r0.setMaxLines(r7)
            android.text.TextUtils$TruncateAt r12 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r12)
            pq9 r12 = defpackage.qp4.u0
            fka r12 = r12.j(r0)
            xoe r12 = r12.getText()
            int r12 = r12.e
            r0.setTextColor(r12)
            kqe r12 = defpackage.i4f.s
            r12.b(r0, defpackage.du4.b)
            return r0
        L_0x00d4:
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r1 = 24
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = defpackage.tu0.G(r2)
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = defpackage.tu0.G(r1)
            r12.<init>(r2, r1)
            r0.setLayoutParams(r12)
            android.widget.ImageView$ScaleType r12 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r0.setScaleType(r12)
            return r0
        L_0x010a:
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            int r12 = defpackage.xoc.j
            r0.setId(r12)
            android.text.TextUtils$TruncateAt r12 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r12)
            r0.setMaxLines(r7)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r12.<init>(r6, r8)
            r12.gravity = r1
            r0.setLayoutParams(r12)
            r0.setGravity(r1)
            r0.setTextAlignment(r5)
            kqe r12 = defpackage.i4f.F
            r12.b(r0, defpackage.du4.b)
            return r0
        L_0x0134:
            bc7[] r0 = one.me.sdk.uikit.common.button.OneMeButton.B0
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            return r0
        L_0x013e:
            bc7[] r0 = one.me.sdk.uikit.common.button.OneMeButton.B0
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            android.content.Context r12 = r12.b
            r0.<init>(r12, r9)
            return r0
        L_0x0148:
            bc7[] r0 = one.me.sdk.uikit.common.button.OneMeButton.B0
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            android.content.Context r12 = r12.b
            r0.<init>(r12, r9)
            return r0
        L_0x0152:
            one.me.sdk.richvector.EnhancedVectorDrawable r0 = new one.me.sdk.richvector.EnhancedVectorDrawable
            int r1 = defpackage.jub.ic_delete_filled_apart_24
            android.content.Context r12 = r12.b
            r0.<init>((android.content.Context) r12, (int) r1)
            pq9 r1 = defpackage.qp4.u0
            qp4 r2 = r1.b(r12)
            fka r2 = r2.i()
            r2.getIcon()
            java.lang.String r2 = "cross"
            defpackage.c54.Z(r0, r2, r6)
            bs6 r12 = defpackage.k7d.h(r1, r12)
            int r12 = r12.j
            java.lang.String r1 = "circle_background"
            defpackage.c54.Z(r0, r1, r12)
            return r0
        L_0x0179:
            one.me.sdk.richvector.EnhancedVectorDrawable r0 = new one.me.sdk.richvector.EnhancedVectorDrawable
            int r1 = defpackage.jub.ic_online_24
            android.content.Context r12 = r12.b
            r0.<init>((android.content.Context) r12, (int) r1)
            pq9 r1 = defpackage.qp4.u0
            bs6 r2 = defpackage.k7d.h(r1, r12)
            java.lang.String r3 = "online"
            int r2 = r2.e
            defpackage.c54.Z(r0, r3, r2)
            qp4 r12 = r1.b(r12)
            fka r12 = r12.i()
            ne0 r12 = r12.b()
            one.me.sdk.richvector.VectorPath r1 = r0.findPath(r3)
            if (r1 == 0) goto L_0x01a9
            int r12 = r12.k
            r1.setStrokeColor(r12)
            r0.invalidatePath()
        L_0x01a9:
            return r0
        L_0x01aa:
            one.me.sdk.richvector.EnhancedVectorDrawable r0 = new one.me.sdk.richvector.EnhancedVectorDrawable
            int r1 = defpackage.pub.ic_add_button_28
            android.content.Context r12 = r12.b
            r0.<init>((android.content.Context) r12, (int) r1)
            pq9 r1 = defpackage.qp4.u0
            qp4 r2 = r1.b(r12)
            fka r2 = r2.i()
            ne0 r2 = r2.b()
            me0 r2 = r2.a
            int r2 = r2.f
            java.lang.String r3 = "background"
            defpackage.c54.Z(r0, r3, r2)
            qp4 r12 = r1.b(r12)
            fka r12 = r12.i()
            bs6 r12 = r12.getIcon()
            int r12 = r12.b
            java.lang.String r1 = "plus"
            defpackage.c54.Z(r0, r1, r12)
            return r0
        L_0x01de:
            one.me.sdk.uikit.common.views.OneMeDraweeView r0 = new one.me.sdk.uikit.common.views.OneMeDraweeView
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            rq4 r12 = r0.getHierarchy()
            la6 r12 = (defpackage.la6) r12
            ya5 r12 = r12.e
            r12.w0 = r2
            int r1 = r12.v0
            if (r1 != r7) goto L_0x01f5
            r12.v0 = r2
        L_0x01f5:
            return r0
        L_0x01f6:
            s5a r0 = new s5a
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            return r0
        L_0x01fe:
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            int r12 = defpackage.xoc.W
            r0.setId(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r1 = 36
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = defpackage.tu0.G(r2)
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r1 = r1 * r5
            int r1 = defpackage.tu0.G(r1)
            r12.<init>(r2, r1)
            r1 = 16
            r12.gravity = r1
            float r1 = (float) r4
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = defpackage.tu0.G(r1)
            int r2 = r12.topMargin
            int r4 = r12.rightMargin
            int r5 = r12.bottomMargin
            r12.setMargins(r1, r2, r4, r5)
            r0.setLayoutParams(r12)
            android.widget.ImageView$ScaleType r12 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r0.setScaleType(r12)
            int r12 = defpackage.woc.b1
            r0.setImageResource(r12)
            ze2 r12 = new ze2
            r12.<init>(r3, r9, r7)
            defpackage.v3c.y(r12, r0)
            return r0
        L_0x0263:
            uzd r0 = new uzd
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r8, r8)
            r1 = 80
            r12.gravity = r1
            r0.setLayoutParams(r12)
            return r0
        L_0x0277:
            y2b r0 = new y2b
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            int r12 = defpackage.woc.u0
            r0.a(r12)
            return r0
        L_0x0284:
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r12 = r12.b
            r0.<init>(r12, r9)
            pq9 r12 = defpackage.qp4.u0
            fka r12 = r12.j(r0)
            xoe r12 = r12.getText()
            int r12 = r12.b
            r0.setTextColor(r12)
            kqe r12 = defpackage.i4f.p
            r12.b(r0, defpackage.du4.b)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r8, r8)
            r0.setLayoutParams(r12)
            float r12 = (float) r4
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r12
            int r1 = defpackage.tu0.G(r1)
            float r2 = (float) r5
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = defpackage.tu0.G(r2)
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r12 = r12 * r3
            int r12 = defpackage.tu0.G(r12)
            int r3 = r0.getPaddingBottom()
            r0.setPaddingRelative(r1, r2, r12, r3)
            return r0
        L_0x02de:
            android.view.View r0 = new android.view.View
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            pq9 r12 = defpackage.qp4.u0
            sba r12 = r12.p(r0)
            fka r12 = r12.c
            gae r12 = r12.i()
            lae r12 = r12.b
            int r12 = r12.c
            r0.setBackgroundColor(r12)
            return r0
        L_0x02f9:
            h2a r0 = new h2a
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            kqe r12 = defpackage.i4f.G
            r12.b(r0, defpackage.du4.b)
            r0.setMaxLines(r7)
            android.text.TextUtils$TruncateAt r12 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r12)
            float r12 = (float) r4
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r12
            int r1 = defpackage.tu0.G(r1)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r12 = r12 * r2
            int r12 = defpackage.tu0.G(r12)
            int r2 = r0.getPaddingTop()
            int r3 = r0.getPaddingBottom()
            r0.setPaddingRelative(r1, r2, r12, r3)
            pq9 r12 = defpackage.qp4.u0
            sba r12 = r12.p(r0)
            fka r12 = r12.c
            xoe r12 = r12.getText()
            int r12 = r12.e
            r0.setTextColor(r12)
            defpackage.np8.n(r0)
            return r0
        L_0x034c:
            android.content.Context r12 = r12.b
            android.renderscript.RenderScript r12 = android.renderscript.RenderScript.create(r12)
            return r12
        L_0x0353:
            y2b r0 = new y2b
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            int r12 = defpackage.woc.u0
            r0.a(r12)
            return r0
        L_0x0360:
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r12 = r12.b
            r0.<init>(r12, r9)
            kqe r12 = defpackage.i4f.p
            r12.b(r0, defpackage.du4.b)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r8, r8)
            r0.setLayoutParams(r12)
            float r12 = (float) r4
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r12
            int r1 = defpackage.tu0.G(r1)
            float r2 = (float) r5
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = defpackage.tu0.G(r2)
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r12 = r12 * r3
            int r12 = defpackage.tu0.G(r12)
            int r3 = r0.getPaddingBottom()
            r0.setPaddingRelative(r1, r2, r12, r3)
            pq9 r12 = defpackage.qp4.u0
            fka r12 = r12.j(r0)
            xoe r12 = r12.getText()
            int r12 = r12.b
            r0.setTextColor(r12)
            return r0
        L_0x03ba:
            up0 r0 = new up0
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            return r0
        L_0x03c2:
            h94 r0 = new h94
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            return r0
        L_0x03ca:
            ay r0 = new ay
            android.content.Context r12 = r12.b
            r0.<init>((android.content.Context) r12, (int) r3)
            h84 r12 = new h84
            java.lang.Object r1 = r0.X
            r6 = r1
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r1 = r0.Y
            r8 = r1
            rhe r8 = (defpackage.rhe) r8
            boolean r9 = r0.b
            java.lang.Object r1 = r0.o
            r5 = r1
            android.content.Context r5 = (android.content.Context) r5
            int r7 = r0.c
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            return r12
        L_0x03eb:
            int r1 = one.me.sdk.lists.widgets.EndlessRecyclerView2.i2
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            android.content.Context r12 = r12.b
            if (r1 < r2) goto L_0x03fa
            android.view.Display r9 = r12.getDisplay()
            goto L_0x0408
        L_0x03fa:
            java.lang.Class<android.view.WindowManager> r1 = android.view.WindowManager.class
            java.lang.Object r12 = defpackage.lt3.b(r12, r1)
            android.view.WindowManager r12 = (android.view.WindowManager) r12
            if (r12 == 0) goto L_0x0408
            android.view.Display r9 = r12.getDefaultDisplay()
        L_0x0408:
            if (r9 == 0) goto L_0x040f
            float r12 = r9.getRefreshRate()
            goto L_0x0410
        L_0x040f:
            r12 = r0
        L_0x0410:
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x041f
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r0 = (float) r0
            float r0 = r0 / r12
            double r0 = (double) r0
            long r0 = defpackage.tu0.H(r0)
            goto L_0x0422
        L_0x041f:
            r0 = 160000000(0x9896800, double:7.90505033E-316)
        L_0x0422:
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            return r12
        L_0x0427:
            dw7 r0 = new dw7
            android.content.Context r12 = r12.b
            r0.<init>(r12, r9)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r12.<init>(r6, r6, r1)
            r0.setLayoutParams(r12)
            r12 = 8
            r0.setVisibility(r12)
            return r0
        L_0x043c:
            android.content.Context r12 = r12.b
            android.graphics.Bitmap r1 = defpackage.fp3.y(r12, r2)
            if (r1 == 0) goto L_0x0448
            int r2 = r1.getWidth()
        L_0x0448:
            android.content.res.Resources r1 = r12.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.densityDpi
            r3 = 240(0xf0, float:3.36E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 48
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            kpa r6 = new kpa
            r6.<init>(r3, r5)
            r3 = 320(0x140, float:4.48E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 64
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            kpa r7 = new kpa
            r7.<init>(r3, r5)
            r3 = 480(0x1e0, float:6.73E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 96
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            kpa r10 = new kpa
            r10.<init>(r3, r8)
            r3 = 640(0x280, float:8.97E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            kpa r8 = new kpa
            r8.<init>(r3, r5)
            kpa[] r3 = new defpackage.kpa[]{r6, r7, r10, r8}
            java.util.Map r3 = defpackage.mz7.a0(r3)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Set r6 = r3.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x04a9:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x04cd
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 > r1) goto L_0x04a9
            java.lang.Object r8 = r7.getKey()
            java.lang.Object r7 = r7.getValue()
            r5.put(r8, r7)
            goto L_0x04a9
        L_0x04cd:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x04dd
            r6 = r9
            goto L_0x0510
        L_0x04dd:
            java.lang.Object r6 = r5.next()
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x04e8
            goto L_0x0510
        L_0x04e8:
            r7 = r6
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getKey()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
        L_0x04f5:
            java.lang.Object r8 = r5.next()
            r10 = r8
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r10 = r10.getKey()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r7 >= r10) goto L_0x050a
            r6 = r8
            r7 = r10
        L_0x050a:
            boolean r8 = r5.hasNext()
            if (r8 != 0) goto L_0x04f5
        L_0x0510:
            r8 = r6
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0520:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0544
            java.lang.Object r6 = r3.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 <= r1) goto L_0x0520
            java.lang.Object r7 = r6.getKey()
            java.lang.Object r6 = r6.getValue()
            r5.put(r7, r6)
            goto L_0x0520
        L_0x0544:
            java.util.Set r3 = r5.entrySet()
            java.util.Iterator r10 = r3.iterator()
            boolean r3 = r10.hasNext()
            if (r3 != 0) goto L_0x0554
            r3 = r9
            goto L_0x0587
        L_0x0554:
            java.lang.Object r3 = r10.next()
            boolean r5 = r10.hasNext()
            if (r5 != 0) goto L_0x055f
            goto L_0x0587
        L_0x055f:
            r5 = r3
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L_0x056c:
            java.lang.Object r6 = r10.next()
            r7 = r6
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getKey()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r5 <= r7) goto L_0x0581
            r3 = r6
            r5 = r7
        L_0x0581:
            boolean r6 = r10.hasNext()
            if (r6 != 0) goto L_0x056c
        L_0x0587:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Class r5 = r12.getClass()
            java.lang.String r5 = r5.getName()
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x0596
            goto L_0x05bf
        L_0x0596:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x05bf
            us7 r7 = defpackage.us7.X
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "phoneDensity: "
            r10.<init>(r11)
            r10.append(r1)
            java.lang.String r11 = "; lowerDensity: "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r11 = "; higherDensity: "
            r10.append(r11)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            r6.d(r7, r5, r10, r9)
        L_0x05bf:
            if (r3 == 0) goto L_0x05d8
            java.lang.Object r5 = r3.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != r1) goto L_0x05d8
            java.lang.Object r1 = r3.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r4 = r1.intValue()
            goto L_0x0607
        L_0x05d8:
            if (r8 == 0) goto L_0x05e1
            java.lang.Object r5 = r8.getKey()
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L_0x05e2
        L_0x05e1:
            r5 = r9
        L_0x05e2:
            if (r5 == 0) goto L_0x05fb
            java.lang.Object r5 = r8.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 < r1) goto L_0x05fb
            java.lang.Object r1 = r8.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r4 = r1.intValue()
            goto L_0x0607
        L_0x05fb:
            if (r3 == 0) goto L_0x0607
            java.lang.Object r1 = r3.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r4 = r1.intValue()
        L_0x0607:
            java.lang.Class<iy4> r1 = defpackage.iy4.class
            java.lang.String r3 = r1.getName()
            ir6 r5 = defpackage.hm9.m
            if (r5 != 0) goto L_0x0612
            goto L_0x062f
        L_0x0612:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x062f
            us7 r6 = defpackage.us7.X
            android.content.res.Resources r12 = r12.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r12 = r12.densityDpi
            java.lang.String r7 = "Emoji size by density: "
            java.lang.String r8 = ", density:"
            java.lang.String r12 = defpackage.rh4.h(r7, r4, r12, r8)
            r5.d(r6, r3, r12, r9)
        L_0x062f:
            float r12 = (float) r2
            r3 = 13
            float r3 = (float) r3
            float r12 = r12 / r3
            java.lang.String r3 = r1.getName()
            ir6 r5 = defpackage.hm9.m
            if (r5 != 0) goto L_0x063d
            goto L_0x0656
        L_0x063d:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x0656
            us7 r6 = defpackage.us7.X
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Calculated emoji size in sprite before coarce: "
            r7.<init>(r8)
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            r5.d(r6, r3, r7, r9)
        L_0x0656:
            float r3 = (float) r4
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x065c
            r12 = r3
        L_0x065c:
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x067c
            java.lang.String r12 = r1.getName()
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x0669
            goto L_0x067a
        L_0x0669:
            boolean r3 = r0.c()
            if (r3 == 0) goto L_0x067a
            us7 r3 = defpackage.us7.X
            java.lang.String r4 = "Fallback for emoji size. Sprite width: "
            java.lang.String r4 = defpackage.zr6.h(r2, r4)
            r0.d(r3, r12, r4, r9)
        L_0x067a:
            r12 = 1111490560(0x42400000, float:48.0)
        L_0x067c:
            java.lang.String r0 = r1.getName()
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0685
            goto L_0x06a6
        L_0x0685:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x06a6
            us7 r3 = defpackage.us7.X
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Sprite width: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = "; Calculated emoji size in sprite: "
            r4.append(r2)
            r4.append(r12)
            java.lang.String r2 = r4.toString()
            r1.d(r3, r0, r2, r9)
        L_0x06a6:
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy4.invoke():java.lang.Object");
    }

    public /* synthetic */ hy4(Context context, int i) {
        this.a = i;
        this.b = context;
    }
}
