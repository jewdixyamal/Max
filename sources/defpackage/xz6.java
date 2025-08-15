package defpackage;

import java.math.RoundingMode;

/* renamed from: xz6  reason: default package */
public final class xz6 implements d2d {
    public long X;
    public final long a;
    public final nv7 b;
    public final nv7 c;
    public final int o;

    public xz6(long j, long j2, long j3) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        this.X = j4;
        this.a = j6;
        nv7 nv7 = new nv7(1);
        this.b = nv7;
        nv7 nv72 = new nv7(1);
        this.c = nv72;
        nv7.a(0);
        nv72.a(j2);
        int i = -2147483647;
        if (j4 != -9223372036854775807L) {
            long a0 = oaf.a0(j5 - j6, 8, j, RoundingMode.HALF_UP);
            if (a0 > 0 && a0 <= 2147483647L) {
                i = (int) a0;
            }
            this.o = i;
            return;
        }
        this.o = -2147483647;
    }

    public final long a() {
        return this.a;
    }

    public final long b(long j) {
        return this.b.b(oaf.c(this.c, j));
    }

    public final boolean c() {
        return true;
    }

    public final boolean d(long j) {
        nv7 nv7 = this.b;
        return j - nv7.b(nv7.b - 1) < 100000;
    }

    public final t1d e(long j) {
        nv7 nv7 = this.b;
        int c2 = oaf.c(nv7, j);
        long b2 = nv7.b(c2);
        nv7 nv72 = this.c;
        z1d z1d = new z1d(b2, nv72.b(c2));
        if (b2 == j || c2 == nv7.b - 1) {
            return new t1d(z1d, z1d);
        }
        int i = c2 + 1;
        return new t1d(z1d, new z1d(nv7.b(i), nv72.b(i)));
    }

    public final long f() {
        return this.X;
    }

    public final int h() {
        return this.o;
    }
}
