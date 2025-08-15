package defpackage;

/* renamed from: lfc  reason: default package */
public final class lfc extends jx6 {
    public static final Object[] t0;
    public static final lfc u0;
    public final transient int X;
    public final transient Object[] Y;
    public final transient int Z;
    public final transient Object[] o;
    public final transient int s0;

    static {
        Object[] objArr = new Object[0];
        t0 = objArr;
        u0 = new lfc(0, 0, 0, objArr, objArr);
    }

    public lfc(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.o = objArr;
        this.X = i;
        this.Y = objArr2;
        this.Z = i2;
        this.s0 = i3;
    }

    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.o;
        int i2 = this.s0;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    public final Object[] c() {
        return this.o;
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.Y;
            if (objArr.length != 0) {
                int A = xfg.A(obj);
                while (true) {
                    int i = A & this.Z;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    A = i + 1;
                }
            }
        }
        return false;
    }

    public final int d() {
        return this.s0;
    }

    public final int e() {
        return 0;
    }

    public final boolean f() {
        return false;
    }

    public final m5f g() {
        return a().listIterator(0);
    }

    public final int hashCode() {
        return this.X;
    }

    public final zw6 k() {
        return zw6.h(this.s0, this.o);
    }

    public final int size() {
        return this.s0;
    }
}
