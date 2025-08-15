package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: j3b  reason: default package */
public final class j3b implements su0 {
    public final sm5 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        np8.f(!false);
        new sm5(sparseBooleanArray);
    }

    public j3b(sm5 sm5) {
        this.a = sm5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3b)) {
            return false;
        }
        return this.a.equals(((j3b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
