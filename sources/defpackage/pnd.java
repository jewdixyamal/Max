package defpackage;

/* renamed from: pnd  reason: default package */
public final class pnd implements s29 {
    public final jqe a;
    public final int b;
    public final jqe c;

    public pnd(jqe jqe, int i, eqe eqe, int i2) {
        i = (i2 & 2) != 0 ? woc.I : i;
        eqe = (i2 & 4) != 0 ? null : eqe;
        this.a = jqe;
        this.b = i;
        this.c = eqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnd)) {
            return false;
        }
        pnd pnd = (pnd) obj;
        return tpa.f(this.a, pnd.a) && this.b == pnd.b && tpa.f(this.c, pnd.c);
    }

    public final int hashCode() {
        int e = k7d.e(this.b, this.a.hashCode() * 31, 31);
        jqe jqe = this.c;
        return e + (jqe == null ? 0 : jqe.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.a + ", icon=" + this.b + ", description=" + this.c + ")";
    }
}
