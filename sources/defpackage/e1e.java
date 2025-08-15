package defpackage;

/* renamed from: e1e  reason: default package */
public final class e1e {
    public final d1e a;
    public final f1e b;

    public e1e(d1e d1e, f1e f1e) {
        this.a = d1e;
        this.b = f1e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1e)) {
            return false;
        }
        e1e e1e = (e1e) obj;
        return tpa.f(this.a, e1e.a) && tpa.f(this.b, e1e.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StatesTextColors(active=" + this.a + ", disabled=" + this.b + ")";
    }
}
