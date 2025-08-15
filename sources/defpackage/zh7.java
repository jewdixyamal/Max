package defpackage;

import java.util.Arrays;

/* renamed from: zh7  reason: default package */
public final class zh7 {
    public static boolean p = false;
    public static int q = 1000;
    public boolean a;
    public int b;
    public final c9b c;
    public int d;
    public int e;
    public ws[] f;
    public boolean g;
    public boolean[] h;
    public int i;
    public int j;
    public int k;
    public final cjg l;
    public sud[] m;
    public int n;
    public ws o;

    /* JADX WARNING: type inference failed for: r2v6, types: [cjg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [ws, c9b] */
    public zh7() {
        this.a = false;
        this.b = 0;
        this.d = 32;
        this.e = 32;
        this.f = null;
        this.g = false;
        this.h = new boolean[32];
        this.i = 1;
        this.j = 0;
        this.k = 32;
        this.m = new sud[q];
        this.n = 0;
        this.f = new ws[32];
        s();
        ? obj = new Object();
        obj.a = new u5b();
        obj.b = new u5b();
        obj.c = new sud[32];
        this.l = obj;
        ? wsVar = new ws(obj);
        wsVar.f = new sud[128];
        wsVar.g = new sud[128];
        wsVar.h = 0;
        wsVar.i = new b9b((c9b) wsVar);
        this.c = wsVar;
        this.o = new ws(obj);
    }

