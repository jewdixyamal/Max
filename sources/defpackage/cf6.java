package defpackage;

import java.util.Arrays;

/* renamed from: cf6  reason: default package */
public final class cf6 {
    public final ze6 a;
    public final bf6 b;
    public final df6 c;
    public final ef6 d;
    public final ff6 e;
    public final nf6 f;
    public final of6 g;
    public final qf6 h;

    public cf6(ze6 ze6, bf6 bf6, df6 df6, ef6 ef6, ff6 ff6, nf6 nf6, of6 of6, qf6 qf6) {
        this.a = ze6;
        this.b = bf6;
        this.c = df6;
        this.d = ef6;
        this.e = ff6;
        this.f = nf6;
        this.g = of6;
        this.h = qf6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf6)) {
            return false;
        }
        cf6 cf6 = (cf6) obj;
        return tpa.f(this.a, cf6.a) && tpa.f(this.b, cf6.b) && tpa.f(this.c, cf6.c) && tpa.f(this.d, cf6.d) && tpa.f(this.e, cf6.e) && tpa.f(this.f, cf6.f) && tpa.f(this.g, cf6.g) && tpa.f(this.h, cf6.h);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = Arrays.hashCode(this.c.a);
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = Arrays.hashCode(this.f.a);
        int hashCode6 = this.g.hashCode();
        return this.h.hashCode() + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GradientsColors(bannerDK=" + this.a + ", buttonTextPromo=" + this.b + ", complex=" + this.c + ", emptyBlockIconWrapper=" + this.d + ", loadingIcon=" + this.e + ", local=" + this.f + ", overlay=" + this.g + ", skeletonGradient=" + this.h + ")";
    }
}
