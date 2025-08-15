package defpackage;

/* renamed from: hs6  reason: default package */
public final class hs6 {
    public final gs6 a;
    public final is6 b;
    public final js6 c;
    public final int d;
    public final int e;

    public hs6(gs6 gs6, is6 is6, js6 js6, int i, int i2) {
        this.a = gs6;
        this.b = is6;
        this.c = js6;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs6)) {
            return false;
        }
        hs6 hs6 = (hs6) obj;
        return tpa.f(this.a, hs6.a) && tpa.f(this.b, hs6.b) && tpa.f(this.c, hs6.c) && this.d == hs6.d && this.e == hs6.e;
    }

    public final int hashCode() {
        int e2 = k7d.e(this.b.a, this.a.hashCode() * 31, 31);
        return Integer.hashCode(this.e) + k7d.e(this.d, (this.c.hashCode() + e2) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconLocalColors(category=");
        sb.append(this.a);
        sb.append(", promo=");
        sb.append(this.b);
        sb.append(", tabbar=");
        sb.append(this.c);
        sb.append(", verificationSecondary=");
        sb.append(this.d);
        sb.append(", verificationSubhead=");
        return zr6.j(sb, this.e, ")");
    }
}
