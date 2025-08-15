package defpackage;

/* renamed from: lqb  reason: default package */
public final class lqb {
    public final Class a;
    public final Class b;

    public lqb(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static lqb a(Class cls) {
        return new lqb(kqb.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lqb.class != obj.getClass()) {
            return false;
        }
        lqb lqb = (lqb) obj;
        if (!this.b.equals(lqb.b)) {
            return false;
        }
        return this.a.equals(lqb.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class<kqb> cls = kqb.class;
        Class cls2 = this.b;
        Class<kqb> cls3 = this.a;
        if (cls3 == cls) {
            return cls2.getName();
        }
        return "@" + cls3.getName() + " " + cls2.getName();
    }
}
