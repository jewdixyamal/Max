package defpackage;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* renamed from: yh9  reason: default package */
public final class yh9 {
    public long[] a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public yh9(int i) {
        this.a = usc.a;
        int[] iArr = k37.b;
        this.b = iArr;
        this.c = iArr;
        if (i >= 0) {
            d(usc.e(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final int a(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-((long) i6)) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & -9187201950435737472L;
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int b(int i) {
        int hashCode = Integer.hashCode(i) * -862048943;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-((long) i8)) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & -9187201950435737472L; j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & -9187201950435737472L) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int c(int i) {
        int b2 = b(i);
        if (b2 >= 0) {
            return this.c[b2];
        }
        throw new NoSuchElementException(zr6.h(i, "Cannot find value for key "));
    }

    public final void d(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, usc.d(i)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = usc.a;
        } else {
            int i2 = ((max + 15) & -8) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = usc.a(this.d) - this.e;
        this.b = new int[max];
        this.c = new int[max];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0073, code lost:
        r2 = a(r4);
        r11 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007b, code lost:
        if (r0.f != 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008d, code lost:
        if (((r0.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008f, code lost:
        r28 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0093, code lost:
        r2 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0095, code lost:
        if (r2 <= 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0097, code lost:
        r18 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a9, code lost:
        if (java.lang.Long.compareUnsigned(((long) r0.e) * 32, ((long) r2) * 25) > 0) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ab, code lost:
        r2 = r0.a;
        r3 = r0.d;
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b1, code lost:
        if (r4 >= r3) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b3, code lost:
        r8 = r4 >> 3;
        r17 = (r4 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c0, code lost:
        if (((r2[r8] >> r17) & 255) != 254) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c2, code lost:
        r13 = r0.a;
        r13[r8] = (r13[r8] & (~(255 << r17))) | (128 << r17);
        r6 = r0.d;
        r7 = ((r4 - 7) & r6) + (r6 & 7);
        r6 = r7 >> 3;
        r7 = (r7 & 7) << 3;
        r8 = r2;
        r14 = r3;
        r13[r6] = (r13[r6] & (~(255 << r7))) | (128 << r7);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f5, code lost:
        r8 = r2;
        r14 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f7, code lost:
        r4 = r4 + 1;
        r2 = r8;
        r3 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00fc, code lost:
        r0.f += r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0101, code lost:
        r28 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0107, code lost:
        r18 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0109, code lost:
        r2 = defpackage.usc.c(r0.d);
        r3 = r0.a;
        r4 = r0.b;
        r5 = r0.c;
        r6 = r0.d;
        d(r2);
        r2 = r0.b;
        r7 = r0.c;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011f, code lost:
        if (r8 >= r6) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x012f, code lost:
        if (((r3[r8 >> 3] >> ((r8 & 7) << 3)) & r11) >= 128) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0131, code lost:
        r13 = r4[r8];
        r14 = java.lang.Integer.hashCode(r13) * -862048943;
        r14 = r14 ^ (r14 << 16);
        r15 = a(r14 >>> 7);
        r11 = (long) (r14 & 127);
        r14 = r0.a;
        r16 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r26 = r3;
        r27 = r4;
        r14[r16] = (r14[r16] & (~(255 << r23))) | (r11 << r23);
        r3 = r0.d;
        r4 = ((r15 - 7) & r3) + (r3 & 7);
        r3 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r28 = r9;
        r14[r3] = (r14[r3] & (~(255 << r4))) | (r11 << r4);
        r2[r15] = r13;
        r7[r15] = r5[r8];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0187, code lost:
        r26 = r3;
        r27 = r4;
        r28 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x018d, code lost:
        r8 = r8 + 1;
        r3 = r26;
        r4 = r27;
        r9 = r28;
        r11 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0198, code lost:
        r2 = a(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x019c, code lost:
        r0.e++;
        r3 = r0.f;
        r5 = r0.a;
        r6 = r2 >> 3;
        r7 = r5[r6];
        r9 = (r2 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01b7, code lost:
        if (((r7 >> r9) & 255) != 128) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01b9, code lost:
        r19 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01bc, code lost:
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01be, code lost:
        r0.f = r3 - r19;
        r5[r6] = ((~(255 << r9)) & r7) | (r28 << r9);
        r3 = r0.d;
        r4 = ((r2 - 7) & r3) + (r3 & 7);
        r3 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r5[r3] = (r5[r3] & (~(255 << r4))) | (r28 << r4);
        r2 = ~r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0071, code lost:
        if (((r7 & ((~r7) << 6)) & -9187201950435737472L) == 0) goto L_0x01f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(int r31, int r32) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            int r2 = java.lang.Integer.hashCode(r31)
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r2 = r2 * r3
            int r4 = r2 << 16
            r2 = r2 ^ r4
            int r4 = r2 >>> 7
            r2 = r2 & 127(0x7f, float:1.78E-43)
            int r5 = r0.d
            r6 = r4 & r5
            r8 = 0
        L_0x0018:
            long[] r9 = r0.a
            int r10 = r6 >> 3
            r11 = r6 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r9 = r9[r10]
            int r15 = 64 - r11
            long r9 = r9 << r15
            r16 = r8
            long r7 = (long) r11
            long r7 = -r7
            r11 = 63
            long r7 = r7 >> r11
            long r7 = r7 & r9
            long r7 = r7 | r12
            long r9 = (long) r2
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r17 = r9 * r11
            long r14 = r7 ^ r17
            long r11 = r14 - r11
            long r14 = ~r14
            long r11 = r11 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r14
        L_0x0047:
            r17 = 0
            int r20 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r20 == 0) goto L_0x0068
            int r17 = java.lang.Long.numberOfTrailingZeros(r11)
            int r17 = r17 >> 3
            int r17 = r6 + r17
            r17 = r17 & r5
            int[] r13 = r0.b
            r13 = r13[r17]
            if (r13 != r1) goto L_0x0061
            r2 = r17
            goto L_0x01e6
        L_0x0061:
            r17 = 1
            long r17 = r11 - r17
            long r11 = r11 & r17
            goto L_0x0047
        L_0x0068:
            long r11 = ~r7
            r13 = 6
            long r11 = r11 << r13
            long r7 = r7 & r11
            long r7 = r7 & r14
            int r7 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            r8 = 8
            if (r7 == 0) goto L_0x01f2
            int r2 = r0.a(r4)
            int r5 = r0.f
            r11 = 255(0xff, double:1.26E-321)
            if (r5 != 0) goto L_0x008f
            long[] r5 = r0.a
            int r13 = r2 >> 3
            r13 = r5[r13]
            r5 = r2 & 7
            int r5 = r5 << 3
            long r13 = r13 >> r5
            long r13 = r13 & r11
            r15 = 254(0xfe, double:1.255E-321)
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x0093
        L_0x008f:
            r28 = r9
            goto L_0x019c
        L_0x0093:
            int r2 = r0.d
            if (r2 <= r8) goto L_0x0107
            int r5 = r0.e
            long r13 = (long) r5
            r17 = 32
            long r13 = r13 * r17
            r18 = r4
            long r3 = (long) r2
            r21 = 25
            long r3 = r3 * r21
            int r2 = java.lang.Long.compareUnsigned(r13, r3)
            if (r2 > 0) goto L_0x0109
            long[] r2 = r0.a
            int r3 = r0.d
            r4 = 0
            r5 = 0
        L_0x00b1:
            if (r4 >= r3) goto L_0x00fc
            int r8 = r4 >> 3
            r13 = r2[r8]
            r17 = r4 & 7
            int r17 = r17 << 3
            long r13 = r13 >> r17
            long r13 = r13 & r11
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L_0x00f5
            long[] r13 = r0.a
            r21 = r13[r8]
            long r6 = r11 << r17
            long r6 = ~r6
            long r6 = r21 & r6
            r21 = 128(0x80, double:6.32E-322)
            long r23 = r21 << r17
            long r6 = r6 | r23
            r13[r8] = r6
            int r6 = r0.d
            int r7 = r4 + -7
            r7 = r7 & r6
            r6 = r6 & 7
            int r7 = r7 + r6
            int r6 = r7 >> 3
            r7 = r7 & 7
            int r7 = r7 << 3
            r21 = r13[r6]
            r8 = r2
            r14 = r3
            long r2 = r11 << r7
            long r2 = ~r2
            long r2 = r21 & r2
            r21 = 128(0x80, double:6.32E-322)
            long r23 = r21 << r7
            long r2 = r2 | r23
            r13[r6] = r2
            int r5 = r5 + 1
            goto L_0x00f7
        L_0x00f5:
            r8 = r2
            r14 = r3
        L_0x00f7:
            int r4 = r4 + 1
            r2 = r8
            r3 = r14
            goto L_0x00b1
        L_0x00fc:
            int r2 = r0.f
            int r2 = r2 + r5
            r0.f = r2
        L_0x0101:
            r28 = r9
            r3 = r18
            goto L_0x0198
        L_0x0107:
            r18 = r4
        L_0x0109:
            int r2 = r0.d
            int r2 = defpackage.usc.c(r2)
            long[] r3 = r0.a
            int[] r4 = r0.b
            int[] r5 = r0.c
            int r6 = r0.d
            r0.d(r2)
            int[] r2 = r0.b
            int[] r7 = r0.c
            r8 = 0
        L_0x011f:
            if (r8 >= r6) goto L_0x0101
            int r13 = r8 >> 3
            r13 = r3[r13]
            r15 = r8 & 7
            int r15 = r15 << 3
            long r13 = r13 >> r15
            long r13 = r13 & r11
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L_0x0187
            r13 = r4[r8]
            int r14 = java.lang.Integer.hashCode(r13)
            r15 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r14 = r14 * r15
            int r16 = r14 << 16
            r14 = r14 ^ r16
            int r15 = r14 >>> 7
            int r15 = r0.a(r15)
            r14 = r14 & 127(0x7f, float:1.78E-43)
            long r11 = (long) r14
            long[] r14 = r0.a
            int r16 = r15 >> 3
            r23 = r15 & 7
            int r23 = r23 << 3
            r24 = r14[r16]
            r26 = r3
            r27 = r4
            r21 = 255(0xff, double:1.26E-321)
            long r3 = r21 << r23
            long r3 = ~r3
            long r3 = r24 & r3
            long r23 = r11 << r23
            long r3 = r3 | r23
            r14[r16] = r3
            int r3 = r0.d
            int r4 = r15 + -7
            r4 = r4 & r3
            r3 = r3 & 7
            int r4 = r4 + r3
            int r3 = r4 >> 3
            r4 = r4 & 7
            int r4 = r4 << 3
            r23 = r14[r3]
            r28 = r9
            r21 = 255(0xff, double:1.26E-321)
            long r9 = r21 << r4
            long r9 = ~r9
            long r9 = r23 & r9
            long r11 = r11 << r4
            long r9 = r9 | r11
            r14[r3] = r9
            r2[r15] = r13
            r3 = r5[r8]
            r7[r15] = r3
            goto L_0x018d
        L_0x0187:
            r26 = r3
            r27 = r4
            r28 = r9
        L_0x018d:
            int r8 = r8 + 1
            r3 = r26
            r4 = r27
            r9 = r28
            r11 = 255(0xff, double:1.26E-321)
            goto L_0x011f
        L_0x0198:
            int r2 = r0.a(r3)
        L_0x019c:
            int r3 = r0.e
            r4 = 1
            int r3 = r3 + r4
            r0.e = r3
            int r3 = r0.f
            long[] r5 = r0.a
            int r6 = r2 >> 3
            r7 = r5[r6]
            r9 = r2 & 7
            int r9 = r9 << 3
            long r10 = r7 >> r9
            r12 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r12
            r14 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 != 0) goto L_0x01bc
            r19 = r4
            goto L_0x01be
        L_0x01bc:
            r19 = 0
        L_0x01be:
            int r3 = r3 - r19
            r0.f = r3
            long r3 = r12 << r9
            long r3 = ~r3
            long r3 = r3 & r7
            long r7 = r28 << r9
            long r3 = r3 | r7
            r5[r6] = r3
            int r3 = r0.d
            int r4 = r2 + -7
            r4 = r4 & r3
            r3 = r3 & 7
            int r4 = r4 + r3
            int r3 = r4 >> 3
            r4 = r4 & 7
            int r4 = r4 << 3
            r6 = r5[r3]
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 << r4
            long r8 = ~r8
            long r6 = r6 & r8
            long r8 = r28 << r4
            long r6 = r6 | r8
            r5[r3] = r6
            int r2 = ~r2
        L_0x01e6:
            if (r2 >= 0) goto L_0x01e9
            int r2 = ~r2
        L_0x01e9:
            int[] r3 = r0.b
            r3[r2] = r1
            int[] r0 = r0.c
            r0[r2] = r32
            return
        L_0x01f2:
            r3 = r4
            int r8 = r16 + 8
            int r6 = r6 + r8
            r6 = r6 & r5
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh9.e(int, int):void");
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof defpackage.yh9
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            yh9 r1 = (defpackage.yh9) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L_0x0017
            return r4
        L_0x0017:
            int[] r3 = r0.b
            int[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0061
            r7 = r4
        L_0x0023:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x005c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L_0x003d:
            if (r12 >= r10) goto L_0x005a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L_0x0056
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            int r14 = r1.c(r14)
            if (r13 == r14) goto L_0x0056
            return r4
        L_0x0056:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L_0x003d
        L_0x005a:
            if (r10 != r11) goto L_0x0061
        L_0x005c:
            if (r7 == r6) goto L_0x0061
            int r7 = r7 + 1
            goto L_0x0023
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr[i6];
                            i3 += Integer.hashCode(iArr2[i6]) ^ Integer.hashCode(i7);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 == length) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            int i7 = iArr2[i5];
                            sb.append(i6);
                            sb.append("=");
                            sb.append(i7);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ yh9() {
        this(6);
    }
}
