package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: o1a  reason: default package */
public final class o1a extends w2 {
    public final boolean X;
    public final long b;
    public final TimeUnit c;
    public final ztc o;

    public o1a(r1a r1a, long j, TimeUnit timeUnit, ztc ztc, boolean z) {
        super(r1a);
        this.b = j;
        this.c = timeUnit;
        this.o = ztc;
        this.X = z;
    }

    public final void q(f2a f2a) {
        y6d y6d = new y6d(f2a);
        boolean z = this.X;
        r1a r1a = this.a;
        if (z) {
            r1a.a(new l1a(y6d, this.b, this.c, this.o));
            return;
        }
        r1a.a(new n1a(y6d, this.b, this.c, this.o));
    }
}
