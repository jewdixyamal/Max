package defpackage;

/* renamed from: em4  reason: default package */
public final class em4 implements f2a, zl4 {
    public final f2a a;
    public final qj3 b;
    public final f6 c;
    public zl4 o;

    public em4(f2a f2a, qj3 qj3, f6 f6Var) {
        this.a = f2a;
        this.b = qj3;
        this.c = f6Var;
    }

    public final void b() {
        zl4 zl4 = this.o;
        dm4 dm4 = dm4.a;
        if (zl4 != dm4) {
            this.o = dm4;
            this.a.b();
        }
    }

    public final void c(zl4 zl4) {
        f2a f2a = this.a;
        try {
            this.b.accept(zl4);
            if (dm4.f(this.o, zl4)) {
                this.o = zl4;
                f2a.c(this);
            }
        } catch (Throwable th) {
            c37.B(th);
            zl4.g();
            this.o = dm4.a;
            iz4.b(th, f2a);
        }
    }

    public final void e(Object obj) {
        this.a.e(obj);
    }

    public final void g() {
        zl4 zl4 = this.o;
        dm4 dm4 = dm4.a;
        if (zl4 != dm4) {
            this.o = dm4;
            try {
                this.c.run();
            } catch (Throwable th) {
                c37.B(th);
                j47.Z(th);
            }
            zl4.g();
        }
    }

    public final boolean h() {
        return this.o.h();
    }

    public final void onError(Throwable th) {
        zl4 zl4 = this.o;
        dm4 dm4 = dm4.a;
        if (zl4 != dm4) {
            this.o = dm4;
            this.a.onError(th);
            return;
        }
        j47.Z(th);
    }
}
