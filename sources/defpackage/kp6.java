package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: kp6  reason: default package */
public final class kp6 implements Closeable {
    public static final ded M0;
    public long A0;
    public long B0;
    public final ded C0;
    public ded D0;
    public long E0;
    public long F0;
    public long G0;
    public long H0;
    public final Socket I0;
    public final sp6 J0;
    public final cc1 K0;
    public final LinkedHashSet L0;
    public int X;
    public int Y;
    public boolean Z;
    public final boolean a = true;
    public final cp6 b;
    public final LinkedHashMap c;
    public final String o;
    public final foe s0;
    public final coe t0;
    public final coe u0;
    public final coe v0;
    public final hx9 w0;
    public long x0;
    public long y0;
    public long z0;

    static {
        ded ded = new ded();
        ded.b(7, 65535);
        ded.b(5, 16384);
        M0 = ded;
    }

    public kp6(gb0 gb0) {
        this.b = (cp6) gb0.f;
        this.c = new LinkedHashMap();
        String str = (String) gb0.a;
        this.o = str;
        this.Y = 3;
        foe foe = (foe) gb0.g;
        this.s0 = foe;
        coe f = foe.f();
        this.t0 = f;
        this.u0 = foe.f();
        this.v0 = foe.f();
        this.w0 = hx9.t0;
        ded ded = new ded();
        ded.b(7, 16777216);
        this.C0 = ded;
        ded ded2 = M0;
        this.D0 = ded2;
        this.H0 = (long) ded2.a();
        this.I0 = (Socket) gb0.c;
        this.J0 = new sp6((eu0) gb0.e, true);
        this.K0 = new cc1(this, new np6((fu0) gb0.d, true));
        this.L0 = new LinkedHashSet();
        int i = gb0.b;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
            f.c(new ap6(au1.g(str, " ping"), this, nanos), nanos);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.J0.b);
        r6 = (long) r2;
        r8.G0 += r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        throw r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S(int r9, boolean r10, defpackage.bt0 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            sp6 r8 = r8.J0
            r8.d(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0068
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.G0     // Catch:{ InterruptedException -> 0x0059 }
            long r6 = r8.H0     // Catch:{ InterruptedException -> 0x0059 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0034
            java.util.LinkedHashMap r2 = r8.c     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0059 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0059 }
            if (r2 == 0) goto L_0x002c
            r8.wait()     // Catch:{ InterruptedException -> 0x0059 }
            goto L_0x0012
        L_0x002a:
            r9 = move-exception
            goto L_0x0066
        L_0x002c:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0059 }
            throw r9     // Catch:{ InterruptedException -> 0x0059 }
        L_0x0034:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x002a }
            int r2 = (int) r4     // Catch:{ all -> 0x002a }
            sp6 r4 = r8.J0     // Catch:{ all -> 0x002a }
            int r4 = r4.b     // Catch:{ all -> 0x002a }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x002a }
            long r4 = r8.G0     // Catch:{ all -> 0x002a }
            long r6 = (long) r2     // Catch:{ all -> 0x002a }
            long r4 = r4 + r6
            r8.G0 = r4     // Catch:{ all -> 0x002a }
            monitor-exit(r8)
            long r12 = r12 - r6
            sp6 r4 = r8.J0
            if (r10 == 0) goto L_0x0054
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0054
            r5 = 1
            goto L_0x0055
        L_0x0054:
            r5 = r3
        L_0x0055:
            r4.d(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0059:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002a }
            r9.interrupt()     // Catch:{ all -> 0x002a }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x002a }
            r9.<init>()     // Catch:{ all -> 0x002a }
            throw r9     // Catch:{ all -> 0x002a }
        L_0x0066:
            monitor-exit(r8)
            throw r9
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp6.S(int, boolean, bt0, long):void");
    }

    public final void U(int i, int i2) {
        this.t0.c(new ep6(this.o + '[' + i + "] writeSynReset", this, i, i2, 1), 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|5|(2:18|(5:20|21|22|34|23))|25|26|27|28|29|31) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r4, int r5, java.io.IOException r6) {
        /*
            r3 = this;
            byte[] r0 = defpackage.naf.a
            r3.n(r4)     // Catch:{ IOException -> 0x0005 }
        L_0x0005:
            monitor-enter(r3)
            java.util.LinkedHashMap r4 = r3.c     // Catch:{ all -> 0x0027 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0027 }
            r4 = r4 ^ 1
            r0 = 0
            if (r4 == 0) goto L_0x0031
            java.util.LinkedHashMap r4 = r3.c     // Catch:{ all -> 0x0027 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0027 }
            rp6[] r1 = new defpackage.rp6[r0]     // Catch:{ all -> 0x0027 }
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x0029
            rp6[] r4 = (defpackage.rp6[]) r4     // Catch:{ all -> 0x0027 }
            java.util.LinkedHashMap r1 = r3.c     // Catch:{ all -> 0x0027 }
            r1.clear()     // Catch:{ all -> 0x0027 }
            goto L_0x0032
        L_0x0027:
            r4 = move-exception
            goto L_0x005a
        L_0x0029:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0027 }
            throw r4     // Catch:{ all -> 0x0027 }
        L_0x0031:
            r4 = 0
        L_0x0032:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0040
            int r1 = r4.length
        L_0x0036:
            if (r0 >= r1) goto L_0x0040
            r2 = r4[r0]
            r2.c(r5, r6)     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            int r0 = r0 + 1
            goto L_0x0036
        L_0x0040:
            sp6 r4 = r3.J0     // Catch:{ IOException -> 0x0045 }
            r4.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            java.net.Socket r4 = r3.I0     // Catch:{ IOException -> 0x004a }
            r4.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            coe r4 = r3.t0
            r4.e()
            coe r4 = r3.u0
            r4.e()
            coe r3 = r3.v0
            r3.e()
            return
        L_0x005a:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp6.a(int, int, java.io.IOException):void");
    }

    public final void close() {
        a(1, 9, (IOException) null);
    }

    public final void d(IOException iOException) {
        a(2, 2, iOException);
    }

    public final void e0(int i, long j) {
        this.t0.c(new jp6(this.o + '[' + i + "] windowUpdate", this, i, j), 0);
    }

    public final void flush() {
        this.J0.flush();
    }

    public final synchronized rp6 g(int i) {
        return (rp6) this.c.get(Integer.valueOf(i));
    }

    public final synchronized rp6 m(int i) {
        rp6 rp6;
        rp6 = (rp6) this.c.remove(Integer.valueOf(i));
        notifyAll();
        return rp6;
    }

    public final void n(int i) {
        synchronized (this.J0) {
            synchronized (this) {
                if (!this.Z) {
                    this.Z = true;
                    int i2 = this.X;
                    this.J0.m(i2, naf.a, i);
                }
            }
        }
    }

    public final synchronized void o(long j) {
        long j2 = this.E0 + j;
        this.E0 = j2;
        long j3 = j2 - this.F0;
        if (j3 >= ((long) (this.C0.a() / 2))) {
            e0(0, j3);
            this.F0 += j3;
        }
    }
}
