package defpackage;

import java.io.Serializable;

/* renamed from: ekc  reason: default package */
public final class ekc extends zma implements Serializable {
    public final zma a;

    public ekc(zma zma) {
        zma.getClass();
        this.a = zma;
    }

    public final zma b() {
        return this.a;
    }

    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekc) {
            return this.a.equals(((ekc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a + ".reverse()";
    }
}
