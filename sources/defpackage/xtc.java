package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: xtc  reason: default package */
public abstract class xtc implements zl4 {
    public static long a(TimeUnit timeUnit) {
        return !ztc.a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public zl4 b(Runnable runnable) {
        return c(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public abstract zl4 c(Runnable runnable, long j, TimeUnit timeUnit);

    public final zl4 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        long j3 = j;
        TimeUnit timeUnit2 = timeUnit;
        uy1 uy1 = new uy1(2);
        uy1 uy12 = new uy1(uy1);
        long nanos = timeUnit2.toNanos(j2);
        long a = a(TimeUnit.NANOSECONDS);
        zl4 c = c(new wtc(this, timeUnit2.toNanos(j3) + a, runnable, a, uy12, nanos), j3, timeUnit2);
        if (c == iz4.a) {
            return c;
        }
        dm4.c(uy1, c);
        return uy12;
    }
}
