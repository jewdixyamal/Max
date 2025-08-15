package defpackage;

/* renamed from: hx6  reason: default package */
public final class hx6 implements pqb {
    public static final hx6 d;
    public int a;
    public boolean b;
    public boolean c;

    /* JADX WARNING: type inference failed for: r0v0, types: [hx6, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.a = Integer.MAX_VALUE;
        obj.b = true;
        obj.c = true;
        d = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hx6)) {
            return false;
        }
        hx6 hx6 = (hx6) obj;
        return this.a == hx6.a && this.b == hx6.b && this.c == hx6.c;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = (this.b ? 4194304 : 0) ^ this.a;
        if (this.c) {
            i = 8388608;
        }
        return i2 ^ i;
    }
}
