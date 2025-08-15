package defpackage;

/* renamed from: ec  reason: default package */
public final class ec implements la5 {
    public final s02 X;
    public pa5 Y;
    public long Z;
    public final int a;
    public final gc b;
    public final wpa c;
    public final wpa o;
    public long s0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;

    public ec(int i) {
        this.a = (i & 2) != 0 ? i | 1 : i;
        this.b = new gc(true, (String) null, 0);
        this.c = new wpa(2048);
        this.t0 = -1;
        this.s0 = -1;
        wpa wpa = new wpa(10);
        this.o = wpa;
        byte[] bArr = wpa.a;
        this.X = new s02(bArr, bArr.length, 2, (byte) 0);
    }

    public final void S(pa5 pa5) {
        this.Y = pa5;
        this.b.i(pa5, new l3f(0, 1, 1, (byte) 0));
        pa5.w();
    }

    public final int a(sa4 sa4) {
        int i = 0;
        while (true) {
            wpa wpa = this.o;
            sa4.q(wpa.a, 0, 10, false);
            wpa.G(0);
            if (wpa.x() != 4801587) {
                break;
            }
            wpa.H(3);
            int t = wpa.t();
            i += t + 10;
            sa4.b(t, false);
        }
        sa4.Y = 0;
        sa4.b(i, false);
        if (this.s0 == -1) {
            this.s0 = (long) i;
        }
        return i;
    }

