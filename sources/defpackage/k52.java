package defpackage;

/* renamed from: k52  reason: default package */
public final class k52 extends pc4 {
    public final long d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final khe h = new khe(new md1(8, this));

    public k52(long j, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76) {
        super(je73, je74, je75);
        this.d = j;
        this.e = je7;
        this.f = je72;
        this.g = je76;
    }

    public final jqe c(uj3 uj3) {
        String d2;
        e52 g2 = g();
        Long d3 = g2 != null ? g2.d(uj3.n()) : null;
        if (uj3.Y) {
            return new eqe(yea.p2);
        }
        long t = ((hyc) b()).t();
        khe khe = this.h;
        if (d3 != null && d3.longValue() == t) {
            return new eqe(((Boolean) khe.getValue()).booleanValue() ? yea.S : yea.o2);
        }
        e52 g3 = g();
        if (g3 != null && g3.Y(uj3.n()) && ((Boolean) khe.getValue()).booleanValue()) {
            e52 g4 = g();
            return new eqe((g4 == null || !g4.I()) ? yea.s2 : yea.r2);
        } else if (d3 == null || !((Boolean) khe.getValue()).booleanValue()) {
            return super.c(uj3);
        } else {
            uj3 uj32 = (uj3) ((ds3) this.f.getValue()).c(d3.longValue()).a.getValue();
            return (uj32 == null || (d2 = uj32.d()) == null) ? super.c(uj3) : new gqe(yea.R, ys.m0(new Object[]{d2}));
        }
    }

    public final boolean e(uj3 uj3) {
        e52 g2;
        boolean z = uj3.n() != ((hyc) b()).t();
        e52 g3 = g();
        boolean z2 = g3 != null && !g3.Y(uj3.n());
        e52 g4 = g();
        boolean z3 = g4 != null && oag.s(g4.e(((hyc) b()).t()), 4) && (g2 = g()) != null && g2.E(uj3.n());
        e52 g5 = g();
        boolean z4 = !(g5 != null && g5.E(uj3.n()));
        if (!z2 || !z) {
            return false;
        }
        return z3 || z4;
    }

    public final kn8 f(uj3 uj3) {
        kn8 f2 = super.f(uj3);
        e52 g2 = g();
        boolean z = false;
        if (g2 != null && g2.Y(uj3.n())) {
            z = true;
        }
        return kn8.k(f2, z);
    }

    public final e52 g() {
        return (e52) ((jz2) ((iy2) this.e.getValue())).m(this.d).a.getValue();
    }
}
