package defpackage;

/* renamed from: ps5  reason: default package */
public final class ps5 implements ka5 {
    public final yaf a = new yaf(4);
    public final yaf b = new yaf(9);
    public final yaf c = new yaf(11);
    public final yaf d = new yaf(3, false);
    public final gwc e;
    public oa5 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public i70 o;
    public mlf p;

    /* JADX WARNING: type inference failed for: r0v4, types: [gwc, u2] */
    public ps5() {
        ? u2Var = new u2(10, (Object) new dt4());
        u2Var.c = -9223372036854775807L;
        u2Var.o = new long[0];
        u2Var.X = new long[0];
        this.e = u2Var;
        this.g = 1;
    }

    public final yaf a(ra4 ra4) {
        int i2 = this.l;
        yaf yaf = this.d;
        byte[] bArr = yaf.a;
        if (i2 > bArr.length) {
            yaf.F(0, new byte[Math.max(bArr.length * 2, i2)]);
        } else {
            yaf.H(0);
        }
        yaf.G(this.l);
        ra4.h(yaf.a, 0, this.l, false);
        return yaf;
    }

    public final void d(long j2, long j3) {
        if (j2 == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    public final void g(oa5 oa5) {
        this.f = oa5;
    }

    public final boolean h(ma5 ma5) {
        yaf yaf = this.a;
        ra4 ra4 = (ra4) ma5;
        ra4.q(yaf.a, 0, 3, false);
        yaf.H(0);
        if (yaf.x() != 4607062) {
            return false;
        }
        ra4.q(yaf.a, 0, 2, false);
        yaf.H(0);
        if ((yaf.A() & 250) != 0) {
            return false;
        }
        ra4.q(yaf.a, 0, 4, false);
        yaf.H(0);
        int h2 = yaf.h();
        ra4.Y = 0;
        ra4.b(h2, false);
        ra4.q(yaf.a, 0, 4, false);
        yaf.H(0);
        return yaf.h() == 0;
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [i70, u2] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0006 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.ma5 r16, defpackage.lh4 r17) {
        /*
            r15 = this;
            r0 = r15
            oa5 r1 = r0.f
            defpackage.np8.g(r1)
        L_0x0006:
            int r1 = r0.g
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
            boolean r1 = r0.h
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            gwc r5 = r0.e
            if (r1 == 0) goto L_0x002b
            long r13 = r0.i
            long r11 = r0.m
            long r13 = r13 + r11
            goto L_0x0036
        L_0x002b:
            long r11 = r5.c
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0034
            r13 = 0
            goto L_0x0036
        L_0x0034:
            long r13 = r0.m
        L_0x0036:
            int r1 = r0.k
            if (r1 != r7) goto L_0x0061
            i70 r7 = r0.o
            if (r7 == 0) goto L_0x0061
            boolean r1 = r0.n
            if (r1 != 0) goto L_0x004e
            oa5 r1 = r0.f
            pm5 r6 = new pm5
            r6.<init>(r9)
            r1.M(r6)
            r0.n = r4
        L_0x004e:
            i70 r1 = r0.o
            r6 = r16
            ra4 r6 = (defpackage.ra4) r6
            yaf r6 = r15.a(r6)
            r1.Z1(r6)
            boolean r1 = r1.a2(r13, r6)
        L_0x005f:
            r6 = r4
            goto L_0x00c8
        L_0x0061:
            if (r1 != r6) goto L_0x008f
            mlf r6 = r0.p
            if (r6 == 0) goto L_0x008f
            boolean r1 = r0.n
            if (r1 != 0) goto L_0x0077
            oa5 r1 = r0.f
            pm5 r6 = new pm5
            r6.<init>(r9)
            r1.M(r6)
            r0.n = r4
        L_0x0077:
            mlf r1 = r0.p
            r6 = r16
            ra4 r6 = (defpackage.ra4) r6
            yaf r6 = r15.a(r6)
            boolean r7 = r1.Z1(r6)
            if (r7 == 0) goto L_0x00bb
            boolean r1 = r1.a2(r13, r6)
            if (r1 == 0) goto L_0x00bb
            r1 = r4
            goto L_0x005f
        L_0x008f:
            r6 = 18
            if (r1 != r6) goto L_0x00bd
            boolean r1 = r0.n
            if (r1 != 0) goto L_0x00bd
            r1 = r16
            ra4 r1 = (defpackage.ra4) r1
            yaf r1 = r15.a(r1)
            r5.getClass()
            r5.Z1(r13, r1)
            long r6 = r5.c
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x00bb
            oa5 r1 = r0.f
            uz6 r11 = new uz6
            long[] r12 = r5.X
            long[] r13 = r5.o
            r11.<init>(r6, r12, r13)
            r1.M(r11)
            r0.n = r4
        L_0x00bb:
            r1 = r3
            goto L_0x005f
        L_0x00bd:
            int r1 = r0.l
            r6 = r16
            ra4 r6 = (defpackage.ra4) r6
            r6.z(r1)
            r1 = r3
            r6 = r1
        L_0x00c8:
            boolean r7 = r0.h
            if (r7 != 0) goto L_0x00de
            if (r1 == 0) goto L_0x00de
            r0.h = r4
            long r4 = r5.c
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x00da
            long r4 = r0.m
            long r11 = -r4
            goto L_0x00dc
        L_0x00da:
            r11 = 0
        L_0x00dc:
            r0.i = r11
        L_0x00de:
            r0.j = r2
            r0.g = r8
            if (r6 == 0) goto L_0x0006
            return r3
        L_0x00e5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00eb:
            yaf r1 = r0.c
            byte[] r6 = r1.a
            r7 = 11
            r8 = r16
            ra4 r8 = (defpackage.ra4) r8
            boolean r4 = r8.h(r6, r3, r7, r4)
            if (r4 != 0) goto L_0x00fc
            return r5
        L_0x00fc:
            r1.H(r3)
            int r3 = r1.v()
            r0.k = r3
            int r3 = r1.x()
            r0.l = r3
            int r3 = r1.x()
            long r3 = (long) r3
            r0.m = r3
            int r3 = r1.v()
            int r3 = r3 << 24
            long r3 = (long) r3
            long r5 = r0.m
            long r3 = r3 | r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r0.m = r3
            r1.I(r9)
            r0.g = r2
            goto L_0x0006
        L_0x0128:
            int r1 = r0.j
            r2 = r16
            ra4 r2 = (defpackage.ra4) r2
            r2.z(r1)
            r0.j = r3
            r0.g = r9
            goto L_0x0006
        L_0x0137:
            yaf r1 = r0.b
            byte[] r9 = r1.a
            r10 = r16
            ra4 r10 = (defpackage.ra4) r10
            boolean r9 = r10.h(r9, r3, r6, r4)
            if (r9 != 0) goto L_0x0146
            return r5
        L_0x0146:
            r1.H(r3)
            r1.I(r2)
            int r2 = r1.v()
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
            i70 r2 = r0.o
            if (r2 != 0) goto L_0x0171
            i70 r2 = new i70
            oa5 r5 = r0.f
            xze r4 = r5.B(r7, r4)
            r5 = 10
            r2.<init>((int) r5, (java.lang.Object) r4)
            r0.o = r2
        L_0x0171:
            if (r3 == 0) goto L_0x0184
            mlf r2 = r0.p
            if (r2 != 0) goto L_0x0184
            mlf r2 = new mlf
            oa5 r3 = r0.f
            xze r3 = r3.B(r6, r8)
            r2.<init>(r3)
            r0.p = r2
        L_0x0184:
            oa5 r2 = r0.f
            r2.w()
            int r1 = r1.h()
            int r1 = r1 + -5
            r0.j = r1
            r0.g = r8
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps5.i(ma5, lh4):int");
    }

    public final void release() {
    }
}
