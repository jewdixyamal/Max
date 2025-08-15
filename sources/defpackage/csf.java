package defpackage;

/* renamed from: csf  reason: default package */
public final class csf implements u1d {
    public final bsf a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public csf(bsf bsf, int i, long j, long j2) {
        this.a = bsf;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) bsf.c);
        this.d = j3;
        this.e = maf.J(j3 * ((long) i), 1000000, (long) bsf.b);
    }

    public final boolean c() {
        return true;
    }

    public final s1d e(long j) {
        bsf bsf = this.a;
        int i = this.b;
        long j2 = (((long) bsf.b) * j) / (((long) i) * 1000000);
        long j3 = this.d - 1;
        long k = maf.k(j2, 0, j3);
        int i2 = bsf.c;
        long j4 = this.c;
        long J = maf.J(k * ((long) i), 1000000, (long) bsf.b);
        y1d y1d = new y1d(J, (((long) i2) * k) + j4);
        if (J >= j || k == j3) {
            return new s1d(y1d, y1d);
        }
        long j5 = k + 1;
        return new s1d(y1d, new y1d(maf.J(j5 * ((long) i), 1000000, (long) bsf.b), (((long) i2) * j5) + j4));
    }

    public final long f() {
        return this.e;
    }
}
