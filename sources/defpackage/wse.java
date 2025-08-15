package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: wse  reason: default package */
public final class wse extends k87 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(wse.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread b = Thread.currentThread();
    public cm4 c;

    public static void f(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    public final boolean c() {
        return true;
    }

    public final void d(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = o;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    f(i);
                    throw null;
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.b.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void e() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        f(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                cm4 cm4 = this.c;
                if (cm4 != null) {
                    cm4.dispose();
                    return;
                }
                return;
            }
        }
    }
}
