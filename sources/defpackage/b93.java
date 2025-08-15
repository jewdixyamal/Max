package defpackage;

/* renamed from: b93  reason: default package */
public final class b93 {
    public final c93 a;
    public final d93 b;
    public final e93 c;

    public b93(c93 c93, d93 d93, e93 e93) {
        this.a = c93;
        this.b = d93;
        this.c = e93;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b93)) {
            return false;
        }
        b93 b93 = (b93) obj;
        return tpa.f(this.a, b93.a) && tpa.f(this.b, b93.b) && tpa.f(this.c, b93.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + k7d.e(this.b.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CommonShadowsColors(elevation2=" + this.a + ", topBar=" + this.b + ", writeBar=" + this.c + ")";
    }
}
