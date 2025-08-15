package defpackage;

/* renamed from: pde  reason: default package */
public final class pde implements jde {
    public static final xc3 c = new xc3(5);
    public volatile jde a;
    public Object b;

    public final Object get() {
        jde jde = this.a;
        xc3 xc3 = c;
        if (jde != xc3) {
            synchronized (this) {
                try {
                    if (this.a != xc3) {
                        Object obj = this.a.get();
                        this.b = obj;
                        this.a = xc3;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }

    public final String toString() {
        Object obj = this.a;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == c) {
            obj = "<supplier that returned " + this.b + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
