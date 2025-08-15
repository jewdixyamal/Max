package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: j87  reason: default package */
public final class j87 implements bm7 {
    public final dcd a = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [dcd, java.lang.Object] */
    public j87(y77 y77) {
        y77.invokeOnCompletion(new c0(2, this));
    }

    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    public final void d(Runnable runnable, Executor executor) {
        this.a.d(runnable, executor);
    }

    public final Object get() {
        return this.a.get();
    }

    public final boolean isCancelled() {
        return this.a.a instanceof r0;
    }

    public final boolean isDone() {
        return this.a.isDone();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
