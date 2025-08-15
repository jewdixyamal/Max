package defpackage;

/* renamed from: be8  reason: default package */
public final class be8 {
    public final zd8 a;
    public final Object b;
    public final grc[] c;
    public boolean d;
    public boolean e;
    public ee8 f;
    public boolean g;
    public final boolean[] h;
    public final vj0[] i;
    public final hz7 j;
    public final vk8 k;
    public be8 l;
    public tze m = tze.d;
    public l0f n;
    public long o;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: k08} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: k08} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: a43} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: k08} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public be8(defpackage.vj0[] r10, long r11, defpackage.hz7 r13, defpackage.n64 r14, defpackage.vk8 r15, defpackage.ee8 r16, defpackage.l0f r17) {
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
            yj8 r4 = r3.a
            java.lang.Object r5 = r4.a
            r0.b = r5
            r0.f = r3
            tze r5 = defpackage.tze.d
            r0.m = r5
            r5 = r17
            r0.n = r5
            int r5 = r1.length
            grc[] r5 = new defpackage.grc[r5]
            r0.c = r5
            int r1 = r1.length
            boolean[] r1 = new boolean[r1]
            r0.h = r1
            r15.getClass()
            int r1 = defpackage.b5b.n
            java.lang.Object r1 = r4.a
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r5 = r1.first
            java.lang.Object r1 = r1.second
            yj8 r1 = r4.a(r1)
            java.lang.Object r4 = r2.d
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            tk8 r4 = (defpackage.tk8) r4
            r4.getClass()
            java.lang.Object r5 = r2.f
            java.util.HashSet r5 = (java.util.HashSet) r5
            r5.add(r4)
            java.lang.Object r5 = r2.e
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r4)
            rk8 r5 = (defpackage.rk8) r5
            if (r5 == 0) goto L_0x0064
            ej0 r6 = r5.a
            ak8 r5 = r5.b
            r6.f(r5)
        L_0x0064:
            java.util.ArrayList r5 = r4.c
            r5.add(r1)
            q08 r5 = r4.a
            long r6 = r3.b
            r8 = r14
            k08 r1 = r5.c(r1, r14, r6)
            java.lang.Object r5 = r2.c
            java.util.IdentityHashMap r5 = (java.util.IdentityHashMap) r5
            r5.put(r1, r4)
            r15.g()
            long r2 = r3.d
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0095
            a43 r4 = new a43
            r5 = 1
            r6 = 0
            r10 = r4
            r11 = r1
            r12 = r5
            r13 = r6
            r15 = r2
            r10.<init>(r11, r12, r13, r15)
            r1 = r4
        L_0x0095:
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be8.<init>(vj0[], long, hz7, n64, vk8, ee8, l0f):void");
    }

    public final long a(l0f l0f, long j2, boolean z, boolean[] zArr) {
        vj0[] vj0Arr;
        Object[] objArr;
        l0f l0f2 = l0f;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= l0f2.b) {
                break;
            }
            if (z || !l0f2.G(this.n, i2)) {
                z2 = false;
            }
            this.h[i2] = z2;
            i2++;
        }
        int i3 = 0;
        while (true) {
            vj0Arr = this.i;
            int length = vj0Arr.length;
            objArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (vj0Arr[i3].b == -2) {
                objArr[i3] = null;
            }
            i3++;
        }
        b();
        this.n = l0f2;
        c();
        long g2 = this.a.g((n85[]) l0f2.X, this.h, this.c, zArr, j2);
        for (int i4 = 0; i4 < vj0Arr.length; i4++) {
            if (vj0Arr[i4].b == -2 && this.n.I(i4)) {
                objArr[i4] = new Object();
            }
        }
        this.e = false;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            if (objArr[i5] != null) {
                fm9.k(l0f2.I(i5));
                if (vj0Arr[i5].b != -2) {
                    this.e = true;
                }
            } else {
                fm9.k(((n85[]) l0f2.X)[i5] == null);
            }
        }
        return g2;
    }

    public final void b() {
        if (this.l == null) {
            int i2 = 0;
            while (true) {
                l0f l0f = this.n;
                if (i2 < l0f.b) {
                    boolean I = l0f.I(i2);
                    n85 n85 = ((n85[]) this.n.X)[i2];
                    if (I && n85 != null) {
                        n85.h();
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
                    n85 n85 = ((n85[]) this.n.X)[i2];
                    if (I && n85 != null) {
                        n85.e();
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

    public final boolean f() {
        return this.d && (!this.e || this.a.r() == Long.MIN_VALUE);
    }

    public final void g() {
        b();
        zd8 zd8 = this.a;
        try {
            boolean z = zd8 instanceof a43;
            vk8 vk8 = this.k;
            if (z) {
                vk8.o(((a43) zd8).a);
            } else {
                vk8.o(zd8);
            }
        } catch (RuntimeException e2) {
            z04.v("Period release failed.", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r3v18, types: [ww6, pw6] */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02bc, code lost:
        if (defpackage.aa3.a.d(r12.b, r8.b).d(r12.a, r8.a).f() > 0) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x040d, code lost:
        if (r12 == 2) goto L_0x0416;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.l0f h(float r30, defpackage.mue r31) {
        /*
            r29 = this;
            r0 = r29
            r4 = 1
            hz7 r5 = r0.j
            vj0[] r6 = r0.i
            tze r7 = r0.m
            ee8 r8 = r0.f
            yj8 r8 = r8.a
            r5.getClass()
            int r8 = r6.length
            int r8 = r8 + r4
            int[] r8 = new int[r8]
            int r9 = r6.length
            int r9 = r9 + r4
            rze[][] r10 = new defpackage.rze[r9][]
            int r11 = r6.length
            int r11 = r11 + r4
            int[][][] r11 = new int[r11][][]
            r12 = 0
        L_0x001d:
            if (r12 >= r9) goto L_0x002b
            int r13 = r7.a
            rze[] r14 = new defpackage.rze[r13]
            r10[r12] = r14
            int[][] r13 = new int[r13][]
            r11[r12] = r13
            int r12 = r12 + r4
            goto L_0x001d
        L_0x002b:
            int r9 = r6.length
            int[] r15 = new int[r9]
            r12 = 0
        L_0x002f:
            if (r12 >= r9) goto L_0x003b
            r13 = r6[r12]
            int r13 = r13.E()
            r15[r12] = r13
            int r12 = r12 + r4
            goto L_0x002f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r12 = r7.a
            if (r9 >= r12) goto L_0x00cd
            rze r12 = r7.a(r9)
            int r13 = r12.c
            r14 = 5
            if (r13 != r14) goto L_0x004b
            r13 = r4
            goto L_0x004c
        L_0x004b:
            r13 = 0
        L_0x004c:
            int r14 = r6.length
            r16 = r4
            r1 = 0
            r3 = 0
        L_0x0051:
            int r4 = r6.length
            if (r1 >= r4) goto L_0x0092
            r4 = r6[r1]
            r17 = r7
            r20 = r15
            r2 = 0
            r7 = 0
        L_0x005c:
            int r15 = r12.a
            if (r2 >= r15) goto L_0x0073
            qy5[] r15 = r12.d
            r15 = r15[r2]
            int r15 = r4.D(r15)
            r19 = 7
            r15 = r15 & 7
            int r7 = java.lang.Math.max(r7, r15)
            r15 = 1
            int r2 = r2 + r15
            goto L_0x005c
        L_0x0073:
            r2 = r8[r1]
            if (r2 != 0) goto L_0x0079
            r2 = 1
            goto L_0x007a
        L_0x0079:
            r2 = 0
        L_0x007a:
            if (r7 > r3) goto L_0x0087
            if (r7 != r3) goto L_0x0085
            if (r13 == 0) goto L_0x0085
            if (r16 != 0) goto L_0x0085
            if (r2 == 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r2 = 1
            goto L_0x008c
        L_0x0087:
            r14 = r1
            r16 = r2
            r3 = r7
            goto L_0x0085
        L_0x008c:
            int r1 = r1 + r2
            r7 = r17
            r15 = r20
            goto L_0x0051
        L_0x0092:
            r17 = r7
            r20 = r15
            int r1 = r6.length
            if (r14 != r1) goto L_0x009f
            int r1 = r12.a
            int[] r1 = new int[r1]
            r4 = 1
            goto L_0x00b9
        L_0x009f:
            r1 = r6[r14]
            int r2 = r12.a
            int[] r2 = new int[r2]
            r3 = 0
        L_0x00a6:
            int r4 = r12.a
            if (r3 >= r4) goto L_0x00b7
            qy5[] r4 = r12.d
            r4 = r4[r3]
            int r4 = r1.D(r4)
            r2[r3] = r4
            r4 = 1
            int r3 = r3 + r4
            goto L_0x00a6
        L_0x00b7:
            r4 = 1
            r1 = r2
        L_0x00b9:
            r2 = r8[r14]
            r3 = r10[r14]
            r3[r2] = r12
            r3 = r11[r14]
            r3[r2] = r1
            int r2 = r2 + r4
            r8[r14] = r2
            int r9 = r9 + r4
            r7 = r17
            r15 = r20
            goto L_0x003c
        L_0x00cd:
            r20 = r15
            int r1 = r6.length
            tze[] r14 = new defpackage.tze[r1]
            int r1 = r6.length
            java.lang.String[] r1 = new java.lang.String[r1]
            int r2 = r6.length
            int[] r13 = new int[r2]
            r2 = 0
        L_0x00d9:
            int r3 = r6.length
            if (r2 >= r3) goto L_0x0108
            r3 = r8[r2]
            tze r4 = new tze
            r7 = r10[r2]
            java.lang.Object[] r7 = defpackage.oaf.U(r3, r7)
            rze[] r7 = (defpackage.rze[]) r7
            r4.<init>(r7)
            r14[r2] = r4
            r4 = r11[r2]
            java.lang.Object[] r3 = defpackage.oaf.U(r3, r4)
            int[][] r3 = (int[][]) r3
            r11[r2] = r3
            r3 = r6[r2]
            java.lang.String r3 = r3.k()
            r1[r2] = r3
            r3 = r6[r2]
            int r3 = r3.b
            r13[r2] = r3
            r3 = 1
            int r2 = r2 + r3
            goto L_0x00d9
        L_0x0108:
            int r1 = r6.length
            r1 = r8[r1]
            tze r2 = new tze
            int r3 = r6.length
            r3 = r10[r3]
            java.lang.Object[] r1 = defpackage.oaf.U(r1, r3)
            rze[] r1 = (defpackage.rze[]) r1
            r2.<init>(r1)
            fz7 r1 = new fz7
            r12 = r1
            r3 = r20
            r15 = r3
            r16 = r11
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17)
            cf4 r5 = (defpackage.cf4) r5
            java.lang.Object r2 = r5.c
            monitor-enter(r2)
            oe4 r4 = r5.g     // Catch:{ all -> 0x016f }
            boolean r6 = r4.s0     // Catch:{ all -> 0x016f }
            r7 = 32
            if (r6 == 0) goto L_0x0172
            int r6 = defpackage.oaf.a     // Catch:{ all -> 0x016f }
            if (r6 < r7) goto L_0x0172
            w36 r6 = r5.h     // Catch:{ all -> 0x016f }
            if (r6 == 0) goto L_0x0172
            android.os.Looper r8 = android.os.Looper.myLooper()     // Catch:{ all -> 0x016f }
            defpackage.fm9.l(r8)     // Catch:{ all -> 0x016f }
            java.lang.Object r9 = r6.o     // Catch:{ all -> 0x016f }
            re4 r9 = (defpackage.re4) r9     // Catch:{ all -> 0x016f }
            if (r9 != 0) goto L_0x0172
            java.lang.Object r9 = r6.c     // Catch:{ all -> 0x016f }
            android.os.Handler r9 = (android.os.Handler) r9     // Catch:{ all -> 0x016f }
            if (r9 == 0) goto L_0x014f
            goto L_0x0172
        L_0x014f:
            re4 r9 = new re4     // Catch:{ all -> 0x016f }
            r9.<init>(r5)     // Catch:{ all -> 0x016f }
            r6.o = r9     // Catch:{ all -> 0x016f }
            android.os.Handler r9 = new android.os.Handler     // Catch:{ all -> 0x016f }
            r9.<init>(r8)     // Catch:{ all -> 0x016f }
            r6.c = r9     // Catch:{ all -> 0x016f }
            java.lang.Object r8 = r6.b     // Catch:{ all -> 0x016f }
            android.media.Spatializer r8 = (android.media.Spatializer) r8     // Catch:{ all -> 0x016f }
            a84 r10 = new a84     // Catch:{ all -> 0x016f }
            r12 = 0
            r10.<init>(r9, r12)     // Catch:{ all -> 0x016f }
            java.lang.Object r6 = r6.o     // Catch:{ all -> 0x016f }
            re4 r6 = (defpackage.re4) r6     // Catch:{ all -> 0x016f }
            r8.addOnSpatializerStateChangedListener(r10, r6)     // Catch:{ all -> 0x016f }
            goto L_0x0172
        L_0x016f:
            r0 = move-exception
            goto L_0x067b
        L_0x0172:
            monitor-exit(r2)     // Catch:{ all -> 0x016f }
            int r2 = r1.a
            l85[] r6 = new defpackage.l85[r2]
            f0f r8 = r4.s
            int r8 = r8.a
            r9 = 2
            if (r8 != r9) goto L_0x0180
            r8 = 0
            goto L_0x0191
        L_0x0180:
            d74 r8 = new d74
            r12 = 7
            r8.<init>(r4, r12, r3)
            v00 r12 = new v00
            r13 = 25
            r12.<init>(r13)
            android.util.Pair r8 = defpackage.cf4.j(r9, r1, r11, r8, r12)
        L_0x0191:
            boolean r12 = r4.x
            f0f r13 = r4.s
            if (r12 != 0) goto L_0x019c
            if (r8 != 0) goto L_0x019a
            goto L_0x019c
        L_0x019a:
            r7 = 0
            goto L_0x01b2
        L_0x019c:
            int r12 = r13.a
            if (r12 != r9) goto L_0x01a1
            goto L_0x019a
        L_0x01a1:
            q64 r12 = new q64
            r14 = 4
            r12.<init>((int) r14, (java.lang.Object) r4)
            v00 r15 = new v00
            r7 = 21
            r15.<init>(r7)
            android.util.Pair r7 = defpackage.cf4.j(r14, r1, r11, r12, r15)
        L_0x01b2:
            if (r7 == 0) goto L_0x01c3
            java.lang.Object r8 = r7.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r7 = r7.first
            l85 r7 = (defpackage.l85) r7
            r6[r8] = r7
            goto L_0x01d3
        L_0x01c3:
            if (r8 == 0) goto L_0x01d3
            java.lang.Object r7 = r8.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r8 = r8.first
            l85 r8 = (defpackage.l85) r8
            r6[r7] = r8
        L_0x01d3:
            r7 = 0
        L_0x01d4:
            tze[] r8 = r1.c
            int[] r12 = r1.b
            int r14 = r1.a
            if (r7 >= r14) goto L_0x01ec
            r14 = r12[r7]
            if (r9 != r14) goto L_0x01e9
            r14 = r8[r7]
            int r14 = r14.a
            if (r14 <= 0) goto L_0x01e9
            r7 = 1
            r14 = 1
            goto L_0x01ee
        L_0x01e9:
            r14 = 1
            int r7 = r7 + r14
            goto L_0x01d4
        L_0x01ec:
            r14 = 1
            r7 = 0
        L_0x01ee:
            t64 r15 = new t64
            r15.<init>((defpackage.cf4) r5, (defpackage.oe4) r4, (boolean) r7, (int[]) r3)
            v00 r3 = new v00
            r7 = 23
            r3.<init>(r7)
            android.util.Pair r3 = defpackage.cf4.j(r14, r1, r11, r15, r3)
            if (r3 == 0) goto L_0x020e
            java.lang.Object r7 = r3.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r14 = r3.first
            l85 r14 = (defpackage.l85) r14
            r6[r7] = r14
        L_0x020e:
            if (r3 != 0) goto L_0x0212
            r3 = 0
            goto L_0x0223
        L_0x0212:
            java.lang.Object r3 = r3.first
            l85 r3 = (defpackage.l85) r3
            rze r7 = r3.a
            int[] r3 = r3.b
            r14 = 0
            r3 = r3[r14]
            qy5[] r7 = r7.d
            r3 = r7[r3]
            java.lang.String r3 = r3.d
        L_0x0223:
            int r7 = r13.a
            r14 = 3
            if (r7 != r9) goto L_0x022a
            r3 = 0
            goto L_0x023c
        L_0x022a:
            d74 r7 = new d74
            r15 = 9
            r7.<init>(r4, r15, r3)
            v00 r3 = new v00
            r15 = 27
            r3.<init>(r15)
            android.util.Pair r3 = defpackage.cf4.j(r14, r1, r11, r7, r3)
        L_0x023c:
            if (r3 == 0) goto L_0x024c
            java.lang.Object r7 = r3.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r3 = r3.first
            l85 r3 = (defpackage.l85) r3
            r6[r7] = r3
        L_0x024c:
            r3 = 0
        L_0x024d:
            if (r3 >= r2) goto L_0x0314
            r7 = r12[r3]
            if (r7 == r9) goto L_0x02fb
            r15 = 1
            if (r7 == r15) goto L_0x0302
            if (r7 == r14) goto L_0x02fb
            r15 = 4
            if (r7 == r15) goto L_0x02fb
            r7 = r8[r3]
            r15 = r11[r3]
            int r14 = r13.a
            if (r14 != r9) goto L_0x026c
            r24 = r8
            r26 = r12
            r28 = r13
        L_0x0269:
            r7 = 0
            goto L_0x02f7
        L_0x026c:
            r9 = 0
            r14 = 0
            r20 = 0
            r22 = 0
        L_0x0272:
            int r10 = r7.a
            if (r14 >= r10) goto L_0x02e4
            rze r10 = r7.a(r14)
            r23 = r15[r14]
            r24 = r8
            r25 = r9
            r8 = r22
            r22 = r7
            r7 = 0
        L_0x0285:
            int r9 = r10.a
            if (r7 >= r9) goto L_0x02d5
            r9 = r23[r7]
            r26 = r12
            boolean r12 = r4.t0
            boolean r9 = defpackage.vj0.n(r9, r12)
            if (r9 == 0) goto L_0x02c8
            qy5[] r9 = r10.d
            r9 = r9[r7]
            le4 r12 = new le4
            r27 = r10
            r10 = r23[r7]
            r12.<init>(r10, r9)
            if (r8 == 0) goto L_0x02bf
            y93 r9 = defpackage.aa3.a
            boolean r10 = r8.b
            r28 = r13
            boolean r13 = r12.b
            aa3 r9 = r9.d(r13, r10)
            boolean r10 = r12.a
            boolean r13 = r8.a
            aa3 r9 = r9.d(r10, r13)
            int r9 = r9.f()
            if (r9 <= 0) goto L_0x02c6
            goto L_0x02c1
        L_0x02bf:
            r28 = r13
        L_0x02c1:
            r20 = r7
            r8 = r12
            r25 = r27
        L_0x02c6:
            r9 = 1
            goto L_0x02cd
        L_0x02c8:
            r27 = r10
            r28 = r13
            goto L_0x02c6
        L_0x02cd:
            int r7 = r7 + r9
            r12 = r26
            r10 = r27
            r13 = r28
            goto L_0x0285
        L_0x02d5:
            r26 = r12
            r28 = r13
            r9 = 1
            int r14 = r14 + r9
            r7 = r22
            r9 = r25
            r22 = r8
            r8 = r24
            goto L_0x0272
        L_0x02e4:
            r24 = r8
            r26 = r12
            r28 = r13
            if (r9 != 0) goto L_0x02ee
            goto L_0x0269
        L_0x02ee:
            l85 r7 = new l85
            int[] r8 = new int[]{r20}
            r7.<init>(r9, r8)
        L_0x02f7:
            r6[r3] = r7
        L_0x02f9:
            r7 = 1
            goto L_0x0309
        L_0x02fb:
            r24 = r8
            r26 = r12
            r28 = r13
            goto L_0x02f9
        L_0x0302:
            r24 = r8
            r26 = r12
            r28 = r13
            r7 = r15
        L_0x0309:
            int r3 = r3 + r7
            r8 = r24
            r12 = r26
            r13 = r28
            r9 = 2
            r14 = 3
            goto L_0x024d
        L_0x0314:
            int r3 = r1.a
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r8 = 0
        L_0x031c:
            tze[] r9 = r1.c
            if (r8 >= r3) goto L_0x0328
            r9 = r9[r8]
            defpackage.cf4.d(r9, r4, r7)
            r9 = 1
            int r8 = r8 + r9
            goto L_0x031c
        L_0x0328:
            tze r8 = r1.f
            defpackage.cf4.d(r8, r4, r7)
            r8 = 0
        L_0x032e:
            r10 = -1
            if (r8 >= r3) goto L_0x0365
            int[] r12 = r1.b
            r12 = r12[r8]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r12 = r7.get(r12)
            c0f r12 = (defpackage.c0f) r12
            if (r12 != 0) goto L_0x0343
        L_0x0341:
            r10 = 1
            goto L_0x0363
        L_0x0343:
            zw6 r13 = r12.b
            boolean r14 = r13.isEmpty()
            if (r14 != 0) goto L_0x035f
            r14 = r9[r8]
            rze r12 = r12.a
            int r14 = r14.b(r12)
            if (r14 == r10) goto L_0x035f
            l85 r10 = new l85
            int[] r13 = defpackage.s5c.c0(r13)
            r10.<init>(r12, r13)
            goto L_0x0360
        L_0x035f:
            r10 = 0
        L_0x0360:
            r6[r8] = r10
            goto L_0x0341
        L_0x0363:
            int r8 = r8 + r10
            goto L_0x032e
        L_0x0365:
            int r3 = r1.a
            r7 = 0
        L_0x0368:
            if (r7 >= r3) goto L_0x0395
            tze[] r8 = r1.c
            r8 = r8[r7]
            android.util.SparseArray r9 = r4.x0
            java.lang.Object r9 = r9.get(r7)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 == 0) goto L_0x0392
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L_0x0392
            android.util.SparseArray r9 = r4.x0
            java.lang.Object r9 = r9.get(r7)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 == 0) goto L_0x038f
            java.lang.Object r8 = r9.get(r8)
            defpackage.au1.r(r8)
        L_0x038f:
            r8 = 0
            r6[r7] = r8
        L_0x0392:
            r8 = 1
            int r7 = r7 + r8
            goto L_0x0368
        L_0x0395:
            r3 = 0
        L_0x0396:
            if (r3 >= r2) goto L_0x03ba
            int[] r7 = r1.b
            r7 = r7[r3]
            android.util.SparseBooleanArray r8 = r4.y0
            boolean r8 = r8.get(r3)
            if (r8 != 0) goto L_0x03b0
            jx6 r8 = r4.B
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x03b2
        L_0x03b0:
            r8 = 0
            goto L_0x03b5
        L_0x03b2:
            r7 = 1
            r8 = 0
            goto L_0x03b8
        L_0x03b5:
            r6[r3] = r8
            r7 = 1
        L_0x03b8:
            int r3 = r3 + r7
            goto L_0x0396
        L_0x03ba:
            r8 = 0
            kj6 r3 = r5.e
            hg0 r5 = r5.b
            defpackage.fm9.l(r5)
            n85[] r3 = r3.c(r6, r5)
            lgc[] r5 = new defpackage.lgc[r2]
            r6 = 0
        L_0x03c9:
            r7 = -2
            if (r6 >= r2) goto L_0x03f8
            int[] r9 = r1.b
            r9 = r9[r6]
            android.util.SparseBooleanArray r12 = r4.y0
            boolean r12 = r12.get(r6)
            if (r12 != 0) goto L_0x03f2
            jx6 r12 = r4.B
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r12.contains(r9)
            if (r9 == 0) goto L_0x03e5
            goto L_0x03f2
        L_0x03e5:
            int[] r9 = r1.b
            r9 = r9[r6]
            if (r9 == r7) goto L_0x03ef
            r7 = r3[r6]
            if (r7 == 0) goto L_0x03f2
        L_0x03ef:
            lgc r7 = defpackage.lgc.c
            goto L_0x03f3
        L_0x03f2:
            r7 = r8
        L_0x03f3:
            r5[r6] = r7
            r7 = 1
            int r6 = r6 + r7
            goto L_0x03c9
        L_0x03f8:
            boolean r2 = r4.u0
            if (r2 == 0) goto L_0x046e
            r6 = r10
            r9 = r6
            r2 = 0
        L_0x03ff:
            int r12 = r1.a
            if (r2 >= r12) goto L_0x0457
            int[] r12 = r1.b
            r12 = r12[r2]
            r13 = r3[r2]
            r14 = 1
            if (r12 == r14) goto L_0x0415
            r14 = 2
            if (r12 != r14) goto L_0x0410
            goto L_0x0416
        L_0x0410:
            r8 = r10
            r7 = 1
            r10 = 32
            goto L_0x0452
        L_0x0415:
            r14 = 2
        L_0x0416:
            if (r13 == 0) goto L_0x0410
            r15 = r11[r2]
            tze[] r8 = r1.c
            r8 = r8[r2]
            rze r14 = r13.a()
            int r8 = r8.b(r14)
            r14 = 0
        L_0x0427:
            int r7 = r13.length()
            if (r14 >= r7) goto L_0x0441
            r7 = r15[r8]
            int r20 = r13.f(r14)
            r7 = r7[r20]
            r10 = 32
            r7 = r7 & r10
            if (r7 == r10) goto L_0x043d
            r7 = 1
            r8 = -1
            goto L_0x0452
        L_0x043d:
            r7 = 1
            int r14 = r14 + r7
            r10 = -1
            goto L_0x0427
        L_0x0441:
            r7 = 1
            r10 = 32
            if (r12 != r7) goto L_0x044d
            r8 = -1
            if (r9 == r8) goto L_0x044b
        L_0x0449:
            r2 = 0
            goto L_0x0459
        L_0x044b:
            r9 = r2
            goto L_0x0452
        L_0x044d:
            r8 = -1
            if (r6 == r8) goto L_0x0451
            goto L_0x0449
        L_0x0451:
            r6 = r2
        L_0x0452:
            int r2 = r2 + r7
            r10 = r8
            r7 = -2
            r8 = 0
            goto L_0x03ff
        L_0x0457:
            r8 = r10
            r2 = 1
        L_0x0459:
            if (r9 == r8) goto L_0x045f
            if (r6 == r8) goto L_0x045f
            r7 = 1
            goto L_0x0460
        L_0x045f:
            r7 = 0
        L_0x0460:
            r2 = r2 & r7
            if (r2 == 0) goto L_0x046e
            lgc r2 = new lgc
            r7 = 1
            r8 = 0
            r2.<init>(r8, r7)
            r5[r9] = r2
            r5[r6] = r2
        L_0x046e:
            f0f r2 = r4.s
            int r2 = r2.a
            if (r2 == 0) goto L_0x04d9
            r2 = 0
            r8 = -1
            r12 = 0
        L_0x0477:
            int r6 = r1.a
            if (r12 >= r6) goto L_0x04bb
            int[] r6 = r1.b
            r6 = r6[r12]
            r7 = r3[r12]
            r9 = 1
            if (r6 == r9) goto L_0x0487
            if (r7 == 0) goto L_0x0487
            goto L_0x04d9
        L_0x0487:
            if (r6 != r9) goto L_0x04b8
            if (r7 == 0) goto L_0x04b8
            int r6 = r7.length()
            if (r6 != r9) goto L_0x04b8
            tze[] r6 = r1.c
            r6 = r6[r12]
            rze r9 = r7.a()
            int r6 = r6.b(r9)
            r9 = r11[r12]
            r6 = r9[r6]
            r9 = 0
            int r10 = r7.f(r9)
            r6 = r6[r10]
            qy5 r7 = r7.j()
            boolean r6 = defpackage.cf4.i(r4, r6, r7)
            if (r6 == 0) goto L_0x04b6
            r6 = 1
            int r2 = r2 + r6
            r8 = r12
            goto L_0x04b9
        L_0x04b6:
            r6 = 1
            goto L_0x04b9
        L_0x04b8:
            r6 = r9
        L_0x04b9:
            int r12 = r12 + r6
            goto L_0x0477
        L_0x04bb:
            r6 = 1
            if (r2 != r6) goto L_0x04d9
            lgc r2 = new lgc
            f0f r4 = r4.s
            boolean r4 = r4.b
            if (r4 == 0) goto L_0x04c8
            r4 = 1
            goto L_0x04c9
        L_0x04c8:
            r4 = 2
        L_0x04c9:
            r6 = r5[r8]
            if (r6 == 0) goto L_0x04d3
            boolean r6 = r6.b
            if (r6 == 0) goto L_0x04d3
            r6 = 1
            goto L_0x04d4
        L_0x04d3:
            r6 = 0
        L_0x04d4:
            r2.<init>(r4, r6)
            r5[r8] = r2
        L_0x04d9:
            android.util.Pair r2 = android.util.Pair.create(r5, r3)
            java.lang.Object r3 = r2.second
            n85[] r3 = (defpackage.n85[]) r3
            int r4 = r3.length
            java.util.List[] r4 = new java.util.List[r4]
            r12 = 0
        L_0x04e5:
            int r5 = r3.length
            if (r12 >= r5) goto L_0x04fa
            r5 = r3[r12]
            if (r5 == 0) goto L_0x04f1
            ffc r5 = defpackage.zw6.n(r5)
            goto L_0x04f5
        L_0x04f1:
            ls5 r5 = defpackage.zw6.b
            ffc r5 = defpackage.ffc.X
        L_0x04f5:
            r4[r12] = r5
            r5 = 1
            int r12 = r12 + r5
            goto L_0x04e5
        L_0x04fa:
            ww6 r3 = new ww6
            r5 = 4
            r3.<init>(r5)
            r12 = 0
        L_0x0501:
            int r5 = r1.a
            if (r12 >= r5) goto L_0x05f6
            tze[] r5 = r1.c
            r6 = r5[r12]
            r7 = r4[r12]
            r8 = 0
        L_0x050c:
            int r9 = r6.a
            if (r8 >= r9) goto L_0x05ef
            rze r9 = r6.a(r8)
            r10 = r5[r12]
            rze r10 = r10.a(r8)
            int r10 = r10.a
            int[] r11 = new int[r10]
            r13 = 0
            r14 = 0
        L_0x0520:
            if (r13 >= r10) goto L_0x0540
            int[][][] r15 = r1.e
            r15 = r15[r12]
            r15 = r15[r8]
            r15 = r15[r13]
            r16 = 7
            r15 = r15 & 7
            r16 = r4
            r4 = 4
            if (r15 == r4) goto L_0x0535
            r15 = 1
            goto L_0x053c
        L_0x0535:
            r15 = 1
            int r18 = r14 + 1
            r11[r14] = r13
            r14 = r18
        L_0x053c:
            int r13 = r13 + r15
            r4 = r16
            goto L_0x0520
        L_0x0540:
            r16 = r4
            r4 = 4
            int[] r10 = java.util.Arrays.copyOf(r11, r14)
            r11 = 16
            r13 = r11
            r11 = 0
            r14 = 0
            r15 = 0
            r21 = 0
        L_0x054f:
            int r4 = r10.length
            if (r14 >= r4) goto L_0x0585
            r4 = r10[r14]
            r22 = r6
            r6 = r5[r12]
            rze r6 = r6.a(r8)
            qy5[] r6 = r6.d
            r4 = r6[r4]
            java.lang.String r4 = r4.n
            r6 = 1
            int r23 = r21 + 1
            if (r21 != 0) goto L_0x0569
            r11 = r4
            goto L_0x0570
        L_0x0569:
            boolean r4 = defpackage.oaf.a(r11, r4)
            r4 = r4 ^ r6
            r4 = r4 | r15
            r15 = r4
        L_0x0570:
            int[][][] r4 = r1.e
            r4 = r4[r12]
            r4 = r4[r8]
            r4 = r4[r14]
            r4 = r4 & 24
            int r13 = java.lang.Math.min(r13, r4)
            r4 = 1
            int r14 = r14 + r4
            r6 = r22
            r21 = r23
            goto L_0x054f
        L_0x0585:
            r22 = r6
            if (r15 == 0) goto L_0x0591
            int[] r4 = r1.d
            r4 = r4[r12]
            int r13 = java.lang.Math.min(r13, r4)
        L_0x0591:
            if (r13 == 0) goto L_0x0595
            r4 = 1
            goto L_0x0596
        L_0x0595:
            r4 = 0
        L_0x0596:
            int r6 = r9.a
            int[] r10 = new int[r6]
            boolean[] r6 = new boolean[r6]
            r11 = 0
        L_0x059d:
            int r13 = r9.a
            if (r11 >= r13) goto L_0x05de
            int[][][] r13 = r1.e
            r13 = r13[r12]
            r13 = r13[r8]
            r13 = r13[r11]
            r14 = 7
            r13 = r13 & r14
            r10[r11] = r13
            r13 = 0
        L_0x05ae:
            int r15 = r7.size()
            if (r13 >= r15) goto L_0x05d6
            java.lang.Object r15 = r7.get(r13)
            n85 r15 = (defpackage.n85) r15
            rze r14 = r15.a()
            boolean r14 = r14.equals(r9)
            if (r14 == 0) goto L_0x05d1
            int r14 = r15.p(r11)
            r15 = -1
            if (r14 == r15) goto L_0x05cf
            r14 = 1
            r18 = 1
            goto L_0x05da
        L_0x05cf:
            r14 = 1
            goto L_0x05d3
        L_0x05d1:
            r15 = -1
            goto L_0x05cf
        L_0x05d3:
            int r13 = r13 + r14
            r14 = 7
            goto L_0x05ae
        L_0x05d6:
            r14 = 1
            r15 = -1
            r18 = 0
        L_0x05da:
            r6[r11] = r18
            int r11 = r11 + r14
            goto L_0x059d
        L_0x05de:
            r14 = 1
            r15 = -1
            o0f r11 = new o0f
            r11.<init>(r9, r4, r10, r6)
            r3.a(r11)
            int r8 = r8 + r14
            r4 = r16
            r6 = r22
            goto L_0x050c
        L_0x05ef:
            r16 = r4
            r14 = 1
            r15 = -1
            int r12 = r12 + r14
            goto L_0x0501
        L_0x05f6:
            r12 = 0
        L_0x05f7:
            tze r4 = r1.f
            int r5 = r4.a
            if (r12 >= r5) goto L_0x0618
            rze r4 = r4.a(r12)
            int r5 = r4.a
            int[] r5 = new int[r5]
            r6 = 0
            java.util.Arrays.fill(r5, r6)
            int r7 = r4.a
            boolean[] r7 = new boolean[r7]
            o0f r8 = new o0f
            r8.<init>(r4, r6, r5, r7)
            r3.a(r8)
            r4 = 1
            int r12 = r12 + r4
            goto L_0x05f7
        L_0x0618:
            r6 = 0
            p0f r4 = new p0f
            ffc r3 = r3.j()
            r4.<init>(r3)
            l0f r3 = new l0f
            java.lang.Object r5 = r2.first
            lgc[] r5 = (defpackage.lgc[]) r5
            java.lang.Object r2 = r2.second
            n85[] r2 = (defpackage.n85[]) r2
            r3.<init>((defpackage.lgc[]) r5, (defpackage.n85[]) r2, (defpackage.p0f) r4, (defpackage.fz7) r1)
            r12 = r6
        L_0x0630:
            int r1 = r3.b
            if (r12 >= r1) goto L_0x0667
            boolean r1 = r3.I(r12)
            if (r1 == 0) goto L_0x0655
            java.lang.Object r1 = r3.X
            n85[] r1 = (defpackage.n85[]) r1
            r1 = r1[r12]
            if (r1 != 0) goto L_0x064e
            vj0[] r1 = r0.i
            r1 = r1[r12]
            int r1 = r1.b
            r2 = -2
            if (r1 != r2) goto L_0x064c
            goto L_0x064f
        L_0x064c:
            r1 = r6
            goto L_0x0650
        L_0x064e:
            r2 = -2
        L_0x064f:
            r1 = 1
        L_0x0650:
            defpackage.fm9.k(r1)
        L_0x0653:
            r1 = 1
            goto L_0x0665
        L_0x0655:
            r2 = -2
            java.lang.Object r1 = r3.X
            n85[] r1 = (defpackage.n85[]) r1
            r1 = r1[r12]
            if (r1 != 0) goto L_0x0660
            r1 = 1
            goto L_0x0661
        L_0x0660:
            r1 = r6
        L_0x0661:
            defpackage.fm9.k(r1)
            goto L_0x0653
        L_0x0665:
            int r12 = r12 + r1
            goto L_0x0630
        L_0x0667:
            java.lang.Object r0 = r3.X
            n85[] r0 = (defpackage.n85[]) r0
            int r1 = r0.length
        L_0x066c:
            if (r6 >= r1) goto L_0x067a
            r2 = r0[r6]
            r4 = r30
            if (r2 == 0) goto L_0x0677
            r2.l(r4)
        L_0x0677:
            r2 = 1
            int r6 = r6 + r2
            goto L_0x066c
        L_0x067a:
            return r3
        L_0x067b:
            monitor-exit(r2)     // Catch:{ all -> 0x016f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be8.h(float, mue):l0f");
    }

    public final void i() {
        zd8 zd8 = this.a;
        if (zd8 instanceof a43) {
            long j2 = this.f.d;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            a43 a43 = (a43) zd8;
            a43.X = 0;
            a43.Y = j2;
        }
    }
}
