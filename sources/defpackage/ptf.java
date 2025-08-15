package defpackage;

import java.util.List;

/* renamed from: ptf  reason: default package */
public final class ptf implements rtf {
    public final jqe a;
    public final jqe b;
    public final List c;

    public ptf(int i, eqe eqe, jqe jqe, List list) {
        this.a = eqe;
        this.b = jqe;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptf)) {
            return false;
        }
        ptf ptf = (ptf) obj;
        ptf.getClass();
        int i = woc.a;
        return tpa.f(this.a, ptf.a) && tpa.f(this.b, ptf.b) && tpa.f(this.c, ptf.c);
    }

    public final int hashCode() {
        int f = k7d.f(Integer.hashCode(woc.A) * 31, 31, this.a);
        jqe jqe = this.b;
        return this.c.hashCode() + ((f + (jqe == null ? 0 : jqe.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestBiometryAccess(icon=");
        sb.append(woc.A);
        sb.append(", title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return au1.i(sb, this.c, ")");
    }
}
