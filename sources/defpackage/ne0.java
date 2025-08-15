package defpackage;

/* renamed from: ne0  reason: default package */
public final class ne0 {
    public final me0 a;
    public final ve0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    public ne0(me0 me0, ve0 ve0, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.a = me0;
        this.b = ve0;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = i11;
        this.m = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne0)) {
            return false;
        }
        ne0 ne0 = (ne0) obj;
        return tpa.f(this.a, ne0.a) && tpa.f(this.b, ne0.b) && this.c == ne0.c && this.d == ne0.d && this.e == ne0.e && this.f == ne0.f && this.g == ne0.g && this.h == ne0.h && this.i == ne0.i && this.j == ne0.j && this.k == ne0.k && this.l == ne0.l && this.m == ne0.m;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + k7d.e(this.m, k7d.e(this.l, k7d.e(this.k, k7d.e(this.j, k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(-1728053248, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(-1, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundColors(accent=");
        sb.append(this.a);
        sb.append(", local=");
        sb.append(this.b);
        sb.append(", contrastFloating=-1, contrastFloatingSecondary=");
        sb.append(this.c);
        sb.append(", neutralFloating=");
        sb.append(this.d);
        sb.append(", overlay=");
        sb.append(this.e);
        sb.append(", overlaySecondary=-1728053248, overlayStatic=");
        sb.append(this.f);
        sb.append(", surfaceCard=");
        sb.append(this.g);
        sb.append(", surfaceCardSecondary=");
        sb.append(this.h);
        sb.append(", surfaceFloating=");
        sb.append(this.i);
        sb.append(", surfaceGround=");
        sb.append(this.j);
        sb.append(", surfacePrimary=");
        sb.append(this.k);
        sb.append(", surfaceSecondary=");
        sb.append(this.l);
        sb.append(", surfaceTertiary=");
        return zr6.j(sb, this.m, ", transparent=0)");
    }
}
