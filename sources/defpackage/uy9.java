package defpackage;

import java.util.NoSuchElementException;

/* renamed from: uy9  reason: default package */
public final class uy9 implements f2a, zl4 {
    public Object X;
    public final /* synthetic */ int a = 1;
    public final erd b;
    public zl4 c;
    public boolean o;

    public uy9(erd erd) {
        this.b = erd;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.o) {
                    this.o = true;
                    this.b.a(Boolean.FALSE);
                    return;
                }
                return;
            default:
                if (!this.o) {
                    this.o = true;
                    Object obj = this.X;
                    this.X = null;
                    if (obj == null) {
                        obj = null;
                    }
                    erd erd = this.b;
                    if (obj != null) {
                        erd.a(obj);
                        return;
                    } else {
                        erd.onError(new NoSuchElementException());
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                if (dm4.f(this.c, zl4)) {
                    this.c = zl4;
                    this.b.c(this);
                    return;
                }
                return;
            default:
                if (dm4.f(this.c, zl4)) {
                    this.c = zl4;
                    this.b.c(this);
                    return;
                }
                return;
        }
    }

    public final void e(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.o) {
                    try {
                        if (((b7b) this.X).test(obj)) {
                            this.o = true;
                            this.c.g();
                            this.b.a(Boolean.TRUE);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        c37.B(th);
                        this.c.g();
                        onError(th);
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (!this.o) {
                    if (this.X != null) {
                        this.o = true;
                        this.c.g();
                        this.b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                        return;
                    }
                    this.X = obj;
                    return;
                }
                return;
        }
    }

    public final void g() {
        switch (this.a) {
            case 0:
                this.c.g();
                return;
            default:
                this.c.g();
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.c.h();
            default:
                return this.c.h();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (this.o) {
                    j47.Z(th);
                    return;
                }
                this.o = true;
                this.b.onError(th);
                return;
            default:
                if (this.o) {
                    j47.Z(th);
                    return;
                }
                this.o = true;
                this.b.onError(th);
                return;
        }
    }

    public uy9(erd erd, b7b b7b) {
        this.b = erd;
        this.X = b7b;
    }
}
