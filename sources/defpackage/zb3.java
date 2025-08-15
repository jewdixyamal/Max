package defpackage;

import java.util.Set;

/* renamed from: zb3  reason: default package */
public interface zb3 {
    Object a(Class cls) {
        return f(lqb.a(cls));
    }

    Set b(lqb lqb) {
        return (Set) d(lqb).get();
    }

    gpb c(Class cls) {
        return e(lqb.a(cls));
    }

    gpb d(lqb lqb);

    gpb e(lqb lqb);

    Object f(lqb lqb) {
        gpb e = e(lqb);
        if (e == null) {
            return null;
        }
        return e.get();
    }
}
