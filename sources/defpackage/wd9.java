package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wd9  reason: default package */
public final class wd9 implements la5, v1d {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public boolean E0;
    public pa5 F0;
    public ud9[] G0;
    public long[][] H0;
    public int I0;
    public long J0;
    public int K0;
    public vc9 L0;
    public final wpa X;
    public final wpa Y;
    public final ArrayDeque Z;
    public final mbe a;
    public final int b;
    public final wpa c;
    public final wpa o;
    public final h2d s0;
    public final ArrayList t0;
    public ffc u0 = ffc.X;
    public int v0;
    public int w0;
    public long x0;
    public int y0;
    public wpa z0;

    public wd9(int i, mbe mbe) {
        this.a = mbe;
        this.b = i;
        ls5 ls5 = zw6.b;
        this.v0 = (i & 4) != 0 ? 3 : 0;
        this.s0 = new h2d();
        this.t0 = new ArrayList();
        this.Y = new wpa(16);
        this.Z = new ArrayDeque();
        this.c = new wpa(fm9.e);
        this.o = new wpa(4);
        this.X = new wpa();
        this.A0 = -1;
        this.F0 = pa5.v;
        this.G0 = new ud9[0];
    }

    public final void S(pa5 pa5) {
        if ((this.b & 16) == 0) {
            pa5 = new k8g(pa5, this.a);
        }
        this.F0 = pa5;
    }

    public final boolean c() {
        return true;
    }

    public final void d(long j, long j2) {
        this.Z.clear();
        this.y0 = 0;
        this.A0 = -1;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        if (j != 0) {
            for (ud9 ud9 : this.G0) {
                a0f a0f = ud9.b;
                int f = oaf.f(a0f.f, j2, false);
                while (true) {
                    if (f < 0) {
                        f = -1;
                        break;
                    } else if ((a0f.g[f] & 1) != 0) {
                        break;
                    } else {
                        f--;
                    }
                }
                if (f == -1) {
                    f = a0f.a(j2);
                }
                ud9.e = f;
                b3f b3f = ud9.d;
                if (b3f != null) {
                    b3f.b = false;
                    b3f.c = 0;
                }
            }
        } else if (this.v0 != 3) {
            this.v0 = 0;
            this.y0 = 0;
        } else {
            h2d h2d = this.s0;
            h2d.a.clear();
            h2d.b = 0;
            this.t0.clear();
        }
    }

    public final t1d e(long j) {
        return i(-1, j);
    }

