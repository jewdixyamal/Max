package defpackage;

/* renamed from: zlb  reason: default package */
public final class zlb extends amb {
    public final Integer a;
    public final jqe b;

    public zlb(jqe jqe, Integer num) {
        this.a = num;
        this.b = jqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlb)) {
            return false;
        }
        zlb zlb = (zlb) obj;
        return tpa.f(this.a, zlb.a) && tpa.f(this.b, zlb.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "ShowSuccessSnackbar(iconRes=" + this.a + ", textSource=" + this.b + ")";
    }
}
