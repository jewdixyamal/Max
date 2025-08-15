package defpackage;

import java.util.Comparator;

/* renamed from: te4  reason: default package */
public final class te4 extends xe4 implements Comparable {
    public final int X;
    public final boolean Y;
    public final boolean Z;
    public final boolean s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final boolean x0;

    public te4(int i, rze rze, int i2, oe4 oe4, int i3, String str) {
        super(i, rze, i2);
        int i4;
        int i5 = 0;
        this.Y = vj0.n(i3, false);
        int i6 = this.o.e & (~oe4.v);
        this.Z = (i6 & 1) != 0;
        this.s0 = (i6 & 2) != 0;
        zw6 zw6 = oe4.t;
        zw6 n = zw6.isEmpty() ? zw6.n("") : zw6;
        int i7 = 0;
        while (true) {
            if (i7 >= n.size()) {
                i7 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = cf4.e(this.o, (String) n.get(i7), oe4.w);
            if (i4 > 0) {
                break;
            }
            i7++;
        }
        this.t0 = i7;
        this.u0 = i4;
        int c = cf4.c(this.o.f, oe4.u);
        this.v0 = c;
        this.x0 = (this.o.f & 1088) != 0;
        int e = cf4.e(this.o, str, cf4.h(str) == null);
        this.w0 = e;
        boolean z = i4 > 0 || (zw6.isEmpty() && c > 0) || this.Z || (this.s0 && e > 0);
        if (vj0.n(i3, oe4.t0) && z) {
            i5 = 1;
        }
        this.X = i5;
    }

    public final int a() {
        return this.X;
    }

    public final /* bridge */ /* synthetic */ boolean b(xe4 xe4) {
        te4 te4 = (te4) xe4;
        return false;
    }

    /* renamed from: c */
    public final int compareTo(te4 te4) {
        aa3 d = aa3.a.d(this.Y, te4.Y);
        Integer valueOf = Integer.valueOf(this.t0);
        Integer valueOf2 = Integer.valueOf(te4.t0);
        Comparator comparator = sm9.a;
        comparator.getClass();
        Comparator comparator2 = dkc.a;
        aa3 c = d.c(valueOf, valueOf2, comparator2);
        int i = this.u0;
        aa3 a = c.a(i, te4.u0);
        int i2 = this.v0;
        aa3 d2 = a.a(i2, te4.v0).d(this.Z, te4.Z);
        Boolean valueOf3 = Boolean.valueOf(this.s0);
        Boolean valueOf4 = Boolean.valueOf(te4.s0);
        if (i != 0) {
            comparator = comparator2;
        }
        aa3 a2 = d2.c(valueOf3, valueOf4, comparator).a(this.w0, te4.w0);
        if (i2 == 0) {
            a2 = a2.e(this.x0, te4.x0);
        }
        return a2.f();
    }
}
