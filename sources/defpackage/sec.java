package defpackage;

import android.util.SparseArray;

/* renamed from: sec  reason: default package */
public final class sec implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tec b;

    public /* synthetic */ sec(tec tec, int i) {
        this.a = i;
        this.b = tec;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                SparseArray sparseArray = this.b.h;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((vec) sparseArray.valueAt(i)).getClass();
                }
                sparseArray.clear();
                return;
            default:
                tec tec = this.b;
                yec yec = tec.i;
                if (yec.y0 == tec) {
                    if (yec.B0) {
                        yec.toString();
                    }
                    yec.k();
                    return;
                }
                return;
        }
    }
}
