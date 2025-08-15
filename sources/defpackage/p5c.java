package defpackage;

/* renamed from: p5c  reason: default package */
public final class p5c extends r5c {
    public final long a;
    public final long b;

    public p5c(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5c)) {
            return false;
        }
        p5c p5c = (p5c) obj;
        return this.a == p5c.a && this.b == p5c.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(messageId=");
        sb.append(this.a);
        sb.append(", totalBytes=");
        return zr6.k(sb, this.b, ")");
    }
}
