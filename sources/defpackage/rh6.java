package defpackage;

/* renamed from: rh6  reason: default package */
public final class rh6 implements cw4, dw4 {
    public final /* synthetic */ int a = 1;
    public final boolean b;
    public final boolean c;
    public long d;
    public final boolean[] e;
    public String f;
    public boolean g;
    public long h;
    public boolean i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public Object n;
    public Object o;
    public final Object p;

    public rh6(aab aab, boolean z, boolean z2) {
        this.j = aab;
        this.b = z;
        this.c = z2;
        this.e = new boolean[3];
        this.k = new vl9(7, 1);
        this.l = new vl9(8, 1);
        this.m = new vl9(6, 1);
        this.h = -9223372036854775807L;
        this.p = new wpa();
    }

    public final void a() {
        switch (this.a) {
            case 0:
                this.d = 0;
                this.i = false;
                this.h = -9223372036854775807L;
                np8.i(this.e);
                ((vl9) this.k).c();
                ((vl9) this.l).c();
                ((vl9) this.m).c();
                ph6 ph6 = (ph6) this.o;
                if (ph6 != null) {
                    ph6.k = false;
                    ph6.o = false;
                    oh6 oh6 = ph6.n;
                    oh6.b = false;
                    oh6.a = false;
                    return;
                }
                return;
            default:
                this.d = 0;
                this.i = false;
                this.h = -9223372036854775807L;
                fm9.n(this.e);
                ((vl9) this.k).c();
                ((vl9) this.l).c();
                ((vl9) this.m).c();
                qh6 qh6 = (qh6) this.o;
                if (qh6 != null) {
                    qh6.k = false;
                    qh6.o = false;
                    oh6 oh62 = qh6.n;
                    oh62.b = false;
                    oh62.a = false;
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r18, byte[] r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r0.a
            switch(r4) {
                case 0: goto L_0x019f;
                default: goto L_0x000d;
            }
        L_0x000d:
            boolean r4 = r0.g
            if (r4 == 0) goto L_0x0019
            java.lang.Object r4 = r0.o
            qh6 r4 = (defpackage.qh6) r4
            boolean r4 = r4.c
            if (r4 == 0) goto L_0x0027
        L_0x0019:
            java.lang.Object r4 = r0.k
            vl9 r4 = (defpackage.vl9) r4
            r4.a(r1, r2, r3)
            java.lang.Object r4 = r0.l
            vl9 r4 = (defpackage.vl9) r4
            r4.a(r1, r2, r3)
        L_0x0027:
            java.lang.Object r4 = r0.m
            vl9 r4 = (defpackage.vl9) r4
            r4.a(r1, r2, r3)
            java.lang.Object r0 = r0.o
            qh6 r0 = (defpackage.qh6) r0
            boolean r4 = r0.k
            if (r4 != 0) goto L_0x0038
            goto L_0x019e
        L_0x0038:
            int r3 = r3 - r1
            byte[] r4 = r0.g
            int r5 = r4.length
            int r6 = r0.h
            int r6 = r6 + r3
            r7 = 2
            if (r5 >= r6) goto L_0x0049
            int r6 = r6 * r7
            byte[] r4 = java.util.Arrays.copyOf(r4, r6)
            r0.g = r4
        L_0x0049:
            byte[] r4 = r0.g
            int r5 = r0.h
            java.lang.System.arraycopy(r2, r1, r4, r5, r3)
            int r1 = r0.h
            int r1 = r1 + r3
            r0.h = r1
            byte[] r2 = r0.g
            s02 r3 = r0.f
            r3.b = r2
            r2 = 0
            r3.d = r2
            r3.c = r1
            r3.e = r2
            r3.a()
            r1 = 8
            boolean r1 = r3.d(r1)
            if (r1 != 0) goto L_0x006f
            goto L_0x019e
        L_0x006f:
            r3.s()
            int r1 = r3.i(r7)
            r4 = 5
            r3.t(r4)
            boolean r5 = r3.e()
            if (r5 != 0) goto L_0x0082
            goto L_0x019e
        L_0x0082:
            r3.m()
            boolean r5 = r3.e()
            if (r5 != 0) goto L_0x008d
            goto L_0x019e
        L_0x008d:
            int r5 = r3.m()
            boolean r6 = r0.c
            r8 = 1
            if (r6 != 0) goto L_0x00a0
            r0.k = r2
            oh6 r0 = r0.n
            r0.d = r5
            r0.b = r8
            goto L_0x019e
        L_0x00a0:
            boolean r6 = r3.e()
            if (r6 != 0) goto L_0x00a8
            goto L_0x019e
        L_0x00a8:
            int r6 = r3.m()
            android.util.SparseArray r9 = r0.e
            int r10 = r9.indexOfKey(r6)
            if (r10 >= 0) goto L_0x00b8
            r0.k = r2
            goto L_0x019e
        L_0x00b8:
            java.lang.Object r9 = r9.get(r6)
            zl9 r9 = (defpackage.zl9) r9
            android.util.SparseArray r10 = r0.d
            int r11 = r9.a
            java.lang.Object r10 = r10.get(r11)
            bm9 r10 = (defpackage.bm9) r10
            boolean r11 = r10.j
            if (r11 == 0) goto L_0x00d7
            boolean r11 = r3.d(r7)
            if (r11 != 0) goto L_0x00d4
            goto L_0x019e
        L_0x00d4:
            r3.t(r7)
        L_0x00d7:
            int r7 = r10.l
            boolean r11 = r3.d(r7)
            if (r11 != 0) goto L_0x00e1
            goto L_0x019e
        L_0x00e1:
            int r7 = r3.i(r7)
            boolean r11 = r10.k
            if (r11 != 0) goto L_0x0108
            boolean r11 = r3.d(r8)
            if (r11 != 0) goto L_0x00f1
            goto L_0x019e
        L_0x00f1:
            boolean r11 = r3.h()
            if (r11 == 0) goto L_0x0105
            boolean r12 = r3.d(r8)
            if (r12 != 0) goto L_0x00ff
            goto L_0x019e
        L_0x00ff:
            boolean r12 = r3.h()
            r13 = r8
            goto L_0x010b
        L_0x0105:
            r12 = r2
        L_0x0106:
            r13 = r12
            goto L_0x010b
        L_0x0108:
            r11 = r2
            r12 = r11
            goto L_0x0106
        L_0x010b:
            int r14 = r0.i
            if (r14 != r4) goto L_0x0111
            r4 = r8
            goto L_0x0112
        L_0x0111:
            r4 = r2
        L_0x0112:
            if (r4 == 0) goto L_0x0121
            boolean r14 = r3.e()
            if (r14 != 0) goto L_0x011c
            goto L_0x019e
        L_0x011c:
            int r14 = r3.m()
            goto L_0x0122
        L_0x0121:
            r14 = r2
        L_0x0122:
            boolean r9 = r9.b
            int r15 = r10.m
            if (r15 != 0) goto L_0x014b
            int r15 = r10.n
            boolean r16 = r3.d(r15)
            if (r16 != 0) goto L_0x0132
            goto L_0x019e
        L_0x0132:
            int r15 = r3.i(r15)
            if (r9 == 0) goto L_0x0148
            if (r11 != 0) goto L_0x0148
            boolean r9 = r3.e()
            if (r9 != 0) goto L_0x0142
            goto L_0x019e
        L_0x0142:
            int r3 = r3.n()
            r9 = r2
            goto L_0x0178
        L_0x0148:
            r3 = r2
            r9 = r3
            goto L_0x0178
        L_0x014b:
            if (r15 != r8) goto L_0x0175
            boolean r15 = r10.o
            if (r15 != 0) goto L_0x0175
            boolean r15 = r3.e()
            if (r15 != 0) goto L_0x0158
            goto L_0x019e
        L_0x0158:
            int r15 = r3.n()
            if (r9 == 0) goto L_0x0170
            if (r11 != 0) goto L_0x0170
            boolean r9 = r3.e()
            if (r9 != 0) goto L_0x0167
            goto L_0x019e
        L_0x0167:
            int r3 = r3.n()
            r9 = r3
            r3 = r2
            r2 = r15
            r15 = r3
            goto L_0x0178
        L_0x0170:
            r3 = r2
            r9 = r3
            r2 = r15
        L_0x0173:
            r15 = r9
            goto L_0x0178
        L_0x0175:
            r3 = r2
            r9 = r3
            goto L_0x0173
        L_0x0178:
            oh6 r8 = r0.n
            r8.p = r10
            r8.c = r1
            r8.d = r5
            r8.e = r7
            r8.f = r6
            r8.g = r11
            r8.h = r13
            r8.i = r12
            r8.j = r4
            r8.k = r14
            r8.l = r15
            r8.m = r3
            r8.n = r2
            r8.o = r9
            r1 = 1
            r8.a = r1
            r8.b = r1
            r1 = 0
            r0.k = r1
        L_0x019e:
            return
        L_0x019f:
            boolean r4 = r0.g
            if (r4 == 0) goto L_0x01ab
            java.lang.Object r4 = r0.o
            ph6 r4 = (defpackage.ph6) r4
            boolean r4 = r4.c
            if (r4 == 0) goto L_0x01b9
        L_0x01ab:
            java.lang.Object r4 = r0.k
            vl9 r4 = (defpackage.vl9) r4
            r4.a(r1, r2, r3)
            java.lang.Object r4 = r0.l
            vl9 r4 = (defpackage.vl9) r4
            r4.a(r1, r2, r3)
        L_0x01b9:
            java.lang.Object r4 = r0.m
            vl9 r4 = (defpackage.vl9) r4
            r4.a(r1, r2, r3)
            java.lang.Object r0 = r0.o
            ph6 r0 = (defpackage.ph6) r0
            boolean r4 = r0.k
            if (r4 != 0) goto L_0x01ca
            goto L_0x0330
        L_0x01ca:
            int r3 = r3 - r1
            byte[] r4 = r0.g
            int r5 = r4.length
            int r6 = r0.h
            int r6 = r6 + r3
            r7 = 2
            if (r5 >= r6) goto L_0x01db
            int r6 = r6 * r7
            byte[] r4 = java.util.Arrays.copyOf(r4, r6)
            r0.g = r4
        L_0x01db:
            byte[] r4 = r0.g
            int r5 = r0.h
            java.lang.System.arraycopy(r2, r1, r4, r5, r3)
            int r1 = r0.h
            int r1 = r1 + r3
            r0.h = r1
            byte[] r2 = r0.g
            s02 r3 = r0.f
            r3.b = r2
            r2 = 0
            r3.d = r2
            r3.c = r1
            r3.e = r2
            r3.a()
            r1 = 8
            boolean r1 = r3.d(r1)
            if (r1 != 0) goto L_0x0201
            goto L_0x0330
        L_0x0201:
            r3.s()
            int r1 = r3.i(r7)
            r4 = 5
            r3.t(r4)
            boolean r5 = r3.e()
            if (r5 != 0) goto L_0x0214
            goto L_0x0330
        L_0x0214:
            r3.m()
            boolean r5 = r3.e()
            if (r5 != 0) goto L_0x021f
            goto L_0x0330
        L_0x021f:
            int r5 = r3.m()
            boolean r6 = r0.c
            r8 = 1
            if (r6 != 0) goto L_0x0232
            r0.k = r2
            oh6 r0 = r0.n
            r0.d = r5
            r0.b = r8
            goto L_0x0330
        L_0x0232:
            boolean r6 = r3.e()
            if (r6 != 0) goto L_0x023a
            goto L_0x0330
        L_0x023a:
            int r6 = r3.m()
            android.util.SparseArray r9 = r0.e
            int r10 = r9.indexOfKey(r6)
            if (r10 >= 0) goto L_0x024a
            r0.k = r2
            goto L_0x0330
        L_0x024a:
            java.lang.Object r9 = r9.get(r6)
            yl9 r9 = (defpackage.yl9) r9
            android.util.SparseArray r10 = r0.d
            int r11 = r9.a
            java.lang.Object r10 = r10.get(r11)
            am9 r10 = (defpackage.am9) r10
            boolean r11 = r10.h
            if (r11 == 0) goto L_0x0269
            boolean r11 = r3.d(r7)
            if (r11 != 0) goto L_0x0266
            goto L_0x0330
        L_0x0266:
            r3.t(r7)
        L_0x0269:
            int r7 = r10.j
            boolean r11 = r3.d(r7)
            if (r11 != 0) goto L_0x0273
            goto L_0x0330
        L_0x0273:
            int r7 = r3.i(r7)
            boolean r11 = r10.i
            if (r11 != 0) goto L_0x029a
            boolean r11 = r3.d(r8)
            if (r11 != 0) goto L_0x0283
            goto L_0x0330
        L_0x0283:
            boolean r11 = r3.h()
            if (r11 == 0) goto L_0x0297
            boolean r12 = r3.d(r8)
            if (r12 != 0) goto L_0x0291
            goto L_0x0330
        L_0x0291:
            boolean r12 = r3.h()
            r13 = r8
            goto L_0x029d
        L_0x0297:
            r12 = r2
        L_0x0298:
            r13 = r12
            goto L_0x029d
        L_0x029a:
            r11 = r2
            r12 = r11
            goto L_0x0298
        L_0x029d:
            int r14 = r0.i
            if (r14 != r4) goto L_0x02a3
            r4 = r8
            goto L_0x02a4
        L_0x02a3:
            r4 = r2
        L_0x02a4:
            if (r4 == 0) goto L_0x02b3
            boolean r14 = r3.e()
            if (r14 != 0) goto L_0x02ae
            goto L_0x0330
        L_0x02ae:
            int r14 = r3.m()
            goto L_0x02b4
        L_0x02b3:
            r14 = r2
        L_0x02b4:
            boolean r9 = r9.b
            int r15 = r10.k
            if (r15 != 0) goto L_0x02dd
            int r15 = r10.l
            boolean r16 = r3.d(r15)
            if (r16 != 0) goto L_0x02c4
            goto L_0x0330
        L_0x02c4:
            int r15 = r3.i(r15)
            if (r9 == 0) goto L_0x02da
            if (r11 != 0) goto L_0x02da
            boolean r9 = r3.e()
            if (r9 != 0) goto L_0x02d4
            goto L_0x0330
        L_0x02d4:
            int r3 = r3.n()
            r9 = r2
            goto L_0x030a
        L_0x02da:
            r3 = r2
            r9 = r3
            goto L_0x030a
        L_0x02dd:
            if (r15 != r8) goto L_0x0307
            boolean r15 = r10.m
            if (r15 != 0) goto L_0x0307
            boolean r15 = r3.e()
            if (r15 != 0) goto L_0x02ea
            goto L_0x0330
        L_0x02ea:
            int r15 = r3.n()
            if (r9 == 0) goto L_0x0302
            if (r11 != 0) goto L_0x0302
            boolean r9 = r3.e()
            if (r9 != 0) goto L_0x02f9
            goto L_0x0330
        L_0x02f9:
            int r3 = r3.n()
            r9 = r3
            r3 = r2
            r2 = r15
            r15 = r3
            goto L_0x030a
        L_0x0302:
            r3 = r2
            r9 = r3
            r2 = r15
        L_0x0305:
            r15 = r9
            goto L_0x030a
        L_0x0307:
            r3 = r2
            r9 = r3
            goto L_0x0305
        L_0x030a:
            oh6 r8 = r0.n
            r8.p = r10
            r8.c = r1
            r8.d = r5
            r8.e = r7
            r8.f = r6
            r8.g = r11
            r8.h = r13
            r8.i = r12
            r8.j = r4
            r8.k = r14
            r8.l = r15
            r8.m = r3
            r8.n = r2
            r8.o = r9
            r1 = 1
            r8.a = r1
            r8.b = r1
            r1 = 0
            r0.k = r1
        L_0x0330:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh6.b(int, byte[], int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x025a, code lost:
        if (r6.m != r7.m) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x026b, code lost:
        if (r6.o != r7.o) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0279, code lost:
        if (r6.k != r7.k) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02f5, code lost:
        if (r6 != 1) goto L_0x02f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(defpackage.wpa r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = 3
            java.lang.Object r4 = r0.n
            yze r4 = (defpackage.yze) r4
            defpackage.fm9.l(r4)
            int r4 = defpackage.oaf.a
            int r4 = r1.b
            int r5 = r1.c
            byte[] r6 = r1.a
            long r7 = r0.d
            int r9 = r31.a()
            long r9 = (long) r9
            long r7 = r7 + r9
            r0.d = r7
            java.lang.Object r7 = r0.n
            yze r7 = (defpackage.yze) r7
            int r8 = r31.a()
            r9 = 0
            r7.b(r1, r8, r9)
        L_0x002a:
            boolean[] r1 = r0.e
            int r1 = defpackage.fm9.y(r6, r4, r5, r1)
            if (r1 != r5) goto L_0x0036
            r0.b(r4, r6, r5)
            return
        L_0x0036:
            int r7 = r1 + 3
            byte r8 = r6[r7]
            r8 = r8 & 31
            int r10 = r1 - r4
            if (r10 <= 0) goto L_0x0043
            r0.b(r4, r6, r1)
        L_0x0043:
            int r1 = r5 - r1
            long r11 = r0.d
            long r13 = (long) r1
            long r11 = r11 - r13
            if (r10 >= 0) goto L_0x004d
            int r4 = -r10
            goto L_0x004e
        L_0x004d:
            r4 = r9
        L_0x004e:
            long r13 = r0.h
            boolean r10 = r0.g
            java.lang.Object r15 = r0.l
            vl9 r15 = (defpackage.vl9) r15
            java.lang.Object r9 = r0.k
            vl9 r9 = (defpackage.vl9) r9
            if (r10 == 0) goto L_0x0074
            java.lang.Object r10 = r0.o
            qh6 r10 = (defpackage.qh6) r10
            boolean r10 = r10.c
            if (r10 == 0) goto L_0x0065
            goto L_0x0074
        L_0x0065:
            r20 = r1
            r3 = r2
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r28 = r11
            goto L_0x01c4
        L_0x0074:
            r9.b(r4)
            r15.b(r4)
            boolean r10 = r0.g
            if (r10 != 0) goto L_0x016d
            boolean r10 = r9.d
            if (r10 == 0) goto L_0x015f
            boolean r10 = r15.d
            if (r10 == 0) goto L_0x015f
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            byte[] r3 = r9.e
            int r2 = r9.f
            byte[] r2 = java.util.Arrays.copyOf(r3, r2)
            r10.add(r2)
            byte[] r2 = r15.e
            int r3 = r15.f
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
            r10.add(r2)
            byte[] r2 = r9.e
            int r3 = r9.f
            r16 = r5
            r5 = 3
            bm9 r2 = defpackage.fm9.K(r5, r2, r3)
            byte[] r3 = r15.e
            int r5 = r15.f
            r17 = r6
            s02 r6 = new s02
            r18 = r7
            r7 = 4
            r6.<init>((int) r7, (int) r5, (int) r7, (byte[]) r3)
            int r3 = r6.m()
            int r5 = r6.m()
            r6.s()
            boolean r6 = r6.h()
            zl9 r7 = new zl9
            r7.<init>(r3, r5, r6)
            int r5 = r2.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r2.b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r19 = r8
            int r8 = r2.c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r8}
            java.lang.String r6 = "avc1.%02X%02X%02X"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.Object r6 = r0.n
            yze r6 = (defpackage.yze) r6
            ny5 r8 = new ny5
            r8.<init>()
            r20 = r1
            java.lang.String r1 = r0.f
            r8.a = r1
            java.lang.String r1 = "video/avc"
            java.lang.String r1 = defpackage.ia9.l(r1)
            r8.m = r1
            r8.i = r5
            int r1 = r2.e
            r8.s = r1
            int r1 = r2.f
            r8.t = r1
            int r1 = r2.h
            int r25 = r1 + 8
            int r1 = r2.i
            int r26 = r1 + 8
            i63 r1 = new i63
            int r5 = r2.p
            r28 = r11
            int r11 = r2.q
            int r12 = r2.r
            r27 = 0
            r21 = r1
            r22 = r5
            r23 = r11
            r24 = r12
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r8.z = r1
            float r1 = r2.g
            r8.w = r1
            r8.p = r10
            int r1 = r2.s
            r8.o = r1
            qy5 r1 = new qy5
            r1.<init>(r8)
            r6.e(r1)
            r1 = 1
            r0.g = r1
            java.lang.Object r1 = r0.o
            qh6 r1 = (defpackage.qh6) r1
            android.util.SparseArray r1 = r1.d
            int r5 = r2.d
            r1.append(r5, r2)
            java.lang.Object r1 = r0.o
            qh6 r1 = (defpackage.qh6) r1
            android.util.SparseArray r1 = r1.e
            r1.append(r3, r7)
            r9.c()
            r15.c()
            r3 = 3
            goto L_0x01c4
        L_0x015f:
            r20 = r1
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r28 = r11
            r3 = r2
            goto L_0x01c4
        L_0x016d:
            r20 = r1
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r28 = r11
            boolean r1 = r9.d
            if (r1 == 0) goto L_0x0195
            byte[] r1 = r9.e
            int r2 = r9.f
            r3 = 3
            bm9 r1 = defpackage.fm9.K(r3, r1, r2)
            java.lang.Object r2 = r0.o
            qh6 r2 = (defpackage.qh6) r2
            android.util.SparseArray r2 = r2.d
            int r5 = r1.d
            r2.append(r5, r1)
            r9.c()
            goto L_0x01c4
        L_0x0195:
            r3 = 3
            boolean r1 = r15.d
            if (r1 == 0) goto L_0x01c4
            byte[] r1 = r15.e
            int r2 = r15.f
            s02 r5 = new s02
            r6 = 4
            r5.<init>((int) r6, (int) r2, (int) r6, (byte[]) r1)
            int r1 = r5.m()
            int r2 = r5.m()
            r5.s()
            boolean r5 = r5.h()
            zl9 r6 = new zl9
            r6.<init>(r1, r2, r5)
            java.lang.Object r2 = r0.o
            qh6 r2 = (defpackage.qh6) r2
            android.util.SparseArray r2 = r2.e
            r2.append(r1, r6)
            r15.c()
        L_0x01c4:
            java.lang.Object r1 = r0.m
            vl9 r1 = (defpackage.vl9) r1
            boolean r2 = r1.b(r4)
            if (r2 == 0) goto L_0x01ef
            byte[] r2 = r1.e
            int r4 = r1.f
            int r2 = defpackage.fm9.Q(r4, r2)
            byte[] r4 = r1.e
            java.lang.Object r5 = r0.p
            wpa r5 = (defpackage.wpa) r5
            r5.E(r2, r4)
            r2 = 4
            r5.G(r2)
            java.lang.Object r4 = r0.j
            aab r4 = (defpackage.aab) r4
            java.lang.Object r4 = r4.b
            yze[] r4 = (defpackage.yze[]) r4
            defpackage.z04.q(r13, r5, r4)
            goto L_0x01f0
        L_0x01ef:
            r2 = 4
        L_0x01f0:
            java.lang.Object r4 = r0.o
            qh6 r4 = (defpackage.qh6) r4
            boolean r5 = r0.g
            int r6 = r4.i
            r7 = 9
            if (r6 == r7) goto L_0x027e
            boolean r6 = r4.c
            if (r6 == 0) goto L_0x027c
            oh6 r6 = r4.n
            oh6 r7 = r4.m
            boolean r8 = r6.a
            if (r8 != 0) goto L_0x020a
            goto L_0x027c
        L_0x020a:
            boolean r8 = r7.a
            if (r8 != 0) goto L_0x0210
            goto L_0x027e
        L_0x0210:
            java.lang.Object r8 = r6.p
            bm9 r8 = (defpackage.bm9) r8
            defpackage.fm9.l(r8)
            java.lang.Object r10 = r7.p
            bm9 r10 = (defpackage.bm9) r10
            defpackage.fm9.l(r10)
            int r11 = r6.e
            int r12 = r7.e
            if (r11 != r12) goto L_0x027e
            int r11 = r6.f
            int r12 = r7.f
            if (r11 != r12) goto L_0x027e
            boolean r11 = r6.g
            boolean r12 = r7.g
            if (r11 != r12) goto L_0x027e
            boolean r11 = r6.h
            if (r11 == 0) goto L_0x023e
            boolean r11 = r7.h
            if (r11 == 0) goto L_0x023e
            boolean r11 = r6.i
            boolean r12 = r7.i
            if (r11 != r12) goto L_0x027e
        L_0x023e:
            int r11 = r6.c
            int r12 = r7.c
            if (r11 == r12) goto L_0x0248
            if (r11 == 0) goto L_0x027e
            if (r12 == 0) goto L_0x027e
        L_0x0248:
            int r10 = r10.m
            int r8 = r8.m
            if (r8 != 0) goto L_0x025c
            if (r10 != 0) goto L_0x025c
            int r11 = r6.l
            int r12 = r7.l
            if (r11 != r12) goto L_0x027e
            int r11 = r6.m
            int r12 = r7.m
            if (r11 != r12) goto L_0x027e
        L_0x025c:
            r11 = 1
            if (r8 != r11) goto L_0x026d
            if (r10 != r11) goto L_0x026d
            int r8 = r6.n
            int r10 = r7.n
            if (r8 != r10) goto L_0x027e
            int r8 = r6.o
            int r10 = r7.o
            if (r8 != r10) goto L_0x027e
        L_0x026d:
            boolean r8 = r6.j
            boolean r10 = r7.j
            if (r8 != r10) goto L_0x027e
            if (r8 == 0) goto L_0x027c
            int r6 = r6.k
            int r7 = r7.k
            if (r6 == r7) goto L_0x027c
            goto L_0x027e
        L_0x027c:
            r5 = 0
            goto L_0x02ba
        L_0x027e:
            if (r5 == 0) goto L_0x02ac
            boolean r5 = r4.o
            if (r5 == 0) goto L_0x02ac
            long r5 = r4.j
            long r11 = r28 - r5
            int r7 = (int) r11
            int r26 = r20 + r7
            long r7 = r4.q
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x0297
            goto L_0x02ac
        L_0x0297:
            boolean r10 = r4.r
            long r11 = r4.p
            long r5 = r5 - r11
            int r5 = (int) r5
            yze r6 = r4.a
            r27 = 0
            r21 = r6
            r22 = r7
            r24 = r10
            r25 = r5
            r21.a(r22, r24, r25, r26, r27)
        L_0x02ac:
            long r5 = r4.j
            r4.p = r5
            long r5 = r4.l
            r4.q = r5
            r5 = 0
            r4.r = r5
            r6 = 1
            r4.o = r6
        L_0x02ba:
            r4.a()
            boolean r4 = r4.r
            if (r4 == 0) goto L_0x02c3
            r0.i = r5
        L_0x02c3:
            long r4 = r0.h
            boolean r6 = r0.g
            if (r6 == 0) goto L_0x02d1
            java.lang.Object r6 = r0.o
            qh6 r6 = (defpackage.qh6) r6
            boolean r6 = r6.c
            if (r6 == 0) goto L_0x02d4
        L_0x02d1:
            r6 = r19
            goto L_0x02d7
        L_0x02d4:
            r6 = r19
            goto L_0x02dd
        L_0x02d7:
            r9.d(r6)
            r15.d(r6)
        L_0x02dd:
            r1.d(r6)
            java.lang.Object r1 = r0.o
            qh6 r1 = (defpackage.qh6) r1
            boolean r7 = r0.i
            r1.i = r6
            r1.l = r4
            r11 = r28
            r1.j = r11
            r1.s = r7
            boolean r4 = r1.b
            if (r4 == 0) goto L_0x02f8
            r4 = 1
            if (r6 == r4) goto L_0x0308
            goto L_0x02f9
        L_0x02f8:
            r4 = 1
        L_0x02f9:
            boolean r5 = r1.c
            if (r5 == 0) goto L_0x0306
            r5 = 5
            if (r6 == r5) goto L_0x0308
            if (r6 == r4) goto L_0x0308
            r4 = 2
            if (r6 != r4) goto L_0x0306
            goto L_0x0308
        L_0x0306:
            r5 = 0
            goto L_0x031a
        L_0x0308:
            oh6 r4 = r1.m
            oh6 r5 = r1.n
            r1.m = r5
            r1.n = r4
            r5 = 0
            r4.b = r5
            r4.a = r5
            r1.h = r5
            r4 = 1
            r1.k = r4
        L_0x031a:
            r2 = r3
            r9 = r5
            r5 = r16
            r6 = r17
            r4 = r18
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh6.d(wpa):void");
    }

    public void e(boolean z) {
        fm9.l((yze) this.n);
        int i2 = oaf.a;
        if (z) {
            qh6 qh6 = (qh6) this.o;
            long j2 = this.d;
            qh6.a();
            qh6.j = j2;
            long j3 = qh6.q;
            if (j3 != -9223372036854775807L) {
                boolean z2 = qh6.r;
                qh6.a.a(j3, z2 ? 1 : 0, (int) (j2 - qh6.p), 0, (wze) null);
            }
            qh6.o = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02d6, code lost:
        if (r2 != 1) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x021f, code lost:
        if (r7.m != r8.m) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0230, code lost:
        if (r7.o != r8.o) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x023e, code lost:
        if (r7.k != r8.k) goto L_0x0240;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02de A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02f6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0299 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(defpackage.yaf r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = 3
            java.lang.Object r3 = r0.n
            xze r3 = (defpackage.xze) r3
            defpackage.np8.g(r3)
            int r3 = defpackage.maf.a
            int r3 = r1.b
            int r4 = r1.c
            byte[] r5 = r1.a
            long r6 = r0.d
            int r8 = r29.c()
            long r8 = (long) r8
            long r6 = r6 + r8
            r0.d = r6
            java.lang.Object r6 = r0.n
            xze r6 = (defpackage.xze) r6
            int r7 = r29.c()
            r6.c(r7, r1)
        L_0x0029:
            boolean[] r1 = r0.e
            int r1 = defpackage.np8.o(r5, r3, r4, r1)
            if (r1 != r4) goto L_0x0035
            r0.b(r3, r5, r4)
            return
        L_0x0035:
            int r6 = r1 + 3
            byte r7 = r5[r6]
            r7 = r7 & 31
            int r8 = r1 - r3
            if (r8 <= 0) goto L_0x0042
            r0.b(r3, r5, r1)
        L_0x0042:
            int r1 = r4 - r1
            long r9 = r0.d
            long r11 = (long) r1
            long r9 = r9 - r11
            if (r8 >= 0) goto L_0x004c
            int r8 = -r8
            goto L_0x004d
        L_0x004c:
            r8 = 0
        L_0x004d:
            long r11 = r0.h
            boolean r13 = r0.g
            java.lang.Object r15 = r0.l
            vl9 r15 = (defpackage.vl9) r15
            java.lang.Object r3 = r0.k
            vl9 r3 = (defpackage.vl9) r3
            if (r13 == 0) goto L_0x0071
            java.lang.Object r13 = r0.o
            ph6 r13 = (defpackage.ph6) r13
            boolean r13 = r13.c
            if (r13 == 0) goto L_0x0064
            goto L_0x0071
        L_0x0064:
            r20 = r1
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r6 = r2
            goto L_0x0189
        L_0x0071:
            r3.b(r8)
            r15.b(r8)
            boolean r13 = r0.g
            if (r13 != 0) goto L_0x0134
            boolean r13 = r3.d
            if (r13 == 0) goto L_0x0064
            boolean r13 = r15.d
            if (r13 == 0) goto L_0x0064
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            byte[] r14 = r3.e
            int r2 = r3.f
            byte[] r2 = java.util.Arrays.copyOf(r14, r2)
            r13.add(r2)
            byte[] r2 = r15.e
            int r14 = r15.f
            byte[] r2 = java.util.Arrays.copyOf(r2, r14)
            r13.add(r2)
            byte[] r2 = r3.e
            int r14 = r3.f
            r16 = r4
            r4 = 3
            am9 r2 = defpackage.np8.F(r4, r2, r14)
            byte[] r14 = r15.e
            int r4 = r15.f
            r17 = r5
            s02 r5 = new s02
            r18 = r6
            r19 = r7
            r6 = 4
            r7 = 3
            r5.<init>((int) r6, (int) r4, (int) r7, (byte[]) r14)
            int r4 = r5.m()
            int r6 = r5.m()
            r5.s()
            boolean r5 = r5.h()
            yl9 r7 = new yl9
            r7.<init>(r4, r6, r5)
            int r5 = r2.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r2.b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r14 = r2.c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r14}
            java.lang.String r6 = "avc1.%02X%02X%02X"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.Object r6 = r0.n
            xze r6 = (defpackage.xze) r6
            my5 r14 = new my5
            r14.<init>()
            r20 = r1
            java.lang.String r1 = r0.f
            r14.a = r1
            java.lang.String r1 = "video/avc"
            r14.k = r1
            r14.h = r5
            int r1 = r2.e
            r14.p = r1
            int r1 = r2.f
            r14.q = r1
            float r1 = r2.g
            r14.t = r1
            r14.m = r13
            oy5 r1 = new oy5
            r1.<init>(r14)
            r6.d(r1)
            r1 = 1
            r0.g = r1
            java.lang.Object r1 = r0.o
            ph6 r1 = (defpackage.ph6) r1
            android.util.SparseArray r1 = r1.d
            int r5 = r2.d
            r1.append(r5, r2)
            java.lang.Object r1 = r0.o
            ph6 r1 = (defpackage.ph6) r1
            android.util.SparseArray r1 = r1.e
            r1.append(r4, r7)
            r3.c()
            r15.c()
        L_0x0132:
            r6 = 3
            goto L_0x0189
        L_0x0134:
            r20 = r1
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            boolean r1 = r3.d
            if (r1 == 0) goto L_0x015a
            byte[] r1 = r3.e
            int r2 = r3.f
            r4 = 3
            am9 r1 = defpackage.np8.F(r4, r1, r2)
            java.lang.Object r2 = r0.o
            ph6 r2 = (defpackage.ph6) r2
            android.util.SparseArray r2 = r2.d
            int r4 = r1.d
            r2.append(r4, r1)
            r3.c()
            goto L_0x0132
        L_0x015a:
            boolean r1 = r15.d
            if (r1 == 0) goto L_0x0132
            byte[] r1 = r15.e
            int r2 = r15.f
            s02 r4 = new s02
            r5 = 4
            r6 = 3
            r4.<init>((int) r5, (int) r2, (int) r6, (byte[]) r1)
            int r1 = r4.m()
            int r2 = r4.m()
            r4.s()
            boolean r4 = r4.h()
            yl9 r5 = new yl9
            r5.<init>(r1, r2, r4)
            java.lang.Object r2 = r0.o
            ph6 r2 = (defpackage.ph6) r2
            android.util.SparseArray r2 = r2.e
            r2.append(r1, r5)
            r15.c()
        L_0x0189:
            java.lang.Object r1 = r0.m
            vl9 r1 = (defpackage.vl9) r1
            boolean r2 = r1.b(r8)
            if (r2 == 0) goto L_0x01b3
            byte[] r2 = r1.e
            int r4 = r1.f
            int r2 = defpackage.np8.O(r4, r2)
            byte[] r4 = r1.e
            java.lang.Object r5 = r0.p
            yaf r5 = (defpackage.yaf) r5
            r5.F(r2, r4)
            r2 = 4
            r5.H(r2)
            java.lang.Object r2 = r0.j
            wva r2 = (defpackage.wva) r2
            java.lang.Object r2 = r2.c
            xze[] r2 = (defpackage.xze[]) r2
            defpackage.fp3.r(r11, r5, r2)
        L_0x01b3:
            java.lang.Object r2 = r0.o
            ph6 r2 = (defpackage.ph6) r2
            boolean r4 = r0.g
            boolean r5 = r0.i
            int r7 = r2.i
            r8 = 9
            if (r7 == r8) goto L_0x0240
            boolean r7 = r2.c
            if (r7 == 0) goto L_0x027c
            oh6 r7 = r2.n
            oh6 r8 = r2.m
            boolean r11 = r7.a
            if (r11 != 0) goto L_0x01cf
            goto L_0x027c
        L_0x01cf:
            boolean r11 = r8.a
            if (r11 != 0) goto L_0x01d5
            goto L_0x0240
        L_0x01d5:
            java.lang.Object r11 = r7.p
            am9 r11 = (defpackage.am9) r11
            defpackage.np8.g(r11)
            java.lang.Object r12 = r8.p
            am9 r12 = (defpackage.am9) r12
            defpackage.np8.g(r12)
            int r13 = r7.e
            int r14 = r8.e
            if (r13 != r14) goto L_0x0240
            int r13 = r7.f
            int r14 = r8.f
            if (r13 != r14) goto L_0x0240
            boolean r13 = r7.g
            boolean r14 = r8.g
            if (r13 != r14) goto L_0x0240
            boolean r13 = r7.h
            if (r13 == 0) goto L_0x0203
            boolean r13 = r8.h
            if (r13 == 0) goto L_0x0203
            boolean r13 = r7.i
            boolean r14 = r8.i
            if (r13 != r14) goto L_0x0240
        L_0x0203:
            int r13 = r7.c
            int r14 = r8.c
            if (r13 == r14) goto L_0x020d
            if (r13 == 0) goto L_0x0240
            if (r14 == 0) goto L_0x0240
        L_0x020d:
            int r12 = r12.k
            int r11 = r11.k
            if (r11 != 0) goto L_0x0221
            if (r12 != 0) goto L_0x0221
            int r13 = r7.l
            int r14 = r8.l
            if (r13 != r14) goto L_0x0240
            int r13 = r7.m
            int r14 = r8.m
            if (r13 != r14) goto L_0x0240
        L_0x0221:
            r13 = 1
            if (r11 != r13) goto L_0x0232
            if (r12 != r13) goto L_0x0232
            int r11 = r7.n
            int r12 = r8.n
            if (r11 != r12) goto L_0x0240
            int r11 = r7.o
            int r12 = r8.o
            if (r11 != r12) goto L_0x0240
        L_0x0232:
            boolean r11 = r7.j
            boolean r12 = r8.j
            if (r11 != r12) goto L_0x0240
            if (r11 == 0) goto L_0x027c
            int r7 = r7.k
            int r8 = r8.k
            if (r7 == r8) goto L_0x027c
        L_0x0240:
            if (r4 == 0) goto L_0x026e
            boolean r4 = r2.o
            if (r4 == 0) goto L_0x026e
            long r7 = r2.j
            long r11 = r9 - r7
            int r4 = (int) r11
            int r26 = r20 + r4
            long r11 = r2.q
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x0259
            goto L_0x026e
        L_0x0259:
            boolean r4 = r2.r
            long r13 = r2.p
            long r7 = r7 - r13
            int r7 = (int) r7
            xze r8 = r2.a
            r27 = 0
            r21 = r8
            r22 = r11
            r24 = r4
            r25 = r7
            r21.b(r22, r24, r25, r26, r27)
        L_0x026e:
            long r7 = r2.j
            r2.p = r7
            long r7 = r2.l
            r2.q = r7
            r4 = 0
            r2.r = r4
            r4 = 1
            r2.o = r4
        L_0x027c:
            boolean r4 = r2.b
            r7 = 2
            if (r4 == 0) goto L_0x0292
            oh6 r4 = r2.n
            boolean r5 = r4.b
            if (r5 == 0) goto L_0x0290
            int r4 = r4.d
            r5 = 7
            if (r4 == r5) goto L_0x028e
            if (r4 != r7) goto L_0x0290
        L_0x028e:
            r4 = 1
            goto L_0x0291
        L_0x0290:
            r4 = 0
        L_0x0291:
            r5 = r4
        L_0x0292:
            boolean r4 = r2.r
            int r8 = r2.i
            r11 = 5
            if (r8 == r11) goto L_0x02a1
            if (r5 == 0) goto L_0x029f
            r5 = 1
            if (r8 != r5) goto L_0x029f
            goto L_0x02a1
        L_0x029f:
            r5 = 0
            goto L_0x02a2
        L_0x02a1:
            r5 = 1
        L_0x02a2:
            r4 = r4 | r5
            r2.r = r4
            if (r4 == 0) goto L_0x02aa
            r2 = 0
            r0.i = r2
        L_0x02aa:
            long r4 = r0.h
            boolean r2 = r0.g
            if (r2 == 0) goto L_0x02b8
            java.lang.Object r2 = r0.o
            ph6 r2 = (defpackage.ph6) r2
            boolean r2 = r2.c
            if (r2 == 0) goto L_0x02bb
        L_0x02b8:
            r2 = r19
            goto L_0x02be
        L_0x02bb:
            r2 = r19
            goto L_0x02c4
        L_0x02be:
            r3.d(r2)
            r15.d(r2)
        L_0x02c4:
            r1.d(r2)
            java.lang.Object r1 = r0.o
            ph6 r1 = (defpackage.ph6) r1
            r1.i = r2
            r1.l = r4
            r1.j = r9
            boolean r3 = r1.b
            if (r3 == 0) goto L_0x02d9
            r3 = 1
            if (r2 == r3) goto L_0x02e4
            goto L_0x02da
        L_0x02d9:
            r3 = 1
        L_0x02da:
            boolean r4 = r1.c
            if (r4 == 0) goto L_0x02f6
            if (r2 == r11) goto L_0x02e4
            if (r2 == r3) goto L_0x02e4
            if (r2 != r7) goto L_0x02f6
        L_0x02e4:
            oh6 r2 = r1.m
            oh6 r3 = r1.n
            r1.m = r3
            r1.n = r2
            r3 = 0
            r2.b = r3
            r2.a = r3
            r1.h = r3
            r2 = 1
            r1.k = r2
        L_0x02f6:
            r2 = r6
            r4 = r16
            r5 = r17
            r3 = r18
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh6.f(yaf):void");
    }

    public final void g(int i2, long j2) {
        switch (this.a) {
            case 0:
                if (j2 != -9223372036854775807L) {
                    this.h = j2;
                }
                this.i = ((i2 & 2) != 0) | this.i;
                return;
            default:
                this.h = j2;
                this.i = ((i2 & 2) != 0) | this.i;
                return;
        }
    }

    public void h() {
    }

    public void i(pa5 pa5, l3f l3f) {
        l3f.a();
        l3f.b();
        this.f = l3f.f;
        l3f.b();
        yze B = pa5.B(l3f.e, 2);
        this.n = B;
        this.o = new qh6(B, this.b, this.c);
        ((aab) this.j).i(pa5, l3f);
    }

    public void j(oa5 oa5, l3f l3f) {
        l3f.a();
        l3f.b();
        this.f = l3f.f;
        l3f.b();
        xze B = oa5.B(l3f.e, 2);
        this.n = B;
        this.o = new ph6(B, this.b, this.c);
        ((wva) this.j).b(oa5, l3f);
    }

    public rh6(wva wva, boolean z, boolean z2) {
        this.j = wva;
        this.b = z;
        this.c = z2;
        this.e = new boolean[3];
        this.k = new vl9(7, 0);
        this.l = new vl9(8, 0);
        this.m = new vl9(6, 0);
        this.h = -9223372036854775807L;
        this.p = new yaf(3, false);
    }
}
