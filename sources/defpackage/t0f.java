package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: t0f  reason: default package */
public final class t0f extends xtc {
    public final PriorityBlockingQueue a = new PriorityBlockingQueue();
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicInteger c = new AtomicInteger();
    public volatile boolean o;

    public final zl4 b(Runnable runnable) {
        return e(runnable, xtc.a(TimeUnit.MILLISECONDS));
    }

    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j) + xtc.a(TimeUnit.MILLISECONDS);
        return e(new i0e(runnable, this, millis), millis);
    }

    public final zl4 e(Runnable runnable, long j) {
        boolean z = this.o;
        iz4 iz4 = iz4.a;
        if (z) {
            return iz4;
        }
        s0f s0f = new s0f(runnable, Long.valueOf(j), this.c.incrementAndGet());
        this.a.add(s0f);
        if (this.b.getAndIncrement() != 0) {
            return new w6(1, new i76((Object) this, (Object) s0f, false, 25));
        }
        int i = 1;
        while (!this.o) {
            s0f s0f2 = (s0f) this.a.poll();
            if (s0f2 == null) {
                i = this.b.addAndGet(-i);
                if (i == 0) {
                    return iz4;
                }
            } else if (!s0f2.o) {
                s0f2.a.run();
            }
        }
        this.a.clear();
        return iz4;
    }

    public final void g() {
        this.o = true;
    }

    public final boolean h() {
        return this.o;
    }
}
