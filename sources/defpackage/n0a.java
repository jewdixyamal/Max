package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: n0a  reason: default package */
public final class n0a extends AtomicReference implements zl4, Runnable {
    public final f2a a;
    public long b;

    public n0a(f2a f2a) {
        this.a = f2a;
    }

    public final void g() {
        dm4.a(this);
    }

    public final boolean h() {
        return get() == dm4.a;
    }

    public final void run() {
        if (get() != dm4.a) {
            long j = this.b;
            this.b = 1 + j;
            this.a.e(Long.valueOf(j));
        }
    }
}
