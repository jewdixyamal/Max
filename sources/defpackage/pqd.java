package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pqd  reason: default package */
public final class pqd extends AtomicReference implements f2a, zl4 {
    public final erd a;
    public final iqd b;
    public boolean c;

    public pqd(erd erd, iqd iqd) {
        this.a = erd;
        this.b = iqd;
    }

    public final void b() {
        if (!this.c) {
            this.c = true;
            this.b.k(new wva(this, 4, this.a));
        }
    }

    public final void c(zl4 zl4) {
        if (dm4.e(this, zl4)) {
            this.a.c(this);
        }
    }

    public final void e(Object obj) {
        ((zl4) get()).g();
        b();
    }

    public final void g() {
        dm4.a(this);
    }

    public final boolean h() {
        return dm4.b((zl4) get());
    }

    public final void onError(Throwable th) {
        if (this.c) {
            j47.Z(th);
            return;
        }
        this.c = true;
        this.a.onError(th);
    }
}
