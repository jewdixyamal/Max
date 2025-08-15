package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ConcurrentKt;

/* renamed from: z45  reason: default package */
public final class z45 extends y45 implements hg4 {
    public final Executor a;

    public z45(Executor executor) {
        this.a = executor;
        ConcurrentKt.removeFutureOnCancel(executor);
    }

    public final void close() {
        Executor executor = this.a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final Object delay(long j, Continuation continuation) {
        return c37.j(this, j, continuation);
    }

    public final void dispatch(lx3 lx3, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            x77 x77 = (x77) lx3.get(c32.X);
            if (x77 != null) {
                x77.cancel(cancellationException);
            }
            ql4.c.dispatch(lx3, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z45) && ((z45) obj).a == this.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final cm4 invokeOnTimeout(long j, Runnable runnable, lx3 lx3) {
        Executor executor = this.a;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                x77 x77 = (x77) lx3.get(c32.X);
                if (x77 != null) {
                    x77.cancel(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new bm4(scheduledFuture) : pa4.s0.invokeOnTimeout(j, runnable, lx3);
    }

    public final Executor n() {
        return this.a;
    }

    public final void scheduleResumeAfterDelay(long j, ry1 ry1) {
        Executor executor = this.a;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            i76 i76 = new i76((Object) this, 17, (Object) ry1);
            lx3 context = ry1.getContext();
            try {
                scheduledFuture = scheduledExecutorService.schedule(i76, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                x77 x77 = (x77) context.get(c32.X);
                if (x77 != null) {
                    x77.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            nu0.w(ry1, new hy1(0, scheduledFuture));
        } else {
            pa4.s0.scheduleResumeAfterDelay(j, ry1);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
