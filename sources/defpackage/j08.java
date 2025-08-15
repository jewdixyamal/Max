package defpackage;

/* renamed from: j08  reason: default package */
public final class j08 implements yd8, wd8 {
    public yd8 X;
    public wd8 Y;
    public long Z = -9223372036854775807L;
    public final xj8 a;
    public final long b;
    public final n64 c;
    public dj0 o;

    public j08(xj8 xj8, n64 n64, long j) {
        this.a = xj8;
        this.c = n64;
        this.b = j;
    }

    public final long A(long j, w1d w1d) {
        yd8 yd8 = this.X;
        int i = maf.a;
        return yd8.A(j, w1d);
    }

    public final boolean C(long j) {
        yd8 yd8 = this.X;
        return yd8 != null && yd8.C(j);
    }

    public final void J(wd8 wd8, long j) {
        this.Y = wd8;
        yd8 yd8 = this.X;
        if (yd8 != null) {
            long j2 = this.Z;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            yd8.J(this, j2);
        }
    }

    public final long L(m85[] m85Arr, boolean[] zArr, frc[] frcArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.Z;
        if (j3 == -9223372036854775807L || j != this.b) {
            j2 = j;
        } else {
            this.Z = -9223372036854775807L;
            j2 = j3;
        }
        yd8 yd8 = this.X;
        int i = maf.a;
        return yd8.L(m85Arr, zArr, frcArr, zArr2, j2);
    }

    public final boolean a() {
        yd8 yd8 = this.X;
        return yd8 != null && yd8.a();
    }

    public final long b(long j) {
        long j2 = this.Z;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public final void c(i6d i6d) {
        yd8 yd8 = (yd8) i6d;
        wd8 wd8 = this.Y;
        int i = maf.a;
        wd8.c(this);
    }

    public final void d(yd8 yd8) {
        wd8 wd8 = this.Y;
        int i = maf.a;
        wd8.d(this);
    }

    public final long f() {
        yd8 yd8 = this.X;
        int i = maf.a;
        return yd8.f();
    }

    public final void k() {
        yd8 yd8 = this.X;
        if (yd8 != null) {
            yd8.k();
            return;
        }
        dj0 dj0 = this.o;
        if (dj0 != null) {
            dj0.g();
        }
    }

    public final long l(long j) {
        yd8 yd8 = this.X;
        int i = maf.a;
        return yd8.l(j);
    }

    public final long n() {
        yd8 yd8 = this.X;
        int i = maf.a;
        return yd8.n();
    }

    public final sze q() {
        yd8 yd8 = this.X;
        int i = maf.a;
        return yd8.q();
    }

    public final long r() {
        yd8 yd8 = this.X;
        int i = maf.a;
        return yd8.r();
    }

    public final void s(long j, boolean z) {
        yd8 yd8 = this.X;
        int i = maf.a;
        yd8.s(j, z);
    }

    public final void t(long j) {
        yd8 yd8 = this.X;
        int i = maf.a;
        yd8.t(j);
    }
}
