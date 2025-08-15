package defpackage;

/* renamed from: ahd  reason: default package */
public final class ahd extends ka1 {
    public final jqe b;
    public final Integer c;

    public ahd(jqe jqe, Integer num) {
        super(14);
        this.b = jqe;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahd)) {
            return false;
        }
        ahd ahd = (ahd) obj;
        return tpa.f(this.b, ahd.b) && tpa.f(this.c, ahd.c);
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
