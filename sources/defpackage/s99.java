package defpackage;

import android.util.SparseArray;

/* renamed from: s99  reason: default package */
public final class s99 {
    public final SparseArray a;
    public b4f b;

    public s99(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(b4f b4f, int i, int i2) {
        int a2 = b4f.a(i);
        SparseArray sparseArray = this.a;
        s99 s99 = sparseArray == null ? null : (s99) sparseArray.get(a2);
        if (s99 == null) {
            s99 = new s99(1);
            sparseArray.put(b4f.a(i), s99);
        }
        if (i2 > i) {
            s99.a(b4f, i + 1, i2);
        } else {
            s99.b = b4f;
        }
    }
}
