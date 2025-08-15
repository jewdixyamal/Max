package defpackage;

import android.animation.ValueAnimator;

/* renamed from: q0b  reason: default package */
public final /* synthetic */ class q0b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0b b;

    public /* synthetic */ q0b(s0b s0b, int i) {
        this.a = i;
        this.b = s0b;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s0b s0b = this.b;
                s0b.v0.setAlpha((int) (((float) 255) * floatValue));
                if (floatValue == 0.0f) {
                    s0b.u0 = false;
                }
                s0b.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s0b s0b2 = this.b;
                s0b2.o = floatValue2;
                s0b2.invalidate();
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s0b s0b3 = this.b;
                s0b3.x0 = floatValue3;
                s0b3.invalidate();
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s0b s0b4 = this.b;
                s0b4.y0 = floatValue4;
                s0b4.invalidate();
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s0b s0b5 = this.b;
                s0b5.B0 = floatValue5;
                s0b5.invalidate();
                return;
            default:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s0b s0b6 = this.b;
                s0b6.C0 = floatValue6;
                s0b6.invalidate();
                return;
        }
    }
}
