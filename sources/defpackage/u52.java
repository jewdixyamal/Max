package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: u52  reason: default package */
public final class u52 extends pnf {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final long b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final a8g t0 = new a8g(5);
    public vxd u0;
    public final ArrayList v0 = new ArrayList();
    public final s35 w0 = new s35(0);

    public u52(long j) {
        xcb xcb = xcb.a;
        je7 c2 = xcb.c();
        je7 e = xcb.e();
        je7 f = xcb.f();
        je7 r = tu0.r(3, new m52(1));
        je7 g = xcb.g();
        je7 d = xcb.d();
        this.b = j;
        this.c = c2;
        this.o = e;
        this.X = f;
        this.Y = r;
        this.Z = g;
        this.s0 = d;
    }

    public final e52 q() {
        return (e52) ((jz2) ((iy2) this.c.getValue())).m(this.b).a.getValue();
    }

    public final void r() {
        ArrayList arrayList = this.v0;
        List D0 = x53.D0(arrayList);
        arrayList.clear();
        vxd vxd = this.u0;
        if ((vxd == null || !vxd.isActive()) && !D0.isEmpty()) {
            this.u0 = pnf.n(this, ((w9a) ((kke) this.X.getValue())).b().plus(xq9.a), (vx3) null, new t52(this, D0, (Continuation) null), 2);
        }
    }
}
