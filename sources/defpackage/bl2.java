package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: bl2  reason: default package */
public final class bl2 extends pnf {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final long b;
    public final boolean c;
    public final je7 o;
    public final a8g s0;
    public vxd t0;
    public final ArrayList u0;
    public final AtomicBoolean v0;
    public final int w0;
    public final s35 x0;
    public final mn5 y0;

    public bl2(int i, long j, boolean z) {
        int i2 = 2;
        z = (i & 2) != 0 ? false : z;
        xcb xcb = xcb.a;
        je7 c2 = xcb.c();
        je7 e = xcb.e();
        je7 f = xcb.f();
        je7 r = tu0.r(3, new m52(20));
        this.b = j;
        this.c = z;
        this.o = c2;
        this.X = e;
        this.Y = f;
        this.Z = r;
        this.s0 = new a8g(5);
        this.u0 = new ArrayList();
        this.v0 = new AtomicBoolean(false);
        e52 q = q();
        if (q != null && q.I()) {
            i2 = 1;
        }
        this.w0 = i2;
        this.x0 = new s35(0);
        this.y0 = od2.x(new wk2(od2.F(new t03(((jz2) ((iy2) ((khe) c2).getValue())).m(j), 11), ((w9a) ((kke) ((khe) f).getValue())).b()), this, 1));
    }

    public static boolean t(e52 e52) {
        if (e52.K()) {
            return false;
        }
        return e52.d0() || ((oag.t(e52.b.I) ^ true) && (e52.t() || e52.z()));
    }

    public final e52 q() {
        return (e52) ((jz2) ((iy2) this.o.getValue())).m(this.b).a.getValue();
    }

    public final kl7 r() {
        e52 q = q();
        a8g a8g = this.s0;
        a8g.getClass();
        kl7 l = j1e.l();
        if (q != null && q.t()) {
            if (!this.c) {
                l.add((tt3) ((je7) a8g.a).getValue());
            }
            if (q.I()) {
                l.add((tt3) ((je7) a8g.c).getValue());
            } else {
                l.add((tt3) ((je7) a8g.b).getValue());
            }
        }
        return j1e.d(l);
    }

    public final mn5 s() {
        return od2.x(od2.F(new wk2(new t03(((jz2) ((iy2) this.o.getValue())).m(this.b), 11), this, 0), ((w9a) ((kke) this.Y.getValue())).b()));
    }

    public final void u(List list, boolean z) {
        aqe aqe;
        this.v0.set(z);
        ArrayList arrayList = this.u0;
        arrayList.clear();
        arrayList.addAll(list);
        int s = au1.s(this.w0);
        if (s == 0) {
            aqe = new aqe(xea.c, list.size());
        } else if (s == 1) {
            aqe = new aqe(xea.d, list.size());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        pnf.o(this.x0, new gjb(aqe));
    }

    public final void v() {
        aqe aqe;
        this.v0.set(false);
        ArrayList arrayList = this.u0;
        arrayList.clear();
        int s = au1.s(this.w0);
        if (s == 0) {
            aqe = new aqe(xea.e, arrayList.size());
        } else if (s == 1) {
            aqe = new aqe(xea.f, arrayList.size());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        pnf.o(this.x0, new hjb(aqe));
    }

    public final void w() {
        ArrayList arrayList = this.u0;
        List D0 = x53.D0(arrayList);
        arrayList.clear();
        vxd vxd = this.t0;
        if ((vxd == null || !vxd.isActive()) && !D0.isEmpty()) {
            this.t0 = pnf.n(this, ((w9a) ((kke) this.Y.getValue())).b().plus(xq9.a), (vx3) null, new al2(this, D0, (Continuation) null), 2);
        }
    }
}
