package defpackage;

import android.os.Handler;

/* renamed from: p08  reason: default package */
public final class p08 extends oc3 {
    public final dj0 k;
    public final boolean l;
    public final jue m;
    public final gue n;
    public l08 o;
    public j08 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public p08(dj0 dj0, boolean z) {
        boolean z2;
        this.k = dj0;
        if (z) {
            dj0.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new jue();
        this.n = new gue();
        dj0.getClass();
        this.o = new l08(new n08(dj0.f()), jue.C0, l08.X);
    }

    public final rb8 f() {
        return this.k.f();
    }

    public final void g() {
    }

    public final void i(y0f y0f) {
        this.j = y0f;
        this.i = maf.m((Handler.Callback) null);
        if (!this.l) {
            this.q = true;
            r((Integer) null, this.k);
        }
    }

    public final void k(yd8 yd8) {
        j08 j08 = (j08) yd8;
        if (j08.X != null) {
            dj0 dj0 = j08.o;
            dj0.getClass();
            dj0.k(j08.X);
        }
        if (yd8 == this.p) {
            this.p = null;
        }
    }

    public final void m() {
        this.r = false;
        this.q = false;
        super.m();
    }

    public final xj8 p(Object obj, xj8 xj8) {
        Void voidR = (Void) obj;
        Object obj2 = xj8.a;
        Object obj3 = this.o.o;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = l08.X;
        }
        return xj8.b(obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(java.lang.Integer r15, defpackage.dj0 r16, defpackage.lue r17) {
        /*
            r14 = this;
            r0 = r14
            r7 = r17
            r1 = r15
            java.lang.Void r1 = (java.lang.Void) r1
            boolean r1 = r0.r
            if (r1 == 0) goto L_0x0022
            l08 r1 = r0.o
            l08 r2 = new l08
            java.lang.Object r3 = r1.c
            java.lang.Object r1 = r1.o
            r2.<init>(r7, r3, r1)
            r0.o = r2
            j08 r1 = r0.p
            if (r1 == 0) goto L_0x00c0
            long r1 = r1.Z
            r14.t(r1)
            goto L_0x00c0
        L_0x0022:
            boolean r1 = r17.q()
            java.lang.Object r8 = defpackage.l08.X
            if (r1 == 0) goto L_0x0045
            boolean r1 = r0.s
            if (r1 == 0) goto L_0x003a
            l08 r1 = r0.o
            l08 r2 = new l08
            java.lang.Object r3 = r1.c
            java.lang.Object r1 = r1.o
            r2.<init>(r7, r3, r1)
            goto L_0x0041
        L_0x003a:
            java.lang.Object r1 = defpackage.jue.C0
            l08 r2 = new l08
            r2.<init>(r7, r1, r8)
        L_0x0041:
            r0.o = r2
            goto L_0x00c0
        L_0x0045:
            r1 = 0
            jue r2 = r0.m
            r7.o(r1, r2)
            long r3 = r2.x0
            java.lang.Object r9 = r2.a
            j08 r5 = r0.p
            if (r5 == 0) goto L_0x0072
            l08 r6 = r0.o
            xj8 r10 = r5.a
            java.lang.Object r10 = r10.a
            gue r11 = r0.n
            r6.h(r10, r11)
            long r10 = r11.X
            long r5 = r5.b
            long r10 = r10 + r5
            l08 r5 = r0.o
            r12 = 0
            r5.n(r1, r2, r12)
            long r1 = r2.x0
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0072
            r5 = r10
            goto L_0x0073
        L_0x0072:
            r5 = r3
        L_0x0073:
            jue r2 = r0.m
            gue r3 = r0.n
            r4 = 0
            r1 = r17
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r0.s
            if (r1 == 0) goto L_0x0098
            l08 r1 = r0.o
            l08 r2 = new l08
            java.lang.Object r5 = r1.c
            java.lang.Object r1 = r1.o
            r2.<init>(r7, r5, r1)
            goto L_0x009e
        L_0x0098:
            l08 r1 = new l08
            r1.<init>(r7, r9, r2)
            r2 = r1
        L_0x009e:
            r0.o = r2
            j08 r1 = r0.p
            if (r1 == 0) goto L_0x00c0
            r14.t(r3)
            xj8 r1 = r1.a
            java.lang.Object r2 = r1.a
            l08 r3 = r0.o
            java.lang.Object r3 = r3.o
            if (r3 == 0) goto L_0x00bb
            boolean r3 = r2.equals(r8)
            if (r3 == 0) goto L_0x00bb
            l08 r2 = r0.o
            java.lang.Object r2 = r2.o
        L_0x00bb:
            xj8 r1 = r1.b(r2)
            goto L_0x00c1
        L_0x00c0:
            r1 = 0
        L_0x00c1:
            r2 = 1
            r0.s = r2
            r0.r = r2
            l08 r2 = r0.o
            r14.j(r2)
            if (r1 == 0) goto L_0x00f4
            j08 r0 = r0.p
            r0.getClass()
            long r2 = r0.Z
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x00de
            goto L_0x00e0
        L_0x00de:
            long r2 = r0.b
        L_0x00e0:
            dj0 r4 = r0.o
            r4.getClass()
            n64 r5 = r0.c
            yd8 r1 = r4.a(r1, r5, r2)
            r0.X = r1
            wd8 r4 = r0.Y
            if (r4 == 0) goto L_0x00f4
            r1.J(r0, r2)
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p08.q(java.lang.Integer, dj0, lue):void");
    }

    /* renamed from: s */
    public final j08 a(xj8 xj8, n64 n64, long j) {
        j08 j08 = new j08(xj8, n64, j);
        np8.f(j08.o == null);
        dj0 dj0 = this.k;
        j08.o = dj0;
        if (this.r) {
            Object obj = this.o.o;
            Object obj2 = xj8.a;
            if (obj != null && obj2.equals(l08.X)) {
                obj2 = this.o.o;
            }
            xj8 b = xj8.b(obj2);
            long b2 = j08.b(j);
            dj0 dj02 = j08.o;
            dj02.getClass();
            yd8 a = dj02.a(b, n64, b2);
            j08.X = a;
            if (j08.Y != null) {
                a.J(j08, b2);
            }
        } else {
            this.p = j08;
            if (!this.q) {
                this.q = true;
                r((Integer) null, dj0);
            }
        }
        return j08;
    }

    public final void t(long j) {
        j08 j08 = this.p;
        int b = this.o.b(j08.a.a);
        if (b != -1) {
            l08 l08 = this.o;
            gue gue = this.n;
            l08.g(b, gue, false);
            long j2 = gue.o;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            j08.Z = j;
        }
    }
}
