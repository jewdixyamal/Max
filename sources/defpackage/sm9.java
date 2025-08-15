package defpackage;

import java.io.Serializable;

/* renamed from: sm9  reason: default package */
public final class sm9 extends zma implements Serializable {
    public static final sm9 a = new zma();

    public final zma b() {
        return dkc.a;
    }

    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
