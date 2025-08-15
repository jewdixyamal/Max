package defpackage;

/* renamed from: ee8  reason: default package */
public final class ee8 {
    public final yj8 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public ee8(yj8 yj8, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        boolean z9 = true;
        fm9.f(!z8 || z6);
        fm9.f(!z7 || z6);
        if (z5 && (z6 || z7 || z8)) {
            z9 = false;
        }
        fm9.f(z9);
        this.a = yj8;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
    }

    public final ee8 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new ee8(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final ee8 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new ee8(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ee8.class != obj.getClass()) {
            return false;
        }
        ee8 ee8 = (ee8) obj;
        return this.b == ee8.b && this.c == ee8.c && this.d == ee8.d && this.e == ee8.e && this.f == ee8.f && this.g == ee8.g && this.h == ee8.h && this.i == ee8.i && oaf.a(this.a, ee8.a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
