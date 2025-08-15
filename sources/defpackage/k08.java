package defpackage;

/* renamed from: k08  reason: default package */
public final class k08 implements zd8, xd8 {
    public zd8 X;
    public xd8 Y;
    public long Z = -9223372036854775807L;
    public final yj8 a;
    public final long b;
    public final n64 c;
    public ej0 o;

    public k08(yj8 yj8, n64 n64, long j) {
        this.a = yj8;
        this.c = n64;
        this.b = j;
    }

    public final boolean a() {
        zd8 zd8 = this.X;
        return zd8 != null && zd8.a();
    }

    public final void b(yj8 yj8) {
        long j = this.Z;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        ej0 ej0 = this.o;
        ej0.getClass();
        zd8 c2 = ej0.c(yj8, this.c, j);
        this.X = c2;
        if (this.Y != null) {
            c2.i(this, j);
        }
    }

    public final void c() {
        if (this.X != null) {
            ej0 ej0 = this.o;
            ej0.getClass();
            ej0.o(this.X);
        }
    }

    public final void e(zd8 zd8) {
        xd8 xd8 = this.Y;
        int i = oaf.a;
        xd8.e(this);
    }

    public final long f() {
        zd8 zd8 = this.X;
        int i = oaf.a;
        return zd8.f();
    }

    public final long g(n85[] n85Arr, boolean[] zArr, grc[] grcArr, boolean[] zArr2, long j) {
        long j2 = this.Z;
        long j3 = (j2 == -9223372036854775807L || j != this.b) ? j : j2;
        this.Z = -9223372036854775807L;
        zd8 zd8 = this.X;
        int i = oaf.a;
        return zd8.g(n85Arr, zArr, grcArr, zArr2, j3);
    }

    public final long h(long j, x1d x1d) {
        zd8 zd8 = this.X;
        int i = oaf.a;
        return zd8.h(j, x1d);
    }

    public final void i(xd8 xd8, long j) {
        this.Y = xd8;
        zd8 zd8 = this.X;
        if (zd8 != null) {
            long j2 = this.Z;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            zd8.i(this, j2);
        }
    }

    public final void j(j6d j6d) {
        zd8 zd8 = (zd8) j6d;
        xd8 xd8 = this.Y;
        int i = oaf.a;
        xd8.j(this);
    }

    public final void k() {
        zd8 zd8 = this.X;
        if (zd8 != null) {
            zd8.k();
            return;
        }
        ej0 ej0 = this.o;
        if (ej0 != null) {
            ej0.k();
        }
    }

    public final long l(long j) {
        zd8 zd8 = this.X;
        int i = oaf.a;
        return zd8.l(j);
    }

    public final long n() {
        zd8 zd8 = this.X;
        int i = oaf.a;
        return zd8.n();
    }

    public final boolean o(qo7 qo7) {
        zd8 zd8 = this.X;
        return zd8 != null && zd8.o(qo7);
    }

    public final tze q() {
        zd8 zd8 = this.X;
        int i = oaf.a;
        return zd8.q();
    }

    public final long r() {
        zd8 zd8 = this.X;
        int i = oaf.a;
        return zd8.r();
    }

    public final void s(long j, boolean z) {
        zd8 zd8 = this.X;
        int i = oaf.a;
        zd8.s(j, z);
    }

    public final void t(long j) {
        zd8 zd8 = this.X;
        int i = oaf.a;
        zd8.t(j);
    }
}
