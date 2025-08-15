package defpackage;

/* renamed from: hcc  reason: default package */
public final class hcc {
    public final long a;
    public final jqe b;
    public final b7a c;

    public hcc(long j, eqe eqe, b7a b7a) {
        this.a = j;
        this.b = eqe;
        this.c = b7a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcc)) {
            return false;
        }
        hcc hcc = (hcc) obj;
        return this.a == hcc.a && tpa.f(this.b, hcc.b) && this.c == hcc.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k7d.f(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ButtonState(id=" + this.a + ", textSource=" + this.b + ", mode=" + this.c + ")";
    }
}
