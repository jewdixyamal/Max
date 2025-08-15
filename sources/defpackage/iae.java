package defpackage;

/* renamed from: iae  reason: default package */
public final class iae {
    public final hae a;
    public final jae b;
    public final kae c;

    public iae(hae hae, jae jae, kae kae) {
        this.a = hae;
        this.b = jae;
        this.c = kae;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iae)) {
            return false;
        }
        iae iae = (iae) obj;
        return tpa.f(this.a, iae.a) && tpa.f(this.b, iae.b) && tpa.f(this.c, iae.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + k7d.e(this.b.a, Integer.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        return "StrokeLocalColors(carver=" + this.a + ", tabBar=" + this.b + ", topBar=" + this.c + ")";
    }
}
