package defpackage;

import android.text.Layout;

/* renamed from: wv8  reason: default package */
public final class wv8 implements zv8 {
    public final Layout a;
    public final Layout b;
    public final long c;
    public final CharSequence d;
    public final String e;

    public wv8(Layout layout, Layout layout2, long j, CharSequence charSequence, String str) {
        this.a = layout;
        this.b = layout2;
        this.c = j;
        this.d = charSequence;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv8)) {
            return false;
        }
        wv8 wv8 = (wv8) obj;
        return tpa.f(this.a, wv8.a) && tpa.f(this.b, wv8.b) && this.c == wv8.c && tpa.f(this.d, wv8.d) && tpa.f(this.e, wv8.e);
    }

    public final int hashCode() {
        int f = rh4.f(this.d, h4f.m((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
        String str = this.e;
        return f + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact(contactTitleLayout=");
        sb.append(this.a);
        sb.append(", contactNameLayout=");
        sb.append(this.b);
        sb.append(", contactId=");
        sb.append(this.c);
        sb.append(", nameForAbbreviation=");
        sb.append(this.d);
        sb.append(", url=");
        return zr6.l(sb, this.e, ")");
    }
}
