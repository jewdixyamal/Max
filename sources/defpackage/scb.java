package defpackage;

import java.util.List;

/* renamed from: scb  reason: default package */
public final class scb extends vcb {
    public final jqe b;
    public final jqe c;
    public final List d;

    public scb(eqe eqe, eqe eqe2, List list) {
        this.b = eqe;
        this.c = eqe2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scb)) {
            return false;
        }
        scb scb = (scb) obj;
        return tpa.f(this.b, scb.b) && tpa.f(this.c, scb.c) && tpa.f(this.d, scb.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        jqe jqe = this.c;
        return this.d.hashCode() + ((hashCode + (jqe == null ? 0 : jqe.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowConfirmation(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", buttons=");
        return au1.i(sb, this.d, ")");
    }
}
