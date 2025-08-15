package defpackage;

/* renamed from: ute  reason: default package */
public final class ute implements zd8, xd8 {
    public final zd8 a;
    public final long b;
    public xd8 c;

    public ute(zd8 zd8, long j) {
        this.a = zd8;
        this.b = j;
    }

    public final boolean a() {
        return this.a.a();
    }

    public final void e(zd8 zd8) {
        xd8 xd8 = this.c;
        xd8.getClass();
        xd8.e(this);
    }

    public final long f() {
        long f = this.a.f();
        if (f == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + f;
    }

    public final long g(n85[] n85Arr, boolean[] zArr, grc[] grcArr, boolean[] zArr2, long j) {
        grc[] grcArr2 = grcArr;
        grc[] grcArr3 = new grc[grcArr2.length];
        int i = 0;
        while (true) {
            grc grc = null;
            if (i >= grcArr2.length) {
                break;
            }
            tte tte = (tte) grcArr2[i];
            if (tte != null) {
                grc = tte.a;
            }
            grcArr3[i] = grc;
            i++;
        }
        long j2 = this.b;
        long g = this.a.g(n85Arr, zArr, grcArr3, zArr2, j - j2);
        for (int i2 = 0; i2 < grcArr2.length; i2++) {
            grc grc2 = grcArr3[i2];
            if (grc2 == null) {
                grcArr2[i2] = null;
            } else {
                grc grc3 = grcArr2[i2];
                if (grc3 == null || ((tte) grc3).a != grc2) {
                    grcArr2[i2] = new tte(grc2, j2);
                }
            }
        }
        return g + j2;
    }

    public final long h(long j, x1d x1d) {
        long j2 = this.b;
        return this.a.h(j - j2, x1d) + j2;
    }

    public final void i(xd8 xd8, long j) {
        this.c = xd8;
        this.a.i(this, j - this.b);
    }

    public final void j(j6d j6d) {
        zd8 zd8 = (zd8) j6d;
        xd8 xd8 = this.c;
        xd8.getClass();
        xd8.j(this);
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

    /* JADX WARNING: type inference failed for: r0v0, types: [po7, java.lang.Object] */
    public final boolean o(qo7 qo7) {
        ? obj = new Object();
        obj.b = qo7.b;
        obj.c = qo7.c;
        obj.a = qo7.a - this.b;
        return this.a.o(new qo7(obj));
    }

    public final tze q() {
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
