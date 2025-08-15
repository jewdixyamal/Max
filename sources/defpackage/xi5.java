package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: xi5  reason: default package */
public final class xi5 {
    public final float a = (1.0f / ((float) Math.sqrt((double) 2.0f)));
    public final int b;
    public float c;
    public float d;
    public final float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public float k;
    public final AccelerateDecelerateInterpolator l;
    public final /* synthetic */ yi5 m;

    public xi5(yi5 yi5) {
        this.m = yi5;
        float f2 = (float) 2;
        this.b = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        this.e = (float) tu0.G(f2 * fk4.d().getDisplayMetrics().density);
        this.i = 1.0f;
        this.j = -1;
        this.l = new AccelerateDecelerateInterpolator();
    }

    public final String toString() {
        return naf.h("(%.1f, %.1f, %.1f)", Float.valueOf(this.f), Float.valueOf(this.g), Float.valueOf(this.h));
    }
}
