package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ir5  reason: default package */
public final class ir5 extends AtomicInteger implements gs5, xae {
    public static final hr5[] C0 = new hr5[0];
    public static final hr5[] D0 = new hr5[0];
    public int A0;
    public final int B0;
    public final int X;
    public volatile bqd Y;
    public volatile boolean Z;
    public final vae a;
    public final b66 b;
    public final boolean c;
    public final int o;
    public final az s0 = new AtomicReference();
    public volatile boolean t0;
    public final AtomicReference u0;
    public final AtomicLong v0;
    public xae w0;
    public long x0;
    public long y0;
    public int z0;

    /* JADX WARNING: type inference failed for: r0v0, types: [az, java.util.concurrent.atomic.AtomicReference] */
    public ir5(vae vae, b66 b66, boolean z, int i, int i2) {
        AtomicReference atomicReference = new AtomicReference();
        this.u0 = atomicReference;
        this.v0 = new AtomicLong();
        this.a = vae;
        this.b = b66;
        this.c = z;
        this.o = i;
        this.X = i2;
        this.B0 = Math.max(1, i >> 1);
        atomicReference.lazySet(C0);
    }

    public final boolean a() {
        if (this.t0) {
            bqd bqd = this.Y;
            if (bqd != null) {
                bqd.clear();
            }
            return true;
        } else if (this.c || this.s0.get() == null) {
            return false;
        } else {
            bqd bqd2 = this.Y;
            if (bqd2 != null) {
                bqd2.clear();
            }
            this.s0.e(this.a);
            return true;
        }
    }

