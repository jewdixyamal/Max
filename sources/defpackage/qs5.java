package defpackage;

/* renamed from: qs5  reason: default package */
public final class qs5 implements la5 {
    public nlf A0;
    public final hwc X;
    public pa5 Y;
    public int Z;
    public final wpa a = new wpa(4);
    public final wpa b = new wpa(9);
    public final wpa c = new wpa(11);
    public final wpa o = new wpa();
    public boolean s0;
    public long t0;
    public int u0;
    public int v0;
    public int w0;
    public long x0;
    public boolean y0;
    public j70 z0;

    /* JADX WARNING: type inference failed for: r0v4, types: [hwc, u2] */
    public qs5() {
        ? u2Var = new u2(11, (Object) new sk4());
        u2Var.c = -9223372036854775807L;
        u2Var.o = new long[0];
        u2Var.X = new long[0];
        this.X = u2Var;
        this.Z = 1;
    }

    public final void S(pa5 pa5) {
        this.Y = pa5;
    }

    public final wpa a(sa4 sa4) {
        int i = this.w0;
        wpa wpa = this.o;
        byte[] bArr = wpa.a;
        if (i > bArr.length) {
            wpa.E(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            wpa.G(0);
        }
        wpa.F(this.w0);
        sa4.h(wpa.a, 0, this.w0, false);
        return wpa;
    }

    public final void d(long j, long j2) {
        if (j == 0) {
            this.Z = 1;
            this.s0 = false;
        } else {
            this.Z = 3;
        }
        this.u0 = 0;
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [j70, u2] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0006 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.na5 r16, defpackage.lh4 r17) {
        /*
            r15 = this;
            r0 = r15
            pa5 r1 = r0.Y
            defpackage.fm9.l(r1)
        L_0x0006:
            int r1 = r0.Z
            r2 = 4
            r3 = 0
            r4 = 1
            r5 = -1
            r6 = 9
            r7 = 8
            r8 = 2
            if (r1 == r4) goto L_0x0137
            r9 = 3
            if (r1 == r8) goto L_0x0128
            if (r1 == r9) goto L_0x00eb
            if (r1 != r2) goto L_0x00e5
            boolean r1 = r0.s0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            hwc r5 = r0.X
            if (r1 == 0) goto L_0x002b
            long r13 = r0.t0
            long r11 = r0.x0
            long r13 = r13 + r11
            goto L_0x0036
        L_0x002b:
            long r11 = r5.c
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0034
            r13 = 0
            goto L_0x0036
        L_0x0034:
            long r13 = r0.x0
        L_0x0036:
            int r1 = r0.v0
            if (r1 != r7) goto L_0x0061
            j70 r7 = r0.z0
            if (r7 == 0) goto L_0x0061
            boolean r1 = r0.y0
            if (r1 != 0) goto L_0x004e
            pa5 r1 = r0.Y
            wd0 r6 = new wd0
            r6.<init>(r9)
            r1.J(r6)
            r0.y0 = r4
        L_0x004e:
            j70 r1 = r0.z0
            r6 = r16
            sa4 r6 = (defpackage.sa4) r6
            wpa r6 = r15.a(r6)
            r1.Z1(r6)
            boolean r1 = r1.a2(r13, r6)
        L_0x005f:
            r6 = r4
            goto L_0x00c8
        L_0x0061:
            if (r1 != r6) goto L_0x008f
            nlf r6 = r0.A0
            if (r6 == 0) goto L_0x008f
            boolean r1 = r0.y0
            if (r1 != 0) goto L_0x0077
            pa5 r1 = r0.Y
            wd0 r6 = new wd0
            r6.<init>(r9)
            r1.J(r6)
            r0.y0 = r4
        L_0x0077:
            nlf r1 = r0.A0
            r6 = r16
            sa4 r6 = (defpackage.sa4) r6
            wpa r6 = r15.a(r6)
            boolean r7 = r1.Z1(r6)
            if (r7 == 0) goto L_0x00bb
            boolean r1 = r1.a2(r13, r6)
            if (r1 == 0) goto L_0x00bb
            r1 = r4
            goto L_0x005f
        L_0x008f:
            r6 = 18
            if (r1 != r6) goto L_0x00bd
            boolean r1 = r0.y0
            if (r1 != 0) goto L_0x00bd
            r1 = r16
            sa4 r1 = (defpackage.sa4) r1
            wpa r1 = r15.a(r1)
            r5.getClass()
            r5.Z1(r13, r1)
            long r6 = r5.c
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x00bb
            pa5 r1 = r0.Y
            vz6 r11 = new vz6
            long[] r12 = r5.X
            long[] r13 = r5.o
            r11.<init>(r6, r12, r13)
            r1.J(r11)
            r0.y0 = r4
        L_0x00bb:
            r1 = r3
            goto L_0x005f
        L_0x00bd:
            int r1 = r0.w0
            r6 = r16
            sa4 r6 = (defpackage.sa4) r6
            r6.z(r1)
            r1 = r3
            r6 = r1
        L_0x00c8:
            boolean r7 = r0.s0
            if (r7 != 0) goto L_0x00de
            if (r1 == 0) goto L_0x00de
            r0.s0 = r4
            long r4 = r5.c
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x00da
            long r4 = r0.x0
            long r11 = -r4
            goto L_0x00dc
        L_0x00da:
            r11 = 0
        L_0x00dc:
            r0.t0 = r11
        L_0x00de:
            r0.u0 = r2
            r0.Z = r8
            if (r6 == 0) goto L_0x0006
            return r3
        L_0x00e5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00eb:
            wpa r1 = r0.c
            byte[] r6 = r1.a
            r7 = 11
            r8 = r16
            sa4 r8 = (defpackage.sa4) r8
            boolean r4 = r8.h(r6, r3, r7, r4)
            if (r4 != 0) goto L_0x00fc
            return r5
        L_0x00fc:
            r1.G(r3)
            int r3 = r1.u()
            r0.v0 = r3
            int r3 = r1.x()
            r0.w0 = r3
            int r3 = r1.x()
            long r3 = (long) r3
            r0.x0 = r3
            int r3 = r1.u()
            int r3 = r3 << 24
            long r3 = (long) r3
            long r5 = r0.x0
            long r3 = r3 | r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r0.x0 = r3
            r1.H(r9)
            r0.Z = r2
            goto L_0x0006
        L_0x0128:
            int r1 = r0.u0
            r2 = r16
            sa4 r2 = (defpackage.sa4) r2
            r2.z(r1)
            r0.u0 = r3
            r0.Z = r9
            goto L_0x0006
        L_0x0137:
            wpa r1 = r0.b
            byte[] r9 = r1.a
            r10 = r16
            sa4 r10 = (defpackage.sa4) r10
            boolean r9 = r10.h(r9, r3, r6, r4)
            if (r9 != 0) goto L_0x0146
            return r5
        L_0x0146:
            r1.G(r3)
            r1.H(r2)
            int r2 = r1.u()
            r5 = r2 & 4
            if (r5 == 0) goto L_0x0156
            r5 = r4
            goto L_0x0157
        L_0x0156:
            r5 = r3
        L_0x0157:
            r2 = r2 & 1
            if (r2 == 0) goto L_0x015c
            r3 = r4
        L_0x015c:
            if (r5 == 0) goto L_0x0171
            j70 r2 = r0.z0
            if (r2 != 0) goto L_0x0171
            j70 r2 = new j70
            pa5 r5 = r0.Y
            yze r4 = r5.B(r7, r4)
            r5 = 11
            r2.<init>((int) r5, (java.lang.Object) r4)
            r0.z0 = r2
        L_0x0171:
            if (r3 == 0) goto L_0x0184
            nlf r2 = r0.A0
            if (r2 != 0) goto L_0x0184
            nlf r2 = new nlf
            pa5 r3 = r0.Y
            yze r3 = r3.B(r6, r8)
            r2.<init>(r3)
            r0.A0 = r2
        L_0x0184:
            pa5 r2 = r0.Y
            r2.w()
            int r1 = r1.g()
            int r1 = r1 + -5
            r0.u0 = r1
            r0.Z = r8
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qs5.g(na5, lh4):int");
    }

    public final boolean n(na5 na5) {
        wpa wpa = this.a;
        ((sa4) na5).q(wpa.a, 0, 3, false);
        wpa.G(0);
        if (wpa.x() != 4607062) {
            return false;
        }
        sa4 sa4 = (sa4) na5;
        sa4.q(wpa.a, 0, 2, false);
        wpa.G(0);
        if ((wpa.A() & 250) != 0) {
            return false;
        }
        sa4.q(wpa.a, 0, 4, false);
        wpa.G(0);
        int g = wpa.g();
        sa4.Y = 0;
        sa4.b(g, false);
        sa4.q(wpa.a, 0, 4, false);
        wpa.G(0);
        return wpa.g() == 0;
    }

    public final void release() {
    }
}
