package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: rp6  reason: default package */
public final class rp6 {
    public long a;
    public long b;
    public long c;
    public long d;
    public final ArrayDeque e;
    public boolean f;
    public final pp6 g;
    public final op6 h;
    public final qp6 i = new qp6(0, this);
    public final qp6 j = new qp6(0, this);
    public int k;
    public IOException l;
    public final int m;
    public final kp6 n;

    public rp6(int i2, kp6 kp6, boolean z, boolean z2, cj6 cj6) {
        this.m = i2;
        this.n = kp6;
        this.d = (long) kp6.D0.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        this.g = new pp6(this, (long) kp6.C0.a(), z2);
        this.h = new op6(this, z);
        if (cj6 != null) {
            if (!h()) {
                arrayDeque.add(cj6);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!h()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z;
        boolean i2;
        byte[] bArr = naf.a;
        synchronized (this) {
            try {
                pp6 pp6 = this.g;
                if (!pp6.X && pp6.c) {
                    op6 op6 = this.h;
                    if (op6.c || op6.b) {
                        z = true;
                        i2 = i();
                    }
                }
                z = false;
                i2 = i();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, (IOException) null);
        } else if (!i2) {
            this.n.m(this.m);
        }
    }

    public final void b() {
        op6 op6 = this.h;
        if (op6.b) {
            throw new IOException("stream closed");
        } else if (op6.c) {
            throw new IOException("stream finished");
        } else if (this.k != 0) {
            Throwable th = this.l;
            if (th == null) {
                th = new StreamResetException(this.k);
            }
            throw th;
        }
    }

    public final void c(int i2, IOException iOException) {
        if (d(i2, iOException)) {
            this.n.J0.o(this.m, i2);
        }
    }

    public final boolean d(int i2, IOException iOException) {
        byte[] bArr = naf.a;
        synchronized (this) {
            if (this.k != 0) {
                return false;
            }
            if (this.g.X && this.h.c) {
                return false;
            }
            this.k = i2;
            this.l = iOException;
            notifyAll();
            this.n.m(this.m);
            return true;
        }
    }

    public final void e(int i2) {
        if (d(i2, (IOException) null)) {
            this.n.U(this.m, i2);
        }
    }

    public final synchronized int f() {
        return this.k;
    }

    public final op6 g() {
        synchronized (this) {
            if (!this.f) {
                if (!h()) {
                    throw new IllegalStateException("reply before requesting the sink".toString());
                }
            }
        }
        return this.h;
    }

    public final boolean h() {
        return this.n.a == ((this.m & 1) == 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0023, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean i() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.k     // Catch:{ all -> 0x0025 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            pp6 r0 = r3.g     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.X     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0012
            boolean r0 = r0.c     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x0012:
            op6 r0 = r3.h     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.c     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x001c
            boolean r0 = r0.b     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x001c:
            boolean r0 = r3.f     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            monitor-exit(r3)
            r3 = 1
            return r3
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp6.i():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001c A[Catch:{ all -> 0x0011 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(defpackage.cj6 r3, boolean r4) {
        /*
            r2 = this;
            byte[] r0 = defpackage.naf.a
            monitor-enter(r2)
            boolean r0 = r2.f     // Catch:{ all -> 0x0011 }
            r1 = 1
            if (r0 == 0) goto L_0x0013
            if (r4 != 0) goto L_0x000b
            goto L_0x0013
        L_0x000b:
            pp6 r3 = r2.g     // Catch:{ all -> 0x0011 }
            r3.getClass()     // Catch:{ all -> 0x0011 }
            goto L_0x001a
        L_0x0011:
            r3 = move-exception
            goto L_0x0032
        L_0x0013:
            r2.f = r1     // Catch:{ all -> 0x0011 }
            java.util.ArrayDeque r0 = r2.e     // Catch:{ all -> 0x0011 }
            r0.add(r3)     // Catch:{ all -> 0x0011 }
        L_0x001a:
            if (r4 == 0) goto L_0x0020
            pp6 r3 = r2.g     // Catch:{ all -> 0x0011 }
            r3.X = r1     // Catch:{ all -> 0x0011 }
        L_0x0020:
            boolean r3 = r2.i()     // Catch:{ all -> 0x0011 }
            r2.notifyAll()     // Catch:{ all -> 0x0011 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0031
            kp6 r3 = r2.n
            int r2 = r2.m
            r3.m(r2)
        L_0x0031:
            return
        L_0x0032:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp6.j(cj6, boolean):void");
    }

    public final void k() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
