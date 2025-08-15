package defpackage;

/* renamed from: mm5  reason: default package */
public final class mm5 implements la5 {
    public pa5 X;
    public yze Y;
    public int Z = 0;
    public final byte[] a = new byte[42];
    public final wpa b = new wpa(0, new byte[32768]);
    public final boolean c = false;
    public final lh4 o = new Object();
    public f99 s0;
    public qm5 t0;
    public int u0;
    public int v0;
    public km5 w0;
    public int x0;
    public long y0;

    public final void S(pa5 pa5) {
        this.X = pa5;
        this.Y = pa5.B(0, 1);
        pa5.w();
    }

    public final void d(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.Z = 0;
        } else {
            km5 km5 = this.w0;
            if (km5 != null) {
                km5.e(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.y0 = j3;
        this.x0 = 0;
        this.b.D(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: v1d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.na5 r31, defpackage.lh4 r32) {
        /*
            r30 = this;
            r0 = r30
            r1 = 0
            r2 = 2
            r3 = 1
            int r4 = r0.Z
            r5 = 0
            if (r4 == 0) goto L_0x03eb
            byte[] r6 = r0.a
            if (r4 == r3) goto L_0x03d9
            r7 = 4
            r8 = 3
            if (r4 == r2) goto L_0x03b6
            r9 = 7
            r10 = 6
            if (r4 == r8) goto L_0x0260
            r11 = 0
            r13 = -1
            r6 = 5
            if (r4 == r7) goto L_0x0197
            if (r4 != r6) goto L_0x0191
            yze r4 = r0.Y
            r4.getClass()
            qm5 r4 = r0.t0
            r4.getClass()
            km5 r4 = r0.w0
            if (r4 == 0) goto L_0x003f
            java.lang.Object r6 = r4.e
            im0 r6 = (defpackage.im0) r6
            if (r6 == 0) goto L_0x003f
            r0 = r31
            sa4 r0 = (defpackage.sa4) r0
            r1 = r32
            int r1 = r4.b(r0, r1)
            goto L_0x0190
        L_0x003f:
            long r6 = r0.y0
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            r6 = -1
            if (r4 != 0) goto L_0x009c
            qm5 r4 = r0.t0
            r7 = r31
            sa4 r7 = (defpackage.sa4) r7
            r7.Y = r1
            r7 = r31
            sa4 r7 = (defpackage.sa4) r7
            r7.b(r3, r1)
            byte[] r8 = new byte[r3]
            r7.q(r8, r1, r3, r1)
            byte r8 = r8[r1]
            r8 = r8 & r3
            if (r8 != r3) goto L_0x0061
            r8 = r3
            goto L_0x0062
        L_0x0061:
            r8 = r1
        L_0x0062:
            r7.b(r2, r1)
            if (r8 == 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r9 = r10
        L_0x0069:
            wpa r2 = new wpa
            r2.<init>((int) r9)
            byte[] r10 = r2.a
            r13 = r1
        L_0x0071:
            if (r13 >= r9) goto L_0x007e
            int r14 = r9 - r13
            int r14 = r7.d(r13, r10, r14)
            if (r14 != r6) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            int r13 = r13 + r14
            goto L_0x0071
        L_0x007e:
            r2.F(r13)
            r7.Y = r1
            long r6 = r2.B()     // Catch:{ NumberFormatException -> 0x0090 }
            if (r8 == 0) goto L_0x008b
        L_0x0089:
            r11 = r6
            goto L_0x0091
        L_0x008b:
            int r2 = r4.c
            long r8 = (long) r2
            long r6 = r6 * r8
            goto L_0x0089
        L_0x0090:
            r3 = r1
        L_0x0091:
            if (r3 == 0) goto L_0x0097
            r0.y0 = r11
            goto L_0x0190
        L_0x0097:
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r5, r5)
            throw r0
        L_0x009c:
            wpa r2 = r0.b
            int r4 = r2.c
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r4 >= r5) goto L_0x00de
            byte[] r9 = r2.a
            int r5 = r5 - r4
            r10 = r31
            sa4 r10 = (defpackage.sa4) r10
            int r5 = r10.read(r9, r4, r5)
            if (r5 != r6) goto L_0x00b7
            r9 = r3
            goto L_0x00b8
        L_0x00b7:
            r9 = r1
        L_0x00b8:
            if (r9 != 0) goto L_0x00bf
            int r4 = r4 + r5
            r2.F(r4)
            goto L_0x00df
        L_0x00bf:
            int r4 = r2.a()
            if (r4 != 0) goto L_0x00df
            long r1 = r0.y0
            long r1 = r1 * r7
            qm5 r3 = r0.t0
            int r4 = defpackage.oaf.a
            int r3 = r3.f
            long r3 = (long) r3
            long r8 = r1 / r3
            yze r7 = r0.Y
            int r11 = r0.x0
            r13 = 0
            r10 = 1
            r12 = 0
            r7.a(r8, r10, r11, r12, r13)
            r1 = r6
            goto L_0x0190
        L_0x00de:
            r9 = r1
        L_0x00df:
            int r4 = r2.b
            int r5 = r0.x0
            int r6 = r0.u0
            if (r5 >= r6) goto L_0x00f3
            int r6 = r6 - r5
            int r5 = r2.a()
            int r5 = java.lang.Math.min(r6, r5)
            r2.H(r5)
        L_0x00f3:
            qm5 r5 = r0.t0
            r5.getClass()
            int r5 = r2.b
        L_0x00fa:
            int r6 = r2.c
            r10 = 16
            int r6 = r6 - r10
            lh4 r11 = r0.o
            if (r5 > r6) goto L_0x0118
            r2.G(r5)
            qm5 r6 = r0.t0
            int r12 = r0.v0
            boolean r6 = defpackage.z7.b(r2, r6, r12, r11)
            if (r6 == 0) goto L_0x0116
            r2.G(r5)
            long r5 = r11.a
            goto L_0x0148
        L_0x0116:
            int r5 = r5 + r3
            goto L_0x00fa
        L_0x0118:
            if (r9 == 0) goto L_0x0144
        L_0x011a:
            int r6 = r2.c
            int r9 = r0.u0
            int r9 = r6 - r9
            if (r5 > r9) goto L_0x0140
            r2.G(r5)
            qm5 r6 = r0.t0     // Catch:{ IndexOutOfBoundsException -> 0x012e }
            int r9 = r0.v0     // Catch:{ IndexOutOfBoundsException -> 0x012e }
            boolean r6 = defpackage.z7.b(r2, r6, r9, r11)     // Catch:{ IndexOutOfBoundsException -> 0x012e }
            goto L_0x012f
        L_0x012e:
            r6 = r1
        L_0x012f:
            int r9 = r2.b
            int r12 = r2.c
            if (r9 <= r12) goto L_0x0136
            r6 = r1
        L_0x0136:
            if (r6 == 0) goto L_0x013e
            r2.G(r5)
            long r5 = r11.a
            goto L_0x0148
        L_0x013e:
            int r5 = r5 + r3
            goto L_0x011a
        L_0x0140:
            r2.G(r6)
            goto L_0x0147
        L_0x0144:
            r2.G(r5)
        L_0x0147:
            r5 = r13
        L_0x0148:
            int r3 = r2.b
            int r3 = r3 - r4
            r2.G(r4)
            yze r4 = r0.Y
            r4.b(r2, r3, r1)
            int r4 = r0.x0
            int r3 = r3 + r4
            r0.x0 = r3
            int r4 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0179
            long r11 = r0.y0
            long r11 = r11 * r7
            qm5 r4 = r0.t0
            int r7 = defpackage.oaf.a
            int r4 = r4.f
            long r7 = (long) r4
            long r16 = r11 / r7
            yze r15 = r0.Y
            r21 = 0
            r18 = 1
            r20 = 0
            r19 = r3
            r15.a(r16, r18, r19, r20, r21)
            r0.x0 = r1
            r0.y0 = r5
        L_0x0179:
            int r0 = r2.a()
            if (r0 >= r10) goto L_0x0190
            int r0 = r2.a()
            byte[] r3 = r2.a
            int r4 = r2.b
            java.lang.System.arraycopy(r3, r4, r3, r1, r0)
            r2.G(r1)
            r2.F(r0)
        L_0x0190:
            return r1
        L_0x0191:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0197:
            r4 = r31
            sa4 r4 = (defpackage.sa4) r4
            r4.Y = r1
            wpa r4 = new wpa
            r4.<init>((int) r2)
            byte[] r7 = r4.a
            r8 = r31
            sa4 r8 = (defpackage.sa4) r8
            r8.q(r7, r1, r2, r1)
            int r4 = r4.A()
            int r2 = r4 >> 2
            r7 = 16382(0x3ffe, float:2.2956E-41)
            if (r2 != r7) goto L_0x0257
            r8.Y = r1
            r0.v0 = r4
            pa5 r2 = r0.X
            int r4 = defpackage.oaf.a
            long r4 = r8.o
            qm5 r7 = r0.t0
            r7.getClass()
            qm5 r7 = r0.t0
            java.lang.Object r9 = r7.l
            h7b r9 = (defpackage.h7b) r9
            if (r9 == 0) goto L_0x01d4
            wd0 r8 = new wd0
            r8.<init>(r7, r4, r3)
            r1 = r2
            goto L_0x0250
        L_0x01d4:
            long r8 = r8.c
            int r3 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0244
            long r13 = r7.k
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x0244
            km5 r3 = new km5
            int r11 = r0.v0
            q64 r12 = new q64
            r13 = 27
            r12.<init>((int) r13, (java.lang.Object) r7)
            im5 r13 = new im5
            r13.<init>(r7, r11)
            long r18 = r7.c()
            int r11 = r7.d
            int r14 = r7.e
            if (r14 <= 0) goto L_0x0208
            long r14 = (long) r14
            r31 = r2
            long r1 = (long) r11
            long r14 = r14 + r1
            r1 = 2
            long r14 = r14 / r1
            r1 = 1
            long r14 = r14 + r1
            r26 = r14
            goto L_0x0226
        L_0x0208:
            r31 = r2
            int r1 = r7.c
            int r2 = r7.b
            if (r2 != r1) goto L_0x0214
            if (r2 <= 0) goto L_0x0214
            long r1 = (long) r2
            goto L_0x0216
        L_0x0214:
            r1 = 4096(0x1000, double:2.0237E-320)
        L_0x0216:
            int r14 = r7.h
            long r14 = (long) r14
            long r1 = r1 * r14
            int r14 = r7.i
            long r14 = (long) r14
            long r1 = r1 * r14
            r14 = 8
            long r1 = r1 / r14
            r14 = 64
            long r1 = r1 + r14
            r26 = r1
        L_0x0226:
            int r28 = java.lang.Math.max(r10, r11)
            long r1 = r7.k
            r15 = r3
            r16 = r12
            r17 = r13
            r20 = r1
            r22 = r4
            r24 = r8
            r15.<init>((defpackage.km0) r16, (defpackage.nm0) r17, (long) r18, (long) r20, (long) r22, (long) r24, (long) r26, (int) r28)
            r0.w0 = r3
            java.lang.Object r1 = r3.c
            r8 = r1
            hm0 r8 = (defpackage.hm0) r8
        L_0x0241:
            r1 = r31
            goto L_0x0250
        L_0x0244:
            r31 = r2
            wd0 r8 = new wd0
            long r1 = r7.c()
            r8.<init>(r1)
            goto L_0x0241
        L_0x0250:
            r1.J(r8)
            r0.Z = r6
            r1 = 0
            return r1
        L_0x0257:
            r8.Y = r1
            java.lang.String r0 = "First frame does not start with sync code."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r5, r0)
            throw r0
        L_0x0260:
            qm5 r4 = r0.t0
            r29 = r1
        L_0x0264:
            if (r29 != 0) goto L_0x0394
            r5 = r31
            sa4 r5 = (defpackage.sa4) r5
            r5.Y = r1
            s02 r5 = new s02
            byte[] r11 = new byte[r7]
            r5.<init>((byte[]) r11, (int) r7, (int) r2, (byte) r1)
            r12 = r31
            sa4 r12 = (defpackage.sa4) r12
            r12.q(r11, r1, r7, r1)
            boolean r11 = r5.h()
            int r13 = r5.i(r9)
            r14 = 24
            int r5 = r5.i(r14)
            int r5 = r5 + r7
            if (r13 != 0) goto L_0x029a
            r4 = 38
            byte[] r5 = new byte[r4]
            r12.h(r5, r1, r4, r1)
            qm5 r1 = new qm5
            r1.<init>(r5, r7, r3)
        L_0x0297:
            r4 = r1
            goto L_0x0382
        L_0x029a:
            if (r4 == 0) goto L_0x038e
            if (r13 != r8) goto L_0x02da
            wpa r1 = new wpa
            r1.<init>((int) r5)
            byte[] r13 = r1.a
            r14 = 0
            r12.h(r13, r14, r5, r14)
            h7b r25 = defpackage.ft.s(r1)
            qm5 r1 = new qm5
            long r12 = r4.k
            android.os.Parcelable r5 = r4.m
            r26 = r5
            f99 r26 = (defpackage.f99) r26
            int r5 = r4.b
            int r14 = r4.c
            int r15 = r4.d
            int r9 = r4.e
            int r3 = r4.f
            int r2 = r4.h
            int r4 = r4.i
            r18 = r15
            r15 = r1
            r16 = r5
            r17 = r14
            r19 = r9
            r20 = r3
            r21 = r2
            r22 = r4
            r23 = r12
            r15.<init>((int) r16, (int) r17, (int) r18, (int) r19, (int) r20, (int) r21, (int) r22, (long) r23, (defpackage.h7b) r25, (defpackage.f99) r26)
            goto L_0x0297
        L_0x02da:
            android.os.Parcelable r1 = r4.m
            f99 r1 = (defpackage.f99) r1
            if (r13 != r7) goto L_0x0330
            wpa r2 = new wpa
            r2.<init>((int) r5)
            byte[] r3 = r2.a
            r9 = 0
            r12.h(r3, r9, r5, r9)
            r2.H(r7)
            mfe r2 = defpackage.m6d.J(r2, r9, r9)
            java.lang.Object r2 = r2.a
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.util.List r2 = java.util.Arrays.asList(r2)
            f99 r2 = defpackage.m6d.B(r2)
            if (r1 != 0) goto L_0x0303
        L_0x0300:
            r23 = r2
            goto L_0x0308
        L_0x0303:
            f99 r2 = r1.b(r2)
            goto L_0x0300
        L_0x0308:
            qm5 r1 = new qm5
            long r2 = r4.k
            java.lang.Object r5 = r4.l
            r22 = r5
            h7b r22 = (defpackage.h7b) r22
            int r13 = r4.b
            int r14 = r4.c
            int r15 = r4.d
            int r5 = r4.e
            int r9 = r4.f
            int r12 = r4.h
            int r4 = r4.i
            r18 = r12
            r12 = r1
            r16 = r5
            r17 = r9
            r19 = r4
            r20 = r2
            r12.<init>((int) r13, (int) r14, (int) r15, (int) r16, (int) r17, (int) r18, (int) r19, (long) r20, (defpackage.h7b) r22, (defpackage.f99) r23)
            goto L_0x0297
        L_0x0330:
            if (r13 != r10) goto L_0x037f
            wpa r2 = new wpa
            r2.<init>((int) r5)
            byte[] r3 = r2.a
            r9 = 0
            r12.h(r3, r9, r5, r9)
            r2.H(r7)
            sza r2 = defpackage.sza.a(r2)
            ffc r2 = defpackage.zw6.n(r2)
            f99 r3 = new f99
            r3.<init>((java.util.List) r2)
            if (r1 != 0) goto L_0x0352
        L_0x034f:
            r23 = r3
            goto L_0x0357
        L_0x0352:
            f99 r3 = r1.b(r3)
            goto L_0x034f
        L_0x0357:
            qm5 r1 = new qm5
            long r2 = r4.k
            java.lang.Object r5 = r4.l
            r22 = r5
            h7b r22 = (defpackage.h7b) r22
            int r13 = r4.b
            int r14 = r4.c
            int r15 = r4.d
            int r5 = r4.e
            int r9 = r4.f
            int r12 = r4.h
            int r4 = r4.i
            r18 = r12
            r12 = r1
            r16 = r5
            r17 = r9
            r19 = r4
            r20 = r2
            r12.<init>((int) r13, (int) r14, (int) r15, (int) r16, (int) r17, (int) r18, (int) r19, (long) r20, (defpackage.h7b) r22, (defpackage.f99) r23)
            goto L_0x0297
        L_0x037f:
            r12.z(r5)
        L_0x0382:
            int r1 = defpackage.oaf.a
            r0.t0 = r4
            r29 = r11
            r1 = 0
            r2 = 2
            r3 = 1
            r9 = 7
            goto L_0x0264
        L_0x038e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0394:
            qm5 r1 = r0.t0
            r1.getClass()
            qm5 r1 = r0.t0
            int r1 = r1.d
            int r1 = java.lang.Math.max(r1, r10)
            r0.u0 = r1
            yze r1 = r0.Y
            int r2 = defpackage.oaf.a
            qm5 r2 = r0.t0
            f99 r3 = r0.s0
            qy5 r2 = r2.e(r6, r3)
            r1.e(r2)
            r0.Z = r7
            r1 = 0
            return r1
        L_0x03b6:
            wpa r2 = new wpa
            r2.<init>((int) r7)
            byte[] r3 = r2.a
            r4 = r31
            sa4 r4 = (defpackage.sa4) r4
            r4.h(r3, r1, r7, r1)
            long r2 = r2.w()
            r6 = 1716281667(0x664c6143, double:8.479558103E-315)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x03d2
            r0.Z = r8
            return r1
        L_0x03d2:
            java.lang.String r0 = "Failed to read FLAC stream marker."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r5, r0)
            throw r0
        L_0x03d9:
            int r2 = r6.length
            r3 = r31
            sa4 r3 = (defpackage.sa4) r3
            r3.q(r6, r1, r2, r1)
            r2 = r31
            sa4 r2 = (defpackage.sa4) r2
            r2.Y = r1
            r2 = 2
            r0.Z = r2
            return r1
        L_0x03eb:
            boolean r2 = r0.c
            r3 = 1
            r2 = r2 ^ r3
            r3 = r31
            sa4 r3 = (defpackage.sa4) r3
            r3.Y = r1
            r1 = r31
            sa4 r1 = (defpackage.sa4) r1
            long r3 = r1.r()
            if (r2 == 0) goto L_0x0401
            r2 = r5
            goto L_0x0403
        L_0x0401:
            ig5 r2 = defpackage.bt6.l
        L_0x0403:
            wd6 r6 = new wd6
            r7 = 17
            r6.<init>((int) r7)
            f99 r2 = r6.B(r1, r2)
            if (r2 == 0) goto L_0x0417
            d99[] r6 = r2.a
            int r6 = r6.length
            if (r6 != 0) goto L_0x0416
            goto L_0x0417
        L_0x0416:
            r5 = r2
        L_0x0417:
            long r6 = r1.r()
            long r6 = r6 - r3
            int r2 = (int) r6
            r1.z(r2)
            r0.s0 = r5
            r1 = 1
            r0.Z = r1
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm5.g(na5, lh4):int");
    }

    public final boolean n(na5 na5) {
        sa4 sa4 = (sa4) na5;
        f99 B = new wd6(17).B(sa4, bt6.l);
        if (B != null) {
            int length = B.a.length;
        }
        wpa wpa = new wpa(4);
        sa4.q(wpa.a, 0, 4, false);
        return wpa.w() == 1716281667;
    }

    public final void release() {
    }
}
