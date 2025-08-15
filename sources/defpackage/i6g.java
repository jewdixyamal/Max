package defpackage;

import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: i6g  reason: default package */
public final class i6g extends j6g {
    public final WindowInsetsAnimation e;

    public i6g(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, (Interpolator) null, 0);
        this.e = windowInsetsAnimation;
    }

    public final long a() {
        return this.e.getDurationMillis();
    }

    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    public final int c() {
        return this.e.getTypeMask();
    }

    public final void d(float f) {
        this.e.setFraction(f);
    }
}
