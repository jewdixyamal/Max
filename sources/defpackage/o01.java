package defpackage;

/* renamed from: o01  reason: default package */
public final class o01 {
    public final bg1 a;
    public final Long b;

    public o01(bg1 bg1, Long l) {
        this.a = bg1;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o01)) {
            return false;
        }
        o01 o01 = (o01) obj;
        return tpa.f(this.a, o01.a) && tpa.f(this.b, o01.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "CallAsrInfo(initiatorId=" + this.a + ", movieId=" + this.b + ")";
    }
}
