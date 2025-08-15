package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: gkc  reason: default package */
public final class gkc extends r2 {
    public final List a;

    public gkc(List list) {
        this.a = list;
    }

    public final Object a(int i) {
        return this.a.remove(x53.a0(i, this));
    }

    public final void add(int i, Object obj) {
        this.a.add(x53.b0(i, this), obj);
    }

    public final void clear() {
        this.a.clear();
    }

    public final Object get(int i) {
        return this.a.get(x53.a0(i, this));
    }

    public final int getSize() {
        return this.a.size();
    }

    public final Iterator iterator() {
        return new fkc(this, 0);
    }

    public final ListIterator listIterator() {
        return new fkc(this, 0);
    }

    public final Object set(int i, Object obj) {
        return this.a.set(x53.a0(i, this), obj);
    }

    public final ListIterator listIterator(int i) {
        return new fkc(this, i);
    }
}
