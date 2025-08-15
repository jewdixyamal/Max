package defpackage;

/* renamed from: sfb  reason: default package */
public final class sfb extends ka1 {
    public final jqe b;
    public final Integer c;

    public sfb(jqe jqe, Integer num) {
        super(9);
        this.b = jqe;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfb)) {
            return false;
        }
        sfb sfb = (sfb) obj;
        return tpa.f(this.b, sfb.b) && tpa.f(this.c, sfb.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.b + ", icon=" + this.c + ")";
    }
}
