package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* renamed from: e6g  reason: default package */
public final class e6g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View X;
    public final /* synthetic */ k6g a;
    public final /* synthetic */ x6g b;
    public final /* synthetic */ x6g c;
    public final /* synthetic */ int o;

    public e6g(k6g k6g, x6g x6g, x6g x6g2, int i, View view) {
        this.a = k6g;
        this.b = x6g;
        this.c = x6g2;
        this.o = i;
        this.X = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        k6g k6g;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        k6g k6g2 = this.a;
        k6g2.a.d(animatedFraction);
        float b2 = k6g2.a.b();
        PathInterpolator pathInterpolator = g6g.e;
        int i = Build.VERSION.SDK_INT;
        x6g x6g = this.b;
        m6g n6g = i >= 30 ? new n6g(x6g) : new m6g(x6g);
        int i2 = 1;
        while (i2 <= 256) {
            if ((this.o & i2) == 0) {
                n6g.c(i2, x6g.a.f(i2));
                f = b2;
                k6g = k6g2;
            } else {
                v27 f2 = x6g.a.f(i2);
                v27 f3 = this.c.a.f(i2);
                float f4 = 1.0f - b2;
                int i3 = (int) (((double) (((float) (f2.a - f3.a)) * f4)) + 0.5d);
                int i4 = (int) (((double) (((float) (f2.b - f3.b)) * f4)) + 0.5d);
                f = b2;
                int i5 = (int) (((double) (((float) (f2.c - f3.c)) * f4)) + 0.5d);
                k6g = k6g2;
                int i6 = (int) (((double) (((float) (f2.d - f3.d)) * f4)) + 0.5d);
                int max = Math.max(0, f2.a - i3);
                int max2 = Math.max(0, f2.b - i4);
                int max3 = Math.max(0, f2.c - i5);
                int max4 = Math.max(0, f2.d - i6);
                if (!(max == i3 && max2 == i4 && max3 == i5 && max4 == i6)) {
                    f2 = v27.b(max, max2, max3, max4);
                }
                n6g.c(i2, f2);
            }
            i2 <<= 1;
            b2 = f;
            k6g2 = k6g;
        }
        g6g.g(this.X, n6g.b(), Collections.singletonList(k6g2));
    }
}
