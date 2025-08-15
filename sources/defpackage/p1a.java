package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: p1a  reason: default package */
public final class p1a extends AtomicInteger implements tqb, Runnable {
    public final f2a a;
    public final Object b;

    public p1a(f2a f2a, Object obj) {
        this.a = f2a;
        this.b = obj;
    }

    public final void clear() {
        lazySet(3);
    }

    public final void g() {
        set(3);
    }

    public final boolean h() {
        return get() == 3;
    }

    public final boolean isEmpty() {
        return get() != 1;
    }

    public final int n(int i) {
        lazySet(1);
        return 1;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.b;
    }

    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.b;
            f2a f2a = this.a;
            f2a.e(obj);
            if (get() == 2) {
                lazySet(3);
                f2a.b();
            }
        }
    }
}
