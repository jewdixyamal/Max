package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ge8  reason: default package */
public final class ge8 {
    public final hue a = new hue();
    public final kue b = new kue();
    public final i74 c;
    public final di6 d;
    public final q64 e;
    public long f;
    public int g;
    public boolean h;
    public be8 i;
    public be8 j;
    public be8 k;
    public int l;
    public Object m;
    public long n;
    public List o = new ArrayList();

    public ge8(i74 i74, bie bie, q64 q64) {
        this.c = i74;
        this.d = bie;
        this.e = q64;
    }

    public static yj8 m(mue mue, Object obj, long j2, long j3, kue kue, hue hue) {
        mue mue2 = mue;
        long j4 = j2;
        kue kue2 = kue;
        Object obj2 = obj;
        hue hue2 = hue;
        mue.h(obj2, hue2);
        mue.o(hue2.c, kue2);
        int b2 = mue.b(obj);
        Object obj3 = obj2;
        while (true) {
            int i2 = hue2.g.b;
            if (i2 == 0) {
                break;
            }
            if ((i2 == 1 && hue2.h(0)) || !hue2.i(hue2.g.e)) {
                break;
            }
            long j5 = 0;
            if (hue2.c(0) != -1) {
                break;
            }
            if (hue2.d != 0) {
                int i3 = i2 - (hue2.h(i2 + -1) ? 2 : 1);
                for (int i4 = 0; i4 <= i3; i4++) {
                    j5 += hue2.g.a(i4).h;
                }
                if (hue2.d > j5) {
                    break;
                }
            }
            if (b2 > kue2.o) {
                break;
            }
            mue.g(b2, hue2, true);
            obj3 = hue2.b;
            obj3.getClass();
            b2++;
        }
        mue.h(obj3, hue2);
        int c2 = hue2.c(j4);
        if (c2 == -1) {
            return new yj8(obj3, j3, hue2.b(j4));
        }
        long j6 = j3;
        return new yj8(obj3, c2, hue2.f(c2), j3, -1);
    }

    public final be8 a() {
        be8 be8 = this.i;
        if (be8 == null) {
            return null;
        }
        if (be8 == this.j) {
            this.j = be8.l;
        }
        be8.g();
        int i2 = this.l - 1;
        this.l = i2;
        if (i2 == 0) {
            this.k = null;
            be8 be82 = this.i;
            this.m = be82.b;
            this.n = be82.f.a.d;
        }
        this.i = this.i.l;
        k();
        return this.i;
    }

    public final void b() {
        if (this.l != 0) {
            be8 be8 = this.i;
            fm9.l(be8);
            this.m = be8.b;
            this.n = be8.f.a.d;
            while (be8 != null) {
                be8.g();
                be8 = be8.l;
            }
            this.i = null;
            this.k = null;
            this.j = null;
            this.l = 0;
            k();
        }
    }

    public final ee8 c(mue mue, be8 be8, long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        long o2;
        mue mue2 = mue;
        be8 be82 = be8;
        ee8 ee8 = be82.f;
        int d2 = mue.d(mue2.b(ee8.a.a), this.a, this.b, this.g, this.h);
        if (d2 == -1) {
            return null;
        }
        hue hue = this.a;
        boolean z = true;
        int i2 = mue2.g(d2, hue, true).c;
        Object obj = hue.b;
        obj.getClass();
        yj8 yj8 = ee8.a;
        long j7 = yj8.d;
        if (mue2.n(i2, this.b, 0).n == d2) {
            Pair k2 = mue.k(this.b, this.a, i2, -9223372036854775807L, Math.max(0, j2));
            if (k2 == null) {
                return null;
            }
            obj = k2.first;
            long longValue = ((Long) k2.second).longValue();
            be8 be83 = be82.l;
            if (be83 == null || !be83.b.equals(obj)) {
                o2 = o(obj);
                if (o2 == -1) {
                    o2 = this.f;
                    this.f = 1 + o2;
                }
            } else {
                o2 = be83.f.a.d;
            }
            j7 = o2;
            j4 = longValue;
            j3 = -9223372036854775807L;
        } else {
            j4 = 0;
            j3 = 0;
        }
        yj8 m2 = m(mue, obj, j4, j7, this.b, this.a);
        if (j3 != -9223372036854775807L) {
            j6 = ee8.c;
            if (j6 != -9223372036854775807L) {
                int i3 = mue2.h(yj8.a, hue).g.b;
                int i4 = hue.g.e;
                if (i3 <= 0 || !hue.i(i4) || (i3 <= 1 && hue.d(i4) == Long.MIN_VALUE)) {
                    z = false;
                }
                if (m2.b() && z) {
                    j5 = j4;
                    return e(mue, m2, j6, j5);
                } else if (z) {
                    j5 = j6;
                    j6 = j3;
                    return e(mue, m2, j6, j5);
                }
            }
        }
        j5 = j4;
        j6 = j3;
        return e(mue, m2, j6, j5);
    }

