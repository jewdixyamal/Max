package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: my7  reason: default package */
public final class my7 extends AbstractCollection implements Collection, rb7 {
    public final ky7 a;

    public my7(ky7 ky7) {
        this.a = ky7;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        ky7 ky7 = this.a;
        ky7.getClass();
        return new hy7(2, ky7);
    }

    public final boolean remove(Object obj) {
        int i;
        ky7 ky7 = this.a;
        ky7.c();
        int i2 = ky7.Y;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (ky7.c[i2] >= 0 && tpa.f(ky7.b[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        ky7.j(i);
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

    public final int size() {
        return this.a.t0;
    }
}
