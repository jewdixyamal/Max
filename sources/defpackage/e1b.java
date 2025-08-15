package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PointF;

/* renamed from: e1b  reason: default package */
public final /* synthetic */ class e1b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PointF a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ f1b o;

    public /* synthetic */ e1b(PointF pointF, float f, float f2, f1b f1b) {
        this.a = pointF;
        this.b = f;
        this.c = f2;
        this.o = f1b;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        PointF pointF = this.a;
        float f = pointF.x;
        float f2 = z7b.f(this.b, f, floatValue, f);
        float f3 = pointF.y;
        float f4 = z7b.f(this.c, f3, floatValue, f3);
        f1b f1b = this.o;
        f1b.b.T(f2, f4);
        PointF pointF2 = ((ba1) f1b.c).b;
        pointF2.x = f2;
        pointF2.y = f4;
    }
}
