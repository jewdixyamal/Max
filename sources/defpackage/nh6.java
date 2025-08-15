package defpackage;

/* renamed from: nh6  reason: default package */
public final class nh6 implements cw4, dw4 {
    public static final float[] m = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public static final float[] n = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final /* synthetic */ int a = 1;
    public final boolean[] b;
    public long c;
    public String d;
    public boolean e;
    public long f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;
    public Object l;

    public nh6(djb djb) {
        this.g = djb;
        this.b = new boolean[4];
        lh6 lh6 = new lh6(0);
        lh6.f = new byte[128];
        this.i = lh6;
        this.f = -9223372036854775807L;
        this.j = new vl9(178, 0);
        this.h = new yaf(3, false);
    }

    public final void a() {
        switch (this.a) {
            case 0:
                np8.i(this.b);
                lh6 lh6 = (lh6) this.i;
                lh6.b = false;
                lh6.d = 0;
                lh6.c = 0;
                mh6 mh6 = (mh6) this.k;
                if (mh6 != null) {
                    mh6.b = false;
                    mh6.c = false;
                    mh6.d = false;
                    mh6.e = -1;
                }
                vl9 vl9 = (vl9) this.j;
                if (vl9 != null) {
                    vl9.c();
                }
                this.c = 0;
                this.f = -9223372036854775807L;
                return;
            default:
                fm9.n(this.b);
                lh6 lh62 = (lh6) this.i;
                lh62.b = false;
                lh62.d = 0;
                lh62.c = 0;
                mh6 mh62 = (mh6) this.k;
                if (mh62 != null) {
                    mh62.b = false;
                    mh62.c = false;
                    mh62.d = false;
                    mh62.e = -1;
                }
                vl9 vl92 = (vl9) this.j;
                if (vl92 != null) {
                    vl92.c();
                }
                this.c = 0;
                this.f = -9223372036854775807L;
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0279  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(defpackage.wpa r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 3
            r3 = 0
            r5 = 1
            java.lang.Object r6 = r0.k
            mh6 r6 = (defpackage.mh6) r6
            defpackage.fm9.l(r6)
            java.lang.Object r6 = r0.l
            yze r6 = (defpackage.yze) r6
            defpackage.fm9.l(r6)
            int r6 = r1.b
            int r7 = r1.c
            byte[] r8 = r1.a
            long r9 = r0.c
            int r11 = r20.a()
            long r11 = (long) r11
            long r9 = r9 + r11
            r0.c = r9
            java.lang.Object r9 = r0.l
            yze r9 = (defpackage.yze) r9
            int r10 = r20.a()
            r9.b(r1, r10, r3)
        L_0x0030:
            boolean[] r9 = r0.b
            int r9 = defpackage.fm9.y(r8, r6, r7, r9)
            java.lang.Object r10 = r0.i
            lh6 r10 = (defpackage.lh6) r10
            java.lang.Object r11 = r0.j
            vl9 r11 = (defpackage.vl9) r11
            if (r9 != r7) goto L_0x0054
            boolean r1 = r0.e
            if (r1 != 0) goto L_0x0047
            r10.b(r6, r8, r7)
        L_0x0047:
            java.lang.Object r0 = r0.k
            mh6 r0 = (defpackage.mh6) r0
            r0.a(r6, r8, r7)
            if (r11 == 0) goto L_0x0053
            r11.a(r6, r8, r7)
        L_0x0053:
            return
        L_0x0054:
            byte[] r12 = r1.a
            int r13 = r9 + 3
            byte r12 = r12[r13]
            r14 = r12 & 255(0xff, float:3.57E-43)
            int r15 = r9 - r6
            boolean r3 = r0.e
            if (r3 != 0) goto L_0x020a
            if (r15 <= 0) goto L_0x0067
            r10.b(r6, r8, r9)
        L_0x0067:
            if (r15 >= 0) goto L_0x006b
            int r3 = -r15
            goto L_0x006c
        L_0x006b:
            r3 = 0
        L_0x006c:
            int r2 = r10.c
            if (r2 == 0) goto L_0x01f5
            java.lang.String r16 = "Unexpected start code value"
            if (r2 == r5) goto L_0x01de
            r5 = 2
            if (r2 == r5) goto L_0x01c7
            r5 = 4
            r4 = 3
            if (r2 == r4) goto L_0x01a9
            if (r2 != r5) goto L_0x01a3
            r2 = 179(0xb3, float:2.51E-43)
            if (r14 == r2) goto L_0x008c
            r2 = 181(0xb5, float:2.54E-43)
            if (r14 != r2) goto L_0x0086
            goto L_0x008c
        L_0x0086:
            r18 = r7
            r17 = r13
            goto L_0x0202
        L_0x008c:
            int r2 = r10.d
            int r2 = r2 - r3
            r10.d = r2
            r2 = 0
            r10.b = r2
            java.lang.Object r2 = r0.l
            yze r2 = (defpackage.yze) r2
            int r3 = r10.e
            java.lang.String r4 = r0.d
            r4.getClass()
            java.lang.Object r12 = r10.f
            byte[] r12 = (byte[]) r12
            int r10 = r10.d
            byte[] r10 = java.util.Arrays.copyOf(r12, r10)
            s02 r12 = new s02
            int r5 = r10.length
            r18 = r7
            r17 = r13
            r7 = 0
            r13 = 2
            r12.<init>((byte[]) r10, (int) r5, (int) r13, (byte) r7)
            r12.u(r3)
            r3 = 4
            r12.u(r3)
            r12.s()
            r5 = 8
            r12.t(r5)
            boolean r7 = r12.h()
            if (r7 == 0) goto L_0x00d1
            r12.t(r3)
            r7 = 3
            r12.t(r7)
        L_0x00d1:
            int r3 = r12.i(r3)
            java.lang.String r13 = "Invalid aspect ratio"
            r7 = 15
            if (r3 != r7) goto L_0x00ed
            int r3 = r12.i(r5)
            int r5 = r12.i(r5)
            if (r5 != 0) goto L_0x00e9
            defpackage.z04.c0(r13)
            goto L_0x00f8
        L_0x00e9:
            float r3 = (float) r3
            float r5 = (float) r5
            float r3 = r3 / r5
            goto L_0x00fa
        L_0x00ed:
            r5 = 7
            if (r3 >= r5) goto L_0x00f5
            float[] r5 = n
            r3 = r5[r3]
            goto L_0x00fa
        L_0x00f5:
            defpackage.z04.c0(r13)
        L_0x00f8:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x00fa:
            boolean r5 = r12.h()
            if (r5 == 0) goto L_0x0132
            r5 = 2
            r12.t(r5)
            r5 = 1
            r12.t(r5)
            boolean r5 = r12.h()
            if (r5 == 0) goto L_0x0132
            r12.t(r7)
            r12.s()
            r12.t(r7)
            r12.s()
            r12.t(r7)
            r12.s()
            r5 = 3
            r12.t(r5)
            r5 = 11
            r12.t(r5)
            r12.s()
            r12.t(r7)
            r12.s()
        L_0x0132:
            r5 = 2
            int r7 = r12.i(r5)
            if (r7 == 0) goto L_0x013e
            java.lang.String r5 = "Unhandled video object layer shape"
            defpackage.z04.c0(r5)
        L_0x013e:
            r12.s()
            r5 = 16
            int r5 = r12.i(r5)
            r12.s()
            boolean r7 = r12.h()
            if (r7 == 0) goto L_0x0164
            if (r5 != 0) goto L_0x0158
            java.lang.String r5 = "Invalid vop_increment_time_resolution"
            defpackage.z04.c0(r5)
            goto L_0x0164
        L_0x0158:
            int r5 = r5 + -1
            r7 = 0
        L_0x015b:
            if (r5 <= 0) goto L_0x0161
            r13 = 1
            int r7 = r7 + r13
            int r5 = r5 >> r13
            goto L_0x015b
        L_0x0161:
            r12.t(r7)
        L_0x0164:
            r12.s()
            r5 = 13
            int r7 = r12.i(r5)
            r12.s()
            int r5 = r12.i(r5)
            r12.s()
            r12.s()
            ny5 r12 = new ny5
            r12.<init>()
            r12.a = r4
            java.lang.String r4 = "video/mp4v-es"
            java.lang.String r4 = defpackage.ia9.l(r4)
            r12.m = r4
            r12.s = r7
            r12.t = r5
            r12.w = r3
            java.util.List r3 = java.util.Collections.singletonList(r10)
            r12.p = r3
            qy5 r3 = new qy5
            r3.<init>(r12)
            r2.e(r3)
            r2 = 1
            r0.e = r2
        L_0x01a0:
            r4 = 3
            goto L_0x020f
        L_0x01a3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x01a9:
            r18 = r7
            r17 = r13
            r2 = r12 & 240(0xf0, float:3.36E-43)
            r3 = 32
            if (r2 == r3) goto L_0x01be
            defpackage.z04.c0(r16)
            r2 = 0
            r10.b = r2
            r10.d = r2
            r10.c = r2
            goto L_0x0202
        L_0x01be:
            r2 = 0
            int r3 = r10.d
            r10.e = r3
            r3 = 4
            r10.c = r3
            goto L_0x0202
        L_0x01c7:
            r18 = r7
            r17 = r13
            r2 = 0
            r3 = 31
            if (r14 <= r3) goto L_0x01da
            defpackage.z04.c0(r16)
            r10.b = r2
            r10.d = r2
            r10.c = r2
            goto L_0x0202
        L_0x01da:
            r3 = 3
            r10.c = r3
            goto L_0x0202
        L_0x01de:
            r18 = r7
            r17 = r13
            r2 = 0
            r3 = 181(0xb5, float:2.54E-43)
            if (r14 == r3) goto L_0x01f1
            defpackage.z04.c0(r16)
            r10.b = r2
            r10.d = r2
            r10.c = r2
            goto L_0x0202
        L_0x01f1:
            r2 = 2
            r10.c = r2
            goto L_0x0202
        L_0x01f5:
            r18 = r7
            r17 = r13
            r2 = 176(0xb0, float:2.47E-43)
            if (r14 != r2) goto L_0x0202
            r2 = 1
            r10.c = r2
            r10.b = r2
        L_0x0202:
            byte[] r2 = defpackage.lh6.h
            r3 = 0
            r4 = 3
            r10.b(r3, r2, r4)
            goto L_0x020f
        L_0x020a:
            r18 = r7
            r17 = r13
            goto L_0x01a0
        L_0x020f:
            java.lang.Object r2 = r0.k
            mh6 r2 = (defpackage.mh6) r2
            r2.a(r6, r8, r9)
            if (r11 == 0) goto L_0x0254
            if (r15 <= 0) goto L_0x021f
            r11.a(r6, r8, r9)
            r2 = 0
            goto L_0x0220
        L_0x021f:
            int r2 = -r15
        L_0x0220:
            boolean r2 = r11.b(r2)
            if (r2 == 0) goto L_0x0242
            byte[] r2 = r11.e
            int r3 = r11.f
            int r2 = defpackage.fm9.Q(r3, r2)
            int r3 = defpackage.oaf.a
            byte[] r3 = r11.e
            java.lang.Object r5 = r0.h
            wpa r5 = (defpackage.wpa) r5
            r5.E(r2, r3)
            long r2 = r0.f
            java.lang.Object r6 = r0.g
            b9b r6 = (defpackage.b9b) r6
            r6.g(r2, r5)
        L_0x0242:
            r2 = 178(0xb2, float:2.5E-43)
            if (r14 != r2) goto L_0x0254
            byte[] r2 = r1.a
            r3 = 2
            int r5 = r9 + 2
            byte r2 = r2[r5]
            r5 = 1
            if (r2 != r5) goto L_0x0256
            r11.d(r14)
            goto L_0x0256
        L_0x0254:
            r3 = 2
            r5 = 1
        L_0x0256:
            int r7 = r18 - r9
            long r9 = r0.c
            long r11 = (long) r7
            long r9 = r9 - r11
            java.lang.Object r2 = r0.k
            mh6 r2 = (defpackage.mh6) r2
            boolean r6 = r0.e
            r2.b(r7, r9, r6)
            java.lang.Object r2 = r0.k
            mh6 r2 = (defpackage.mh6) r2
            long r6 = r0.f
            r2.e = r14
            r9 = 0
            r2.d = r9
            r9 = 182(0xb6, float:2.55E-43)
            if (r14 == r9) goto L_0x027b
            r10 = 179(0xb3, float:2.51E-43)
            if (r14 != r10) goto L_0x0279
            goto L_0x027b
        L_0x0279:
            r10 = 0
            goto L_0x027c
        L_0x027b:
            r10 = r5
        L_0x027c:
            r2.b = r10
            if (r14 != r9) goto L_0x0282
            r9 = r5
            goto L_0x0283
        L_0x0282:
            r9 = 0
        L_0x0283:
            r2.c = r9
            r9 = 0
            r2.f = r9
            r2.h = r6
            r2 = r4
            r3 = r9
            r6 = r17
            r7 = r18
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh6.d(wpa):void");
    }

    public void e(boolean z) {
        fm9.l((mh6) this.k);
        if (z) {
            ((mh6) this.k).b(0, this.c, this.e);
            mh6 mh6 = (mh6) this.k;
            mh6.b = false;
            mh6.c = false;
            mh6.d = false;
            mh6.e = -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0278 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(defpackage.yaf r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = 2
            r4 = 3
            r5 = 1
            java.lang.Object r6 = r0.k
            mh6 r6 = (defpackage.mh6) r6
            defpackage.np8.g(r6)
            java.lang.Object r6 = r0.l
            xze r6 = (defpackage.xze) r6
            defpackage.np8.g(r6)
            int r6 = r1.b
            int r7 = r1.c
            byte[] r8 = r1.a
            long r9 = r0.c
            int r11 = r28.c()
            long r11 = (long) r11
            long r9 = r9 + r11
            r0.c = r9
            java.lang.Object r9 = r0.l
            xze r9 = (defpackage.xze) r9
            int r10 = r28.c()
            r9.c(r10, r1)
        L_0x0030:
            boolean[] r9 = r0.b
            int r9 = defpackage.np8.o(r8, r6, r7, r9)
            java.lang.Object r10 = r0.i
            lh6 r10 = (defpackage.lh6) r10
            java.lang.Object r11 = r0.j
            vl9 r11 = (defpackage.vl9) r11
            if (r9 != r7) goto L_0x0054
            boolean r1 = r0.e
            if (r1 != 0) goto L_0x0047
            r10.b(r6, r8, r7)
        L_0x0047:
            java.lang.Object r0 = r0.k
            mh6 r0 = (defpackage.mh6) r0
            r0.a(r6, r8, r7)
            if (r11 == 0) goto L_0x0053
            r11.a(r6, r8, r7)
        L_0x0053:
            return
        L_0x0054:
            byte[] r12 = r1.a
            int r13 = r9 + 3
            byte r12 = r12[r13]
            r14 = r12 & 255(0xff, float:3.57E-43)
            int r15 = r9 - r6
            boolean r3 = r0.e
            if (r3 != 0) goto L_0x01da
            if (r15 <= 0) goto L_0x0067
            r10.b(r6, r8, r9)
        L_0x0067:
            if (r15 >= 0) goto L_0x006b
            int r3 = -r15
            goto L_0x006c
        L_0x006b:
            r3 = 0
        L_0x006c:
            int r4 = r10.c
            if (r4 == 0) goto L_0x01c5
            r16 = r13
            r13 = 181(0xb5, float:2.54E-43)
            if (r4 == r5) goto L_0x01b5
            if (r4 == r2) goto L_0x01a3
            r2 = 4
            r5 = 3
            if (r4 == r5) goto L_0x018a
            if (r4 != r2) goto L_0x0184
            r4 = 179(0xb3, float:2.51E-43)
            if (r14 == r4) goto L_0x0089
            if (r14 != r13) goto L_0x0085
            goto L_0x0089
        L_0x0085:
            r19 = r7
            goto L_0x01d2
        L_0x0089:
            int r4 = r10.d
            int r4 = r4 - r3
            r10.d = r4
            r3 = 0
            r10.b = r3
            java.lang.Object r3 = r0.l
            xze r3 = (defpackage.xze) r3
            int r4 = r10.e
            java.lang.String r5 = r0.d
            r5.getClass()
            java.lang.Object r12 = r10.f
            byte[] r12 = (byte[]) r12
            int r10 = r10.d
            byte[] r10 = java.util.Arrays.copyOf(r12, r10)
            s02 r12 = new s02
            int r13 = r10.length
            r19 = r7
            r2 = 1
            r7 = 0
            r12.<init>((byte[]) r10, (int) r13, (int) r2, (byte) r7)
            r12.u(r4)
            r2 = 4
            r12.u(r2)
            r12.s()
            r4 = 8
            r12.t(r4)
            boolean r7 = r12.h()
            if (r7 == 0) goto L_0x00cc
            r12.t(r2)
            r7 = 3
            r12.t(r7)
        L_0x00cc:
            int r2 = r12.i(r2)
            r7 = 1065353216(0x3f800000, float:1.0)
            r13 = 15
            if (r2 != r13) goto L_0x00e6
            int r2 = r12.i(r4)
            int r4 = r12.i(r4)
            if (r4 != 0) goto L_0x00e1
            goto L_0x00ed
        L_0x00e1:
            float r2 = (float) r2
            float r4 = (float) r4
            float r7 = r2 / r4
            goto L_0x00ed
        L_0x00e6:
            r4 = 7
            if (r2 >= r4) goto L_0x00ed
            float[] r4 = m
            r7 = r4[r2]
        L_0x00ed:
            boolean r2 = r12.h()
            if (r2 == 0) goto L_0x0125
            r2 = 2
            r12.t(r2)
            r2 = 1
            r12.t(r2)
            boolean r2 = r12.h()
            if (r2 == 0) goto L_0x0125
            r12.t(r13)
            r12.s()
            r12.t(r13)
            r12.s()
            r12.t(r13)
            r12.s()
            r2 = 3
            r12.t(r2)
            r2 = 11
            r12.t(r2)
            r12.s()
            r12.t(r13)
            r12.s()
        L_0x0125:
            r2 = 2
            r12.i(r2)
            r12.s()
            r2 = 16
            int r2 = r12.i(r2)
            r12.s()
            boolean r4 = r12.h()
            if (r4 == 0) goto L_0x014a
            if (r2 != 0) goto L_0x013e
            goto L_0x014a
        L_0x013e:
            int r2 = r2 + -1
            r4 = 0
        L_0x0141:
            if (r2 <= 0) goto L_0x0147
            r13 = 1
            int r4 = r4 + r13
            int r2 = r2 >> r13
            goto L_0x0141
        L_0x0147:
            r12.t(r4)
        L_0x014a:
            r12.s()
            r2 = 13
            int r4 = r12.i(r2)
            r12.s()
            int r2 = r12.i(r2)
            r12.s()
            r12.s()
            my5 r12 = new my5
            r12.<init>()
            r12.a = r5
            java.lang.String r5 = "video/mp4v-es"
            r12.k = r5
            r12.p = r4
            r12.q = r2
            r12.t = r7
            java.util.List r2 = java.util.Collections.singletonList(r10)
            r12.m = r2
            oy5 r2 = new oy5
            r2.<init>(r12)
            r3.d(r2)
            r2 = 1
            r0.e = r2
        L_0x0182:
            r3 = 3
            goto L_0x01df
        L_0x0184:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x018a:
            r19 = r7
            r2 = r12 & 240(0xf0, float:3.36E-43)
            r3 = 32
            if (r2 == r3) goto L_0x019a
            r2 = 0
            r10.b = r2
            r10.d = r2
            r10.c = r2
            goto L_0x01d2
        L_0x019a:
            r2 = 0
            int r3 = r10.d
            r10.e = r3
            r3 = 4
            r10.c = r3
            goto L_0x01d2
        L_0x01a3:
            r19 = r7
            r2 = 0
            r3 = 31
            if (r14 <= r3) goto L_0x01b1
            r10.b = r2
            r10.d = r2
            r10.c = r2
            goto L_0x01d2
        L_0x01b1:
            r3 = 3
            r10.c = r3
            goto L_0x01d2
        L_0x01b5:
            r19 = r7
            r2 = 0
            if (r14 == r13) goto L_0x01c1
            r10.b = r2
            r10.d = r2
            r10.c = r2
            goto L_0x01d2
        L_0x01c1:
            r2 = 2
            r10.c = r2
            goto L_0x01d2
        L_0x01c5:
            r19 = r7
            r16 = r13
            r2 = 176(0xb0, float:2.47E-43)
            if (r14 != r2) goto L_0x01d2
            r2 = 1
            r10.c = r2
            r10.b = r2
        L_0x01d2:
            byte[] r2 = defpackage.lh6.g
            r3 = 3
            r4 = 0
            r10.b(r4, r2, r3)
            goto L_0x01df
        L_0x01da:
            r19 = r7
            r16 = r13
            goto L_0x0182
        L_0x01df:
            java.lang.Object r2 = r0.k
            mh6 r2 = (defpackage.mh6) r2
            r2.a(r6, r8, r9)
            if (r11 == 0) goto L_0x0224
            if (r15 <= 0) goto L_0x01ef
            r11.a(r6, r8, r9)
            r2 = 0
            goto L_0x01f0
        L_0x01ef:
            int r2 = -r15
        L_0x01f0:
            boolean r2 = r11.b(r2)
            if (r2 == 0) goto L_0x0212
            byte[] r2 = r11.e
            int r4 = r11.f
            int r2 = defpackage.np8.O(r4, r2)
            int r4 = defpackage.maf.a
            byte[] r4 = r11.e
            java.lang.Object r5 = r0.h
            yaf r5 = (defpackage.yaf) r5
            r5.F(r2, r4)
            long r6 = r0.f
            java.lang.Object r2 = r0.g
            djb r2 = (defpackage.djb) r2
            r2.e(r6, r5)
        L_0x0212:
            r2 = 178(0xb2, float:2.5E-43)
            if (r14 != r2) goto L_0x0224
            byte[] r2 = r1.a
            r4 = 2
            int r5 = r9 + 2
            byte r2 = r2[r5]
            r5 = 1
            if (r2 != r5) goto L_0x0226
            r11.d(r14)
            goto L_0x0226
        L_0x0224:
            r4 = 2
            r5 = 1
        L_0x0226:
            int r2 = r19 - r9
            long r6 = r0.c
            long r9 = (long) r2
            long r6 = r6 - r9
            java.lang.Object r9 = r0.k
            mh6 r9 = (defpackage.mh6) r9
            boolean r10 = r0.e
            int r11 = r9.e
            r12 = 182(0xb6, float:2.55E-43)
            if (r11 != r12) goto L_0x0263
            if (r10 == 0) goto L_0x0263
            boolean r10 = r9.b
            if (r10 == 0) goto L_0x0263
            long r10 = r9.h
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r13 == 0) goto L_0x0263
            long r3 = r9.g
            long r3 = r6 - r3
            int r3 = (int) r3
            boolean r4 = r9.d
            java.lang.Object r13 = r9.i
            r20 = r13
            xze r20 = (defpackage.xze) r20
            r26 = 0
            r21 = r10
            r23 = r4
            r24 = r3
            r25 = r2
            r20.b(r21, r23, r24, r25, r26)
        L_0x0263:
            int r2 = r9.e
            r3 = 179(0xb3, float:2.51E-43)
            if (r2 == r3) goto L_0x026b
            r9.g = r6
        L_0x026b:
            java.lang.Object r2 = r0.k
            mh6 r2 = (defpackage.mh6) r2
            long r6 = r0.f
            r2.e = r14
            r4 = 0
            r2.d = r4
            if (r14 == r12) goto L_0x027d
            if (r14 != r3) goto L_0x027b
            goto L_0x027d
        L_0x027b:
            r3 = 0
            goto L_0x027e
        L_0x027d:
            r3 = r5
        L_0x027e:
            r2.b = r3
            if (r14 != r12) goto L_0x0284
            r3 = r5
            goto L_0x0285
        L_0x0284:
            r3 = 0
        L_0x0285:
            r2.c = r3
            r3 = 0
            r2.f = r3
            r2.h = r6
            r6 = r16
            r7 = r19
            r2 = 2
            r4 = 3
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh6.f(yaf):void");
    }

    public final void g(int i2, long j2) {
        switch (this.a) {
            case 0:
                if (j2 != -9223372036854775807L) {
                    this.f = j2;
                    return;
                }
                return;
            default:
                this.f = j2;
                return;
        }
    }

    public void h() {
    }

    public void i(pa5 pa5, l3f l3f) {
        l3f.a();
        l3f.b();
        this.d = l3f.f;
        l3f.b();
        yze B = pa5.B(l3f.e, 2);
        this.l = B;
        this.k = new mh6(1, B);
        b9b b9b = (b9b) this.g;
        if (b9b != null) {
            b9b.h(pa5, l3f);
        }
    }

    public void j(oa5 oa5, l3f l3f) {
        l3f.a();
        l3f.b();
        this.d = l3f.f;
        l3f.b();
        xze B = oa5.B(l3f.e, 2);
        this.l = B;
        this.k = new mh6(0, B);
        djb djb = (djb) this.g;
        if (djb != null) {
            djb.f(oa5, l3f);
        }
    }

    public nh6(b9b b9b) {
        this.g = b9b;
        this.b = new boolean[4];
        lh6 lh6 = new lh6(1);
        lh6.f = new byte[128];
        this.i = lh6;
        this.f = -9223372036854775807L;
        this.j = new vl9(178, 1);
        this.h = new wpa();
    }
}