    public final ee8 d(mue mue, be8 be8, long j2) {
        mue mue2 = mue;
        be8 be82 = be8;
        ee8 ee8 = be82.f;
        long j3 = (be82.o + ee8.e) - j2;
        if (ee8.g) {
            return c(mue2, be82, j3);
        }
        yj8 yj8 = ee8.a;
        Object obj = yj8.a;
        hue hue = this.a;
        mue2.h(obj, hue);
        boolean b2 = yj8.b();
        Object obj2 = yj8.a;
        if (b2) {
            s8 s8Var = hue.g;
            int i2 = yj8.b;
            int i3 = s8Var.a(i2).b;
            if (i3 != -1) {
                int a2 = hue.g.a(i2).a(yj8.c);
                if (a2 < i3) {
                    return f(mue, yj8.a, i2, a2, ee8.c, yj8.d);
                }
                long j4 = ee8.c;
                if (j4 == -9223372036854775807L) {
                    Pair k2 = mue.k(this.b, hue, hue.c, -9223372036854775807L, Math.max(0, j3));
                    if (k2 != null) {
                        j4 = ((Long) k2.second).longValue();
                    }
                }
                mue2.h(obj2, hue);
                int i4 = yj8.b;
                long d2 = hue.d(i4);
                return g(mue, yj8.a, Math.max(d2 == Long.MIN_VALUE ? hue.d : hue.g.a(i4).h + d2, j4), ee8.c, yj8.d);
            }
            return null;
        }
        int i5 = yj8.e;
        if (i5 != -1 && hue.h(i5)) {
            return c(mue2, be82, j3);
        }
        int f2 = hue.f(i5);
        boolean z = hue.i(i5) && hue.e(i5, f2) == 3;
        if (f2 == hue.g.a(i5).b || z) {
            mue2.h(obj2, hue);
            long d3 = hue.d(i5);
            return g(mue, yj8.a, d3 == Long.MIN_VALUE ? hue.d : hue.g.a(i5).h + d3, ee8.e, yj8.d);
        }
        return f(mue, yj8.a, yj8.e, f2, ee8.e, yj8.d);
    }

    public final ee8 e(mue mue, yj8 yj8, long j2, long j3) {
        yj8 yj82 = yj8;
        mue mue2 = mue;
        mue.h(yj82.a, this.a);
        if (yj8.b()) {
            int i2 = yj82.c;
            long j4 = yj82.d;
            return f(mue, yj82.a, yj82.b, i2, j2, j4);
        }
        return g(mue, yj82.a, j3, j2, yj82.d);
    }

