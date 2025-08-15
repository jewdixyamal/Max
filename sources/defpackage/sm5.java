package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: sm5  reason: default package */
public final class sm5 {
    public final SparseBooleanArray a;

    public sm5(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        np8.e(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm5)) {
            return false;
        }
        sm5 sm5 = (sm5) obj;
        int i = maf.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.equals(sm5.a);
        }
        if (sparseBooleanArray.size() != sm5.a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (a(i2) != sm5.a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = maf.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + a(i2);
        }
        return size;
    }
}
