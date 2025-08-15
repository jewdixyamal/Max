package defpackage;

/* renamed from: uz6  reason: default package */
public final class uz6 implements u1d {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public uz6(long j, long[] jArr, long[] jArr2) {
        np8.d(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j;
    }

    public final boolean c() {
        return this.d;
    }

    public final s1d e(long j) {
        if (!this.d) {
            y1d y1d = y1d.c;
            return new s1d(y1d, y1d);
        }
        long[] jArr = this.b;
        int f = maf.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.a;
        y1d y1d2 = new y1d(j2, jArr2[f]);
        if (j2 == j || f == jArr.length - 1) {
            return new s1d(y1d2, y1d2);
        }
        int i = f + 1;
        return new s1d(y1d2, new y1d(jArr[i], jArr2[i]));
    }

    public final long f() {
        return this.c;
    }
}
