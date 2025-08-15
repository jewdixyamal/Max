package defpackage;

import java.io.Serializable;

/* renamed from: dkc  reason: default package */
public final class dkc extends zma implements Serializable {
    public static final dkc a = new zma();

    public final zma b() {
        return sm9.a;
    }

    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
