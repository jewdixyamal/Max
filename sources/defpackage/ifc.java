package defpackage;

/* renamed from: ifc  reason: default package */
public final class ifc extends jx6 {
    public final transient zw6 X;
    public final transient cx6 o;

    public ifc(cx6 cx6, jfc jfc) {
        this.o = cx6;
        this.X = jfc;
    }

    public final zw6 a() {
        return this.X;
    }

    public final int b(int i, Object[] objArr) {
        return this.X.b(i, objArr);
    }

    public final boolean contains(Object obj) {
        return this.o.get(obj) != null;
    }

    public final boolean f() {
        return true;
    }

    public final m5f g() {
        return this.X.listIterator(0);
    }

    public final int size() {
        return this.o.size();
    }
}
