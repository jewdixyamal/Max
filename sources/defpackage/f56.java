package defpackage;

/* renamed from: f56  reason: default package */
public final class f56 {
    public final e56 a;
    public final e56 b;

    public f56(e56 e56, e56 e562) {
        this.a = e56;
        this.b = e562;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f56)) {
            return false;
        }
        f56 f56 = (f56) obj;
        return tpa.f(this.a, f56.a) && tpa.f(this.b, f56.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Results(fts=" + this.a + ", like=" + this.b + ")";
    }
}
