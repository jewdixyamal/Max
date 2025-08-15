package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: s6g  reason: default package */
public class s6g extends r6g {
    public v27 n = null;
    public v27 o = null;
    public v27 p = null;

    public s6g(x6g x6g, WindowInsets windowInsets) {
        super(x6g, windowInsets);
    }

    public v27 g() {
        if (this.o == null) {
            this.o = v27.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.o;
    }

    public v27 i() {
        if (this.n == null) {
            this.n = v27.c(this.c.getSystemGestureInsets());
        }
        return this.n;
    }

    public v27 k() {
        if (this.p == null) {
            this.p = v27.c(this.c.getTappableElementInsets());
        }
        return this.p;
    }

    public x6g l(int i, int i2, int i3, int i4) {
        return x6g.f((View) null, this.c.inset(i, i2, i3, i4));
    }
}
