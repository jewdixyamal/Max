package defpackage;

/* renamed from: icc  reason: default package */
public final class icc {
    public final jqe a;
    public final jqe b;
    public final hcc c;
    public final hcc d;
    public final jqe e;
    public final boolean f;

    public icc(eqe eqe, eqe eqe2, hcc hcc, hcc hcc2, jqe jqe, boolean z) {
        this.a = eqe;
        this.b = eqe2;
        this.c = hcc;
        this.d = hcc2;
        this.e = jqe;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icc)) {
            return false;
        }
        icc icc = (icc) obj;
        return tpa.f(this.a, icc.a) && tpa.f(this.b, icc.b) && tpa.f(this.c, icc.c) && tpa.f(this.d, icc.d) && tpa.f(this.e, icc.e) && this.f == icc.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jqe jqe = this.b;
        int hashCode2 = jqe == null ? 0 : jqe.hashCode();
        return Boolean.hashCode(this.f) + k7d.f((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + hashCode2) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExitWithRecordState(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", negativeButton=");
        sb.append(this.c);
        sb.append(", positiveButton=");
        sb.append(this.d);
        sb.append(", recordTitle=");
        sb.append(this.e);
        sb.append(", canRemove=");
        return au1.j(sb, this.f, ")");
    }
}
