package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: d2a  reason: default package */
public final class d2a extends qy9 {
    public final ztc a;
    public final long b;
    public final TimeUnit c;

    public d2a(long j, TimeUnit timeUnit, ztc ztc) {
        this.b = j;
        this.c = timeUnit;
        this.a = ztc;
    }

    public final void q(f2a f2a) {
        c2a c2a = new c2a(f2a);
        f2a.c(c2a);
        zl4 c2 = this.a.c(c2a, this.b, this.c);
        while (!c2a.compareAndSet((Object) null, c2)) {
            if (c2a.get() != null) {
                if (c2a.get() == dm4.a) {
                    c2.g();
                    return;
                }
                return;
            }
        }
    }
}
