package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: ns  reason: default package */
public final class ns implements cc7 {
    public final cc7 a;
    public final ls b;

    public ns(cc7 cc7) {
        this.a = cc7;
        this.b = new ls(cc7.d());
    }

    public Object a(x8 x8Var) {
        return j(x8Var);
    }

    public void b(xu3 xu3, Object obj) {
        int h = h(obj);
        xu3 b2 = xu3.b(d());
        Iterator g = g(obj);
        for (int i = 0; i < h; i++) {
            b2.k(d(), i, this.a, g.next());
        }
        b2.o();
    }

    public final r6d d() {
        return this.b;
    }

    public final Object e() {
        return new ArrayList();
    }

    public final int f(Object obj) {
        return ((ArrayList) obj).size();
    }

    public final Iterator g(Object obj) {
        return ((Collection) obj).iterator();
    }

    public final int h(Object obj) {
        return ((Collection) obj).size();
    }

    public final void i(Object obj, int i, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }

    public final Object j(x8 x8Var) {
        Object e = e();
        int f = f(e);
        x8 j = x8Var.j(d());
        while (true) {
            int p = j.p(d());
            if (p != -1) {
                k(j, p + f, e, true);
            } else {
                j.z(d());
                return l(e);
            }
        }
    }

    public void k(x8 x8Var, int i, Object obj, boolean z) {
        i(obj, i, x8Var.t(d(), i, this.a, (Object) null));
    }

    public final Object l(Object obj) {
        return (ArrayList) obj;
    }
}
