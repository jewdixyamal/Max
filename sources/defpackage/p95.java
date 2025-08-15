package defpackage;

/* renamed from: p95  reason: default package */
public final class p95 extends wm9 {
    public final jqe b;

    public p95(eqe eqe) {
        super(e5f.a);
        this.b = eqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p95) && tpa.f(this.b, ((p95) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowSnackbar(text="), this.b, ")");
    }
}
