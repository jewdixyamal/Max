package defpackage;

/* renamed from: t14  reason: default package */
public final class t14 extends lue {
    public final int X;
    public final long Y;
    public final long Z;
    public final long b;
    public final long c;
    public final long o;
    public final long s0;
    public final h14 t0;
    public final rb8 u0;
    public final gb8 v0;

    public t14(long j, long j2, long j3, int i, long j4, long j5, long j6, h14 h14, rb8 rb8, gb8 gb8) {
        h14 h142 = h14;
        gb8 gb82 = gb8;
        np8.f(h142.d == (gb82 != null));
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = i;
        this.Y = j4;
        this.Z = j5;
        this.s0 = j6;
        this.t0 = h142;
        this.u0 = rb8;
        this.v0 = gb82;
    }

    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.X) >= 0 && intValue < i()) {
            return intValue;
        }
        return -1;
    }

    public final gue g(int i, gue gue, boolean z) {
        int i2 = i;
        np8.e(i2, i());
        Integer num = null;
        h14 h14 = this.t0;
        String str = z ? h14.b(i2).a : null;
        if (z) {
            num = Integer.valueOf(this.X + i2);
        }
        gue.getClass();
        gue.h(str, num, 0, h14.d(i2), maf.D(h14.b(i2).b - h14.b(0).b) - this.Y, r8.Y, false);
        return gue;
    }

    public final int i() {
        return this.t0.m.size();
    }

    public final Object m(int i) {
        np8.e(i, i());
        return Integer.valueOf(this.X + i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.jue n(int r26, defpackage.jue r27, long r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = 1
            r2 = r26
            defpackage.np8.e(r2, r1)
            h14 r5 = r0.t0
            boolean r2 = r5.d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            if (r2 == 0) goto L_0x0022
            long r7 = r5.e
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0022
            long r7 = r5.b
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0022
            r2 = r1
            goto L_0x0023
        L_0x0022:
            r2 = r6
        L_0x0023:
            long r7 = r0.s0
            if (r2 != 0) goto L_0x002b
        L_0x0027:
            r23 = r7
            goto L_0x00ac
        L_0x002b:
            r9 = 0
            int r2 = (r28 > r9 ? 1 : (r28 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x003d
            long r7 = r7 + r28
            long r11 = r0.Z
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x003d
            r23 = r3
            goto L_0x00ac
        L_0x003d:
            long r11 = r0.Y
            long r11 = r11 + r7
            long r13 = r5.d(r6)
            r2 = r6
        L_0x0045:
            java.util.List r15 = r5.m
            int r15 = r15.size()
            int r15 = r15 - r1
            if (r2 >= r15) goto L_0x005a
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x005a
            long r11 = r11 - r13
            int r2 = r2 + 1
            long r13 = r5.d(r2)
            goto L_0x0045
        L_0x005a:
            jta r2 = r5.b(r2)
            java.util.List r15 = r2.c
            int r1 = r15.size()
            r3 = r6
        L_0x0065:
            r4 = -1
            if (r3 >= r1) goto L_0x007b
            java.lang.Object r19 = r15.get(r3)
            r9 = r19
            t8 r9 = (defpackage.t8) r9
            int r9 = r9.b
            r10 = 2
            if (r9 != r10) goto L_0x0076
            goto L_0x007c
        L_0x0076:
            int r3 = r3 + 1
            r9 = 0
            goto L_0x0065
        L_0x007b:
            r3 = r4
        L_0x007c:
            if (r3 != r4) goto L_0x007f
            goto L_0x0027
        L_0x007f:
            java.util.List r1 = r2.c
            java.lang.Object r1 = r1.get(r3)
            t8 r1 = (defpackage.t8) r1
            java.util.List r1 = r1.c
            java.lang.Object r1 = r1.get(r6)
            khc r1 = (defpackage.khc) r1
            z14 r1 = r1.c()
            if (r1 == 0) goto L_0x0027
            long r2 = r1.D(r13)
            r9 = 0
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x00a0
            goto L_0x0027
        L_0x00a0:
            long r2 = r1.v(r11, r13)
            long r1 = r1.b(r2)
            long r1 = r1 + r7
            long r1 = r1 - r11
            r23 = r1
        L_0x00ac:
            java.lang.Object r3 = defpackage.jue.C0
            boolean r1 = r5.d
            if (r1 == 0) goto L_0x00c5
            long r1 = r5.e
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00c5
            long r1 = r5.b
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x00c5
            r13 = 1
            goto L_0x00c6
        L_0x00c5:
            r13 = r6
        L_0x00c6:
            int r1 = r25.i()
            r2 = 1
            int r20 = r1 + -1
            long r1 = r0.Z
            r17 = r1
            r19 = 0
            rb8 r4 = r0.u0
            long r6 = r0.b
            long r8 = r0.c
            long r10 = r0.o
            r12 = 1
            gb8 r14 = r0.v0
            long r0 = r0.Y
            r21 = r0
            r2 = r27
            r15 = r23
            r2.b(r3, r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20, r21)
            return r27
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t14.n(int, jue, long):jue");
    }

    public final int p() {
        return 1;
    }
}
