package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: sm7  reason: default package */
public final class sm7 extends AbstractList implements RandomAccess, Serializable {
    public final List a;
    public final w56 b;

    public sm7(w56 w56, List list) {
        list.getClass();
        this.a = list;
        this.b = w56;
    }

    public final Object get(int i) {
        return this.b.apply(this.a.get(i));
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        return new rm7(this, this.a.listIterator(i), 0);
    }

    public final Object remove(int i) {
        return this.b.apply(this.a.remove(i));
    }

    public final void removeRange(int i, int i2) {
        this.a.subList(i, i2).clear();
    }

    public final int size() {
        return this.a.size();
    }
}
