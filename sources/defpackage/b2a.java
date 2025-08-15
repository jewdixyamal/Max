package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: b2a  reason: default package */
public final class b2a extends w2 {
    public final r1a X = null;
    public final long b;
    public final TimeUnit c;
    public final ztc o;

    public b2a(qy9 qy9, long j, TimeUnit timeUnit, ztc ztc) {
        super(qy9);
        this.b = j;
        this.c = timeUnit;
        this.o = ztc;
    }

    public final void q(f2a f2a) {
        r1a r1a = this.X;
        r1a r1a2 = this.a;
        ztc ztc = this.o;
        if (r1a == null) {
            f2a f2a2 = f2a;
            z1a z1a = new z1a(f2a2, this.b, this.c, ztc.a());
            f2a.c(z1a);
            zl4 c2 = z1a.o.c(new es5(0, (a2a) z1a), z1a.b, z1a.c);
            uy1 uy1 = z1a.X;
            uy1.getClass();
            dm4.c(uy1, c2);
            r1a2.a(z1a);
            return;
        }
        f2a f2a3 = f2a;
        y1a y1a = new y1a(f2a3, this.b, this.c, ztc.a());
        f2a.c(y1a);
        zl4 c3 = y1a.o.c(new es5(0, (a2a) y1a), y1a.b, y1a.c);
        uy1 uy12 = y1a.X;
        uy12.getClass();
        dm4.c(uy12, c3);
        r1a2.a(y1a);
    }
}
