package defpackage;

import android.net.Uri;

/* renamed from: de9  reason: default package */
public final class de9 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;

    public de9(int i, String str, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = Uri.parse(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de9)) {
            return false;
        }
        de9 de9 = (de9) obj;
        return tpa.f(this.a, de9.a) && this.b == de9.b && this.c == de9.c && this.d == de9.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + k7d.e(this.c, k7d.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(url=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", bitrate=");
        return zr6.j(sb, this.d, ")");
    }
}
