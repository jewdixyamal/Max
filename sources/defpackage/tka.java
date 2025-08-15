package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: tka  reason: default package */
public final class tka {
    public final String a;
    public final CharSequence b;
    public final long c;
    public final Drawable d;
    public final od0 e;

    public tka(String str, CharSequence charSequence, long j, od0 od0, int i) {
        od0 = (i & 16) != 0 ? null : od0;
        this.a = str;
        this.b = charSequence;
        this.c = j;
        this.d = null;
        this.e = od0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tka)) {
            return false;
        }
        tka tka = (tka) obj;
        return tpa.f(this.a, tka.a) && tpa.f(this.b, tka.b) && this.c == tka.c && tpa.f(this.d, tka.d) && tpa.f(this.e, tka.e);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int m = h4f.m(rh4.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c);
        Drawable drawable = this.d;
        int hashCode = (m + (drawable == null ? 0 : drawable.hashCode())) * 31;
        od0 od0 = this.e;
        if (od0 != null) {
            i = od0.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AvatarParams(url=" + this.a + ", abbreviationName=" + this.b + ", id=" + this.c + ", placeholder=" + this.d + ", overlay=" + this.e + ")";
    }
}
