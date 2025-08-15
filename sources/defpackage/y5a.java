package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: y5a  reason: default package */
public final class y5a {
    public static final khe g = new khe(new s4a(1));
    public final String a;
    public final CharSequence b;
    public final int c;
    public final np8 d;
    public final Drawable e;
    public final Drawable f;

    public y5a(String str, CharSequence charSequence, int i, np8 np8, Drawable drawable, Drawable drawable2) {
        this.a = str;
        this.b = charSequence;
        this.c = i;
        this.d = np8;
        this.e = drawable;
        this.f = drawable2;
    }

    public static y5a a(y5a y5a, CharSequence charSequence, int i, v5a v5a, int i2) {
        String str = y5a.a;
        if ((i2 & 2) != 0) {
            charSequence = y5a.b;
        }
        CharSequence charSequence2 = charSequence;
        np8 np8 = v5a;
        if ((i2 & 8) != 0) {
            np8 = y5a.d;
        }
        Drawable drawable = y5a.e;
        Drawable drawable2 = y5a.f;
        y5a.getClass();
        return new y5a(str, charSequence2, i, np8, drawable, drawable2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5a)) {
            return false;
        }
        y5a y5a = (y5a) obj;
        return tpa.f(this.a, y5a.a) && tpa.f(this.b, y5a.b) && this.c == y5a.c && tpa.f(this.d, y5a.d) && tpa.f(this.e, y5a.e) && tpa.f(this.f, y5a.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ey8.g(this.c, rh4.f(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        int i = 0;
        Drawable drawable = this.e;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            i = drawable2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneMeBaseTabItemModel(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", state=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "Disabled" : "Inactive" : "Active");
        sb.append(", indicator=");
        sb.append(this.d);
        sb.append(", startIcon=");
        sb.append(this.e);
        sb.append(", endIcon=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ y5a(String str, int i, int i2, String str2) {
        this(str, str2, i, x5a.p, (Drawable) null, (Drawable) null);
    }
}
