package defpackage;

/* renamed from: x22  reason: default package */
public final class x22 {
    public final jqe a;
    public final Integer b;

    public x22(eqe eqe, Integer num) {
        this.a = eqe;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x22)) {
            return false;
        }
        x22 x22 = (x22) obj;
        return tpa.f(this.a, x22.a) && tpa.f(this.b, x22.b);
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
