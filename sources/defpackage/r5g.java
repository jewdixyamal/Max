package defpackage;

/* renamed from: r5g  reason: default package */
public abstract class r5g implements oh4 {
    public int a;
    public hj3 b;
    public opc c;
    public int d;
    public final ek4 e = new ek4(this);
    public int f = 0;
    public boolean g = false;
    public final sh4 h = new sh4(this);
    public final sh4 i = new sh4(this);
    public int j = 1;

    public r5g(hj3 hj3) {
        this.b = hj3;
    }

    public static void b(sh4 sh4, sh4 sh42, int i2) {
        sh4.l.add(sh42);
        sh4.f = i2;
        sh42.k.add(sh4);
    }

    public static sh4 h(oi3 oi3) {
        oi3 oi32 = oi3.f;
        if (oi32 == null) {
            return null;
        }
        int s = au1.s(oi32.e);
        hj3 hj3 = oi32.d;
        if (s == 1) {
            return hj3.d.h;
        }
        if (s == 2) {
            return hj3.e.h;
        }
        if (s == 3) {
            return hj3.d.i;
        }
        if (s == 4) {
            return hj3.e.i;
        }
        if (s != 5) {
            return null;
        }
        return hj3.e.k;
    }

    public static sh4 i(oi3 oi3, int i2) {
        oi3 oi32 = oi3.f;
        if (oi32 == null) {
            return null;
        }
        hj3 hj3 = oi32.d;
        r5g r5g = i2 == 0 ? hj3.d : hj3.e;
        int s = au1.s(oi32.e);
        if (s == 1 || s == 2) {
            return r5g.h;
        }
        if (s == 3 || s == 4) {
            return r5g.i;
        }
        return null;
    }

    public final void c(sh4 sh4, sh4 sh42, int i2, ek4 ek4) {
        sh4.l.add(sh42);
        sh4.l.add(this.e);
        sh4.h = i2;
        sh4.i = ek4;
        sh42.k.add(sh4);
        ek4.k.add(sh4);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        int i4;
        if (i3 == 0) {
            hj3 hj3 = this.b;
            int i5 = hj3.v;
            i4 = Math.max(hj3.u, i2);
            if (i5 > 0) {
                i4 = Math.min(i5, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        } else {
            hj3 hj32 = this.b;
            int i6 = hj32.y;
            int max = Math.max(hj32.x, i2);
            if (i6 > 0) {
                max = Math.min(i6, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        }
        return i4;
    }

    public long j() {
        ek4 ek4 = this.e;
        if (ek4.j) {
            return (long) ek4.g;
        }
        return 0;
    }

    public abstract boolean k();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r9.a == 3) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(defpackage.oi3 r12, defpackage.oi3 r13, int r14) {
        /*
            r11 = this;
            sh4 r0 = h(r12)
            sh4 r1 = h(r13)
            boolean r2 = r0.j
            if (r2 == 0) goto L_0x00e7
            boolean r2 = r1.j
            if (r2 != 0) goto L_0x0012
            goto L_0x00e7
        L_0x0012:
            int r2 = r0.g
            int r12 = r12.e()
            int r12 = r12 + r2
            int r2 = r1.g
            int r13 = r13.e()
            int r2 = r2 - r13
            int r13 = r2 - r12
            ek4 r3 = r11.e
            boolean r4 = r3.j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00b0
            int r4 = r11.d
            r6 = 3
            if (r4 != r6) goto L_0x00b0
            int r4 = r11.a
            if (r4 == 0) goto L_0x00a9
            r7 = 1
            if (r4 == r7) goto L_0x009b
            r8 = 2
            if (r4 == r8) goto L_0x0073
            if (r4 == r6) goto L_0x003d
            goto L_0x00b0
        L_0x003d:
            hj3 r4 = r11.b
            eo6 r8 = r4.d
            int r9 = r8.d
            if (r9 != r6) goto L_0x0054
            int r9 = r8.a
            if (r9 != r6) goto L_0x0054
            ocf r9 = r4.e
            int r10 = r9.d
            if (r10 != r6) goto L_0x0054
            int r9 = r9.a
            if (r9 != r6) goto L_0x0054
            goto L_0x00b0
        L_0x0054:
            if (r14 != 0) goto L_0x0058
            ocf r8 = r4.e
        L_0x0058:
            ek4 r6 = r8.e
            boolean r8 = r6.j
            if (r8 == 0) goto L_0x00b0
            float r4 = r4.W
            if (r14 != r7) goto L_0x0069
            int r6 = r6.g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x006f
        L_0x0069:
            int r6 = r6.g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
        L_0x006f:
            r3.d(r4)
            goto L_0x00b0
        L_0x0073:
            hj3 r4 = r11.b
            hj3 r6 = r4.T
            if (r6 == 0) goto L_0x00b0
            if (r14 != 0) goto L_0x007e
            eo6 r6 = r6.d
            goto L_0x0080
        L_0x007e:
            ocf r6 = r6.e
        L_0x0080:
            ek4 r6 = r6.e
            boolean r7 = r6.j
            if (r7 == 0) goto L_0x00b0
            if (r14 != 0) goto L_0x008b
            float r4 = r4.w
            goto L_0x008d
        L_0x008b:
            float r4 = r4.z
        L_0x008d:
            int r6 = r6.g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            int r4 = r11.g(r4, r14)
            r3.d(r4)
            goto L_0x00b0
        L_0x009b:
            int r4 = r3.m
            int r4 = r11.g(r4, r14)
            int r4 = java.lang.Math.min(r4, r13)
            r3.d(r4)
            goto L_0x00b0
        L_0x00a9:
            int r4 = r11.g(r13, r14)
            r3.d(r4)
        L_0x00b0:
            boolean r4 = r3.j
            if (r4 != 0) goto L_0x00b5
            return
        L_0x00b5:
            int r4 = r3.g
            sh4 r6 = r11.i
            sh4 r7 = r11.h
            if (r4 != r13) goto L_0x00c4
            r7.d(r12)
            r6.d(r2)
            return
        L_0x00c4:
            hj3 r11 = r11.b
            if (r14 != 0) goto L_0x00cb
            float r11 = r11.d0
            goto L_0x00cd
        L_0x00cb:
            float r11 = r11.e0
        L_0x00cd:
            if (r0 != r1) goto L_0x00d4
            int r12 = r0.g
            int r2 = r1.g
            r11 = r5
        L_0x00d4:
            int r2 = r2 - r12
            int r2 = r2 - r4
            float r12 = (float) r12
            float r12 = r12 + r5
            float r13 = (float) r2
            float r13 = r13 * r11
            float r13 = r13 + r12
            int r11 = (int) r13
            r7.d(r11)
            int r11 = r7.g
            int r12 = r3.g
            int r11 = r11 + r12
            r6.d(r11)
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r5g.l(oi3, oi3, int):void");
    }
}
