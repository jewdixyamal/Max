package defpackage;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* renamed from: f28  reason: default package */
public abstract class f28 implements f38 {
    public static u28 e(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new u28(obj);
    }

    public final void a(b38 b38) {
        Objects.requireNonNull(b38, "observer is null");
        try {
            g(b38);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            c37.B(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.CountDownLatch, b38, mp0] */
    public final Object b() {
        ? countDownLatch = new CountDownLatch(1);
        a(countDownLatch);
        return countDownLatch.d();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.CountDownLatch, b38, mp0] */
    public final Object c(Object obj) {
        Objects.requireNonNull(obj, "defaultValue is null");
        ? countDownLatch = new CountDownLatch(1);
        a(countDownLatch);
        if (countDownLatch.getCount() != 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                countDownLatch.o = true;
                zl4 zl4 = countDownLatch.c;
                if (zl4 != null) {
                    zl4.g();
                }
                throw q45.f(e);
            }
        }
        Throwable th = countDownLatch.b;
        if (th == null) {
            Object obj2 = countDownLatch.a;
            return obj2 != null ? obj2 : obj;
        }
        throw q45.f(th);
    }

    public final a38 f(ztc ztc) {
        Objects.requireNonNull(ztc, "scheduler is null");
        return new a38(this, ztc, 0);
    }

    public abstract void g(b38 b38);

    public final a38 h(ztc ztc) {
        Objects.requireNonNull(ztc, "scheduler is null");
        return new a38(this, ztc, 1);
    }
}
