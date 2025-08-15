package defpackage;

/* renamed from: omd  reason: default package */
public final class omd extends i24 {
    public final String g;
    public final String h;
    public final jqe i;
    public final boolean j;
    public final boolean k;
    public final jqe l;
    public final Integer m;

    public omd(String str, String str2, eqe eqe, boolean z, boolean z2, jqe jqe, Integer num) {
        this.g = str;
        this.h = str2;
        this.i = eqe;
        this.j = z;
        this.k = z2;
        this.l = jqe;
        this.m = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omd)) {
            return false;
        }
        omd omd = (omd) obj;
        return tpa.f(this.g, omd.g) && tpa.f(this.h, omd.h) && tpa.f(this.i, omd.i) && this.j == omd.j && this.k == omd.k && tpa.f(this.l, omd.l) && tpa.f(this.m, omd.m);
    }

    public final int hashCode() {
        int hashCode = this.g.hashCode() * 31;
        int i2 = 0;
        String str = this.h;
        int d = ms2.d(ms2.d(k7d.f((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
        jqe jqe = this.l;
        int hashCode2 = (d + (jqe == null ? 0 : jqe.hashCode())) * 31;
        Integer num = this.m;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode2 + i2;
    }

    public final jqe m() {
        return this.l;
    }

    public final Integer n() {
        return this.m;
    }

    public final String toString() {
        return "Input(prefix=" + this.g + ", link=" + this.h + ", placeholder=" + this.i + ", shouldShowMore=" + this.j + ", shouldShowDescription=" + this.k + ", hint=" + this.l + ", hintColor=" + this.m + ")";
    }
}
