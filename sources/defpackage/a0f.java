package defpackage;

/* renamed from: a0f  reason: default package */
public final class a0f {
    public final kze a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public a0f(kze kze, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = false;
        fm9.f(iArr.length == jArr2.length);
        fm9.f(jArr.length == jArr2.length);
        fm9.f(iArr2.length == jArr2.length ? true : z);
        this.a = kze;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int b2 = oaf.b(jArr, j, true); b2 < jArr.length; b2++) {
            if ((this.g[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }
}
