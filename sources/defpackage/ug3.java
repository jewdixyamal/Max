package defpackage;

/* renamed from: ug3  reason: default package */
public final class ug3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;
    public final int h;

    public ug3(long j, long j2, long j3, long j4, long j5, String str, int i, int i2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = str;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug3)) {
            return false;
        }
        ug3 ug3 = (ug3) obj;
        return this.a == ug3.a && this.b == ug3.b && this.c == ug3.c && this.d == ug3.d && this.e == ug3.e && tpa.f(this.f, ug3.f) && this.g == ug3.g && this.h == ug3.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + k7d.e(this.g, rh4.d(h4f.m(h4f.m(h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionStat(n=");
        sb.append(this.h);
        sb.append("|");
        sb.append(this.f);
        sb.append(":");
        sb.append(this.g);
        sb.append("|total=");
        sb.append(this.b);
        sb.append("|dns=");
        sb.append(this.c);
        sb.append("|tcp=");
        sb.append(this.d);
        sb.append("|tls=");
        return zr6.k(sb, this.e, ")");
    }
}
