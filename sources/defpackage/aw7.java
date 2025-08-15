package defpackage;

/* renamed from: aw7  reason: default package */
public final class aw7 {
    public long a;
    public long b;
    public long c;
    public long d;

    public final double a(long j, long j2) {
        double d2;
        this.c = ote.c(j - this.a, 0);
        long c2 = ote.c(j2 - this.b, 0);
        this.d = c2;
        if (c2 == 0 && this.c == 0) {
            d2 = 0.0d;
        } else {
            long j3 = this.c;
            d2 = ((double) j3) / ((double) (c2 + j3));
        }
        this.a = j;
        this.b = j2;
        return d2;
    }
}
