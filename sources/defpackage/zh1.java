package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* renamed from: zh1  reason: default package */
public final /* synthetic */ class zh1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PointF X;
    public final /* synthetic */ zj1 Y;
    public final /* synthetic */ ObjectAnimator a;
    public final /* synthetic */ bi1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ View o;

    public /* synthetic */ zh1(ObjectAnimator objectAnimator, bi1 bi1, boolean z, View view, PointF pointF, zj1 zj1) {
        this.a = objectAnimator;
        this.b = bi1;
        this.c = z;
        this.o = view;
        this.X = pointF;
        this.Y = zj1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        bi1 bi1 = this.b;
        long j = bi1.o;
        ObjectAnimator objectAnimator = this.a;
        objectAnimator.setDuration(j);
        boolean z = this.c;
        float animatedFraction = z ? objectAnimator.getAnimatedFraction() : ((float) 1) - objectAnimator.getAnimatedFraction();
        View view = this.o;
        int width = view.getWidth();
        int height = view.getHeight();
        PointF pointF = this.X;
        float f = pointF.x;
        float f2 = ((float) 1) - animatedFraction;
        float f3 = pointF.y * f2;
        float min = Math.min(f, f * f2);
        float min2 = Math.min(pointF.y, f3);
        float f4 = ((float) width) * animatedFraction;
        float f5 = ((float) height) * animatedFraction;
        float f6 = pointF.x;
        je7 je7 = bi1.v0;
        ((ba1) ((aa1) je7.getValue())).getClass();
        float max = Math.max(f6 + ((float) tu0.G(((float) 118) * fk4.d().getDisplayMetrics().density)), f4);
        float f7 = pointF.y;
        ((ba1) ((aa1) je7.getValue())).getClass();
        RectF rectF = new RectF(min, min2, max, Math.max(f7 + ((float) tu0.G(((float) 174) * fk4.d().getDisplayMetrics().density)), f5));
        zj1 zj1 = this.Y;
        if (zj1 != null) {
            zj1.d(rectF, z);
        }
        Rect rect = new Rect();
        rectF.roundOut(rect);
        dy7.h(view, rect, fk4.d().getDisplayMetrics().density * 20.0f);
    }
}
