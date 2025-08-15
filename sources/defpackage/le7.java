package defpackage;

/* renamed from: le7  reason: default package */
public final class le7 implements gpb {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile gpb b;

    public le7(gpb gpb) {
        this.b = gpb;
    }

    public final Object get() {
        Object obj = this.a;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.a;
                    if (obj == obj2) {
                        obj = this.b.get();
                        this.a = obj;
                        this.b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
