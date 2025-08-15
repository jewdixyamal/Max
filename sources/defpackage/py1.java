package defpackage;

import android.graphics.Typeface;

/* renamed from: py1  reason: default package */
public final class py1 extends ote {
    public final oy1 X;
    public boolean Y;
    public final Typeface o;

    public py1(oy1 oy1, Typeface typeface) {
        super(18);
        this.o = typeface;
        this.X = oy1;
    }

    public final void J(int i) {
        if (!this.Y) {
            this.X.q(this.o);
        }
    }

    public final void K(Typeface typeface, boolean z) {
        if (!this.Y) {
            this.X.q(typeface);
        }
    }
}
