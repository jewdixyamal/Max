package defpackage;

import android.util.SparseArray;

/* renamed from: spb  reason: default package */
public final class spb implements la5 {
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final tue a = new tue(0);
    public final SparseArray b = new SparseArray();
    public final wpa c = new wpa(4096);
    public final opb o = new opb(1);
    public long s0;
    public km5 t0;
    public pa5 u0;
    public boolean v0;

    public final void S(pa5 pa5) {
        this.u0 = pa5;
    }

    public final void d(long j, long j2) {
        long j3;
        tue tue = this.a;
        synchronized (tue) {
            j3 = tue.b;
        }
        int i = (j3 > -9223372036854775807L ? 1 : (j3 == -9223372036854775807L ? 0 : -1));
        boolean z = true;
        boolean z2 = i == 0;
        if (!z2) {
            long d = tue.d();
            if (d == -9223372036854775807L || d == 0 || d == j2) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            tue.f(j2);
        }
        km5 km5 = this.t0;
        if (km5 != null) {
            km5.e(j2);
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i2 < sparseArray.size()) {
                qpb qpb = (qpb) sparseArray.valueAt(i2);
                qpb.f = false;
                qpb.a.a();
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: om0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: km5} */
    /* JADX WARNING: type inference failed for: r4v22, types: [java.lang.Object, km0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.na5 r27, defpackage.lh4 r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r28
            pa5 r2 = r0.u0
            defpackage.fm9.l(r2)
            r2 = r27
            sa4 r2 = (defpackage.sa4) r2
            long r14 = r2.c
            r17 = -1
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            r12 = 1
            r13 = 4
            r10 = 0
            r11 = 3
            r8 = 442(0x1ba, float:6.2E-43)
            opb r5 = r0.o
            if (r2 == 0) goto L_0x0110
            boolean r6 = r5.a
            if (r6 != 0) goto L_0x0110
            boolean r0 = r5.c
            java.lang.Object r2 = r5.h
            wpa r2 = (defpackage.wpa) r2
            r6 = 20000(0x4e20, double:9.8813E-320)
            if (r0 != 0) goto L_0x007d
            r0 = r27
            sa4 r0 = (defpackage.sa4) r0
            long r14 = r0.c
            long r6 = java.lang.Math.min(r6, r14)
            int r6 = (int) r6
            long r3 = (long) r6
            long r14 = r14 - r3
            long r3 = r0.o
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x0041
            r1.a = r14
            goto L_0x007a
        L_0x0041:
            r2.D(r6)
            r0.Y = r10
            byte[] r1 = r2.a
            r0.q(r1, r10, r6, r10)
            int r0 = r2.b
            int r1 = r2.c
            int r1 = r1 - r13
        L_0x0050:
            if (r1 < r0) goto L_0x0070
            byte[] r3 = r2.a
            int r3 = defpackage.opb.d(r1, r3)
            if (r3 != r8) goto L_0x006d
            int r3 = r1 + 4
            r2.G(r3)
            long r3 = defpackage.opb.e(r2)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            int r1 = r1 + -1
            goto L_0x0050
        L_0x0070:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0075:
            r5.e = r3
            r5.c = r12
        L_0x0079:
            r12 = r10
        L_0x007a:
            r10 = r12
            goto L_0x010f
        L_0x007d:
            long r3 = r5.e
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0091
            r0 = r27
            sa4 r0 = (defpackage.sa4) r0
            r5.b(r0)
            goto L_0x010f
        L_0x0091:
            boolean r0 = r5.b
            if (r0 != 0) goto L_0x00e4
            r0 = r27
            sa4 r0 = (defpackage.sa4) r0
            long r3 = r0.c
            long r3 = java.lang.Math.min(r6, r3)
            int r3 = (int) r3
            long r6 = r0.o
            long r13 = (long) r10
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x00aa
            r1.a = r13
            goto L_0x007a
        L_0x00aa:
            r2.D(r3)
            r0.Y = r10
            byte[] r1 = r2.a
            r0.q(r1, r10, r3, r10)
            int r0 = r2.b
            int r1 = r2.c
        L_0x00b8:
            int r3 = r1 + -3
            if (r0 >= r3) goto L_0x00da
            byte[] r3 = r2.a
            int r3 = defpackage.opb.d(r0, r3)
            if (r3 != r8) goto L_0x00d7
            int r3 = r0 + 4
            r2.G(r3)
            long r3 = defpackage.opb.e(r2)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x00d7
            goto L_0x00df
        L_0x00d7:
            int r0 = r0 + 1
            goto L_0x00b8
        L_0x00da:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00df:
            r5.d = r3
            r5.b = r12
            goto L_0x0079
        L_0x00e4:
            long r0 = r5.d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x00f7
            r0 = r27
            sa4 r0 = (defpackage.sa4) r0
            r5.b(r0)
            goto L_0x010f
        L_0x00f7:
            java.lang.Object r2 = r5.g
            tue r2 = (defpackage.tue) r2
            long r0 = r2.b(r0)
            long r3 = r5.e
            long r2 = r2.c(r3)
            long r2 = r2 - r0
            r5.f = r2
            r0 = r27
            sa4 r0 = (defpackage.sa4) r0
            r5.b(r0)
        L_0x010f:
            return r10
        L_0x0110:
            boolean r3 = r0.v0
            if (r3 != 0) goto L_0x0167
            r0.v0 = r12
            long r6 = r5.f
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0158
            km5 r9 = new km5
            ob6 r4 = new ob6
            r4.<init>()
            l7b r3 = new l7b
            java.lang.Object r5 = r5.g
            tue r5 = (defpackage.tue) r5
            r3.<init>((defpackage.tue) r5)
            r19 = 1
            long r19 = r6 + r19
            r16 = 1000(0x3e8, float:1.401E-42)
            r21 = 0
            r23 = 188(0xbc, double:9.3E-322)
            r5 = r3
            r3 = r9
            r25 = r2
            r2 = r9
            r8 = r19
            r10 = r21
            r12 = r14
            r19 = r14
            r14 = r23
            r3.<init>((defpackage.km0) r4, (defpackage.nm0) r5, (long) r6, (long) r8, (long) r10, (long) r12, (long) r14, (int) r16)
            r0.t0 = r2
            pa5 r3 = r0.u0
            java.lang.Object r2 = r2.c
            hm0 r2 = (defpackage.hm0) r2
            r3.J(r2)
            goto L_0x016b
        L_0x0158:
            r25 = r2
            r19 = r14
            pa5 r2 = r0.u0
            wd0 r3 = new wd0
            r3.<init>(r6)
            r2.J(r3)
            goto L_0x016b
        L_0x0167:
            r25 = r2
            r19 = r14
        L_0x016b:
            km5 r2 = r0.t0
            if (r2 == 0) goto L_0x017e
            java.lang.Object r3 = r2.e
            im0 r3 = (defpackage.im0) r3
            if (r3 == 0) goto L_0x017e
            r0 = r27
            sa4 r0 = (defpackage.sa4) r0
            int r0 = r2.b(r0, r1)
            return r0
        L_0x017e:
            r1 = r27
            sa4 r1 = (defpackage.sa4) r1
            r2 = 0
            r1.Y = r2
            if (r25 == 0) goto L_0x018e
            long r3 = r1.r()
            long r14 = r19 - r3
            goto L_0x0190
        L_0x018e:
            r14 = r17
        L_0x0190:
            int r3 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            r4 = -1
            if (r3 == 0) goto L_0x019c
            r5 = 4
            int r3 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x019c
            return r4
        L_0x019c:
            wpa r3 = r0.c
            byte[] r5 = r3.a
            r6 = 1
            r7 = 4
            boolean r5 = r1.q(r5, r2, r7, r6)
            if (r5 != 0) goto L_0x01a9
            return r4
        L_0x01a9:
            r3.G(r2)
            int r5 = r3.g()
            r8 = 441(0x1b9, float:6.18E-43)
            if (r5 != r8) goto L_0x01b5
            return r4
        L_0x01b5:
            r4 = 442(0x1ba, float:6.2E-43)
            if (r5 != r4) goto L_0x01d1
            byte[] r0 = r3.a
            r4 = 10
            r1.q(r0, r2, r4, r2)
            r0 = 9
            r3.G(r0)
            int r0 = r3.u()
            r0 = r0 & 7
            int r0 = r0 + 14
            r1.z(r0)
            return r2
        L_0x01d1:
            r4 = 443(0x1bb, float:6.21E-43)
            r8 = 2
            r9 = 6
            if (r5 != r4) goto L_0x01e8
            byte[] r0 = r3.a
            r1.q(r0, r2, r8, r2)
            r3.G(r2)
            int r0 = r3.A()
            int r0 = r0 + r9
            r1.z(r0)
            return r2
        L_0x01e8:
            r4 = r5 & -256(0xffffffffffffff00, float:NaN)
            r10 = 8
            int r4 = r4 >> r10
            if (r4 == r6) goto L_0x01f3
            r1.z(r6)
            return r2
        L_0x01f3:
            r4 = r5 & 255(0xff, float:3.57E-43)
            android.util.SparseArray r11 = r0.b
            java.lang.Object r12 = r11.get(r4)
            qpb r12 = (defpackage.qpb) r12
            boolean r13 = r0.X
            if (r13 != 0) goto L_0x0271
            if (r12 != 0) goto L_0x0253
            r13 = 189(0xbd, float:2.65E-43)
            if (r4 != r13) goto L_0x0213
            t3 r5 = new t3
            r5.<init>()
            r0.Y = r6
            long r13 = r1.o
            r0.s0 = r13
            goto L_0x0239
        L_0x0213:
            r13 = r5 & 224(0xe0, float:3.14E-43)
            r14 = 192(0xc0, float:2.69E-43)
            r15 = 0
            if (r13 != r14) goto L_0x0226
            he9 r5 = new he9
            r5.<init>(r15, r2)
            r0.Y = r6
            long r13 = r1.o
            r0.s0 = r13
            goto L_0x0239
        L_0x0226:
            r5 = r5 & 240(0xf0, float:3.36E-43)
            r13 = 224(0xe0, float:3.14E-43)
            if (r5 != r13) goto L_0x0238
            kh6 r5 = new kh6
            r5.<init>(r15)
            r0.Z = r6
            long r13 = r1.o
            r0.s0 = r13
            goto L_0x0239
        L_0x0238:
            r5 = r15
        L_0x0239:
            if (r5 == 0) goto L_0x0253
            l3f r12 = new l3f
            r13 = 256(0x100, float:3.59E-43)
            r14 = 1
            r15 = 0
            r12.<init>((int) r4, (int) r13, (int) r14, (byte) r15)
            pa5 r13 = r0.u0
            r5.i(r13, r12)
            qpb r12 = new qpb
            tue r13 = r0.a
            r12.<init>(r5, r13)
            r11.put(r4, r12)
        L_0x0253:
            boolean r4 = r0.Y
            if (r4 == 0) goto L_0x0261
            boolean r4 = r0.Z
            if (r4 == 0) goto L_0x0261
            long r4 = r0.s0
            r13 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4 + r13
            goto L_0x0264
        L_0x0261:
            r4 = 1048576(0x100000, double:5.180654E-318)
        L_0x0264:
            long r13 = r1.o
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0271
            r0.X = r6
            pa5 r0 = r0.u0
            r0.w()
        L_0x0271:
            byte[] r0 = r3.a
            r1.q(r0, r2, r8, r2)
            r3.G(r2)
            int r0 = r3.A()
            int r0 = r0 + r9
            if (r12 != 0) goto L_0x0286
            r1.z(r0)
            r0 = r2
            goto L_0x0333
        L_0x0286:
            r3.D(r0)
            byte[] r4 = r3.a
            r1.h(r4, r2, r0, r2)
            r3.G(r9)
            s02 r0 = r12.c
            byte[] r1 = r0.b
            r4 = 3
            r3.e(r2, r1, r4)
            r0.q(r2)
            r0.t(r10)
            boolean r1 = r0.h()
            r12.d = r1
            boolean r1 = r0.h()
            r12.e = r1
            r0.t(r9)
            int r1 = r0.i(r10)
            byte[] r5 = r0.b
            r3.e(r2, r5, r1)
            r0.q(r2)
            r8 = 0
            r12.g = r8
            boolean r1 = r12.d
            if (r1 == 0) goto L_0x031e
            r0.t(r7)
            int r1 = r0.i(r4)
            long r8 = (long) r1
            r1 = 30
            long r8 = r8 << r1
            r0.t(r6)
            r5 = 15
            int r10 = r0.i(r5)
            int r10 = r10 << r5
            long r10 = (long) r10
            long r8 = r8 | r10
            r0.t(r6)
            int r10 = r0.i(r5)
            long r10 = (long) r10
            long r8 = r8 | r10
            r0.t(r6)
            boolean r10 = r12.f
            tue r11 = r12.b
            if (r10 != 0) goto L_0x0316
            boolean r10 = r12.e
            if (r10 == 0) goto L_0x0316
            r0.t(r7)
            int r4 = r0.i(r4)
            long r13 = (long) r4
            long r13 = r13 << r1
            r0.t(r6)
            int r1 = r0.i(r5)
            int r1 = r1 << r5
            r4 = r3
            long r2 = (long) r1
            long r1 = r13 | r2
            r0.t(r6)
            int r3 = r0.i(r5)
            long r13 = (long) r3
            long r1 = r1 | r13
            r0.t(r6)
            r11.b(r1)
            r12.f = r6
            goto L_0x0317
        L_0x0316:
            r4 = r3
        L_0x0317:
            long r0 = r11.b(r8)
            r12.g = r0
            goto L_0x031f
        L_0x031e:
            r4 = r3
        L_0x031f:
            long r0 = r12.g
            dw4 r2 = r12.a
            r2.g(r7, r0)
            r2.d(r4)
            r0 = 0
            r2.e(r0)
            byte[] r1 = r4.a
            int r1 = r1.length
            r4.F(r1)
        L_0x0333:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spb.g(na5, lh4):int");
    }

    public final boolean n(na5 na5) {
        byte[] bArr = new byte[14];
        ((sa4) na5).q(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        sa4 sa4 = (sa4) na5;
        sa4.b(bArr[13] & 7, false);
        sa4.q(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public final void release() {
    }
}
