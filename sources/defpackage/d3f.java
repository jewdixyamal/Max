package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: d3f  reason: default package */
public final class d3f extends AtomicReference implements Runnable {
    public static final wdg c = new wdg(6);
    public static final wdg o = new wdg(6);
    public final Callable a;
    public final /* synthetic */ e3f b;

    public d3f(e3f e3f, Callable callable) {
        this.b = e3f;
        callable.getClass();
        this.a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        i47 i47 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof i47;
            wdg wdg = o;
            if (!z2 && runnable != wdg) {
                break;
            }
            if (z2) {
                i47 = (i47) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == wdg || compareAndSet(runnable, wdg)) {
                z = Thread.interrupted() || z;
                LockSupport.park(i47);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet((Object) null, currentThread)) {
            e3f e3f = this.b;
            boolean z = !e3f.isDone();
            wdg wdg = c;
            if (z) {
                try {
                    obj = this.a.call();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, wdg)) {
                        a(currentThread);
                    }
                    if (z) {
                        e3f.l((Object) null);
                    }
                    throw th;
                }
            }
            if (!compareAndSet(currentThread, wdg)) {
                a(currentThread);
            }
            if (z) {
                e3f.l(obj);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == c) {
            str = "running=[DONE]";
        } else if (runnable instanceof i47) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder o2 = rh4.o(str, ", ");
        o2.append(this.a.toString());
        return o2.toString();
    }
}
