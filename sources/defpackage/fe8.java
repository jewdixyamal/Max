package defpackage;

import android.os.Handler;
import android.util.Pair;

/* renamed from: fe8  reason: default package */
public final class fe8 {
    public final gue a = new gue();
    public final jue b = new jue();
    public final h74 c;
    public final Handler d;
    public long e;
    public int f;
    public boolean g;
    public ae8 h;
    public ae8 i;
    public ae8 j;
    public int k;
    public Object l;
    public long m;

    public fe8(h74 h74, Handler handler) {
        this.c = h74;
        this.d = handler;
    }

    public static xj8 l(lue lue, Object obj, long j2, long j3, jue jue, gue gue) {
        lue.h(obj, gue);
        lue.o(gue.c, jue);
        int b2 = lue.b(obj);
        Object obj2 = obj;
        while (gue.o == 0) {
            r8 r8Var = gue.Z;
            if (r8Var.a <= 0 || !gue.g(r8Var.o) || gue.c(0) != -1) {
                break;
            }
            int i2 = b2 + 1;
            if (b2 >= jue.A0) {
                break;
            }
            lue.g(i2, gue, true);
            obj2 = gue.b;
            obj2.getClass();
            b2 = i2;
        }
        lue.h(obj2, gue);
        int c2 = gue.c(j2);
        return c2 == -1 ? new xj8(obj2, j3, gue.b(j2)) : new ce8(obj2, c2, gue.e(c2), j3, -1);
    }

    public final ae8 a() {
        ae8 ae8 = this.h;
        if (ae8 == null) {
            return null;
        }
        if (ae8 == this.i) {
            this.i = ae8.l;
        }
        ae8.f();
        int i2 = this.k - 1;
        this.k = i2;
        if (i2 == 0) {
            this.j = null;
            ae8 ae82 = this.h;
            this.l = ae82.b;
            this.m = ae82.f.a.d;
        }
        this.h = this.h.l;
        j();
        return this.h;
    }

    public final void b() {
        if (this.k != 0) {
            ae8 ae8 = this.h;
            np8.g(ae8);
            this.l = ae8.b;
            this.m = ae8.f.a.d;
            while (ae8 != null) {
                ae8.f();
                ae8 = ae8.l;
            }
            this.h = null;
            this.j = null;
            this.i = null;
            this.k = 0;
            j();
        }
    }

    public final de8 c(lue lue, ae8 ae8, long j2) {
        long j3;
        long j4;
        long j5;
        xj8 xj8;
        long j6;
        long j7;
        long j8;
        long j9;
        lue lue2 = lue;
        ae8 ae82 = ae8;
        de8 de8 = ae82.f;
        long j10 = (ae82.o + de8.e) - j2;
        gue gue = this.a;
        boolean z = de8.g;
        boolean z2 = true;
        long j11 = de8.c;
        xj8 xj82 = de8.a;
        if (z) {
            xj8 xj83 = xj82;
            long j12 = j11;
            int d2 = lue.d(lue2.b(xj82.a), this.a, this.b, this.f, this.g);
            if (d2 == -1) {
                return null;
            }
            int i2 = lue2.g(d2, gue, true).c;
            Object obj = gue.b;
            obj.getClass();
            if (lue2.n(i2, this.b, 0).z0 == d2) {
                Pair k2 = lue.k(this.b, this.a, i2, -9223372036854775807L, Math.max(0, j10));
                if (k2 == null) {
                    return null;
                }
                obj = k2.first;
                long longValue = ((Long) k2.second).longValue();
                ae8 ae83 = ae82.l;
                if (ae83 == null || !ae83.b.equals(obj)) {
                    j9 = this.e;
                    this.e = 1 + j9;
                } else {
                    j9 = ae83.f.a.d;
                }
                j5 = longValue;
                xj8 = xj83;
                j6 = j9;
                j4 = -9223372036854775807L;
            } else {
                xj8 = xj83;
                j5 = 0;
                j4 = 0;
                j6 = xj8.d;
            }
            xj8 l2 = l(lue, obj, j5, j6, this.b, this.a);
            if (!(j4 == -9223372036854775807L || j12 == -9223372036854775807L)) {
                if (lue2.h(xj8.a, gue).Z.a <= 0 || !gue.g(gue.Z.o)) {
                    z2 = false;
                }
                if (l2.a() && z2) {
                    j7 = j5;
                    j8 = j12;
                    return d(lue, l2, j8, j7);
                } else if (z2) {
                    j8 = j4;
                    j7 = j12;
                    return d(lue, l2, j8, j7);
                }
            }
            j7 = j5;
            j8 = j4;
            return d(lue, l2, j8, j7);
        }
        xj8 xj84 = xj82;
        long j13 = j11;
        lue2.h(xj84.a, gue);
        boolean a2 = xj84.a();
        Object obj2 = xj84.a;
        if (a2) {
            r8 r8Var = gue.Z;
            int i3 = xj84.b;
            int i4 = r8Var.a(i3).b;
            if (i4 == -1) {
                return null;
            }
            int a3 = gue.Z.a(i3).a(xj84.c);
            if (a3 < i4) {
                return e(lue, xj84.a, i3, a3, de8.c, xj84.d);
            }
            if (j13 == -9223372036854775807L) {
                Pair k3 = lue.k(this.b, gue, gue.c, -9223372036854775807L, Math.max(0, j10));
                if (k3 == null) {
                    return null;
                }
                j3 = ((Long) k3.second).longValue();
            } else {
                j3 = j13;
            }
            lue2.h(obj2, gue);
            r8 r8Var2 = gue.Z;
            int i5 = xj84.b;
            long j14 = r8Var2.a(i5).a;
            return f(lue, xj84.a, Math.max(j14 == Long.MIN_VALUE ? gue.o : gue.Z.a(i5).Y + j14, j3), de8.c, xj84.d);
        }
        int i6 = xj84.e;
        int e2 = gue.e(i6);
        if (!gue.g(i6) || gue.d(i6, e2) != 3) {
            z2 = false;
        }
        if (e2 == gue.Z.a(i6).b || z2) {
            lue2.h(obj2, gue);
            long j15 = gue.Z.a(i6).a;
            return f(lue, xj84.a, j15 == Long.MIN_VALUE ? gue.o : j15 + gue.Z.a(i6).Y, de8.e, xj84.d);
        }
        return e(lue, xj84.a, xj84.e, e2, de8.e, xj84.d);
    }

