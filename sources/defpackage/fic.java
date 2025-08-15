package defpackage;

/* renamed from: fic  reason: default package */
public final class fic implements eic {
    public final k56 a;
    public volatile Object b = yxc.s0;
    public final Object c = this;

    public fic(k56 k56) {
        this.a = k56;
    }

    public final boolean a() {
        return this.b != yxc.s0;
    }

    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        yxc yxc = yxc.s0;
        if (obj2 != yxc) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == yxc) {
                obj = this.a.invoke();
                this.b = obj;
            }
        }
        return obj;
    }

    public final void reset() {
        synchronized (this.c) {
            this.b = yxc.s0;
        }
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
