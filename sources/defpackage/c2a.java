package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c2a  reason: default package */
public final class c2a extends AtomicReference implements zl4, Runnable {
    public final f2a a;

    public c2a(f2a f2a) {
        this.a = f2a;
    }

    public final void g() {
        dm4.a(this);
    }

    public final boolean h() {
        return get() == dm4.a;
    }

    public final void run() {
        if (!h()) {
            f2a f2a = this.a;
            f2a.e(0L);
            lazySet(iz4.a);
            f2a.b();
        }
    }
}
