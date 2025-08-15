package defpackage;

import android.animation.ValueAnimator;

/* renamed from: nq4  reason: default package */
public final class nq4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ na6 a;
    public final /* synthetic */ oq4 b;

    public nq4(oq4 oq4, na6 na6) {
        this.b = oq4;
        this.a = na6;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = 0;
        while (true) {
            oq4 oq4 = this.b;
            if (i < 8) {
                float f = oq4.b[i] * floatValue;
                oq4.c[i] = f + ((1.0f - floatValue) * oq4.a[i]);
                i++;
            } else {
                ((la6) this.a.getHierarchy()).n(wnc.b(oq4.c));
                return;
            }
        }
    }
}
