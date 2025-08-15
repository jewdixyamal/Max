package defpackage;

import java.lang.reflect.Method;

/* renamed from: j23  reason: default package */
public final class j23 {
    public final int a;
    public final Method b;

    public j23(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j23)) {
            return false;
        }
        j23 j23 = (j23) obj;
        return this.a == j23.a && this.b.getName().equals(j23.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
