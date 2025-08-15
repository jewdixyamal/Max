package defpackage;

import java.util.List;

/* renamed from: mhb  reason: default package */
public final class mhb extends phb {
    public final jqe a;
    public final jqe b;
    public final List c;

    public mhb(eqe eqe, eqe eqe2, List list) {
        this.a = eqe;
        this.b = eqe2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhb)) {
            return false;
        }
        mhb mhb = (mhb) obj;
        return tpa.f(this.a, mhb.a) && tpa.f(this.b, mhb.b) && tpa.f(this.c, mhb.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jqe jqe = this.b;
        return this.c.hashCode() + ((hashCode + (jqe == null ? 0 : jqe.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowBottomSheet(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return au1.i(sb, this.c, ")");
    }
}
