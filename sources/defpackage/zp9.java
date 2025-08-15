package defpackage;

import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: zp9  reason: default package */
public class zp9 extends xtc {
    public final ScheduledThreadPoolExecutor a;
    public volatile boolean b;

    public zp9(ThreadFactory threadFactory) {
        boolean z = guc.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(guc.a);
        this.a = scheduledThreadPoolExecutor;
    }

    public final zl4 b(Runnable runnable) {
        return c(runnable, 0, (TimeUnit) null);
    }

    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b ? iz4.a : e(runnable, j, timeUnit, (am4) null);
    }

    public final dtc e(Runnable runnable, long j, TimeUnit timeUnit, am4 am4) {
        Future future;
        Objects.requireNonNull(runnable, "run is null");
        dtc dtc = new dtc(runnable, am4);
        if (am4 != null && !am4.a(dtc)) {
            return dtc;
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        if (i <= 0) {
            try {
                future = scheduledThreadPoolExecutor.submit(dtc);
            } catch (RejectedExecutionException e) {
                if (am4 != null) {
                    am4.b(dtc);
                }
                j47.Z(e);
            }
        } else {
            future = scheduledThreadPoolExecutor.schedule(dtc, j, timeUnit);
        }
        dtc.a(future);
        return dtc;
    }

    public final void g() {
        if (!this.b) {
            this.b = true;
            this.a.shutdownNow();
        }
    }

    public final boolean h() {
        return this.b;
    }
}
