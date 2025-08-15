package defpackage;

import java.util.List;

/* renamed from: ng2  reason: default package */
public final class ng2 extends pg2 {
    public final xm8 b;
    public final jqe c;
    public final jqe d;
    public final List e;

    public ng2(xm8 xm8, jqe jqe, jqe jqe2, List list) {
        this.b = xm8;
        this.c = jqe;
        this.d = jqe2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng2)) {
            return false;
        }
        ng2 ng2 = (ng2) obj;
        return tpa.f(this.b, ng2.b) && tpa.f(this.c, ng2.c) && tpa.f(this.d, ng2.d) && tpa.f(this.e, ng2.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k7d.f(k7d.f(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "ShowConfirmationBottomSheet(model=" + this.b + ", title=" + this.c + ", description=" + this.d + ", actions=" + this.e + ")";
    }
}
