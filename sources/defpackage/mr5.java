package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mr5  reason: default package */
public final class mr5 extends wk0 implements gs5 {
    public final AtomicLong X = new AtomicLong();
    public xae Y;
    public dqd Z;
    public final vae a;
    public final b66 b;
    public final int c;
    public final int o;
    public volatile boolean s0;
    public volatile boolean t0;
    public final AtomicReference u0 = new AtomicReference();
    public Iterator v0;
    public int w0;
    public int x0;

    public mr5(vae vae, b66 b66, int i) {
        this.a = vae;
        this.b = b66;
        this.c = i;
        this.o = i - (i >> 2);
    }

    public final void b() {
        if (!this.s0) {
            this.s0 = true;
            h();
        }
    }

    public final void cancel() {
        if (!this.t0) {
            this.t0 = true;
            this.Y.cancel();
            if (getAndIncrement() == 0) {
                this.Z.clear();
            }
        }
    }

    public final void clear() {
        this.v0 = null;
        this.Z.clear();
    }

    public final void e(Object obj) {
        if (!this.s0) {
            if (this.x0 != 0 || this.Z.offer(obj)) {
                h();
            } else {
                onError(new QueueOverflowException());
            }
        }
    }

    public final void f(xae xae) {
        if (zae.e(this.Y, xae)) {
            this.Y = xae;
            if (xae instanceof vqb) {
                vqb vqb = (vqb) xae;
                int n = vqb.n(3);
                if (n == 1) {
                    this.x0 = n;
                    this.Z = vqb;
                    this.s0 = true;
                    this.a.f(this);
                    return;
                } else if (n == 2) {
                    this.x0 = n;
                    this.Z = vqb;
                    this.a.f(this);
                    xae.j((long) this.c);
                    return;
                }
            }
            this.Z = new owd(this.c);
            this.a.f(this);
            xae.j((long) this.c);
        }
    }

