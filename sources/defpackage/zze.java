package defpackage;

/* renamed from: zze  reason: default package */
public final class zze {
    public final jze a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public zze(jze jze, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = false;
        np8.d(iArr.length == jArr2.length);
        np8.d(jArr.length == jArr2.length);
        np8.d(iArr2.length == jArr2.length ? true : z);
        this.a = jze;
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
        for (int b2 = maf.b(jArr, j, true); b2 < jArr.length; b2++) {
            if ((this.g[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }
}
