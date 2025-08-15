package defpackage;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: k12  reason: default package */
public final class k12 extends b76 implements Runnable {
    public final CountDownLatch X = new CountDownLatch(1);
    public bm7 Y;
    public volatile bm7 Z;
    public wu c;
    public final LinkedBlockingQueue o = new LinkedBlockingQueue(1);

    public k12(wu wuVar, bm7 bm7) {
        this.c = wuVar;
        bm7.getClass();
        this.Y = bm7;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.a.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.o.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        bm7 bm7 = this.Y;
        if (bm7 != null) {
            bm7.cancel(z);
        }
        bm7 bm72 = this.Z;
        if (bm72 != null) {
            bm72.cancel(z);
        }
        return true;
    }

    public final Object get() {
        if (!this.a.isDone()) {
            bm7 bm7 = this.Y;
            if (bm7 != null) {
                bm7.get();
            }
            this.X.await();
            bm7 bm72 = this.Z;
            if (bm72 != null) {
                bm72.get();
            }
        }
        return this.a.get();
    }

    public final void run() {
        try {
            try {
                bm7 apply = this.c.apply(kq0.o(this.Y));
                this.Z = apply;
                if (this.a.isCancelled()) {
                    apply.cancel(((Boolean) b(this.o)).booleanValue());
                    this.Z = null;
                    this.c = null;
                    this.Y = null;
                    this.X.countDown();
                    return;
                }
                apply.d(new h76((Object) this, (Object) apply, false, 3), ju0.k());
                this.c = null;
                this.Y = null;
                this.X.countDown();
            } catch (UndeclaredThrowableException e) {
                Throwable cause = e.getCause();
                lq1 lq1 = this.b;
                if (lq1 != null) {
                    lq1.d(cause);
                }
            } catch (Exception e2) {
                lq1 lq12 = this.b;
                if (lq12 != null) {
                    lq12.d(e2);
                }
            } catch (Error e3) {
                lq1 lq13 = this.b;
                if (lq13 != null) {
                    lq13.d(e3);
                }
            } catch (Throwable th) {
                this.c = null;
                this.Y = null;
                this.X.countDown();
                throw th;
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e4) {
            Throwable cause2 = e4.getCause();
            lq1 lq14 = this.b;
            if (lq14 != null) {
                lq14.d(cause2);
            }
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        if (!this.a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            bm7 bm7 = this.Y;
            if (bm7 != null) {
                long nanoTime = System.nanoTime();
                bm7.get(j, timeUnit);
                j -= Math.max(0, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.X.await(j, timeUnit)) {
                j -= Math.max(0, System.nanoTime() - nanoTime2);
                bm7 bm72 = this.Z;
                if (bm72 != null) {
                    bm72.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.a.get(j, timeUnit);
    }
}
