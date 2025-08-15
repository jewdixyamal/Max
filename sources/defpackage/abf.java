package defpackage;

/* renamed from: abf  reason: default package */
public final class abf implements d2d {
    public final int X;
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long o;

    public abf(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.o = j2;
        this.X = i;
    }

    public final long a() {
        return this.o;
    }

    public final long b(long j) {
        return this.a[oaf.f(this.b, j, true)];
    }

    public final boolean c() {
        return true;
    }

    public final t1d e(long j) {
        long[] jArr = this.a;
        int f = oaf.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        z1d z1d = new z1d(j2, jArr2[f]);
        if (j2 >= j || f == jArr.length - 1) {
            return new t1d(z1d, z1d);
        }
        int i = f + 1;
        return new t1d(z1d, new z1d(jArr[i], jArr2[i]));
    }

    public final long f() {
        return this.c;
    }

    public final int h() {
        return this.X;
    }
}
