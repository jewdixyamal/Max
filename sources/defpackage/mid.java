package defpackage;

import java.util.List;

/* renamed from: mid  reason: default package */
public final class mid extends ka1 {
    public final jqe b;
    public final List c;
    public final jqe d;

    public mid(jqe jqe, jqe jqe2, List list) {
        super(15);
        this.b = jqe;
        this.c = list;
        this.d = jqe2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mid)) {
            return false;
        }
        mid mid = (mid) obj;
        return tpa.f(this.b, mid.b) && tpa.f(this.c, mid.c) && tpa.f(this.d, mid.d);
    }

    public final int hashCode() {
        int g = k7d.g(this.c, this.b.hashCode() * 31, 31);
        jqe jqe = this.d;
        return g + (jqe == null ? 0 : jqe.hashCode());
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ", desc=" + this.d + ")";
    }
}
