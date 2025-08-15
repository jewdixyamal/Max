package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* renamed from: n28  reason: default package */
public final class n28 implements erd, zl4, b38 {
    public final /* synthetic */ int a;
    public final b38 b;
    public final b7b c;
    public zl4 o;

    public /* synthetic */ n28(b38 b38, b7b b7b, int i) {
        this.a = i;
        this.b = b38;
        this.c = b7b;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                b38 b38 = this.b;
                try {
                    if (this.c.test(obj)) {
                        b38.a(obj);
                        return;
                    } else {
                        b38.b();
                        return;
                    }
                } catch (Throwable th) {
                    c37.B(th);
                    b38.onError(th);
                    return;
                }
            default:
                this.b.a(obj);
                return;
        }
    }

    public void b() {
        this.b.b();
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
            default:
                if (dm4.f(this.o, zl4)) {
                    this.o = zl4;
                    this.b.c(this);
                    return;
                }
                return;
        }
    }

    public final void g() {
        switch (this.a) {
            case 0:
                zl4 zl4 = this.o;
                this.o = dm4.a;
                zl4.g();
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
                this.b.onError(th);
                return;
            default:
                b38 b38 = this.b;
                try {
                    if (this.c.test(th)) {
                        b38.b();
                        return;
                    } else {
                        b38.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    c37.B(th2);
                    b38.onError(new CompositeException(th, th2));
                    return;
                }
        }
    }
}
