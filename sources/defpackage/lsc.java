package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: lsc  reason: default package */
public final class lsc extends AtomicInteger implements vqb {
    public final Object a;
    public final vae b;

    public lsc(vae vae, Object obj) {
        this.b = vae;
        this.a = obj;
    }

    public final void cancel() {
        lazySet(2);
    }

    public final void clear() {
        lazySet(1);
    }

    public final boolean isEmpty() {
        return get() != 0;
    }

    public final void j(long j) {
        if (zae.d(j) && compareAndSet(0, 1)) {
            Object obj = this.a;
            vae vae = this.b;
            vae.e(obj);
            if (get() != 2) {
                vae.b();
            }
        }
    }

    public final int n(int i) {
        return 1;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.a;
    }
}
