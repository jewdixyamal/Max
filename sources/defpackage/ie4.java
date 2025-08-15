package defpackage;

/* renamed from: ie4  reason: default package */
public final class ie4 extends xe4 implements Comparable {
    public final int A0;
    public final boolean B0;
    public final int C0;
    public final int D0;
    public final int E0;
    public final int F0;
    public final boolean G0;
    public final boolean H0;
    public final int X;
    public final boolean Y;
    public final String Z;
    public final oe4 s0;
    public final boolean t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final boolean x0;
    public final boolean y0;
    public final int z0;

    public ie4(int i, rze rze, int i2, oe4 oe4, int i3, boolean z, ge4 ge4, int i4) {
        super(i, rze, i2);
        int i5;
        int i6;
        int i7;
        boolean z2;
        this.s0 = oe4;
        int i8 = oe4.r0 ? 24 : 16;
        int i9 = 1;
        int i10 = 0;
        this.x0 = oe4.n0 && (i4 & i8) != 0;
        this.Z = cf4.h(this.o.d);
        this.t0 = vj0.n(i3, false);
        int i11 = 0;
        while (true) {
            zw6 zw6 = oe4.n;
            i5 = Integer.MAX_VALUE;
            if (i11 >= zw6.size()) {
                i6 = 0;
                i11 = Integer.MAX_VALUE;
                break;
            }
            i6 = cf4.e(this.o, (String) zw6.get(i11), false);
            if (i6 > 0) {
                break;
            }
            i11++;
        }
        this.v0 = i11;
        this.u0 = i6;
        this.w0 = cf4.c(this.o.f, oe4.o);
        qy5 qy5 = this.o;
        int i12 = qy5.f;
        this.y0 = i12 == 0 || (i12 & 1) != 0;
        this.B0 = (qy5.e & 1) != 0;
        int i13 = qy5.B;
        this.C0 = i13;
        this.D0 = qy5.C;
        int i14 = qy5.i;
        this.E0 = i14;
        this.Y = (i14 == -1 || i14 <= oe4.q) && (i13 == -1 || i13 <= oe4.p) && ge4.apply(qy5);
        String[] F = oaf.F();
        int i15 = 0;
        while (true) {
            if (i15 >= F.length) {
                i7 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            }
            i7 = cf4.e(this.o, F[i15], false);
            if (i7 > 0) {
                break;
            }
            i15++;
        }
        this.z0 = i15;
        this.A0 = i7;
        int i16 = 0;
        while (true) {
            zw6 zw62 = oe4.r;
            if (i16 < zw62.size()) {
                String str = this.o.n;
                if (str != null && str.equals(zw62.get(i16))) {
                    i5 = i16;
                    break;
                }
                i16++;
            } else {
                break;
            }
        }
        this.F0 = i5;
        this.G0 = vj0.h(i3) == 128;
        this.H0 = vj0.i(i3) == 64;
        oe4 oe42 = this.s0;
        if (vj0.n(i3, oe42.t0) && ((z2 = this.Y) || oe42.m0)) {
            f0f f0f = oe42.s;
            int i17 = f0f.a;
            qy5 qy52 = this.o;
            if (i17 != 2 || cf4.i(oe42, i3, qy52)) {
                if (vj0.n(i3, false) && z2 && qy52.i != -1 && !oe42.z && !oe42.y && !((!oe42.v0 && z) || f0f.a == 2 || (i8 & i3) == 0)) {
                    i9 = 2;
                }
                i10 = i9;
            }
        }
        this.X = i10;
    }

    public final int a() {
        return this.X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        r1 = r4.C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = r7.G0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r4.B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = r4.n;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.xe4 r7) {
        /*
            r6 = this;
            ie4 r7 = (defpackage.ie4) r7
            oe4 r0 = r6.s0
            boolean r1 = r0.p0
            qy5 r2 = r7.o
            r3 = -1
            qy5 r4 = r6.o
            if (r1 != 0) goto L_0x0015
            int r1 = r4.B
            if (r1 == r3) goto L_0x0042
            int r5 = r2.B
            if (r1 != r5) goto L_0x0042
        L_0x0015:
            boolean r1 = r6.x0
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = r4.n
            if (r1 == 0) goto L_0x0042
            java.lang.String r5 = r2.n
            boolean r1 = android.text.TextUtils.equals(r1, r5)
            if (r1 == 0) goto L_0x0042
        L_0x0025:
            boolean r1 = r0.o0
            if (r1 != 0) goto L_0x0031
            int r1 = r4.C
            if (r1 == r3) goto L_0x0042
            int r2 = r2.C
            if (r1 != r2) goto L_0x0042
        L_0x0031:
            boolean r0 = r0.q0
            if (r0 != 0) goto L_0x0044
            boolean r0 = r7.G0
            boolean r1 = r6.G0
            if (r1 != r0) goto L_0x0042
            boolean r6 = r6.H0
            boolean r7 = r7.H0
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie4.b(xe4):boolean");
    }

    /* renamed from: c */
    public final int compareTo(ie4 ie4) {
        boolean z = this.t0;
        boolean z2 = this.Y;
        zma b = (!z2 || !z) ? cf4.j.b() : cf4.j;
        aa3 d = aa3.a.d(z, ie4.t0);
        Integer valueOf = Integer.valueOf(this.v0);
        Integer valueOf2 = Integer.valueOf(ie4.v0);
        sm9.a.getClass();
        dkc dkc = dkc.a;
        aa3 c = d.c(valueOf, valueOf2, dkc).a(this.u0, ie4.u0).a(this.w0, ie4.w0).d(this.B0, ie4.B0).d(this.y0, ie4.y0).c(Integer.valueOf(this.z0), Integer.valueOf(ie4.z0), dkc).a(this.A0, ie4.A0).d(z2, ie4.Y).c(Integer.valueOf(this.F0), Integer.valueOf(ie4.F0), dkc);
        boolean z3 = this.s0.y;
        int i = this.E0;
        int i2 = ie4.E0;
        if (z3) {
            c = c.c(Integer.valueOf(i), Integer.valueOf(i2), cf4.j.b());
        }
        aa3 c2 = c.d(this.G0, ie4.G0).d(this.H0, ie4.H0).c(Integer.valueOf(this.C0), Integer.valueOf(ie4.C0), b).c(Integer.valueOf(this.D0), Integer.valueOf(ie4.D0), b);
        if (oaf.a(this.Z, ie4.Z)) {
            c2 = c2.c(Integer.valueOf(i), Integer.valueOf(i2), b);
        }
        return c2.f();
    }
}
