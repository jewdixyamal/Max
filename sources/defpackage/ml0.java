package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ml0  reason: default package */
public final class ml0 extends vg3 {
    public static final ll0[] Z = new ll0[0];
    public static final ll0[] s0 = new ll0[0];
    public final AtomicReference X;
    public long Y;
    public final AtomicReference a;
    public final AtomicReference b = new AtomicReference(Z);
    public final Lock c;
    public final Lock o;

    public ml0(Object obj) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock.readLock();
        this.o = reentrantReadWriteLock.writeLock();
        this.a = new AtomicReference(obj);
        this.X = new AtomicReference();
    }

    public static ml0 z(Object obj) {
        Objects.requireNonNull(obj, "defaultValue is null");
        return new ml0(obj);
    }

    public final Object A() {
        Object obj = this.a.get();
        if (obj != hv9.a && !(obj instanceof fv9)) {
            return obj;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ll0[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: ll0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(defpackage.ll0 r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.b
            java.lang.Object r1 = r0.get()
            ll0[] r1 = (defpackage.ll0[]) r1
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
            ll0[] r2 = Z
            goto L_0x0031
        L_0x0022:
            int r6 = r2 + -1
            ll0[] r6 = new defpackage.ll0[r6]
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml0.B(ll0):void");
    }

    public final void b() {
        AtomicReference atomicReference = this.X;
        p45 p45 = q45.a;
        while (!atomicReference.compareAndSet((Object) null, p45)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        hv9 hv9 = hv9.a;
        Lock lock = this.o;
        lock.lock();
        this.Y++;
        this.a.lazySet(hv9);
        lock.unlock();
        for (ll0 a2 : (ll0[]) this.b.getAndSet(s0)) {
            a2.a(this.Y, hv9);
        }
    }

    public final void c(zl4 zl4) {
        if (this.X.get() != null) {
            zl4.g();
        }
    }

    public final void e(Object obj) {
        q45.c(obj, "onNext called with a null value.");
        if (this.X.get() == null) {
            Lock lock = this.o;
            lock.lock();
            this.Y++;
            this.a.lazySet(obj);
            lock.unlock();
            for (ll0 a2 : (ll0[]) this.b.get()) {
                a2.a(this.Y, obj);
            }
        }
    }

    public final void onError(Throwable th) {
        q45.c(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.X;
        while (!atomicReference.compareAndSet((Object) null, th)) {
            if (atomicReference.get() != null) {
                j47.Z(th);
                return;
            }
        }
        fv9 fv9 = new fv9(th);
        Lock lock = this.o;
        lock.lock();
        this.Y++;
        this.a.lazySet(fv9);
        lock.unlock();
        for (ll0 a2 : (ll0[]) this.b.getAndSet(s0)) {
            a2.a(this.Y, fv9);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ll0[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r0.test(r6) == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0081, code lost:
        if (r0.Z == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r6 = r0.X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0087, code lost:
        if (r6 != null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        r0.o = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008b, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008f, code lost:
        r0.X = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0092, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0093, code lost:
        r6.p(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0098, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(defpackage.f2a r7) {
        /*
            r6 = this;
            ll0 r0 = new ll0
            r0.<init>(r7, r6)
            r7.c(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference r1 = r6.b
            java.lang.Object r2 = r1.get()
            ll0[] r2 = (defpackage.ll0[]) r2
            ll0[] r3 = s0
            if (r2 != r3) goto L_0x002a
            java.util.concurrent.atomic.AtomicReference r6 = r6.X
            java.lang.Object r6 = r6.get()
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            p45 r0 = defpackage.q45.a
            if (r6 != r0) goto L_0x0025
            r7.b()
            goto L_0x0099
        L_0x0025:
            r7.onError(r6)
            goto L_0x0099
        L_0x002a:
            int r3 = r2.length
            int r4 = r3 + 1
            ll0[] r4 = new defpackage.ll0[r4]
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r4, r5, r3)
            r4[r3] = r0
        L_0x0035:
            boolean r3 = r1.compareAndSet(r2, r4)
            if (r3 == 0) goto L_0x009c
            boolean r7 = r0.Z
            if (r7 == 0) goto L_0x0043
            r6.B(r0)
            goto L_0x0099
        L_0x0043:
            boolean r6 = r0.Z
            if (r6 == 0) goto L_0x0048
            goto L_0x0099
        L_0x0048:
            monitor-enter(r0)
            boolean r6 = r0.Z     // Catch:{ all -> 0x004f }
            if (r6 == 0) goto L_0x0051
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            goto L_0x0099
        L_0x004f:
            r6 = move-exception
            goto L_0x009a
        L_0x0051:
            boolean r6 = r0.c     // Catch:{ all -> 0x004f }
            if (r6 == 0) goto L_0x0057
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            goto L_0x0099
        L_0x0057:
            ml0 r6 = r0.b     // Catch:{ all -> 0x004f }
            java.util.concurrent.locks.Lock r7 = r6.c     // Catch:{ all -> 0x004f }
            r7.lock()     // Catch:{ all -> 0x004f }
            long r1 = r6.Y     // Catch:{ all -> 0x004f }
            r0.s0 = r1     // Catch:{ all -> 0x004f }
            java.util.concurrent.atomic.AtomicReference r6 = r6.a     // Catch:{ all -> 0x004f }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x004f }
            r7.unlock()     // Catch:{ all -> 0x004f }
            r7 = 1
            if (r6 == 0) goto L_0x0070
            r1 = r7
            goto L_0x0071
        L_0x0070:
            r1 = r5
        L_0x0071:
            r0.o = r1     // Catch:{ all -> 0x004f }
            r0.c = r7     // Catch:{ all -> 0x004f }
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            if (r6 == 0) goto L_0x0099
            boolean r6 = r0.test(r6)
            if (r6 == 0) goto L_0x007f
            goto L_0x0099
        L_0x007f:
            boolean r6 = r0.Z
            if (r6 == 0) goto L_0x0084
            goto L_0x0099
        L_0x0084:
            monitor-enter(r0)
            jn r6 = r0.X     // Catch:{ all -> 0x008d }
            if (r6 != 0) goto L_0x008f
            r0.o = r5     // Catch:{ all -> 0x008d }
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            goto L_0x0099
        L_0x008d:
            r6 = move-exception
            goto L_0x0097
        L_0x008f:
            r7 = 0
            r0.X = r7     // Catch:{ all -> 0x008d }
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            r6.p(r0)
            goto L_0x007f
        L_0x0097:
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            throw r6
        L_0x0099:
            return
        L_0x009a:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            throw r6
        L_0x009c:
            java.lang.Object r3 = r1.get()
            if (r3 == r2) goto L_0x0035
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml0.q(f2a):void");
    }
}