    public final void b() {
        if (!this.Z) {
            this.Z = true;
            c();
        }
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            d();
        }
    }

    public final void cancel() {
        bqd bqd;
        if (!this.t0) {
            this.t0 = true;
            this.w0.cancel();
            AtomicReference atomicReference = this.u0;
            hr5[] hr5Arr = D0;
            hr5[] hr5Arr2 = (hr5[]) atomicReference.getAndSet(hr5Arr);
            if (hr5Arr2 != hr5Arr) {
                for (hr5 hr5 : hr5Arr2) {
                    hr5.getClass();
                    zae.a(hr5);
                }
                this.s0.b();
            }
            if (getAndIncrement() == 0 && (bqd = this.Y) != null) {
                bqd.clear();
            }
        }
    }

    public final void d() {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        int i;
        int i2;
        long j5;
        long j6;
        vae vae = this.a;
        int i3 = 1;
        while (!a()) {
            bqd bqd = this.Y;
            long j7 = this.v0.get();
            boolean z2 = j7 == Long.MAX_VALUE;
            long j8 = 0;
            if (bqd != null) {
                long j9 = 0;
                j = 0;
                while (j7 != 0) {
                    Object poll = bqd.poll();
                    if (!a()) {
                        if (poll == null) {
                            break;
                        }
                        vae.e(poll);
                        j++;
                        j9++;
                        j7--;
                    } else {
                        return;
                    }
                }
                if (j9 != 0) {
                    j7 = z2 ? Long.MAX_VALUE : this.v0.addAndGet(-j9);
                }
            } else {
                j = 0;
            }
            boolean z3 = this.Z;
            bqd bqd2 = this.Y;
            hr5[] hr5Arr = (hr5[]) this.u0.get();
            int length = hr5Arr.length;
            if (!z3 || ((bqd2 != null && !bqd2.isEmpty()) || length != 0)) {
                int i4 = i3;
                if (length != 0) {
                    long j10 = this.y0;
                    int i5 = this.z0;
                    if (length <= i5 || hr5Arr[i5].a != j10) {
                        if (length <= i5) {
                            i5 = 0;
                        }
                        for (int i6 = 0; i6 < length && hr5Arr[i5].a != j10; i6++) {
                            i5++;
                            if (i5 == length) {
                                i5 = 0;
                            }
                        }
                        this.z0 = i5;
                        this.y0 = hr5Arr[i5].a;
                    }
                    int i7 = i5;
                    boolean z4 = false;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            z = z4;
                            break;
                        } else if (!a()) {
                            hr5 hr5 = hr5Arr[i7];
                            Object obj = null;
                            while (true) {
                                dqd dqd = hr5.Y;
                                if (dqd != null) {
                                    i = length;
                                    Object obj2 = obj;
                                    long j11 = j8;
                                    while (true) {
                                        if (j2 == j8) {
                                            j5 = j8;
                                            break;
                                        } else if (!a()) {
                                            try {
                                                Object poll2 = dqd.poll();
                                                if (poll2 == null) {
                                                    obj2 = poll2;
                                                    j5 = 0;
                                                    break;
                                                }
                                                vae.e(poll2);
                                                j2--;
                                                j11++;
                                                obj2 = poll2;
                                                j8 = 0;
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                c37.B(th2);
                                                zae.a(hr5);
                                                this.s0.a(th2);
                                                if (!this.c) {
                                                    this.w0.cancel();
                                                }
                                                if (!a()) {
                                                    h(hr5);
                                                    i8++;
                                                    i2 = i;
                                                    z4 = true;
                                                } else {
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j11 != j5) {
                                        j2 = !z2 ? this.v0.addAndGet(-j11) : Long.MAX_VALUE;
                                        hr5.a(j11);
                                        j6 = 0;
                                    } else {
                                        j6 = j5;
                                    }
                                    if (j2 == j6 || obj2 == null) {
                                        break;
                                    }
                                    length = i;
                                    obj = obj2;
                                    j8 = 0;
                                } else {
                                    i = length;
                                    break;
                                }
                                i8++;
                                length = i2;
                                j8 = 0;
                            }
                            boolean z5 = hr5.X;
                            dqd dqd2 = hr5.Y;
                            if (z5 && (dqd2 == null || dqd2.isEmpty())) {
                                h(hr5);
                                if (!a()) {
                                    j++;
                                    z4 = true;
                                } else {
                                    return;
                                }
                            }
                            if (j2 == 0) {
                                z = z4;
                                break;
                            }
                            i7++;
                            i2 = i;
                            if (i7 == i2) {
                                i7 = 0;
                            }
                            i8++;
                            length = i2;
                            j8 = 0;
                        } else {
                            return;
                        }
                    }
                    this.z0 = i7;
                    this.y0 = hr5Arr[i7].a;
                    j4 = j;
                    j3 = 0;
                } else {
                    j3 = 0;
                    j4 = j;
                    z = false;
                }
                if (j4 != j3 && !this.t0) {
                    this.w0.j(j4);
                }
                if (z) {
                    i3 = i4;
                } else {
                    i3 = addAndGet(-i4);
                    if (i3 == 0) {
                        return;
                    }
                }
            } else {
                this.s0.e(this.a);
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: hr5[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r8.Z
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            b66 r0 = r8.b     // Catch:{ all -> 0x010e }
            java.lang.Object r9 = r0.apply(r9)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "The mapper returned a null Publisher"
            java.util.Objects.requireNonNull(r9, r0)     // Catch:{ all -> 0x010e }
            ypb r9 = (defpackage.ypb) r9     // Catch:{ all -> 0x010e }
            boolean r0 = r9 instanceof defpackage.kde
            r1 = 0
            if (r0 == 0) goto L_0x00d3
            kde r9 = (defpackage.kde) r9     // Catch:{ all -> 0x00c6 }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x00c6 }
            r0 = 1
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == 0) goto L_0x00ac
            int r3 = r8.get()
            if (r3 != 0) goto L_0x008e
            boolean r3 = r8.compareAndSet(r1, r0)
            if (r3 == 0) goto L_0x008e
            java.util.concurrent.atomic.AtomicLong r3 = r8.v0
            long r3 = r3.get()
            bqd r5 = r8.Y
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0072
            if (r5 == 0) goto L_0x0045
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0072
        L_0x0045:
            vae r5 = r8.a
            r5.e(r9)
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x0058
            java.util.concurrent.atomic.AtomicLong r9 = r8.v0
            r9.decrementAndGet()
        L_0x0058:
            int r9 = r8.o
            if (r9 == r2) goto L_0x0086
            boolean r9 = r8.t0
            if (r9 != 0) goto L_0x0086
            int r9 = r8.A0
            int r9 = r9 + r0
            r8.A0 = r9
            int r0 = r8.B0
            if (r9 != r0) goto L_0x0086
            r8.A0 = r1
            xae r9 = r8.w0
            long r0 = (long) r0
            r9.j(r0)
            goto L_0x0086
        L_0x0072:
            if (r5 != 0) goto L_0x0078
            bqd r5 = r8.g()
        L_0x0078:
            boolean r9 = r5.offer(r9)
            if (r9 != 0) goto L_0x0086
            io.reactivex.rxjava3.exceptions.QueueOverflowException r9 = new io.reactivex.rxjava3.exceptions.QueueOverflowException
            r9.<init>()
            r8.onError(r9)
        L_0x0086:
            int r9 = r8.decrementAndGet()
            if (r9 != 0) goto L_0x00a8
            goto L_0x0106
        L_0x008e:
            bqd r0 = r8.g()
            boolean r9 = r0.offer(r9)
            if (r9 != 0) goto L_0x00a1
            io.reactivex.rxjava3.exceptions.QueueOverflowException r9 = new io.reactivex.rxjava3.exceptions.QueueOverflowException
            r9.<init>()
            r8.onError(r9)
            goto L_0x0106
        L_0x00a1:
            int r9 = r8.getAndIncrement()
            if (r9 == 0) goto L_0x00a8
            goto L_0x0106
        L_0x00a8:
            r8.d()
            goto L_0x0106
        L_0x00ac:
            int r9 = r8.o
            if (r9 == r2) goto L_0x0106
            boolean r9 = r8.t0
            if (r9 != 0) goto L_0x0106
            int r9 = r8.A0
            int r9 = r9 + r0
            r8.A0 = r9
            int r0 = r8.B0
            if (r9 != r0) goto L_0x0106
            r8.A0 = r1
            xae r8 = r8.w0
            long r0 = (long) r0
            r8.j(r0)
            goto L_0x0106
        L_0x00c6:
            r9 = move-exception
            defpackage.c37.B(r9)
            az r0 = r8.s0
            r0.a(r9)
            r8.c()
            return
        L_0x00d3:
            hr5 r0 = new hr5
            int r2 = r8.X
            long r3 = r8.x0
            r5 = 1
            long r5 = r5 + r3
            r8.x0 = r5
            r0.<init>(r8, r2, r3)
        L_0x00e1:
            java.util.concurrent.atomic.AtomicReference r2 = r8.u0
            java.lang.Object r3 = r2.get()
            hr5[] r3 = (defpackage.hr5[]) r3
            hr5[] r4 = D0
            if (r3 != r4) goto L_0x00f1
            defpackage.zae.a(r0)
            goto L_0x0106
        L_0x00f1:
            int r4 = r3.length
            int r5 = r4 + 1
            hr5[] r5 = new defpackage.hr5[r5]
            java.lang.System.arraycopy(r3, r1, r5, r1, r4)
            r5[r4] = r0
        L_0x00fb:
            boolean r4 = r2.compareAndSet(r3, r5)
            if (r4 == 0) goto L_0x0107
            wq5 r9 = (defpackage.wq5) r9
            r9.d(r0)
        L_0x0106:
            return
        L_0x0107:
            java.lang.Object r4 = r2.get()
            if (r4 == r3) goto L_0x00fb
            goto L_0x00e1
        L_0x010e:
            r9 = move-exception
            defpackage.c37.B(r9)
            xae r0 = r8.w0
            r0.cancel()
            r8.onError(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir5.e(java.lang.Object):void");
    }

    public final void f(xae xae) {
        if (zae.e(this.w0, xae)) {
            this.w0 = xae;
            this.a.f(this);
            if (!this.t0) {
                int i = this.o;
                if (i == Integer.MAX_VALUE) {
                    xae.j(Long.MAX_VALUE);
                } else {
                    xae.j((long) i);
                }
            }
        }
    }

    public final bqd g() {
        bqd bqd = this.Y;
        if (bqd == null) {
            bqd = this.o == Integer.MAX_VALUE ? new pwd(this.X) : new owd(this.o);
            this.Y = bqd;
        }
        return bqd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: hr5[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: hr5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.hr5 r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.u0
            java.lang.Object r1 = r0.get()
            hr5[] r1 = (defpackage.hr5[]) r1
            int r2 = r1.length
            if (r2 != 0) goto L_0x000c
            return
        L_0x000c:
            r3 = 0
            r4 = r3
        L_0x000e:
            if (r4 >= r2) goto L_0x0018
            r5 = r1[r4]
            if (r5 != r8) goto L_0x0015
            goto L_0x0019
        L_0x0015:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0018:
            r4 = -1
        L_0x0019:
            if (r4 >= 0) goto L_0x001c
            return
        L_0x001c:
            r5 = 1
            if (r2 != r5) goto L_0x0022
            hr5[] r2 = C0
            goto L_0x0031
        L_0x0022:
            int r6 = r2 + -1
            hr5[] r6 = new defpackage.hr5[r6]
            java.lang.System.arraycopy(r1, r3, r6, r3, r4)
            int r3 = r4 + 1
            int r2 = r2 - r4
            int r2 = r2 - r5
            java.lang.System.arraycopy(r1, r3, r6, r4, r2)
            r2 = r6
        L_0x0031:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x0038
            return
        L_0x0038:
            java.lang.Object r3 = r0.get()
            if (r3 == r1) goto L_0x0031
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir5.h(hr5):void");
    }

    public final void j(long j) {
        if (zae.d(j)) {
            ngg.b(this.v0, j);
            c();
        }
    }

    public final void onError(Throwable th) {
        if (this.Z) {
            j47.Z(th);
        } else if (this.s0.a(th)) {
            this.Z = true;
            if (!this.c) {
                for (hr5 hr5 : (hr5[]) this.u0.getAndSet(D0)) {
                    hr5.getClass();
                    zae.a(hr5);
                }
            }
            c();
        }
    }
}
