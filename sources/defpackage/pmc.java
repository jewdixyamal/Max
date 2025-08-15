package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import one.me.android.root.RootController;

/* renamed from: pmc  reason: default package */
public final /* synthetic */ class pmc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;

    public /* synthetic */ pmc(float f, w12 w12) {
        this.a = 0;
        this.c = f;
        this.b = w12;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f = this.c;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = RootController.u0;
                Object animatedValue = valueAnimator.getAnimatedValue("topMarginProp");
                Float f2 = animatedValue instanceof Float ? (Float) animatedValue : null;
                if (f2 != null) {
                    f = f2.floatValue();
                }
                View view = (View) obj;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.topMargin = (int) f;
                view.setLayoutParams(marginLayoutParams);
                return;
            case 1:
                View view2 = (View) obj;
                view2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (f == 0.0f) {
                    f = 0.0f;
                }
                if (valueAnimator.getAnimatedFraction() >= f) {
                    view2.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            default:
                oz3 oz3 = (oz3) obj;
                float abs = Math.abs((oz3.p - f) - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                oz3.p += abs;
                Matrix matrix = oz3.k;
                RectF rectF = oz3.g;
                matrix.postRotate(abs, rectF.centerX(), rectF.centerY());
                oz3.j.set(matrix);
                iag iag = oz3.b;
                if (iag != null) {
                    iag.f(matrix);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ pmc(Object obj, float f, int i) {
        this.a = i;
        this.b = obj;
        this.c = f;
    }
}
