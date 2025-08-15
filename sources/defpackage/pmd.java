package defpackage;

/* renamed from: pmd  reason: default package */
public final class pmd extends i24 {
    public final jqe g;
    public final jqe h;
    public final Integer i;

    public pmd(iqe iqe, eqe eqe, Integer num) {
        this.g = iqe;
        this.h = eqe;
        this.i = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmd)) {
            return false;
        }
        pmd pmd = (pmd) obj;
        return tpa.f(this.g, pmd.g) && tpa.f(this.h, pmd.h) && tpa.f(this.i, pmd.i);
    }

    public final int hashCode() {
        int d = ms2.d(this.g.hashCode() * 31, 31, true);
        int i2 = 0;
        jqe jqe = this.h;
        int hashCode = (d + (jqe == null ? 0 : jqe.hashCode())) * 31;
        Integer num = this.i;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode + i2;
    }

    public final jqe m() {
        return this.h;
    }

    public final Integer n() {
        return this.i;
    }

    public final String toString() {
        return "Text(text=" + this.g + ", shouldShowMore=true, hint=" + this.h + ", hintColor=" + this.i + ")";
    }
}
