package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: wbd  reason: default package */
public final class wbd extends t2 implements Serializable {
    public static final wbd b = new wbd(ky7.y0);
    public final ky7 a;

    static {
        ky7 ky7 = ky7.y0;
    }

    public wbd(ky7 ky7) {
        this.a = ky7;
    }

    public final boolean add(Object obj) {
        return this.a.a(obj) >= 0;
    }

    public final boolean addAll(Collection collection) {
        this.a.c();
        return super.addAll(collection);
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public final int getSize() {
        return this.a.t0;
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        ky7 ky7 = this.a;
        ky7.getClass();
        return new hy7(1, ky7);
    }

    public final boolean remove(Object obj) {
        ky7 ky7 = this.a;
        ky7.c();
        int g = ky7.g(obj);
        if (g < 0) {
            return false;
        }
        ky7.j(g);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        this.a.c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        this.a.c();
        return super.retainAll(collection);
    }

    public wbd() {
        this(new ky7());
    }
}
