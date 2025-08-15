package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: h38  reason: default package */
public final class h38 extends AtomicReference implements b38, zl4, ab3 {
    public final /* synthetic */ int a;
    public final erd b;
    public final iqd c;

    public /* synthetic */ h38(erd erd, iqd iqd, int i) {
        this.a = i;
        this.b = erd;
        this.c = iqd;
    }

    public void a(Object obj) {
        this.b.a(obj);
    }

    public final void b() {
        switch (this.a) {
            case 0:
                zl4 zl4 = (zl4) get();
                if (zl4 != dm4.a && compareAndSet(zl4, (Object) null)) {
                    this.c.k(new imc(this.b, this, false, 24));
                    return;
                }
                return;
            default:
                this.c.k(new wva(this, 4, this.b));
                return;
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                if (dm4.e(this, zl4)) {
                    this.b.c(this);
                    return;
                }
                return;
            default:
                if (dm4.e(this, zl4)) {
                    this.b.c(this);
                    return;
                }
                return;
        }
    }

    public final void g() {
        switch (this.a) {
            case 0:
                dm4.a(this);
                return;
            default:
                dm4.a(this);
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return dm4.b((zl4) get());
            default:
                return dm4.b((zl4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.b.onError(th);
                return;
            default:
                this.b.onError(th);
                return;
        }
    }
}
