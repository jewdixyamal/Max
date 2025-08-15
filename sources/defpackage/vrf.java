package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.math.RoundingMode;
import org.apache.http.HttpStatus;

/* renamed from: vrf  reason: default package */
public final class vrf implements wrf, xrf {
    public static final int[] n = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] o = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, HttpStatus.SC_TEMPORARY_REDIRECT, 337, 371, HttpStatus.SC_REQUEST_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public static final int[] p = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] q = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, HttpStatus.SC_TEMPORARY_REDIRECT, 337, 371, HttpStatus.SC_REQUEST_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final /* synthetic */ int a = 0;
    public final int b;
    public final byte[] c;
    public final int d;
    public int e;
    public long f;
    public int g;
    public long h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public vrf(oa5 oa5, xze xze, bsf bsf) {
        this.i = oa5;
        this.j = xze;
        this.k = bsf;
        int i2 = bsf.b;
        int max = Math.max(1, i2 / 10);
        this.d = max;
        byte[] bArr = bsf.e;
        int length = bArr.length;
        byte b2 = bArr[0];
        byte b3 = bArr[1];
        byte b4 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
        this.b = b4;
        int i3 = bsf.a;
        int i4 = bsf.c;
        int i5 = (((i4 - (i3 * 4)) * 8) / (bsf.d * i3)) + 1;
        if (b4 == i5) {
            int g2 = maf.g(max, b4);
            this.c = new byte[(g2 * i4)];
            this.l = new yaf(b4 * 2 * i3 * g2);
            int i6 = ((i4 * i2) * 8) / b4;
            my5 my5 = new my5();
            my5.k = "audio/raw";
            my5.f = i6;
            my5.g = i6;
            my5.l = max * 2 * i3;
            my5.x = i3;
            my5.y = i2;
            my5.z = 2;
            this.m = new oy5(my5);
            return;
        }
        StringBuilder sb = new StringBuilder(56);
        sb.append("Expected frames per block: ");
        sb.append(i5);
        sb.append("; got: ");
        sb.append(b4);
        throw ParserException.a((RuntimeException) null, sb.toString());
    }

    public final void a(long j2) {
        switch (this.a) {
            case 0:
                this.e = 0;
                this.f = j2;
                this.g = 0;
                this.h = 0;
                return;
            default:
                this.e = 0;
                this.f = j2;
                this.g = 0;
                this.h = 0;
                return;
        }
    }

    public final void b(int i2, long j2) {
        switch (this.a) {
            case 0:
                ((oa5) this.i).M(new csf((bsf) this.k, this.b, (long) i2, j2));
                ((xze) this.j).d((oy5) this.m);
                return;
            default:
                ((pa5) this.i).J(new dsf((bsf) this.k, this.b, (long) i2, j2));
                ((yze) this.j).e((qy5) this.m);
                return;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047 A[EDGE_INSN: B:41:0x0047->B:11:0x0047 ?: BREAK  
    EDGE_INSN: B:42:0x0047->B:11:0x0047 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    public boolean c(defpackage.sa4 r26, long r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            int r3 = r0.g
            java.lang.Object r4 = r0.k
            bsf r4 = (defpackage.bsf) r4
            int r5 = r4.a
            int r5 = r5 * 2
            int r3 = r3 / r5
            int r5 = r0.d
            int r3 = r5 - r3
            int r6 = r0.b
            int r3 = defpackage.oaf.g(r3, r6)
            int r7 = r4.c
            int r3 = r3 * r7
            r7 = 0
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x0024
        L_0x0022:
            r7 = 1
            goto L_0x0025
        L_0x0024:
            r7 = 0
        L_0x0025:
            byte[] r10 = r0.c
            if (r7 != 0) goto L_0x0047
            int r11 = r0.e
            if (r11 >= r3) goto L_0x0047
            int r11 = r3 - r11
            long r11 = (long) r11
            long r11 = java.lang.Math.min(r11, r1)
            int r11 = (int) r11
            int r12 = r0.e
            r13 = r26
            int r10 = r13.read(r10, r12, r11)
            r11 = -1
            if (r10 != r11) goto L_0x0041
            goto L_0x0022
        L_0x0041:
            int r11 = r0.e
            int r11 = r11 + r10
            r0.e = r11
            goto L_0x0025
        L_0x0047:
            int r1 = r0.e
            int r2 = r4.c
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x0150
            r3 = 0
        L_0x004f:
            java.lang.Object r11 = r0.l
            wpa r11 = (defpackage.wpa) r11
            if (r3 >= r1) goto L_0x011d
            r12 = 0
        L_0x0056:
            int r13 = r4.a
            if (r12 >= r13) goto L_0x0111
            byte[] r14 = r11.a
            int r15 = r3 * r2
            int r16 = r12 * 4
            int r16 = r16 + r15
            int r15 = r13 * 4
            int r15 = r15 + r16
            int r17 = r2 / r13
            int r17 = r17 + -4
            int r18 = r16 + 1
            byte r9 = r10[r18]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 8
            byte r8 = r10[r16]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r8 | r9
            short r8 = (short) r8
            int r16 = r16 + 2
            byte r9 = r10[r16]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r16 = r7
            r7 = 88
            int r9 = java.lang.Math.min(r9, r7)
            int[] r19 = q
            r20 = r19[r9]
            int r21 = r3 * r6
            int r21 = r21 * r13
            int r21 = r21 + r12
            int r21 = r21 * 2
            r7 = r8 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r14[r21] = r7
            int r7 = r21 + 1
            r27 = r9
            int r9 = r8 >> 8
            byte r9 = (byte) r9
            r14[r7] = r9
            r9 = r27
            r22 = r5
            r7 = 0
        L_0x00a5:
            int r5 = r17 * 2
            if (r7 >= r5) goto L_0x0105
            int r5 = r7 / 8
            int r23 = r7 / 2
            int r23 = r23 % 4
            int r5 = r5 * r13
            int r5 = r5 * 4
            int r5 = r5 + r15
            int r5 = r5 + r23
            byte r5 = r10[r5]
            r23 = r10
            r10 = r5 & 255(0xff, float:3.57E-43)
            int r24 = r7 % 2
            if (r24 != 0) goto L_0x00c2
            r5 = r5 & 15
            goto L_0x00c4
        L_0x00c2:
            int r5 = r10 >> 4
        L_0x00c4:
            r10 = r5 & 7
            int r10 = r10 * 2
            r18 = 1
            int r10 = r10 + 1
            int r10 = r10 * r20
            int r10 = r10 >> 3
            r20 = r5 & 8
            if (r20 == 0) goto L_0x00d5
            int r10 = -r10
        L_0x00d5:
            int r8 = r8 + r10
            r10 = -32768(0xffffffffffff8000, float:NaN)
            r27 = r15
            r15 = 32767(0x7fff, float:4.5916E-41)
            int r8 = defpackage.oaf.j(r8, r10, r15)
            int r10 = r13 * 2
            int r21 = r10 + r21
            r10 = r8 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r14[r21] = r10
            int r10 = r21 + 1
            int r15 = r8 >> 8
            byte r15 = (byte) r15
            r14[r10] = r15
            int[] r10 = p
            r5 = r10[r5]
            int r9 = r9 + r5
            r5 = 0
            r10 = 88
            int r9 = defpackage.oaf.j(r9, r5, r10)
            r20 = r19[r9]
            int r7 = r7 + 1
            r15 = r27
            r10 = r23
            goto L_0x00a5
        L_0x0105:
            r23 = r10
            r18 = 1
            int r12 = r12 + 1
            r7 = r16
            r5 = r22
            goto L_0x0056
        L_0x0111:
            r22 = r5
            r16 = r7
            r23 = r10
            r18 = 1
            int r3 = r3 + 1
            goto L_0x004f
        L_0x011d:
            r22 = r5
            r16 = r7
            int r6 = r6 * r1
            int r3 = r4.a
            int r6 = r6 * 2
            int r6 = r6 * r3
            r3 = 0
            r11.G(r3)
            r11.F(r6)
            int r3 = r0.e
            int r1 = r1 * r2
            int r3 = r3 - r1
            r0.e = r3
            int r1 = r11.c
            java.lang.Object r2 = r0.j
            yze r2 = (defpackage.yze) r2
            r3 = 0
            r2.b(r11, r1, r3)
            int r2 = r0.g
            int r2 = r2 + r1
            r0.g = r2
            int r1 = r4.a
            int r1 = r1 * 2
            int r2 = r2 / r1
            r1 = r22
            if (r2 < r1) goto L_0x0152
            r0.e(r1)
            goto L_0x0152
        L_0x0150:
            r16 = r7
        L_0x0152:
            if (r16 == 0) goto L_0x0160
            int r1 = r0.g
            int r2 = r4.a
            int r2 = r2 * 2
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x0160
            r0.e(r1)
        L_0x0160:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vrf.c(sa4, long):boolean");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047 A[EDGE_INSN: B:41:0x0047->B:11:0x0047 ?: BREAK  
    EDGE_INSN: B:42:0x0047->B:11:0x0047 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    public boolean d(defpackage.ra4 r26, long r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            int r3 = r0.g
            java.lang.Object r4 = r0.k
            bsf r4 = (defpackage.bsf) r4
            int r5 = r4.a
            int r5 = r5 * 2
            int r3 = r3 / r5
            int r5 = r0.d
            int r3 = r5 - r3
            int r6 = r0.b
            int r3 = defpackage.maf.g(r3, r6)
            int r7 = r4.c
            int r3 = r3 * r7
            r7 = 0
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x0024
        L_0x0022:
            r7 = 1
            goto L_0x0025
        L_0x0024:
            r7 = 0
        L_0x0025:
            byte[] r10 = r0.c
            if (r7 != 0) goto L_0x0047
            int r11 = r0.e
            if (r11 >= r3) goto L_0x0047
            int r11 = r3 - r11
            long r11 = (long) r11
            long r11 = java.lang.Math.min(r11, r1)
            int r11 = (int) r11
            int r12 = r0.e
            r13 = r26
            int r10 = r13.read(r10, r12, r11)
            r11 = -1
            if (r10 != r11) goto L_0x0041
            goto L_0x0022
        L_0x0041:
            int r11 = r0.e
            int r11 = r11 + r10
            r0.e = r11
            goto L_0x0025
        L_0x0047:
            int r1 = r0.e
            int r2 = r4.c
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x014f
            r3 = 0
        L_0x004f:
            java.lang.Object r11 = r0.l
            yaf r11 = (defpackage.yaf) r11
            if (r3 >= r1) goto L_0x011d
            r12 = 0
        L_0x0056:
            int r13 = r4.a
            if (r12 >= r13) goto L_0x0111
            byte[] r14 = r11.a
            int r15 = r3 * r2
            int r16 = r12 * 4
            int r16 = r16 + r15
            int r15 = r13 * 4
            int r15 = r15 + r16
            int r17 = r2 / r13
            int r17 = r17 + -4
            int r18 = r16 + 1
            byte r9 = r10[r18]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 8
            byte r8 = r10[r16]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r8 | r9
            short r8 = (short) r8
            int r16 = r16 + 2
            byte r9 = r10[r16]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r16 = r7
            r7 = 88
            int r9 = java.lang.Math.min(r9, r7)
            int[] r19 = o
            r20 = r19[r9]
            int r21 = r3 * r6
            int r21 = r21 * r13
            int r21 = r21 + r12
            int r21 = r21 * 2
            r7 = r8 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r14[r21] = r7
            int r7 = r21 + 1
            r27 = r9
            int r9 = r8 >> 8
            byte r9 = (byte) r9
            r14[r7] = r9
            r9 = r27
            r22 = r5
            r7 = 0
        L_0x00a5:
            int r5 = r17 * 2
            if (r7 >= r5) goto L_0x0105
            int r5 = r7 / 8
            int r23 = r7 / 2
            int r23 = r23 % 4
            int r5 = r5 * r13
            int r5 = r5 * 4
            int r5 = r5 + r15
            int r5 = r5 + r23
            byte r5 = r10[r5]
            r23 = r10
            r10 = r5 & 255(0xff, float:3.57E-43)
            int r24 = r7 % 2
            if (r24 != 0) goto L_0x00c2
            r5 = r5 & 15
            goto L_0x00c4
        L_0x00c2:
            int r5 = r10 >> 4
        L_0x00c4:
            r10 = r5 & 7
            int r10 = r10 * 2
            r18 = 1
            int r10 = r10 + 1
            int r10 = r10 * r20
            int r10 = r10 >> 3
            r20 = r5 & 8
            if (r20 == 0) goto L_0x00d5
            int r10 = -r10
        L_0x00d5:
            int r8 = r8 + r10
            r10 = -32768(0xffffffffffff8000, float:NaN)
            r27 = r15
            r15 = 32767(0x7fff, float:4.5916E-41)
            int r8 = defpackage.maf.j(r8, r10, r15)
            int r10 = r13 * 2
            int r21 = r10 + r21
            r10 = r8 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r14[r21] = r10
            int r10 = r21 + 1
            int r15 = r8 >> 8
            byte r15 = (byte) r15
            r14[r10] = r15
            int[] r10 = n
            r5 = r10[r5]
            int r9 = r9 + r5
            r5 = 0
            r10 = 88
            int r9 = defpackage.maf.j(r9, r5, r10)
            r20 = r19[r9]
            int r7 = r7 + 1
            r15 = r27
            r10 = r23
            goto L_0x00a5
        L_0x0105:
            r23 = r10
            r18 = 1
            int r12 = r12 + 1
            r7 = r16
            r5 = r22
            goto L_0x0056
        L_0x0111:
            r22 = r5
            r16 = r7
            r23 = r10
            r18 = 1
            int r3 = r3 + 1
            goto L_0x004f
        L_0x011d:
            r22 = r5
            r16 = r7
            int r6 = r6 * r1
            int r3 = r4.a
            int r6 = r6 * 2
            int r6 = r6 * r3
            r3 = 0
            r11.H(r3)
            r11.G(r6)
            int r3 = r0.e
            int r1 = r1 * r2
            int r3 = r3 - r1
            r0.e = r3
            int r1 = r11.c
            java.lang.Object r2 = r0.j
            xze r2 = (defpackage.xze) r2
            r2.c(r1, r11)
            int r2 = r0.g
            int r2 = r2 + r1
            r0.g = r2
            int r1 = r4.a
            int r1 = r1 * 2
            int r2 = r2 / r1
            r1 = r22
            if (r2 < r1) goto L_0x0151
            r0.e(r1)
            goto L_0x0151
        L_0x014f:
            r16 = r7
        L_0x0151:
            if (r16 == 0) goto L_0x015f
            int r1 = r0.g
            int r2 = r4.a
            int r2 = r2 * 2
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x015f
            r0.e(r1)
        L_0x015f:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vrf.d(ra4, long):boolean");
    }

    public final void e(int i2) {
        Object obj = this.j;
        Object obj2 = this.k;
        switch (this.a) {
            case 0:
                bsf bsf = (bsf) obj2;
                long J = this.f + maf.J(this.h, 1000000, (long) bsf.b);
                int i3 = i2 * 2 * bsf.a;
                ((xze) obj).b(J, 1, i3, this.g - i3, (vze) null);
                this.h += (long) i2;
                this.g -= i3;
                return;
            default:
                long j2 = this.f;
                long j3 = this.h;
                bsf bsf2 = (bsf) obj2;
                long j4 = (long) bsf2.b;
                int i4 = oaf.a;
                long a0 = j2 + oaf.a0(j3, 1000000, j4, RoundingMode.FLOOR);
                int i5 = i2 * 2 * bsf2.a;
                ((yze) obj).a(a0, 1, i5, this.g - i5, (wze) null);
                this.h += (long) i2;
                this.g -= i5;
                return;
        }
    }

    public vrf(pa5 pa5, yze yze, bsf bsf) {
        this.i = pa5;
        this.j = yze;
        this.k = bsf;
        int i2 = bsf.b;
        int max = Math.max(1, i2 / 10);
        this.d = max;
        wpa wpa = new wpa(bsf.e);
        wpa.n();
        int n2 = wpa.n();
        this.b = n2;
        int i3 = bsf.a;
        int i4 = bsf.c;
        int i5 = (((i4 - (i3 * 4)) * 8) / (bsf.d * i3)) + 1;
        if (n2 == i5) {
            int g2 = oaf.g(max, n2);
            this.c = new byte[(g2 * i4)];
            this.l = new wpa(n2 * 2 * i3 * g2);
            int i6 = ((i4 * i2) * 8) / n2;
            ny5 ny5 = new ny5();
            ny5.m = ia9.l("audio/raw");
            ny5.g = i6;
            ny5.h = i6;
            ny5.n = max * 2 * i3;
            ny5.A = i3;
            ny5.B = i2;
            ny5.C = 2;
            this.m = new qy5(ny5);
            return;
        }
        throw androidx.media3.common.ParserException.a((RuntimeException) null, "Expected frames per block: " + i5 + "; got: " + n2);
    }
}
