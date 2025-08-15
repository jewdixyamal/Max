package defpackage;

/* renamed from: qt7  reason: default package */
public final class qt7 extends rt7 {
    public final jqe d;
    public final jqe e;

    public qt7(jqe jqe, jqe jqe2) {
        super(jqe, (Throwable) null);
        this.d = jqe;
        this.e = jqe2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt7)) {
            return false;
        }
        qt7 qt7 = (qt7) obj;
        return tpa.f(this.d, qt7.d) && tpa.f(this.e, qt7.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "SmsCountExceeded(title=" + this.d + ", description=" + this.e + ")";
    }
}
