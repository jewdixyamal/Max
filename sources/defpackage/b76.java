package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: b76  reason: default package */
public class b76 implements bm7 {
    public final bm7 a;
    public lq1 b;

    public b76(bm7 bm7) {
        bm7.getClass();
        this.a = bm7;
    }

    public static b76 a(bm7 bm7) {
        return bm7 instanceof b76 ? (b76) bm7 : new b76(bm7);
    }

    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    public final void d(Runnable runnable, Executor executor) {
        this.a.d(runnable, executor);
    }

    public Object get() {
        return this.a.get();
    }

    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    public final boolean isDone() {
        return this.a.isDone();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }

    public b76() {
        this.a = f8.g(new wd6(16, (Object) this));
    }
}
