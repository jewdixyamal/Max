package defpackage;

/* renamed from: cnd  reason: default package */
public final class cnd extends tt2 {
    public final jqe a;
    public final m56 b;

    public cnd(eqe eqe, m56 m56) {
        this.a = eqe;
        this.b = m56;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnd)) {
            return false;
        }
        cnd cnd = (cnd) obj;
        return tpa.f(this.a, cnd.a) && tpa.f(this.b, cnd.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowCancelableSnackbar(text=" + this.a + ", cancelAction=" + this.b + ")";
    }
}
