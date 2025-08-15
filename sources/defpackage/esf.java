package defpackage;

import android.animation.ValueAnimator;

/* renamed from: esf  reason: default package */
public final /* synthetic */ class esf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lsf b;

    public /* synthetic */ esf(lsf lsf, int i) {
        this.a = i;
        this.b = lsf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.x0.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 1:
                this.b.v0.setLinesColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                this.b.x0.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
