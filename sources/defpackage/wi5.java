package defpackage;

import android.view.animation.AccelerateInterpolator;

/* renamed from: wi5  reason: default package */
public final class wi5 {
    public long a;
    public long b;
    public long c;
    public long d;
    public final float e = ((float) tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density));
    public long f = dy7.l(-1, -1);
    public final AccelerateInterpolator g = new AccelerateInterpolator();
    public float h = 1.0f;
    public float i;
    public float j;
    public final /* synthetic */ yi5 k;

    public wi5(yi5 yi5) {
        this.k = yi5;
        float f2 = (float) 0;
        this.a = mr0.k((float) tu0.G(fk4.d().getDisplayMetrics().density * f2), (float) tu0.G(fk4.d().getDisplayMetrics().density * f2));
        this.b = mr0.k((float) tu0.G(fk4.d().getDisplayMetrics().density * f2), (float) tu0.G(fk4.d().getDisplayMetrics().density * f2));
        float f3 = (float) 8;
        this.c = mr0.k((float) tu0.G(fk4.d().getDisplayMetrics().density * f3), (float) tu0.G(fk4.d().getDisplayMetrics().density * f2));
        this.d = mr0.k((float) tu0.G(f3 * fk4.d().getDisplayMetrics().density), (float) tu0.G(f2 * fk4.d().getDisplayMetrics().density));
    }

    public final String toString() {
        return naf.h("(%.1f, %.1f, %.1f)", Float.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.h));
    }
}
