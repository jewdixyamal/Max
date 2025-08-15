package defpackage;

/* renamed from: l4c  reason: default package */
public final class l4c {
    public static final l4c c = new l4c(jqe.a, (gqe) null);
    public final jqe a;
    public final jqe b;

    public l4c(jqe jqe, gqe gqe) {
        this.a = jqe;
        this.b = gqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4c)) {
            return false;
        }
        l4c l4c = (l4c) obj;
        return tpa.f(this.a, l4c.a) && tpa.f(this.b, l4c.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jqe jqe = this.b;
        return hashCode + (jqe == null ? 0 : jqe.hashCode());
    }

    public final String toString() {
        return "RaiseHandState(title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
