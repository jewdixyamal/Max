package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: is5  reason: default package */
public final class is5 extends wq5 {
    public final ztc b;
    public final long c;
    public final TimeUnit o;

    public is5(long j, TimeUnit timeUnit, ztc ztc) {
        this.c = j;
        this.o = timeUnit;
        this.b = ztc;
    }

    public final void g(vae vae) {
        hs5 hs5 = new hs5(vae);
        vae.f(hs5);
        zl4 c2 = this.b.c(hs5, this.c, this.o);
        while (!hs5.compareAndSet((Object) null, c2)) {
            if (hs5.get() != null) {
                if (hs5.get() == dm4.a) {
                    c2.g();
                    return;
                }
                return;
            }
        }
    }
}
