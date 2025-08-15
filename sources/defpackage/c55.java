package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: c55  reason: default package */
public final class c55 extends AtomicInteger implements Runnable, zl4 {
    public final Runnable a;
    public final am4 b;
    public volatile Thread c;

    public c55(Runnable runnable, am4 am4) {
        this.a = runnable;
        this.b = am4;
    }

    public final void g() {
        while (true) {
            int i = get();
            if (i < 2) {
                if (i == 0) {
                    if (compareAndSet(0, 4)) {
                        am4 am4 = this.b;
                        if (am4 != null) {
                            am4.c(this);
                            return;
                        }
                        return;
                    }
                } else if (compareAndSet(1, 3)) {
                    Thread thread = this.c;
                    if (thread != null) {
                        thread.interrupt();
                        this.c = null;
                    }
                    set(4);
                    am4 am42 = this.b;
                    if (am42 != null) {
                        am42.c(this);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        return get() >= 2;
    }

    public final void run() {
        if (get() == 0) {
            this.c = Thread.currentThread();
            if (compareAndSet(0, 1)) {
                try {
                    this.a.run();
                    this.c = null;
                    if (compareAndSet(1, 2)) {
                        am4 am4 = this.b;
                        if (am4 != null) {
                            am4.c(this);
                            return;
                        }
                        return;
                    }
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                } catch (Throwable th) {
                    this.c = null;
                    if (!compareAndSet(1, 2)) {
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } else {
                        am4 am42 = this.b;
                        if (am42 != null) {
                            am42.c(this);
                        }
                    }
                    throw th;
                }
            } else {
                this.c = null;
            }
        }
    }
}
