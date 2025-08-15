package defpackage;

import java.util.Objects;

/* renamed from: ffc  reason: default package */
public final class ffc extends zw6 {
    public static final ffc X = new ffc(0, new Object[0]);
    public final transient Object[] c;
    public final transient int o;

    public ffc(int i, Object[] objArr) {
        this.c = objArr;
        this.o = i;
    }

    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.o;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    public final Object[] c() {
        return this.c;
    }

    public final int d() {
        return this.o;
    }

    public final int e() {
        return 0;
    }

    public final boolean f() {
        return false;
    }

    public final Object get(int i) {
        z04.k(i, this.o);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.o;
    }
}
