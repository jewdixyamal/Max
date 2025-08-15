package defpackage;

/* renamed from: pm5  reason: default package */
public class pm5 implements u1d {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;

    public pm5(qm5 qm5, long j) {
        this.c = qm5;
        this.b = j;
    }

    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final s1d e(long j) {
        switch (this.a) {
            case 0:
                qm5 qm5 = (qm5) this.c;
                np8.g((va8) qm5.l);
                va8 va8 = (va8) qm5.l;
                long[] jArr = (long[]) va8.b;
                int f = maf.f(jArr, maf.k((((long) qm5.f) * j) / 1000000, 0, qm5.k - 1), false);
                long j2 = 0;
                long j3 = f == -1 ? 0 : jArr[f];
                long[] jArr2 = (long[]) va8.c;
                if (f != -1) {
                    j2 = jArr2[f];
                }
                int i = qm5.f;
                long j4 = (j3 * 1000000) / ((long) i);
                long j5 = this.b;
                y1d y1d = new y1d(j4, j2 + j5);
                if (j4 == j || f == jArr.length - 1) {
                    return new s1d(y1d, y1d);
                }
                int i2 = f + 1;
                return new s1d(y1d, new y1d((jArr[i2] * 1000000) / ((long) i), j5 + jArr2[i2]));
            default:
                return (s1d) this.c;
        }
    }

    public final long f() {
        switch (this.a) {
            case 0:
                return ((qm5) this.c).c();
            default:
                return this.b;
        }
    }

    public pm5(long j) {
        this(j, 0);
    }

    public pm5(long j, long j2) {
        this.b = j;
        y1d y1d = j2 == 0 ? y1d.c : new y1d(0, j2);
        this.c = new s1d(y1d, y1d);
    }
}
