package defpackage;

/* renamed from: zgb  reason: default package */
public final class zgb implements chb {
    public final Long a;
    public final jqe b;

    public zgb(Long l, jqe jqe) {
        this.a = l;
        this.b = jqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgb)) {
            return false;
        }
        zgb zgb = (zgb) obj;
        return tpa.f(this.a, zgb.a) && tpa.f(this.b, zgb.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}
