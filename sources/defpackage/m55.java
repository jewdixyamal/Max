package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: m55  reason: default package */
public class m55 implements ExecutorService {
    public static final AtomicInteger v0 = new AtomicInteger(0);
    public volatile boolean X;
    public final AtomicLong Y;
    public final qv7 Z;
    public final ExecutorService a;
    public final hba b;
    public final boolean c = false;
    public final j55 o;
    public final ReentrantReadWriteLock s0;
    public final Condition t0;
    public volatile Thread u0;

    /* JADX WARNING: type inference failed for: r3v3, types: [qv7, java.lang.Object] */
    public m55(ExecutorService executorService, hba hba, m56 m56) {
        j55.t.getClass();
        sp3 sp3 = sp3.c;
        this.a = executorService;
        this.b = hba;
        this.o = sp3;
        this.Y = new AtomicLong(0);
        ? obj = new Object();
        obj.b = i24.c;
        obj.c = i24.d;
        obj.d = i24.e;
        obj.c(6);
        this.Z = obj;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.s0 = reentrantReadWriteLock;
        this.t0 = reentrantReadWriteLock.writeLock().newCondition();
        m56.invoke(new dd4(17, this));
    }

    public static long c(long j, long j2) {
        long e = ft4.e(j);
        long e2 = ft4.e(j2);
        long j3 = e + e2;
        return ((e ^ j3) & (e2 ^ j3)) < 0 ? z7.S(Long.MAX_VALUE, kt4.MILLISECONDS) : z7.S(j3, kt4.MILLISECONDS);
    }

