package defpackage;

/* renamed from: nmd  reason: default package */
public final class nmd extends i24 {
    public final jqe g;
    public final jqe h;
    public final Integer i;

    public nmd(eqe eqe, eqe eqe2, Integer num) {
        this.g = eqe;
        this.h = eqe2;
        this.i = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmd)) {
            return false;
        }
        nmd nmd = (nmd) obj;
        return tpa.f(this.g, nmd.g) && tpa.f(this.h, nmd.h) && tpa.f(this.i, nmd.i);
    }

    public final int hashCode() {
        int hashCode = this.g.hashCode() * 31;
        int i2 = 0;
        jqe jqe = this.h;
        int hashCode2 = (hashCode + (jqe == null ? 0 : jqe.hashCode())) * 31;
        Integer num = this.i;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode2 + i2;
    }

    public final jqe m() {
        return this.h;
    }

    public final Integer n() {
        return this.i;
    }

    public final String toString() {
        return "Button(text=" + this.g + ", hint=" + this.h + ", hintColor=" + this.i + ")";
    }
}
