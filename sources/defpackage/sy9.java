package defpackage;

/* renamed from: sy9  reason: default package */
public final class sy9 implements f2a, zl4 {
    public boolean X;
    public final /* synthetic */ int a;
    public final f2a b;
    public final b7b c;
    public zl4 o;

    public /* synthetic */ sy9(f2a f2a, b7b b7b, int i) {
        this.a = i;
        this.b = f2a;
        this.c = b7b;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    this.X = true;
                    Boolean bool = Boolean.FALSE;
                    f2a f2a = this.b;
                    f2a.e(bool);
                    f2a.b();
                    return;
                }
                return;
            case 1:
                this.b.b();
                return;
            default:
                if (!this.X) {
                    this.X = true;
                    this.b.b();
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
                    this.b.c(this);
                    return;
                }
                return;
            case 1:
                if (dm4.f(this.o, zl4)) {
                    this.o = zl4;
                    this.b.c(this);
                    return;
                }
                return;
            default:
                if (dm4.f(this.o, zl4)) {
                    this.o = zl4;
                    this.b.c(this);
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
                        if (this.c.test(obj)) {
                            this.X = true;
                            this.o.g();
                            Boolean bool = Boolean.TRUE;
                            f2a f2a = this.b;
                            f2a.e(bool);
                            f2a.b();
                            return;
                        }
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
            case 1:
                boolean z = this.X;
                f2a f2a2 = this.b;
                if (z) {
                    f2a2.e(obj);
                    return;
                }
                try {
                    if (!this.c.test(obj)) {
                        this.X = true;
                        f2a2.e(obj);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    c37.B(th2);
                    this.o.g();
                    f2a2.onError(th2);
                    return;
                }
            default:
                if (!this.X) {
                    f2a f2a3 = this.b;
                    f2a3.e(obj);
                    try {
                        if (this.c.test(obj)) {
                            this.X = true;
                            this.o.g();
                            f2a3.b();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        c37.B(th3);
                        this.o.g();
                        onError(th3);
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
            case 1:
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
            case 1:
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
                this.b.onError(th);
                return;
            case 1:
                this.b.onError(th);
                return;
            default:
                if (!this.X) {
                    this.X = true;
                    this.b.onError(th);
                    return;
                }
                j47.Z(th);
                return;
        }
    }
}
