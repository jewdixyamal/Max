package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: oo9  reason: default package */
public final class oo9 extends OneMeDraweeView implements kre {
    public boolean C0 = true;
    public final je7 D0 = tu0.r(3, new zj7(13, this));

    public oo9(Context context) {
        super(context);
        setClipToOutline(true);
        ma6 ma6 = new ma6(getResources());
        ma6.d = getShimmerDrawable();
        wnc wnc = new wnc();
        wnc.b = true;
        ma6.p = wnc;
        setHierarchy(ma6.a());
    }

    private final no9 getShimmerDrawable() {
        return (no9) this.D0.getValue();
    }

    public static yld q(fka fka) {
        bkg bkg = new bkg(25);
        yld yld = (yld) bkg.b;
        yld.k = false;
        yld.i = 0.0f;
        bkg.v(fka.b().l);
        yld.d = fka.b().k;
        bkg.u();
        bkg.x(tu0.G(((float) 64) * fk4.d().getDisplayMetrics().density));
        return bkg.m();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClickable(!this.C0);
        if (!this.C0) {
            getShimmerDrawable().c();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.C0) {
            getShimmerDrawable().d();
        }
    }

    public final void onThemeChanged(fka fka) {
        getShimmerDrawable().b(q(fka));
    }

    public final void p(ru6 ru6, Animatable animatable) {
        this.C0 = false;
        getShimmerDrawable().d();
        setClickable(!this.C0);
    }
}
