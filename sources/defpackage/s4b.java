package defpackage;

import android.os.Looper;

/* renamed from: s4b  reason: default package */
public final class s4b {
    public final q4b a;
    public final o4b b;
    public final she c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public s4b(o4b o4b, vj0 vj0, mue mue, int i2, she she, Looper looper) {
        this.b = o4b;
        this.a = vj0;
        this.f = looper;
        this.c = she;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046 A[SYNTHETIC, Splitter:B:17:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.g     // Catch:{ all -> 0x0040 }
            defpackage.fm9.k(r0)     // Catch:{ all -> 0x0040 }
            android.os.Looper r0 = r5.f     // Catch:{ all -> 0x0040 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0040 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0040 }
            if (r0 == r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            defpackage.fm9.k(r0)     // Catch:{ all -> 0x0040 }
            she r0 = r5.c     // Catch:{ all -> 0x0040 }
            r0.getClass()     // Catch:{ all -> 0x0040 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0040 }
            long r0 = r0 + r6
        L_0x0022:
            boolean r2 = r5.i     // Catch:{ all -> 0x0040 }
            if (r2 != 0) goto L_0x0042
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0042
            she r2 = r5.c     // Catch:{ all -> 0x0040 }
            r2.getClass()     // Catch:{ all -> 0x0040 }
            r5.wait(r6)     // Catch:{ all -> 0x0040 }
            she r6 = r5.c     // Catch:{ all -> 0x0040 }
            r6.getClass()     // Catch:{ all -> 0x0040 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0040 }
            long r6 = r0 - r6
            goto L_0x0022
        L_0x0040:
            r6 = move-exception
            goto L_0x004e
        L_0x0042:
            if (r2 == 0) goto L_0x0046
            monitor-exit(r5)
            return
        L_0x0046:
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0040 }
            java.lang.String r7 = "Message delivery timed out."
            r6.<init>(r7)     // Catch:{ all -> 0x0040 }
            throw r6     // Catch:{ all -> 0x0040 }
        L_0x004e:
            monitor-exit(r5)     // Catch:{ all -> 0x0040 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s4b.a(long):void");
    }

    public final synchronized void b(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    public final void c() {
        fm9.k(!this.g);
        this.g = true;
        g85 g85 = (g85) this.b;
        synchronized (g85) {
            if (!g85.L0) {
                if (g85.u0.getThread().isAlive()) {
                    g85.s0.a(14, this).b();
                    return;
                }
            }
            z04.c0("Ignoring messages sent after release.");
            b(false);
        }
    }
}
