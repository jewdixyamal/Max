package defpackage;

import java.util.Iterator;

/* renamed from: g1f  reason: default package */
public abstract class g1f implements Iterator {
    public final Iterator a;

    public g1f(Iterator it) {
        it.getClass();
        this.a = it;
    }

    public abstract Object a(Object obj);

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        return a(this.a.next());
    }

    public final void remove() {
        this.a.remove();
    }
}
