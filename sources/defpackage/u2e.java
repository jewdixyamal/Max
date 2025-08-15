package defpackage;

import java.util.List;

/* renamed from: u2e  reason: default package */
public final class u2e {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final int k;
    public final long l;
    public final String m;
    public final boolean n;
    public final int o;
    public final String p;

    public u2e(long j2, long j3, int i2, int i3, String str, long j4, String str2, String str3, String str4, List list, int i4, long j5, String str5, boolean z, int i5, String str6) {
        this.a = j2;
        this.b = j3;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = j4;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = list;
        this.k = i4;
        this.l = j5;
        this.m = str5;
        this.n = z;
        this.o = i5;
        this.p = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2e)) {
            return false;
        }
        u2e u2e = (u2e) obj;
        return this.a == u2e.a && this.b == u2e.b && this.c == u2e.c && this.d == u2e.d && tpa.f(this.e, u2e.e) && this.f == u2e.f && tpa.f(this.g, u2e.g) && tpa.f(this.h, u2e.h) && tpa.f(this.i, u2e.i) && tpa.f(this.j, u2e.j) && this.k == u2e.k && this.l == u2e.l && tpa.f(this.m, u2e.m) && this.n == u2e.n && this.o == u2e.o && tpa.f(this.p, u2e.p);
    }

    public final int hashCode() {
        int e2 = k7d.e(this.d, k7d.e(this.c, h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31), 31);
        int i2 = 0;
        String str = this.e;
        int m2 = h4f.m((e2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int m3 = h4f.m(ey8.g(this.k, k7d.g(this.j, (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31, this.l);
        String str5 = this.m;
        int g2 = ey8.g(this.o, ms2.d((m3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.n), 31);
        String str6 = this.p;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return g2 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerEntity(id=");
        sb.append(this.a);
        sb.append(", stickerId=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        sb.append(this.d);
        sb.append(", url=");
        sb.append(this.e);
        sb.append(", updateTime=");
        sb.append(this.f);
        sb.append(", mp4Url=");
        sb.append(this.g);
        sb.append(", firstUrl=");
        sb.append(this.h);
        sb.append(", previewUrl=");
        sb.append(this.i);
        sb.append(", tags=");
        sb.append(this.j);
        sb.append(", stickerType=");
        sb.append(k7d.s(this.k));
        sb.append(", setId=");
        sb.append(this.l);
        sb.append(", lottieUrl=");
        sb.append(this.m);
        sb.append(", audio=");
        sb.append(this.n);
        sb.append(", authorType=");
        sb.append(k7d.q(this.o));
        sb.append(", videoUrl=");
        return zr6.l(sb, this.p, ")");
    }
}
