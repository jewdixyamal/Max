package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: pc9  reason: default package */
public final class pc9 extends mc9 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public pc9(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        e3f e3f = new e3f(callable);
        return new nc9(e3f, this.b.schedule(e3f, j, timeUnit));
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        oc9 oc9 = new oc9(runnable);
        return new nc9(oc9, this.b.scheduleAtFixedRate(oc9, j, j2, timeUnit));
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        oc9 oc9 = new oc9(runnable);
        return new nc9(oc9, this.b.scheduleWithFixedDelay(oc9, j, j2, timeUnit));
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        e3f e3f = new e3f(Executors.callable(runnable, (Object) null));
        return new nc9(e3f, this.b.schedule(e3f, j, timeUnit));
    }
}
