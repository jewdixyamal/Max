package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: yw6  reason: default package */
public final class yw6 extends zw6 {
    public final /* synthetic */ zw6 X;
    public final transient int c;
    public final transient int o;

    public yw6(zw6 zw6, int i, int i2) {
        this.X = zw6;
        this.c = i;
        this.o = i2;
    }

    public final Object[] c() {
        return this.X.c();
    }

    public final int d() {
        return this.X.e() + this.c + this.o;
    }

    public final int e() {
        return this.X.e() + this.c;
    }

    public final boolean f() {
        return true;
    }

    public final Object get(int i) {
        z04.k(i, this.o);
        return this.X.get(i + this.c);
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: s */
    public final zw6 subList(int i, int i2) {
        z04.n(i, i2, this.o);
        int i3 = this.c;
        return this.X.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.o;
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
