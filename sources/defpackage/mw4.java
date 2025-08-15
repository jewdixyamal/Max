package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import one.me.rlottie.RLottieDrawable;

/* renamed from: mw4  reason: default package */
public final class mw4 extends hqd implements hx4 {
    public static final /* synthetic */ int H0 = 0;
    public qx4 F0;
    public final gi G0 = new gi(1, this);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mw4(android.content.Context r3, defpackage.bkg r4) {
        /*
            r2 = this;
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r3)
            r2.<init>(r0)
            gi r3 = new gi
            r1 = 1
            r3.<init>(r1, r2)
            r2.G0 = r3
            r3 = 32
            float r3 = (float) r3
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r3 = r3 * r1
            int r3 = defpackage.tu0.G(r3)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r3, r3)
            r0.setLayoutParams(r1)
            r3 = 2
            float r3 = (float) r3
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            defpackage.rh4.p(r3, r1, r0)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r0.setScaleType(r3)
            tb r3 = new tb
            r1 = 28
            r3.<init>((java.lang.Object) r2, (int) r1, (java.lang.Object) r4)
            r0.setOnClickListener(r3)
            br r3 = new br
            r4 = 0
            r1 = 6
            r3.<init>((java.lang.Object) r2, (kotlin.coroutines.Continuation) r4, (int) r1)
            defpackage.v3c.y(r3, r0)
            ck r3 = new ck
            r4 = 4
            r3.<init>(r4, r2)
            r0.addOnAttachStateChangeListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw4.<init>(android.content.Context, bkg):void");
    }

    public final void A(ol7 ol7) {
        if (ol7 instanceof qx4) {
            qx4 qx4 = (qx4) ol7;
            this.F0 = qx4;
            if (qx4.Y == 0) {
                E(true);
            }
            View view = this.a;
            ((ImageView) view).setImageDrawable(qx4.X);
            Drawable drawable = ((ImageView) view).getDrawable();
            zj zjVar = drawable instanceof zj ? (zj) drawable : null;
            if (zjVar != null) {
                Drawable b = zjVar.b();
                RLottieDrawable rLottieDrawable = zjVar.x0;
                if (b == rLottieDrawable && rLottieDrawable != null) {
                    rLottieDrawable.addParentView(this.G0);
                }
                zjVar.start();
            }
        }
    }

    public final void E(boolean z) {
        Drawable drawable = ((ImageView) this.a).getDrawable();
        zj zjVar = drawable instanceof zj ? (zj) drawable : null;
        if (zjVar != null) {
            RLottieDrawable rLottieDrawable = zjVar.x0;
            if (rLottieDrawable != null) {
                rLottieDrawable.removeParentView(this.G0);
            }
            RLottieDrawable rLottieDrawable2 = zjVar.x0;
            if (rLottieDrawable2 == null || !rLottieDrawable2.hasParentViews() || z) {
                zjVar.stop();
            }
        }
    }

    public final void d() {
        Drawable drawable;
        qx4 qx4 = this.F0;
        if (qx4 != null && (drawable = qx4.X) != null) {
            ((ImageView) this.a).invalidateDrawable(drawable);
        }
    }
}
