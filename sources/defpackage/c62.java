package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: c62  reason: default package */
public final class c62 implements ol7 {
    public final Boolean a;
    public final ze0 b;
    public final Drawable c;
    public final Drawable o;

    public c62(Boolean bool, ze0 ze0, Drawable drawable, Drawable drawable2) {
        this.a = bool;
        this.b = ze0;
        this.c = drawable;
        this.o = drawable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c62)) {
            return false;
        }
        c62 c62 = (c62) obj;
        return tpa.f(this.a, c62.a) && tpa.f(this.b, c62.b) && tpa.f(this.c, c62.c) && tpa.f(this.o, c62.o);
    }

    public final long getItemId() {
        return (long) this.b.a.hashCode();
    }

    public final boolean h(ol7 ol7) {
        return getItemId() == ol7.getItemId();
    }

    public final int hashCode() {
        int i = 0;
        Boolean bool = this.a;
        int d = rh4.d((bool == null ? 0 : bool.hashCode()) * 31, 31, this.b.a);
        Drawable drawable = this.c;
        int hashCode = (d + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            i = drawable2.hashCode();
        }
        return hashCode + i;
    }

    public final int l() {
        return 0;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        c62 c62 = ol7 instanceof c62 ? (c62) ol7 : null;
        if (c62 == null) {
            return null;
        }
        Boolean bool = this.a;
        Boolean bool2 = c62.a;
        if (!tpa.f(bool, bool2)) {
            return new b62(bool2);
        }
        return null;
    }

    public final String toString() {
        return "ChatBackground(isSelected=" + this.a + ", backgroundId=" + this.b + ", drawable=" + this.c + ", previewDrawable=" + this.o + ")";
    }
}
