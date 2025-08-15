package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: l6d  reason: default package */
public abstract class l6d extends m6d {
    public static int X(c6d c6d) {
        Iterator it = c6d.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                y53.Q();
                throw null;
            }
        }
        return i;
    }

    public static c6d Y(c6d c6d, int i) {
        if (i >= 0) {
            return i == 0 ? c6d : c6d instanceof os4 ? ((os4) c6d).b(i) : new ns4(c6d, i, 0);
        }
        throw new IllegalArgumentException(wg0.g(i, "Requested element count ", " is less than zero.").toString());
    }

    public static qk5 Z(c6d c6d, m56 m56) {
        return new qk5(c6d, true, m56);
    }

    public static qk5 a0(c6d c6d, m56 m56) {
        return new qk5(c6d, false, m56);
    }

    public static Object b0(r1f r1f) {
        Iterator it = r1f.a.iterator();
        if (it.hasNext()) {
            return r1f.b.invoke(it.next());
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static Object c0(c6d c6d) {
        Iterator it = c6d.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final um5 d0(c6d c6d, m56 m56) {
        if (!(c6d instanceof r1f)) {
            return new um5(c6d, n71.u0, m56);
        }
        r1f r1f = (r1f) c6d;
        return new um5(r1f.a, r1f.b, m56);
    }

    public static qk5 e0(c6d c6d, m56 m56) {
        return a0(new r1f(c6d, m56), n71.v0);
    }

    public static r1f f0(c6d c6d, m56 m56) {
        return new r1f(c6d, new c0(8, m56));
    }

    public static c6d g0(c6d c6d, int i) {
        if (i >= 0) {
            return i == 0 ? vz4.a : c6d instanceof os4 ? ((os4) c6d).a(i) : new ns4(c6d, i, 1);
        }
        throw new IllegalArgumentException(wg0.g(i, "Requested element count ", " is less than zero.").toString());
    }

    public static void h0(c6d c6d, Collection collection) {
        for (Object add : c6d) {
            collection.add(add);
        }
    }

    public static List i0(c6d c6d) {
        Iterator it = c6d.iterator();
        if (!it.hasNext()) {
            return nz4.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
