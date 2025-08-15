package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* renamed from: hn5  reason: default package */
public final /* synthetic */ class hn5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int X;
    public final /* synthetic */ jn5 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ hn5(jn5 jn5, int i, int i2, int i3, int i4) {
        this.a = jn5;
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.X = i4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        jn5 jn5 = this.a;
        jn5.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = jn5.a;
        int i2 = i + ((int) (((float) (this.b - i)) * floatValue));
        int i3 = jn5.b;
        int i4 = i3 + ((int) (((float) (this.c - i3)) * floatValue));
        float f = jn5.c;
        float f2 = jn5.o;
        jn5.t0.setLayoutParams(new FrameLayout.LayoutParams(i2, i4));
        jn5.t0.setTranslationX((float) ((int) z7b.f((float) this.o, f, floatValue, f)));
        jn5.t0.setTranslationY((float) ((int) z7b.f((float) this.X, f2, floatValue, f2)));
        jn5.invalidate();
    }
}
