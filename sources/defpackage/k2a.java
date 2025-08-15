package defpackage;

import androidx.media3.common.ParserException;

/* renamed from: k2a  reason: default package */
public final class k2a implements la5 {
    public pa5 a;
    public a9e b;
    public boolean c;

    public final void S(pa5 pa5) {
        this.a = pa5;
    }

    public final boolean a(sa4 sa4) {
        boolean z;
        n2a n2a = new n2a(1);
        if (n2a.b(sa4, true) && (n2a.a & 2) == 2) {
            int min = Math.min(n2a.e, 8);
            wpa wpa = new wpa(min);
            sa4.q(wpa.a, 0, min, false);
            wpa.G(0);
            if (wpa.a() >= 5 && wpa.u() == 127 && wpa.w() == 1179402563) {
                this.b = new a9e(1);
            } else {
                wpa.G(0);
                try {
                    z = m6d.T(1, wpa, true);
                } catch (ParserException unused) {
                    z = false;
                }
                if (z) {
                    this.b = new a9e(1);
                } else {
                    wpa.G(0);
                    if (yma.g(wpa, yma.p)) {
                        this.b = new a9e(1);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void d(long j, long j2) {
        a9e a9e = this.b;
        if (a9e != null) {
            m2a m2a = (m2a) a9e.j;
            n2a n2a = (n2a) m2a.e;
            n2a.a = 0;
            n2a.b = 0;
            n2a.c = 0;
            n2a.d = 0;
            n2a.e = 0;
            ((wpa) m2a.f).D(0);
            m2a.b = -1;
            m2a.d = false;
            if (j == 0) {
                a9e.f(!a9e.h);
            } else if (a9e.e != 0) {
                long j3 = (((long) a9e.f) * j2) / 1000000;
                a9e.b = j3;
                int i = oaf.a;
                ((p2a) a9e.m).i(j3);
                a9e.e = 2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.na5 r19, defpackage.lh4 r20) {
        /*
            r18 = this;
            r0 = r18
            pa5 r1 = r0.a
            defpackage.fm9.l(r1)
            a9e r1 = r0.b
            r2 = 0
            if (r1 != 0) goto L_0x0021
            r1 = r19
            sa4 r1 = (defpackage.sa4) r1
            boolean r3 = r0.a(r1)
            if (r3 == 0) goto L_0x0019
            r1.Y = r2
            goto L_0x0021
        L_0x0019:
            java.lang.String r0 = "Failed to determine bitstream type"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x0021:
            boolean r1 = r0.c
            r3 = 1
            if (r1 != 0) goto L_0x003e
            pa5 r1 = r0.a
            yze r1 = r1.B(r2, r3)
            pa5 r4 = r0.a
            r4.w()
            a9e r4 = r0.b
            pa5 r5 = r0.a
            r4.l = r5
            r4.k = r1
            r4.f(r3)
            r0.c = r3
        L_0x003e:
            a9e r0 = r0.b
            java.lang.Object r1 = r0.k
            yze r1 = (defpackage.yze) r1
            defpackage.fm9.l(r1)
            int r1 = defpackage.oaf.a
            int r1 = r0.e
            java.lang.Object r4 = r0.j
            m2a r4 = (defpackage.m2a) r4
            r5 = -1
            r7 = -1
            r8 = 3
            r14 = 2
            if (r1 == 0) goto L_0x0101
            if (r1 == r3) goto L_0x00f3
            if (r1 == r14) goto L_0x0065
            if (r1 != r8) goto L_0x005f
        L_0x005c:
            r2 = r7
            goto L_0x01aa
        L_0x005f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0065:
            java.lang.Object r1 = r0.m
            p2a r1 = (defpackage.p2a) r1
            r9 = r19
            sa4 r9 = (defpackage.sa4) r9
            long r10 = r1.j(r9)
            r12 = 0
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 < 0) goto L_0x007e
            r1 = r20
            r1.a = r10
            r2 = r3
            goto L_0x01aa
        L_0x007e:
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0089
            r14 = 2
            long r10 = r10 + r14
            long r10 = -r10
            r0.a(r10)
        L_0x0089:
            boolean r1 = r0.h
            if (r1 != 0) goto L_0x00a1
            java.lang.Object r1 = r0.m
            p2a r1 = (defpackage.p2a) r1
            v1d r1 = r1.f()
            defpackage.fm9.l(r1)
            java.lang.Object r10 = r0.l
            pa5 r10 = (defpackage.pa5) r10
            r10.J(r1)
            r0.h = r3
        L_0x00a1:
            long r10 = r0.g
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x00b1
            boolean r1 = r4.c(r9)
            if (r1 == 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            r0.e = r8
            goto L_0x005c
        L_0x00b1:
            r0.g = r12
            java.lang.Object r1 = r4.f
            wpa r1 = (defpackage.wpa) r1
            long r3 = r0.b(r1)
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 < 0) goto L_0x00ec
            long r7 = r0.d
            long r9 = r7 + r3
            long r11 = r0.b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 < 0) goto L_0x00ec
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 * r9
            int r9 = r0.f
            long r9 = (long) r9
            long r12 = r7 / r9
            java.lang.Object r7 = r0.k
            yze r7 = (defpackage.yze) r7
            int r8 = r1.c
            r7.b(r1, r8, r2)
            java.lang.Object r7 = r0.k
            r11 = r7
            yze r11 = (defpackage.yze) r11
            int r15 = r1.c
            r16 = 0
            r17 = 0
            r14 = 1
            r11.a(r12, r14, r15, r16, r17)
            r0.b = r5
        L_0x00ec:
            long r5 = r0.d
            long r5 = r5 + r3
            r0.d = r5
            goto L_0x01aa
        L_0x00f3:
            long r3 = r0.c
            int r1 = (int) r3
            r3 = r19
            sa4 r3 = (defpackage.sa4) r3
            r3.z(r1)
            r0.e = r14
            goto L_0x01aa
        L_0x0101:
            r1 = r19
            sa4 r1 = (defpackage.sa4) r1
            boolean r9 = r4.c(r1)
            if (r9 != 0) goto L_0x010f
            r0.e = r8
            goto L_0x005c
        L_0x010f:
            long r9 = r1.o
            long r11 = r0.c
            long r9 = r9 - r11
            r0.g = r9
            java.lang.Object r1 = r0.n
            djb r1 = (defpackage.djb) r1
            java.lang.Object r9 = r4.f
            r15 = r9
            wpa r15 = (defpackage.wpa) r15
            boolean r1 = r0.d(r15, r11, r1)
            if (r1 == 0) goto L_0x012e
            r1 = r19
            sa4 r1 = (defpackage.sa4) r1
            long r9 = r1.o
            r0.c = r9
            goto L_0x0101
        L_0x012e:
            java.lang.Object r1 = r0.n
            djb r1 = (defpackage.djb) r1
            java.lang.Object r1 = r1.b
            qy5 r1 = (defpackage.qy5) r1
            int r7 = r1.C
            r0.f = r7
            boolean r7 = r0.i
            if (r7 != 0) goto L_0x0147
            java.lang.Object r7 = r0.k
            yze r7 = (defpackage.yze) r7
            r7.e(r1)
            r0.i = r3
        L_0x0147:
            java.lang.Object r1 = r0.n
            djb r1 = (defpackage.djb) r1
            java.lang.Object r1 = r1.c
            qy r1 = (defpackage.qy) r1
            if (r1 == 0) goto L_0x0156
            r0.m = r1
        L_0x0153:
            r1 = r14
            r2 = r15
            goto L_0x018f
        L_0x0156:
            r1 = r19
            sa4 r1 = (defpackage.sa4) r1
            long r10 = r1.c
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0168
            vu4 r1 = new vu4
            r1.<init>()
            r0.m = r1
            goto L_0x0153
        L_0x0168:
            java.lang.Object r1 = r4.e
            n2a r1 = (defpackage.n2a) r1
            int r4 = r1.a
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0175
            r16 = r3
            goto L_0x0177
        L_0x0175:
            r16 = r2
        L_0x0177:
            vc4 r3 = new vc4
            long r8 = r0.c
            int r4 = r1.d
            int r5 = r1.e
            int r4 = r4 + r5
            long r12 = (long) r4
            long r4 = r1.b
            r17 = 0
            r6 = r3
            r7 = r0
            r1 = r14
            r2 = r15
            r14 = r4
            r6.<init>(r7, r8, r10, r12, r14, r16, r17)
            r0.m = r3
        L_0x018f:
            r0.e = r1
            byte[] r0 = r2.a
            int r1 = r0.length
            r3 = 65025(0xfe01, float:9.112E-41)
            if (r1 != r3) goto L_0x019a
            goto L_0x01a9
        L_0x019a:
            int r1 = r2.c
            int r1 = java.lang.Math.max(r3, r1)
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            int r1 = r2.c
            r2.E(r1, r0)
        L_0x01a9:
            r2 = 0
        L_0x01aa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k2a.g(na5, lh4):int");
    }

    public final boolean n(na5 na5) {
        try {
            return a((sa4) na5);
        } catch (ParserException unused) {
            return false;
        }
    }

    public final void release() {
    }
}
