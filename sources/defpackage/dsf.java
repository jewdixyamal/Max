package defpackage;

import java.math.RoundingMode;

/* renamed from: dsf  reason: default package */
public final class dsf implements v1d {
    public final long X;
    public final bsf a;
    public final int b;
    public final long c;
    public final long o;

    public dsf(bsf bsf, int i, long j, long j2) {
        this.a = bsf;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) bsf.c);
        this.o = j3;
        this.X = d(j3);
    }

    public final boolean c() {
        return true;
    }

    public final long d(long j) {
        long j2 = (long) this.a.b;
        int i = oaf.a;
        return oaf.a0(j * ((long) this.b), 1000000, j2, RoundingMode.FLOOR);
    }

    public final t1d e(long j) {
        bsf bsf = this.a;
        long j2 = (((long) bsf.b) * j) / (((long) this.b) * 1000000);
        long j3 = this.o;
        long k = oaf.k(j2, 0, j3 - 1);
        long j4 = this.c;
        long d = d(k);
        z1d z1d = new z1d(d, (((long) bsf.c) * k) + j4);
        if (d >= j || k == j3 - 1) {
            return new t1d(z1d, z1d);
        }
        long j5 = k + 1;
        return new t1d(z1d, new z1d(d(j5), (((long) bsf.c) * j5) + j4));
    }

    public final long f() {
        return this.X;
    }
}
