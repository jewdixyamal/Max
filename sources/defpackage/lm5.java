package defpackage;

/* renamed from: lm5  reason: default package */
public final class lm5 implements ka5 {
    public final byte[] a = new byte[42];
    public final yaf b = new yaf(0, new byte[32768]);
    public final boolean c = false;
    public final lh4 d = new Object();
    public oa5 e;
    public xze f;
    public int g = 0;
    public e99 h;
    public qm5 i;
    public int j;
    public int k;
    public jm5 l;
    public int m;
    public long n;

    public final void d(long j2, long j3) {
        long j4 = 0;
        if (j2 == 0) {
            this.g = 0;
        } else {
            jm5 jm5 = this.l;
            if (jm5 != null) {
                jm5.e(j3);
            }
        }
        if (j3 != 0) {
            j4 = -1;
        }
        this.n = j4;
        this.m = 0;
        this.b.E(0);
    }

    public final void g(oa5 oa5) {
        this.e = oa5;
        this.f = oa5.B(0, 1);
        oa5.w();
    }

    public final boolean h(ma5 ma5) {
        ra4 ra4 = (ra4) ma5;
        e99 K = new sy4(17).K(ra4, at6.x0);
        if (K != null) {
            int length = K.a.length;
        }
        byte[] bArr = new byte[4];
        ra4.q(bArr, 0, 4, false);
        return (((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8)) | (255 & ((long) bArr[3]))) == 1716281667;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: u1d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.ma5 r32, defpackage.lh4 r33) {
        /*
            r31 = this;
            r0 = r31
            r1 = 2
            r2 = 0
            r3 = 1
            int r4 = r0.g
            r5 = 0
            if (r4 == 0) goto L_0x0440
            byte[] r6 = r0.a
            if (r4 == r3) goto L_0x042f
            r7 = 24
            r8 = 8
            r9 = 16
            r10 = 4
            r11 = 3
            if (r4 == r1) goto L_0x03f8
            r12 = 7
            r13 = 6
            if (r4 == r11) goto L_0x0261
            r6 = 0
            r14 = -1
            r11 = 5
            if (r4 == r10) goto L_0x019c
            if (r4 != r11) goto L_0x0196
            xze r4 = r0.f
            r4.getClass()
            qm5 r4 = r0.i
            r4.getClass()
            jm5 r4 = r0.l
            if (r4 == 0) goto L_0x0045
            java.lang.Object r8 = r4.e
            im0 r8 = (defpackage.im0) r8
            if (r8 == 0) goto L_0x0045
            r0 = r32
            ra4 r0 = (defpackage.ra4) r0
            r1 = r33
            int r2 = r4.a(r0, r1)
            goto L_0x0195
        L_0x0045:
            long r10 = r0.n
            int r4 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            r8 = -1
            if (r4 != 0) goto L_0x00a1
            qm5 r4 = r0.i
            r9 = r32
            ra4 r9 = (defpackage.ra4) r9
            r9.Y = r2
            r9 = r32
            ra4 r9 = (defpackage.ra4) r9
            r9.b(r3, r2)
            byte[] r10 = new byte[r3]
            r9.q(r10, r2, r3, r2)
            byte r10 = r10[r2]
            r10 = r10 & r3
            if (r10 != r3) goto L_0x0067
            r10 = r3
            goto L_0x0068
        L_0x0067:
            r10 = r2
        L_0x0068:
            r9.b(r1, r2)
            if (r10 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r12 = r13
        L_0x006f:
            yaf r1 = new yaf
            r1.<init>((int) r12)
            byte[] r11 = r1.a
            r13 = r2
        L_0x0077:
            if (r13 >= r12) goto L_0x0084
            int r14 = r12 - r13
            int r14 = r9.d(r13, r11, r14)
            if (r14 != r8) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            int r13 = r13 + r14
            goto L_0x0077
        L_0x0084:
            r1.G(r13)
            r9.Y = r2
            long r6 = r1.D()     // Catch:{ NumberFormatException -> 0x0095 }
            if (r10 == 0) goto L_0x0090
            goto L_0x0096
        L_0x0090:
            int r1 = r4.c
            long r8 = (long) r1
            long r6 = r6 * r8
            goto L_0x0096
        L_0x0095:
            r3 = r2
        L_0x0096:
            if (r3 == 0) goto L_0x009c
            r0.n = r6
            goto L_0x0195
        L_0x009c:
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r5, r5)
            throw r0
        L_0x00a1:
            yaf r1 = r0.b
            int r4 = r1.c
            r5 = 1000000(0xf4240, double:4.940656E-318)
            r7 = 32768(0x8000, float:4.5918E-41)
            if (r4 >= r7) goto L_0x00e3
            byte[] r10 = r1.a
            int r7 = r7 - r4
            r11 = r32
            ra4 r11 = (defpackage.ra4) r11
            int r7 = r11.read(r10, r4, r7)
            if (r7 != r8) goto L_0x00bc
            r10 = r3
            goto L_0x00bd
        L_0x00bc:
            r10 = r2
        L_0x00bd:
            if (r10 != 0) goto L_0x00c4
            int r4 = r4 + r7
            r1.G(r4)
            goto L_0x00e4
        L_0x00c4:
            int r4 = r1.c()
            if (r4 != 0) goto L_0x00e4
            long r1 = r0.n
            long r1 = r1 * r5
            qm5 r3 = r0.i
            int r4 = defpackage.maf.a
            int r3 = r3.f
            long r3 = (long) r3
            long r10 = r1 / r3
            xze r9 = r0.f
            int r13 = r0.m
            r15 = 0
            r12 = 1
            r14 = 0
            r9.b(r10, r12, r13, r14, r15)
            r2 = r8
            goto L_0x0195
        L_0x00e3:
            r10 = r2
        L_0x00e4:
            int r4 = r1.b
            int r7 = r0.m
            int r8 = r0.j
            if (r7 >= r8) goto L_0x00f8
            int r8 = r8 - r7
            int r7 = r1.c()
            int r7 = java.lang.Math.min(r8, r7)
            r1.I(r7)
        L_0x00f8:
            qm5 r7 = r0.i
            r7.getClass()
            int r7 = r1.b
        L_0x00ff:
            int r8 = r1.c
            int r8 = r8 - r9
            lh4 r11 = r0.d
            if (r7 > r8) goto L_0x011b
            r1.H(r7)
            qm5 r8 = r0.i
            int r12 = r0.k
            boolean r8 = defpackage.ngg.k(r1, r8, r12, r11)
            if (r8 == 0) goto L_0x0119
            r1.H(r7)
            long r7 = r11.a
            goto L_0x014b
        L_0x0119:
            int r7 = r7 + r3
            goto L_0x00ff
        L_0x011b:
            if (r10 == 0) goto L_0x0147
        L_0x011d:
            int r8 = r1.c
            int r10 = r0.j
            int r10 = r8 - r10
            if (r7 > r10) goto L_0x0143
            r1.H(r7)
            qm5 r8 = r0.i     // Catch:{ IndexOutOfBoundsException -> 0x0131 }
            int r10 = r0.k     // Catch:{ IndexOutOfBoundsException -> 0x0131 }
            boolean r8 = defpackage.ngg.k(r1, r8, r10, r11)     // Catch:{ IndexOutOfBoundsException -> 0x0131 }
            goto L_0x0132
        L_0x0131:
            r8 = r2
        L_0x0132:
            int r10 = r1.b
            int r12 = r1.c
            if (r10 <= r12) goto L_0x0139
            r8 = r2
        L_0x0139:
            if (r8 == 0) goto L_0x0141
            r1.H(r7)
            long r7 = r11.a
            goto L_0x014b
        L_0x0141:
            int r7 = r7 + r3
            goto L_0x011d
        L_0x0143:
            r1.H(r8)
            goto L_0x014a
        L_0x0147:
            r1.H(r7)
        L_0x014a:
            r7 = r14
        L_0x014b:
            int r3 = r1.b
            int r3 = r3 - r4
            r1.H(r4)
            xze r4 = r0.f
            r4.c(r3, r1)
            int r4 = r0.m
            int r3 = r3 + r4
            r0.m = r3
            int r4 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x017e
            long r10 = r0.n
            long r10 = r10 * r5
            qm5 r4 = r0.i
            int r5 = defpackage.maf.a
            int r4 = r4.f
            long r4 = (long) r4
            long r17 = r10 / r4
            xze r4 = r0.f
            r22 = 0
            r19 = 1
            r21 = 0
            r16 = r4
            r20 = r3
            r16.b(r17, r19, r20, r21, r22)
            r0.m = r2
            r0.n = r7
        L_0x017e:
            int r0 = r1.c()
            if (r0 >= r9) goto L_0x0195
            int r0 = r1.c()
            byte[] r3 = r1.a
            int r4 = r1.b
            java.lang.System.arraycopy(r3, r4, r3, r2, r0)
            r1.H(r2)
            r1.G(r0)
        L_0x0195:
            return r2
        L_0x0196:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x019c:
            r4 = r32
            ra4 r4 = (defpackage.ra4) r4
            r4.Y = r2
            byte[] r4 = new byte[r1]
            r9 = r32
            ra4 r9 = (defpackage.ra4) r9
            r9.q(r4, r2, r1, r2)
            byte r10 = r4[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r8 = r10 << 8
            byte r3 = r4[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r8
            int r1 = r3 >> 2
            r4 = 16382(0x3ffe, float:2.2956E-41)
            if (r1 != r4) goto L_0x0257
            r9.Y = r2
            r0.k = r3
            oa5 r1 = r0.e
            int r3 = defpackage.maf.a
            long r3 = r9.o
            qm5 r5 = r0.i
            r5.getClass()
            qm5 r5 = r0.i
            java.lang.Object r8 = r5.l
            va8 r8 = (defpackage.va8) r8
            if (r8 == 0) goto L_0x01da
            pm5 r6 = new pm5
            r6.<init>((defpackage.qm5) r5, (long) r3)
            goto L_0x0250
        L_0x01da:
            long r8 = r9.c
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0247
            long r14 = r5.k
            int r6 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0247
            jm5 r6 = new jm5
            int r7 = r0.k
            q64 r10 = new q64
            r12 = 26
            r10.<init>((int) r12, (java.lang.Object) r5)
            jn r12 = new jn
            r12.<init>((defpackage.qm5) r5, (int) r7)
            long r19 = r5.c()
            int r7 = r5.d
            int r14 = r5.e
            if (r14 <= 0) goto L_0x020e
            long r14 = (long) r14
            r23 = r3
            long r2 = (long) r7
            long r14 = r14 + r2
            r2 = 2
            long r14 = r14 / r2
            r2 = 1
            long r14 = r14 + r2
            r27 = r14
            goto L_0x022c
        L_0x020e:
            r23 = r3
            int r2 = r5.c
            int r3 = r5.b
            if (r3 != r2) goto L_0x021a
            if (r3 <= 0) goto L_0x021a
            long r2 = (long) r3
            goto L_0x021c
        L_0x021a:
            r2 = 4096(0x1000, double:2.0237E-320)
        L_0x021c:
            int r4 = r5.h
            long r14 = (long) r4
            long r2 = r2 * r14
            int r4 = r5.i
            long r14 = (long) r4
            long r2 = r2 * r14
            r14 = 8
            long r2 = r2 / r14
            r14 = 64
            long r2 = r2 + r14
            r27 = r2
        L_0x022c:
            int r29 = java.lang.Math.max(r13, r7)
            long r2 = r5.k
            r16 = r6
            r17 = r10
            r18 = r12
            r21 = r2
            r25 = r8
            r16.<init>((defpackage.jm0) r17, (defpackage.mm0) r18, (long) r19, (long) r21, (long) r23, (long) r25, (long) r27, (int) r29)
            r0.l = r6
            java.lang.Object r2 = r6.c
            r6 = r2
            gm0 r6 = (defpackage.gm0) r6
            goto L_0x0250
        L_0x0247:
            pm5 r6 = new pm5
            long r2 = r5.c()
            r6.<init>(r2)
        L_0x0250:
            r1.M(r6)
            r0.g = r11
            r1 = 0
            return r1
        L_0x0257:
            r1 = r2
            r9.Y = r1
            java.lang.String r0 = "First frame does not start with sync code."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r5, r0)
            throw r0
        L_0x0261:
            r1 = r2
            qm5 r2 = r0.i
            r30 = r1
        L_0x0266:
            if (r30 != 0) goto L_0x03d6
            r4 = r32
            ra4 r4 = (defpackage.ra4) r4
            r4.Y = r1
            s02 r4 = new s02
            byte[] r5 = new byte[r10]
            r4.<init>((byte[]) r5, (int) r10, (int) r3, (byte) r1)
            r8 = r32
            ra4 r8 = (defpackage.ra4) r8
            r8.q(r5, r1, r10, r1)
            boolean r5 = r4.h()
            int r9 = r4.i(r12)
            int r4 = r4.i(r7)
            int r4 = r4 + r10
            if (r9 != 0) goto L_0x0299
            r2 = 38
            byte[] r4 = new byte[r2]
            r8.h(r4, r1, r2, r1)
            qm5 r2 = new qm5
            r2.<init>(r4, r10, r1)
            goto L_0x03c4
        L_0x0299:
            if (r2 == 0) goto L_0x03d0
            if (r9 != r11) goto L_0x02da
            yaf r9 = new yaf
            r9.<init>((int) r4)
            byte[] r14 = r9.a
            r8.h(r14, r1, r4, r1)
            va8 r25 = defpackage.kp.t(r9)
            qm5 r1 = new qm5
            long r8 = r2.k
            android.os.Parcelable r4 = r2.m
            r26 = r4
            e99 r26 = (defpackage.e99) r26
            int r4 = r2.b
            int r14 = r2.c
            int r15 = r2.d
            int r12 = r2.e
            int r11 = r2.f
            int r3 = r2.h
            int r2 = r2.i
            r18 = r15
            r15 = r1
            r16 = r4
            r17 = r14
            r19 = r12
            r20 = r11
            r21 = r3
            r22 = r2
            r23 = r8
            r15.<init>((int) r16, (int) r17, (int) r18, (int) r19, (int) r20, (int) r21, (int) r22, (long) r23, (defpackage.va8) r25, (defpackage.e99) r26)
        L_0x02d7:
            r2 = r1
            goto L_0x03c4
        L_0x02da:
            android.os.Parcelable r1 = r2.m
            e99 r1 = (defpackage.e99) r1
            if (r9 != r10) goto L_0x0352
            yaf r3 = new yaf
            r3.<init>((int) r4)
            byte[] r9 = r3.a
            r11 = 0
            r8.h(r9, r11, r4, r11)
            r3.I(r10)
            hgf r3 = defpackage.f8.y(r3, r11, r11)
            java.lang.Object r3 = r3.a
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.util.List r3 = java.util.Arrays.asList(r3)
            e99 r3 = defpackage.f8.v(r3)
            if (r1 != 0) goto L_0x0303
            r25 = r3
            goto L_0x0327
        L_0x0303:
            if (r3 != 0) goto L_0x0306
            goto L_0x0325
        L_0x0306:
            c99[] r3 = r3.a
            int r4 = r3.length
            if (r4 != 0) goto L_0x030c
            goto L_0x0325
        L_0x030c:
            e99 r4 = new e99
            int r8 = defpackage.maf.a
            c99[] r1 = r1.a
            int r8 = r1.length
            int r9 = r3.length
            int r8 = r8 + r9
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r1, r8)
            int r1 = r1.length
            int r9 = r3.length
            r11 = 0
            java.lang.System.arraycopy(r3, r11, r8, r1, r9)
            c99[] r8 = (defpackage.c99[]) r8
            r4.<init>((defpackage.c99[]) r8)
            r1 = r4
        L_0x0325:
            r25 = r1
        L_0x0327:
            qm5 r1 = new qm5
            long r3 = r2.k
            java.lang.Object r8 = r2.l
            r24 = r8
            va8 r24 = (defpackage.va8) r24
            int r15 = r2.b
            int r8 = r2.c
            int r9 = r2.d
            int r11 = r2.e
            int r12 = r2.f
            int r14 = r2.h
            int r2 = r2.i
            r20 = r14
            r14 = r1
            r16 = r8
            r17 = r9
            r18 = r11
            r19 = r12
            r21 = r2
            r22 = r3
            r14.<init>((int) r15, (int) r16, (int) r17, (int) r18, (int) r19, (int) r20, (int) r21, (long) r22, (defpackage.va8) r24, (defpackage.e99) r25)
            goto L_0x02d7
        L_0x0352:
            if (r9 != r13) goto L_0x03c1
            yaf r3 = new yaf
            r3.<init>((int) r4)
            byte[] r9 = r3.a
            r11 = 0
            r8.h(r9, r11, r4, r11)
            r3.I(r10)
            rza r3 = defpackage.rza.a(r3)
            ffc r3 = defpackage.zw6.n(r3)
            e99 r4 = new e99
            r4.<init>((java.util.List) r3)
            if (r1 != 0) goto L_0x0374
            r25 = r4
            goto L_0x0395
        L_0x0374:
            c99[] r3 = r4.a
            int r4 = r3.length
            if (r4 != 0) goto L_0x037a
            goto L_0x0393
        L_0x037a:
            e99 r4 = new e99
            int r8 = defpackage.maf.a
            c99[] r1 = r1.a
            int r8 = r1.length
            int r9 = r3.length
            int r8 = r8 + r9
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r1, r8)
            int r1 = r1.length
            int r9 = r3.length
            r11 = 0
            java.lang.System.arraycopy(r3, r11, r8, r1, r9)
            c99[] r8 = (defpackage.c99[]) r8
            r4.<init>((defpackage.c99[]) r8)
            r1 = r4
        L_0x0393:
            r25 = r1
        L_0x0395:
            qm5 r1 = new qm5
            long r3 = r2.k
            java.lang.Object r8 = r2.l
            r24 = r8
            va8 r24 = (defpackage.va8) r24
            int r15 = r2.b
            int r8 = r2.c
            int r9 = r2.d
            int r11 = r2.e
            int r12 = r2.f
            int r14 = r2.h
            int r2 = r2.i
            r20 = r14
            r14 = r1
            r16 = r8
            r17 = r9
            r18 = r11
            r19 = r12
            r21 = r2
            r22 = r3
            r14.<init>((int) r15, (int) r16, (int) r17, (int) r18, (int) r19, (int) r20, (int) r21, (long) r22, (defpackage.va8) r24, (defpackage.e99) r25)
            goto L_0x02d7
        L_0x03c1:
            r8.z(r4)
        L_0x03c4:
            int r1 = defpackage.maf.a
            r0.i = r2
            r30 = r5
            r1 = 0
            r3 = 1
            r11 = 3
            r12 = 7
            goto L_0x0266
        L_0x03d0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x03d6:
            qm5 r1 = r0.i
            r1.getClass()
            qm5 r1 = r0.i
            int r1 = r1.d
            int r1 = java.lang.Math.max(r1, r13)
            r0.j = r1
            xze r1 = r0.f
            int r2 = defpackage.maf.a
            qm5 r2 = r0.i
            e99 r3 = r0.h
            oy5 r2 = r2.d(r6, r3)
            r1.d(r2)
            r0.g = r10
            r2 = 0
            return r2
        L_0x03f8:
            byte[] r3 = new byte[r10]
            r4 = r32
            ra4 r4 = (defpackage.ra4) r4
            r4.h(r3, r2, r10, r2)
            byte r4 = r3[r2]
            long r10 = (long) r4
            r12 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r12
            long r6 = r10 << r7
            r2 = 1
            byte r2 = r3[r2]
            long r10 = (long) r2
            long r10 = r10 & r12
            long r9 = r10 << r9
            long r6 = r6 | r9
            byte r1 = r3[r1]
            long r1 = (long) r1
            long r1 = r1 & r12
            long r1 = r1 << r8
            long r1 = r1 | r6
            r4 = 3
            byte r3 = r3[r4]
            long r6 = (long) r3
            long r6 = r6 & r12
            long r1 = r1 | r6
            r6 = 1716281667(0x664c6143, double:8.479558103E-315)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0428
            r0.g = r4
            r2 = 0
            return r2
        L_0x0428:
            java.lang.String r0 = "Failed to read FLAC stream marker."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r5, r0)
            throw r0
        L_0x042f:
            int r3 = r6.length
            r4 = r32
            ra4 r4 = (defpackage.ra4) r4
            r4.q(r6, r2, r3, r2)
            r3 = r32
            ra4 r3 = (defpackage.ra4) r3
            r3.Y = r2
            r0.g = r1
            return r2
        L_0x0440:
            boolean r1 = r0.c
            r3 = 1
            r1 = r1 ^ r3
            r3 = r32
            ra4 r3 = (defpackage.ra4) r3
            r3.Y = r2
            r2 = r32
            ra4 r2 = (defpackage.ra4) r2
            long r3 = r2.r()
            if (r1 == 0) goto L_0x0456
            r1 = r5
            goto L_0x0458
        L_0x0456:
            ig5 r1 = defpackage.at6.x0
        L_0x0458:
            sy4 r6 = new sy4
            r7 = 17
            r6.<init>((int) r7)
            e99 r1 = r6.K(r2, r1)
            if (r1 == 0) goto L_0x046c
            c99[] r6 = r1.a
            int r6 = r6.length
            if (r6 != 0) goto L_0x046b
            goto L_0x046c
        L_0x046b:
            r5 = r1
        L_0x046c:
            long r6 = r2.r()
            long r6 = r6 - r3
            int r1 = (int) r6
            r2.z(r1)
            r0.h = r5
            r1 = 1
            r0.g = r1
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm5.i(ma5, lh4):int");
    }

    public final void release() {
    }
}
