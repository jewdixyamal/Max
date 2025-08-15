package defpackage;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jy5  reason: default package */
public final class jy5 extends ForkJoinTask {
    public final Runnable a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicReference c;
    public volatile Throwable o;

    public jy5(Object obj, yg3 yg3) {
        this.a = yg3;
        this.c = new AtomicReference(obj);
    }

    public final boolean exec() {
        if (!this.b.compareAndSet(false, true)) {
            return false;
        }
        try {
            this.a.run();
            return true;
        } catch (Throwable th) {
            this.o = th;
            throw th;
        }
    }

    public final Object getRawResult() {
        return this.c.get();
    }

    public final void setRawResult(Object obj) {
        this.c.set(obj);
    }
}
