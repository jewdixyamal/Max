package defpackage;

import com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException;

/* renamed from: z33  reason: default package */
public final class z33 implements yd8, wd8 {
    public long X;
    public long Y;
    public ClippingMediaSource$IllegalClippingException Z;
    public final yd8 a;
    public wd8 b;
    public x33[] c = new x33[0];
    public long o;

    public z33(yd8 yd8, boolean z, long j, long j2) {
        this.a = yd8;
        this.o = z ? j : -9223372036854775807L;
        this.X = j;
        this.Y = j2;
    }

    public final long A(long j, w1d w1d) {
        long j2 = this.X;
        if (j == j2) {
            return j2;
        }
        long k = maf.k(w1d.a, 0, j - j2);
        long j3 = this.Y;
        long k2 = maf.k(w1d.b, 0, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (!(k == w1d.a && k2 == w1d.b)) {
            w1d = new w1d(k, k2);
        }
        return this.a.A(j, w1d);
    }

    public final boolean C(long j) {
        return this.a.C(j);
    }

    public final void J(wd8 wd8, long j) {
        this.b = wd8;
        this.a.J(this, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011f, code lost:
        if (r1 > r3) goto L_0x0122;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long L(defpackage.m85[] r16, boolean[] r17, defpackage.frc[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            r10 = 1
            int r1 = r9.length
            x33[] r1 = new defpackage.x33[r1]
            r0.c = r1
            int r1 = r9.length
            frc[] r11 = new defpackage.frc[r1]
            r12 = 0
            r1 = r12
        L_0x0010:
            int r2 = r9.length
            r13 = 0
            if (r1 >= r2) goto L_0x0024
            x33[] r2 = r0.c
            r3 = r9[r1]
            x33 r3 = (defpackage.x33) r3
            r2[r1] = r3
            if (r3 == 0) goto L_0x0020
            frc r13 = r3.a
        L_0x0020:
            r11[r1] = r13
            int r1 = r1 + r10
            goto L_0x0010
        L_0x0024:
            yd8 r1 = r0.a
            r2 = r16
            r3 = r17
            r4 = r11
            r5 = r19
            r6 = r20
            long r1 = r1.L(r2, r3, r4, r5, r6)
            boolean r3 = r15.b()
            if (r3 == 0) goto L_0x0104
            long r3 = r0.X
            int r5 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0104
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0104
            int r3 = r8.length
            r4 = r12
        L_0x0047:
            if (r4 >= r3) goto L_0x0104
            r5 = r8[r4]
            if (r5 == 0) goto L_0x0101
            oy5 r5 = r5.j()
            java.lang.String r6 = r5.w0
            java.util.ArrayList r7 = defpackage.ha9.a
            if (r6 != 0) goto L_0x0059
            goto L_0x00ff
        L_0x0059:
            r7 = -1
            int r14 = r6.hashCode()
            switch(r14) {
                case -2123537834: goto L_0x00da;
                case -432837260: goto L_0x00cf;
                case -432837259: goto L_0x00c4;
                case -53558318: goto L_0x00b9;
                case 187078296: goto L_0x00ae;
                case 187094639: goto L_0x00a3;
                case 1504578661: goto L_0x0098;
                case 1504619009: goto L_0x008d;
                case 1504831518: goto L_0x007f;
                case 1903231877: goto L_0x0071;
                case 1903589369: goto L_0x0063;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x00e4
        L_0x0063:
            java.lang.String r14 = "audio/g711-mlaw"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x006d
            goto L_0x00e4
        L_0x006d:
            r7 = 10
            goto L_0x00e4
        L_0x0071:
            java.lang.String r14 = "audio/g711-alaw"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x007b
            goto L_0x00e4
        L_0x007b:
            r7 = 9
            goto L_0x00e4
        L_0x007f:
            java.lang.String r14 = "audio/mpeg"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x0089
            goto L_0x00e4
        L_0x0089:
            r7 = 8
            goto L_0x00e4
        L_0x008d:
            java.lang.String r14 = "audio/flac"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x0096
            goto L_0x00e4
        L_0x0096:
            r7 = 7
            goto L_0x00e4
        L_0x0098:
            java.lang.String r14 = "audio/eac3"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x00a1
            goto L_0x00e4
        L_0x00a1:
            r7 = 6
            goto L_0x00e4
        L_0x00a3:
            java.lang.String r14 = "audio/raw"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x00ac
            goto L_0x00e4
        L_0x00ac:
            r7 = 5
            goto L_0x00e4
        L_0x00ae:
            java.lang.String r14 = "audio/ac3"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x00b7
            goto L_0x00e4
        L_0x00b7:
            r7 = 4
            goto L_0x00e4
        L_0x00b9:
            java.lang.String r14 = "audio/mp4a-latm"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x00c2
            goto L_0x00e4
        L_0x00c2:
            r7 = 3
            goto L_0x00e4
        L_0x00c4:
            java.lang.String r14 = "audio/mpeg-L2"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x00cd
            goto L_0x00e4
        L_0x00cd:
            r7 = 2
            goto L_0x00e4
        L_0x00cf:
            java.lang.String r14 = "audio/mpeg-L1"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x00d8
            goto L_0x00e4
        L_0x00d8:
            r7 = r10
            goto L_0x00e4
        L_0x00da:
            java.lang.String r14 = "audio/eac3-joc"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r7 = r12
        L_0x00e4:
            switch(r7) {
                case 0: goto L_0x0101;
                case 1: goto L_0x0101;
                case 2: goto L_0x0101;
                case 3: goto L_0x00e8;
                case 4: goto L_0x0101;
                case 5: goto L_0x0101;
                case 6: goto L_0x0101;
                case 7: goto L_0x0101;
                case 8: goto L_0x0101;
                case 9: goto L_0x0101;
                case 10: goto L_0x0101;
                default: goto L_0x00e7;
            }
        L_0x00e7:
            goto L_0x00ff
        L_0x00e8:
            java.lang.String r5 = r5.t0
            if (r5 != 0) goto L_0x00ed
            goto L_0x00ff
        L_0x00ed:
            jt r5 = defpackage.ha9.e(r5)
            if (r5 != 0) goto L_0x00f4
            goto L_0x00ff
        L_0x00f4:
            int r5 = r5.b()
            if (r5 == 0) goto L_0x00ff
            r6 = 16
            if (r5 == r6) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            r3 = r1
            goto L_0x0109
        L_0x0101:
            int r4 = r4 + r10
            goto L_0x0047
        L_0x0104:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0109:
            r0.o = r3
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L_0x0124
            long r3 = r0.X
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0122
            long r3 = r0.Y
            r5 = -9223372036854775808
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0124
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r3 = r12
            goto L_0x0125
        L_0x0124:
            r3 = r10
        L_0x0125:
            defpackage.np8.f(r3)
        L_0x0128:
            int r3 = r9.length
            if (r12 >= r3) goto L_0x014d
            r3 = r11[r12]
            if (r3 != 0) goto L_0x0134
            x33[] r3 = r0.c
            r3[r12] = r13
            goto L_0x0145
        L_0x0134:
            x33[] r4 = r0.c
            r5 = r4[r12]
            if (r5 == 0) goto L_0x013e
            frc r5 = r5.a
            if (r5 == r3) goto L_0x0145
        L_0x013e:
            x33 r5 = new x33
            r5.<init>(r15, r3)
            r4[r12] = r5
        L_0x0145:
            x33[] r3 = r0.c
            r3 = r3[r12]
            r9[r12] = r3
            int r12 = r12 + r10
            goto L_0x0128
        L_0x014d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z33.L(m85[], boolean[], frc[], boolean[], long):long");
    }

    public final boolean a() {
        return this.a.a();
    }

    public final boolean b() {
        return this.o != -9223372036854775807L;
    }

    public final void c(i6d i6d) {
        yd8 yd8 = (yd8) i6d;
        wd8 wd8 = this.b;
        wd8.getClass();
        wd8.c(this);
    }

    public final void d(yd8 yd8) {
        if (this.Z == null) {
            wd8 wd8 = this.b;
            wd8.getClass();
            wd8.d(this);
        }
    }

    public final long f() {
        long f = this.a.f();
        if (f != Long.MIN_VALUE) {
            long j = this.Y;
            if (j == Long.MIN_VALUE || f < j) {
                return f;
            }
        }
        return Long.MIN_VALUE;
    }

    public final void k() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.Z;
        if (clippingMediaSource$IllegalClippingException == null) {
            this.a.k();
            return;
        }
        throw clippingMediaSource$IllegalClippingException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 > r5) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long l(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.o = r0
            x33[] r0 = r5.c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x000c:
            if (r3 >= r1) goto L_0x0017
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0014
            r4.b = r2
        L_0x0014:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0017:
            yd8 r0 = r5.a
            long r0 = r0.l(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0033
            long r6 = r5.X
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0034
            long r5 = r5.Y
            r3 = -9223372036854775808
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0033
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0034
        L_0x0033:
            r2 = 1
        L_0x0034:
            defpackage.np8.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z33.l(long):long");
    }

    public final long n() {
        if (b()) {
            long j = this.o;
            this.o = -9223372036854775807L;
            long n = n();
            return n != -9223372036854775807L ? n : j;
        }
        long n2 = this.a.n();
        if (n2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        np8.f(n2 >= this.X);
        long j2 = this.Y;
        if (j2 == Long.MIN_VALUE || n2 <= j2) {
            z = true;
        }
        np8.f(z);
        return n2;
    }

    public final sze q() {
        return this.a.q();
    }

    public final long r() {
        long r = this.a.r();
        if (r != Long.MIN_VALUE) {
            long j = this.Y;
            if (j == Long.MIN_VALUE || r < j) {
                return r;
            }
        }
        return Long.MIN_VALUE;
    }

    public final void s(long j, boolean z) {
        this.a.s(j, z);
    }

    public final void t(long j) {
        this.a.t(j);
    }
}
