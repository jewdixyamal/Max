package defpackage;

/* renamed from: y0e  reason: default package */
public final class y0e {
    public final x0e a;
    public final z0e b;

    public y0e(x0e x0e, z0e z0e) {
        this.a = x0e;
        this.b = z0e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0e)) {
            return false;
        }
        y0e y0e = (y0e) obj;
        return tpa.f(this.a, y0e.a) && tpa.f(this.b, y0e.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StatesBackgroundColors(active=" + this.a + ", disabled=" + this.b + ")";
    }
}
