package defpackage;

/* renamed from: ae8  reason: default package */
public final class ae8 {
    public final yd8 a;
    public final Object b;
    public final frc[] c;
    public boolean d;
    public boolean e;
    public de8 f;
    public boolean g;
    public final boolean[] h;
    public final uj0[] i;
    public final gz7 j;
    public final vk8 k;
    public ae8 l;
    public sze m = sze.o;
    public l0f n;
    public long o;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: j08} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: j08} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: z33} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: j08} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ae8(defpackage.uj0[] r10, long r11, defpackage.gz7 r13, defpackage.n64 r14, defpackage.vk8 r15, defpackage.de8 r16, defpackage.l0f r17) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r15
            r3 = r16
            r9.<init>()
            r0.i = r1
            r4 = r11
            r0.o = r4
            r4 = r13
            r0.j = r4
            r0.k = r2
            xj8 r4 = r3.a
            java.lang.Object r5 = r4.a
            r0.b = r5
            r0.f = r3
            sze r5 = defpackage.sze.o
            r0.m = r5
            r5 = r17
            r0.n = r5
            int r5 = r1.length
            frc[] r5 = new defpackage.frc[r5]
            r0.c = r5
            int r1 = r1.length
            boolean[] r1 = new boolean[r1]
            r0.h = r1
            r15.getClass()
            java.lang.Object r1 = r4.a
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r5 = r1.first
            java.lang.Object r1 = r1.second
            xj8 r1 = r4.b(r1)
            java.lang.Object r4 = r2.d
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            sk8 r4 = (defpackage.sk8) r4
            r4.getClass()
            java.lang.Object r5 = r2.f
            java.util.HashSet r5 = (java.util.HashSet) r5
            r5.add(r4)
            java.lang.Object r5 = r2.e
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r4)
            qk8 r5 = (defpackage.qk8) r5
            if (r5 == 0) goto L_0x0062
            dj0 r6 = r5.a
            zj8 r5 = r5.b
            r6.d(r5)
        L_0x0062:
            java.util.ArrayList r5 = r4.c
            r5.add(r1)
            p08 r5 = r4.a
            long r6 = r3.b
            r8 = r14
            j08 r1 = r5.a(r1, r14, r6)
            java.lang.Object r5 = r2.c
            java.util.IdentityHashMap r5 = (java.util.IdentityHashMap) r5
            r5.put(r1, r4)
            r15.g()
            long r2 = r3.d
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0093
            z33 r4 = new z33
            r5 = 1
            r6 = 0
            r10 = r4
            r11 = r1
            r12 = r5
            r13 = r6
            r15 = r2
            r10.<init>(r11, r12, r13, r15)
            r1 = r4
        L_0x0093:
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae8.<init>(uj0[], long, gz7, n64, vk8, de8, l0f):void");
    }

    public final long a(l0f l0f, long j2, boolean z, boolean[] zArr) {
        uj0[] uj0Arr;
        Object[] objArr;
        l0f l0f2 = l0f;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= l0f2.b) {
                break;
            }
            if (z || !l0f2.F(this.n, i2)) {
                z2 = false;
            }
            this.h[i2] = z2;
            i2++;
        }
        int i3 = 0;
        while (true) {
            uj0Arr = this.i;
            int length = uj0Arr.length;
            objArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (uj0Arr[i3].a == -2) {
                objArr[i3] = null;
            }
            i3++;
        }
        b();
        this.n = l0f2;
        c();
        long L = this.a.L((m85[]) l0f2.X, this.h, this.c, zArr, j2);
        for (int i4 = 0; i4 < uj0Arr.length; i4++) {
            if (uj0Arr[i4].a == -2 && this.n.I(i4)) {
                objArr[i4] = new Object();
            }
        }
        this.e = false;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            if (objArr[i5] != null) {
                np8.f(l0f2.I(i5));
                if (uj0Arr[i5].a != -2) {
                    this.e = true;
                }
            } else {
                np8.f(((m85[]) l0f2.X)[i5] == null);
            }
        }
        return L;
    }

    public final void b() {
        if (this.l == null) {
            int i2 = 0;
            while (true) {
                l0f l0f = this.n;
                if (i2 < l0f.b) {
                    boolean I = l0f.I(i2);
                    m85 m85 = ((m85[]) this.n.X)[i2];
                    if (I && m85 != null) {
                        m85.h();
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.l == null) {
            int i2 = 0;
            while (true) {
                l0f l0f = this.n;
                if (i2 < l0f.b) {
                    boolean I = l0f.I(i2);
                    m85 m85 = ((m85[]) this.n.X)[i2];
                    if (I && m85 != null) {
                        m85.e();
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        if (!this.d) {
            return this.f.b;
        }
        long r = this.e ? this.a.r() : Long.MIN_VALUE;
        return r == Long.MIN_VALUE ? this.f.e : r;
    }

    public final long e() {
        return this.f.b + this.o;
    }

    public final void f() {
        b();
        yd8 yd8 = this.a;
        try {
            boolean z = yd8 instanceof z33;
            vk8 vk8 = this.k;
            if (z) {
                vk8.n(((z33) yd8).a);
            } else {
                vk8.n(yd8);
            }
        } catch (RuntimeException e2) {
            fm9.c("Period release failed.", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [ww6, pw6] */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03a5, code lost:
        if (r8 == 2) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0232, code lost:
        if (defpackage.aa3.a.d(r13.b, r10.b).d(r13.a, r10.a).f() > 0) goto L_0x0234;
     */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0487 A[LOOP:24: B:208:0x0483->B:210:0x0487, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.l0f g(float r25, defpackage.lue r26) {
        /*
            r24 = this;
            r0 = r24
            sze r1 = r0.m
            de8 r2 = r0.f
            xj8 r2 = r2.a
            gz7 r2 = r0.j
            r2.getClass()
            uj0[] r0 = r0.i
            int r3 = r0.length
            r4 = 1
            int r3 = r3 + r4
            int[] r3 = new int[r3]
            int r5 = r0.length
            int r5 = r5 + r4
            qze[][] r6 = new defpackage.qze[r5][]
            int r7 = r0.length
            int r7 = r7 + r4
            int[][][] r7 = new int[r7][][]
            r14 = 0
            r8 = r14
        L_0x001e:
            if (r8 >= r5) goto L_0x002d
            int r9 = r1.a
            qze[] r10 = new defpackage.qze[r9]
            r6[r8] = r10
            int[][] r9 = new int[r9][]
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x001e
        L_0x002d:
            int r5 = r0.length
            int[] r15 = new int[r5]
            r8 = r14
        L_0x0031:
            if (r8 >= r5) goto L_0x003e
            r9 = r0[r8]
            int r9 = r9.B()
            r15[r8] = r9
            int r8 = r8 + 1
            goto L_0x0031
        L_0x003e:
            r5 = r14
        L_0x003f:
            int r8 = r1.a
            if (r5 >= r8) goto L_0x00d8
            qze r8 = r1.a(r5)
            oy5[] r9 = r8.c
            r10 = r9[r14]
            java.lang.String r10 = r10.w0
            int r10 = defpackage.ha9.g(r10)
            r11 = 5
            if (r10 != r11) goto L_0x0056
            r10 = r4
            goto L_0x0057
        L_0x0056:
            r10 = r14
        L_0x0057:
            int r11 = r0.length
            r16 = r4
            r12 = r14
            r13 = r12
        L_0x005c:
            int r14 = r0.length
            int r4 = r8.a
            if (r12 >= r14) goto L_0x009f
            r14 = r0[r12]
            r17 = r1
            r18 = r2
            r1 = 0
            r2 = 0
        L_0x0069:
            if (r1 >= r4) goto L_0x007e
            r19 = r15
            r15 = r9[r1]
            int r15 = r14.A(r15)
            r15 = r15 & 7
            int r2 = java.lang.Math.max(r2, r15)
            int r1 = r1 + 1
            r15 = r19
            goto L_0x0069
        L_0x007e:
            r19 = r15
            r1 = r3[r12]
            if (r1 != 0) goto L_0x0086
            r1 = 1
            goto L_0x0087
        L_0x0086:
            r1 = 0
        L_0x0087:
            if (r2 > r13) goto L_0x0091
            if (r2 != r13) goto L_0x0095
            if (r10 == 0) goto L_0x0095
            if (r16 != 0) goto L_0x0095
            if (r1 == 0) goto L_0x0095
        L_0x0091:
            r16 = r1
            r13 = r2
            r11 = r12
        L_0x0095:
            int r12 = r12 + 1
            r1 = r17
            r2 = r18
            r15 = r19
            r4 = 1
            goto L_0x005c
        L_0x009f:
            r17 = r1
            r18 = r2
            r19 = r15
            int r1 = r0.length
            if (r11 != r1) goto L_0x00ab
            int[] r1 = new int[r4]
            goto L_0x00be
        L_0x00ab:
            r1 = r0[r11]
            int[] r2 = new int[r4]
            r10 = 0
        L_0x00b0:
            if (r10 >= r4) goto L_0x00bd
            r12 = r9[r10]
            int r12 = r1.A(r12)
            r2[r10] = r12
            int r10 = r10 + 1
            goto L_0x00b0
        L_0x00bd:
            r1 = r2
        L_0x00be:
            r2 = r3[r11]
            r4 = r6[r11]
            r4[r2] = r8
            r4 = r7[r11]
            r4[r2] = r1
            r1 = 1
            int r2 = r2 + r1
            r3[r11] = r2
            int r5 = r5 + 1
            r1 = r17
            r2 = r18
            r15 = r19
            r4 = 1
            r14 = 0
            goto L_0x003f
        L_0x00d8:
            r18 = r2
            r19 = r15
            int r1 = r0.length
            sze[] r10 = new defpackage.sze[r1]
            int r1 = r0.length
            java.lang.String[] r1 = new java.lang.String[r1]
            int r2 = r0.length
            int[] r9 = new int[r2]
            r2 = 0
        L_0x00e6:
            int r4 = r0.length
            if (r2 >= r4) goto L_0x0115
            r4 = r3[r2]
            sze r5 = new sze
            r8 = r6[r2]
            java.lang.Object[] r8 = defpackage.maf.F(r4, r8)
            qze[] r8 = (defpackage.qze[]) r8
            r5.<init>(r8)
            r10[r2] = r5
            r5 = r7[r2]
            java.lang.Object[] r4 = defpackage.maf.F(r4, r5)
            int[][] r4 = (int[][]) r4
            r7[r2] = r4
            r4 = r0[r2]
            java.lang.String r4 = r4.i()
            r1[r2] = r4
            r4 = r0[r2]
            int r4 = r4.a
            r9[r2] = r4
            int r2 = r2 + 1
            goto L_0x00e6
        L_0x0115:
            int r1 = r0.length
            r1 = r3[r1]
            sze r13 = new sze
            int r0 = r0.length
            r0 = r6[r0]
            java.lang.Object[] r0 = defpackage.maf.F(r1, r0)
            qze[] r0 = (defpackage.qze[]) r0
            r13.<init>(r0)
            ez7 r0 = new ez7
            r8 = r0
            r11 = r19
            r12 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r2 = r18
            bf4 r2 = (defpackage.bf4) r2
            java.util.concurrent.atomic.AtomicReference r1 = r2.e
            java.lang.Object r1 = r1.get()
            ne4 r1 = (defpackage.ne4) r1
            int r3 = r0.a
            k85[] r4 = new defpackage.k85[r3]
            d74 r5 = new d74
            r6 = 6
            r8 = r19
            r5.<init>(r1, r6, r8)
            v00 r6 = new v00
            r8 = 22
            r6.<init>(r8)
            r8 = 2
            android.util.Pair r5 = defpackage.bf4.g(r8, r0, r7, r5, r6)
            if (r5 == 0) goto L_0x0163
            java.lang.Object r6 = r5.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r5 = r5.first
            k85 r5 = (defpackage.k85) r5
            r4[r6] = r5
        L_0x0163:
            r5 = 0
        L_0x0164:
            int[] r6 = r0.b
            sze[] r9 = r0.c
            if (r5 >= r3) goto L_0x0179
            r10 = r6[r5]
            if (r8 != r10) goto L_0x0176
            r10 = r9[r5]
            int r10 = r10.a
            if (r10 <= 0) goto L_0x0176
            r5 = 1
            goto L_0x017a
        L_0x0176:
            int r5 = r5 + 1
            goto L_0x0164
        L_0x0179:
            r5 = 0
        L_0x017a:
            fe4 r10 = new fe4
            r11 = 0
            r10.<init>(r1, r5, r11)
            v00 r5 = new v00
            r11 = 24
            r5.<init>(r11)
            r11 = 1
            android.util.Pair r5 = defpackage.bf4.g(r11, r0, r7, r10, r5)
            if (r5 == 0) goto L_0x019c
            java.lang.Object r10 = r5.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r11 = r5.first
            k85 r11 = (defpackage.k85) r11
            r4[r10] = r11
        L_0x019c:
            if (r5 != 0) goto L_0x01a0
            r5 = 0
            goto L_0x01b1
        L_0x01a0:
            java.lang.Object r5 = r5.first
            k85 r5 = (defpackage.k85) r5
            qze r11 = r5.a
            int[] r5 = r5.b
            r12 = 0
            r5 = r5[r12]
            oy5[] r11 = r11.c
            r5 = r11[r5]
            java.lang.String r5 = r5.c
        L_0x01b1:
            d74 r11 = new d74
            r12 = 8
            r11.<init>(r1, r12, r5)
            v00 r5 = new v00
            r12 = 26
            r5.<init>(r12)
            r12 = 3
            android.util.Pair r5 = defpackage.bf4.g(r12, r0, r7, r11, r5)
            if (r5 == 0) goto L_0x01d4
            java.lang.Object r11 = r5.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r5 = r5.first
            k85 r5 = (defpackage.k85) r5
            r4[r11] = r5
        L_0x01d4:
            r5 = 0
        L_0x01d5:
            if (r5 >= r3) goto L_0x026c
            r11 = r6[r5]
            if (r11 == r8) goto L_0x0266
            r13 = 1
            if (r11 == r13) goto L_0x0266
            if (r11 == r12) goto L_0x0266
            r11 = r9[r5]
            r13 = r7[r5]
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x01e9:
            int r8 = r11.a
            if (r14 >= r8) goto L_0x0256
            qze r8 = r11.a(r14)
            r19 = r13[r14]
            r20 = r11
            r10 = r17
            r17 = r15
            r15 = r12
            r12 = 0
        L_0x01fb:
            int r11 = r8.a
            if (r12 >= r11) goto L_0x0247
            r11 = r19[r12]
            r21 = r13
            boolean r13 = r1.U0
            boolean r11 = defpackage.bf4.d(r11, r13)
            if (r11 == 0) goto L_0x023a
            oy5[] r11 = r8.c
            r11 = r11[r12]
            ke4 r13 = new ke4
            r22 = r8
            r8 = r19[r12]
            r13.<init>(r11, r8)
            if (r10 == 0) goto L_0x0234
            y93 r8 = defpackage.aa3.a
            boolean r11 = r10.b
            r23 = r15
            boolean r15 = r13.b
            aa3 r8 = r8.d(r15, r11)
            boolean r11 = r13.a
            boolean r15 = r10.a
            aa3 r8 = r8.d(r11, r15)
            int r8 = r8.f()
            if (r8 <= 0) goto L_0x023e
        L_0x0234:
            r17 = r12
            r10 = r13
            r15 = r22
            goto L_0x0240
        L_0x023a:
            r22 = r8
            r23 = r15
        L_0x023e:
            r15 = r23
        L_0x0240:
            int r12 = r12 + 1
            r13 = r21
            r8 = r22
            goto L_0x01fb
        L_0x0247:
            r21 = r13
            r23 = r15
            int r14 = r14 + 1
            r15 = r17
            r11 = r20
            r12 = r23
            r17 = r10
            goto L_0x01e9
        L_0x0256:
            if (r12 != 0) goto L_0x025a
            r8 = 0
            goto L_0x0264
        L_0x025a:
            k85 r8 = new k85
            int[] r10 = new int[]{r15}
            r11 = 0
            r8.<init>(r11, r12, r10)
        L_0x0264:
            r4[r5] = r8
        L_0x0266:
            int r5 = r5 + 1
            r8 = 2
            r12 = 3
            goto L_0x01d5
        L_0x026c:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r8 = 0
        L_0x0272:
            if (r8 >= r3) goto L_0x0292
            r10 = r9[r8]
            r11 = 0
        L_0x0277:
            int r12 = r10.a
            if (r11 >= r12) goto L_0x028f
            e0f r12 = r1.I0
            qze r13 = r10.a(r11)
            cx6 r12 = r12.a
            java.lang.Object r12 = r12.get(r13)
            d0f r12 = (defpackage.d0f) r12
            defpackage.bf4.e(r5, r12, r8)
            int r11 = r11 + 1
            goto L_0x0277
        L_0x028f:
            int r8 = r8 + 1
            goto L_0x0272
        L_0x0292:
            r8 = 0
        L_0x0293:
            sze r10 = r0.e
            int r11 = r10.a
            r12 = -1
            if (r8 >= r11) goto L_0x02ae
            e0f r11 = r1.I0
            qze r10 = r10.a(r8)
            cx6 r11 = r11.a
            java.lang.Object r10 = r11.get(r10)
            d0f r10 = (defpackage.d0f) r10
            defpackage.bf4.e(r5, r10, r12)
            int r8 = r8 + 1
            goto L_0x0293
        L_0x02ae:
            r8 = 0
        L_0x02af:
            int r11 = r5.size()
            if (r8 >= r11) goto L_0x0304
            java.lang.Object r11 = r5.valueAt(r8)
            android.util.Pair r11 = (android.util.Pair) r11
            int r13 = r5.keyAt(r8)
            java.lang.Object r14 = r11.first
            d0f r14 = (defpackage.d0f) r14
            java.lang.Object r11 = r11.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r15 = 0
        L_0x02cc:
            if (r15 >= r3) goto L_0x02fe
            if (r11 != r15) goto L_0x02e7
            k85 r12 = new k85
            r17 = r5
            qze r5 = r14.a
            r19 = r11
            zw6 r11 = r14.b
            int[] r11 = defpackage.s5c.c0(r11)
            r20 = r14
            r14 = 0
            r12.<init>(r14, r5, r11)
            r4[r15] = r12
            goto L_0x02f4
        L_0x02e7:
            r17 = r5
            r19 = r11
            r20 = r14
            r5 = r6[r15]
            if (r5 != r13) goto L_0x02f4
            r5 = 0
            r4[r15] = r5
        L_0x02f4:
            int r15 = r15 + 1
            r5 = r17
            r11 = r19
            r14 = r20
            r12 = -1
            goto L_0x02cc
        L_0x02fe:
            r17 = r5
            int r8 = r8 + 1
            r12 = -1
            goto L_0x02af
        L_0x0304:
            r12 = 0
        L_0x0305:
            if (r12 >= r3) goto L_0x0338
            r5 = r9[r12]
            android.util.SparseArray r8 = r1.X0
            java.lang.Object r8 = r8.get(r12)
            java.util.Map r8 = (java.util.Map) r8
            if (r8 == 0) goto L_0x0335
            boolean r5 = r8.containsKey(r5)
            if (r5 == 0) goto L_0x0335
            r5 = r9[r12]
            qe4 r8 = r1.a(r12, r5)
            if (r8 != 0) goto L_0x0323
            r5 = 0
            goto L_0x0333
        L_0x0323:
            k85 r11 = new k85
            int r13 = r8.a
            qze r5 = r5.a(r13)
            int[] r13 = r8.b
            int r8 = r8.c
            r11.<init>(r8, r5, r13)
            r5 = r11
        L_0x0333:
            r4[r12] = r5
        L_0x0335:
            int r12 = r12 + 1
            goto L_0x0305
        L_0x0338:
            r12 = 0
        L_0x0339:
            if (r12 >= r3) goto L_0x035a
            r5 = r6[r12]
            android.util.SparseBooleanArray r8 = r1.Y0
            boolean r8 = r8.get(r12)
            if (r8 != 0) goto L_0x0351
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            jx6 r8 = r1.J0
            boolean r5 = r8.contains(r5)
            if (r5 == 0) goto L_0x0353
        L_0x0351:
            r5 = 0
            goto L_0x0355
        L_0x0353:
            r5 = 0
            goto L_0x0357
        L_0x0355:
            r4[r12] = r5
        L_0x0357:
            int r12 = r12 + 1
            goto L_0x0339
        L_0x035a:
            r5 = 0
            gg0 r8 = r2.b
            r8.getClass()
            ob6 r2 = r2.d
            m85[] r2 = r2.k(r4, r8)
            kgc[] r4 = new defpackage.kgc[r3]
            r12 = 0
        L_0x0369:
            if (r12 >= r3) goto L_0x0394
            r8 = r6[r12]
            android.util.SparseBooleanArray r11 = r1.Y0
            boolean r11 = r11.get(r12)
            if (r11 != 0) goto L_0x038e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            jx6 r11 = r1.J0
            boolean r8 = r11.contains(r8)
            if (r8 == 0) goto L_0x0382
            goto L_0x038e
        L_0x0382:
            r8 = r6[r12]
            r11 = -2
            if (r8 == r11) goto L_0x038b
            r8 = r2[r12]
            if (r8 == 0) goto L_0x038e
        L_0x038b:
            kgc r8 = defpackage.kgc.b
            goto L_0x038f
        L_0x038e:
            r8 = r5
        L_0x038f:
            r4[r12] = r8
            int r12 = r12 + 1
            goto L_0x0369
        L_0x0394:
            boolean r1 = r1.V0
            if (r1 == 0) goto L_0x0404
            r1 = -1
            r5 = -1
            r12 = 0
        L_0x039b:
            if (r12 >= r3) goto L_0x03ed
            r8 = r6[r12]
            r11 = r2[r12]
            r13 = 1
            if (r8 == r13) goto L_0x03ac
            r13 = 2
            if (r8 != r13) goto L_0x03a8
            goto L_0x03ad
        L_0x03a8:
            r17 = r7
        L_0x03aa:
            r7 = -1
            goto L_0x03e8
        L_0x03ac:
            r13 = 2
        L_0x03ad:
            if (r11 == 0) goto L_0x03a8
            r14 = r7[r12]
            r15 = r9[r12]
            qze r13 = r11.a()
            int r13 = r15.b(r13)
            r17 = r7
            r15 = 0
        L_0x03be:
            int r7 = r11.length()
            if (r15 >= r7) goto L_0x03d9
            r7 = r14[r13]
            int r19 = r11.f(r15)
            r7 = r7[r19]
            r19 = r11
            r11 = 32
            r7 = r7 & r11
            if (r7 == r11) goto L_0x03d4
            goto L_0x03aa
        L_0x03d4:
            int r15 = r15 + 1
            r11 = r19
            goto L_0x03be
        L_0x03d9:
            r7 = 1
            if (r8 != r7) goto L_0x03e3
            r7 = -1
            if (r5 == r7) goto L_0x03e1
        L_0x03df:
            r8 = 0
            goto L_0x03ef
        L_0x03e1:
            r5 = r12
            goto L_0x03e8
        L_0x03e3:
            r7 = -1
            if (r1 == r7) goto L_0x03e7
            goto L_0x03df
        L_0x03e7:
            r1 = r12
        L_0x03e8:
            int r12 = r12 + 1
            r7 = r17
            goto L_0x039b
        L_0x03ed:
            r7 = -1
            r8 = 1
        L_0x03ef:
            if (r5 == r7) goto L_0x03f5
            if (r1 == r7) goto L_0x03f5
            r7 = 1
            goto L_0x03f6
        L_0x03f5:
            r7 = 0
        L_0x03f6:
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0404
            kgc r7 = new kgc
            r8 = 1
            r7.<init>(r8)
            r4[r5] = r7
            r4[r1] = r7
            goto L_0x0405
        L_0x0404:
            r8 = 1
        L_0x0405:
            android.util.Pair r1 = android.util.Pair.create(r4, r2)
            java.lang.Object r2 = r1.second
            m85[] r2 = (defpackage.m85[]) r2
            ww6 r4 = new ww6
            r5 = 4
            r4.<init>(r5)
            r12 = 0
        L_0x0414:
            if (r12 >= r3) goto L_0x0482
            r5 = r9[r12]
            r7 = r2[r12]
            r11 = 0
        L_0x041b:
            int r13 = r5.a
            if (r11 >= r13) goto L_0x0479
            qze r13 = r5.a(r11)
            int r14 = r13.a
            int[] r15 = new int[r14]
            boolean[] r8 = new boolean[r14]
            r17 = r2
            r2 = 0
        L_0x042c:
            if (r2 >= r14) goto L_0x0460
            r18 = r3
            int[][][] r3 = r0.d
            r3 = r3[r12]
            r3 = r3[r11]
            r3 = r3[r2]
            r3 = r3 & 7
            r15[r2] = r3
            if (r7 == 0) goto L_0x0453
            qze r3 = r7.a()
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L_0x0453
            int r3 = r7.p(r2)
            r19 = r5
            r5 = -1
            if (r3 == r5) goto L_0x0456
            r3 = 1
            goto L_0x0457
        L_0x0453:
            r19 = r5
            r5 = -1
        L_0x0456:
            r3 = 0
        L_0x0457:
            r8[r2] = r3
            int r2 = r2 + 1
            r3 = r18
            r5 = r19
            goto L_0x042c
        L_0x0460:
            r18 = r3
            r19 = r5
            r5 = -1
            r2 = r6[r12]
            q0f r3 = new q0f
            r3.<init>(r13, r15, r2, r8)
            r4.a(r3)
            int r11 = r11 + 1
            r2 = r17
            r3 = r18
            r5 = r19
            r8 = 1
            goto L_0x041b
        L_0x0479:
            r17 = r2
            r18 = r3
            r5 = -1
            int r12 = r12 + 1
            r8 = 1
            goto L_0x0414
        L_0x0482:
            r12 = 0
        L_0x0483:
            int r2 = r10.a
            if (r12 >= r2) goto L_0x04aa
            qze r2 = r10.a(r12)
            int r3 = r2.a
            int[] r5 = new int[r3]
            r6 = 0
            java.util.Arrays.fill(r5, r6)
            oy5[] r7 = r2.c
            r7 = r7[r6]
            java.lang.String r7 = r7.w0
            int r7 = defpackage.ha9.g(r7)
            boolean[] r3 = new boolean[r3]
            q0f r8 = new q0f
            r8.<init>(r2, r5, r7, r3)
            r4.a(r8)
            int r12 = r12 + 1
            goto L_0x0483
        L_0x04aa:
            r6 = 0
            r0f r2 = new r0f
            ffc r3 = r4.j()
            r2.<init>(r3)
            l0f r3 = new l0f
            java.lang.Object r4 = r1.first
            kgc[] r4 = (defpackage.kgc[]) r4
            java.lang.Object r1 = r1.second
            m85[] r1 = (defpackage.m85[]) r1
            r3.<init>((defpackage.kgc[]) r4, (defpackage.m85[]) r1, (defpackage.r0f) r2, (defpackage.ez7) r0)
            java.lang.Object r0 = r3.X
            m85[] r0 = (defpackage.m85[]) r0
            int r1 = r0.length
            r14 = r6
        L_0x04c7:
            if (r14 >= r1) goto L_0x04d5
            r2 = r0[r14]
            r4 = r25
            if (r2 == 0) goto L_0x04d2
            r2.l(r4)
        L_0x04d2:
            int r14 = r14 + 1
            goto L_0x04c7
        L_0x04d5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae8.g(float, lue):l0f");
    }

    public final void h() {
        yd8 yd8 = this.a;
        if (yd8 instanceof z33) {
            long j2 = this.f.d;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            z33 z33 = (z33) yd8;
            z33.X = 0;
            z33.Y = j2;
        }
    }
}
