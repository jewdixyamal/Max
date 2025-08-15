package defpackage;

/* renamed from: y1d  reason: default package */
public final class y1d {
    public static final y1d c = new y1d(0, 0);
    public final long a;
    public final long b;

    public y1d(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y1d.class != obj.getClass()) {
            return false;
        }
        y1d y1d = (y1d) obj;
        return this.a == y1d.a && this.b == y1d.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return zr6.k(sb, this.b, "]");
    }
}
