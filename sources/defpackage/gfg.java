package defpackage;

/* renamed from: gfg  reason: default package */
public final class gfg implements ifg {
    public static final Object c = new Object();
    public volatile ifg a;
    public volatile Object b;

    /* JADX WARNING: type inference failed for: r0v1, types: [gfg, java.lang.Object, ifg] */
    public static ifg a(ifg ifg) {
        if (ifg instanceof gfg) {
            return ifg;
        }
        ? obj = new Object();
        obj.b = c;
        obj.a = ifg;
        return obj;
    }

    public final Object r() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == obj2) {
                        obj = this.a.r();
                        Object obj3 = this.b;
                        if (obj3 != obj2) {
                            if (obj3 != obj) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                            }
                        }
                        this.b = obj;
                        this.a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
