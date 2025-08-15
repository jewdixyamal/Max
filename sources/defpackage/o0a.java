package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: o0a  reason: default package */
public final class o0a extends qy9 {
    public final ztc a;
    public final long b;
    public final long c;
    public final TimeUnit o;

    public o0a(long j, long j2, TimeUnit timeUnit, ztc ztc) {
        this.b = j;
        this.c = j2;
        this.o = timeUnit;
        this.a = ztc;
    }

    public final void q(f2a f2a) {
        n0a n0a = new n0a(f2a);
        f2a.c(n0a);
        ztc ztc = this.a;
        if (ztc instanceof u0f) {
            ((u0f) ztc).getClass();
            t0f t0f = new t0f();
            dm4.e(n0a, t0f);
            n0a n0a2 = n0a;
            t0f.d(n0a2, this.b, this.c, this.o);
            return;
        }
        n0a n0a3 = n0a;
        dm4.e(n0a, ztc.d(n0a3, this.b, this.c, this.o));
    }
}
