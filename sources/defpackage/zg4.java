package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: zg4  reason: default package */
public final class zg4 implements ScheduledExecutorService, ExecutorService {
    public final ExecutorService a;
    public final je7 b;

    public zg4(ExecutorService executorService, je7 je7) {
        this.a = executorService;
        this.b = je7;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.a.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.a.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        tfa tfa = new tfa(callable, this.a);
        tfa.s0 = ((ScheduledExecutorService) this.b.getValue()).schedule(new sfa(tfa, 1), j, timeUnit);
        return tfa;
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        tfa tfa = new tfa(Executors.callable(runnable), this.a);
        tfa.s0 = ((ScheduledExecutorService) this.b.getValue()).scheduleWithFixedDelay(new sfa(tfa, 0), j, j2, timeUnit);
        return tfa;
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        tfa tfa = new tfa(Executors.callable(runnable), this.a);
        tfa.s0 = ((ScheduledExecutorService) this.b.getValue()).scheduleWithFixedDelay(new sfa(tfa, 0), j, j2, timeUnit);
        return tfa;
    }

    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final Future submit(Runnable runnable) {
        return this.a.submit(runnable);
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, j, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.a.submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return this.a.submit(callable);
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        tfa tfa = new tfa(Executors.callable(runnable), this.a);
        tfa.s0 = ((ScheduledExecutorService) this.b.getValue()).schedule(new sfa(tfa, 1), j, timeUnit);
        return tfa;
    }
}