    public static int n(Object obj) {
        sud sud = ((oi3) obj).i;
        if (sud != null) {
            return (int) (sud.X + 0.5f);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: sud} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.sud a(int r6) {
        /*
            r5 = this;
            cjg r0 = r5.l
            java.lang.Object r0 = r0.b
            u5b r0 = (defpackage.u5b) r0
            int r1 = r0.b
            r2 = 0
            if (r1 <= 0) goto L_0x0016
            int r1 = r1 + -1
            java.lang.Object[] r3 = r0.a
            r4 = r3[r1]
            r3[r1] = r2
            r0.b = r1
            r2 = r4
        L_0x0016:
            sud r2 = (defpackage.sud) r2
            if (r2 != 0) goto L_0x0022
            sud r2 = new sud
            r2.<init>(r6)
            r2.w0 = r6
            goto L_0x0027
        L_0x0022:
            r2.c()
            r2.w0 = r6
        L_0x0027:
            int r6 = r5.n
            int r0 = q
            if (r6 < r0) goto L_0x003b
            int r0 = r0 * 2
            q = r0
            sud[] r6 = r5.m
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            sud[] r6 = (defpackage.sud[]) r6
            r5.m = r6
        L_0x003b:
            sud[] r6 = r5.m
            int r0 = r5.n
            int r1 = r0 + 1
            r5.n = r1
            r6[r0] = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh7.a(int):sud");
    }

    public final void b(sud sud, sud sud2, int i2, float f2, sud sud3, sud sud4, int i3, int i4) {
        ws l2 = l();
        if (sud2 == sud3) {
            l2.d.j(sud, 1.0f);
            l2.d.j(sud4, 1.0f);
            l2.d.j(sud2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.d.j(sud, 1.0f);
            l2.d.j(sud2, -1.0f);
            l2.d.j(sud3, -1.0f);
            l2.d.j(sud4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                l2.b = (float) ((-i2) + i3);
            }
        } else if (f2 <= 0.0f) {
            l2.d.j(sud, -1.0f);
            l2.d.j(sud2, 1.0f);
            l2.b = (float) i2;
        } else if (f2 >= 1.0f) {
            l2.d.j(sud4, -1.0f);
            l2.d.j(sud3, 1.0f);
            l2.b = (float) (-i3);
        } else {
            float f3 = 1.0f - f2;
            l2.d.j(sud, f3 * 1.0f);
            l2.d.j(sud2, f3 * -1.0f);
            l2.d.j(sud3, -1.0f * f2);
            l2.d.j(sud4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                l2.b = (((float) i3) * f2) + (((float) (-i2)) * f3);
            }
        }
        if (i4 != 8) {
            l2.a(this, i4);
        }
        c(l2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        if (r4.v0 <= 1) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c6, code lost:
        if (r4.v0 <= 1) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00db, code lost:
        if (r4.v0 <= 1) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e8, code lost:
        if (r4.v0 <= 1) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.ws r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.k
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.i
            int r2 = r2 + r3
            int r4 = r0.e
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.o()
        L_0x0016:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x01a6
            ws[] r2 = r0.f
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x007d
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x006d
            ks r6 = r1.d
            int r6 = r6.f()
            r7 = 0
        L_0x002b:
            java.util.ArrayList r8 = r1.c
            if (r7 >= r6) goto L_0x0044
            ks r9 = r1.d
            sud r9 = r9.g(r7)
            int r10 = r9.c
            if (r10 != r5) goto L_0x003e
            boolean r10 = r9.Y
            if (r10 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r8.add(r9)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            int r6 = r8.size()
            if (r6 <= 0) goto L_0x006b
            r7 = 0
        L_0x004b:
            if (r7 >= r6) goto L_0x0067
            java.lang.Object r9 = r8.get(r7)
            sud r9 = (defpackage.sud) r9
            boolean r10 = r9.Y
            if (r10 == 0) goto L_0x005b
            r1.h(r0, r9, r3)
            goto L_0x0064
        L_0x005b:
            ws[] r10 = r0.f
            int r9 = r9.c
            r9 = r10[r9]
            r1.i(r0, r9, r3)
        L_0x0064:
            int r7 = r7 + 1
            goto L_0x004b
        L_0x0067:
            r8.clear()
            goto L_0x0022
        L_0x006b:
            r2 = r3
            goto L_0x0022
        L_0x006d:
            sud r2 = r1.a
            if (r2 == 0) goto L_0x007d
            ks r2 = r1.d
            int r2 = r2.f()
            if (r2 != 0) goto L_0x007d
            r1.e = r3
            r0.a = r3
        L_0x007d:
            boolean r2 = r17.e()
            if (r2 == 0) goto L_0x0084
            return
        L_0x0084:
            float r2 = r1.b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0095
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.b = r2
            ks r2 = r1.d
            r2.i()
        L_0x0095:
            ks r2 = r1.d
            int r2 = r2.f()
            r7 = 0
            r11 = r6
            r13 = r11
            r9 = r7
            r10 = r9
            r8 = 0
            r12 = 0
            r14 = 0
        L_0x00a3:
            if (r8 >= r2) goto L_0x00f7
            ks r15 = r1.d
            float r15 = r15.h(r8)
            ks r4 = r1.d
            sud r4 = r4.g(r8)
            int r5 = r4.w0
            if (r5 != r3) goto L_0x00d1
            if (r9 != 0) goto L_0x00c0
            int r5 = r4.v0
            if (r5 > r3) goto L_0x00bc
            goto L_0x00cf
        L_0x00bc:
            r12 = 0
        L_0x00bd:
            r9 = r4
            r11 = r15
            goto L_0x00f3
        L_0x00c0:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c9
            int r5 = r4.v0
            if (r5 > r3) goto L_0x00bc
            goto L_0x00cf
        L_0x00c9:
            if (r12 != 0) goto L_0x00f3
            int r5 = r4.v0
            if (r5 > r3) goto L_0x00f3
        L_0x00cf:
            r12 = r3
            goto L_0x00bd
        L_0x00d1:
            if (r9 != 0) goto L_0x00f3
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00f3
            if (r10 != 0) goto L_0x00e2
            int r5 = r4.v0
            if (r5 > r3) goto L_0x00de
            goto L_0x00f1
        L_0x00de:
            r14 = 0
        L_0x00df:
            r10 = r4
            r13 = r15
            goto L_0x00f3
        L_0x00e2:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00eb
            int r5 = r4.v0
            if (r5 > r3) goto L_0x00de
            goto L_0x00f1
        L_0x00eb:
            if (r14 != 0) goto L_0x00f3
            int r5 = r4.v0
            if (r5 > r3) goto L_0x00f3
        L_0x00f1:
            r14 = r3
            goto L_0x00df
        L_0x00f3:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00a3
        L_0x00f7:
            if (r9 == 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r9 = r10
        L_0x00fb:
            if (r9 != 0) goto L_0x00ff
            r2 = r3
            goto L_0x0103
        L_0x00ff:
            r1.g(r9)
            r2 = 0
        L_0x0103:
            ks r4 = r1.d
            int r4 = r4.f()
            if (r4 != 0) goto L_0x010d
            r1.e = r3
        L_0x010d:
            if (r2 == 0) goto L_0x0195
            int r2 = r0.i
            int r2 = r2 + r3
            int r4 = r0.e
            if (r2 < r4) goto L_0x0119
            r16.o()
        L_0x0119:
            r2 = 3
            sud r2 = r0.a(r2)
            int r4 = r0.b
            int r4 = r4 + r3
            r0.b = r4
            int r5 = r0.i
            int r5 = r5 + r3
            r0.i = r5
            r2.b = r4
            cjg r5 = r0.l
            java.lang.Object r8 = r5.c
            sud[] r8 = (defpackage.sud[]) r8
            r8[r4] = r2
            r1.a = r2
            int r4 = r0.j
            r16.h(r17)
            int r8 = r0.j
            int r4 = r4 + r3
            if (r8 != r4) goto L_0x0195
            ws r4 = r0.o
            r4.getClass()
            r4.a = r7
            ks r8 = r4.d
            r8.b()
            r8 = 0
        L_0x014b:
            ks r9 = r1.d
            int r9 = r9.f()
            if (r8 >= r9) goto L_0x0167
            ks r9 = r1.d
            sud r9 = r9.g(r8)
            ks r10 = r1.d
            float r10 = r10.h(r8)
            ks r11 = r4.d
            r11.a(r9, r10, r3)
            int r8 = r8 + 1
            goto L_0x014b
        L_0x0167:
            ws r4 = r0.o
            r0.r(r4)
            int r4 = r2.c
            r8 = -1
            if (r4 != r8) goto L_0x0193
            sud r4 = r1.a
            if (r4 != r2) goto L_0x017e
            sud r2 = r1.f(r7, r2)
            if (r2 == 0) goto L_0x017e
            r1.g(r2)
        L_0x017e:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x0187
            sud r2 = r1.a
            r2.e(r0, r1)
        L_0x0187:
            java.lang.Object r2 = r5.a
            u5b r2 = (defpackage.u5b) r2
            r2.a(r1)
            int r2 = r0.j
            int r2 = r2 - r3
            r0.j = r2
        L_0x0193:
            r4 = r3
            goto L_0x0196
        L_0x0195:
            r4 = 0
        L_0x0196:
            sud r2 = r1.a
            if (r2 == 0) goto L_0x01a5
            int r2 = r2.w0
            if (r2 == r3) goto L_0x01a7
            float r2 = r1.b
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x01a5
            goto L_0x01a7
        L_0x01a5:
            return
        L_0x01a6:
            r4 = 0
        L_0x01a7:
            if (r4 != 0) goto L_0x01ac
            r16.h(r17)
        L_0x01ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh7.c(ws):void");
    }

    public final void d(sud sud, int i2) {
        int i3 = sud.c;
        if (i3 == -1) {
            sud.d(this, (float) i2);
            for (int i4 = 0; i4 < this.b + 1; i4++) {
                sud sud2 = ((sud[]) this.l.c)[i4];
            }
        } else if (i3 != -1) {
            ws wsVar = this.f[i3];
            if (wsVar.e) {
                wsVar.b = (float) i2;
            } else if (wsVar.d.f() == 0) {
                wsVar.e = true;
                wsVar.b = (float) i2;
            } else {
                ws l2 = l();
                if (i2 < 0) {
                    l2.b = (float) (i2 * -1);
                    l2.d.j(sud, 1.0f);
                } else {
                    l2.b = (float) i2;
                    l2.d.j(sud, -1.0f);
                }
                c(l2);
            }
        } else {
            ws l3 = l();
            l3.a = sud;
            float f2 = (float) i2;
            sud.X = f2;
            l3.b = f2;
            l3.e = true;
            c(l3);
        }
    }

    public final void e(sud sud, sud sud2, int i2, int i3) {
        if (i3 == 8 && sud2.Y && sud.c == -1) {
            sud.d(this, sud2.X + ((float) i2));
            return;
        }
        ws l2 = l();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            l2.b = (float) i2;
        }
        if (!z) {
            l2.d.j(sud, -1.0f);
            l2.d.j(sud2, 1.0f);
        } else {
            l2.d.j(sud, 1.0f);
            l2.d.j(sud2, -1.0f);
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    public final void f(sud sud, sud sud2, int i2, int i3) {
        ws l2 = l();
        sud m2 = m();
        m2.o = 0;
        l2.b(sud, sud2, m2, i2);
        if (i3 != 8) {
            l2.d.j(j(i3), (float) ((int) (l2.d.e(m2) * -1.0f)));
        }
        c(l2);
    }

    public final void g(sud sud, sud sud2, int i2, int i3) {
        ws l2 = l();
        sud m2 = m();
        m2.o = 0;
        l2.c(sud, sud2, m2, i2);
        if (i3 != 8) {
            l2.d.j(j(i3), (float) ((int) (l2.d.e(m2) * -1.0f)));
        }
        c(l2);
    }

    public final void h(ws wsVar) {
        int i2;
        if (wsVar.e) {
            wsVar.a.d(this, wsVar.b);
        } else {
            ws[] wsVarArr = this.f;
            int i3 = this.j;
            wsVarArr[i3] = wsVar;
            sud sud = wsVar.a;
            sud.c = i3;
            this.j = i3 + 1;
            sud.e(this, wsVar);
        }
        if (this.a) {
            int i4 = 0;
            while (i4 < this.j) {
                if (this.f[i4] == null) {
                    System.out.println("WTF");
                }
                ws wsVar2 = this.f[i4];
                if (wsVar2 != null && wsVar2.e) {
                    wsVar2.a.d(this, wsVar2.b);
                    ((u5b) this.l.a).a(wsVar2);
                    this.f[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.j;
                        if (i5 >= i2) {
                            break;
                        }
                        ws[] wsVarArr2 = this.f;
                        int i7 = i5 - 1;
                        ws wsVar3 = wsVarArr2[i5];
                        wsVarArr2[i7] = wsVar3;
                        sud sud2 = wsVar3.a;
                        if (sud2.c == i5) {
                            sud2.c = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f[i6] = null;
                    }
                    this.j = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i2 = 0; i2 < this.j; i2++) {
            ws wsVar = this.f[i2];
            wsVar.a.X = wsVar.b;
        }
    }

    public final sud j(int i2) {
        if (this.i + 1 >= this.e) {
            o();
        }
        sud a2 = a(4);
        int i3 = this.b + 1;
        this.b = i3;
        this.i++;
        a2.b = i3;
        a2.o = i2;
        ((sud[]) this.l.c)[i3] = a2;
        c9b c9b = this.c;
        c9b.i.b = a2;
        float[] fArr = a2.s0;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.o] = 1.0f;
        c9b.j(a2);
        return a2;
    }

    public final sud k(Object obj) {
        sud sud = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (obj instanceof oi3) {
            oi3 oi3 = (oi3) obj;
            sud = oi3.i;
            if (sud == null) {
                oi3.k();
                sud = oi3.i;
            }
            int i2 = sud.b;
            cjg cjg = this.l;
            if (i2 == -1 || i2 > this.b || ((sud[]) cjg.c)[i2] == null) {
                if (i2 != -1) {
                    sud.c();
                }
                int i3 = this.b + 1;
                this.b = i3;
                this.i++;
                sud.b = i3;
                sud.w0 = 1;
                ((sud[]) cjg.c)[i3] = sud;
            }
        }
        return sud;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: ws} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ws l() {
        /*
            r5 = this;
            cjg r5 = r5.l
            java.lang.Object r0 = r5.a
            u5b r0 = (defpackage.u5b) r0
            int r1 = r0.b
            r2 = 0
            if (r1 <= 0) goto L_0x0016
            int r1 = r1 + -1
            java.lang.Object[] r3 = r0.a
            r4 = r3[r1]
            r3[r1] = r2
            r0.b = r1
            goto L_0x0017
        L_0x0016:
            r4 = r2
        L_0x0017:
            ws r4 = (defpackage.ws) r4
            if (r4 != 0) goto L_0x0021
            ws r4 = new ws
            r4.<init>(r5)
            goto L_0x002e
        L_0x0021:
            r4.a = r2
            ks r5 = r4.d
            r5.b()
            r5 = 0
            r4.b = r5
            r5 = 0
            r4.e = r5
        L_0x002e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh7.l():ws");
    }

    public final sud m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        sud a2 = a(3);
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        a2.b = i2;
        ((sud[]) this.l.c)[i2] = a2;
        return a2;
    }

    public final void o() {
        int i2 = this.d * 2;
        this.d = i2;
        this.f = (ws[]) Arrays.copyOf(this.f, i2);
        cjg cjg = this.l;
        cjg.c = (sud[]) Arrays.copyOf((sud[]) cjg.c, this.d);
        int i3 = this.d;
        this.h = new boolean[i3];
        this.e = i3;
        this.k = i3;
    }

    public final void p() {
        c9b c9b = this.c;
        if (c9b.e()) {
            i();
        } else if (this.g) {
            for (int i2 = 0; i2 < this.j; i2++) {
                if (!this.f[i2].e) {
                    q(c9b);
                    return;
                }
            }
            i();
        } else {
            q(c9b);
        }
    }

    public final void q(ws wsVar) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.j) {
                break;
            }
            ws wsVar2 = this.f[i2];
            int i3 = 1;
            if (wsVar2.a.w0 != 1) {
                float f2 = 0.0f;
                if (wsVar2.b < 0.0f) {
                    boolean z = false;
                    int i4 = 0;
                    while (!z) {
                        i4 += i3;
                        float f3 = Float.MAX_VALUE;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < this.j) {
                            ws wsVar3 = this.f[i7];
                            if (wsVar3.a.w0 != i3 && !wsVar3.e && wsVar3.b < f2) {
                                int f4 = wsVar3.d.f();
                                int i9 = 0;
                                while (i9 < f4) {
                                    sud g2 = wsVar3.d.g(i9);
                                    float e2 = wsVar3.d.e(g2);
                                    if (e2 > f2) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f5 = g2.Z[i10] / e2;
                                            if ((f5 < f3 && i10 == i8) || i10 > i8) {
                                                i8 = i10;
                                                i6 = g2.b;
                                                i5 = i7;
                                                f3 = f5;
                                            }
                                        }
                                    }
                                    i9++;
                                    f2 = 0.0f;
                                }
                            }
                            i7++;
                            f2 = 0.0f;
                            i3 = 1;
                        }
                        if (i5 != -1) {
                            ws wsVar4 = this.f[i5];
                            wsVar4.a.c = -1;
                            wsVar4.g(((sud[]) this.l.c)[i6]);
                            sud sud = wsVar4.a;
                            sud.c = i5;
                            sud.e(this, wsVar4);
                        } else {
                            z = true;
                        }
                        if (i4 > this.i / 2) {
                            z = true;
                        }
                        f2 = 0.0f;
                        i3 = 1;
                    }
                }
            }
            i2++;
        }
        r(wsVar);
        i();
    }

    public final void r(ws wsVar) {
        for (int i2 = 0; i2 < this.i; i2++) {
            this.h[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            if (i3 < this.i * 2) {
                sud sud = wsVar.a;
                if (sud != null) {
                    this.h[sud.b] = true;
                }
                sud d2 = wsVar.d(this.h);
                if (d2 != null) {
                    boolean[] zArr = this.h;
                    int i4 = d2.b;
                    if (!zArr[i4]) {
                        zArr[i4] = true;
                    } else {
                        return;
                    }
                }
                if (d2 != null) {
                    float f2 = Float.MAX_VALUE;
                    int i5 = -1;
                    for (int i6 = 0; i6 < this.j; i6++) {
                        ws wsVar2 = this.f[i6];
                        if (wsVar2.a.w0 != 1 && !wsVar2.e && wsVar2.d.c(d2)) {
                            float e2 = wsVar2.d.e(d2);
                            if (e2 < 0.0f) {
                                float f3 = (-wsVar2.b) / e2;
                                if (f3 < f2) {
                                    i5 = i6;
                                    f2 = f3;
                                }
                            }
                        }
                    }
                    if (i5 > -1) {
                        ws wsVar3 = this.f[i5];
                        wsVar3.a.c = -1;
                        wsVar3.g(d2);
                        sud sud2 = wsVar3.a;
                        sud2.c = i5;
                        sud2.e(this, wsVar3);
                    }
                } else {
                    z = true;
                }
            } else {
                return;
            }
        }
    }

    public final void s() {
        for (int i2 = 0; i2 < this.j; i2++) {
            ws wsVar = this.f[i2];
            if (wsVar != null) {
                ((u5b) this.l.a).a(wsVar);
            }
            this.f[i2] = null;
        }
    }

    public final void t() {
        cjg cjg;
        int i2 = 0;
        while (true) {
            cjg = this.l;
            sud[] sudArr = (sud[]) cjg.c;
            if (i2 >= sudArr.length) {
                break;
            }
            sud sud = sudArr[i2];
            if (sud != null) {
                sud.c();
            }
            i2++;
        }
        u5b u5b = (u5b) cjg.b;
        sud[] sudArr2 = this.m;
        int i3 = this.n;
        u5b.getClass();
        if (i3 > sudArr2.length) {
            i3 = sudArr2.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            sud sud2 = sudArr2[i4];
            int i5 = u5b.b;
            Object[] objArr = u5b.a;
            if (i5 < objArr.length) {
                objArr[i5] = sud2;
                u5b.b = i5 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((sud[]) cjg.c, (Object) null);
        this.b = 0;
        c9b c9b = this.c;
        c9b.h = 0;
        c9b.b = 0.0f;
        this.i = 1;
        for (int i6 = 0; i6 < this.j; i6++) {
            ws wsVar = this.f[i6];
        }
        s();
        this.j = 0;
        this.o = new ws(cjg);
    }
}
