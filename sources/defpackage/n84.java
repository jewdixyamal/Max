package defpackage;

import android.util.SparseIntArray;

/* renamed from: n84  reason: default package */
public abstract class n84 {
    public static final SparseIntArray a = new SparseIntArray(0);

    public static final n5b a() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return new n5b(0, min > 16777216 ? (min / 4) * 3 : min / 2, a, -1);
    }
}
