package defpackage;

import java.util.Comparator;

/* renamed from: se4  reason: default package */
public final class se4 extends we4 implements Comparable {
    public final int X;
    public final boolean Y;
    public final boolean Z;
    public final boolean s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final boolean x0;

    public se4(int i, qze qze, int i2, ne4 ne4, int i3, String str) {
        super(i, qze, i2);
        int i4;
        int i5 = 0;
        this.Y = bf4.d(i3, false);
        int i6 = this.o.o & (~ne4.K0);
        this.Z = (i6 & 1) != 0;
        this.s0 = (i6 & 2) != 0;
        zw6 zw6 = ne4.D0;
        zw6 n = zw6.isEmpty() ? zw6.n("") : zw6;
        int i7 = 0;
        while (true) {
            if (i7 >= n.size()) {
                i7 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = bf4.c(this.o, (String) n.get(i7), ne4.F0);
            if (i4 > 0) {
                break;
            }
            i7++;
        }
        this.t0 = i7;
        this.u0 = i4;
        int a = bf4.a(this.o.X, ne4.E0);
        this.v0 = a;
        this.x0 = (this.o.X & 1088) != 0;
        int c = bf4.c(this.o, str, bf4.f(str) == null);
        this.w0 = c;
        boolean z = i4 > 0 || (zw6.isEmpty() && a > 0) || this.Z || (this.s0 && c > 0);
        if (bf4.d(i3, ne4.U0) && z) {
            i5 = 1;
        }
        this.X = i5;
    }

    public final int a() {
        return this.X;
    }

    public final /* bridge */ /* synthetic */ boolean b(we4 we4) {
        se4 se4 = (se4) we4;
        return false;
    }

    /* renamed from: c */
    public final int compareTo(se4 se4) {
        aa3 d = aa3.a.d(this.Y, se4.Y);
        Integer valueOf = Integer.valueOf(this.t0);
        Integer valueOf2 = Integer.valueOf(se4.t0);
        Comparator comparator = sm9.a;
        comparator.getClass();
        Comparator comparator2 = dkc.a;
        aa3 c = d.c(valueOf, valueOf2, comparator2);
        int i = this.u0;
        aa3 a = c.a(i, se4.u0);
        int i2 = this.v0;
        aa3 d2 = a.a(i2, se4.v0).d(this.Z, se4.Z);
        Boolean valueOf3 = Boolean.valueOf(this.s0);
        Boolean valueOf4 = Boolean.valueOf(se4.s0);
        if (i != 0) {
            comparator = comparator2;
        }
        aa3 a2 = d2.c(valueOf3, valueOf4, comparator).a(this.w0, se4.w0);
        if (i2 == 0) {
            a2 = a2.e(this.x0, se4.x0);
        }
        return a2.f();
    }
}
