package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: oq1  reason: default package */
public final class oq1 implements bm7 {
    public final WeakReference a;
    public final nq1 b = new nq1(this);

    public oq1(lq1 lq1) {
        this.a = new WeakReference(lq1);
    }

    public final boolean cancel(boolean z) {
        lq1 lq1 = (lq1) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (cancel && lq1 != null) {
            lq1.a = null;
            lq1.b = null;
            lq1.c.i((Object) null);
        }
        return cancel;
    }

    public final void d(Runnable runnable, Executor executor) {
        this.b.d(runnable, executor);
    }

    public final Object get() {
        return this.b.get();
    }

    public final boolean isCancelled() {
        return this.b.a instanceof g3;
    }

    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
