package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fz9  reason: default package */
public final class fz9 extends AtomicReference implements Runnable, zl4 {
    public final Object a;
    public final long b;
    public final gz9 c;
    public final AtomicBoolean o = new AtomicBoolean();

    public fz9(Object obj, long j, gz9 gz9) {
        this.a = obj;
        this.b = j;
        this.c = gz9;
    }

    public final void g() {
        dm4.a(this);
    }

    public final boolean h() {
        return get() == dm4.a;
    }

    public final void run() {
        if (this.o.compareAndSet(false, true)) {
            gz9 gz9 = this.c;
            long j = this.b;
            Object obj = this.a;
            if (j == gz9.Z) {
                gz9.a.e(obj);
                dm4.a(this);
            }
        }
    }
}
