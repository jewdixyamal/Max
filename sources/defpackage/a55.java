package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a55  reason: default package */
public final class a55 extends AtomicReference implements Runnable, zl4 {
    public final uy1 a = new uy1(2);
    public final uy1 b = new uy1(2);

    public a55(Runnable runnable) {
        super(runnable);
    }

    public final void g() {
        if (getAndSet((Object) null) != null) {
            uy1 uy1 = this.a;
            uy1.getClass();
            dm4.a(uy1);
            uy1 uy12 = this.b;
            uy12.getClass();
            dm4.a(uy12);
        }
    }

    public final boolean h() {
        return get() == null;
    }

    public final void run() {
        uy1 uy1 = this.b;
        uy1 uy12 = this.a;
        dm4 dm4 = dm4.a;
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
                lazySet((Object) null);
                uy12.lazySet(dm4);
                uy1.lazySet(dm4);
            } catch (Throwable th) {
                j47.Z(th);
                throw th;
            }
        }
    }
}
