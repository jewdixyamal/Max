package defpackage;

import android.util.Pair;

/* renamed from: cc9  reason: default package */
public final class cc9 implements d2d {
    public final long[] a;
    public final long[] b;
    public final long c;

    public cc9(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? oaf.S(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair d(long j, long[] jArr, long[] jArr2) {
        int f = oaf.f(jArr, j, true);
        long j2 = jArr[f];
        long j3 = jArr2[f];
        int i = f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (((double) j) - ((double) j2)) / ((double) (j4 - j2))) * ((double) (jArr2[i] - j3)))) + j3));
    }

    public final long a() {
        return -1;
    }

    public final long b(long j) {
        return oaf.S(((Long) d(j, this.a, this.b).second).longValue());
    }

    public final boolean c() {
        return true;
    }

    public final t1d e(long j) {
        Pair d = d(oaf.h0(oaf.k(j, 0, this.c)), this.b, this.a);
        z1d z1d = new z1d(oaf.S(((Long) d.first).longValue()), ((Long) d.second).longValue());
        return new t1d(z1d, z1d);
    }

    public final long f() {
        return this.c;
    }

    public final int h() {
        return -2147483647;
    }
}
