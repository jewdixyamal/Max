package defpackage;

/* renamed from: ex8  reason: default package */
public final class ex8 {
    public final long a;
    public final v5c b;

    public ex8(long j, v5c v5c) {
        this.a = j;
        this.b = v5c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex8)) {
            return false;
        }
        ex8 ex8 = (ex8) obj;
        return this.a == ex8.a && tpa.f(this.b, ex8.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MessageReactionEntryData(userId=" + this.a + ", reaction=" + this.b + ")";
    }
}
