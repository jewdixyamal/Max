package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: u0a  reason: default package */
public final class u0a extends AtomicReference implements f2a, zl4 {
    public static final t0a[] X = new t0a[0];
    public static final t0a[] Y = new t0a[0];
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicReference b;
    public final AtomicReference c;
    public Throwable o;

    public u0a(AtomicReference atomicReference) {
        this.b = atomicReference;
        this.c = new AtomicReference();
        lazySet(X);
    }

    public final void a(t0a t0a) {
        t0a[] t0aArr;
        t0a[] t0aArr2;
        do {
            t0aArr = (t0a[]) get();
            int length = t0aArr.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (t0aArr[i] == t0a) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    t0aArr2 = X;
                    if (length != 1) {
                        t0aArr2 = new t0a[(length - 1)];
                        System.arraycopy(t0aArr, 0, t0aArr2, 0, i);
                        System.arraycopy(t0aArr, i + 1, t0aArr2, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(t0aArr, t0aArr2));
    }

    public final void b() {
        this.c.lazySet(dm4.a);
        for (t0a t0a : (t0a[]) getAndSet(Y)) {
            t0a.a.b();
        }
    }

    public final void c(zl4 zl4) {
        dm4.e(this.c, zl4);
    }

    public final void e(Object obj) {
        for (t0a t0a : (t0a[]) get()) {
            t0a.a.e(obj);
        }
    }

    public final void g() {
        AtomicReference atomicReference;
        getAndSet(Y);
        do {
            atomicReference = this.b;
            if (atomicReference.compareAndSet(this, (Object) null) || atomicReference.get() != this) {
                dm4.a(this.c);
            }
            atomicReference = this.b;
            break;
        } while (atomicReference.get() != this);
        dm4.a(this.c);
    }

    public final boolean h() {
        return get() == Y;
    }

    public final void onError(Throwable th) {
        AtomicReference atomicReference = this.c;
        Object obj = atomicReference.get();
        dm4 dm4 = dm4.a;
        if (obj != dm4) {
            this.o = th;
            atomicReference.lazySet(dm4);
            for (t0a t0a : (t0a[]) getAndSet(Y)) {
                t0a.a.onError(th);
            }
            return;
        }
        j47.Z(th);
    }
}
