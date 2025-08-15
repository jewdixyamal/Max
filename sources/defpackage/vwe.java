package defpackage;

/* renamed from: vwe  reason: default package */
public final class vwe {
    public final jqe a;
    public final jqe b;

    public vwe(gqe gqe, eqe eqe) {
        this.a = gqe;
        this.b = eqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwe)) {
            return false;
        }
        vwe vwe = (vwe) obj;
        return tpa.f(this.a, vwe.a) && tpa.f(this.b, vwe.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TooltipState(title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