    public final void a(long j) {
        qv7 qv7 = this.Z;
        ReentrantReadWriteLock reentrantReadWriteLock = this.s0;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            qv7.d(j);
            int i3 = qv7.f;
            int i4 = qv7.e;
            if (((float) i3) / ((float) i4) < 0.25f && i4 >= 4192) {
                int i5 = i3 == 7 ? 8 : i3 + ((i3 - 1) / 7);
                int numberOfLeadingZeros = i5 > 0 ? -1 >>> Integer.numberOfLeadingZeros(i5) : 0;
                if (numberOfLeadingZeros < i4) {
                    qv7.e(numberOfLeadingZeros);
                }
            }
            this.t0.signal();
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public final urf b() {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        long g = g();
        return new urf(name, g, g, (Thread) null, this.c ? l6d.i0(l6d.Z(l6d.Y(ys.Q(currentThread.getStackTrace()), 2), new jy2(11, this))) : nz4.a);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void d() {
        /*
            r5 = this;
            r0 = 1
            r5.X = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.s0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0015
            int r2 = r0.getReadHoldCount()
            goto L_0x0016
        L_0x0015:
            r2 = r3
        L_0x0016:
            r4 = r3
        L_0x0017:
            if (r4 >= r2) goto L_0x001f
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0017
        L_0x001f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.concurrent.locks.Condition r5 = r5.t0     // Catch:{ all -> 0x0037 }
            r5.signal()     // Catch:{ all -> 0x0037 }
        L_0x002b:
            if (r3 >= r2) goto L_0x0033
            r1.lock()
            int r3 = r3 + 1
            goto L_0x002b
        L_0x0033:
            r0.unlock()
            return
        L_0x0037:
            r5 = move-exception
        L_0x0038:
            if (r3 >= r2) goto L_0x0040
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0038
        L_0x0040:
            r0.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m55.d():void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final long e(defpackage.urf r11) {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r10.Y
            long r0 = r0.getAndIncrement()
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r10.s0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.readLock()
            int r4 = r2.getWriteHoldCount()
            r5 = 0
            if (r4 != 0) goto L_0x0018
            int r4 = r2.getReadHoldCount()
            goto L_0x0019
        L_0x0018:
            r4 = r5
        L_0x0019:
            r6 = r5
        L_0x001a:
            if (r6 >= r4) goto L_0x0022
            r3.unlock()
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0022:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r2.writeLock()
            r2.lock()
            java.lang.Thread r6 = r10.u0     // Catch:{ all -> 0x0044 }
            r7 = 23
            r8 = 0
            urf r11 = defpackage.urf.a(r11, r8, r6, r7)     // Catch:{ all -> 0x0044 }
            qv7 r10 = r10.Z     // Catch:{ all -> 0x0044 }
            r10.f(r0, r11)     // Catch:{ all -> 0x0044 }
        L_0x0038:
            if (r5 >= r4) goto L_0x0040
            r3.lock()
            int r5 = r5 + 1
            goto L_0x0038
        L_0x0040:
            r2.unlock()
            return r0
        L_0x0044:
            r10 = move-exception
        L_0x0045:
            if (r5 >= r4) goto L_0x004d
            r3.lock()
            int r5 = r5 + 1
            goto L_0x0045
        L_0x004d:
            r2.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m55.e(urf):long");
    }

    public final void execute(Runnable runnable) {
        this.a.execute(i(runnable, b()));
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void f(long r10) {
        /*
            r9 = this;
            qv7 r0 = r9.Z
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r9.s0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            int r3 = r1.getWriteHoldCount()
            r4 = 0
            if (r3 != 0) goto L_0x0014
            int r3 = r1.getReadHoldCount()
            goto L_0x0015
        L_0x0014:
            r3 = r4
        L_0x0015:
            r5 = r4
        L_0x0016:
            if (r5 >= r3) goto L_0x001e
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x0016
        L_0x001e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            java.lang.Object r5 = r0.b(r10)     // Catch:{ all -> 0x0043 }
            urf r5 = (defpackage.urf) r5     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x003c
            long r6 = r9.g()     // Catch:{ all -> 0x0043 }
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0043 }
            r8 = 19
            urf r9 = defpackage.urf.a(r5, r6, r9, r8)     // Catch:{ all -> 0x0043 }
            goto L_0x003d
        L_0x003c:
            r9 = 0
        L_0x003d:
            if (r9 == 0) goto L_0x0045
            r0.f(r10, r9)     // Catch:{ all -> 0x0043 }
            goto L_0x0045
        L_0x0043:
            r9 = move-exception
            goto L_0x0051
        L_0x0045:
            if (r4 >= r3) goto L_0x004d
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0045
        L_0x004d:
            r1.unlock()
            return
        L_0x0051:
            if (r4 >= r3) goto L_0x0059
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0051
        L_0x0059:
            r1.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m55.f(long):void");
    }

    public final long g() {
        ((sp3) this.o).getClass();
        int i = ft4.o;
        return z7.S(System.nanoTime(), kt4.NANOSECONDS);
    }

    public final k55 h(Callable callable, urf urf) {
        return new k55(callable, new g55(this, e(urf), 0), new h55(this, 0));
    }

    public final l55 i(Runnable runnable, urf urf) {
        return new l55(runnable, new g55(this, e(urf), 1), new h55(this, 1));
    }

    public final List invokeAll(Collection collection) {
        ArrayList arrayList = new ArrayList(z53.S(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(h((Callable) it.next(), b()));
        }
        return this.a.invokeAll(arrayList);
    }

    public final Object invokeAny(Collection collection) {
        ArrayList arrayList = new ArrayList(z53.S(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(h((Callable) it.next(), b()));
        }
        return this.a.invokeAny(arrayList);
    }

    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    public final void shutdown() {
        this.a.shutdown();
        d();
    }

    public final List shutdownNow() {
        List<Runnable> shutdownNow = this.a.shutdownNow();
        ArrayList arrayList = new ArrayList();
        for (Runnable runnable : shutdownNow) {
            if (runnable instanceof l55) {
                runnable = ((l55) runnable).a;
            }
            arrayList.add(runnable);
        }
        d();
        return arrayList;
    }

    public final Future submit(Callable callable) {
        return this.a.submit(h(callable, b()));
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.a.submit(i(runnable, b()), obj);
    }

    public final Future submit(Runnable runnable) {
        return this.a.submit(i(runnable, b()));
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        ArrayList arrayList = new ArrayList(z53.S(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(h((Callable) it.next(), b()));
        }
        return this.a.invokeAll(arrayList, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        ArrayList arrayList = new ArrayList(z53.S(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(h((Callable) it.next(), b()));
        }
        return this.a.invokeAny(arrayList, j, timeUnit);
    }
}
