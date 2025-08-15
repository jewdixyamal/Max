package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: pwc  reason: default package */
public final class pwc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ float b;

    public pwc(iwc iwc, float f) {
        this.a = iwc;
        this.b = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.a;
        view.setTranslationY(floatValue);
        float f = this.b;
        float f2 = 0.0f;
        if (f != 0.0f) {
            f2 = 1.0f - f;
        }
        if (valueAnimator.getAnimatedFraction() >= f2) {
            view.setAlpha(((float) 1) - valueAnimator.getAnimatedFraction());
        }
    }
}
