package defpackage;

/* renamed from: yj8  reason: default package */
public final class yj8 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public yj8(Object obj) {
        this(-1, obj);
    }

    public final yj8 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new yj8(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj8)) {
            return false;
        }
        yj8 yj8 = (yj8) obj;
        return this.a.equals(yj8.a) && this.b == yj8.b && this.c == yj8.c && this.d == yj8.d && this.e == yj8.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public yj8(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public yj8(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public yj8(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
