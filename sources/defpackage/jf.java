package defpackage;

import android.animation.ValueAnimator;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: jf  reason: default package */
public final /* synthetic */ class jf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ jf(Object obj, Object obj2, float f, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((OneMeButton) this.c).setTranslationY(floatValue);
                ((OneMeButton) this.o).setTranslationY((-this.b) + floatValue);
                return;
            case 1:
                float f = this.b;
                f6b.d((f6b) this.c, (a66) this.o, f, valueAnimator);
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                tge tge = (tge) this.c;
                tge.q().offsetTopAndBottom(intValue - tge.k());
                ((a66) this.o).invoke(Float.valueOf(valueAnimator.getAnimatedFraction()), Float.valueOf(this.b));
                return;
        }
    }
}
