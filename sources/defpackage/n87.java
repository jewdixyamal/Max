package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: n87  reason: default package */
public final class n87 {
    public final Executor a;
    public final m87 b;
    public final l87 c = new l87(this, 0);
    public final l87 d = new l87(this, 1);
    public g05 e = null;
    public int f = 0;
    public int g = 1;
    public long h = 0;
    public long i = 0;

    public n87(Executor executor, m87 m87) {
        this.a = executor;
        this.b = m87;
    }

    public static boolean d(g05 g05, int i2) {
        return fi0.a(i2) || fi0.l(i2, 4) || g05.m0(g05);
    }

    public final void a(long j) {
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        l87 l87 = this.d;
        if (i2 > 0) {
            if (tfg.f == null) {
                tfg.f = Executors.newSingleThreadScheduledExecutor();
            }
            tfg.f.schedule(l87, j, TimeUnit.MILLISECONDS);
            return;
        }
        l87.run();
    }

    public final void b() {
        boolean z;
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                z = true;
                if (this.g == 4) {
                    j = Math.max(this.i + ((long) 100), uptimeMillis);
                    this.h = uptimeMillis;
                    this.g = 2;
                } else {
                    this.g = 1;
                    j = 0;
                    z = false;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z) {
            a(j - uptimeMillis);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        a(r3 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r8 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            monitor-enter(r8)
            g05 r2 = r8.e     // Catch:{ all -> 0x0011 }
            int r3 = r8.f     // Catch:{ all -> 0x0011 }
            boolean r2 = d(r2, r3)     // Catch:{ all -> 0x0011 }
            if (r2 != 0) goto L_0x0013
            monitor-exit(r8)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r0 = move-exception
            goto L_0x003e
        L_0x0013:
            int r2 = r8.g     // Catch:{ all -> 0x0011 }
            int r2 = defpackage.au1.s(r2)     // Catch:{ all -> 0x0011 }
            r3 = 2
            if (r2 == 0) goto L_0x0026
            if (r2 == r3) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            r2 = 4
            r8.g = r2     // Catch:{ all -> 0x0011 }
        L_0x0022:
            r2 = 0
            r3 = 0
            goto L_0x0036
        L_0x0026:
            long r4 = r8.i     // Catch:{ all -> 0x0011 }
            r2 = 100
            long r6 = (long) r2     // Catch:{ all -> 0x0011 }
            long r4 = r4 + r6
            long r4 = java.lang.Math.max(r4, r0)     // Catch:{ all -> 0x0011 }
            r8.h = r0     // Catch:{ all -> 0x0011 }
            r8.g = r3     // Catch:{ all -> 0x0011 }
            r2 = 1
            r3 = r4
        L_0x0036:
            monitor-exit(r8)     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x003d
            long r3 = r3 - r0
            r8.a(r3)
        L_0x003d:
            return
        L_0x003e:
            monitor-exit(r8)     // Catch:{ all -> 0x0011 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n87.c():void");
    }

    public final boolean e(g05 g05, int i2) {
        g05 g052;
        if (!d(g05, i2)) {
            return false;
        }
        synchronized (this) {
            g052 = this.e;
            this.e = g05.a(g05);
            this.f = i2;
        }
        g05.d(g052);
        return true;
    }
}
