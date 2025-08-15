package defpackage;

/* renamed from: kdb  reason: default package */
public final class kdb implements ldb {
    public final jqe a;
    public final Integer b;

    public kdb(jqe jqe, Integer num) {
        this.a = jqe;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdb)) {
            return false;
        }
        kdb kdb = (kdb) obj;
        return tpa.f(this.a, kdb.a) && tpa.f(this.b, kdb.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.a + ", iconRes=" + this.b + ")";
    }
}
