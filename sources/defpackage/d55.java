package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d55  reason: default package */
public final class d55 extends xtc implements Runnable {
    public volatile boolean X;
    public final AtomicInteger Y = new AtomicInteger();
    public final hc3 Z = new Object();
    public final boolean a;
    public final boolean b;
    public final Executor c;
    public final qz7 o;

    /* JADX WARNING: type inference failed for: r0v1, types: [hc3, java.lang.Object] */
    public d55(Executor executor, boolean z, boolean z2) {
        this.c = executor;
        this.o = new qz7(27);
        this.a = z;
        this.b = z2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [le9, java.lang.Object, java.util.concurrent.atomic.AtomicReference] */
    public final zl4 b(Runnable runnable) {
        zl4 zl4;
        boolean z = this.X;
        iz4 iz4 = iz4.a;
        if (z) {
            return iz4;
        }
        Objects.requireNonNull(runnable, "run is null");
        if (this.a) {
            zl4 = new c55(runnable, this.Z);
            this.Z.a(zl4);
        } else {
            zl4 = new b55(runnable);
        }
        qz7 qz7 = this.o;
        qz7.getClass();
        ? atomicReference = new AtomicReference();
        atomicReference.a = zl4;
        ((le9) ((AtomicReference) qz7.b).getAndSet(atomicReference)).lazySet(atomicReference);
        if (this.Y.getAndIncrement() == 0) {
            try {
                this.c.execute(this);
            } catch (RejectedExecutionException e) {
                this.X = true;
                this.o.clear();
                j47.Z(e);
                return iz4;
            }
        }
        return zl4;
    }

    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return b(runnable);
        }
        boolean z = this.X;
        iz4 iz4 = iz4.a;
        if (z) {
            return iz4;
        }
        uy1 uy1 = new uy1(2);
        uy1 uy12 = new uy1(uy1);
        Objects.requireNonNull(runnable, "run is null");
        dtc dtc = new dtc(new wi3(1, this, uy12, runnable, false), this.Z);
        this.Z.a(dtc);
        Executor executor = this.c;
        if (executor instanceof ScheduledExecutorService) {
            try {
                dtc.a(((ScheduledExecutorService) executor).schedule(dtc, j, timeUnit));
            } catch (RejectedExecutionException e) {
                this.X = true;
                j47.Z(e);
                return iz4;
            }
        } else {
            dtc.a(new fm4(e55.a.c(dtc, j, timeUnit)));
        }
        dm4.c(uy1, dtc);
        return uy12;
    }

    public final void g() {
        if (!this.X) {
            this.X = true;
            this.Z.g();
            if (this.Y.getAndIncrement() == 0) {
                this.o.clear();
            }
        }
    }

    public final boolean h() {
        return this.X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r3.X == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r1 = r3.Y.addAndGet(-r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r1 != 0) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            boolean r0 = r3.b
            if (r0 == 0) goto L_0x002d
            qz7 r0 = r3.o
            boolean r1 = r3.X
            if (r1 == 0) goto L_0x000e
            r0.clear()
            goto L_0x005c
        L_0x000e:
            java.lang.Object r1 = r0.poll()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            boolean r1 = r3.X
            if (r1 == 0) goto L_0x001f
            r0.clear()
            goto L_0x005c
        L_0x001f:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.Y
            int r0 = r0.decrementAndGet()
            if (r0 == 0) goto L_0x005c
            java.util.concurrent.Executor r0 = r3.c
            r0.execute(r3)
            goto L_0x005c
        L_0x002d:
            qz7 r0 = r3.o
            r1 = 1
        L_0x0030:
            boolean r2 = r3.X
            if (r2 == 0) goto L_0x0038
            r0.clear()
            goto L_0x005c
        L_0x0038:
            java.lang.Object r2 = r0.poll()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 != 0) goto L_0x0052
            boolean r2 = r3.X
            if (r2 == 0) goto L_0x0048
            r0.clear()
            goto L_0x005c
        L_0x0048:
            java.util.concurrent.atomic.AtomicInteger r2 = r3.Y
            int r1 = -r1
            int r1 = r2.addAndGet(r1)
            if (r1 != 0) goto L_0x0030
            goto L_0x005c
        L_0x0052:
            r2.run()
            boolean r2 = r3.X
            if (r2 == 0) goto L_0x0038
            r0.clear()
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d55.run():void");
    }
}
