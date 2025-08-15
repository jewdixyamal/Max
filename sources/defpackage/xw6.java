package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: xw6  reason: default package */
public final class xw6 extends zw6 {
    public final transient zw6 c;

    public xw6(zw6 zw6) {
        this.c = zw6;
    }

    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    public final boolean f() {
        return this.c.f();
    }

    public final Object get(int i) {
        zw6 zw6 = this.c;
        z04.k(i, zw6.size());
        return zw6.get((zw6.size() - 1) - i);
    }

    public final int indexOf(Object obj) {
        zw6 zw6 = this.c;
        int lastIndexOf = zw6.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (zw6.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        zw6 zw6 = this.c;
        int indexOf = zw6.indexOf(obj);
        if (indexOf >= 0) {
            return (zw6.size() - 1) - indexOf;
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final zw6 q() {
        return this.c;
    }

    /* renamed from: s */
    public final zw6 subList(int i, int i2) {
        zw6 zw6 = this.c;
        z04.n(i, i2, zw6.size());
        return zw6.subList(zw6.size() - i2, zw6.size() - i).q();
    }

    public final int size() {
        return this.c.size();
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
