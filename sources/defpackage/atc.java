package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: atc  reason: default package */
public final class atc extends m55 implements ScheduledExecutorService {
    public final ScheduledExecutorService w0;

    public atc(ScheduledExecutorService scheduledExecutorService, hba hba, q12 q12) {
        super(scheduledExecutorService, hba, q12);
        this.w0 = scheduledExecutorService;
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.w0.schedule(i(runnable, b()), j, timeUnit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.w0.scheduleAtFixedRate(i(runnable, b()), j, j2, timeUnit);
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.w0.scheduleAtFixedRate(i(runnable, b()), j, j2, timeUnit);
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.w0.schedule(h(callable, b()), j, timeUnit);
    }
}
