package defpackage;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yz9  reason: default package */
public final class yz9 extends AtomicInteger implements zl4, f2a {
    public static final xz9[] A0 = new xz9[0];
    public static final xz9[] B0 = new xz9[0];
    public final int X;
    public volatile bqd Y;
    public volatile boolean Z;
    public final f2a a;
    public final b66 b;
    public final boolean c;
    public final int o;
    public final az s0 = new AtomicReference();
    public volatile boolean t0;
    public final AtomicReference u0;
    public zl4 v0;
    public long w0;
    public int x0;
    public final ArrayDeque y0;
    public int z0;

    /* JADX WARNING: type inference failed for: r0v0, types: [az, java.util.concurrent.atomic.AtomicReference] */
    public yz9(f2a f2a, b66 b66, int i, int i2) {
        this.a = f2a;
        this.b = b66;
        this.c = false;
        this.o = i;
        this.X = i2;
        if (i != Integer.MAX_VALUE) {
            this.y0 = new ArrayDeque(i);
        }
        this.u0 = new AtomicReference(A0);
    }

    public final boolean a() {
        if (this.t0) {
            return true;
        }
        Throwable th = (Throwable) this.s0.get();
        if (this.c || th == null) {
            return false;
        }
        d();
        this.s0.d(this.a);
        return true;
    }

