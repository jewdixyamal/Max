package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wr5  reason: default package */
public final class wr5 extends AtomicInteger implements gs5, xae {
    public final ypb a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicLong c = new AtomicLong();
    public xr5 o;

    public wr5(ypb ypb) {
        this.a = ypb;
    }

    public final void b() {
        this.o.cancel();
        this.o.t0.b();
    }

    public final void cancel() {
        zae.a(this.b);
    }

    public final void e(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.b.get() != zae.a) {
                ((wq5) this.a).d(this.o);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public final void f(xae xae) {
        AtomicReference atomicReference = this.b;
        AtomicLong atomicLong = this.c;
        if (zae.c(atomicReference, xae)) {
            long andSet = atomicLong.getAndSet(0);
            if (andSet != 0) {
                xae.j(andSet);
            }
        }
    }

    public final void j(long j) {
        zae.b(this.b, this.c, j);
    }

    public final void onError(Throwable th) {
        this.o.cancel();
        this.o.t0.onError(th);
    }
}
