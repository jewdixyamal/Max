package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: u0f  reason: default package */
public final class u0f extends ztc {
    public static final u0f c = new Object();

    public final xtc a() {
        return new t0f();
    }

    public final zl4 b(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        runnable.run();
        return iz4.a;
    }

    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            Objects.requireNonNull(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            j47.Z(e);
        }
        return iz4.a;
    }
}
