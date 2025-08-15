package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: nrb  reason: default package */
public final /* synthetic */ class nrb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float o;

    public /* synthetic */ nrb(View view, float f, float f2, float f3, float f4, int i) {
        this.a = i;
        this.Y = view;
        this.b = f;
        this.c = f2;
        this.o = f3;
        this.X = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                rrb.b((rrb) this.Y, this.b, this.c, this.o, this.X, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f = this.c;
                float f2 = this.b;
                float f3 = z7b.f(f, f2, animatedFraction, f2);
                ohf ohf = (ohf) this.Y;
                ohf.G0 = f3;
                float f4 = this.X;
                float f5 = this.o;
                float f6 = z7b.f(f4, f5, animatedFraction, f5);
                ohf.F0 = f6;
                ohf.v0.setStrokeWidth(f6);
                ohf.o.setStrokeWidth(ohf.F0);
                ohf.invalidate();
                return;
        }
    }
}
