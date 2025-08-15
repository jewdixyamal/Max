package defpackage;

/* renamed from: g7c  reason: default package */
public final class g7c {
    public final v5c a;
    public final long b;
    public final long c;
    public final ix8 d;

    public g7c(v5c v5c, long j, long j2, ix8 ix8) {
        this.a = v5c;
        this.b = j;
        this.c = j2;
        this.d = ix8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7c)) {
            return false;
        }
        g7c g7c = (g7c) obj;
        return tpa.f(this.a, g7c.a) && this.b == g7c.b && this.c == g7c.c && tpa.f(this.d, g7c.d);
    }

    public final int hashCode() {
        int m = h4f.m(h4f.m(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ix8 ix8 = this.d;
        return m + (ix8 == null ? 0 : ix8.hashCode());
    }

    public final String toString() {
        return "SelfReactionData(selfReaction=" + this.a + ", msgLocalId=" + this.b + ", msgServerId=" + this.c + ", reactions=" + this.d + ")";
    }
}
