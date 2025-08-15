package defpackage;

/* renamed from: x1d  reason: default package */
public final class x1d {
    public static final x1d c;
    public final long a;
    public final long b;

    static {
        x1d x1d = new x1d(0, 0);
        new x1d(Long.MAX_VALUE, Long.MAX_VALUE);
        new x1d(Long.MAX_VALUE, 0);
        new x1d(0, Long.MAX_VALUE);
        c = x1d;
    }

    public x1d(long j, long j2) {
        boolean z = false;
        fm9.f(j >= 0);
        fm9.f(j2 >= 0 ? true : z);
        this.a = j;
        this.b = j2;
    }

    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        int i = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        long j5 = this.b;
        if (i == 0 && j5 == 0) {
            return j;
        }
        int i2 = oaf.a;
        long j6 = j - j4;
        if (((j ^ j4) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j5;
        if (((j5 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = false;
        boolean z2 = j6 <= j2 && j2 <= j7;
        if (j6 <= j3 && j3 <= j7) {
            z = true;
        }
        return (!z2 || !z) ? z2 ? j2 : z ? j3 : j6 : Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x1d.class != obj.getClass()) {
            return false;
        }
        x1d x1d = (x1d) obj;
        return this.a == x1d.a && this.b == x1d.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
