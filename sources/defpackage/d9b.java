package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: d9b  reason: default package */
public abstract class d9b {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(z8b.a, 0);
        hashMap.put(z8b.b, 1);
        hashMap.put(z8b.c, 2);
        for (z8b z8b : hashMap.keySet()) {
            a.append(((Integer) b.get(z8b)).intValue(), z8b);
        }
    }

    public static int a(z8b z8b) {
        Integer num = (Integer) b.get(z8b);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + z8b);
    }

    public static z8b b(int i) {
        z8b z8b = (z8b) a.get(i);
        if (z8b != null) {
            return z8b;
        }
        throw new IllegalArgumentException(zr6.h(i, "Unknown Priority for value "));
    }
}
