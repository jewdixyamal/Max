package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: z28  reason: default package */
public final class z28 extends AtomicReference implements b38, zl4, Runnable, erd {
    public final Object X;
    public final /* synthetic */ int a;
    public final ztc b;
    public Object c;
    public Throwable o;

    public /* synthetic */ z28(Object obj, ztc ztc, int i) {
        this.a = i;
        this.X = obj;
        this.b = ztc;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.c = obj;
                dm4.c(this, this.b.b(this));
                return;
            default:
                this.c = obj;
                dm4.c(this, this.b.b(this));
                return;
        }
    }

    public void b() {
        dm4.c(this, this.b.b(this));
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                if (dm4.e(this, zl4)) {
                    ((b38) this.X).c(this);
                    return;
                }
                return;
            default:
                if (dm4.e(this, zl4)) {
                    ((erd) this.X).c(this);
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
                this.o = th;
                dm4.c(this, this.b.b(this));
                return;
            default:
                this.o = th;
                dm4.c(this, this.b.b(this));
                return;
        }
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Throwable th = this.o;
                b38 b38 = (b38) this.X;
                if (th != null) {
                    this.o = null;
                    b38.onError(th);
                    return;
                }
                Object obj = this.c;
                if (obj != null) {
                    this.c = null;
                    b38.a(obj);
                    return;
                }
                b38.b();
                return;
            default:
                Throwable th2 = this.o;
                erd erd = (erd) this.X;
                if (th2 != null) {
                    erd.onError(th2);
                    return;
                } else {
                    erd.a(this.c);
                    return;
                }
        }
    }
}
