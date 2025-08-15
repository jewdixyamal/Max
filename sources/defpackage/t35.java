package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: t35  reason: default package */
public final class t35 {
    public final Object a;
    public final Method b;
    public final int c;
    public boolean d = true;

    public t35(Object obj, Method method) {
        if (obj == null) {
            throw new NullPointerException("EventHandler target cannot be null.");
        } else if (method != null) {
            this.a = obj;
            this.b = method;
            method.setAccessible(true);
            this.c = obj.hashCode() + ((method.hashCode() + 31) * 31);
        } else {
            throw new NullPointerException("EventHandler method cannot be null.");
        }
    }

    public final void a(Object obj) {
        if (this.d) {
            try {
                this.b.invoke(this.a, new Object[]{obj});
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof Error) {
                    throw ((Error) e2.getCause());
                }
                throw e2;
            }
        } else {
            throw new IllegalStateException(toString() + " has been invalidated and can no longer handle events.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t35.class != obj.getClass()) {
            return false;
        }
        t35 t35 = (t35) obj;
        return this.b.equals(t35.b) && this.a == t35.a;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return "[EventHandler " + this.b + "]";
    }
}
