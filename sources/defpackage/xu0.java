package defpackage;

import android.util.SparseArray;

/* renamed from: xu0  reason: default package */
public final class xu0 implements pa5, k13 {
    public static final cb4 u0;
    public static final lh4 v0 = new Object();
    public boolean X;
    public qz7 Y;
    public long Z;
    public final la5 a;
    public final int b;
    public final qy5 c;
    public final SparseArray o = new SparseArray();
    public v1d s0;
    public qy5[] t0;

    /* JADX WARNING: type inference failed for: r0v0, types: [cb4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [mbe, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [lh4, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.b = new Object();
        u0 = obj;
    }

    public xu0(la5 la5, int i, qy5 qy5) {
        this.a = la5;
        this.b = i;
        this.c = qy5;
    }

    public final yze B(int i, int i2) {
        SparseArray sparseArray = this.o;
        vu0 vu0 = (vu0) sparseArray.get(i);
        if (vu0 == null) {
            fm9.k(this.t0 == null);
            vu0 = new vu0(i, i2, i2 == this.b ? this.c : null);
            qz7 qz7 = this.Y;
            long j = this.Z;
            if (qz7 == null) {
                vu0.e = vu0.c;
            } else {
                vu0.f = j;
                yze Y2 = qz7.Y(i2);
                vu0.e = Y2;
                qy5 qy5 = vu0.d;
                if (qy5 != null) {
                    Y2.e(qy5);
                }
            }
            sparseArray.put(i, vu0);
        }
        return vu0;
    }

    public final void J(v1d v1d) {
        this.s0 = v1d;
    }

    public final m13 a() {
        v1d v1d = this.s0;
        if (v1d instanceof m13) {
            return (m13) v1d;
        }
        return null;
    }

    public final void b(qz7 qz7, long j, long j2) {
        this.Y = qz7;
        this.Z = j2;
        boolean z = this.X;
        la5 la5 = this.a;
        if (!z) {
            la5.S(this);
            if (j != -9223372036854775807L) {
                la5.d(0, j);
            }
            this.X = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        la5.d(0, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.o;
            if (i < sparseArray.size()) {
                vu0 vu0 = (vu0) sparseArray.valueAt(i);
                if (qz7 == null) {
                    vu0.e = vu0.c;
                } else {
                    vu0.f = j2;
                    yze Y2 = qz7.Y(vu0.a);
                    vu0.e = Y2;
                    qy5 qy5 = vu0.d;
                    if (qy5 != null) {
                        Y2.e(qy5);
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
        qy5[] qy5Arr = new qy5[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            qy5 qy5 = ((vu0) sparseArray.valueAt(i)).d;
            fm9.l(qy5);
            qy5Arr[i] = qy5;
        }
        this.t0 = qy5Arr;
    }
}
