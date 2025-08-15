package defpackage;

/* renamed from: kma  reason: default package */
public final class kma extends ka1 {
    public final jqe b;
    public final int c;
    public final jqe d = null;

    public kma(int i, eqe eqe) {
        super(8);
        this.b = eqe;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kma)) {
            return false;
        }
        kma kma = (kma) obj;
        return tpa.f(this.b, kma.b) && this.c == kma.c && tpa.f(this.d, kma.d);
    }

    public final int hashCode() {
        int e = k7d.e(this.c, this.b.hashCode() * 31, 31);
        jqe jqe = this.d;
        return e + (jqe == null ? 0 : jqe.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.b + ", icon=" + this.c + ", description=" + this.d + ")";
    }
}
