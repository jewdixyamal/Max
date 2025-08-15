package defpackage;

import java.util.Iterator;

/* renamed from: ds8  reason: default package */
public final class ds8 implements Iterator, qb7 {
    public final Iterator a;
    public final Iterator b;
    public final /* synthetic */ km4 c;

    public ds8(km4 km4) {
        this.c = km4;
        this.a = ((c6d) km4.c).iterator();
        this.b = ((c6d) km4.b).iterator();
    }

    public final boolean hasNext() {
        return this.a.hasNext() && this.b.hasNext();
    }

    public final Object next() {
        this.c.getClass();
        return new kpa(this.a.next(), this.b.next());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
