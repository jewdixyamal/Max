package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: gz9  reason: default package */
public final class gz9 implements f2a, zl4 {
    public zl4 X;
    public fz9 Y;
    public volatile long Z;
    public final f2a a;
    public final long b = 1000;
    public final TimeUnit c;
    public final xtc o;
    public boolean s0;

    public gz9(y6d y6d, TimeUnit timeUnit, xtc xtc) {
        this.a = y6d;
        this.c = timeUnit;
        this.o = xtc;
    }

    public final void b() {
        if (!this.s0) {
            this.s0 = true;
            fz9 fz9 = this.Y;
            if (fz9 != null) {
                dm4.a(fz9);
            }
            if (fz9 != null) {
                fz9.run();
            }
            this.a.b();
            this.o.g();
        }
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.X, zl4)) {
            this.X = zl4;
            this.a.c(this);
        }
    }

    public final void e(Object obj) {
        if (!this.s0) {
            long j = this.Z + 1;
            this.Z = j;
            fz9 fz9 = this.Y;
            if (fz9 != null) {
                dm4.a(fz9);
            }
            fz9 fz92 = new fz9(obj, j, this);
            this.Y = fz92;
            dm4.c(fz92, this.o.c(fz92, this.b, this.c));
        }
    }

    public final void g() {
        this.X.g();
        this.o.g();
    }

    public final boolean h() {
        return this.o.h();
    }

    public final void onError(Throwable th) {
        if (this.s0) {
            j47.Z(th);
            return;
        }
        fz9 fz9 = this.Y;
        if (fz9 != null) {
            dm4.a(fz9);
        }
        this.s0 = true;
        this.a.onError(th);
        this.o.g();
    }
}