    public final de8 d(lue lue, xj8 xj8, long j2, long j3) {
        xj8 xj82 = xj8;
        lue lue2 = lue;
        lue.h(xj82.a, this.a);
        if (xj8.a()) {
            int i2 = xj82.c;
            long j4 = xj82.d;
            return e(lue, xj82.a, xj82.b, i2, j2, j4);
        }
        return f(lue, xj82.a, j3, j2, xj82.d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: ce8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: xj8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.de8 e(defpackage.lue r18, java.lang.Object r19, int r20, int r21, long r22, long r24) {
        /*
            r17 = this;
            r7 = r20
            r8 = r21
            xj8 r9 = new xj8
            r6 = -1
            r0 = r9
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r24
            r0.<init>(r1, r2, r3, r4, r6)
            r0 = r17
            gue r0 = r0.a
            r1 = r18
            r2 = r19
            gue r1 = r1.h(r2, r0)
            long r10 = r1.a(r7, r8)
            int r1 = r0.e(r7)
            r2 = 0
            if (r8 != r1) goto L_0x0030
            r8 r1 = r0.Z
            long r4 = r1.b
            goto L_0x0031
        L_0x0030:
            r4 = r2
        L_0x0031:
            boolean r12 = r0.g(r7)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x004c
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x004c
            r0 = 1
            long r0 = r10 - r0
            long r0 = java.lang.Math.max(r2, r0)
            r2 = r0
            goto L_0x004d
        L_0x004c:
            r2 = r4
        L_0x004d:
            de8 r14 = new de8
            r13 = 0
            r15 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = 0
            r0 = r14
            r1 = r9
            r4 = r22
            r8 = r10
            r10 = r12
            r11 = r16
            r12 = r13
            r13 = r15
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe8.e(lue, java.lang.Object, int, int, long, long):de8");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.de8 f(defpackage.lue r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            gue r5 = r0.a
            r1.h(r2, r5)
            int r6 = r5.b(r3)
            r7 = 1
            r8 = 0
            r9 = -1
            if (r6 != r9) goto L_0x0026
            r8 r10 = r5.Z
            int r11 = r10.a
            if (r11 <= 0) goto L_0x005c
            int r10 = r10.o
            boolean r10 = r5.g(r10)
            if (r10 == 0) goto L_0x005c
            r10 = r7
            goto L_0x005d
        L_0x0026:
            boolean r10 = r5.g(r6)
            if (r10 == 0) goto L_0x005c
            r8 r10 = r5.Z
            p8 r10 = r10.a(r6)
            long r10 = r10.a
            long r12 = r5.o
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x005c
            r8 r10 = r5.Z
            p8 r10 = r10.a(r6)
            int r11 = r10.b
            if (r11 != r9) goto L_0x0046
        L_0x0044:
            r10 = r7
            goto L_0x0056
        L_0x0046:
            r12 = r8
        L_0x0047:
            if (r12 >= r11) goto L_0x0055
            int[] r13 = r10.o
            r13 = r13[r12]
            if (r13 == 0) goto L_0x0044
            if (r13 != r7) goto L_0x0052
            goto L_0x0044
        L_0x0052:
            int r12 = r12 + 1
            goto L_0x0047
        L_0x0055:
            r10 = r8
        L_0x0056:
            r10 = r10 ^ r7
            if (r10 == 0) goto L_0x005c
            r10 = r7
            r6 = r9
            goto L_0x005d
        L_0x005c:
            r10 = r8
        L_0x005d:
            xj8 r12 = new xj8
            r13 = r32
            r12.<init>(r2, r13, r6)
            boolean r2 = r12.a()
            if (r2 != 0) goto L_0x006e
            if (r6 != r9) goto L_0x006e
            r2 = r7
            goto L_0x006f
        L_0x006e:
            r2 = r8
        L_0x006f:
            boolean r23 = r0.i(r1, r12)
            boolean r24 = r0.h(r1, r12, r2)
            if (r6 == r9) goto L_0x0082
            boolean r0 = r5.g(r6)
            if (r0 == 0) goto L_0x0082
            r21 = r7
            goto L_0x0084
        L_0x0082:
            r21 = r8
        L_0x0084:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == r9) goto L_0x0096
            r8 r7 = r5.Z
            p8 r6 = r7.a(r6)
            long r6 = r6.a
        L_0x0093:
            r17 = r6
            goto L_0x009d
        L_0x0096:
            if (r10 == 0) goto L_0x009b
            long r6 = r5.o
            goto L_0x0093
        L_0x009b:
            r17 = r0
        L_0x009d:
            int r6 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x00ab
            r6 = -9223372036854775808
            int r6 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00a8
            goto L_0x00ab
        L_0x00a8:
            r19 = r17
            goto L_0x00af
        L_0x00ab:
            long r5 = r5.o
            r19 = r5
        L_0x00af:
            int r0 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00c3
            int r0 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r0 < 0) goto L_0x00c3
            r0 = 1
            long r0 = r19 - r0
            r3 = 0
            long r0 = java.lang.Math.max(r3, r0)
            r13 = r0
            goto L_0x00c4
        L_0x00c3:
            r13 = r3
        L_0x00c4:
            de8 r0 = new de8
            r11 = r0
            r15 = r30
            r22 = r2
            r11.<init>(r12, r13, r15, r17, r19, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe8.f(lue, java.lang.Object, long, long, long):de8");
    }

    public final de8 g(lue lue, de8 de8) {
        lue lue2 = lue;
        de8 de82 = de8;
        xj8 xj8 = de82.a;
        boolean a2 = xj8.a();
        int i2 = xj8.e;
        boolean z = !a2 && i2 == -1;
        boolean i3 = i(lue2, xj8);
        boolean h2 = h(lue2, xj8, z);
        Object obj = de82.a.a;
        gue gue = this.a;
        lue2.h(obj, gue);
        long j2 = (xj8.a() || i2 == -1) ? -9223372036854775807L : gue.Z.a(i2).a;
        boolean a3 = xj8.a();
        int i4 = xj8.b;
        return new de8(xj8, de82.b, de82.c, j2, a3 ? gue.a(i4, xj8.c) : (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? gue.o : j2, xj8.a() ? gue.g(i4) : i2 != -1 && gue.g(i2), z, i3, h2);
    }

    public final boolean h(lue lue, xj8 xj8, boolean z) {
        int b2 = lue.b(xj8.a);
        if (lue.n(lue.g(b2, this.a, false).c, this.b, 0).t0) {
            return false;
        }
        return lue.d(b2, this.a, this.b, this.f, this.g) == -1 && z;
    }

    public final boolean i(lue lue, xj8 xj8) {
        if (!(!xj8.a() && xj8.e == -1)) {
            return false;
        }
        Object obj = xj8.a;
        return lue.n(lue.h(obj, this.a).c, this.b, 0).A0 == lue.b(obj);
    }

    public final void j() {
        ww6 i2 = zw6.i();
        for (ae8 ae8 = this.h; ae8 != null; ae8 = ae8.l) {
            i2.a(ae8.f.a);
        }
        ae8 ae82 = this.i;
        this.d.post(new v05((Object) this, (Object) i2, (Object) ae82 == null ? null : ae82.f.a, 11));
    }

    public final boolean k(ae8 ae8) {
        boolean z = false;
        np8.f(ae8 != null);
        if (ae8.equals(this.j)) {
            return false;
        }
        this.j = ae8;
        while (true) {
            ae8 = ae8.l;
            if (ae8 == null) {
                break;
            }
            if (ae8 == this.i) {
                this.i = this.h;
                z = true;
            }
            ae8.f();
            this.k--;
        }
        ae8 ae82 = this.j;
        if (ae82.l != null) {
            ae82.b();
            ae82.l = null;
            ae82.c();
        }
        j();
        return z;
    }

    public final xj8 m(lue lue, Object obj, long j2) {
        long j3;
        int b2;
        lue lue2 = lue;
        Object obj2 = obj;
        gue gue = this.a;
        int i2 = lue2.h(obj2, gue).c;
        Object obj3 = this.l;
        if (obj3 == null || (b2 = lue2.b(obj3)) == -1 || lue2.g(b2, gue, false).c != i2) {
            ae8 ae8 = this.h;
            while (true) {
                if (ae8 == null) {
                    ae8 ae82 = this.h;
                    while (true) {
                        if (ae82 != null) {
                            int b3 = lue2.b(ae82.b);
                            if (b3 != -1 && lue2.g(b3, gue, false).c == i2) {
                                j3 = ae82.f.a.d;
                                break;
                            }
                            ae82 = ae82.l;
                        } else {
                            j3 = this.e;
                            this.e = 1 + j3;
                            if (this.h == null) {
                                this.l = obj2;
                                this.m = j3;
                            }
                        }
                    }
                } else if (ae8.b.equals(obj2)) {
                    j3 = ae8.f.a.d;
                    break;
                } else {
                    ae8 = ae8.l;
                }
            }
        } else {
            j3 = this.m;
        }
        lue2.h(obj2, gue);
        int i3 = gue.c;
        jue jue = this.b;
        lue2.o(i3, jue);
        boolean z = false;
        for (int b4 = lue.b(obj); b4 >= jue.z0; b4--) {
            boolean z2 = true;
            lue2.g(b4, gue, true);
            if (gue.Z.a <= 0) {
                z2 = false;
            }
            z |= z2;
            if (gue.c(gue.o) != -1) {
                obj2 = gue.b;
                obj2.getClass();
            }
            if (z && (!z2 || gue.o != 0)) {
                break;
            }
        }
        return l(lue, obj2, j2, j3, this.b, this.a);
    }

    public final boolean n(lue lue) {
        ae8 ae8;
        ae8 ae82 = this.h;
        if (ae82 == null) {
            return true;
        }
        int b2 = lue.b(ae82.b);
        while (true) {
            lue lue2 = lue;
            b2 = lue2.d(b2, this.a, this.b, this.f, this.g);
            while (true) {
                ae8 = ae82.l;
                if (ae8 != null && !ae82.f.g) {
                    ae82 = ae8;
                }
            }
            if (b2 == -1 || ae8 == null || lue.b(ae8.b) != b2) {
                boolean k2 = k(ae82);
                ae82.f = g(lue, ae82.f);
            } else {
                ae82 = ae8;
            }
        }
        boolean k22 = k(ae82);
        ae82.f = g(lue, ae82.f);
        return !k22;
    }

    public final boolean o(lue lue, long j2, long j3) {
        de8 de8;
        ae8 ae8 = this.h;
        ae8 ae82 = null;
        while (ae8 != null) {
            de8 de82 = ae8.f;
            if (ae82 == null) {
                de8 = g(lue, de82);
            } else {
                de8 c2 = c(lue, ae82, j2);
                if (c2 == null) {
                    return !k(ae82);
                }
                if (de82.b != c2.b || !de82.a.equals(c2.a)) {
                    return !k(ae82);
                }
                de8 = c2;
            }
            ae8.f = de8.a(de82.c);
            long j4 = de82.e;
            if (j4 != -9223372036854775807L) {
                long j5 = de8.e;
                if (j4 != j5) {
                    ae8.h();
                    return !k(ae8) && !(ae8 == this.i && !ae8.f.f && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j5 > -9223372036854775807L ? 1 : (j5 == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : ae8.o + j5) ? 1 : (j3 == ((j5 > -9223372036854775807L ? 1 : (j5 == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : ae8.o + j5) ? 0 : -1)) >= 0));
                }
            }
            ae82 = ae8;
            ae8 = ae8.l;
        }
        return true;
    }
}
