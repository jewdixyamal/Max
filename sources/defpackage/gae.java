package defpackage;

/* renamed from: gae  reason: default package */
public final class gae {
    public final iae a;
    public final lae b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public gae(iae iae, lae lae, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = iae;
        this.b = lae;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gae)) {
            return false;
        }
        gae gae = (gae) obj;
        return tpa.f(this.a, gae.a) && tpa.f(this.b, gae.b) && this.c == gae.c && this.d == gae.d && this.e == gae.e && this.f == gae.f && this.g == gae.g && this.h == gae.h && this.i == gae.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(1308622847, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StrokeColors(local=");
        sb.append(this.a);
        sb.append(", separator=");
        sb.append(this.b);
        sb.append(", contrastSecondaryStatic=1308622847, contrastStatic=");
        sb.append(this.c);
        sb.append(", negative=");
        sb.append(this.d);
        sb.append(", positive=");
        sb.append(this.e);
        sb.append(", secondary=");
        sb.append(this.f);
        sb.append(", tertiary=");
        sb.append(this.g);
        sb.append(", themed=");
        sb.append(this.h);
        sb.append(", transparent=");
        return zr6.j(sb, this.i, ")");
    }
}
