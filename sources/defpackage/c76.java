package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c76  reason: default package */
public final class c76 extends CountDownLatch implements b38, erd, ab3, Future, zl4 {
    public Object a;
    public Throwable b;
    public final AtomicReference c = new AtomicReference();

    public c76() {
        super(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000f A[LOOP:0: B:4:0x000f->B:7:0x001a, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r4) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r3.c
            java.lang.Object r1 = r0.get()
            zl4 r1 = (defpackage.zl4) r1
            dm4 r2 = defpackage.dm4.a
            if (r1 != r2) goto L_0x000d
            return
        L_0x000d:
            r3.a = r4
        L_0x000f:
            boolean r4 = r0.compareAndSet(r1, r3)
            if (r4 == 0) goto L_0x0016
            goto L_0x001c
        L_0x0016:
            java.lang.Object r4 = r0.get()
            if (r4 == r1) goto L_0x000f
        L_0x001c:
            r3.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c76.a(java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d A[LOOP:0: B:3:0x000d->B:6:0x0018, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r3.c
            java.lang.Object r1 = r0.get()
            zl4 r1 = (defpackage.zl4) r1
            dm4 r2 = defpackage.dm4.a
            if (r1 != r2) goto L_0x000d
            return
        L_0x000d:
            boolean r2 = r0.compareAndSet(r1, r3)
            if (r2 == 0) goto L_0x0014
            goto L_0x001a
        L_0x0014:
            java.lang.Object r2 = r0.get()
            if (r2 == r1) goto L_0x000d
        L_0x001a:
            r3.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c76.b():void");
    }

    public final void c(zl4 zl4) {
        dm4.e(this.c, zl4);
    }

    public final boolean cancel(boolean z) {
        dm4 dm4;
        while (true) {
            AtomicReference atomicReference = this.c;
            zl4 zl4 = (zl4) atomicReference.get();
            if (zl4 == this || zl4 == (dm4 = dm4.a)) {
                return false;
            }
            while (true) {
                if (atomicReference.compareAndSet(zl4, dm4)) {
                    if (zl4 != null) {
                        zl4.g();
                    }
                    countDown();
                    return true;
                } else if (atomicReference.get() != zl4) {
                }
            }
        }
    }

    public final void g() {
    }

    public final Object get() {
        if (getCount() != 0) {
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.b;
            if (th == null) {
                return this.a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    public final boolean h() {
        return isDone();
    }

    public final boolean isCancelled() {
        return dm4.b((zl4) this.c.get());
    }

    public final boolean isDone() {
        return getCount() == 0;
    }

    public final void onError(Throwable th) {
        while (true) {
            AtomicReference atomicReference = this.c;
            zl4 zl4 = (zl4) atomicReference.get();
            if (zl4 == dm4.a) {
                j47.Z(th);
                return;
            }
            this.b = th;
            while (true) {
                if (atomicReference.compareAndSet(zl4, this)) {
                    countDown();
                    return;
                } else if (atomicReference.get() != zl4) {
                }
            }
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        if (getCount() != 0 && !await(j, timeUnit)) {
            throw new TimeoutException(q45.e(j, timeUnit));
        } else if (!isCancelled()) {
            Throwable th = this.b;
            if (th == null) {
                return this.a;
            }
            throw new ExecutionException(th);
        } else {
            throw new CancellationException();
        }
    }
}
