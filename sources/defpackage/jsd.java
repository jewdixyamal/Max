package defpackage;

/* renamed from: jsd  reason: default package */
public final class jsd extends jx6 {
    public final transient Object o;

    public jsd(Object obj) {
        obj.getClass();
        this.o = obj;
    }

    public final zw6 a() {
        return zw6.n(this.o);
    }

    public final int b(int i, Object[] objArr) {
        objArr[i] = this.o;
        return i + 1;
    }

    public final boolean contains(Object obj) {
        return this.o.equals(obj);
    }

    public final boolean f() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [p77, m5f] */
    public final m5f g() {
        ? m5f = new m5f(0);
        m5f.b = this.o;
        return m5f;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return "[" + this.o.toString() + ']';
    }
}
