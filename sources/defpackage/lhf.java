package defpackage;

import android.animation.ValueAnimator;

/* renamed from: lhf  reason: default package */
public final /* synthetic */ class lhf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ohf b;

    public /* synthetic */ lhf(ohf ohf, int i) {
        this.a = i;
        this.b = ohf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ohf ohf = this.b;
                ohf.B0 = floatValue;
                ohf.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ohf ohf2 = this.b;
                ohf2.z0 = floatValue2;
                ohf2.postInvalidateOnAnimation();
                return;
        }
    }
}
