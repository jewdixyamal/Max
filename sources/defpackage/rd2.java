package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: rd2  reason: default package */
public final class rd2 extends ol implements lme {
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final int s0;
    public final int t0;
    public final Set u0;
    public final String v0 = rd2.class.getName();

    public rd2(long j, long j2, long j3, long j4, long j5, int i, int i2, Set set) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.s0 = i;
        this.t0 = i2;
        this.u0 = set;
    }

    public final void e(gle gle) {
        de2 de2 = (de2) gle;
        hm9.m(this.v0, "onSuccess: " + de2, new Object[0]);
        if (m().C(this.o) != null) {
            au8 p = p();
            List c = de2.c();
            p.g(this.o, ((p7b) r()).a.t(), c);
            p82 m = m();
            m.getClass();
            int i = de2.X;
            hm9.m("p82", "onChatMedia: totalCount = " + i, new Object[0]);
            int i2 = this.t0;
            int i3 = this.s0;
            Set set = this.u0;
            long j = this.Y;
            long j2 = this.o;
            long j3 = j2;
            m.h(j3, false, new a82(m, i2, i3, set, i, de2, j, j2));
            m.m.c(new vz2(Collections.singletonList(Long.valueOf(j3)), false));
            av0 l = l();
            int size = de2.c().size();
            l.c(new gf2(this.a, this.Y, this.s0, this.t0, size, this.u0));
        }
    }

    public final void g(pke pke) {
        l().c(new oi0(this.a, pke));
    }

    public final dle i() {
        return new au(this.X, Long.valueOf(this.Z), this.u0, Integer.valueOf(this.s0), Integer.valueOf(this.t0));
    }
}
