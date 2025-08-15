package defpackage;

/* renamed from: xr8  reason: default package */
public final class xr8 implements yd8, wd8 {
    public final yd8 a;
    public final long b;
    public wd8 c;

    public xr8(yd8 yd8, long j) {
        this.a = yd8;
        this.b = j;
    }

    public final long A(long j, w1d w1d) {
        long j2 = this.b;
        return this.a.A(j - j2, w1d) + j2;
    }

    public final boolean C(long j) {
        return this.a.C(j - this.b);
    }

    public final void J(wd8 wd8, long j) {
        this.c = wd8;
        this.a.J(this, j - this.b);
    }

    public final long L(m85[] m85Arr, boolean[] zArr, frc[] frcArr, boolean[] zArr2, long j) {
        frc[] frcArr2 = frcArr;
        frc[] frcArr3 = new frc[frcArr2.length];
        int i = 0;
        while (true) {
            frc frc = null;
            if (i >= frcArr2.length) {
                break;
            }
            yr8 yr8 = (yr8) frcArr2[i];
            if (yr8 != null) {
                frc = yr8.a;
            }
            frcArr3[i] = frc;
            i++;
        }
        long j2 = this.b;
        long L = this.a.L(m85Arr, zArr, frcArr3, zArr2, j - j2);
        for (int i2 = 0; i2 < frcArr2.length; i2++) {
            frc frc2 = frcArr3[i2];
            if (frc2 == null) {
                frcArr2[i2] = null;
            } else {
                frc frc3 = frcArr2[i2];
                if (frc3 == null || ((yr8) frc3).a != frc2) {
                    frcArr2[i2] = new yr8(frc2, j2);
                }
            }
        }
        return L + j2;
    }

    public final boolean a() {
        return this.a.a();
    }

    public final void c(i6d i6d) {
        yd8 yd8 = (yd8) i6d;
        wd8 wd8 = this.c;
        wd8.getClass();
        wd8.c(this);
    }

    public final void d(yd8 yd8) {
        wd8 wd8 = this.c;
        wd8.getClass();
        wd8.d(this);
    }

    public final long f() {
        long f = this.a.f();
        if (f == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + f;
    }

    public final void k() {
        this.a.k();
    }

    public final long l(long j) {
        long j2 = this.b;
        return this.a.l(j - j2) + j2;
    }

    public final long n() {
        long n = this.a.n();
        if (n == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.b + n;
    }

    public final sze q() {
        return this.a.q();
    }

    public final long r() {
        long r = this.a.r();
        if (r == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + r;
    }

    public final void s(long j, boolean z) {
        this.a.s(j - this.b, z);
    }

    public final void t(long j) {
        this.a.t(j - this.b);
    }
}
