package defpackage;

import android.util.SparseIntArray;

/* renamed from: j30  reason: default package */
public final class j30 {
    public static final /* synthetic */ int b = 0;
    public final i30 a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public j30(i30 i30) {
        this.a = i30;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j30)) {
            return false;
        }
        j30 j30 = (j30) obj;
        i30 i30 = this.a;
        return i30 == null ? j30.a == null : i30.equals(j30.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
