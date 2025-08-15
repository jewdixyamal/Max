package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: jue  reason: default package */
public final class jue implements su0 {
    public static final Object C0 = new Object();
    public static final Object D0 = new Object();
    public static final rb8 E0;
    public int A0;
    public long B0;
    public long X;
    public long Y;
    public long Z;
    public Object a = C0;
    public Object b;
    public rb8 c = E0;
    public Object o;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public gb8 v0;
    public boolean w0;
    public long x0;
    public long y0;
    public int z0;

    /* JADX WARNING: type inference failed for: r8v0, types: [ab8, cb8] */
    static {
        za8 za8 = new za8();
        ls5 ls5 = zw6.b;
        ffc ffc = ffc.X;
        List emptyList = Collections.emptyList();
        ffc ffc2 = ffc.X;
        Uri uri = Uri.EMPTY;
        E0 = new rb8("com.google.android.exoplayer2.Timeline", new ab8(za8), uri != null ? new kb8(uri, (br7) null, emptyList, ffc2) : null, new gb8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), fd8.S0);
    }

    public final boolean a() {
        np8.f(this.u0 == (this.v0 != null));
        return this.v0 != null;
    }

    public final void b(Object obj, rb8 rb8, Object obj2, long j, long j2, long j3, boolean z, boolean z2, gb8 gb8, long j4, long j5, int i, int i2, long j6) {
        kb8 kb8;
        rb8 rb82 = rb8;
        gb8 gb82 = gb8;
        this.a = obj;
        this.c = rb82 != null ? rb82 : E0;
        this.b = (rb82 == null || (kb8 = rb82.b) == null) ? null : kb8.f;
        this.o = obj2;
        this.X = j;
        this.Y = j2;
        this.Z = j3;
        this.s0 = z;
        this.t0 = z2;
        this.u0 = gb82 != null;
        this.v0 = gb82;
        this.x0 = j4;
        this.y0 = j5;
        this.z0 = i;
        this.A0 = i2;
        this.B0 = j6;
        this.w0 = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (jue.class.equals(obj.getClass())) {
                jue jue = (jue) obj;
                return maf.a(this.a, jue.a) && maf.a(this.c, jue.c) && maf.a(this.o, jue.o) && maf.a(this.v0, jue.v0) && this.X == jue.X && this.Y == jue.Y && this.Z == jue.Z && this.s0 == jue.s0 && this.t0 == jue.t0 && this.w0 == jue.w0 && this.x0 == jue.x0 && this.y0 == jue.y0 && this.z0 == jue.z0 && this.A0 == jue.A0 && this.B0 == jue.B0;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.o;
        int i = 0;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        gb8 gb8 = this.v0;
        if (gb8 != null) {
            i = gb8.hashCode();
        }
        long j = this.X;
        long j2 = this.Y;
        long j3 = this.Z;
        long j4 = this.x0;
        long j5 = this.y0;
        long j6 = this.B0;
        return ((((((((((((((((((((((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.s0 ? 1 : 0)) * 31) + (this.t0 ? 1 : 0)) * 31) + (this.w0 ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.z0) * 31) + this.A0) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }
}
