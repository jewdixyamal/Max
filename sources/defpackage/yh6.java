package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yh6  reason: default package */
public final class yh6 implements RunnableScheduledFuture {
    public final AtomicReference a = new AtomicReference((Object) null);
    public final long b;
    public final Callable c;
    public final oq1 o;

    public yh6(Handler handler, long j, Callable callable) {
        this.b = j;
        this.c = callable;
        this.o = f8.g(new vq7(7, this, handler, callable, false));
    }

    public final boolean cancel(boolean z) {
        return this.o.cancel(z);
    }

    public final int compareTo(Object obj) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), ((Delayed) obj).getDelay(timeUnit));
    }

    public final Object get() {
        return this.o.b.get();
    }

    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public final boolean isCancelled() {
        return this.o.isCancelled();
    }

    public final boolean isDone() {
        return this.o.b.isDone();
    }

    public final boolean isPeriodic() {
        return false;
    }

    public final void run() {
        lq1 lq1 = (lq1) this.a.getAndSet((Object) null);
        if (lq1 != null) {
            try {
                lq1.b(this.c.call());
            } catch (Exception e) {
                lq1.d(e);
            }
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.o.b.get(j, timeUnit);
    }
}
