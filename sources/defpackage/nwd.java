package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: nwd  reason: default package */
public final class nwd extends Drawable.ConstantState {
    public final nx4 a;
    public int b;
    public final int c = 0;
    public final int d = 0;
    public final nw4 e;

    public nwd(nx4 nx4, int i, nw4 nw4) {
        this.a = nx4;
        this.b = i;
        this.e = nw4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwd)) {
            return false;
        }
        nwd nwd = (nwd) obj;
        return tpa.f(this.a, nwd.a) && this.b == nwd.b && this.c == nwd.c && this.d == nwd.d && tpa.f(this.e, nwd.e);
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final int hashCode() {
        return this.e.hashCode() + k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final Drawable newDrawable() {
        return new mwd(this);
    }

    public final String toString() {
        int i = this.b;
        return "SpriteEmojiDrawableState(location=" + this.a + ", size=" + i + ", paddingHorizontal=" + this.c + ", paddingVertical=" + this.d + ", bitmapResolver=" + this.e + ")";
    }
}
