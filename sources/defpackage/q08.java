package defpackage;

/* renamed from: q08  reason: default package */
public final class q08 extends b9g {
    public final boolean l;
    public final kue m;
    public final hue n;
    public m08 o;
    public k08 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public q08(ej0 ej0, boolean z) {
        super(ej0);
        this.l = z && ej0.j();
        this.m = new kue();
        this.n = new hue();
        mue h = ej0.h();
        if (h != null) {
            this.o = new m08(h, (Object) null, (Object) null);
            this.s = true;
            return;
        }
        this.o = new m08(new o08(ej0.i()), kue.q, m08.h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(defpackage.mue r15) {
        /*
            r14 = this;
            boolean r0 = r14.r
            if (r0 == 0) goto L_0x001c
            m08 r0 = r14.o
            m08 r1 = new m08
            java.lang.Object r2 = r0.f
            java.lang.Object r0 = r0.g
            r1.<init>(r15, r2, r0)
            r14.o = r1
            k08 r15 = r14.p
            if (r15 == 0) goto L_0x00bf
            long r0 = r15.Z
            r14.D(r0)
            goto L_0x00bf
        L_0x001c:
            boolean r0 = r15.q()
            if (r0 == 0) goto L_0x0040
            boolean r0 = r14.s
            if (r0 == 0) goto L_0x0032
            m08 r0 = r14.o
            m08 r1 = new m08
            java.lang.Object r2 = r0.f
            java.lang.Object r0 = r0.g
            r1.<init>(r15, r2, r0)
            goto L_0x003c
        L_0x0032:
            java.lang.Object r0 = defpackage.kue.q
            java.lang.Object r1 = defpackage.m08.h
            m08 r2 = new m08
            r2.<init>(r15, r0, r1)
            r1 = r2
        L_0x003c:
            r14.o = r1
            goto L_0x00bf
        L_0x0040:
            r0 = 0
            kue r1 = r14.m
            r15.o(r0, r1)
            long r2 = r1.l
            java.lang.Object r4 = r1.a
            k08 r5 = r14.p
            if (r5 == 0) goto L_0x006d
            m08 r6 = r14.o
            yj8 r7 = r5.a
            java.lang.Object r7 = r7.a
            hue r8 = r14.n
            r6.h(r7, r8)
            long r6 = r8.e
            long r8 = r5.b
            long r6 = r6 + r8
            m08 r5 = r14.o
            r8 = 0
            r5.n(r0, r1, r8)
            long r0 = r1.l
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x006d
            r12 = r6
            goto L_0x006e
        L_0x006d:
            r12 = r2
        L_0x006e:
            r11 = 0
            kue r9 = r14.m
            hue r10 = r14.n
            r8 = r15
            android.util.Pair r0 = r8.j(r9, r10, r11, r12)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r14.s
            if (r0 == 0) goto L_0x0092
            m08 r0 = r14.o
            m08 r1 = new m08
            java.lang.Object r4 = r0.f
            java.lang.Object r0 = r0.g
            r1.<init>(r15, r4, r0)
            goto L_0x0098
        L_0x0092:
            m08 r0 = new m08
            r0.<init>(r15, r4, r1)
            r1 = r0
        L_0x0098:
            r14.o = r1
            k08 r15 = r14.p
            if (r15 == 0) goto L_0x00bf
            boolean r0 = r14.D(r2)
            if (r0 == 0) goto L_0x00bf
            yj8 r15 = r15.a
            java.lang.Object r0 = r15.a
            m08 r1 = r14.o
            java.lang.Object r1 = r1.g
            if (r1 == 0) goto L_0x00ba
            java.lang.Object r1 = defpackage.m08.h
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00ba
            m08 r0 = r14.o
            java.lang.Object r0 = r0.g
        L_0x00ba:
            yj8 r15 = r15.a(r0)
            goto L_0x00c0
        L_0x00bf:
            r15 = 0
        L_0x00c0:
            r0 = 1
            r14.s = r0
            r14.r = r0
            m08 r0 = r14.o
            r14.n(r0)
            if (r15 == 0) goto L_0x00d4
            k08 r14 = r14.p
            r14.getClass()
            r14.b(r15)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q08.A(mue):void");
    }

    public final void B() {
        if (!this.l) {
            this.q = true;
            y((Object) null, this.k);
        }
    }

    /* renamed from: C */
    public final k08 c(yj8 yj8, n64 n64, long j) {
        k08 k08 = new k08(yj8, n64, j);
        fm9.k(k08.o == null);
        ej0 ej0 = this.k;
        k08.o = ej0;
        if (this.r) {
            Object obj = this.o.g;
            Object obj2 = yj8.a;
            if (obj != null && obj2.equals(m08.h)) {
                obj2 = this.o.g;
            }
            k08.b(yj8.a(obj2));
        } else {
            this.p = k08;
            if (!this.q) {
                this.q = true;
                y((Object) null, ej0);
            }
        }
        return k08;
    }

    public final boolean D(long j) {
        k08 k08 = this.p;
        int b = this.o.b(k08.a.a);
        if (b == -1) {
            return false;
        }
        m08 m08 = this.o;
        hue hue = this.n;
        m08.g(b, hue, false);
        long j2 = hue.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        k08.Z = j;
        return true;
    }

    public final boolean a(tb8 tb8) {
        return this.k.a(tb8);
    }

    public final void k() {
    }

    public final void o(zd8 zd8) {
        ((k08) zd8).c();
        if (zd8 == this.p) {
            this.p = null;
        }
    }

    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    public final void t(tb8 tb8) {
        if (this.s) {
            m08 m08 = this.o;
            this.o = new m08(new z4b(this.o.e, tb8), m08.f, m08.g);
        } else {
            this.o = new m08(new o08(tb8), kue.q, m08.h);
        }
        this.k.t(tb8);
    }

    public final yj8 z(yj8 yj8) {
        Object obj = yj8.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = m08.h;
        }
        return yj8.a(obj);
    }
}
