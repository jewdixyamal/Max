package defpackage;

/* renamed from: wy9  reason: default package */
public final class wy9 implements f2a, zl4 {
    public boolean X;
    public final Object Y;
    public final /* synthetic */ int a;
    public final ol0 b;
    public final Object c;
    public zl4 o;

    public /* synthetic */ wy9(Object obj, Object obj2, ol0 ol0, int i) {
        this.a = i;
        this.Y = obj;
        this.b = ol0;
        this.c = obj2;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    this.X = true;
                    Object obj = this.c;
                    f2a f2a = (f2a) this.Y;
                    f2a.e(obj);
                    f2a.b();
                    return;
                }
                return;
            default:
                if (!this.X) {
                    this.X = true;
                    ((erd) this.Y).a(this.c);
                    return;
                }
                return;
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                if (dm4.f(this.o, zl4)) {
                    this.o = zl4;
                    ((f2a) this.Y).c(this);
                    return;
                }
                return;
            default:
                if (dm4.f(this.o, zl4)) {
                    this.o = zl4;
                    ((erd) this.Y).c(this);
                    return;
                }
                return;
        }
    }

    public final void e(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    try {
                        this.b.accept(this.c, obj);
                        return;
                    } catch (Throwable th) {
                        c37.B(th);
                        this.o.g();
                        onError(th);
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (!this.X) {
                    try {
                        this.b.accept(this.c, obj);
                        return;
                    } catch (Throwable th2) {
                        c37.B(th2);
                        this.o.g();
                        onError(th2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final void g() {
        switch (this.a) {
            case 0:
                this.o.g();
                return;
            default:
                this.o.g();
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.o.h();
            default:
                return this.o.h();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (this.X) {
                    j47.Z(th);
                    return;
                }
                this.X = true;
                ((f2a) this.Y).onError(th);
                return;
            default:
                if (this.X) {
                    j47.Z(th);
                    return;
                }
                this.X = true;
                ((erd) this.Y).onError(th);
                return;
        }
    }
}
