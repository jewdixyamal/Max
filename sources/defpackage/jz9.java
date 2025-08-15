package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: jz9  reason: default package */
public final class jz9 implements f2a, zl4 {
    public final boolean X = false;
    public zl4 Y;
    public final f2a a;
    public final long b;
    public final TimeUnit c;
    public final xtc o;

    public jz9(f2a f2a, long j, TimeUnit timeUnit, xtc xtc) {
        this.a = f2a;
        this.b = j;
        this.c = timeUnit;
        this.o = xtc;
    }

    public final void b() {
        this.o.c(new q57(14, this), this.b, this.c);
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.Y, zl4)) {
            this.Y = zl4;
            this.a.c(this);
        }
    }

    public final void e(Object obj) {
        this.o.c(new h76((Object) this, obj, false, 14), this.b, this.c);
    }

    public final void g() {
        this.Y.g();
        this.o.g();
    }

    public final boolean h() {
        return this.o.h();
    }

    public final void onError(Throwable th) {
        this.o.c(new i76((Object) this, (Object) th, false, 11), this.X ? this.b : 0, this.c);
    }
}
