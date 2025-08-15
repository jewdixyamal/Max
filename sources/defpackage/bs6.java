package defpackage;

/* renamed from: bs6  reason: default package */
public final class bs6 {
    public final hs6 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public bs6(hs6 hs6, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.a = hs6;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs6)) {
            return false;
        }
        bs6 bs6 = (bs6) obj;
        return tpa.f(this.a, bs6.a) && this.b == bs6.b && this.c == bs6.c && this.d == bs6.d && this.e == bs6.e && this.f == bs6.f && this.g == bs6.g && this.h == bs6.h && this.i == bs6.i && this.j == bs6.j && this.k == bs6.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + k7d.e(this.j, k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(-1, k7d.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconColors(local=");
        sb.append(this.a);
        sb.append(", contrast=");
        sb.append(this.b);
        sb.append(", contrastStatic=-1, negative=");
        sb.append(this.c);
        sb.append(", neutralThemed=");
        sb.append(this.d);
        sb.append(", positive=");
        sb.append(this.e);
        sb.append(", primary=");
        sb.append(this.f);
        sb.append(", primaryStatic=");
        sb.append(this.g);
        sb.append(", quaternary=");
        sb.append(this.h);
        sb.append(", secondary=");
        sb.append(this.i);
        sb.append(", tertiary=");
        sb.append(this.j);
        sb.append(", themed=");
        return zr6.j(sb, this.k, ")");
    }
}
