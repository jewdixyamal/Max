package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: ky4  reason: default package */
public final class ky4 extends hqd {
    public final ShapeDrawable F0;
    public final OneMeDraweeView G0;
    public final gic H0;
    public final int I0;
    public d02 J0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ky4(android.content.Context r6, android.graphics.drawable.ShapeDrawable r7, defpackage.jy2 r8) {
        /*
            r5 = this;
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = 36
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
            r0.<init>(r2, r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r6)
            r1.setLayoutParams(r0)
            r0 = 6
            float r0 = (float) r0
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = defpackage.tu0.G(r0)
            r1.setPadding(r0, r0, r0, r0)
            one.me.sdk.uikit.common.views.OneMeDraweeView r0 = new one.me.sdk.uikit.common.views.OneMeDraweeView
            r0.<init>(r6)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r4 = 17
            r2.<init>(r3, r3, r4)
            r0.setLayoutParams(r2)
            rq4 r2 = r0.getHierarchy()
            la6 r2 = (defpackage.la6) r2
            ssc r3 = defpackage.ssc.m
            r2.h(r3)
            r1.addView(r0)
            r5.<init>(r1)
            r5.F0 = r7
            r7 = 0
            android.view.View r7 = r1.getChildAt(r7)
            boolean r0 = r7 instanceof one.me.sdk.uikit.common.views.OneMeDraweeView
            r2 = 0
            if (r0 == 0) goto L_0x0072
            one.me.sdk.uikit.common.views.OneMeDraweeView r7 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r7
            goto L_0x0073
        L_0x0072:
            r7 = r2
        L_0x0073:
            r5.G0 = r7
            hy4 r7 = new hy4
            r0 = 1
            r7.<init>((android.content.Context) r6, (int) r0)
            gic r7 = defpackage.nu0.L(r7)
            r5.H0 = r7
            r7 = 24
            float r7 = (float) r7
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r7 = r7 * r0
            int r7 = defpackage.tu0.G(r7)
            r5.I0 = r7
            xh0 r7 = new xh0
            r0 = 10
            r7.<init>(r5, r6, r2, r0)
            defpackage.v3c.y(r7, r1)
            tb r6 = new tb
            r7 = 29
            r6.<init>((java.lang.Object) r5, (defpackage.m56) r8, (int) r7)
            defpackage.tu0.K(r1, 300, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky4.<init>(android.content.Context, android.graphics.drawable.ShapeDrawable, jy2):void");
    }

    public final void A(ol7 ol7) {
        d02 d02 = (d02) ol7;
        this.J0 = d02;
        String str = d02.X;
        int i = 8;
        gic gic = this.H0;
        OneMeDraweeView oneMeDraweeView = this.G0;
        if (str != null) {
            if (oneMeDraweeView != null) {
                oneMeDraweeView.setVisibility(0);
            }
            if (oneMeDraweeView != null) {
                wv6 b = wv6.b(str);
                int i2 = OneMeDraweeView.B0;
                oneMeDraweeView.o(b, (wv6) null);
            }
            String str2 = d02.Y;
            if (str2 != null) {
                dw7 dw7 = (dw7) gic.getValue();
                br7.b((ViewGroup) this.a, dw7, -1);
                dw7.setVisibility(0);
                int i3 = this.I0;
                boolean f = dw7.f(i3, i3, str2);
                if (oneMeDraweeView != null) {
                    if (f) {
                        i = 0;
                    }
                    oneMeDraweeView.setVisibility(i);
                }
                dw7.setOnFirstFrameListener(new q64(11, (Object) this));
            } else if (gic.a()) {
                dw7 dw72 = (dw7) gic.getValue();
                dw72.c();
                dw72.setVisibility(8);
            }
        } else {
            if (oneMeDraweeView != null) {
                oneMeDraweeView.setVisibility(0);
            }
            if (oneMeDraweeView != null) {
                oneMeDraweeView.setImageResource(d02.s0);
            }
            if (gic.a()) {
                dw7 dw73 = (dw7) gic.getValue();
                dw73.c();
                dw73.setVisibility(8);
            }
        }
        E(d02.c);
    }

    public final void E(boolean z) {
        View view = this.a;
        ((ViewGroup) view).setBackground(z ? this.F0 : null);
        OneMeDraweeView oneMeDraweeView = this.G0;
        if (oneMeDraweeView != null) {
            pq9 pq9 = qp4.u0;
            oneMeDraweeView.setImageTintList(ColorStateList.valueOf(z ? pq9.j(view).getIcon().f : pq9.j(view).getIcon().j));
        }
    }
}
