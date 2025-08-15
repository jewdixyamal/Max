package defpackage;

/* renamed from: ocf  reason: default package */
public final class ocf extends r5g {
    public sh4 k;
    public qk0 l;

    public final void a(oh4 oh4) {
        int i;
        float f;
        float f2;
        float f3;
        if (au1.s(this.j) != 3) {
            ek4 ek4 = this.e;
            if (ek4.c && !ek4.j && this.d == 3) {
                hj3 hj3 = this.b;
                int i2 = hj3.s;
                if (i2 == 2) {
                    hj3 hj32 = hj3.T;
                    if (hj32 != null) {
                        ek4 ek42 = hj32.e.e;
                        if (ek42.j) {
                            ek4.d((int) ((((float) ek42.g) * hj3.z) + 0.5f));
                        }
                    }
                } else if (i2 == 3) {
                    ek4 ek43 = hj3.d.e;
                    if (ek43.j) {
                        int i3 = hj3.X;
                        if (i3 == -1) {
                            f = (float) ek43.g;
                            f2 = hj3.W;
                        } else if (i3 == 0) {
                            f3 = ((float) ek43.g) * hj3.W;
                            i = (int) (f3 + 0.5f);
                            ek4.d(i);
                        } else if (i3 != 1) {
                            i = 0;
                            ek4.d(i);
                        } else {
                            f = (float) ek43.g;
                            f2 = hj3.W;
                        }
                        f3 = f / f2;
                        i = (int) (f3 + 0.5f);
                        ek4.d(i);
                    }
                }
            }
            sh4 sh4 = this.h;
            if (sh4.c) {
                sh4 sh42 = this.i;
                if (sh42.c) {
                    if (!sh4.j || !sh42.j || !ek4.j) {
                        if (!ek4.j && this.d == 3) {
                            hj3 hj33 = this.b;
                            if (hj33.r == 0 && !hj33.y()) {
                                int i4 = ((sh4) sh4.l.get(0)).g + sh4.f;
                                int i5 = ((sh4) sh42.l.get(0)).g + sh42.f;
                                sh4.d(i4);
                                sh42.d(i5);
                                ek4.d(i5 - i4);
                                return;
                            }
                        }
                        if (!ek4.j && this.d == 3 && this.a == 1 && sh4.l.size() > 0 && sh42.l.size() > 0) {
                            int i6 = (((sh4) sh42.l.get(0)).g + sh42.f) - (((sh4) sh4.l.get(0)).g + sh4.f);
                            int i7 = ek4.m;
                            if (i6 < i7) {
                                ek4.d(i6);
                            } else {
                                ek4.d(i7);
                            }
                        }
                        if (ek4.j && sh4.l.size() > 0 && sh42.l.size() > 0) {
                            sh4 sh43 = (sh4) sh4.l.get(0);
                            sh4 sh44 = (sh4) sh42.l.get(0);
                            int i8 = sh43.g;
                            int i9 = sh4.f + i8;
                            int i10 = sh44.g;
                            int i11 = sh42.f + i10;
                            float f4 = this.b.e0;
                            if (sh43 == sh44) {
                                f4 = 0.5f;
                            } else {
                                i8 = i9;
                                i10 = i11;
                            }
                            sh4.d((int) ((((float) ((i10 - i8) - ek4.g)) * f4) + ((float) i8) + 0.5f));
                            sh42.d(sh4.g + ek4.g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        hj3 hj34 = this.b;
        l(hj34.J, hj34.L, 1);
    }

    /* JADX WARNING: type inference failed for: r0v114, types: [qk0, ek4] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r0 = r14.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r14 = this;
            hj3 r0 = r14.b
            boolean r1 = r0.a
            ek4 r2 = r14.e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.k()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.j
            sh4 r1 = r14.i
            sh4 r3 = r14.h
            r4 = 3
            r5 = 1
            r6 = 4
            if (r0 != 0) goto L_0x0084
            hj3 r0 = r14.b
            int[] r7 = r0.p0
            r7 = r7[r5]
            r14.d = r7
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x002d
            qk0 r0 = new qk0
            r0.<init>(r14)
            r14.l = r0
        L_0x002d:
            int r0 = r14.d
            if (r0 == r4) goto L_0x00b2
            if (r0 != r6) goto L_0x0078
            hj3 r7 = r14.b
            hj3 r7 = r7.T
            if (r7 == 0) goto L_0x0078
            int[] r8 = r7.p0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x0078
            int r0 = r7.k()
            hj3 r4 = r14.b
            oi3 r4 = r4.J
            int r4 = r4.e()
            int r0 = r0 - r4
            hj3 r4 = r14.b
            oi3 r4 = r4.L
            int r4 = r4.e()
            int r0 = r0 - r4
            ocf r4 = r7.e
            sh4 r4 = r4.h
            hj3 r5 = r14.b
            oi3 r5 = r5.J
            int r5 = r5.e()
            defpackage.r5g.b(r3, r4, r5)
            ocf r3 = r7.e
            sh4 r3 = r3.i
            hj3 r14 = r14.b
            oi3 r14 = r14.L
            int r14 = r14.e()
            int r14 = -r14
            defpackage.r5g.b(r1, r3, r14)
            r2.d(r0)
            return
        L_0x0078:
            if (r0 != r5) goto L_0x00b2
            hj3 r0 = r14.b
            int r0 = r0.k()
            r2.d(r0)
            goto L_0x00b2
        L_0x0084:
            int r0 = r14.d
            if (r0 != r6) goto L_0x00b2
            hj3 r0 = r14.b
            hj3 r7 = r0.T
            if (r7 == 0) goto L_0x00b2
            int[] r8 = r7.p0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x00b2
            ocf r2 = r7.e
            sh4 r2 = r2.h
            oi3 r0 = r0.J
            int r0 = r0.e()
            defpackage.r5g.b(r3, r2, r0)
            ocf r0 = r7.e
            sh4 r0 = r0.i
            hj3 r14 = r14.b
            oi3 r14 = r14.L
            int r14 = r14.e()
            int r14 = -r14
            defpackage.r5g.b(r1, r0, r14)
            return
        L_0x00b2:
            boolean r0 = r2.j
            sh4 r7 = r14.k
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x01d6
            hj3 r10 = r14.b
            boolean r11 = r10.a
            if (r11 == 0) goto L_0x01d6
            oi3[] r0 = r10.Q
            r11 = r0[r9]
            oi3 r12 = r11.f
            if (r12 == 0) goto L_0x0132
            r13 = r0[r4]
            oi3 r13 = r13.f
            if (r13 == 0) goto L_0x0132
            boolean r0 = r10.y()
            if (r0 == 0) goto L_0x00ee
            hj3 r0 = r14.b
            oi3[] r0 = r0.Q
            r0 = r0[r9]
            int r0 = r0.e()
            r3.f = r0
            hj3 r0 = r14.b
            oi3[] r0 = r0.Q
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f = r0
            goto L_0x0125
        L_0x00ee:
            hj3 r0 = r14.b
            oi3[] r0 = r0.Q
            r0 = r0[r9]
            sh4 r0 = defpackage.r5g.h(r0)
            if (r0 == 0) goto L_0x0107
            hj3 r2 = r14.b
            oi3[] r2 = r2.Q
            r2 = r2[r9]
            int r2 = r2.e()
            defpackage.r5g.b(r3, r0, r2)
        L_0x0107:
            hj3 r0 = r14.b
            oi3[] r0 = r0.Q
            r0 = r0[r4]
            sh4 r0 = defpackage.r5g.h(r0)
            if (r0 == 0) goto L_0x0121
            hj3 r2 = r14.b
            oi3[] r2 = r2.Q
            r2 = r2[r4]
            int r2 = r2.e()
            int r2 = -r2
            defpackage.r5g.b(r1, r0, r2)
        L_0x0121:
            r3.b = r5
            r1.b = r5
        L_0x0125:
            hj3 r14 = r14.b
            boolean r0 = r14.E
            if (r0 == 0) goto L_0x036c
            int r14 = r14.a0
            defpackage.r5g.b(r7, r3, r14)
            goto L_0x036c
        L_0x0132:
            if (r12 == 0) goto L_0x0159
            sh4 r0 = defpackage.r5g.h(r11)
            if (r0 == 0) goto L_0x036c
            hj3 r4 = r14.b
            oi3[] r4 = r4.Q
            r4 = r4[r9]
            int r4 = r4.e()
            defpackage.r5g.b(r3, r0, r4)
            int r0 = r2.g
            defpackage.r5g.b(r1, r3, r0)
            hj3 r14 = r14.b
            boolean r0 = r14.E
            if (r0 == 0) goto L_0x036c
            int r14 = r14.a0
            defpackage.r5g.b(r7, r3, r14)
            goto L_0x036c
        L_0x0159:
            r5 = r0[r4]
            oi3 r9 = r5.f
            if (r9 == 0) goto L_0x0186
            sh4 r0 = defpackage.r5g.h(r5)
            if (r0 == 0) goto L_0x0179
            hj3 r5 = r14.b
            oi3[] r5 = r5.Q
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = -r4
            defpackage.r5g.b(r1, r0, r4)
            int r0 = r2.g
            int r0 = -r0
            defpackage.r5g.b(r3, r1, r0)
        L_0x0179:
            hj3 r14 = r14.b
            boolean r0 = r14.E
            if (r0 == 0) goto L_0x036c
            int r14 = r14.a0
            defpackage.r5g.b(r7, r3, r14)
            goto L_0x036c
        L_0x0186:
            r0 = r0[r6]
            oi3 r4 = r0.f
            if (r4 == 0) goto L_0x01a4
            sh4 r0 = defpackage.r5g.h(r0)
            if (r0 == 0) goto L_0x036c
            defpackage.r5g.b(r7, r0, r8)
            hj3 r14 = r14.b
            int r14 = r14.a0
            int r14 = -r14
            defpackage.r5g.b(r3, r7, r14)
            int r14 = r2.g
            defpackage.r5g.b(r1, r3, r14)
            goto L_0x036c
        L_0x01a4:
            boolean r0 = r10 instanceof defpackage.uj6
            if (r0 != 0) goto L_0x036c
            hj3 r0 = r10.T
            if (r0 == 0) goto L_0x036c
            r0 = 7
            oi3 r0 = r10.i(r0)
            oi3 r0 = r0.f
            if (r0 != 0) goto L_0x036c
            hj3 r0 = r14.b
            hj3 r4 = r0.T
            ocf r4 = r4.e
            sh4 r4 = r4.h
            int r0 = r0.s()
            defpackage.r5g.b(r3, r4, r0)
            int r0 = r2.g
            defpackage.r5g.b(r1, r3, r0)
            hj3 r14 = r14.b
            boolean r0 = r14.E
            if (r0 == 0) goto L_0x036c
            int r14 = r14.a0
            defpackage.r5g.b(r7, r3, r14)
            goto L_0x036c
        L_0x01d6:
            if (r0 != 0) goto L_0x022d
            int r0 = r14.d
            if (r0 != r4) goto L_0x022d
            hj3 r0 = r14.b
            int r10 = r0.s
            if (r10 == r9) goto L_0x020d
            if (r10 == r4) goto L_0x01e5
            goto L_0x0230
        L_0x01e5:
            boolean r0 = r0.y()
            if (r0 != 0) goto L_0x0230
            hj3 r0 = r14.b
            int r10 = r0.r
            if (r10 != r4) goto L_0x01f2
            goto L_0x0230
        L_0x01f2:
            eo6 r0 = r0.d
            ek4 r0 = r0.e
            java.util.ArrayList r10 = r2.l
            r10.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r5
            java.util.ArrayList r0 = r2.k
            r0.add(r3)
            java.util.ArrayList r0 = r2.k
            r0.add(r1)
            goto L_0x0230
        L_0x020d:
            hj3 r0 = r0.T
            if (r0 != 0) goto L_0x0212
            goto L_0x0230
        L_0x0212:
            ocf r0 = r0.e
            ek4 r0 = r0.e
            java.util.ArrayList r10 = r2.l
            r10.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r5
            java.util.ArrayList r0 = r2.k
            r0.add(r3)
            java.util.ArrayList r0 = r2.k
            r0.add(r1)
            goto L_0x0230
        L_0x022d:
            r2.b(r14)
        L_0x0230:
            hj3 r0 = r14.b
            oi3[] r10 = r0.Q
            r11 = r10[r9]
            oi3 r12 = r11.f
            if (r12 == 0) goto L_0x028d
            r13 = r10[r4]
            oi3 r13 = r13.f
            if (r13 == 0) goto L_0x028d
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x0260
            hj3 r0 = r14.b
            oi3[] r0 = r0.Q
            r0 = r0[r9]
            int r0 = r0.e()
            r3.f = r0
            hj3 r0 = r14.b
            oi3[] r0 = r0.Q
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f = r0
            goto L_0x0280
        L_0x0260:
            hj3 r0 = r14.b
            oi3[] r0 = r0.Q
            r0 = r0[r9]
            sh4 r0 = defpackage.r5g.h(r0)
            hj3 r1 = r14.b
            oi3[] r1 = r1.Q
            r1 = r1[r4]
            sh4 r1 = defpackage.r5g.h(r1)
            if (r0 == 0) goto L_0x0279
            r0.b(r14)
        L_0x0279:
            if (r1 == 0) goto L_0x027e
            r1.b(r14)
        L_0x027e:
            r14.j = r6
        L_0x0280:
            hj3 r0 = r14.b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0362
            qk0 r0 = r14.l
            r14.c(r7, r3, r5, r0)
            goto L_0x0362
        L_0x028d:
            r13 = 0
            if (r12 == 0) goto L_0x02d9
            sh4 r0 = defpackage.r5g.h(r11)
            if (r0 == 0) goto L_0x0362
            hj3 r6 = r14.b
            oi3[] r6 = r6.Q
            r6 = r6[r9]
            int r6 = r6.e()
            defpackage.r5g.b(r3, r0, r6)
            r14.c(r1, r3, r5, r2)
            hj3 r0 = r14.b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x02b1
            qk0 r0 = r14.l
            r14.c(r7, r3, r5, r0)
        L_0x02b1:
            int r0 = r14.d
            if (r0 != r4) goto L_0x0362
            hj3 r0 = r14.b
            float r1 = r0.W
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0362
            eo6 r0 = r0.d
            int r1 = r0.d
            if (r1 != r4) goto L_0x0362
            ek4 r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            java.util.ArrayList r0 = r2.l
            hj3 r1 = r14.b
            eo6 r1 = r1.d
            ek4 r1 = r1.e
            r0.add(r1)
            r2.a = r14
            goto L_0x0362
        L_0x02d9:
            r9 = r10[r4]
            oi3 r11 = r9.f
            r12 = -1
            if (r11 == 0) goto L_0x0303
            sh4 r0 = defpackage.r5g.h(r9)
            if (r0 == 0) goto L_0x0362
            hj3 r6 = r14.b
            oi3[] r6 = r6.Q
            r4 = r6[r4]
            int r4 = r4.e()
            int r4 = -r4
            defpackage.r5g.b(r1, r0, r4)
            r14.c(r3, r1, r12, r2)
            hj3 r0 = r14.b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0362
            qk0 r0 = r14.l
            r14.c(r7, r3, r5, r0)
            goto L_0x0362
        L_0x0303:
            r6 = r10[r6]
            oi3 r9 = r6.f
            if (r9 == 0) goto L_0x031b
            sh4 r0 = defpackage.r5g.h(r6)
            if (r0 == 0) goto L_0x0362
            defpackage.r5g.b(r7, r0, r8)
            qk0 r0 = r14.l
            r14.c(r3, r7, r12, r0)
            r14.c(r1, r3, r5, r2)
            goto L_0x0362
        L_0x031b:
            boolean r6 = r0 instanceof defpackage.uj6
            if (r6 != 0) goto L_0x0362
            hj3 r6 = r0.T
            if (r6 == 0) goto L_0x0362
            ocf r6 = r6.e
            sh4 r6 = r6.h
            int r0 = r0.s()
            defpackage.r5g.b(r3, r6, r0)
            r14.c(r1, r3, r5, r2)
            hj3 r0 = r14.b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x033c
            qk0 r0 = r14.l
            r14.c(r7, r3, r5, r0)
        L_0x033c:
            int r0 = r14.d
            if (r0 != r4) goto L_0x0362
            hj3 r0 = r14.b
            float r1 = r0.W
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0362
            eo6 r0 = r0.d
            int r1 = r0.d
            if (r1 != r4) goto L_0x0362
            ek4 r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            java.util.ArrayList r0 = r2.l
            hj3 r1 = r14.b
            eo6 r1 = r1.d
            ek4 r1 = r1.e
            r0.add(r1)
            r2.a = r14
        L_0x0362:
            java.util.ArrayList r14 = r2.l
            int r14 = r14.size()
            if (r14 != 0) goto L_0x036c
            r2.c = r5
        L_0x036c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocf.d():void");
    }

    public final void e() {
        sh4 sh4 = this.h;
        if (sh4.j) {
            this.b.Z = sh4.g;
        }
    }

    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        sh4 sh4 = this.h;
        sh4.c();
        sh4.j = false;
        sh4 sh42 = this.i;
        sh42.c();
        sh42.j = false;
        sh4 sh43 = this.k;
        sh43.c();
        sh43.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
