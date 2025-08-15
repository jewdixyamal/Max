package defpackage;

/* renamed from: wu8  reason: default package */
public final class wu8 implements yu8 {
    public final long a;
    public final long b;

    public wu8(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu8)) {
            return false;
        }
        wu8 wu8 = (wu8) obj;
        return this.a == wu8.a && this.b == wu8.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ByRange(startTime=");
        sb.append(this.a);
        sb.append(", endTime=");
        return zr6.k(sb, this.b, ")");
    }
}
