package defpackage;

import java.util.concurrent.locks.LockSupport;

/* renamed from: jp0  reason: default package */
public final class jp0 extends d0 {
    public final Thread a;
    public final a45 b;

    public jp0(lx3 lx3, Thread thread, a45 a45) {
        super(lx3, true, true);
        this.a = thread;
        this.b = a45;
    }

    public final void afterCompletion(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.a;
        if (!tpa.f(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
