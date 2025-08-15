package defpackage;

/* renamed from: ifb  reason: default package */
public final class ifb extends ka1 {
    public final long b;
    public final reb c;

    public ifb(long j, reb reb) {
        super(9);
        this.b = j;
        this.c = reb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifb)) {
            return false;
        }
        ifb ifb = (ifb) obj;
        return this.b == ifb.b && this.c == ifb.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ChangeLink(id=" + this.b + ", type=" + this.c + ")";
    }
}
