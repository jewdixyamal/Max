package defpackage;

/* renamed from: he4  reason: default package */
public final class he4 extends we4 implements Comparable {
    public final boolean A0;
    public final int B0;
    public final int C0;
    public final int D0;
    public final int E0;
    public final boolean F0;
    public final boolean G0;
    public final int X;
    public final boolean Y;
    public final String Z = bf4.f(this.o.c);
    public final ne4 s0;
    public final boolean t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final boolean x0;
    public final int y0;
    public final int z0;

    public he4(int i, qze qze, int i2, ne4 ne4, int i3, boolean z) {
        super(i, qze, i2);
        int i4;
        int i5;
        int i6;
        boolean z2;
        this.s0 = ne4;
        int i7 = 0;
        this.t0 = bf4.d(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= ne4.y0.size()) {
                i5 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            }
            i5 = bf4.c(this.o, (String) ne4.y0.get(i8), false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.v0 = i8;
        this.u0 = i5;
        this.w0 = bf4.a(this.o.X, ne4.z0);
        oy5 oy5 = this.o;
        int i9 = oy5.X;
        this.x0 = i9 == 0 || (i9 & 1) != 0;
        this.A0 = (oy5.o & 1) != 0;
        int i10 = oy5.J0;
        this.B0 = i10;
        this.C0 = oy5.K0;
        int i11 = oy5.s0;
        this.D0 = i11;
        this.Y = (i11 == -1 || i11 <= ne4.B0) && (i10 == -1 || i10 <= ne4.A0);
        String[] y = maf.y();
        int i12 = 0;
        while (true) {
            if (i12 >= y.length) {
                i6 = 0;
                i12 = Integer.MAX_VALUE;
                break;
            }
            i6 = bf4.c(this.o, y[i12], false);
            if (i6 > 0) {
                break;
            }
            i12++;
        }
        this.y0 = i12;
        this.z0 = i6;
        int i13 = 0;
        while (true) {
            zw6 zw6 = ne4.C0;
            if (i13 < zw6.size()) {
                String str = this.o.w0;
                if (str != null && str.equals(zw6.get(i13))) {
                    i4 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        this.E0 = i4;
        this.F0 = uj0.f(i3) == 128;
        this.G0 = uj0.g(i3) == 64;
        ne4 ne42 = this.s0;
        if (bf4.d(i3, ne42.U0) && ((z2 = this.Y) || ne42.P0)) {
            i7 = (!bf4.d(i3, false) || !z2 || this.o.s0 == -1 || ne42.H0 || ne42.G0 || (!ne42.W0 && z)) ? 1 : 2;
        }
        this.X = i7;
    }

    public final int a() {
        return this.X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        r1 = r4.K0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = r7.F0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r4.J0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = r4.w0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.we4 r7) {
        /*
            r6 = this;
            he4 r7 = (defpackage.he4) r7
            ne4 r0 = r6.s0
            boolean r1 = r0.S0
            oy5 r2 = r7.o
            r3 = -1
            oy5 r4 = r6.o
            if (r1 != 0) goto L_0x0015
            int r1 = r4.J0
            if (r1 == r3) goto L_0x0042
            int r5 = r2.J0
            if (r1 != r5) goto L_0x0042
        L_0x0015:
            boolean r1 = r0.Q0
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = r4.w0
            if (r1 == 0) goto L_0x0042
            java.lang.String r5 = r2.w0
            boolean r1 = android.text.TextUtils.equals(r1, r5)
            if (r1 == 0) goto L_0x0042
        L_0x0025:
            boolean r1 = r0.R0
            if (r1 != 0) goto L_0x0031
            int r1 = r4.K0
            if (r1 == r3) goto L_0x0042
            int r2 = r2.K0
            if (r1 != r2) goto L_0x0042
        L_0x0031:
            boolean r0 = r0.T0
            if (r0 != 0) goto L_0x0044
            boolean r0 = r7.F0
            boolean r1 = r6.F0
            if (r1 != r0) goto L_0x0042
            boolean r6 = r6.G0
            boolean r7 = r7.G0
            if (r6 != r7) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r6 = 0
            goto L_0x0045
        L_0x0044:
            r6 = 1
        L_0x0045:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he4.b(we4):boolean");
    }

    /* renamed from: c */
    public final int compareTo(he4 he4) {
        boolean z = this.t0;
        boolean z2 = this.Y;
        zma b = (!z2 || !z) ? bf4.f.b() : bf4.f;
        aa3 d = aa3.a.d(z, he4.t0);
        Integer valueOf = Integer.valueOf(this.v0);
        Integer valueOf2 = Integer.valueOf(he4.v0);
        sm9.a.getClass();
        dkc dkc = dkc.a;
        aa3 c = d.c(valueOf, valueOf2, dkc).a(this.u0, he4.u0).a(this.w0, he4.w0).d(this.A0, he4.A0).d(this.x0, he4.x0).c(Integer.valueOf(this.y0), Integer.valueOf(he4.y0), dkc).a(this.z0, he4.z0).d(z2, he4.Y).c(Integer.valueOf(this.E0), Integer.valueOf(he4.E0), dkc);
        int i = this.D0;
        Integer valueOf3 = Integer.valueOf(i);
        int i2 = he4.D0;
        aa3 c2 = c.c(valueOf3, Integer.valueOf(i2), this.s0.G0 ? bf4.f.b() : bf4.g).d(this.F0, he4.F0).d(this.G0, he4.G0).c(Integer.valueOf(this.B0), Integer.valueOf(he4.B0), b).c(Integer.valueOf(this.C0), Integer.valueOf(he4.C0), b);
        Integer valueOf4 = Integer.valueOf(i);
        Integer valueOf5 = Integer.valueOf(i2);
        if (!maf.a(this.Z, he4.Z)) {
            b = bf4.g;
        }
        return c2.c(valueOf4, valueOf5, b).f();
    }
}
