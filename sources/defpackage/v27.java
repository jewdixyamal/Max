package defpackage;

import android.graphics.Insets;

/* renamed from: v27  reason: default package */
public final class v27 {
    public static final v27 e = new v27(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public v27(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static v27 a(v27 v27, v27 v272) {
        return b(Math.max(v27.a, v272.a), Math.max(v27.b, v272.b), Math.max(v27.c, v272.c), Math.max(v27.d, v272.d));
    }

    public static v27 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new v27(i, i2, i3, i4);
    }

    public static v27 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return u27.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v27.class != obj.getClass()) {
            return false;
        }
        v27 v27 = (v27) obj;
        return this.d == v27.d && this.a == v27.a && this.c == v27.c && this.b == v27.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return au1.h(sb, this.d, '}');
    }
}
