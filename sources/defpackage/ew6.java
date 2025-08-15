package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ew6  reason: default package */
public final class ew6 implements bm7 {
    public static final ew6 b = new ew6((Object) null);
    public static final jt3 c = new jt3(ew6.class);
    public final Object a;

    public ew6(Object obj) {
        this.a = obj;
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final void d(Runnable runnable, Executor executor) {
        z04.l(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger e2 = c.e();
            Level level = Level.SEVERE;
            e2.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    public final Object get() {
        return this.a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.a + "]]";
    }

    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a;
    }
}
