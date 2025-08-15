package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: az  reason: default package */
public final class az extends AtomicReference {
    public final boolean a(Throwable th) {
        if (q45.a(this, th)) {
            return true;
        }
        j47.Z(th);
        return false;
    }

    public final void b() {
        Throwable d = q45.d(this);
        if (d != null && d != q45.a) {
            j47.Z(d);
        }
    }

    public final void c(ab3 ab3) {
        Throwable d = q45.d(this);
        if (d == null) {
            ab3.b();
        } else if (d != q45.a) {
            ab3.onError(d);
        }
    }

    public final void d(f2a f2a) {
        Throwable d = q45.d(this);
        if (d == null) {
            f2a.b();
        } else if (d != q45.a) {
            f2a.onError(d);
        }
    }

    public final void e(vae vae) {
        Throwable d = q45.d(this);
        if (d == null) {
            vae.b();
        } else if (d != q45.a) {
            vae.onError(d);
        }
    }
}