    public final void b() {
        if (!this.Z) {
            this.Z = true;
            f();
        }
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.v0, zl4)) {
            this.v0 = zl4;
            this.a.c(this);
        }
    }

    public final boolean d() {
        this.v0.g();
        AtomicReference atomicReference = this.u0;
        xz9[] xz9Arr = B0;
        xz9[] xz9Arr2 = (xz9[]) atomicReference.getAndSet(xz9Arr);
        if (xz9Arr2 == xz9Arr) {
            return false;
        }
        for (xz9 xz9 : xz9Arr2) {
            xz9.getClass();
            dm4.a(xz9);
        }
        return true;
    }

    public final void e(Object obj) {
        if (!this.Z) {
            try {
                Object apply = this.b.apply(obj);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                r1a r1a = (r1a) apply;
                if (this.o != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.z0;
                            if (i == this.o) {
                                this.y0.offer(r1a);
                                return;
                            }
                            this.z0 = i + 1;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                k(r1a);
            } catch (Throwable th2) {
                c37.B(th2);
                this.v0.g();
                onError(th2);
            }
        }
    }

    public final void f() {
        if (getAndIncrement() == 0) {
            i();
        }
    }

    public final void g() {
        this.t0 = true;
        if (d()) {
            this.s0.b();
        }
    }

    public final boolean h() {
        return this.t0;
    }

    public final void i() {
        int i;
        f2a f2a = this.a;
        int i2 = 1;
        while (!a()) {
            bqd bqd = this.Y;
            int i3 = 0;
            if (bqd != null) {
                while (!a()) {
                    Object poll = bqd.poll();
                    if (poll != null) {
                        f2a.e(poll);
                        i3++;
                    }
                }
                return;
            }
            if (i3 == 0) {
                boolean z = this.Z;
                bqd bqd2 = this.Y;
                xz9[] xz9Arr = (xz9[]) this.u0.get();
                int length = xz9Arr.length;
                if (this.o != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.y0.size();
                    }
                } else {
                    i = 0;
                }
                if (!z || !((bqd2 == null || bqd2.isEmpty()) && length == 0 && i == 0)) {
                    if (length != 0) {
                        int min = Math.min(length - 1, this.x0);
                        int i4 = 0;
                        while (i4 < length) {
                            if (!a()) {
                                xz9 xz9 = xz9Arr[min];
                                dqd dqd = xz9.c;
                                if (dqd != null) {
                                    while (true) {
                                        try {
                                            Object poll2 = dqd.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            f2a.e(poll2);
                                            if (a()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            c37.B(th);
                                            dm4.a(xz9);
                                            this.s0.a(th);
                                            if (!a()) {
                                                j(xz9);
                                                i3++;
                                                min++;
                                                if (min != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = xz9.b;
                                dqd dqd2 = xz9.c;
                                if (z2 && (dqd2 == null || dqd2.isEmpty())) {
                                    j(xz9);
                                    i3++;
                                }
                                min++;
                                if (min != length) {
                                    i4++;
                                }
                                min = 0;
                                i4++;
                            } else {
                                return;
                            }
                        }
                        this.x0 = min;
                    }
                    if (i3 == 0) {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else if (this.o != Integer.MAX_VALUE) {
                        l(i3);
                    }
                } else {
                    this.s0.d(this.a);
                    return;
                }
            } else if (this.o != Integer.MAX_VALUE) {
                l(i3);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: xz9[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: xz9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(defpackage.xz9 r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.u0
            java.lang.Object r1 = r0.get()
            xz9[] r1 = (defpackage.xz9[]) r1
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L_0x000b:
            if (r4 >= r2) goto L_0x0015
            r5 = r1[r4]
            if (r5 != r8) goto L_0x0012
            goto L_0x0016
        L_0x0012:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0015:
            r4 = -1
        L_0x0016:
            if (r4 >= 0) goto L_0x0019
            return
        L_0x0019:
            r5 = 1
            if (r2 != r5) goto L_0x001f
            xz9[] r2 = A0
            goto L_0x002e
        L_0x001f:
            int r6 = r2 + -1
            xz9[] r6 = new defpackage.xz9[r6]
            java.lang.System.arraycopy(r1, r3, r6, r3, r4)
            int r3 = r4 + 1
            int r2 = r2 - r4
            int r2 = r2 - r5
            java.lang.System.arraycopy(r1, r3, r6, r4, r2)
            r2 = r6
        L_0x002e:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x0035
            return
        L_0x0035:
            java.lang.Object r3 = r0.get()
            if (r3 == r1) goto L_0x002e
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz9.j(xz9):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: xz9[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (decrementAndGet() == 0) goto L_0x005d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(defpackage.r1a r7) {
        /*
            r6 = this;
        L_0x0000:
            boolean r0 = r7 instanceof defpackage.kde
            r1 = 0
            if (r0 == 0) goto L_0x007e
            kde r7 = (defpackage.kde) r7
            r0 = 1
            r2 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x0051 }
            if (r7 != 0) goto L_0x0012
            goto L_0x005d
        L_0x0012:
            int r3 = r6.get()
            if (r3 != 0) goto L_0x002a
            boolean r3 = r6.compareAndSet(r1, r0)
            if (r3 == 0) goto L_0x002a
            f2a r3 = r6.a
            r3.e(r7)
            int r7 = r6.decrementAndGet()
            if (r7 != 0) goto L_0x004d
            goto L_0x005d
        L_0x002a:
            bqd r3 = r6.Y
            if (r3 != 0) goto L_0x0043
            int r3 = r6.o
            if (r3 != r2) goto L_0x003a
            pwd r3 = new pwd
            int r4 = r6.X
            r3.<init>(r4)
            goto L_0x0041
        L_0x003a:
            owd r3 = new owd
            int r4 = r6.o
            r3.<init>(r4)
        L_0x0041:
            r6.Y = r3
        L_0x0043:
            r3.offer(r7)
            int r7 = r6.getAndIncrement()
            if (r7 == 0) goto L_0x004d
            goto L_0x00ad
        L_0x004d:
            r6.i()
            goto L_0x005d
        L_0x0051:
            r7 = move-exception
            defpackage.c37.B(r7)
            az r3 = r6.s0
            r3.a(r7)
            r6.f()
        L_0x005d:
            int r7 = r6.o
            if (r7 == r2) goto L_0x00ad
            monitor-enter(r6)
            java.util.ArrayDeque r7 = r6.y0     // Catch:{ all -> 0x0073 }
            java.lang.Object r7 = r7.poll()     // Catch:{ all -> 0x0073 }
            r1a r7 = (defpackage.r1a) r7     // Catch:{ all -> 0x0073 }
            if (r7 != 0) goto L_0x0075
            int r1 = r6.z0     // Catch:{ all -> 0x0073 }
            int r1 = r1 - r0
            r6.z0 = r1     // Catch:{ all -> 0x0073 }
            r1 = r0
            goto L_0x0075
        L_0x0073:
            r7 = move-exception
            goto L_0x007c
        L_0x0075:
            monitor-exit(r6)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0000
            r6.f()
            goto L_0x00ad
        L_0x007c:
            monitor-exit(r6)     // Catch:{ all -> 0x0073 }
            throw r7
        L_0x007e:
            xz9 r0 = new xz9
            long r2 = r6.w0
            r4 = 1
            long r2 = r2 + r4
            r6.w0 = r2
            r0.<init>(r6)
        L_0x008a:
            java.util.concurrent.atomic.AtomicReference r2 = r6.u0
            java.lang.Object r3 = r2.get()
            xz9[] r3 = (defpackage.xz9[]) r3
            xz9[] r4 = B0
            if (r3 != r4) goto L_0x009a
            defpackage.dm4.a(r0)
            goto L_0x00ad
        L_0x009a:
            int r4 = r3.length
            int r5 = r4 + 1
            xz9[] r5 = new defpackage.xz9[r5]
            java.lang.System.arraycopy(r3, r1, r5, r1, r4)
            r5[r4] = r0
        L_0x00a4:
            boolean r4 = r2.compareAndSet(r3, r5)
            if (r4 == 0) goto L_0x00ae
            r7.a(r0)
        L_0x00ad:
            return
        L_0x00ae:
            java.lang.Object r4 = r2.get()
            if (r4 == r3) goto L_0x00a4
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz9.k(r1a):void");
    }

    public final void l(int i) {
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                synchronized (this) {
                    try {
                        r1a r1a = (r1a) this.y0.poll();
                        if (r1a == null) {
                            this.z0--;
                        } else {
                            k(r1a);
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.Z) {
            j47.Z(th);
        } else if (this.s0.a(th)) {
            this.Z = true;
            f();
        }
    }
}
