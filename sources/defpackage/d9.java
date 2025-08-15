package defpackage;

/* renamed from: d9  reason: default package */
public final class d9 extends pc4 {
    public final /* synthetic */ int d;
    public final long e;
    public final je7 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d9(long j, je7 je7, je7 je72, je7 je73, je7 je74, int i) {
        super(je72, je73, je74);
        this.d = i;
        this.e = j;
        this.f = je7;
    }

    public jqe a(uj3 uj3) {
        switch (this.d) {
            case 1:
                e52 g = g();
                if (g == null) {
                    return null;
                }
                long n = uj3.n();
                String str = (g.C() && g.E(n)) ? ((t82) g.b.R.get(Long.valueOf(n))).d : null;
                if (str != null && !w9e.C0(str)) {
                    return new iqe(str);
                }
                if (g.Y(uj3.n())) {
                    return new eqe(yea.q2);
                }
                if (g.E(uj3.n())) {
                    return new eqe(yea.c2);
                }
                return null;
            default:
                return super.a(uj3);
        }
    }

    public jqe c(uj3 uj3) {
        switch (this.d) {
            case 0:
                if (uj3.Y) {
                    return new eqe(yea.p2);
                }
                e52 e52 = (e52) ((jz2) ((iy2) this.f.getValue())).m(this.e).a.getValue();
                return (e52 == null || !e52.E(uj3.n())) ? super.c(uj3) : new eqe(yea.n2);
            default:
                return super.c(uj3);
        }
    }

    public boolean d(uj3 uj3) {
        switch (this.d) {
            case 0:
                if (!uj3.Y) {
                    e52 e52 = (e52) ((jz2) ((iy2) this.f.getValue())).m(this.e).a.getValue();
                    if (e52 == null || !e52.E(uj3.n())) {
                        return true;
                    }
                }
                return false;
            default:
                return super.d(uj3);
        }
    }

    public boolean e(uj3 uj3) {
        e52 g;
        switch (this.d) {
            case 1:
                boolean z = uj3.n() != ((hyc) b()).t();
                e52 g2 = g();
                boolean z2 = g2 != null && !g2.Y(uj3.n());
                e52 g3 = g();
                boolean z3 = g3 != null && oag.s(g3.e(((hyc) b()).t()), 4) && (g = g()) != null && g.E(uj3.n());
                e52 g4 = g();
                boolean z4 = !(g4 != null && g4.E(uj3.n()));
                if (!z2 || !z) {
                    return false;
                }
                return z3 || z4;
            default:
                return super.e(uj3);
        }
    }

    public kn8 f(uj3 uj3) {
        switch (this.d) {
            case 1:
                kn8 f2 = super.f(uj3);
                e52 g = g();
                boolean z = false;
                if (g != null && g.Y(uj3.n())) {
                    z = true;
                }
                return kn8.k(f2, z);
            default:
                return super.f(uj3);
        }
    }

    public e52 g() {
        return (e52) ((jz2) ((iy2) this.f.getValue())).m(this.e).a.getValue();
    }
}
