package defpackage;

import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* renamed from: jm3  reason: default package */
public final class jm3 extends gv4 {
    public final khe A = new khe(new zf3(4));
    public final AtomicBoolean B = new AtomicBoolean(false);
    public final h35 C = new h35(y53.M(new Object(), new xc(), new Object()));
    public final h35 D = new h35(x53.u0(y53.M(new Object(), new xc(), new Object()), new Object()));
    public final long n;
    public final je7 o;
    public final je7 p;
    public final je7 q;
    public final je7 r;
    public final je7 s;
    public final je7 t;
    public final je7 u;
    public final je7 v;
    public final je7 w;
    public final je7 x;
    public final ggc y;
    public final je7 z;

    public jm3(long j, sx3 sx3) {
        super(sx3);
        this.n = j;
        neb neb = neb.a;
        khe d = neb.getAccessor().d(ds3.class);
        this.o = d;
        this.p = neb.c();
        this.q = neb.getAccessor().d(q33.class);
        this.r = neb.getAccessor().d(kxc.class);
        this.s = neb.d();
        this.t = neb.getAccessor().d(f5a.class);
        this.u = neb.getAccessor().d(kr1.class);
        this.v = neb.getAccessor().d(hq3.class);
        this.w = neb.getAccessor().d(gq3.class);
        this.x = neb.getAccessor().d(yj3.class);
        this.y = new ggc(neb.getAccessor().d(qea.class));
        this.z = neb.b();
        od2.L(od2.F(new zn5(new ac(new mqc(new dm3(new t03(((ds3) d.getValue()).c(j), 11), (Continuation) null, this)), 16, this), new rl3(this, (Continuation) null), 5), ((w9a) q()).b()), sx3);
    }

