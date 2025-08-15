package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: q6g  reason: default package */
public abstract class q6g extends p6g {
    public v27 m = null;

    public q6g(x6g x6g, WindowInsets windowInsets) {
        super(x6g, windowInsets);
    }

    public x6g b() {
        return x6g.f((View) null, this.c.consumeStableInsets());
    }

    public x6g c() {
        return x6g.f((View) null, this.c.consumeSystemWindowInsets());
    }

    public final v27 h() {
        if (this.m == null) {
            WindowInsets windowInsets = this.c;
            this.m = v27.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    public boolean m() {
        return this.c.isConsumed();
    }
}
