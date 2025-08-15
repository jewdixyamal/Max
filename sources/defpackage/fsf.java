package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;

/* renamed from: fsf  reason: default package */
public final /* synthetic */ class fsf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ GradientDrawable b;

    public /* synthetic */ fsf(GradientDrawable gradientDrawable, int i) {
        this.a = i;
        this.b = gradientDrawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                GradientDrawable gradientDrawable = this.b;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    return;
                }
                return;
            default:
                GradientDrawable gradientDrawable2 = this.b;
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    return;
                }
                return;
        }
    }
}
