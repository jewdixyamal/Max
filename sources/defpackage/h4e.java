package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: h4e  reason: default package */
public final class h4e extends hqd {
    public final ShapeDrawable F0;
    public Drawable G0;
    public final int H0 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
    public final int I0 = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
    public final int J0 = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
    public final int K0 = tu0.G(((float) 14) * fk4.d().getDisplayMetrics().density);
    public e02 L0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h4e(android.content.Context r6, android.graphics.drawable.ShapeDrawable r7, defpackage.jy2 r8) {
        /*
            r5 = this;
            one.me.sdk.uikit.common.views.OneMeDraweeView r0 = new one.me.sdk.uikit.common.views.OneMeDraweeView
            r0.<init>(r6)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = 36
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r2
            int r3 = defpackage.tu0.G(r3)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r2 = r2 * r4
            int r2 = defpackage.tu0.G(r2)
            r1.<init>(r3, r2)
            r2 = 6
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = defpackage.tu0.G(r2)
            r0.setPadding(r2, r2, r2, r2)
            r0.setLayoutParams(r1)
            rq4 r1 = r0.getHierarchy()
            la6 r1 = (defpackage.la6) r1
            ssc r2 = defpackage.ssc.m
            r1.h(r2)
            r5.<init>(r0)
            r5.F0 = r7
            r7 = 8
            float r7 = (float) r7
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r7 = r7 * r1
            int r7 = defpackage.tu0.G(r7)
            r5.H0 = r7
            r7 = 12
            float r7 = (float) r7
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r7 = r7 * r1
            int r7 = defpackage.tu0.G(r7)
            r5.I0 = r7
            r7 = 16
            float r7 = (float) r7
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r7 = r7 * r1
            int r7 = defpackage.tu0.G(r7)
            r5.J0 = r7
            r7 = 14
            float r7 = (float) r7
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r7 = r7 * r1
            int r7 = defpackage.tu0.G(r7)
            r5.K0 = r7
            r1b r7 = new r1b
            r1 = 0
            r7.<init>((defpackage.h4e) r5, (android.content.Context) r6, (kotlin.coroutines.Continuation) r1)
            defpackage.v3c.y(r7, r0)
            v7d r6 = new v7d
            r7 = 10
            r6.<init>(r5, r7, r8)
            defpackage.tu0.K(r0, 300, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h4e.<init>(android.content.Context, android.graphics.drawable.ShapeDrawable, jy2):void");
    }

    public final void A(ol7 ol7) {
        e02 e02 = (e02) ol7;
        this.L0 = e02;
        w3e w3e = e02.b;
        String str = w3e.c;
        View view = this.a;
        if (str == null || str.length() == 0) {
            Integer num = e02.o;
            if (num != null) {
                ((OneMeDraweeView) view).setImageResource(num.intValue());
            }
        } else {
            ((OneMeDraweeView) view).setImageURI(str);
        }
        F(w3e.Z);
        E(w3e.Y);
    }

    public final void E(int i) {
        View view = this.a;
        if (i == 5) {
            if (this.G0 == null) {
                this.G0 = G();
            }
            ((la6) ((OneMeDraweeView) view).getHierarchy()).k(this.G0);
            return;
        }
        ((la6) ((OneMeDraweeView) view).getHierarchy()).k((Drawable) null);
    }

    public final void F(boolean z) {
        View view = this.a;
        if (z) {
            ((OneMeDraweeView) view).setBackground(this.F0);
        } else {
            ((OneMeDraweeView) view).setBackground((Drawable) null);
        }
        e02 e02 = this.L0;
        if ((e02 != null ? e02.o : null) != null) {
            OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) view;
            pq9 pq9 = qp4.u0;
            oneMeDraweeView.setImageTintList(ColorStateList.valueOf(z ? pq9.j(view).getIcon().f : pq9.j(view).getIcon().j));
            return;
        }
        ((OneMeDraweeView) view).setImageTintList((ColorStateList) null);
    }

    public final LayerDrawable G() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        pq9 pq9 = qp4.u0;
        View view = this.a;
        ngg.G(shapeDrawable, pq9.j(view).b().a.g);
        Drawable b = kt3.b(((OneMeDraweeView) view).getContext(), ica.a);
        ngg.G(b, pq9.j(view).getIcon().i);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, b});
        int i = this.I0;
        layerDrawable.setLayerSize(0, i, i);
        int i2 = this.H0;
        layerDrawable.setLayerSize(1, i2, i2);
        int i3 = this.K0;
        LayerDrawable layerDrawable2 = layerDrawable;
        layerDrawable2.setLayerInset(0, i3, i3, 0, 0);
        int i4 = this.J0;
        layerDrawable2.setLayerInset(1, i4, i4, 0, 0);
        return layerDrawable;
    }
}
