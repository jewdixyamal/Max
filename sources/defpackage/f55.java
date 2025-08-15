package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: f55  reason: default package */
public final class f55 extends ztc {
    public final boolean c;
    public final boolean d = false;
    public final Executor e;

    public f55(Executor executor, boolean z) {
        this.e = executor;
        this.c = z;
    }

    public final xtc a() {
        return new d55(this.e, this.c, this.d);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [zl4, h0, java.util.concurrent.Callable] */
    public final zl4 b(Runnable runnable) {
        Executor executor = this.e;
        Objects.requireNonNull(runnable, "run is null");
        try {
            boolean z = executor instanceof ExecutorService;
            boolean z2 = this.c;
            if (z) {
                ? h0Var = new h0(runnable, z2);
                h0Var.a(((ExecutorService) executor).submit(h0Var));
                return h0Var;
            } else if (z2) {
                c55 c55 = new c55(runnable, (am4) null);
                executor.execute(c55);
                return c55;
            } else {
                b55 b55 = new b55(runnable);
                executor.execute(b55);
                return b55;
            }
        } catch (RejectedExecutionException e2) {
            j47.Z(e2);
            return iz4.a;
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [zl4, h0, java.util.concurrent.Callable] */
    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        Executor executor = this.e;
        if (executor instanceof ScheduledExecutorService) {
            try {
                ? h0Var = new h0(runnable, this.c);
                h0Var.a(((ScheduledExecutorService) executor).schedule(h0Var, j, timeUnit));
                return h0Var;
            } catch (RejectedExecutionException e2) {
                j47.Z(e2);
                return iz4.a;
            }
        } else {
            a55 a55 = new a55(runnable);
            zl4 c2 = e55.a.c(new h76((Object) this, (Object) a55, false, 6), j, timeUnit);
            uy1 uy1 = a55.a;
            uy1.getClass();
            dm4.c(uy1, c2);
            return a55;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Runnable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.zl4 d(java.lang.Runnable r10, long r11, long r13, java.util.concurrent.TimeUnit r15) {
        /*
            r9 = this;
            java.util.concurrent.Executor r0 = r9.e
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            if (r1 == 0) goto L_0x0028
            java.lang.String r1 = "run is null"
            java.util.Objects.requireNonNull(r10, r1)
            ysc r1 = new ysc     // Catch:{ RejectedExecutionException -> 0x0021 }
            boolean r9 = r9.c     // Catch:{ RejectedExecutionException -> 0x0021 }
            r1.<init>(r10, r9)     // Catch:{ RejectedExecutionException -> 0x0021 }
            r2 = r0
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2     // Catch:{ RejectedExecutionException -> 0x0021 }
            r3 = r1
            r4 = r11
            r6 = r13
            r8 = r15
            java.util.concurrent.ScheduledFuture r9 = r2.scheduleAtFixedRate(r3, r4, r6, r8)     // Catch:{ RejectedExecutionException -> 0x0021 }
            r1.a(r9)     // Catch:{ RejectedExecutionException -> 0x0021 }
            return r1
        L_0x0021:
            r9 = move-exception
            defpackage.j47.Z(r9)
            iz4 r9 = defpackage.iz4.a
            return r9
        L_0x0028:
            zl4 r9 = super.d(r10, r11, r13, r15)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f55.d(java.lang.Runnable, long, long, java.util.concurrent.TimeUnit):zl4");
    }
}
