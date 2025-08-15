package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hs5  reason: default package */
public final class hs5 extends AtomicReference implements xae, Runnable {
    public final vae a;
    public volatile boolean b;

    public hs5(vae vae) {
        this.a = vae;
    }

    public final void cancel() {
        dm4.a(this);
    }

    public final void j(long j) {
        if (zae.d(j)) {
            this.b = true;
        }
    }

    public final void run() {
        if (get() != dm4.a) {
            boolean z = this.b;
            iz4 iz4 = iz4.a;
            if (z) {
                this.a.e(0L);
                lazySet(iz4);
                this.a.b();
                return;
            }
            lazySet(iz4);
            this.a.onError(new RuntimeException("Could not emit value due to lack of requests"));
        }
    }
}
