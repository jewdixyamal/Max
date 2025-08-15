package defpackage;

/* renamed from: wd0  reason: default package */
public class wd0 implements v1d {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ wd0(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    public final t1d e(long j) {
        switch (this.a) {
            case 0:
                xd0 xd0 = (xd0) this.c;
                t1d b2 = xd0.t0[0].b(j);
                int i = 1;
                while (true) {
                    n13[] n13Arr = xd0.t0;
                    if (i >= n13Arr.length) {
                        return b2;
                    }
                    t1d b3 = n13Arr[i].b(j);
                    if (b3.a.b < b2.a.b) {
                        b2 = b3;
                    }
                    i++;
                }
            case 1:
                qm5 qm5 = (qm5) this.c;
                fm9.l((h7b) qm5.l);
                h7b h7b = (h7b) qm5.l;
                long[] jArr = (long[]) h7b.b;
                int f = oaf.f(jArr, oaf.k((((long) qm5.f) * j) / 1000000, 0, qm5.k - 1), false);
                long j2 = 0;
                long j3 = f == -1 ? 0 : jArr[f];
                long[] jArr2 = (long[]) h7b.c;
                if (f != -1) {
                    j2 = jArr2[f];
                }
                int i2 = qm5.f;
                long j4 = (j3 * 1000000) / ((long) i2);
                long j5 = this.b;
                z1d z1d = new z1d(j4, j2 + j5);
                if (j4 == j || f == jArr.length - 1) {
                    return new t1d(z1d, z1d);
                }
                int i3 = f + 1;
                return new t1d(z1d, new z1d((jArr[i3] * 1000000) / ((long) i2), j5 + jArr2[i3]));
            default:
                return (t1d) this.c;
        }
    }

    public final long f() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((qm5) this.c).c();
            default:
                return this.b;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public wd0(long j) {
        this(j, 0);
        this.a = 2;
    }

    public wd0(long j, long j2) {
        this.a = 2;
        this.b = j;
        z1d z1d = j2 == 0 ? z1d.c : new z1d(0, j2);
        this.c = new t1d(z1d, z1d);
    }
}
