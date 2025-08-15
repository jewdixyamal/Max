package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: e2a  reason: default package */
public final class e2a extends AtomicBoolean implements f2a, zl4 {
    public final f2a a;
    public final ztc b;
    public zl4 c;

    public e2a(f2a f2a, f55 f55) {
        this.a = f2a;
        this.b = f55;
    }

    public final void b() {
        if (!get()) {
            this.a.b();
        }
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.c, zl4)) {
            this.c = zl4;
            this.a.c(this);
        }
    }

    public final void e(Object obj) {
        if (!get()) {
            this.a.e(obj);
        }
    }

    public final void g() {
        if (compareAndSet(false, true)) {
            this.b.b(new q57(15, this));
        }
    }

    public final boolean h() {
        return get();
    }

    public final void onError(Throwable th) {
        if (get()) {
            j47.Z(th);
        } else {
            this.a.onError(th);
        }
    }
}