    public final long f() {
        return this.J0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0475 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.na5 r39, defpackage.lh4 r40) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            r2 = r40
            r4 = 3
            r6 = 2
            r7 = 8
            r8 = 0
            r9 = 4
            r10 = 1
        L_0x000d:
            int r11 = r0.v0
            java.util.ArrayDeque r12 = r0.Z
            wpa r14 = r0.X
            r15 = -1
            r18 = r14
            if (r11 == 0) goto L_0x0480
            r20 = 262144(0x40000, double:1.295163E-318)
            if (r11 == r10) goto L_0x03d7
            r22 = 8
            if (r11 == r6) goto L_0x0241
            if (r11 != r4) goto L_0x023b
            java.util.ArrayList r3 = r0.t0
            h2d r11 = r0.s0
            int r12 = r11.b
            if (r12 == 0) goto L_0x0216
            if (r12 == r10) goto L_0x01e2
            java.util.ArrayList r15 = r11.a
            r5 = 2817(0xb01, float:3.947E-42)
            r14 = 2816(0xb00, float:3.946E-42)
            r13 = 2192(0x890, float:3.072E-42)
            if (r12 == r6) goto L_0x016b
            if (r12 != r4) goto L_0x0165
            long r17 = r39.e()
            long r20 = r39.x()
            long r22 = r39.e()
            long r20 = r20 - r22
            int r11 = r11.c
            long r11 = (long) r11
            long r11 = r20 - r11
            int r11 = (int) r11
            wpa r12 = new wpa
            r12.<init>((int) r11)
            byte[] r6 = r12.a
            r1.readFully(r6, r8, r11)
            r1 = r8
        L_0x0059:
            int r6 = r15.size()
            if (r1 >= r6) goto L_0x015e
            java.lang.Object r6 = r15.get(r1)
            f2d r6 = (defpackage.f2d) r6
            long r10 = r6.a
            long r10 = r10 - r17
            int r10 = (int) r10
            r12.G(r10)
            r12.H(r9)
            int r10 = r12.i()
            java.nio.charset.Charset r11 = defpackage.b52.c
            java.lang.String r9 = r12.s(r10, r11)
            int r21 = r9.hashCode()
            switch(r21) {
                case -1711564334: goto L_0x00af;
                case -1332107749: goto L_0x00a4;
                case -1251387154: goto L_0x0099;
                case -830665521: goto L_0x008e;
                case 1760745220: goto L_0x0083;
                default: goto L_0x0081;
            }
        L_0x0081:
            r8 = -1
            goto L_0x00b9
        L_0x0083:
            java.lang.String r8 = "Super_SlowMotion_BGM"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x008c
            goto L_0x0081
        L_0x008c:
            r8 = 4
            goto L_0x00b9
        L_0x008e:
            java.lang.String r8 = "Super_SlowMotion_Deflickering_On"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x0097
            goto L_0x0081
        L_0x0097:
            r8 = r4
            goto L_0x00b9
        L_0x0099:
            java.lang.String r8 = "Super_SlowMotion_Data"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00a2
            goto L_0x0081
        L_0x00a2:
            r8 = 2
            goto L_0x00b9
        L_0x00a4:
            java.lang.String r8 = "Super_SlowMotion_Edit_Data"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00ad
            goto L_0x0081
        L_0x00ad:
            r8 = 1
            goto L_0x00b9
        L_0x00af:
            java.lang.String r8 = "SlowMotion_Data"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00b8
            goto L_0x0081
        L_0x00b8:
            r8 = 0
        L_0x00b9:
            switch(r8) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x00cb;
                case 2: goto L_0x00c9;
                case 3: goto L_0x00c6;
                case 4: goto L_0x00c4;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            java.lang.String r0 = "Invalid SEF name"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x00c4:
            r8 = r5
            goto L_0x00cf
        L_0x00c6:
            r8 = 2820(0xb04, float:3.952E-42)
            goto L_0x00cf
        L_0x00c9:
            r8 = r14
            goto L_0x00cf
        L_0x00cb:
            r8 = 2819(0xb03, float:3.95E-42)
            goto L_0x00cf
        L_0x00ce:
            r8 = r13
        L_0x00cf:
            int r10 = r10 + r7
            int r6 = r6.b
            int r6 = r6 - r10
            if (r8 == r13) goto L_0x00ea
            if (r8 == r14) goto L_0x00e8
            if (r8 == r5) goto L_0x00e8
            r6 = 2819(0xb03, float:3.95E-42)
            if (r8 == r6) goto L_0x00e8
            r6 = 2820(0xb04, float:3.952E-42)
            if (r8 != r6) goto L_0x00e2
            goto L_0x00e8
        L_0x00e2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00e8:
            r6 = 1
            goto L_0x0159
        L_0x00ea:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r6 = r12.s(r6, r11)
            jn r9 = defpackage.h2d.e
            java.util.List r6 = r9.O(r6)
            r9 = 0
        L_0x00fa:
            int r10 = r6.size()
            if (r9 >= r10) goto L_0x0150
            java.lang.Object r10 = r6.get(r9)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            jn r11 = defpackage.h2d.d
            java.util.List r10 = r11.O(r10)
            int r11 = r10.size()
            if (r11 != r4) goto L_0x014a
            r11 = 0
            java.lang.Object r21 = r10.get(r11)     // Catch:{ NumberFormatException -> 0x0143 }
            java.lang.String r21 = (java.lang.String) r21     // Catch:{ NumberFormatException -> 0x0143 }
            long r27 = java.lang.Long.parseLong(r21)     // Catch:{ NumberFormatException -> 0x0143 }
            r11 = 1
            java.lang.Object r21 = r10.get(r11)     // Catch:{ NumberFormatException -> 0x0143 }
            java.lang.String r21 = (java.lang.String) r21     // Catch:{ NumberFormatException -> 0x0143 }
            long r29 = java.lang.Long.parseLong(r21)     // Catch:{ NumberFormatException -> 0x0143 }
            r11 = 2
            java.lang.Object r10 = r10.get(r11)     // Catch:{ NumberFormatException -> 0x0143 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x0143 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0143 }
            r11 = 1
            int r10 = r10 - r11
            int r31 = r11 << r10
            gtd r10 = new gtd     // Catch:{ NumberFormatException -> 0x0143 }
            r26 = r10
            r26.<init>(r27, r29, r31)     // Catch:{ NumberFormatException -> 0x0143 }
            r8.add(r10)     // Catch:{ NumberFormatException -> 0x0143 }
            int r9 = r9 + r11
            goto L_0x00fa
        L_0x0143:
            r0 = move-exception
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x014a:
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r1)
            throw r0
        L_0x0150:
            itd r6 = new itd
            r6.<init>(r8)
            r3.add(r6)
            goto L_0x00e8
        L_0x0159:
            int r1 = r1 + r6
            r8 = 0
            r9 = 4
            goto L_0x0059
        L_0x015e:
            r8 = 0
            r2.a = r8
        L_0x0162:
            r1 = 1
            goto L_0x022d
        L_0x0165:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x016b:
            long r8 = r39.x()
            int r3 = r11.c
            int r3 = r3 + -20
            wpa r6 = new wpa
            r6.<init>((int) r3)
            byte[] r10 = r6.a
            r12 = 0
            r1.readFully(r10, r12, r3)
            r1 = 0
        L_0x017f:
            int r10 = r3 / 12
            if (r1 >= r10) goto L_0x01c8
            r10 = 2
            r6.H(r10)
            short r10 = r6.k()
            if (r10 == r13) goto L_0x01a0
            if (r10 == r14) goto L_0x01a0
            if (r10 == r5) goto L_0x01a0
            r12 = 2819(0xb03, float:3.95E-42)
            r5 = 2820(0xb04, float:3.952E-42)
            if (r10 == r12) goto L_0x01a4
            if (r10 == r5) goto L_0x01a4
            r6.H(r7)
            r18 = r8
        L_0x019e:
            r7 = 1
            goto L_0x01be
        L_0x01a0:
            r5 = 2820(0xb04, float:3.952E-42)
            r12 = 2819(0xb03, float:3.95E-42)
        L_0x01a4:
            int r10 = r11.c
            long r12 = (long) r10
            long r12 = r8 - r12
            int r10 = r6.i()
            r18 = r8
            long r7 = (long) r10
            long r12 = r12 - r7
            int r7 = r6.i()
            f2d r8 = new f2d
            r8.<init>(r12, r7)
            r15.add(r8)
            goto L_0x019e
        L_0x01be:
            int r1 = r1 + r7
            r8 = r18
            r5 = 2817(0xb01, float:3.947E-42)
            r7 = 8
            r13 = 2192(0x890, float:3.072E-42)
            goto L_0x017f
        L_0x01c8:
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x01d4
            r5 = 0
            r2.a = r5
            r3 = 0
            goto L_0x0162
        L_0x01d4:
            r11.b = r4
            r3 = 0
            java.lang.Object r1 = r15.get(r3)
            f2d r1 = (defpackage.f2d) r1
            long r4 = r1.a
            r2.a = r4
            goto L_0x0162
        L_0x01e2:
            r3 = r8
            wpa r4 = new wpa
            r5 = 8
            r4.<init>((int) r5)
            byte[] r6 = r4.a
            r1.readFully(r6, r3, r5)
            int r3 = r4.i()
            int r3 = r3 + r5
            r11.c = r3
            int r3 = r4.g()
            r4 = 1397048916(0x53454654, float:8.4728847E11)
            if (r3 == r4) goto L_0x0205
            r3 = 0
            r2.a = r3
            goto L_0x0162
        L_0x0205:
            long r3 = r39.e()
            int r1 = r11.c
            int r1 = r1 + -12
            long r5 = (long) r1
            long r3 = r3 - r5
            r2.a = r3
            r1 = 2
            r11.b = r1
            goto L_0x0162
        L_0x0216:
            long r3 = r39.x()
            int r1 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r1 == 0) goto L_0x0226
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 >= 0) goto L_0x0223
            goto L_0x0226
        L_0x0223:
            long r3 = r3 - r22
            goto L_0x0228
        L_0x0226:
            r3 = 0
        L_0x0228:
            r2.a = r3
            r1 = 1
            r11.b = r1
        L_0x022d:
            long r2 = r2.a
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x023a
            r2 = 0
            r0.v0 = r2
            r0.y0 = r2
        L_0x023a:
            return r1
        L_0x023b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0241:
            long r4 = r39.e()
            int r6 = r0.A0
            r7 = -1
            if (r6 != r7) goto L_0x02c0
            r8 = -1
            r9 = -1
            r10 = 1
            r11 = 1
            r12 = 0
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r26 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x025e:
            ud9[] r3 = r0.G0
            int r6 = r3.length
            if (r12 >= r6) goto L_0x02a4
            r3 = r3[r12]
            int r6 = r3.e
            a0f r3 = r3.b
            int r7 = r3.b
            if (r6 != r7) goto L_0x026f
        L_0x026d:
            r3 = 1
            goto L_0x02a2
        L_0x026f:
            long[] r3 = r3.c
            r31 = r3[r6]
            long[][] r3 = r0.H0
            int r7 = defpackage.oaf.a
            r3 = r3[r12]
            r6 = r3[r6]
            long r31 = r31 - r4
            r24 = 0
            int r3 = (r31 > r24 ? 1 : (r31 == r24 ? 0 : -1))
            if (r3 < 0) goto L_0x028a
            int r3 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r3 < 0) goto L_0x0288
            goto L_0x028a
        L_0x0288:
            r3 = 0
            goto L_0x028b
        L_0x028a:
            r3 = 1
        L_0x028b:
            if (r3 != 0) goto L_0x028f
            if (r11 != 0) goto L_0x0295
        L_0x028f:
            if (r3 != r11) goto L_0x029a
            int r17 = (r31 > r26 ? 1 : (r31 == r26 ? 0 : -1))
            if (r17 >= 0) goto L_0x029a
        L_0x0295:
            r11 = r3
            r15 = r6
            r9 = r12
            r26 = r31
        L_0x029a:
            int r17 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r17 >= 0) goto L_0x026d
            r10 = r3
            r13 = r6
            r8 = r12
            goto L_0x026d
        L_0x02a2:
            int r12 = r12 + r3
            goto L_0x025e
        L_0x02a4:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x02b7
            if (r10 == 0) goto L_0x02b7
            r6 = 10485760(0xa00000, double:5.180654E-317)
            long r13 = r13 + r6
            int r3 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x02b8
        L_0x02b7:
            r8 = r9
        L_0x02b8:
            r0.A0 = r8
            r3 = -1
            if (r8 != r3) goto L_0x02c0
            r5 = -1
            goto L_0x03d6
        L_0x02c0:
            ud9[] r3 = r0.G0
            int r6 = r0.A0
            r3 = r3[r6]
            yze r14 = r3.c
            int r15 = r3.e
            a0f r13 = r3.b
            long[] r6 = r13.c
            r6 = r6[r15]
            int[] r8 = r13.d
            r8 = r8[r15]
            long r4 = r6 - r4
            int r9 = r0.B0
            long r9 = (long) r9
            long r4 = r4 + r9
            r9 = 0
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x03d3
            int r9 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r9 < 0) goto L_0x02e6
            goto L_0x03d3
        L_0x02e6:
            kze r2 = r3.a
            int r6 = r2.g
            r7 = 1
            if (r6 != r7) goto L_0x02f1
            long r4 = r4 + r22
            int r8 = r8 + -8
        L_0x02f1:
            int r4 = (int) r4
            r1.z(r4)
            int r4 = r2.j
            b3f r5 = r3.d
            if (r4 == 0) goto L_0x0355
            wpa r2 = r0.o
            byte[] r6 = r2.a
            r7 = 0
            r6[r7] = r7
            r9 = 1
            r6[r9] = r7
            r9 = 2
            r6[r9] = r7
            r9 = 4
            int r10 = 4 - r4
        L_0x030b:
            int r9 = r0.C0
            if (r9 >= r8) goto L_0x0353
            int r9 = r0.D0
            if (r9 != 0) goto L_0x033e
            r1.readFully(r6, r10, r4)
            int r9 = r0.B0
            int r9 = r9 + r4
            r0.B0 = r9
            r2.G(r7)
            int r9 = r2.g()
            if (r9 < 0) goto L_0x0336
            r0.D0 = r9
            wpa r9 = r0.c
            r9.G(r7)
            r11 = 4
            r14.b(r9, r11, r7)
            int r9 = r0.C0
            int r9 = r9 + r11
            r0.C0 = r9
            int r8 = r8 + r10
            goto L_0x030b
        L_0x0336:
            java.lang.String r0 = "Invalid NAL length"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x033e:
            int r9 = r14.c(r1, r9, r7)
            int r7 = r0.B0
            int r7 = r7 + r9
            r0.B0 = r7
            int r7 = r0.C0
            int r7 = r7 + r9
            r0.C0 = r7
            int r7 = r0.D0
            int r7 = r7 - r9
            r0.D0 = r7
            r7 = 0
            goto L_0x030b
        L_0x0353:
            r1 = r8
            goto L_0x0398
        L_0x0355:
            qy5 r2 = r2.f
            java.lang.String r2 = r2.n
            java.lang.String r4 = "audio/ac4"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0378
            int r2 = r0.C0
            if (r2 != 0) goto L_0x0375
            r6 = r18
            defpackage.nu0.k(r8, r6)
            r2 = 0
            r7 = 7
            r14.b(r6, r7, r2)
            int r2 = r0.C0
            int r2 = r2 + r7
            r0.C0 = r2
            goto L_0x0376
        L_0x0375:
            r7 = 7
        L_0x0376:
            int r8 = r8 + r7
            goto L_0x037d
        L_0x0378:
            if (r5 == 0) goto L_0x037d
            r5.f(r1)
        L_0x037d:
            int r2 = r0.C0
            if (r2 >= r8) goto L_0x0353
            int r2 = r8 - r2
            r4 = 0
            int r2 = r14.c(r1, r2, r4)
            int r4 = r0.B0
            int r4 = r4 + r2
            r0.B0 = r4
            int r4 = r0.C0
            int r4 = r4 + r2
            r0.C0 = r4
            int r4 = r0.D0
            int r4 = r4 - r2
            r0.D0 = r4
            goto L_0x037d
        L_0x0398:
            long[] r2 = r13.f
            r8 = r2[r15]
            int[] r2 = r13.g
            r2 = r2[r15]
            if (r5 == 0) goto L_0x03b8
            r12 = 0
            r4 = 0
            r6 = r5
            r7 = r14
            r10 = r2
            r11 = r1
            r1 = r13
            r13 = r4
            r6.d(r7, r8, r10, r11, r12, r13)
            r2 = 1
            int r15 = r15 + r2
            int r1 = r1.b
            if (r15 != r1) goto L_0x03c1
            r1 = 0
            r5.b(r14, r1)
            goto L_0x03c1
        L_0x03b8:
            r11 = 0
            r12 = 0
            r6 = r14
            r7 = r8
            r9 = r2
            r10 = r1
            r6.a(r7, r9, r10, r11, r12)
        L_0x03c1:
            int r1 = r3.e
            r2 = 1
            int r1 = r1 + r2
            r3.e = r1
            r1 = -1
            r0.A0 = r1
            r1 = 0
            r0.B0 = r1
            r0.C0 = r1
            r0.D0 = r1
            r5 = 0
            goto L_0x03d6
        L_0x03d3:
            r2.a = r6
            r5 = 1
        L_0x03d6:
            return r5
        L_0x03d7:
            r7 = 7
            long r5 = r0.x0
            int r3 = r0.y0
            long r8 = (long) r3
            long r5 = r5 - r8
            long r8 = r39.e()
            long r8 = r8 + r5
            wpa r3 = r0.z0
            if (r3 == 0) goto L_0x044b
            byte[] r10 = r3.a
            int r11 = r0.y0
            int r5 = (int) r5
            r1.readFully(r10, r11, r5)
            int r5 = r0.w0
            r6 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r6) goto L_0x0432
            r5 = 1
            r0.E0 = r5
            r5 = 8
            r3.G(r5)
            int r5 = r3.g()
            r6 = 1903435808(0x71742020, float:1.2088509E30)
            r10 = 1751476579(0x68656963, float:4.333464E24)
            if (r5 == r10) goto L_0x0410
            if (r5 == r6) goto L_0x040e
            r5 = 0
            goto L_0x0411
        L_0x040e:
            r5 = 1
            goto L_0x0411
        L_0x0410:
            r5 = 2
        L_0x0411:
            if (r5 == 0) goto L_0x0414
            goto L_0x042f
        L_0x0414:
            r5 = 4
            r3.H(r5)
        L_0x0418:
            int r5 = r3.a()
            if (r5 <= 0) goto L_0x042e
            int r5 = r3.g()
            if (r5 == r10) goto L_0x042a
            if (r5 == r6) goto L_0x0428
            r5 = 0
            goto L_0x042b
        L_0x0428:
            r5 = 1
            goto L_0x042b
        L_0x042a:
            r5 = 2
        L_0x042b:
            if (r5 == 0) goto L_0x0418
            goto L_0x042f
        L_0x042e:
            r5 = 0
        L_0x042f:
            r0.K0 = r5
            goto L_0x0461
        L_0x0432:
            boolean r5 = r12.isEmpty()
            if (r5 != 0) goto L_0x0461
            java.lang.Object r5 = r12.peek()
            ly r5 = (defpackage.ly) r5
            ny r6 = new ny
            int r10 = r0.w0
            r6.<init>(r10, r3)
            java.util.ArrayList r3 = r5.o
            r3.add(r6)
            goto L_0x0461
        L_0x044b:
            boolean r3 = r0.E0
            if (r3 != 0) goto L_0x0459
            int r3 = r0.w0
            r10 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r3 != r10) goto L_0x0459
            r3 = 1
            r0.K0 = r3
        L_0x0459:
            int r3 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r3 >= 0) goto L_0x0463
            int r3 = (int) r5
            r1.z(r3)
        L_0x0461:
            r3 = 0
            goto L_0x046b
        L_0x0463:
            long r10 = r39.e()
            long r10 = r10 + r5
            r2.a = r10
            r3 = 1
        L_0x046b:
            r0.j(r8)
            if (r3 == 0) goto L_0x0477
            int r3 = r0.v0
            r5 = 2
            if (r3 == r5) goto L_0x0477
            r3 = 1
            return r3
        L_0x0477:
            r3 = 1
            r10 = r3
            r6 = 2
            r7 = 8
            r8 = 0
            r9 = 4
            goto L_0x000d
        L_0x0480:
            r3 = r10
            r6 = r18
            r7 = 7
            int r5 = r0.y0
            wpa r8 = r0.Y
            if (r5 != 0) goto L_0x04f2
            byte[] r5 = r8.a
            r9 = 0
            r10 = 8
            boolean r5 = r1.h(r5, r9, r10, r3)
            if (r5 != 0) goto L_0x04db
            int r1 = r0.K0
            r3 = 2
            if (r1 != r3) goto L_0x04d9
            int r1 = r0.b
            r1 = r1 & r3
            if (r1 == 0) goto L_0x04d9
            pa5 r1 = r0.F0
            r2 = 4
            yze r1 = r1.B(r9, r2)
            vc9 r2 = r0.L0
            if (r2 != 0) goto L_0x04ac
            r13 = 0
            goto L_0x04b6
        L_0x04ac:
            f99 r13 = new f99
            r3 = 1
            d99[] r3 = new defpackage.d99[r3]
            r3[r9] = r2
            r13.<init>((defpackage.d99[]) r3)
        L_0x04b6:
            ny5 r2 = new ny5
            r2.<init>()
            r2.j = r13
            qy5 r3 = new qy5
            r3.<init>(r2)
            r1.e(r3)
            pa5 r1 = r0.F0
            r1.w()
            pa5 r0 = r0.F0
            wd0 r1 = new wd0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r2)
            r0.J(r1)
        L_0x04d9:
            r5 = -1
            return r5
        L_0x04db:
            r3 = 2
            r5 = -1
            r9 = 8
            r0.y0 = r9
            r9 = 0
            r8.G(r9)
            long r9 = r8.w()
            r0.x0 = r9
            int r9 = r8.g()
            r0.w0 = r9
            goto L_0x04f4
        L_0x04f2:
            r3 = 2
            r5 = -1
        L_0x04f4:
            long r9 = r0.x0
            r13 = 1
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x050f
            byte[] r9 = r8.a
            r10 = 8
            r1.readFully(r9, r10, r10)
            int r9 = r0.y0
            int r9 = r9 + r10
            r0.y0 = r9
            long r9 = r8.z()
            r0.x0 = r9
            goto L_0x0536
        L_0x050f:
            r13 = 0
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x0536
            long r9 = r39.x()
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 != 0) goto L_0x0527
            java.lang.Object r11 = r12.peek()
            ly r11 = (defpackage.ly) r11
            if (r11 == 0) goto L_0x0527
            long r9 = r11.c
        L_0x0527:
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x0536
            long r13 = r39.e()
            long r9 = r9 - r13
            int r11 = r0.y0
            long r13 = (long) r11
            long r9 = r9 + r13
            r0.x0 = r9
        L_0x0536:
            long r9 = r0.x0
            int r11 = r0.y0
            long r13 = (long) r11
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x068a
            int r9 = r0.w0
            r10 = 1751411826(0x68646c72, float:4.3148E24)
            r13 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r14 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r9 == r13) goto L_0x0567
            r13 = 1953653099(0x7472616b, float:7.681346E31)
            if (r9 == r13) goto L_0x0567
            r13 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r9 == r13) goto L_0x0567
            r13 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r9 == r13) goto L_0x0567
            r13 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r9 == r13) goto L_0x0567
            r13 = 1701082227(0x65647473, float:6.742798E22)
            if (r9 == r13) goto L_0x0567
            if (r9 != r14) goto L_0x056a
        L_0x0567:
            r8 = 1
            goto L_0x0625
        L_0x056a:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r9 == r6) goto L_0x05c1
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r9 == r6) goto L_0x05c1
            if (r9 == r10) goto L_0x05c1
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r9 == r6) goto L_0x05c1
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r9 == r6) goto L_0x05c1
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r9 == r6) goto L_0x05c1
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1718909296(0x66747970, float:2.8862439E23)
            if (r9 == r6) goto L_0x05c1
            r6 = 1969517665(0x75647461, float:2.8960062E32)
            if (r9 == r6) goto L_0x05c1
            r6 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r9 == r6) goto L_0x05c1
            r6 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r9 != r6) goto L_0x05c4
        L_0x05c1:
            r6 = 8
            goto L_0x05f6
        L_0x05c4:
            long r8 = r39.e()
            int r6 = r0.y0
            long r10 = (long) r6
            long r30 = r8 - r10
            int r6 = r0.w0
            r8 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r6 != r8) goto L_0x05ea
            vc9 r6 = new vc9
            long r34 = r30 + r10
            long r8 = r0.x0
            long r36 = r8 - r10
            r28 = 0
            r32 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r27 = r6
            r27.<init>(r28, r30, r32, r34, r36)
            r0.L0 = r6
        L_0x05ea:
            r6 = 0
            r0.z0 = r6
            r6 = 1
            r0.v0 = r6
        L_0x05f0:
            r3 = 8
            r4 = 0
            r7 = 4
            goto L_0x0682
        L_0x05f6:
            if (r11 != r6) goto L_0x05fa
            r6 = 1
            goto L_0x05fb
        L_0x05fa:
            r6 = 0
        L_0x05fb:
            defpackage.fm9.k(r6)
            long r9 = r0.x0
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x0609
            r6 = 1
            goto L_0x060a
        L_0x0609:
            r6 = 0
        L_0x060a:
            defpackage.fm9.k(r6)
            wpa r6 = new wpa
            long r9 = r0.x0
            int r9 = (int) r9
            r6.<init>((int) r9)
            byte[] r8 = r8.a
            byte[] r9 = r6.a
            r10 = 0
            r11 = 8
            java.lang.System.arraycopy(r8, r10, r9, r10, r11)
            r0.z0 = r6
            r8 = 1
            r0.v0 = r8
            goto L_0x05f0
        L_0x0625:
            long r15 = r39.e()
            long r3 = r0.x0
            long r15 = r15 + r3
            int r11 = r0.y0
            long r7 = (long) r11
            long r9 = r15 - r7
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0662
            int r3 = r0.w0
            if (r3 != r14) goto L_0x0662
            r3 = 8
            r6.D(r3)
            byte[] r4 = r6.a
            r7 = 0
            r1.l(r7, r4, r3)
            byte[] r4 = defpackage.wy.a
            int r4 = r6.b
            r7 = 4
            r6.H(r7)
            int r8 = r6.g()
            r11 = 1751411826(0x68646c72, float:4.3148E24)
            if (r8 == r11) goto L_0x0656
            int r4 = r4 + r7
        L_0x0656:
            r6.G(r4)
            int r4 = r6.b
            r1.z(r4)
            r39.y()
            goto L_0x0665
        L_0x0662:
            r3 = 8
            r7 = 4
        L_0x0665:
            ly r4 = new ly
            int r6 = r0.w0
            r4.<init>(r6, r9)
            r12.push(r4)
            long r11 = r0.x0
            int r4 = r0.y0
            long r14 = (long) r4
            int r4 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x067d
            r0.j(r9)
            r4 = 0
            goto L_0x0682
        L_0x067d:
            r4 = 0
            r0.v0 = r4
            r0.y0 = r4
        L_0x0682:
            r8 = r4
            r9 = r7
            r4 = 3
            r6 = 2
            r10 = 1
            r7 = r3
            goto L_0x000d
        L_0x068a:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd9.g(na5, lh4):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.t1d i(int r21, long r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            ud9[] r4 = r0.G0
            int r5 = r4.length
            z1d r6 = defpackage.z1d.c
            if (r5 != 0) goto L_0x0013
            t1d r0 = new t1d
            r0.<init>(r6, r6)
            return r0
        L_0x0013:
            r5 = -1
            if (r1 == r5) goto L_0x0018
            r7 = r1
            goto L_0x001a
        L_0x0018:
            int r7 = r0.I0
        L_0x001a:
            r8 = 0
            if (r7 == r5) goto L_0x0063
            r4 = r4[r7]
            a0f r4 = r4.b
            long[] r7 = r4.f
            int r7 = defpackage.oaf.f(r7, r2, r8)
        L_0x0027:
            if (r7 < 0) goto L_0x0035
            int[] r13 = r4.g
            r13 = r13[r7]
            r13 = r13 & 1
            if (r13 == 0) goto L_0x0032
            goto L_0x0036
        L_0x0032:
            int r7 = r7 + -1
            goto L_0x0027
        L_0x0035:
            r7 = r5
        L_0x0036:
            if (r7 != r5) goto L_0x003c
            int r7 = r4.a(r2)
        L_0x003c:
            if (r7 != r5) goto L_0x0044
            t1d r0 = new t1d
            r0.<init>(r6, r6)
            return r0
        L_0x0044:
            long[] r6 = r4.f
            r13 = r6[r7]
            long[] r15 = r4.c
            r16 = r15[r7]
            int r18 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r18 >= 0) goto L_0x0069
            int r11 = r4.b
            int r11 = r11 + -1
            if (r7 >= r11) goto L_0x0069
            int r2 = r4.a(r2)
            if (r2 == r5) goto L_0x0069
            if (r2 == r7) goto L_0x0069
            r3 = r6[r2]
            r11 = r15[r2]
            goto L_0x0070
        L_0x0063:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = r2
        L_0x0069:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = -1
        L_0x0070:
            if (r1 != r5) goto L_0x00ec
            r6 = r8
            r1 = r16
        L_0x0075:
            ud9[] r7 = r0.G0
            int r15 = r7.length
            if (r6 >= r15) goto L_0x00ee
            int r15 = r0.I0
            if (r6 == r15) goto L_0x00df
            r7 = r7[r6]
            a0f r7 = r7.b
            long[] r15 = r7.f
            int r15 = defpackage.oaf.f(r15, r13, r8)
        L_0x0088:
            int[] r8 = r7.g
            if (r15 < 0) goto L_0x0096
            r16 = r8[r15]
            r16 = r16 & 1
            if (r16 == 0) goto L_0x0093
            goto L_0x0097
        L_0x0093:
            int r15 = r15 + -1
            goto L_0x0088
        L_0x0096:
            r15 = r5
        L_0x0097:
            if (r15 != r5) goto L_0x009d
            int r15 = r7.a(r13)
        L_0x009d:
            long[] r9 = r7.c
            if (r15 != r5) goto L_0x00a9
            r16 = r6
        L_0x00a3:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00b2
        L_0x00a9:
            r16 = r6
            r5 = r9[r15]
            long r1 = java.lang.Math.min(r5, r1)
            goto L_0x00a3
        L_0x00b2:
            int r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r15 == 0) goto L_0x00dc
            long[] r5 = r7.f
            r6 = 0
            int r5 = defpackage.oaf.f(r5, r3, r6)
        L_0x00bd:
            if (r5 < 0) goto L_0x00ca
            r15 = r8[r5]
            r15 = r15 & 1
            if (r15 == 0) goto L_0x00c7
        L_0x00c5:
            r8 = -1
            goto L_0x00cc
        L_0x00c7:
            int r5 = r5 + -1
            goto L_0x00bd
        L_0x00ca:
            r5 = -1
            goto L_0x00c5
        L_0x00cc:
            if (r5 != r8) goto L_0x00d2
            int r5 = r7.a(r3)
        L_0x00d2:
            if (r5 != r8) goto L_0x00d5
            goto L_0x00e3
        L_0x00d5:
            r9 = r9[r5]
            long r11 = java.lang.Math.min(r9, r11)
            goto L_0x00e3
        L_0x00dc:
            r6 = 0
            r8 = -1
            goto L_0x00e3
        L_0x00df:
            r16 = r6
            r6 = r8
            r8 = r5
        L_0x00e3:
            int r5 = r16 + 1
            r19 = r6
            r6 = r5
            r5 = r8
            r8 = r19
            goto L_0x0075
        L_0x00ec:
            r1 = r16
        L_0x00ee:
            z1d r0 = new z1d
            r0.<init>(r13, r1)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0102
            t1d r1 = new t1d
            r1.<init>(r0, r0)
            return r1
        L_0x0102:
            z1d r1 = new z1d
            r1.<init>(r3, r11)
            t1d r2 = new t1d
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd9.i(int, long):t1d");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v92, resolved type: jpe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0345, code lost:
        r4 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0543  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x056f  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x06d3 A[LOOP:13: B:342:0x06d0->B:344:0x06d3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x06f1  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x02dd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(long r35) {
        /*
            r34 = this;
            r0 = r34
            r1 = 24
            r2 = 4
            r3 = 8
            r6 = 0
            r7 = 1
        L_0x0009:
            java.util.ArrayDeque r8 = r0.Z
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0765
            java.lang.Object r9 = r8.peek()
            ly r9 = (defpackage.ly) r9
            long r11 = r9.c
            int r9 = (r11 > r35 ? 1 : (r11 == r35 ? 0 : -1))
            if (r9 != 0) goto L_0x0765
            java.lang.Object r9 = r8.pop()
            r11 = r9
            ly r11 = (defpackage.ly) r11
            int r9 = r11.b
            r12 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r9 != r12) goto L_0x0743
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r12 = r0.K0
            if (r12 != r7) goto L_0x0037
            r17 = r7
            goto L_0x0039
        L_0x0037:
            r17 = r6
        L_0x0039:
            ea6 r15 = new ea6
            r15.<init>()
            r12 = 1969517665(0x75647461, float:2.8960062E32)
            ny r12 = r11.w(r12)
            r13 = 1751411826(0x68646c72, float:4.3148E24)
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            r14 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r12 == 0) goto L_0x0437
            byte[] r20 = defpackage.wy.a
            wpa r12 = r12.c
            r12.G(r3)
            f99 r5 = new f99
            d99[] r10 = new defpackage.d99[r6]
            r5.<init>((defpackage.d99[]) r10)
        L_0x005e:
            int r10 = r12.a()
            if (r10 < r3) goto L_0x042d
            int r10 = r12.b
            int r21 = r12.g()
            int r6 = r12.g()
            if (r6 != r14) goto L_0x031e
            r12.G(r10)
            int r6 = r10 + r21
            r12.H(r3)
            int r14 = r12.b
            r12.H(r2)
            int r7 = r12.g()
            if (r7 == r13) goto L_0x0084
            int r14 = r14 + r2
        L_0x0084:
            r12.G(r14)
        L_0x0087:
            int r7 = r12.b
            if (r7 >= r6) goto L_0x0313
            int r14 = r12.g()
            int r13 = r12.g()
            if (r13 != r4) goto L_0x02ff
            r12.G(r7)
            int r7 = r7 + r14
            r12.H(r3)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x00a1:
            int r13 = r12.b
            if (r13 >= r7) goto L_0x02ef
            java.lang.String r14 = "Skipped unknown metadata entry: "
            int r25 = r12.g()
            int r13 = r25 + r13
            int r4 = r12.g()
            int r3 = r4 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            r1 = 169(0xa9, float:2.37E-43)
            java.lang.String r2 = "TCON"
            if (r3 == r1) goto L_0x00bf
            r1 = 253(0xfd, float:3.55E-43)
            if (r3 != r1) goto L_0x00c6
        L_0x00bf:
            r30 = r7
            r31 = r8
            r1 = -1
            goto L_0x0237
        L_0x00c6:
            r1 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r4 != r1) goto L_0x00f4
            int r1 = defpackage.pag.C(r12)     // Catch:{ all -> 0x0104 }
            r3 = 1
            int r1 = r1 - r3
            java.lang.String r1 = defpackage.et6.a(r1)     // Catch:{ all -> 0x0104 }
            if (r1 == 0) goto L_0x00e2
            jpe r3 = new jpe     // Catch:{ all -> 0x0104 }
            ffc r1 = defpackage.zw6.n(r1)     // Catch:{ all -> 0x0104 }
            r4 = 0
            r3.<init>(r2, r4, r1)     // Catch:{ all -> 0x0104 }
            goto L_0x00e9
        L_0x00e2:
            r4 = 0
            java.lang.String r1 = "Failed to parse standard genre code"
            defpackage.z04.c0(r1)     // Catch:{ all -> 0x0104 }
            r3 = r4
        L_0x00e9:
            r12.G(r13)
            r4 = r3
        L_0x00ed:
            r30 = r7
            r31 = r8
            r1 = -1
            goto L_0x02d8
        L_0x00f4:
            r1 = 0
            r2 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r4 != r2) goto L_0x0107
            java.lang.String r2 = "TPOS"
            jpe r4 = defpackage.pag.B(r4, r12, r2)     // Catch:{ all -> 0x0104 }
        L_0x0100:
            r12.G(r13)
            goto L_0x00ed
        L_0x0104:
            r0 = move-exception
            goto L_0x02eb
        L_0x0107:
            r2 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r4 != r2) goto L_0x0113
            java.lang.String r2 = "TRCK"
            jpe r4 = defpackage.pag.B(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x0100
        L_0x0113:
            r2 = 1953329263(0x746d706f, float:7.5247484E31)
            if (r4 != r2) goto L_0x0121
            java.lang.String r2 = "TBPM"
            r3 = 1
            r14 = 0
            dt6 r4 = defpackage.pag.D(r4, r2, r12, r3, r14)     // Catch:{ all -> 0x0104 }
            goto L_0x0100
        L_0x0121:
            r2 = 1668311404(0x6370696c, float:4.434815E21)
            if (r4 != r2) goto L_0x012e
            java.lang.String r2 = "TCMP"
            r3 = 1
            dt6 r4 = defpackage.pag.D(r4, r2, r12, r3, r3)     // Catch:{ all -> 0x0104 }
            goto L_0x0100
        L_0x012e:
            r2 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r4 != r2) goto L_0x0138
            ul r4 = defpackage.pag.A(r12)     // Catch:{ all -> 0x0104 }
            goto L_0x0100
        L_0x0138:
            r2 = 1631670868(0x61415254, float:2.2288462E20)
            if (r4 != r2) goto L_0x0144
            java.lang.String r2 = "TPE2"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x0100
        L_0x0144:
            r2 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r4 != r2) goto L_0x0150
            java.lang.String r2 = "TSOT"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x0100
        L_0x0150:
            r2 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r4 != r2) goto L_0x015c
            java.lang.String r2 = "TSOA"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x0100
        L_0x015c:
            r2 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r4 != r2) goto L_0x0168
            java.lang.String r2 = "TSOP"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x0100
        L_0x0168:
            r2 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r4 != r2) goto L_0x0174
            java.lang.String r2 = "TSO2"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x0100
        L_0x0174:
            r2 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r4 != r2) goto L_0x0180
            java.lang.String r2 = "TSOC"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x0100
        L_0x0180:
            r2 = 1920233063(0x72746e67, float:4.84146E30)
            if (r4 != r2) goto L_0x018e
            java.lang.String r2 = "ITUNESADVISORY"
            r3 = 0
            dt6 r4 = defpackage.pag.D(r4, r2, r12, r3, r3)     // Catch:{ all -> 0x0104 }
            goto L_0x0100
        L_0x018e:
            r2 = 1885823344(0x70676170, float:2.8643533E29)
            if (r4 != r2) goto L_0x019d
            java.lang.String r2 = "ITUNESGAPLESS"
            r3 = 1
            r14 = 0
            dt6 r4 = defpackage.pag.D(r4, r2, r12, r14, r3)     // Catch:{ all -> 0x0104 }
            goto L_0x0100
        L_0x019d:
            r2 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r4 != r2) goto L_0x01aa
            java.lang.String r2 = "TVSHOWSORT"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x0100
        L_0x01aa:
            r2 = 1953919848(0x74767368, float:7.810338E31)
            if (r4 != r2) goto L_0x01b7
            java.lang.String r2 = "TVSHOW"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x0100
        L_0x01b7:
            r2 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r4 != r2) goto L_0x0230
            r2 = r1
            r4 = r2
            r3 = -1
            r14 = -1
        L_0x01c0:
            int r1 = r12.b     // Catch:{ all -> 0x0104 }
            if (r1 >= r13) goto L_0x0209
            int r28 = r12.g()     // Catch:{ all -> 0x0104 }
            r29 = r1
            int r1 = r12.g()     // Catch:{ all -> 0x0104 }
            r30 = r7
            r7 = 4
            r12.H(r7)     // Catch:{ all -> 0x0104 }
            r7 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r1 != r7) goto L_0x01e5
            r7 = 12
            int r1 = r28 + -12
            java.lang.String r1 = r12.q(r1)     // Catch:{ all -> 0x0104 }
            r4 = r1
            r31 = r8
            goto L_0x0204
        L_0x01e5:
            r31 = r8
            r7 = 12
            r8 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r1 != r8) goto L_0x01f6
            int r1 = r28 + -12
            java.lang.String r1 = r12.q(r1)     // Catch:{ all -> 0x0104 }
            r2 = r1
            goto L_0x0204
        L_0x01f6:
            r8 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r8) goto L_0x01ff
            r14 = r28
            r3 = r29
        L_0x01ff:
            int r1 = r28 + -12
            r12.H(r1)     // Catch:{ all -> 0x0104 }
        L_0x0204:
            r7 = r30
            r8 = r31
            goto L_0x01c0
        L_0x0209:
            r30 = r7
            r31 = r8
            if (r4 == 0) goto L_0x0229
            if (r2 == 0) goto L_0x0229
            r1 = -1
            if (r3 != r1) goto L_0x0215
            goto L_0x022a
        L_0x0215:
            r12.G(r3)     // Catch:{ all -> 0x0104 }
            r3 = 16
            r12.H(r3)     // Catch:{ all -> 0x0104 }
            int r14 = r14 - r3
            java.lang.String r3 = r12.q(r14)     // Catch:{ all -> 0x0104 }
            v37 r7 = new v37     // Catch:{ all -> 0x0104 }
            r7.<init>(r4, r2, r3)     // Catch:{ all -> 0x0104 }
            r4 = r7
            goto L_0x022b
        L_0x0229:
            r1 = -1
        L_0x022a:
            r4 = 0
        L_0x022b:
            r12.G(r13)
            goto L_0x02d8
        L_0x0230:
            r30 = r7
            r31 = r8
            r1 = -1
            goto L_0x02b0
        L_0x0237:
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r4
            r7 = 6516084(0x636d74, float:9.130979E-39)
            if (r3 != r7) goto L_0x0245
            h73 r4 = defpackage.pag.z(r4, r12)     // Catch:{ all -> 0x0104 }
            goto L_0x022b
        L_0x0245:
            r7 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r3 == r7) goto L_0x02d0
            r7 = 7631467(0x74726b, float:1.0693963E-38)
            if (r3 != r7) goto L_0x0251
            goto L_0x02d0
        L_0x0251:
            r7 = 6516589(0x636f6d, float:9.131686E-39)
            if (r3 == r7) goto L_0x02c8
            r7 = 7828084(0x777274, float:1.0969482E-38)
            if (r3 != r7) goto L_0x025d
            goto L_0x02c8
        L_0x025d:
            r7 = 6578553(0x646179, float:9.218516E-39)
            if (r3 != r7) goto L_0x0269
            java.lang.String r2 = "TDRC"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x022b
        L_0x0269:
            r7 = 4280916(0x415254, float:5.998841E-39)
            if (r3 != r7) goto L_0x0275
            java.lang.String r2 = "TPE1"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x022b
        L_0x0275:
            r7 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r3 != r7) goto L_0x0281
            java.lang.String r2 = "TSSE"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x022b
        L_0x0281:
            r7 = 6384738(0x616c62, float:8.946924E-39)
            if (r3 != r7) goto L_0x028d
            java.lang.String r2 = "TALB"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x022b
        L_0x028d:
            r7 = 7108978(0x6c7972, float:9.9618E-39)
            if (r3 != r7) goto L_0x0299
            java.lang.String r2 = "USLT"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x022b
        L_0x0299:
            r7 = 6776174(0x67656e, float:9.495442E-39)
            if (r3 != r7) goto L_0x02a3
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x022b
        L_0x02a3:
            r2 = 6779504(0x677270, float:9.500109E-39)
            if (r3 != r2) goto L_0x02b0
            java.lang.String r2 = "TIT1"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x022b
        L_0x02b0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0104 }
            r2.<init>(r14)     // Catch:{ all -> 0x0104 }
            java.lang.String r3 = defpackage.oy.e(r4)     // Catch:{ all -> 0x0104 }
            r2.append(r3)     // Catch:{ all -> 0x0104 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0104 }
            defpackage.z04.t(r2)     // Catch:{ all -> 0x0104 }
            r12.G(r13)
            r4 = 0
            goto L_0x02d8
        L_0x02c8:
            java.lang.String r2 = "TCOM"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x022b
        L_0x02d0:
            java.lang.String r2 = "TIT2"
            jpe r4 = defpackage.pag.E(r4, r12, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x022b
        L_0x02d8:
            if (r4 == 0) goto L_0x02dd
            r6.add(r4)
        L_0x02dd:
            r7 = r30
            r8 = r31
            r1 = 24
            r2 = 4
            r3 = 8
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            goto L_0x00a1
        L_0x02eb:
            r12.G(r13)
            throw r0
        L_0x02ef:
            r31 = r8
            r1 = -1
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x02f9
            goto L_0x0316
        L_0x02f9:
            f99 r4 = new f99
            r4.<init>((java.util.List) r6)
            goto L_0x0317
        L_0x02ff:
            r31 = r8
            r1 = -1
            int r7 = r7 + r14
            r12.G(r7)
            r1 = 24
            r2 = 4
            r3 = 8
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            r13 = 1751411826(0x68646c72, float:4.3148E24)
            goto L_0x0087
        L_0x0313:
            r31 = r8
            r1 = -1
        L_0x0316:
            r4 = 0
        L_0x0317:
            f99 r2 = r5.b(r4)
        L_0x031b:
            r5 = r2
            goto L_0x0414
        L_0x031e:
            r31 = r8
            r1 = -1
            r2 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r6 != r2) goto L_0x03c2
            r12.G(r10)
            int r2 = r10 + r21
            r3 = 12
            r12.H(r3)
        L_0x0330:
            int r3 = r12.b
            if (r3 >= r2) goto L_0x0345
            int r4 = r12.g()
            int r6 = r12.g()
            r7 = 1935766900(0x73617574, float:1.7862687E31)
            if (r6 != r7) goto L_0x03b6
            r6 = 16
            if (r4 >= r6) goto L_0x0348
        L_0x0345:
            r4 = 0
            goto L_0x03bc
        L_0x0348:
            r3 = 4
            r12.H(r3)
            r7 = r1
            r3 = 0
            r4 = 0
        L_0x034f:
            r6 = 2
            if (r3 >= r6) goto L_0x0365
            int r6 = r12.u()
            int r8 = r12.u()
            if (r6 != 0) goto L_0x035f
            r7 = r8
            r13 = 1
            goto L_0x0363
        L_0x035f:
            r13 = 1
            if (r6 != r13) goto L_0x0363
            r4 = r8
        L_0x0363:
            int r3 = r3 + r13
            goto L_0x034f
        L_0x0365:
            r3 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r6 = 12
            if (r7 != r6) goto L_0x036f
            r2 = 240(0xf0, float:3.36E-43)
            goto L_0x03a0
        L_0x036f:
            r6 = 13
            if (r7 != r6) goto L_0x0376
            r2 = 120(0x78, float:1.68E-43)
            goto L_0x03a0
        L_0x0376:
            r6 = 21
            if (r7 == r6) goto L_0x037c
        L_0x037a:
            r2 = r3
            goto L_0x03a0
        L_0x037c:
            int r6 = r12.a()
            r7 = 8
            if (r6 < r7) goto L_0x037a
            int r6 = r12.b
            int r6 = r6 + r7
            if (r6 <= r2) goto L_0x038a
            goto L_0x037a
        L_0x038a:
            int r2 = r12.g()
            int r6 = r12.g()
            r7 = 12
            if (r2 < r7) goto L_0x037a
            r2 = 1936877170(0x73726672, float:1.9204921E31)
            if (r6 == r2) goto L_0x039c
            goto L_0x037a
        L_0x039c:
            int r2 = r12.v()
        L_0x03a0:
            if (r2 != r3) goto L_0x03a3
            goto L_0x0345
        L_0x03a3:
            f99 r3 = new f99
            eud r6 = new eud
            float r2 = (float) r2
            r6.<init>(r4, r2)
            r2 = 1
            d99[] r4 = new defpackage.d99[r2]
            r2 = 0
            r4[r2] = r6
            r3.<init>((defpackage.d99[]) r4)
            r4 = r3
            goto L_0x03bc
        L_0x03b6:
            int r3 = r3 + r4
            r12.G(r3)
            goto L_0x0330
        L_0x03bc:
            f99 r2 = r5.b(r4)
            goto L_0x031b
        L_0x03c2:
            r2 = -1451722374(0xffffffffa978797a, float:-5.5172426E-14)
            if (r6 != r2) goto L_0x0414
            short r2 = r12.r()
            r3 = 2
            r12.H(r3)
            java.nio.charset.Charset r3 = defpackage.b52.c
            java.lang.String r2 = r12.s(r2, r3)
            r3 = 43
            int r3 = r2.lastIndexOf(r3)
            r4 = 45
            int r4 = r2.lastIndexOf(r4)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = 0
            java.lang.String r6 = r2.substring(r4, r3)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x040d }
            float r4 = java.lang.Float.parseFloat(r6)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x040d }
            int r6 = r2.length()     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x040d }
            r7 = 1
            int r6 = r6 - r7
            java.lang.String r2 = r2.substring(r3, r6)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x040d }
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x040d }
            f99 r3 = new f99     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x040d }
            ae9 r6 = new ae9     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x040d }
            r6.<init>(r4, r2)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x040d }
            d99[] r2 = new defpackage.d99[r7]     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x040d }
            r4 = 0
            r2[r4] = r6     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x040d }
            r3.<init>((defpackage.d99[]) r2)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x040d }
            r4 = r3
            goto L_0x040e
        L_0x040d:
            r4 = 0
        L_0x040e:
            f99 r2 = r5.b(r4)
            goto L_0x031b
        L_0x0414:
            int r10 = r10 + r21
            r12.G(r10)
            r8 = r31
            r1 = 24
            r2 = 4
            r3 = 8
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            r6 = 0
            r7 = 1
            r13 = 1751411826(0x68646c72, float:4.3148E24)
            r14 = 1835365473(0x6d657461, float:4.4382975E27)
            goto L_0x005e
        L_0x042d:
            r31 = r8
            r1 = -1
            r15.b(r5)
            r2 = 1835365473(0x6d657461, float:4.4382975E27)
            goto L_0x043c
        L_0x0437:
            r31 = r8
            r1 = -1
            r2 = r14
            r5 = 0
        L_0x043c:
            ly r2 = r11.v(r2)
            if (r2 == 0) goto L_0x051f
            byte[] r3 = defpackage.wy.a
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            ny r3 = r2.w(r3)
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            ny r4 = r2.w(r4)
            r6 = 1768715124(0x696c7374, float:1.7865732E25)
            ny r2 = r2.w(r6)
            if (r3 == 0) goto L_0x051f
            if (r4 == 0) goto L_0x051f
            if (r2 == 0) goto L_0x051f
            wpa r3 = r3.c
            r6 = 16
            r3.G(r6)
            int r3 = r3.g()
            r6 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r3 == r6) goto L_0x0471
            goto L_0x051f
        L_0x0471:
            wpa r3 = r4.c
            r4 = 12
            r3.G(r4)
            int r6 = r3.g()
            java.lang.String[] r7 = new java.lang.String[r6]
            r8 = 0
        L_0x047f:
            if (r8 >= r6) goto L_0x0497
            int r10 = r3.g()
            r13 = 4
            r3.H(r13)
            r12 = 8
            int r10 = r10 - r12
            java.nio.charset.Charset r14 = defpackage.b52.c
            java.lang.String r10 = r3.s(r10, r14)
            r7[r8] = r10
            r10 = 1
            int r8 = r8 + r10
            goto L_0x047f
        L_0x0497:
            r12 = 8
            r13 = 4
            wpa r2 = r2.c
            r2.G(r12)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x04a4:
            int r8 = r2.a()
            if (r8 <= r12) goto L_0x0512
            int r8 = r2.b
            int r10 = r2.g()
            int r12 = r2.g()
            r14 = 1
            int r12 = r12 - r14
            if (r12 < 0) goto L_0x04fe
            if (r12 >= r6) goto L_0x04fe
            r12 = r7[r12]
            int r14 = r8 + r10
        L_0x04be:
            int r1 = r2.b
            if (r1 >= r14) goto L_0x04f5
            int r20 = r2.g()
            int r4 = r2.g()
            r13 = 1684108385(0x64617461, float:1.6635614E22)
            if (r4 != r13) goto L_0x04ea
            int r1 = r2.g()
            int r4 = r2.g()
            r14 = 16
            int r13 = r20 + -16
            byte[] r14 = new byte[r13]
            r22 = r6
            r6 = 0
            r2.e(r6, r14, r13)
            k38 r6 = new k38
            r6.<init>(r14, r4, r1, r12)
            r4 = r6
            goto L_0x04f8
        L_0x04ea:
            r22 = r6
            int r1 = r1 + r20
            r2.G(r1)
            r4 = 12
            r13 = 4
            goto L_0x04be
        L_0x04f5:
            r22 = r6
            r4 = 0
        L_0x04f8:
            if (r4 == 0) goto L_0x0505
            r3.add(r4)
            goto L_0x0505
        L_0x04fe:
            r22 = r6
            java.lang.String r1 = "Skipped metadata with unknown key index: "
            defpackage.ey8.k(r12, r1)
        L_0x0505:
            int r8 = r8 + r10
            r2.G(r8)
            r6 = r22
            r1 = -1
            r4 = 12
            r12 = 8
            r13 = 4
            goto L_0x04a4
        L_0x0512:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x0519
            goto L_0x051f
        L_0x0519:
            f99 r4 = new f99
            r4.<init>((java.util.List) r3)
            goto L_0x0520
        L_0x051f:
            r4 = 0
        L_0x0520:
            f99 r1 = new f99
            r2 = 1836476516(0x6d766864, float:4.7662196E27)
            ny r2 = r11.w(r2)
            r2.getClass()
            wpa r2 = r2.c
            be9 r2 = defpackage.wy.c(r2)
            r3 = 1
            d99[] r6 = new defpackage.d99[r3]
            r7 = 0
            r6[r7] = r2
            r1.<init>((defpackage.d99[]) r6)
            int r2 = r0.b
            r6 = r2 & 1
            if (r6 == 0) goto L_0x0543
            r3 = 1
            goto L_0x0544
        L_0x0543:
            r3 = 0
        L_0x0544:
            hj8 r6 = new hj8
            r7 = 24
            r6.<init>(r7)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            r12 = r15
            r10 = -1
            r20 = 4
            r7 = r15
            r15 = r8
            r16 = r3
            r18 = r6
            java.util.ArrayList r3 = defpackage.wy.f(r11, r12, r13, r15, r16, r17, r18)
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = r10
            r32 = r11
            r6 = 0
            r8 = 0
        L_0x0569:
            int r13 = r3.size()
            if (r6 >= r13) goto L_0x06ad
            java.lang.Object r13 = r3.get(r6)
            a0f r13 = (defpackage.a0f) r13
            int r15 = r13.b
            if (r15 != 0) goto L_0x0586
            r16 = r1
            r29 = r2
            r22 = r3
            r13 = r4
            r1 = r10
            r2 = 1
            r19 = 16
            goto L_0x069d
        L_0x0586:
            kze r15 = r13.a
            r22 = r3
            r16 = r4
            long r3 = r15.e
            int r24 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r24 == 0) goto L_0x0595
        L_0x0592:
            r11 = r32
            goto L_0x0598
        L_0x0595:
            long r3 = r13.h
            goto L_0x0592
        L_0x0598:
            long r32 = java.lang.Math.max(r11, r3)
            ud9 r11 = new ud9
            pa5 r12 = r0.F0
            r23 = 1
            int r27 = r8 + 1
            int r10 = r15.b
            yze r8 = r12.B(r8, r10)
            r11.<init>(r15, r13, r8)
            qy5 r8 = r15.f
            java.lang.String r12 = r8.n
            java.lang.String r15 = "audio/true-hd"
            boolean r12 = r15.equals(r12)
            int r15 = r13.e
            if (r12 == 0) goto L_0x05c0
            r19 = 16
            int r15 = r15 * 16
            goto L_0x05c4
        L_0x05c0:
            r19 = 16
            int r15 = r15 + 30
        L_0x05c4:
            ny5 r12 = r8.a()
            r12.n = r15
            r15 = 2
            if (r10 != r15) goto L_0x05f1
            r15 = 8
            r26 = r2 & 8
            if (r26 == 0) goto L_0x05de
            r15 = -1
            if (r14 != r15) goto L_0x05d8
            r15 = 1
            goto L_0x05d9
        L_0x05d8:
            r15 = 2
        L_0x05d9:
            int r8 = r8.f
            r8 = r8 | r15
            r12.f = r8
        L_0x05de:
            r17 = 0
            int r8 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r8 <= 0) goto L_0x05f1
            int r8 = r13.b
            if (r8 <= 0) goto L_0x05f1
            float r8 = (float) r8
            float r3 = (float) r3
            r4 = 1232348160(0x49742400, float:1000000.0)
            float r3 = r3 / r4
            float r8 = r8 / r3
            r12.u = r8
        L_0x05f1:
            r3 = 1
            if (r10 != r3) goto L_0x0601
            int r3 = r7.a
            r4 = -1
            if (r3 == r4) goto L_0x0601
            int r8 = r7.b
            if (r8 == r4) goto L_0x0601
            r12.D = r3
            r12.E = r8
        L_0x0601:
            java.util.ArrayList r3 = r0.t0
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x060b
            r4 = 0
            goto L_0x0610
        L_0x060b:
            f99 r4 = new f99
            r4.<init>((java.util.List) r3)
        L_0x0610:
            f99[] r3 = new defpackage.f99[]{r4, r5, r1}
            f99 r4 = new f99
            r8 = 0
            d99[] r13 = new defpackage.d99[r8]
            r4.<init>((defpackage.d99[]) r13)
            if (r16 == 0) goto L_0x0667
            r13 = r16
            r8 = 0
        L_0x0621:
            d99[] r15 = r13.a
            r16 = r1
            int r1 = r15.length
            if (r8 >= r1) goto L_0x0663
            r1 = r15[r8]
            boolean r15 = r1 instanceof defpackage.k38
            if (r15 == 0) goto L_0x065a
            k38 r1 = (defpackage.k38) r1
            java.lang.String r15 = r1.a
            r29 = r2
            java.lang.String r2 = "com.android.capture.fps"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x064e
            r2 = 2
            if (r10 != r2) goto L_0x064c
            r2 = 1
            d99[] r15 = new defpackage.d99[r2]
            r17 = 0
            r15[r17] = r1
            f99 r1 = r4.a(r15)
        L_0x064a:
            r4 = r1
            goto L_0x065d
        L_0x064c:
            r2 = 1
            goto L_0x065d
        L_0x064e:
            r2 = 1
            r17 = 0
            d99[] r15 = new defpackage.d99[r2]
            r15[r17] = r1
            f99 r1 = r4.a(r15)
            goto L_0x064a
        L_0x065a:
            r29 = r2
            goto L_0x064c
        L_0x065d:
            int r8 = r8 + r2
            r1 = r16
            r2 = r29
            goto L_0x0621
        L_0x0663:
            r29 = r2
            r2 = 1
            goto L_0x066e
        L_0x0667:
            r29 = r2
            r13 = r16
            r2 = 1
            r16 = r1
        L_0x066e:
            r1 = 0
        L_0x066f:
            r8 = 3
            if (r1 >= r8) goto L_0x067a
            r8 = r3[r1]
            f99 r4 = r4.b(r8)
            int r1 = r1 + r2
            goto L_0x066f
        L_0x067a:
            d99[] r1 = r4.a
            int r1 = r1.length
            if (r1 <= 0) goto L_0x0681
            r12.j = r4
        L_0x0681:
            qy5 r1 = new qy5
            r1.<init>(r12)
            yze r2 = r11.c
            r2.e(r1)
            r1 = 2
            if (r10 != r1) goto L_0x0696
            r1 = -1
            if (r14 != r1) goto L_0x0697
            int r14 = r9.size()
            goto L_0x0697
        L_0x0696:
            r1 = -1
        L_0x0697:
            r9.add(r11)
            r8 = r27
            r2 = 1
        L_0x069d:
            int r6 = r6 + r2
            r10 = r1
            r4 = r13
            r1 = r16
            r3 = r22
            r2 = r29
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0569
        L_0x06ad:
            r1 = r10
            r11 = r32
            r17 = 0
            r19 = 16
            r0.I0 = r14
            r0.J0 = r11
            r2 = 0
            ud9[] r3 = new defpackage.ud9[r2]
            java.lang.Object[] r2 = r9.toArray(r3)
            ud9[] r2 = (defpackage.ud9[]) r2
            r0.G0 = r2
            int r3 = r2.length
            long[][] r3 = new long[r3][]
            int r4 = r2.length
            int[] r4 = new int[r4]
            int r5 = r2.length
            long[] r5 = new long[r5]
            int r6 = r2.length
            boolean[] r6 = new boolean[r6]
            r14 = 0
        L_0x06d0:
            int r7 = r2.length
            if (r14 >= r7) goto L_0x06eb
            r7 = r2[r14]
            a0f r7 = r7.b
            int r7 = r7.b
            long[] r7 = new long[r7]
            r3[r14] = r7
            r7 = r2[r14]
            a0f r7 = r7.b
            long[] r7 = r7.f
            r8 = 0
            r9 = r7[r8]
            r5[r14] = r9
            r7 = 1
            int r14 = r14 + r7
            goto L_0x06d0
        L_0x06eb:
            r15 = r17
            r14 = 0
        L_0x06ee:
            int r7 = r2.length
            if (r14 >= r7) goto L_0x072f
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = r1
            r9 = 0
        L_0x06f8:
            int r11 = r2.length
            if (r9 >= r11) goto L_0x070a
            boolean r11 = r6[r9]
            if (r11 != 0) goto L_0x0707
            r11 = r5[r9]
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 > 0) goto L_0x0707
            r10 = r9
            r7 = r11
        L_0x0707:
            r12 = 1
            int r9 = r9 + r12
            goto L_0x06f8
        L_0x070a:
            r12 = 1
            r7 = r4[r10]
            r8 = r3[r10]
            r8[r7] = r15
            r9 = r2[r10]
            a0f r9 = r9.b
            int[] r11 = r9.d
            r11 = r11[r7]
            r13 = r2
            long r1 = (long) r11
            long r15 = r15 + r1
            int r7 = r7 + r12
            r4[r10] = r7
            int r1 = r8.length
            if (r7 >= r1) goto L_0x0729
            long[] r1 = r9.f
            r1 = r1[r7]
            r5[r10] = r1
            goto L_0x072c
        L_0x0729:
            r6[r10] = r12
            int r14 = r14 + r12
        L_0x072c:
            r2 = r13
            r1 = -1
            goto L_0x06ee
        L_0x072f:
            r12 = 1
            r0.H0 = r3
            pa5 r1 = r0.F0
            r1.w()
            pa5 r1 = r0.F0
            r1.J(r0)
            r31.clear()
            r1 = 2
            r0.v0 = r1
            goto L_0x075b
        L_0x0743:
            r20 = r2
            r12 = r7
            r31 = r8
            r19 = 16
            boolean r1 = r31.isEmpty()
            if (r1 != 0) goto L_0x075b
            java.lang.Object r1 = r31.peek()
            ly r1 = (defpackage.ly) r1
            java.util.ArrayList r1 = r1.X
            r1.add(r11)
        L_0x075b:
            r7 = r12
            r2 = r20
            r1 = 24
            r3 = 8
            r6 = 0
            goto L_0x0009
        L_0x0765:
            int r1 = r0.v0
            r2 = 2
            if (r1 == r2) goto L_0x076f
            r1 = 0
            r0.v0 = r1
            r0.y0 = r1
        L_0x076f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd9.j(long):void");
    }

    public final boolean n(na5 na5) {
        ffc ffc;
        iud W = mr0.W(na5, false, (this.b & 2) != 0);
        if (W != null) {
            ffc = zw6.n(W);
        } else {
            ls5 ls5 = zw6.b;
            ffc = ffc.X;
        }
        this.u0 = ffc;
        return W == null;
    }

    public final List o() {
        return this.u0;
    }

    public final void release() {
    }
}
