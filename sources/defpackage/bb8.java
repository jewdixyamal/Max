package defpackage;

/* renamed from: bb8  reason: default package */
public class bb8 {
    public static final bb8 h = new za8().a();
    public static final String i = Integer.toString(0, 36);
    public static final String j = Integer.toString(1, 36);
    public static final String k = Integer.toString(2, 36);
    public static final String l = Integer.toString(3, 36);
    public static final String m = Integer.toString(4, 36);
    public static final String n = Integer.toString(5, 36);
    public static final String o = Integer.toString(6, 36);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public bb8(za8 za8) {
        this.a = oaf.h0(za8.a);
        this.c = oaf.h0(za8.b);
        this.b = za8.a;
        this.d = za8.b;
        this.e = za8.c;
        this.f = za8.d;
        this.g = za8.e;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [za8, java.lang.Object] */
    public final za8 a() {
        ? obj = new Object();
        obj.a = this.b;
        obj.b = this.d;
        obj.c = this.e;
        obj.d = this.f;
        obj.e = this.g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb8)) {
            return false;
        }
        bb8 bb8 = (bb8) obj;
        return this.b == bb8.b && this.d == bb8.d && this.e == bb8.e && this.f == bb8.f && this.g == bb8.g;
    }

    public final int hashCode() {
        long j2 = this.b;
        long j3 = this.d;
        return (((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
