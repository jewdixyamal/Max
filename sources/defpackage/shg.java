package defpackage;

import java.util.Objects;

/* renamed from: shg  reason: default package */
public final class shg extends rhg {
    public static final shg X = new shg(0, new Object[0]);
    public final transient Object[] c;
    public final transient int o;

    public shg(int i, Object[] objArr) {
        this.c = objArr;
        this.o = i;
    }

    public final Object[] a() {
        return this.c;
    }

    public final int b() {
        return 0;
    }

    public final int c() {
        return this.o;
    }

    public final boolean d() {
        return false;
    }

    public final int e(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.o;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    public final Object get(int i) {
        lz7.a0(i, this.o);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.o;
    }
}
