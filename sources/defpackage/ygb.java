package defpackage;

/* renamed from: ygb  reason: default package */
public final class ygb {
    public final Long a;
    public final jqe b;

    public ygb(Long l, jqe jqe) {
        this.a = l;
        this.b = jqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygb)) {
            return false;
        }
        ygb ygb = (ygb) obj;
        return tpa.f(this.a, ygb.a) && tpa.f(this.b, ygb.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}
