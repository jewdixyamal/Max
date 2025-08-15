package defpackage;

import java.io.Serializable;

/* renamed from: kpa  reason: default package */
public final class kpa implements Serializable {
    public final Object a;
    public final Object b;

    public kpa(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpa)) {
            return false;
        }
        kpa kpa = (kpa) obj;
        return tpa.f(this.a, kpa.a) && tpa.f(this.b, kpa.b);
    }

    public final int hashCode() {
        int i = 0;
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ')';
    }
}
