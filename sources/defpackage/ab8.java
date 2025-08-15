package defpackage;

/* renamed from: ab8  reason: default package */
public abstract class ab8 implements su0 {
    public static final wa8 Y = new wa8(1);
    public final boolean X;
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean o;

    static {
        new za8().b();
    }

    public ab8(za8 za8) {
        this.a = za8.a;
        this.b = za8.b;
        this.c = za8.c;
        this.o = za8.d;
        this.X = za8.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab8)) {
            return false;
        }
        ab8 ab8 = (ab8) obj;
        return this.a == ab8.a && this.b == ab8.b && this.c == ab8.c && this.o == ab8.o && this.X == ab8.X;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.c ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + (this.X ? 1 : 0);
    }
}
