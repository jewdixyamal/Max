package defpackage;

/* renamed from: web  reason: default package */
public final class web implements xeb {
    public final Long a;
    public final jqe b;

    public web(Long l, jqe jqe) {
        this.a = l;
        this.b = jqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof web)) {
            return false;
        }
        web web = (web) obj;
        return tpa.f(this.a, web.a) && tpa.f(this.b, web.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}
