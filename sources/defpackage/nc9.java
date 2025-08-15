package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: nc9  reason: default package */
public final class nc9 extends j47 implements ScheduledFuture, bm7, Future {
    public final bm7 w0;
    public final ScheduledFuture x0;

    public nc9(k1 k1Var, ScheduledFuture scheduledFuture) {
        super(10);
        this.w0 = k1Var;
        this.x0 = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean u0 = u0(z);
        if (u0) {
            this.x0.cancel(z);
        }
        return u0;
    }

    public final int compareTo(Object obj) {
        return this.x0.compareTo((Delayed) obj);
    }

    public final void d(Runnable runnable, Executor executor) {
        this.w0.d(runnable, executor);
    }

    public final Object get() {
        return this.w0.get();
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.x0.getDelay(timeUnit);
    }

    public final boolean isCancelled() {
        return this.w0.isCancelled();
    }

    public final boolean isDone() {
        return this.w0.isDone();
    }

    public final boolean u0(boolean z) {
        return this.w0.cancel(z);
    }

    public final Object z() {
        return this.w0;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.w0.get(j, timeUnit);
    }
}