    public static final Object n(jm3 jm3, Continuation continuation) {
        Object a;
        boolean z2 = jm3.B.get();
        e5f e5f = e5f.a;
        tx3 tx3 = tx3.a;
        kld kld = jm3.d;
        if (z2) {
            jm3.c().getClass();
            a = kld.a(new rfb(new eqe(vea.c0), new eqe(vea.b0), y53.M(new mg3(sea.f0, new eqe(vea.a0), 1, false), new mg3(sea.g0, new eqe(vea.Z), 2, false))), continuation);
            if (a != tx3) {
                return e5f;
            }
        } else {
            uj3 uj3 = (uj3) ((ds3) jm3.o.getValue()).c(jm3.n).a.getValue();
            String d = uj3 != null ? uj3.d() : null;
            if (d == null) {
                d = "";
            }
            jm3.c().getClass();
            gqe gqe = new gqe(vea.H0, ys.m0(new Object[]{d}));
            kl7 l = j1e.l();
            l.add(new mg3(sea.f, new eqe(vea.G0), 1, false));
            l.add(new mg3(sea.e, new eqe(vea.E0), 2, false));
            a = kld.a(new rfb(gqe, (jqe) null, j1e.d(l)), continuation);
            if (a != tx3) {
                return e5f;
            }
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        r17 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.xu4 o(defpackage.jm3 r20, defpackage.uj3 r21) {
        /*
            r0 = r20
            r1 = r21
            java.lang.String r2 = "6M"
            je7 r3 = r0.q
            java.lang.Object r3 = r3.getValue()
            q33 r3 = (defpackage.q33) r3
            hyc r3 = (defpackage.hyc) r3
            java.lang.String r3 = r3.q()
            kk0 r4 = defpackage.kk0.c
            java.lang.String r6 = r1.q(r3, r4)
            long r7 = r21.n()
            java.lang.CharSequence r10 = r21.m()
            java.lang.String r9 = r21.e()
            java.lang.String r12 = r21.f()
            ql3 r3 = r1.a
            pl3 r4 = r3.c
            java.lang.String r14 = r4.o
            java.lang.String r4 = r4.p
            if (r4 == 0) goto L_0x0052
            int r4 = r4.length()
            if (r4 != 0) goto L_0x003b
            goto L_0x0052
        L_0x003b:
            pl3 r3 = r3.c
            java.lang.String r3 = r3.p
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r3 = r3.getLastPathSegment()
            if (r3 != 0) goto L_0x004b
            java.lang.String r3 = ""
        L_0x004b:
            iqe r4 = new iqe
            r4.<init>(r3)
        L_0x0050:
            r15 = r4
            goto L_0x005a
        L_0x0052:
            int r3 = defpackage.vea.k2
            eqe r4 = new eqe
            r4.<init>(r3)
            goto L_0x0050
        L_0x005a:
            long r3 = r21.o()
            java.lang.String r16 = java.lang.String.valueOf(r3)
            je7 r0 = r0.r
            java.lang.Object r0 = r0.getValue()
            kxc r0 = (defpackage.kxc) r0
            jp r0 = (defpackage.jp) r0
            ne7 r0 = r0.g
            java.lang.String r1 = "app.privacy.inactive.ttl"
            java.lang.String r0 = r0.getString(r1, r2)
            faf r1 = defpackage.faf.TTL_6M
            if (r0 == 0) goto L_0x00a2
            r3 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case 1596: goto L_0x0095;
                case 1658: goto L_0x008a;
                case 1751: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x009f
        L_0x0081:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0088
            goto L_0x009f
        L_0x0088:
            r3 = 2
            goto L_0x009f
        L_0x008a:
            java.lang.String r2 = "3M"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0093
            goto L_0x009f
        L_0x0093:
            r3 = 1
            goto L_0x009f
        L_0x0095:
            java.lang.String r2 = "1M"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r3 = 0
        L_0x009f:
            switch(r3) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x00a5;
                case 2: goto L_0x00a2;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            r17 = r1
            goto L_0x00ad
        L_0x00a5:
            faf r0 = defpackage.faf.TTL_3M
        L_0x00a7:
            r17 = r0
            goto L_0x00ad
        L_0x00aa:
            faf r0 = defpackage.faf.TTL_1M
            goto L_0x00a7
        L_0x00ad:
            xu4 r0 = new xu4
            r11 = 0
            r13 = 0
            r18 = 0
            r19 = 0
            r5 = r0
            r5.<init>(r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm3.o(jm3, uj3):xu4");
    }

    public static final void p(jm3 jm3, long j) {
        Object value;
        xu4 xu4;
        q0e q0e;
        Object value2;
        q0e q0e2 = jm3.j;
        do {
            value = q0e2.getValue();
            xu4 xu42 = (xu4) value;
            if (xu42 != null) {
                xu4 = xu4.c(xu42, (String) null, (a73) null, (String) null, (a73) null, (String) null, (jqe) null, (faf) null, j != 0, Long.valueOf(j), 2047);
            } else {
                xu4 = null;
            }
        } while (!q0e2.c(value, xu4));
        do {
            q0e = jm3.c;
            value2 = q0e.getValue();
            List list = (List) value2;
        } while (!q0e.c(value2, jm3.f().a(jm3)));
    }

    public final void a(int i) {
        j47.T(this.a, ((w9a) q()).a(), (vx3) null, new sl3(i, this, (Continuation) null), 2);
    }

    public final void b() {
    }

    public final boolean d() {
        return this.B.get();
    }

    public final long e() {
        return this.n;
    }

    public final void g(int i) {
        if (i == sea.b) {
            r(faf.TTL_1M);
        } else if (i == sea.c) {
            r(faf.TTL_3M);
        } else if (i == sea.d) {
            r(faf.TTL_6M);
        } else {
            int i2 = sea.f0;
            sx3 sx3 = this.a;
            if (i == i2) {
                j47.T(sx3, ((w9a) q()).b(), (vx3) null, new wl3(this, true, (Continuation) null), 2);
            } else if (i == sea.f) {
                j47.T(sx3, ((w9a) q()).b().plus(xq9.a), (vx3) null, new vl3(this, (Continuation) null), 2);
            } else if (i == sea.k0) {
                ((wr1) ((kr1) this.u.getValue())).v();
                j47.T(sx3, ((w9a) q()).b(), (vx3) null, new yl3(this, (Continuation) null), 2);
            }
        }
    }

    public final Object h(String str, RectF rectF, Continuation continuation) {
        this.m.set(((k4a) ((pk) this.z.getValue())).F(str, nd7.k(rectF)));
        Object a = this.d.a(new sfb(new eqe(vea.q), new Integer(woc.m)), continuation);
        return a == tx3.a ? a : e5f.a;
    }

    public final e5f i() {
        uj3 uj3 = (uj3) ((ds3) this.o.getValue()).c(this.n).a.getValue();
        e5f e5f = e5f.a;
        if (uj3 == null) {
            return e5f;
        }
        q0e q0e = this.b;
        meb meb = (meb) q0e.getValue();
        q0e.setValue(meb != null ? meb.a(meb, uj3.q(((hyc) ((q33) this.q.getValue())).q(), kk0.c), false, 126) : null);
        return e5f;
    }

    public final void j() {
        j47.T(this.a, ((w9a) q()).b(), (vx3) null, new zl3(this, (Continuation) null), 2);
    }

    public final void k() {
        j47.T(this.a, ((w9a) q()).a(), (vx3) null, new am3(this, (Continuation) null), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.em3
            if (r0 == 0) goto L_0x0013
            r0 = r12
            em3 r0 = (defpackage.em3) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            em3 r0 = new em3
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0044
            if (r2 == r5) goto L_0x0038
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0033:
            defpackage.od2.a0(r12)
            goto L_0x00fd
        L_0x0038:
            xu4 r11 = r0.X
            jm3 r2 = r0.o
            defpackage.od2.a0(r12)
            r10 = r12
            r12 = r11
            r11 = r2
            r2 = r10
            goto L_0x00b5
        L_0x0044:
            defpackage.od2.a0(r12)
            q0e r12 = r11.j
            java.lang.Object r12 = r12.getValue()
            xu4 r12 = (defpackage.xu4) r12
            if (r12 != 0) goto L_0x0054
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L_0x0054:
            java.util.concurrent.atomic.AtomicBoolean r2 = r11.B
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x00da
            h35 r2 = r11.D
            boolean r2 = r11.s(r2)
            if (r2 != 0) goto L_0x0067
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L_0x0067:
            faf r2 = r12.k
            if (r2 == 0) goto L_0x00be
            je7 r3 = r11.r
            java.lang.Object r7 = r3.getValue()
            kxc r7 = (defpackage.kxc) r7
            jp r7 = (defpackage.jp) r7
            ne7 r7 = r7.g
            java.lang.String r8 = "6M"
            java.lang.String r9 = "app.privacy.inactive.ttl"
            java.lang.String r7 = r7.getString(r9, r8)
            java.lang.String r8 = r2.a
            boolean r7 = defpackage.tpa.f(r8, r7)
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r2 = r6
        L_0x008a:
            if (r2 == 0) goto L_0x00be
            java.lang.Object r3 = r3.getValue()
            kxc r3 = (defpackage.kxc) r3
            jp r3 = (defpackage.jp) r3
            java.lang.String r7 = r2.a
            r3.m(r9, r7)
            kke r3 = r11.q()
            w9a r3 = (defpackage.w9a) r3
            nx3 r3 = r3.b()
            fm3 r7 = new fm3
            r7.<init>(r11, r2, r6)
            r0.o = r11
            r0.X = r12
            r0.s0 = r5
            java.lang.Object r2 = defpackage.j47.t0(r3, r7, r0)
            if (r2 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            defpackage.c37.d(r2)
        L_0x00be:
            kke r2 = r11.q()
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            gm3 r3 = new gm3
            r3.<init>(r11, r12, r6)
            r0.o = r6
            r0.X = r6
            r0.s0 = r4
            java.lang.Object r11 = defpackage.j47.t0(r2, r3, r0)
            if (r11 != r1) goto L_0x00fd
            return r1
        L_0x00da:
            h35 r2 = r11.C
            boolean r2 = r11.s(r2)
            if (r2 != 0) goto L_0x00e5
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L_0x00e5:
            kke r2 = r11.q()
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            hm3 r4 = new hm3
            r4.<init>(r11, r12, r6)
            r0.s0 = r3
            java.lang.Object r11 = defpackage.j47.t0(r2, r4, r0)
            if (r11 != r1) goto L_0x00fd
            return r1
        L_0x00fd:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm3.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void m(int i, String str) {
        Object value;
        xu4 xu4;
        Object value2;
        xu4 xu42;
        Object value3;
        xu4 xu43;
        q0e q0e = this.j;
        if (i == 1) {
            do {
                value3 = q0e.getValue();
                xu43 = (xu4) value3;
            } while (!q0e.c(value3, xu43 != null ? xu4.c(xu43, str, (a73) null, (String) null, (a73) null, (String) null, (jqe) null, (faf) null, false, (Long) null, 8171) : null));
        } else if (i == 2) {
            do {
                value2 = q0e.getValue();
                xu42 = (xu4) value2;
            } while (!q0e.c(value2, xu42 != null ? xu4.c(xu42, (String) null, (a73) null, str, (a73) null, (String) null, (jqe) null, (faf) null, false, (Long) null, 8095) : null));
        } else if (i == 4) {
            do {
                value = q0e.getValue();
                xu4 = (xu4) value;
            } while (!q0e.c(value, xu4 != null ? xu4.c(xu4, (String) null, (a73) null, (String) null, (a73) null, str, (jqe) null, (faf) null, false, (Long) null, 8063) : null));
        }
    }

    public final kke q() {
        return (kke) this.s.getValue();
    }

    public final void r(faf faf) {
        q0e q0e;
        Object value;
        xu4 xu4;
        do {
            q0e = this.j;
            value = q0e.getValue();
            xu4 = (xu4) value;
        } while (!q0e.c(value, xu4 != null ? xu4.c(xu4, (String) null, (a73) null, (String) null, (a73) null, (String) null, (jqe) null, faf, false, (Long) null, 7167) : null));
    }

    public final boolean s(h35 h35) {
        Object value;
        xu4 xu4;
        q0e q0e;
        Object value2;
        String str;
        xu4 xu42;
        String str2;
        h35 h352 = h35;
        q0e q0e2 = this.j;
        xu4 xu43 = (xu4) q0e2.getValue();
        String str3 = xu43 != null ? xu43.c : null;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        boolean z2 = true;
        a73 a = h352.a(1, str3);
        xu4 xu44 = (xu4) q0e2.getValue();
        String str5 = xu44 != null ? xu44.f : null;
        if (str5 != null) {
            str4 = str5;
        }
        a73 a2 = h352.a(2, str4);
        xu4 xu45 = (xu4) q0e2.getValue();
        if (!(xu45 == null || (str = xu45.c) == null || !w9e.C0(str) || (xu42 = (xu4) q0e2.getValue()) == null || (str2 = xu42.f) == null || w9e.C0(str2))) {
            a = new a73(Collections.singletonList(new eqe(yoc.n0)));
        }
        if (!(a == null && a2 == null)) {
            z2 = false;
        }
        do {
            value = q0e2.getValue();
            xu4 = (xu4) value;
        } while (!q0e2.c(value, xu4 != null ? xu4.c(xu4, (String) null, a, (String) null, a2, (String) null, (jqe) null, (faf) null, false, (Long) null, 8111) : null));
        do {
            q0e = this.c;
            value2 = q0e.getValue();
            List list = (List) value2;
        } while (!q0e.c(value2, f().a(this)));
        return z2;
    }
}