    public final boolean g(boolean z, boolean z2, vae vae, dqd dqd) {
        if (this.t0) {
            this.v0 = null;
            dqd.clear();
            return true;
        } else if (!z) {
            return false;
        } else {
            if (((Throwable) this.u0.get()) != null) {
                Throwable d = q45.d(this.u0);
                this.v0 = null;
                dqd.clear();
                vae.onError(d);
                return true;
            } else if (!z2) {
                return false;
            } else {
                vae.b();
                return true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0140, code lost:
        if (r6 == null) goto L_0x0142;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r16 = this;
            r1 = r16
            int r0 = r16.getAndIncrement()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            vae r2 = r1.a
            dqd r3 = r1.Z
            int r0 = r1.x0
            r4 = 1
            r5 = 0
            if (r0 == r4) goto L_0x0015
            r0 = r4
            goto L_0x0016
        L_0x0015:
            r0 = r5
        L_0x0016:
            java.util.Iterator r6 = r1.v0
            r7 = r4
        L_0x0019:
            r8 = 0
            if (r6 != 0) goto L_0x0091
            boolean r9 = r1.s0
            java.lang.Object r10 = r3.poll()     // Catch:{ all -> 0x0073 }
            if (r10 != 0) goto L_0x0026
            r11 = r4
            goto L_0x0027
        L_0x0026:
            r11 = r5
        L_0x0027:
            boolean r9 = r1.g(r9, r11, r2, r3)
            if (r9 == 0) goto L_0x002e
            return
        L_0x002e:
            if (r10 == 0) goto L_0x0091
            b66 r6 = r1.b     // Catch:{ all -> 0x005b }
            java.lang.Object r6 = r6.apply(r10)     // Catch:{ all -> 0x005b }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x005b }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x005b }
            boolean r9 = r6.hasNext()     // Catch:{ all -> 0x005b }
            if (r9 != 0) goto L_0x0058
            if (r0 == 0) goto L_0x0056
            int r6 = r1.w0
            int r6 = r6 + r4
            int r9 = r1.o
            if (r6 != r9) goto L_0x0054
            r1.w0 = r5
            xae r9 = r1.Y
            long r10 = (long) r6
            r9.j(r10)
            goto L_0x0056
        L_0x0054:
            r1.w0 = r6
        L_0x0056:
            r6 = r8
            goto L_0x0019
        L_0x0058:
            r1.v0 = r6
            goto L_0x0091
        L_0x005b:
            r0 = move-exception
            defpackage.c37.B(r0)
            xae r3 = r1.Y
            r3.cancel()
            java.util.concurrent.atomic.AtomicReference r3 = r1.u0
            defpackage.q45.a(r3, r0)
            java.util.concurrent.atomic.AtomicReference r0 = r1.u0
            java.lang.Throwable r0 = defpackage.q45.d(r0)
            r2.onError(r0)
            return
        L_0x0073:
            r0 = move-exception
            r4 = r0
            defpackage.c37.B(r4)
            xae r0 = r1.Y
            r0.cancel()
            java.util.concurrent.atomic.AtomicReference r0 = r1.u0
            defpackage.q45.a(r0, r4)
            java.util.concurrent.atomic.AtomicReference r0 = r1.u0
            java.lang.Throwable r0 = defpackage.q45.d(r0)
            r1.v0 = r8
            r3.clear()
            r2.onError(r0)
            return
        L_0x0091:
            if (r6 == 0) goto L_0x0146
            java.util.concurrent.atomic.AtomicLong r9 = r1.X
            long r9 = r9.get()
            r13 = 0
        L_0x009b:
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 == 0) goto L_0x0113
            boolean r15 = r1.s0
            boolean r15 = r1.g(r15, r5, r2, r3)
            if (r15 == 0) goto L_0x00a8
            return
        L_0x00a8:
            java.lang.Object r15 = r6.next()     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = "The iterator returned a null value"
            java.util.Objects.requireNonNull(r15, r11)     // Catch:{ all -> 0x00f9 }
            r2.e(r15)
            boolean r11 = r1.s0
            boolean r11 = r1.g(r11, r5, r2, r3)
            if (r11 == 0) goto L_0x00bd
            return
        L_0x00bd:
            r11 = 1
            long r13 = r13 + r11
            boolean r11 = r6.hasNext()     // Catch:{ all -> 0x00de }
            if (r11 != 0) goto L_0x009b
            if (r0 == 0) goto L_0x00da
            int r6 = r1.w0
            int r6 = r6 + r4
            int r11 = r1.o
            if (r6 != r11) goto L_0x00d8
            r1.w0 = r5
            xae r11 = r1.Y
            long r4 = (long) r6
            r11.j(r4)
            goto L_0x00da
        L_0x00d8:
            r1.w0 = r6
        L_0x00da:
            r1.v0 = r8
            r6 = r8
            goto L_0x0113
        L_0x00de:
            r0 = move-exception
            r3 = r0
            defpackage.c37.B(r3)
            r1.v0 = r8
            xae r0 = r1.Y
            r0.cancel()
            java.util.concurrent.atomic.AtomicReference r0 = r1.u0
            defpackage.q45.a(r0, r3)
            java.util.concurrent.atomic.AtomicReference r0 = r1.u0
            java.lang.Throwable r0 = defpackage.q45.d(r0)
            r2.onError(r0)
            return
        L_0x00f9:
            r0 = move-exception
            defpackage.c37.B(r0)
            r1.v0 = r8
            xae r3 = r1.Y
            r3.cancel()
            java.util.concurrent.atomic.AtomicReference r3 = r1.u0
            defpackage.q45.a(r3, r0)
            java.util.concurrent.atomic.AtomicReference r0 = r1.u0
            java.lang.Throwable r0 = defpackage.q45.d(r0)
            r2.onError(r0)
            return
        L_0x0113:
            int r4 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x012b
            boolean r4 = r1.s0
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x0123
            if (r6 != 0) goto L_0x0123
            r5 = 1
            goto L_0x0124
        L_0x0123:
            r5 = 0
        L_0x0124:
            boolean r4 = r1.g(r4, r5, r2, r3)
            if (r4 == 0) goto L_0x012b
            return
        L_0x012b:
            r4 = 0
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0140
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0140
            java.util.concurrent.atomic.AtomicLong r4 = r1.X
            long r8 = -r13
            r4.addAndGet(r8)
        L_0x0140:
            if (r6 != 0) goto L_0x0146
        L_0x0142:
            r4 = 1
            r5 = 0
            goto L_0x0019
        L_0x0146:
            int r4 = -r7
            int r7 = r1.addAndGet(r4)
            if (r7 != 0) goto L_0x0142
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr5.h():void");
    }

    public final boolean isEmpty() {
        return this.v0 == null && this.Z.isEmpty();
    }

    public final void j(long j) {
        if (zae.d(j)) {
            ngg.b(this.X, j);
            h();
        }
    }

    public final int n(int i) {
        return this.x0 == 1 ? 1 : 0;
    }

    public final void onError(Throwable th) {
        if (this.s0 || !q45.a(this.u0, th)) {
            j47.Z(th);
            return;
        }
        this.s0 = true;
        h();
    }

    public final Object poll() {
        Iterator it = this.v0;
        while (true) {
            if (it == null) {
                Object poll = this.Z.poll();
                if (poll != null) {
                    it = ((Iterable) this.b.apply(poll)).iterator();
                    if (it.hasNext()) {
                        this.v0 = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        Object next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.v0 = null;
        }
        return next;
    }
}
