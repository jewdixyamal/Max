package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: a46  reason: default package */
public final class a46 implements ExecutorService {
    public final ExecutorService a;
    public final je7 b = tu0.r(3, new fh5(11));

    public a46(ExecutorService executorService) {
        this.a = executorService;
    }

    public final boolean a() {
        return Thread.currentThread() == ((Thread) this.b.getValue());
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
            return;
        }
        this.a.execute(new i40(runnable, 1));
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

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final Future submit(Runnable runnable) {
        if (a()) {
            runnable.run();
            return CompletableFuture.completedFuture(e5f.a);
        }
        return this.a.submit(new i40(runnable, 3));
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, j, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        if (a()) {
            runnable.run();
            return CompletableFuture.completedFuture(obj);
        }
        return this.a.submit(new i40(runnable, 2), obj);
    }

    public final Future submit(Callable callable) {
        if (a()) {
            return CompletableFuture.completedFuture(callable.call());
        }
        return this.a.submit(new l5(5, callable));
    }
}
