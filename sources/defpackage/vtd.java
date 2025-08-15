package defpackage;

import android.animation.ValueAnimator;

/* renamed from: vtd  reason: default package */
public final /* synthetic */ class vtd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l17 b;

    public /* synthetic */ vtd(l17 l17, int i) {
        this.a = i;
        this.b = l17;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ptd ptd = (ptd) this.b;
                ptd.H0.setTextColor(f8.G(ptd.H0.getCurrentTextColor(), floatValue));
                return;
            default:
                ((ptd) this.b).H0.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
