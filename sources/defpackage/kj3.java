package defpackage;

import java.util.Set;

/* renamed from: kj3  reason: default package */
public final class kj3 {
    public static final kj3 i = new kj3(1, false, false, false, false, -1, -1, wz4.a);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final Set h;

    public kj3(int i2, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        this.a = i2;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j;
        this.g = j2;
        this.h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!kj3.class.equals(obj.getClass())) {
            return false;
        }
        kj3 kj3 = (kj3) obj;
        if (this.b == kj3.b && this.c == kj3.c && this.d == kj3.d && this.e == kj3.e && this.f == kj3.f && this.g == kj3.g && this.a == kj3.a) {
            return tpa.f(this.h, kj3.h);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f;
        long j2 = this.g;
        return this.h.hashCode() + (((((((((((((au1.s(this.a) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
