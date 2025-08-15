package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: w93  reason: default package */
public final class w93 extends zma implements Serializable {
    public final Comparator a;

    public w93(Comparator comparator) {
        comparator.getClass();
        this.a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w93) {
            return this.a.equals(((w93) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
