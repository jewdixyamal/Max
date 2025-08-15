package defpackage;

/* renamed from: cxd  reason: default package */
public final class cxd {
    public final String a = "<unknown>";
    public final String b = "DEF_SSL";
    public final long c;
    public final long d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final int k;
    public final long l;

    public cxd(long j2, long j3, int i2, long j4, long j5, int i3, long j6, long j7, int i4) {
        long j8 = j4;
        long j9 = j6;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = j8;
        this.g = j5;
        this.h = i3;
        this.i = j9;
        this.j = j7;
        this.k = i4;
        this.l = j8 + j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxd)) {
            return false;
        }
        cxd cxd = (cxd) obj;
        return tpa.f(this.a, cxd.a) && tpa.f(this.b, cxd.b) && this.c == cxd.c && this.d == cxd.d && this.e == cxd.e && this.f == cxd.f && this.g == cxd.g && this.h == cxd.h && this.i == cxd.i && this.j == cxd.j && this.k == cxd.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + h4f.m(h4f.m(k7d.e(this.h, h4f.m(h4f.m(k7d.e(this.e, h4f.m(h4f.m(k7d.e(0, h4f.m(h4f.m(k7d.e(0, h4f.m(h4f.m(rh4.d(this.a.hashCode() * 31, 31, this.b), 31, 0), 31, 0), 31), 31, 0), 31, 0), 31), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SslProviderStat(");
        sb.append(this.b);
        sb.append("|v=");
        sb.append(this.a);
        sb.append("|init=0/0_0|scc=0/0_0|sfc=");
        sb.append(this.c);
        sb.append("/");
        sb.append(this.d);
        sb.append("_");
        sb.append(this.e);
        sb.append("|sh=");
        sb.append(this.i);
        sb.append("/");
        sb.append(this.j);
        sb.append("_");
        sb.append(this.k);
        sb.append("|sv=");
        sb.append(this.f);
        sb.append("/");
        sb.append(this.g);
        sb.append("_");
        return zr6.j(sb, this.h, ")");
    }
}
