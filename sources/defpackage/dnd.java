package defpackage;

/* renamed from: dnd  reason: default package */
public final class dnd extends ln3 {
    public final jqe a;
    public final m56 b;

    public dnd(eqe eqe, m56 m56) {
        this.a = eqe;
        this.b = m56;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnd)) {
            return false;
        }
        dnd dnd = (dnd) obj;
        return tpa.f(this.a, dnd.a) && tpa.f(this.b, dnd.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowCancellableSnackbar(title=" + this.a + ", dismissListener=" + this.b + ")";
    }
}
