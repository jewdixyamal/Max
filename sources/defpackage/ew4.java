package defpackage;

import android.content.Context;
import android.graphics.Color;

/* renamed from: ew4  reason: default package */
public final class ew4 {
    public static final int f = ((int) Math.round(5.1000000000000005d));
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public ew4(Context context) {
        boolean E = kq0.E(tsb.elevationOverlayEnabled, context, false);
        int x = mr0.x(tsb.elevationOverlayColor, 0, context);
        int x2 = mr0.x(tsb.elevationOverlayAccentColor, 0, context);
        int x3 = mr0.x(tsb.colorSurface, 0, context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = E;
        this.b = x;
        this.c = x2;
        this.d = x3;
        this.e = f2;
    }

    public final int a(int i, float f2) {
        int i2;
        if (!this.a || s63.i(i, 255) != this.d) {
            return i;
        }
        float f3 = this.e;
        float min = (f3 <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p((double) (f2 / f3))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int N = mr0.N(s63.i(i, 255), min, this.b);
        if (min > 0.0f && (i2 = this.c) != 0) {
            N = s63.g(s63.i(i2, f), N);
        }
        return s63.i(N, alpha);
    }
}
