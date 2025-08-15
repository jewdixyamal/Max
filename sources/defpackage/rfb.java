package defpackage;

import java.util.List;

/* renamed from: rfb  reason: default package */
public final class rfb extends ka1 {
    public final jqe b;
    public final jqe c;
    public final List d;

    public rfb(jqe jqe, jqe jqe2, List list) {
        super(9);
        this.b = jqe;
        this.c = jqe2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfb)) {
            return false;
        }
        rfb rfb = (rfb) obj;
        return tpa.f(this.b, rfb.b) && tpa.f(this.c, rfb.c) && tpa.f(this.d, rfb.d);
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
