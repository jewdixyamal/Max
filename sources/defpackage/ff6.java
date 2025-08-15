package defpackage;

/* renamed from: ff6  reason: default package */
public final class ff6 {
    public final gf6 a;
    public final hf6 b;
    public final if6 c;
    public final jf6 d;
    public final kf6 e;
    public final lf6 f;
    public final mf6 g;

    public ff6(gf6 gf6, hf6 hf6, if6 if6, jf6 jf6, kf6 kf6, lf6 lf6, mf6 mf6) {
        this.a = gf6;
        this.b = hf6;
        this.c = if6;
        this.d = jf6;
        this.e = kf6;
        this.f = lf6;
        this.g = mf6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff6)) {
            return false;
        }
        ff6 ff6 = (ff6) obj;
        return tpa.f(this.a, ff6.a) && tpa.f(this.b, ff6.b) && tpa.f(this.c, ff6.c) && tpa.f(this.d, ff6.d) && tpa.f(this.e, ff6.e) && tpa.f(this.f, ff6.f) && tpa.f(this.g, ff6.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        return this.g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GradientsLoadingIconColors(contrast=" + this.a + ", contrastStatic=" + this.b + ", negative=" + this.c + ", neutralThemed=" + this.d + ", primary=" + this.e + ", primaryStatic=" + this.f + ", themed=" + this.g + ")";
    }
}
