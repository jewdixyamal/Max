package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: b55  reason: default package */
public final class b55 extends AtomicBoolean implements Runnable, zl4 {
    public final Runnable a;

    public b55(Runnable runnable) {
        this.a = runnable;
    }

    public final void g() {
        lazySet(true);
    }

    public final boolean h() {
        return get();
    }

    public final void run() {
        if (!get()) {
            try {
                this.a.run();
                lazySet(true);
            } catch (Throwable th) {
                lazySet(true);
                throw th;
            }
        }
    }
}