    public final ee8 f(mue mue, Object obj, int i2, int i3, long j2, long j3) {
        int i4 = i2;
        int i5 = i3;
        yj8 yj8 = new yj8(obj, i2, i3, j3, -1);
        hue hue = this.a;
        long a2 = mue.h(obj, hue).a(i4, i5);
        long j4 = i5 == hue.f(i4) ? hue.g.c : 0;
        return new ee8(yj8, (a2 == -9223372036854775807L || j4 < a2) ? j4 : Math.max(0, a2 - 1), j2, -9223372036854775807L, a2, hue.i(i4), false, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00be A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ee8 g(defpackage.mue r27, java.lang.Object r28, long r29, long r31, long r33) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            hue r5 = r0.a
            r1.h(r2, r5)
            int r6 = r5.b(r3)
            r7 = 0
            r8 = 1
            r9 = -1
            if (r6 == r9) goto L_0x001e
            boolean r10 = r5.h(r6)
            if (r10 == 0) goto L_0x001e
            r10 = r8
            goto L_0x001f
        L_0x001e:
            r10 = r7
        L_0x001f:
            if (r6 != r9) goto L_0x0031
            s8 r11 = r5.g
            int r12 = r11.b
            if (r12 <= 0) goto L_0x0063
            int r11 = r11.e
            boolean r11 = r5.i(r11)
            if (r11 == 0) goto L_0x0063
            r11 = r8
            goto L_0x0064
        L_0x0031:
            boolean r11 = r5.i(r6)
            if (r11 == 0) goto L_0x0063
            long r11 = r5.d(r6)
            long r13 = r5.d
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x0063
            s8 r11 = r5.g
            q8 r11 = r11.a(r6)
            int r12 = r11.b
            if (r12 != r9) goto L_0x004d
        L_0x004b:
            r11 = r8
            goto L_0x005d
        L_0x004d:
            r13 = r7
        L_0x004e:
            if (r13 >= r12) goto L_0x005c
            int[] r14 = r11.f
            r14 = r14[r13]
            if (r14 == 0) goto L_0x004b
            if (r14 != r8) goto L_0x0059
            goto L_0x004b
        L_0x0059:
            int r13 = r13 + 1
            goto L_0x004e
        L_0x005c:
            r11 = r7
        L_0x005d:
            r11 = r11 ^ r8
            if (r11 == 0) goto L_0x0063
            r11 = r8
            r6 = r9
            goto L_0x0064
        L_0x0063:
            r11 = r7
        L_0x0064:
            yj8 r13 = new yj8
            r14 = r33
            r13.<init>(r2, r14, r6)
            boolean r2 = r13.b()
            if (r2 != 0) goto L_0x0075
            if (r6 != r9) goto L_0x0075
            r2 = r8
            goto L_0x0076
        L_0x0075:
            r2 = r7
        L_0x0076:
            boolean r24 = r0.j(r1, r13)
            boolean r25 = r0.i(r1, r13, r2)
            if (r6 == r9) goto L_0x008b
            boolean r0 = r5.i(r6)
            if (r0 == 0) goto L_0x008b
            if (r10 != 0) goto L_0x008b
            r22 = r8
            goto L_0x008d
        L_0x008b:
            r22 = r7
        L_0x008d:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == r9) goto L_0x009d
            if (r10 != 0) goto L_0x009d
            long r9 = r5.d(r6)
        L_0x009a:
            r18 = r9
            goto L_0x00a4
        L_0x009d:
            if (r11 == 0) goto L_0x00a2
            long r9 = r5.d
            goto L_0x009a
        L_0x00a2:
            r18 = r0
        L_0x00a4:
            int r6 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x00b2
            r9 = -9223372036854775808
            int r6 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x00af
            goto L_0x00b2
        L_0x00af:
            r20 = r18
            goto L_0x00b6
        L_0x00b2:
            long r5 = r5.d
            r20 = r5
        L_0x00b6:
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00ce
            int r0 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r0 < 0) goto L_0x00ce
            if (r25 != 0) goto L_0x00c2
            if (r11 != 0) goto L_0x00c3
        L_0x00c2:
            r7 = r8
        L_0x00c3:
            long r0 = (long) r7
            long r0 = r20 - r0
            r3 = 0
            long r0 = java.lang.Math.max(r3, r0)
            r14 = r0
            goto L_0x00cf
        L_0x00ce:
            r14 = r3
        L_0x00cf:
            ee8 r0 = new ee8
            r12 = r0
            r16 = r31
            r23 = r2
            r12.<init>(r13, r14, r16, r18, r20, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ge8.g(mue, java.lang.Object, long, long, long):ee8");
    }

    public final ee8 h(mue mue, ee8 ee8) {
        mue mue2 = mue;
        ee8 ee82 = ee8;
        yj8 yj8 = ee82.a;
        boolean b2 = yj8.b();
        int i2 = yj8.e;
        boolean z = !b2 && i2 == -1;
        boolean j2 = j(mue2, yj8);
        boolean i3 = i(mue2, yj8, z);
        Object obj = ee82.a.a;
        hue hue = this.a;
        mue2.h(obj, hue);
        long d2 = (yj8.b() || i2 == -1) ? -9223372036854775807L : hue.d(i2);
        boolean b3 = yj8.b();
        int i4 = yj8.b;
        return new ee8(yj8, ee82.b, ee82.c, d2, b3 ? hue.a(i4, yj8.c) : (d2 == -9223372036854775807L || d2 == Long.MIN_VALUE) ? hue.d : d2, yj8.b() ? hue.i(i4) : i2 != -1 && hue.i(i2), z, j2, i3);
    }

    public final boolean i(mue mue, yj8 yj8, boolean z) {
        int b2 = mue.b(yj8.a);
        if (mue.n(mue.g(b2, this.a, false).c, this.b, 0).i) {
            return false;
        }
        return mue.d(b2, this.a, this.b, this.g, this.h) == -1 && z;
    }

    public final boolean j(mue mue, yj8 yj8) {
        if (!(!yj8.b() && yj8.e == -1)) {
            return false;
        }
        Object obj = yj8.a;
        return mue.n(mue.h(obj, this.a).c, this.b, 0).o == mue.b(obj);
    }

    public final void k() {
        ww6 i2 = zw6.i();
        for (be8 be8 = this.i; be8 != null; be8 = be8.l) {
            i2.a(be8.f.a);
        }
        be8 be82 = this.j;
        ((bie) this.d).d(new v05((Object) this, (Object) i2, (Object) be82 == null ? null : be82.f.a, 12));
    }

