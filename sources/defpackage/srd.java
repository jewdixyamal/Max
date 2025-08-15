package defpackage;

import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: srd  reason: default package */
public final class srd extends xtc {
    public final ScheduledExecutorService a;
    public final hc3 b = new Object();
    public volatile boolean c;

    /* JADX WARNING: type inference failed for: r1v1, types: [hc3, java.lang.Object] */
    public srd(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        boolean z = this.c;
        iz4 iz4 = iz4.a;
        if (z) {
            return iz4;
        }
        Objects.requireNonNull(runnable, "run is null");
        dtc dtc = new dtc(runnable, this.b);
        this.b.a(dtc);
        if (j <= 0) {
            try {
                future = this.a.submit(dtc);
            } catch (RejectedExecutionException e) {
                g();
                j47.Z(e);
                return iz4;
            }
        } else {
            future = this.a.schedule(dtc, j, timeUnit);
        }
        dtc.a(future);
        return dtc;
    }

    public final void g() {
        if (!this.c) {
            this.c = true;
            this.b.g();
        }
    }

    public final boolean h() {
        return this.c;
    }
}
