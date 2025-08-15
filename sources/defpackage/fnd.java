package defpackage;

import java.util.List;

/* renamed from: fnd  reason: default package */
public final class fnd implements s29 {
    public final List a;
    public final jqe b;
    public final jqe c;
    public final List d;

    public fnd(List list, jqe jqe, eqe eqe, List list2) {
        this.a = list;
        this.b = jqe;
        this.c = eqe;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnd)) {
            return false;
        }
        fnd fnd = (fnd) obj;
        return tpa.f(this.a, fnd.a) && tpa.f(this.b, fnd.b) && tpa.f(this.c, fnd.c) && tpa.f(this.d, fnd.d);
    }

    public final int hashCode() {
        int f = k7d.f(this.a.hashCode() * 31, 31, this.b);
        jqe jqe = this.c;
        return this.d.hashCode() + ((f + (jqe == null ? 0 : jqe.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(messageIds=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}
