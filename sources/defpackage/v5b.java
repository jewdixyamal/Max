package defpackage;

/* renamed from: v5b  reason: default package */
public final class v5b extends u5b {
    public final Object c = new Object();

    public v5b(int i) {
        super(i);
    }

    public final boolean e(Object obj) {
        boolean e;
        synchronized (this.c) {
            e = super.e(obj);
        }
        return e;
    }

    public final Object f() {
        Object f;
        synchronized (this.c) {
            f = super.f();
        }
        return f;
    }
}
