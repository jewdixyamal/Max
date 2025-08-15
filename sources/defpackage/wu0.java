package defpackage;

import android.util.SparseArray;

/* renamed from: wu0  reason: default package */
public final class wu0 implements oa5 {
    public static final lh4 u0 = new Object();
    public boolean X;
    public ph4 Y;
    public long Z;
    public final ka5 a;
    public final int b;
    public final oy5 c;
    public final SparseArray o = new SparseArray();
    public u1d s0;
    public oy5[] t0;

    public wu0(ka5 ka5, int i, oy5 oy5) {
        this.a = ka5;
        this.b = i;
        this.c = oy5;
    }

    public final xze B(int i, int i2) {
        xze dt4;
        SparseArray sparseArray = this.o;
        uu0 uu0 = (uu0) sparseArray.get(i);
        if (uu0 == null) {
            int i3 = 0;
            np8.f(this.t0 == null);
            uu0 = new uu0(i, i2, i2 == this.b ? this.c : null);
            ph4 ph4 = this.Y;
            long j = this.Z;
            if (ph4 == null) {
                uu0.e = uu0.c;
            } else {
                uu0.f = j;
                while (true) {
                    int[] iArr = (int[]) ph4.a;
                    if (i3 >= iArr.length) {
                        dt4 = new dt4();
                        break;
                    }
                    if (uu0.a == iArr[i3]) {
                        dt4 = ((drc[]) ph4.b)[i3];
                        break;
                    }
                    i3++;
                }
                uu0.e = dt4;
                oy5 oy5 = uu0.d;
                if (oy5 != null) {
                    dt4.d(oy5);
                }
            }
            sparseArray.put(i, uu0);
        }
        return uu0;
    }

    public final void M(u1d u1d) {
        this.s0 = u1d;
    }

    public final l13 a() {
        u1d u1d = this.s0;
        if (u1d instanceof l13) {
            return (l13) u1d;
        }
        return null;
    }

    public final void b(ph4 ph4, long j, long j2) {
        xze dt4;
        this.Y = ph4;
        this.Z = j2;
        boolean z = this.X;
        ka5 ka5 = this.a;
        if (!z) {
            ka5.g(this);
            if (j != -9223372036854775807L) {
                ka5.d(0, j);
            }
            this.X = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        ka5.d(0, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.o;
            if (i < sparseArray.size()) {
                uu0 uu0 = (uu0) sparseArray.valueAt(i);
                if (ph4 == null) {
                    uu0.e = uu0.c;
                } else {
                    uu0.f = j2;
                    int i2 = 0;
                    while (true) {
                        int[] iArr = (int[]) ph4.a;
                        if (i2 >= iArr.length) {
                            dt4 = new dt4();
                            break;
                        }
                        if (uu0.a == iArr[i2]) {
                            dt4 = ((drc[]) ph4.b)[i2];
                            break;
                        }
                        i2++;
                    }
                    uu0.e = dt4;
                    oy5 oy5 = uu0.d;
                    if (oy5 != null) {
                        dt4.d(oy5);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void c() {
        this.a.release();
    }

    public final void w() {
        SparseArray sparseArray = this.o;
        oy5[] oy5Arr = new oy5[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            oy5 oy5 = ((uu0) sparseArray.valueAt(i)).d;
            np8.g(oy5);
            oy5Arr[i] = oy5;
        }
        this.t0 = oy5Arr;
    }
}
