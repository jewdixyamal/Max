package defpackage;

/* renamed from: h93  reason: default package */
public final class h93 {
    public final g93 a;
    public final i93 b;

    public h93(g93 g93, i93 i93) {
        this.a = g93;
        this.b = i93;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h93)) {
            return false;
        }
        h93 h93 = (h93) obj;
        return tpa.f(this.a, h93.a) && tpa.f(this.b, h93.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonStatesBackgroundColors(active=" + this.a + ", disabled=" + this.b + ")";
    }
}