    public final void d(long j, long j2) {
        this.v0 = false;
        this.b.a();
        this.Z = j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0120 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.na5 r19, defpackage.lh4 r20) {
        /*
            r18 = this;
            r0 = r18
            pa5 r1 = r0.Y
            defpackage.fm9.l(r1)
            r1 = r19
            sa4 r1 = (defpackage.sa4) r1
            long r3 = r1.c
            int r1 = r0.a
            r2 = r1 & 2
            r10 = 0
            r11 = 1
            r12 = -1
            if (r2 != 0) goto L_0x0024
            r5 = r1 & 1
            if (r5 == 0) goto L_0x0021
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            r5 = r12
            goto L_0x00b3
        L_0x0024:
            s02 r5 = r0.X
            wpa r6 = r0.o
            boolean r7 = r0.u0
            if (r7 == 0) goto L_0x002d
            goto L_0x0021
        L_0x002d:
            r0.t0 = r12
            r7 = r19
            sa4 r7 = (defpackage.sa4) r7
            r7.Y = r10
            long r8 = r7.o
            r13 = 0
            int r8 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x0040
            r0.a(r7)
        L_0x0040:
            r8 = r10
        L_0x0041:
            byte[] r9 = r6.a     // Catch:{ EOFException -> 0x00a0 }
            r15 = r19
            sa4 r15 = (defpackage.sa4) r15     // Catch:{ EOFException -> 0x00a0 }
            r12 = 2
            boolean r9 = r15.q(r9, r10, r12, r11)     // Catch:{ EOFException -> 0x00a0 }
            if (r9 == 0) goto L_0x00a0
            r6.G(r10)     // Catch:{ EOFException -> 0x00a0 }
            int r9 = r6.A()     // Catch:{ EOFException -> 0x00a0 }
            r12 = 65526(0xfff6, float:9.1821E-41)
            r9 = r9 & r12
            r12 = 65520(0xfff0, float:9.1813E-41)
            if (r9 != r12) goto L_0x0060
            r9 = r11
            goto L_0x0061
        L_0x0060:
            r9 = r10
        L_0x0061:
            if (r9 != 0) goto L_0x0065
            r8 = r10
            goto L_0x00a0
        L_0x0065:
            byte[] r9 = r6.a     // Catch:{ EOFException -> 0x00a0 }
            r12 = 4
            boolean r9 = r15.q(r9, r10, r12, r11)     // Catch:{ EOFException -> 0x00a0 }
            if (r9 != 0) goto L_0x006f
            goto L_0x00a0
        L_0x006f:
            r9 = 14
            r5.q(r9)     // Catch:{ EOFException -> 0x00a0 }
            r9 = 13
            int r9 = r5.i(r9)     // Catch:{ EOFException -> 0x00a0 }
            r12 = 6
            if (r9 <= r12) goto L_0x0095
            long r10 = (long) r9     // Catch:{ EOFException -> 0x00a0 }
            long r13 = r13 + r10
            int r8 = r8 + 1
            r10 = 1000(0x3e8, float:1.401E-42)
            if (r8 != r10) goto L_0x0087
            r10 = 1
            goto L_0x00a0
        L_0x0087:
            int r9 = r9 + -6
            r10 = 1
            boolean r9 = r15.b(r9, r10)     // Catch:{ EOFException -> 0x00a0 }
            if (r9 != 0) goto L_0x0091
            goto L_0x00a0
        L_0x0091:
            r11 = r10
            r10 = 0
            r12 = -1
            goto L_0x0041
        L_0x0095:
            r10 = r11
            r0.u0 = r10     // Catch:{ EOFException -> 0x00a0 }
            java.lang.String r5 = "Malformed ADTS stream"
            r6 = 0
            androidx.media3.common.ParserException r5 = androidx.media3.common.ParserException.a(r6, r5)     // Catch:{ EOFException -> 0x00a0 }
            throw r5     // Catch:{ EOFException -> 0x00a0 }
        L_0x00a0:
            r5 = 0
            r7.Y = r5
            if (r8 <= 0) goto L_0x00ad
            long r5 = (long) r8
            long r13 = r13 / r5
            int r5 = (int) r13
            r0.t0 = r5
            r5 = -1
        L_0x00ab:
            r6 = 1
            goto L_0x00b1
        L_0x00ad:
            r5 = -1
            r0.t0 = r5
            goto L_0x00ab
        L_0x00b1:
            r0.u0 = r6
        L_0x00b3:
            wpa r10 = r0.c
            byte[] r6 = r10.a
            r7 = 2048(0x800, float:2.87E-42)
            r8 = r19
            sa4 r8 = (defpackage.sa4) r8
            r9 = 0
            int r11 = r8.read(r6, r9, r7)
            if (r11 != r5) goto L_0x00c6
            r13 = 1
            goto L_0x00c7
        L_0x00c6:
            r13 = 0
        L_0x00c7:
            boolean r5 = r0.w0
            gc r14 = r0.b
            if (r5 == 0) goto L_0x00ce
            goto L_0x011e
        L_0x00ce:
            r5 = 1
            r1 = r1 & r5
            if (r1 == 0) goto L_0x00d8
            int r1 = r0.t0
            if (r1 <= 0) goto L_0x00d8
            r1 = 1
            goto L_0x00d9
        L_0x00d8:
            r1 = 0
        L_0x00d9:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x00e9
            long r7 = r14.r
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x00e9
            if (r13 != 0) goto L_0x00e9
            goto L_0x011e
        L_0x00e9:
            if (r1 == 0) goto L_0x0111
            long r7 = r14.r
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0111
            pa5 r1 = r0.Y
            if (r2 == 0) goto L_0x00f7
            r9 = 1
            goto L_0x00f8
        L_0x00f7:
            r9 = 0
        L_0x00f8:
            int r15 = r0.t0
            long r5 = (long) r15
            r16 = 8000000(0x7a1200, double:3.952525E-317)
            long r5 = r5 * r16
            long r5 = r5 / r7
            int r7 = (int) r5
            hi3 r8 = new hi3
            long r5 = r0.s0
            r2 = r8
            r12 = r8
            r8 = r15
            r2.<init>(r3, r5, r7, r8, r9)
            r1.J(r12)
        L_0x010f:
            r1 = 1
            goto L_0x011c
        L_0x0111:
            pa5 r1 = r0.Y
            wd0 r2 = new wd0
            r2.<init>(r5)
            r1.J(r2)
            goto L_0x010f
        L_0x011c:
            r0.w0 = r1
        L_0x011e:
            if (r13 == 0) goto L_0x0122
            r1 = -1
            return r1
        L_0x0122:
            r1 = 0
            r10.G(r1)
            r10.F(r11)
            boolean r1 = r0.v0
            if (r1 != 0) goto L_0x0134
            long r1 = r0.Z
            r14.t = r1
            r1 = 1
            r0.v0 = r1
        L_0x0134:
            r14.d(r10)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec.g(na5, lh4):int");
    }

    public final boolean n(na5 na5) {
        sa4 sa4 = (sa4) na5;
        int a2 = a(sa4);
        int i = a2;
        int i2 = 0;
        int i3 = 0;
        do {
            wpa wpa = this.o;
            sa4.q(wpa.a, 0, 2, false);
            wpa.G(0);
            if ((wpa.A() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                sa4 sa42 = (sa4) na5;
                sa42.q(wpa.a, 0, 4, false);
                s02 s02 = this.X;
                s02.q(14);
                int i4 = s02.i(13);
                if (i4 <= 6) {
                    i++;
                    sa42.Y = 0;
                    sa42.b(i, false);
                } else {
                    sa42.b(i4 - 6, false);
                    i3 += i4;
                }
            } else {
                i++;
                sa4 sa43 = (sa4) na5;
                sa43.Y = 0;
                sa43.b(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - a2 < 8192);
        return false;
    }

    public final void release() {
    }
}
