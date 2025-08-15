package defpackage;

/* renamed from: y2d  reason: default package */
public final class y2d implements Comparable {
    public final long a;
    public final a34 b;

    public y2d(long j, a34 a34) {
        this.a = j;
        this.b = a34;
    }

    public final int compareTo(Object obj) {
        long j = ((y2d) obj).a;
        int i = oaf.a;
        int i2 = (this.a > j ? 1 : (this.a == j ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        return i2 == 0 ? 0 : 1;
    }
}
