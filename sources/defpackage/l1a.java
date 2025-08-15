package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: l1a  reason: default package */
public final class l1a extends n1a {
    public final AtomicInteger s0 = new AtomicInteger(1);

    public l1a(y6d y6d, long j, TimeUnit timeUnit, ztc ztc) {
        super(y6d, j, timeUnit, ztc);
    }

    public final void a() {
        d();
        if (this.s0.decrementAndGet() == 0) {
            this.a.b();
        }
    }

    public final void run() {
        AtomicInteger atomicInteger = this.s0;
        if (atomicInteger.incrementAndGet() == 2) {
            d();
            if (atomicInteger.decrementAndGet() == 0) {
                this.a.b();
            }
        }
    }
}
