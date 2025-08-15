package defpackage;

/* renamed from: l08  reason: default package */
public final class l08 extends r06 {
    public static final Object X = new Object();
    public final Object c;
    public final Object o;

    public l08(lue lue, Object obj, Object obj2) {
        super(lue);
        this.c = obj;
        this.o = obj2;
    }

    public final int b(Object obj) {
        Object obj2;
        if (X.equals(obj) && (obj2 = this.o) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    public final gue g(int i, gue gue, boolean z) {
        this.b.g(i, gue, z);
        if (maf.a(gue.b, this.o) && z) {
            gue.b = X;
        }
        return gue;
    }

    public final Object m(int i) {
        Object m = this.b.m(i);
        return maf.a(m, this.o) ? X : m;
    }

    public final jue n(int i, jue jue, long j) {
        this.b.n(i, jue, j);
        if (maf.a(jue.a, this.c)) {
            jue.a = jue.C0;
        }
        return jue;
    }
}
