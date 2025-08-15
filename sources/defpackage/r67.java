package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: r67  reason: default package */
public final class r67 implements Runnable {
    public final ScheduledFuture X;
    public final ThreadFactory Y;
    public final long a;
    public final ConcurrentLinkedQueue b;
    public final hc3 c;
    public final ScheduledExecutorService o;

    /* JADX WARNING: type inference failed for: r8v4, types: [hc3, java.lang.Object] */
    public r67(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        ScheduledFuture<?> scheduledFuture;
        ScheduledExecutorService scheduledExecutorService;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0;
        this.a = nanos;
        this.b = new ConcurrentLinkedQueue();
        this.c = new Object();
        this.Y = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, u67.e);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            scheduledExecutorService = null;
            scheduledFuture = null;
        }
        this.o = scheduledExecutorService;
        this.X = scheduledFuture;
    }

    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
        if (!concurrentLinkedQueue.isEmpty()) {
            long nanoTime = System.nanoTime();
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                t67 t67 = (t67) it.next();
                if (t67.c > nanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(t67)) {
                    this.c.b(t67);
                }
            }
        }
    }
}
