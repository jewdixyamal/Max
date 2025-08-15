package defpackage;

import java.util.Objects;

/* renamed from: jfc  reason: default package */
public final class jfc extends zw6 {
    public final transient int X;
    public final transient Object[] c;
    public final transient int o;

    public jfc(int i, int i2, Object[] objArr) {
        this.c = objArr;
        this.o = i;
        this.X = i2;
    }

    public final boolean f() {
        return true;
    }

    public final Object get(int i) {
        z04.k(i, this.X);
        Object obj = this.c[(i * 2) + this.o];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.X;
    }
}
