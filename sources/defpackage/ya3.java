package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ya3  reason: default package */
public final class ya3 extends AtomicReference implements ab3, zl4, Runnable, erd {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public Object o;

    public ya3(ab3 ab3, ztc ztc) {
        this.b = ab3;
        this.c = ztc;
    }

    public void a(Object obj) {
        ((erd) this.b).a(obj);
    }

    public void b() {
        switch (this.a) {
            case 0:
                dm4.c(this, ((ztc) this.c).b(this));
                return;
            default:
                ((ab3) this.b).b();
                return;
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                if (dm4.e(this, zl4)) {
                    ((ab3) this.b).c(this);
                    return;
                }
                return;
            case 1:
                dm4.e(this, zl4);
                return;
            default:
                dm4.e(this, zl4);
                return;
        }
    }

    public final void g() {
        switch (this.a) {
            case 0:
                dm4.a(this);
                return;
            case 1:
                dm4.a(this);
                uy1 uy1 = (uy1) this.c;
                uy1.getClass();
                dm4.a(uy1);
                return;
            default:
                dm4.a(this);
                uy1 uy12 = (uy1) this.c;
                uy12.getClass();
                dm4.a(uy12);
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return dm4.b((zl4) get());
            case 1:
                return dm4.b((zl4) get());
            default:
                return dm4.b((zl4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.o = th;
                dm4.c(this, ((ztc) this.c).b(this));
                return;
            case 1:
                ((ab3) this.b).onError(th);
                return;
            default:
                ((erd) this.b).onError(th);
                return;
        }
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) this.o;
                ab3 ab3 = (ab3) this.b;
                if (th != null) {
                    this.o = null;
                    ab3.onError(th);
                    return;
                }
                ab3.b();
                return;
            case 1:
                ((pa3) this.o).i(this);
                return;
            default:
                ((iqd) this.o).k(this);
                return;
        }
    }

    public ya3(erd erd, iqd iqd) {
        this.b = erd;
        this.o = iqd;
        this.c = new uy1(2);
    }

    public ya3(ab3 ab3, pa3 pa3) {
        this.b = ab3;
        this.o = pa3;
        this.c = new uy1(2);
    }
}
