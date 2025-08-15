package defpackage;

/* renamed from: f8g  reason: default package */
public final class f8g {
    public String a;
    public m7g b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8g)) {
            return false;
        }
        f8g f8g = (f8g) obj;
        return tpa.f(this.a, f8g.a) && this.b == f8g.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
