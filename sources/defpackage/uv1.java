package defpackage;

import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;

/* renamed from: uv1  reason: default package */
public final /* synthetic */ class uv1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float X;
    public final /* synthetic */ float Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ wv1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float o;

    public /* synthetic */ uv1(wv1 wv1, int i, int i2, float f, float f2, float f3, float f4) {
        this.a = wv1;
        this.b = i;
        this.c = i2;
        this.o = f;
        this.X = f2;
        this.Y = f3;
        this.Z = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        wv1 wv1 = this.a;
        wv1.t0.setColor(((Integer) wv1.b.evaluate(animatedFraction, Integer.valueOf(this.b), Integer.valueOf(this.c))).intValue());
        FloatEvaluator floatEvaluator = wv1.c;
        wv1.u0 = floatEvaluator.evaluate(animatedFraction, Float.valueOf(this.o), Float.valueOf(this.X)).floatValue();
        wv1.v0 = floatEvaluator.evaluate(animatedFraction, Float.valueOf(this.Y), Float.valueOf(this.Z)).floatValue();
        wv1.invalidate();
    }
}
