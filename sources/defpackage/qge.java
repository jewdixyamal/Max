package defpackage;

import android.animation.ValueAnimator;

/* renamed from: qge  reason: default package */
public final /* synthetic */ class qge implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rge b;

    public /* synthetic */ qge(rge rge, int i) {
        this.a = i;
        this.b = rge;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
