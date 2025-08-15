package defpackage;

import android.util.SparseArray;

/* renamed from: pbe  reason: default package */
public final class pbe implements la5 {
    public final la5 a;
    public final mbe b;
    public k8g c;

    public pbe(la5 la5, mbe mbe) {
        this.a = la5;
        this.b = mbe;
    }

    public final void S(pa5 pa5) {
        k8g k8g = new k8g(pa5, this.b);
        this.c = k8g;
        this.a.S(k8g);
    }

    public final void d(long j, long j2) {
        k8g k8g = this.c;
        if (k8g != null) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) k8g.c;
                if (i >= sparseArray.size()) {
                    break;
                }
                obe obe = ((qbe) sparseArray.valueAt(i)).h;
                if (obe != null) {
                    obe.reset();
                }
                i++;
            }
        }
        this.a.d(j, j2);
    }

    public final int g(na5 na5, lh4 lh4) {
        return this.a.g(na5, lh4);
    }

    public final la5 m() {
        return this.a;
    }

    public final boolean n(na5 na5) {
        return this.a.n(na5);
    }

    public final void release() {
        this.a.release();
    }
}