    public final boolean l(be8 be8) {
        fm9.l(be8);
        boolean z = false;
        if (be8.equals(this.k)) {
            return false;
        }
        this.k = be8;
        while (true) {
            be8 = be8.l;
            if (be8 == null) {
                break;
            }
            if (be8 == this.j) {
                this.j = this.i;
                z = true;
            }
            be8.g();
            this.l--;
        }
        be8 be82 = this.k;
        be82.getClass();
        if (be82.l != null) {
            be82.b();
            be82.l = null;
            be82.c();
        }
        k();
        return z;
    }

    public final yj8 n(mue mue, Object obj, long j2) {
        long j3;
        int b2;
        mue mue2 = mue;
        Object obj2 = obj;
        hue hue = this.a;
        int i2 = mue2.h(obj2, hue).c;
        Object obj3 = this.m;
        if (obj3 == null || (b2 = mue2.b(obj3)) == -1 || mue2.g(b2, hue, false).c != i2) {
            be8 be8 = this.i;
            while (true) {
                if (be8 == null) {
                    be8 be82 = this.i;
                    while (true) {
                        if (be82 != null) {
                            int b3 = mue2.b(be82.b);
                            if (b3 != -1 && mue2.g(b3, hue, false).c == i2) {
                                j3 = be82.f.a.d;
                                break;
                            }
                            be82 = be82.l;
                        } else {
                            j3 = o(obj2);
                            if (j3 == -1) {
                                j3 = this.f;
                                this.f = 1 + j3;
                                if (this.i == null) {
                                    this.m = obj2;
                                    this.n = j3;
                                }
                            }
                        }
                    }
                } else if (be8.b.equals(obj2)) {
                    j3 = be8.f.a.d;
                    break;
                } else {
                    be8 = be8.l;
                }
            }
        } else {
            j3 = this.n;
        }
        mue2.h(obj2, hue);
        int i3 = hue.c;
        kue kue = this.b;
        mue2.o(i3, kue);
        boolean z = false;
        for (int b4 = mue.b(obj); b4 >= kue.n; b4--) {
            boolean z2 = true;
            mue2.g(b4, hue, true);
            if (hue.g.b <= 0) {
                z2 = false;
            }
            z |= z2;
            if (hue.c(hue.d) != -1) {
                obj2 = hue.b;
                obj2.getClass();
            }
            if (z && (!z2 || hue.d != 0)) {
                break;
            }
        }
        return m(mue, obj2, j2, j3, this.b, this.a);
    }

    public final long o(Object obj) {
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            be8 be8 = (be8) this.o.get(i2);
            if (be8.b.equals(obj)) {
                return be8.f.a.d;
            }
        }
        return -1;
    }

    public final boolean p(mue mue) {
        be8 be8;
        be8 be82 = this.i;
        if (be82 == null) {
            return true;
        }
        int b2 = mue.b(be82.b);
        while (true) {
            mue mue2 = mue;
            b2 = mue2.d(b2, this.a, this.b, this.g, this.h);
            while (true) {
                be82.getClass();
                be8 = be82.l;
                if (be8 != null && !be82.f.g) {
                    be82 = be8;
                }
            }
            if (b2 == -1 || be8 == null || mue.b(be8.b) != b2) {
                boolean l2 = l(be82);
                be82.f = h(mue, be82.f);
            } else {
                be82 = be8;
            }
        }
        boolean l22 = l(be82);
        be82.f = h(mue, be82.f);
        return !l22;
    }

    public final boolean q(mue mue, long j2, long j3) {
        ee8 ee8;
        be8 be8 = this.i;
        be8 be82 = null;
        while (be8 != null) {
            ee8 ee82 = be8.f;
            if (be82 == null) {
                ee8 = h(mue, ee82);
            } else {
                ee8 d2 = d(mue, be82, j2);
                if (d2 == null) {
                    return !l(be82);
                }
                if (ee82.b != d2.b || !ee82.a.equals(d2.a)) {
                    return !l(be82);
                }
                ee8 = d2;
            }
            be8.f = ee8.a(ee82.c);
            long j4 = ee82.e;
            if (j4 != -9223372036854775807L) {
                long j5 = ee8.e;
                if (j4 != j5) {
                    be8.i();
                    return !l(be8) && !(be8 == this.j && !be8.f.f && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j5 > -9223372036854775807L ? 1 : (j5 == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : be8.o + j5) ? 1 : (j3 == ((j5 > -9223372036854775807L ? 1 : (j5 == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : be8.o + j5) ? 0 : -1)) >= 0));
                }
            }
            be82 = be8;
            be8 = be8.l;
        }
        return true;
    }
}
