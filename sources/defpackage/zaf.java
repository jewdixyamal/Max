package defpackage;

/* renamed from: zaf  reason: default package */
public final class zaf implements c2d {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public zaf(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    public final long a() {
        return this.d;
    }

    public final long b(long j) {
        return this.a[maf.f(this.b, j, true)];
    }

    public final boolean c() {
        return true;
    }

    public final s1d e(long j) {
        long[] jArr = this.a;
        int f = maf.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        y1d y1d = new y1d(j2, jArr2[f]);
        if (j2 >= j || f == jArr.length - 1) {
            return new s1d(y1d, y1d);
        }
        int i = f + 1;
        return new s1d(y1d, new y1d(jArr[i], jArr2[i]));
    }

    public final long f() {
        return this.c;
    }
}
