package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: p97  reason: default package */
public final class p97 implements ka5 {
    public final yaf a = new yaf(6);
    public oa5 b;
    public int c;
    public int d;
    public int e;
    public long f = -1;
    public uc9 g;
    public ma5 h;
    public g03 i;
    public vd9 j;

    public final void a() {
        b(new c99[0]);
        oa5 oa5 = this.b;
        oa5.getClass();
        oa5.w();
        this.b.M(new pm5(-9223372036854775807L));
        this.c = 6;
    }

    public final void b(c99... c99Arr) {
        oa5 oa5 = this.b;
        oa5.getClass();
        xze B = oa5.B(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 4);
        my5 my5 = new my5();
        my5.j = "image/jpeg";
        my5.i = new e99(c99Arr);
        B.d(new oy5(my5));
    }

    public final void d(long j2, long j3) {
        if (j2 == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            vd9 vd9 = this.j;
            vd9.getClass();
            vd9.d(j2, j3);
        }
    }

    public final void g(oa5 oa5) {
        this.b = oa5;
    }

    public final boolean h(ma5 ma5) {
        ra4 ra4 = (ra4) ma5;
        yaf yaf = this.a;
        yaf.E(2);
        ra4.q(yaf.a, 0, 2, false);
        if (yaf.A() != 65496) {
            return false;
        }
        yaf.E(2);
        ra4.q(yaf.a, 0, 2, false);
        int A = yaf.A();
        this.d = A;
        if (A == 65504) {
            yaf.E(2);
            ra4.q(yaf.a, 0, 2, false);
            ra4.b(yaf.A() - 2, false);
            yaf.E(2);
            ra4.q(yaf.a, 0, 2, false);
            this.d = yaf.A();
        }
        if (this.d != 65505) {
            return false;
        }
        ra4.b(2, false);
        yaf.E(6);
        ra4.q(yaf.a, 0, 6, false);
        return yaf.w() == 1165519206 && yaf.A() == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.ma5 r26, defpackage.lh4 r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = -1
            r4 = 1
            r5 = 0
            int r6 = r0.c
            r7 = -1
            r9 = 4
            yaf r10 = r0.a
            r11 = 2
            if (r6 == 0) goto L_0x0183
            if (r6 == r4) goto L_0x016e
            if (r6 == r11) goto L_0x00b2
            r7 = 5
            if (r6 == r9) goto L_0x0050
            if (r6 == r7) goto L_0x0026
            r0 = 6
            if (r6 != r0) goto L_0x0020
            return r3
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0026:
            g03 r3 = r0.i
            if (r3 == 0) goto L_0x002e
            ma5 r3 = r0.h
            if (r1 == r3) goto L_0x003b
        L_0x002e:
            r0.h = r1
            g03 r3 = new g03
            long r5 = r0.f
            ra4 r1 = (defpackage.ra4) r1
            r3.<init>((defpackage.ra4) r1, (long) r5)
            r0.i = r3
        L_0x003b:
            vd9 r1 = r0.j
            r1.getClass()
            g03 r3 = r0.i
            int r1 = r1.i(r3, r2)
            if (r1 != r4) goto L_0x004f
            long r3 = r2.a
            long r5 = r0.f
            long r3 = r3 + r5
            r2.a = r3
        L_0x004f:
            return r1
        L_0x0050:
            r3 = r1
            ra4 r3 = (defpackage.ra4) r3
            long r8 = r3.o
            long r11 = r0.f
            int r3 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x005e
            r2.a = r11
            return r4
        L_0x005e:
            byte[] r2 = r10.a
            ra4 r1 = (defpackage.ra4) r1
            boolean r2 = r1.q(r2, r5, r4, r4)
            if (r2 != 0) goto L_0x006c
            r25.a()
            goto L_0x00b1
        L_0x006c:
            r1.Y = r5
            vd9 r2 = r0.j
            if (r2 != 0) goto L_0x0079
            vd9 r2 = new vd9
            r2.<init>()
            r0.j = r2
        L_0x0079:
            g03 r2 = new g03
            long r8 = r0.f
            r2.<init>((defpackage.ra4) r1, (long) r8)
            r0.i = r2
            vd9 r1 = r0.j
            r1.getClass()
            boolean r1 = defpackage.ju0.H(r2, r5, r5)
            if (r1 == 0) goto L_0x00ae
            vd9 r1 = r0.j
            g03 r2 = new g03
            long r8 = r0.f
            oa5 r3 = r0.b
            r3.getClass()
            r6 = 13
            r2.<init>((long) r8, (java.lang.Object) r3, (int) r6)
            r1.q = r2
            uc9 r1 = r0.g
            r1.getClass()
            c99[] r2 = new defpackage.c99[r4]
            r2[r5] = r1
            r0.b(r2)
            r0.c = r7
            goto L_0x00b1
        L_0x00ae:
            r25.a()
        L_0x00b1:
            return r5
        L_0x00b2:
            int r2 = r0.d
            r6 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r6) goto L_0x0163
            yaf r2 = new yaf
            int r6 = r0.e
            r2.<init>((int) r6)
            byte[] r6 = r2.a
            int r9 = r0.e
            r10 = r1
            ra4 r10 = (defpackage.ra4) r10
            r10.h(r6, r5, r9, r5)
            uc9 r6 = r0.g
            if (r6 != 0) goto L_0x0161
            java.lang.String r6 = "http://ns.adobe.com/xap/1.0/"
            java.lang.String r9 = r2.q()
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0161
            java.lang.String r2 = r2.q()
            if (r2 == 0) goto L_0x0161
            ra4 r1 = (defpackage.ra4) r1
            long r9 = r1.c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x00eb
        L_0x00e8:
            r6 = 0
            goto L_0x0159
        L_0x00eb:
            tc9 r1 = defpackage.br7.L(r2)     // Catch:{ ParserException | NumberFormatException | XmlPullParserException -> 0x00f0 }
            goto L_0x00f1
        L_0x00f0:
            r1 = 0
        L_0x00f1:
            if (r1 != 0) goto L_0x00f4
            goto L_0x00e8
        L_0x00f4:
            java.util.List r2 = r1.b
            int r12 = r2.size()
            if (r12 >= r11) goto L_0x00fd
            goto L_0x00e8
        L_0x00fd:
            int r11 = r2.size()
            int r11 = r11 - r4
            r4 = r5
            r13 = r7
            r15 = r13
            r19 = r15
            r21 = r19
        L_0x0109:
            if (r11 < 0) goto L_0x013e
            java.lang.Object r12 = r2.get(r11)
            rc9 r12 = (defpackage.rc9) r12
            java.lang.String r6 = r12.a
            java.lang.String r5 = "video/mp4"
            boolean r5 = r5.equals(r6)
            r4 = r4 | r5
            if (r11 != 0) goto L_0x0127
            long r5 = r12.c
            long r9 = r9 - r5
            r5 = 0
        L_0x0121:
            r23 = r5
            r5 = r9
            r9 = r23
            goto L_0x012c
        L_0x0127:
            long r5 = r12.b
            long r5 = r9 - r5
            goto L_0x0121
        L_0x012c:
            if (r4 == 0) goto L_0x0137
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 == 0) goto L_0x0137
            long r21 = r5 - r9
            r19 = r9
            r4 = 0
        L_0x0137:
            if (r11 != 0) goto L_0x013b
            r15 = r5
            r13 = r9
        L_0x013b:
            int r11 = r11 + r3
            r5 = 0
            goto L_0x0109
        L_0x013e:
            int r2 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00e8
            int r2 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00e8
            int r2 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00e8
            int r2 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x014f
            goto L_0x00e8
        L_0x014f:
            uc9 r6 = new uc9
            long r1 = r1.a
            r12 = r6
            r17 = r1
            r12.<init>(r13, r15, r17, r19, r21)
        L_0x0159:
            r0.g = r6
            if (r6 == 0) goto L_0x0161
            long r1 = r6.o
            r0.f = r1
        L_0x0161:
            r2 = 0
            goto L_0x016b
        L_0x0163:
            int r2 = r0.e
            ra4 r1 = (defpackage.ra4) r1
            r1.z(r2)
            goto L_0x0161
        L_0x016b:
            r0.c = r2
            return r2
        L_0x016e:
            r2 = r5
            r10.E(r11)
            byte[] r3 = r10.a
            ra4 r1 = (defpackage.ra4) r1
            r1.h(r3, r2, r11, r2)
            int r1 = r10.A()
            int r1 = r1 - r11
            r0.e = r1
            r0.c = r11
            return r2
        L_0x0183:
            r2 = r5
            r10.E(r11)
            byte[] r3 = r10.a
            ra4 r1 = (defpackage.ra4) r1
            r1.h(r3, r2, r11, r2)
            int r1 = r10.A()
            r0.d = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01a7
            long r1 = r0.f
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x01a3
            r0.c = r9
        L_0x01a1:
            r0 = 0
            goto L_0x01b9
        L_0x01a3:
            r25.a()
            goto L_0x01a1
        L_0x01a7:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01b1
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01a1
        L_0x01b1:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01a1
            r0.c = r4
            goto L_0x01a1
        L_0x01b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p97.i(ma5, lh4):int");
    }

    public final void release() {
        vd9 vd9 = this.j;
        if (vd9 != null) {
            vd9.getClass();
        }
    }
}
