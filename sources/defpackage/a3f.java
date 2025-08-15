package defpackage;

import java.io.Serializable;

/* renamed from: a3f  reason: default package */
public final class a3f implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;

    public a3f(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3f)) {
            return false;
        }
        a3f a3f = (a3f) obj;
        return tpa.f(this.a, a3f.a) && tpa.f(this.b, a3f.b) && tpa.f(this.c, a3f.c);
    }

    public final int hashCode() {
        int i = 0;
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ')';
    }
}
