package defpackage;

import java.io.Serializable;

/* renamed from: ode  reason: default package */
public final class ode implements jde, Serializable {
    public final jde a;
    public volatile transient boolean b;
    public transient Object c;

    public ode(jde jde) {
        this.a = jde;
    }

    public final Object get() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        Object obj = this.a.get();
                        this.c = obj;
                        this.b = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.b) {
            obj = "<supplier that returned " + this.c + ">";
        } else {
            obj = this.a;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
