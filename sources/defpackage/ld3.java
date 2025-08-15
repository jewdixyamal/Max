package defpackage;

import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ld3  reason: default package */
public final class ld3 extends ztc {
    public static final jd3 d;
    public static final zpc e;
    public static final int f;
    public static final kd3 g;
    public final AtomicReference c;

    /* JADX WARNING: type inference failed for: r0v3, types: [zp9, kd3] */
    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f = availableProcessors;
        ? zp9 = new zp9(new zpc("RxComputationShutdown"));
        g = zp9;
        zp9.g();
        zpc zpc = new zpc("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        e = zpc;
        jd3 jd3 = new jd3(0, zpc);
        d = jd3;
        for (kd3 g2 : jd3.b) {
            g2.g();
        }
    }

    public ld3() {
        AtomicReference atomicReference;
        jd3 jd3 = d;
        this.c = new AtomicReference(jd3);
        jd3 jd32 = new jd3(f, e);
        do {
            atomicReference = this.c;
            if (atomicReference.compareAndSet(jd3, jd32)) {
                return;
            }
        } while (atomicReference.get() == jd3);
        for (kd3 g2 : jd32.b) {
            g2.g();
        }
    }

    public final xtc a() {
        return new id3(((jd3) this.c.get()).a());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [zl4, h0, java.util.concurrent.Callable] */
    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        kd3 a = ((jd3) this.c.get()).a();
        a.getClass();
        Objects.requireNonNull(runnable, "run is null");
        ? h0Var = new h0(runnable, true);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = a.a;
        if (i <= 0) {
            try {
                future = scheduledThreadPoolExecutor.submit(h0Var);
            } catch (RejectedExecutionException e2) {
                j47.Z(e2);
                return iz4.a;
            }
        } else {
            future = scheduledThreadPoolExecutor.schedule(h0Var, j, timeUnit);
        }
        h0Var.a(future);
        return h0Var;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Runnable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.zl4 d(java.lang.Runnable r11, long r12, long r14, java.util.concurrent.TimeUnit r16) {
        /*
            r10 = this;
            r0 = r11
            r2 = r12
            r1 = r10
            java.util.concurrent.atomic.AtomicReference r1 = r1.c
            java.lang.Object r1 = r1.get()
            jd3 r1 = (defpackage.jd3) r1
            kd3 r1 = r1.a()
            r1.getClass()
            java.lang.String r4 = "run is null"
            java.util.Objects.requireNonNull(r11, r4)
            r4 = 0
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            iz4 r7 = defpackage.iz4.a
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.a
            if (r6 > 0) goto L_0x003f
            d37 r6 = new d37
            r6.<init>(r11, r1)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x002f
            java.util.concurrent.Future r0 = r1.submit(r6)     // Catch:{ RejectedExecutionException -> 0x003a }
            goto L_0x0035
        L_0x002f:
            r8 = r16
            java.util.concurrent.ScheduledFuture r0 = r1.schedule(r6, r12, r8)     // Catch:{ RejectedExecutionException -> 0x003a }
        L_0x0035:
            r6.a(r0)     // Catch:{ RejectedExecutionException -> 0x003a }
            r7 = r6
            goto L_0x005a
        L_0x003a:
            r0 = move-exception
            defpackage.j47.Z(r0)
            goto L_0x005a
        L_0x003f:
            r8 = r16
            ysc r9 = new ysc
            r4 = 1
            r9.<init>(r11, r4)
            r0 = r1
            r1 = r9
            r2 = r12
            r4 = r14
            r6 = r16
            java.util.concurrent.ScheduledFuture r0 = r0.scheduleAtFixedRate(r1, r2, r4, r6)     // Catch:{ RejectedExecutionException -> 0x0056 }
            r9.a(r0)     // Catch:{ RejectedExecutionException -> 0x0056 }
            r7 = r9
            goto L_0x005a
        L_0x0056:
            r0 = move-exception
            defpackage.j47.Z(r0)
        L_0x005a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld3.d(java.lang.Runnable, long, long, java.util.concurrent.TimeUnit):zl4");
    }
}
