package defpackage;

/* renamed from: r2d  reason: default package */
public final class r2d {
    public final long a;
    public final long b;

    public r2d(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r2d.class != obj.getClass()) {
            return false;
        }
        r2d r2d = (r2d) obj;
        return this.a == r2d.a && this.b == r2d.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
