package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: u67  reason: default package */
public final class u67 extends ztc {
    public static final zpc d;
    public static final zpc e;
    public static final long f = Long.getLong("rx3.io-keep-alive-time", 60).longValue();
    public static final TimeUnit g = TimeUnit.SECONDS;
    public static final t67 h;
    public static final boolean i = Boolean.getBoolean("rx3.io-scheduled-release");
    public static final r67 j;
    public final AtomicReference c;

    static {
        t67 t67 = new t67(new zpc("RxCachedThreadSchedulerShutdown"));
        h = t67;
        t67.g();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        zpc zpc = new zpc("RxCachedThreadScheduler", max, false);
        d = zpc;
        e = new zpc("RxCachedWorkerPoolEvictor", max, false);
        r67 r67 = new r67(0, (TimeUnit) null, zpc);
        j = r67;
        r67.c.g();
        ScheduledFuture scheduledFuture = r67.X;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = r67.o;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public u67() {
        AtomicReference atomicReference;
        r67 r67 = j;
        this.c = new AtomicReference(r67);
        r67 r672 = new r67(f, g, d);
        do {
            atomicReference = this.c;
            if (atomicReference.compareAndSet(r67, r672)) {
                return;
            }
        } while (atomicReference.get() == r67);
        r672.c.g();
        ScheduledFuture scheduledFuture = r672.X;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = r672.o;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public final xtc a() {
        return new s67((r67) this.c.get());
    }
}
