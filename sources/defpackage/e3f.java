package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* renamed from: e3f  reason: default package */
public final class e3f extends k1 implements RunnableFuture, d1 {
    public volatile d3f s0;

    public e3f(Callable callable) {
        this.s0 = new d3f(this, callable);
    }

    public final void b() {
        d3f d3f;
        Object obj = this.a;
        if ((obj instanceof q0) && ((q0) obj).a && (d3f = this.s0) != null) {
            wdg wdg = d3f.o;
            wdg wdg2 = d3f.c;
            Runnable runnable = (Runnable) d3f.get();
            if (runnable instanceof Thread) {
                i47 i47 = new i47(d3f);
                i47.a(i47, Thread.currentThread());
                if (d3f.compareAndSet(runnable, i47)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) d3f.getAndSet(wdg2)) == wdg) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.s0 = null;
    }

    public final boolean isCancelled() {
        return this.a instanceof q0;
    }

    public final String j() {
        d3f d3f = this.s0;
        if (d3f == null) {
            return super.j();
        }
        return "task=[" + d3f + "]";
    }

    public final void run() {
        d3f d3f = this.s0;
        if (d3f != null) {
            d3f.run();
        }
        this.s0 = null;
    }
}
