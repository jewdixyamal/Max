package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.util.concurrent.Executor;

/* renamed from: s27  reason: default package */
public final class s27 {
    public final Context a;
    public final i63 b;
    public final va8 c;
    public final nx0 d;
    public final dd6 e;
    public final Executor f;
    public final SparseArray g;
    public final int h;
    public final boolean i;
    public gd6 j;
    public v2 k;

    public s27(Context context, i63 i63, va8 va8, nx0 nx0, Executor executor, lf4 lf4, int i2, boolean z, boolean z2, boolean z3) {
        this.a = context;
        this.b = i63;
        this.c = va8;
        this.d = nx0;
        this.f = executor;
        this.e = lf4;
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        this.h = i2;
        this.i = z2;
        sparseArray.put(1, new r27(new fa5(va8, nx0, z, z2)));
        sparseArray.put(2, new r27(new no0(va8, nx0, z3)));
        sparseArray.put(3, new r27(new soe(va8, nx0)));
    }

    public final void a() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.g;
            if (i2 < sparseArray.size()) {
                r27 r27 = (r27) sparseArray.get(sparseArray.keyAt(i2));
                r27.a.release();
                ba5 ba5 = r27.b;
                if (ba5 != null) {
                    ((od4) ba5).release();
                }
                i2++;
            } else {
                return;
            }
        }
    }
}
