package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: ztc  reason: default package */
public abstract class ztc {
    public static final boolean a = Boolean.getBoolean("rx3.scheduler.use-nanotime");
    public static final long b;

    static {
        long longValue = Long.getLong("rx3.scheduler.drift-tolerance", 15).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        b = "seconds".equalsIgnoreCase(property) ? TimeUnit.SECONDS.toNanos(longValue) : "milliseconds".equalsIgnoreCase(property) ? TimeUnit.MILLISECONDS.toNanos(longValue) : TimeUnit.MINUTES.toNanos(longValue);
    }

    public abstract xtc a();

    public zl4 b(Runnable runnable) {
        return c(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        xtc a2 = a();
        Objects.requireNonNull(runnable, "run is null");
        vtc vtc = new vtc(runnable, a2);
        a2.c(vtc, j, timeUnit);
        return vtc;
    }

    public zl4 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        xtc a2 = a();
        Objects.requireNonNull(runnable, "run is null");
        bi6 bi6 = new bi6(runnable, a2);
        zl4 d = a2.d(bi6, j, j2, timeUnit);
        return d == iz4.a ? d : bi6;
    }
}
