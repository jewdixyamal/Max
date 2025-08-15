package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: cq3  reason: default package */
public final class cq3 extends pab {
    public final boolean f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public m83 m;
    public final xs2 n = new xs2();
    public final je7 o = tu0.r(3, new zf3(6));
    public final je7 p = tu0.r(3, new zf3(7));
    public final sj4 q;
    public final je7 r;
    public final q0e s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cq3(long j2, sx3 sx3, boolean z) {
        super(j2);
        long j3 = j2;
        sx3 sx32 = sx3;
        this.f = z;
        xcb xcb = xcb.a;
        je7 e = xcb.e();
        this.g = e;
        this.h = xcb.c();
        khe d = xcb.getAccessor().d(y7b.class);
        this.i = d;
        this.j = xcb.getAccessor().d(yj3.class);
        this.k = xcb.getAccessor().d(ck3.class);
        this.l = xcb.getAccessor().d(qq3.class);
        je7 f2 = xcb.f();
        sj4 a = ((ecb) xcb.getAccessor().c(ecb.class)).a(j3);
        this.q = a;
        this.r = xcb.getAccessor().d(xb9.class);
        q0e a2 = r0e.a(nz4.a);
        this.s = a2;
        m83 m83 = new m83(j3);
        this.m = m83;
        od2.L(new zn5(m83.i, new yp3(this, (Continuation) null), 5), sx32);
        od2.L(od2.F(new zn5(od2.t(new t03(od2.D(((ds3) e.getValue()).c(j3), new aq3(this, j3, (Continuation) null)), 11), new w7c(((w7b) ((y7b) d.getValue()).a.getValue()).d().c(j3)), new w7c(a2), new zp3(this, (Continuation) null)), new lq0(2, this, cq3.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", 4, 13), 5), ((w9a) ((kke) f2.getValue())).a()), sx32);
        od2.L(od2.F(new zn5(new v7c(a.d), new lq0(2, this, cq3.class, "handleProfileEvent", "handleProfileEvent(Lone/me/profile/viewmodel/logic/DialogProfileEvent;)V", 4, 14), 5), ((w9a) ((kke) f2.getValue())).a()), sx32);
    }

    public final void C(Continuation continuation) {
        ((qq3) this.l.getValue()).a(this.a);
    }

    public final kpa D(uj3 uj3) {
        List list;
        k92 k92;
        uj3 uj32 = uj3;
        String name = cq3.class.getName();
        hm9.m(name, "buildAppBarAndItems " + uj32, new Object[0]);
        tab tab = new tab(uj3.n(), uj3.c(), uj3.r(), uj32.p(kk0.b), uj3.d(), uj3.m(), (od0) null, new iqe(((w7b) ((y7b) this.i.getValue()).a.getValue()).b(uj32)), new iqe(bre.c(uj3.j())), uj3.s() || uj3.k() != 0, uj3.u(), 64);
        n1d n1d = (n1d) this.c.getValue();
        je7 je7 = this.h;
        long j2 = this.a;
        e52 q2 = ((jz2) ((iy2) je7.getValue())).q(j2);
        n1d.getClass();
        kl7 l2 = j1e.l();
        n1d.b(l2, uj32, q2);
        ida a = n1d.a();
        CharSequence l3 = uj32.l(n1d.a());
        a.getClass();
        CharSequence a2 = a.a(l3, false, true, false, true, (List) null, true);
        if (!(a2 == null || a2.length() == 0)) {
            l2.add(new wib(a2, new eqe(uj3.t() ? yea.F : yea.G)));
        }
        long o2 = uj3.o();
        lib lib = null;
        if (o2 > 0) {
            String valueOf = String.valueOf(o2);
            je7 je72 = n1d.c;
            String a3 = zqe.a((zua) n1d.b.getValue(), valueOf, ((t33) ((q33) je72.getValue())).g.getString("app.location.country.code", (String) null), ((hyc) ((q33) je72.getValue())).r());
            if (a3 != null && a3.length() > 1) {
                l2.add(new ajb(a3));
            }
        }
        l2.add(new Object());
        kl7 d = j1e.d(l2);
        mv0 mv0 = (mv0) this.b.getValue();
        e52 q3 = ((jz2) ((iy2) je7.getValue())).q(j2);
        mv0.getClass();
        if (uj3.s()) {
            list = y53.M(new l7a(wea.p1, Integer.valueOf(yea.M), (Integer) null, Integer.valueOf(woc.h1), (Integer) null, 52), mv0.c());
        } else {
            kl7 l4 = j1e.l();
            if (!this.f) {
                l4.add(mv0.d());
            }
            if (!uj3.t() && !uj3.w() && uj3.k() == 0) {
                l4.add(new l7a(wea.l, Integer.valueOf(yea.k), (Integer) null, Integer.valueOf(woc.c0), (Integer) null, 52));
                l4.add(new l7a(wea.q1, Integer.valueOf(yea.N), (Integer) null, Integer.valueOf(woc.n2), (Integer) null, 52));
            }
            if (!(((q3 == null || (k92 = q3.b) == null) ? null : k92.c) == i92.o || q3 == null)) {
                l4.add(q3.V((q33) mv0.a.getValue()) ? mv0.a() : mv0.b());
            }
            list = j1e.d(l4);
        }
        zcb zcb = (zcb) this.o.getValue();
        zcb.getClass();
        kl7 l5 = j1e.l();
        l5.add((l7a) zcb.a.getValue());
        l5.add((l7a) zcb.b.getValue());
        if (!uj3.s()) {
            l5.add((l7a) zcb.e.getValue());
        }
        l5.add((l7a) zcb.f.getValue());
        kl7 d2 = j1e.d(l5);
        if (!uj3.c() && !uj3.s() && uj3.k() == 0) {
            lib = new lib(yea.h, (z6a) null, 14);
        }
        kl7 l6 = j1e.l();
        if ((!list.isEmpty()) || (!d2.isEmpty())) {
            l6.add(new kib(list, d2, true));
        }
        if (lib != null) {
            l6.add(lib);
        }
        l6.addAll(d);
        return new kpa(tab, j1e.d(l6));
    }

    public final uj3 E() {
        return (uj3) ((ds3) this.g.getValue()).c(this.a).a.getValue();
    }

    public final void a(Continuation continuation) {
        ((ck3) this.k.getValue()).a(this.a);
    }

    public final void d() {
        sj4 sj4 = this.q;
        sj4.b.f(sj4);
        m83 m83 = this.m;
        if (m83 != null) {
            d83 d83 = (d83) m83.e.getValue();
            d83.a.f(d83);
            bc7[] bc7Arr = m83.m;
            bc7 bc7 = bc7Arr[0];
            w4d w4d = m83.l;
            x77 x77 = (x77) w4d.T0(m83, bc7);
            if (x77 != null) {
                x77.cancel((CancellationException) null);
            }
            w4d.o1(m83, bc7Arr[0], (Object) null);
        }
        this.m = null;
    }

    public final ka1 e() {
        return new jkb(this.a, hdb.CONTACT);
    }

    public final String h() {
        uj3 E = E();
        if (E != null) {
            return E.g();
        }
        return null;
    }

    public final Long i() {
        e52 q2 = ((jz2) ((iy2) this.h.getValue())).q(this.a);
        if (q2 != null) {
            return Long.valueOf(q2.a);
        }
        return null;
    }

    public final Long j() {
        e52 q2 = ((jz2) ((iy2) this.h.getValue())).q(this.a);
        if (q2 != null) {
            return Long.valueOf(q2.b.a);
        }
        return null;
    }

    public final int k() {
        return 2;
    }

    public final hdb l() {
        return hdb.CONTACT;
    }

    public final Object n(Continuation continuation) {
        return ((jz2) ((iy2) this.h.getValue())).u(this.a, continuation);
    }

    public final String o() {
        uj3 E = E();
        if (E != null) {
            return Long.valueOf(E.o()).toString();
        }
        return null;
    }

    public final boolean r() {
        return true;
    }

    public final void s() {
        m83 m83 = this.m;
        if (m83 != null) {
            vxd T = j47.T(m83.k, (lx3) null, vx3.b, new k83(m83, (Continuation) null), 1);
            m83.l.o1(m83, m83.m[0], T);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.bq3
            if (r0 == 0) goto L_0x0013
            r0 = r5
            bq3 r0 = (defpackage.bq3) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            bq3 r0 = new bq3
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.od2.a0(r5)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            defpackage.od2.a0(r5)
            je7 r5 = r4.j
            java.lang.Object r5 = r5.getValue()
            yj3 r5 = (defpackage.yj3) r5
            r0.Y = r3
            long r2 = r4.a
            r5.a(r2)
            e5f r4 = defpackage.e5f.a
            if (r4 != r1) goto L_0x0046
            return r1
        L_0x0046:
            zlb r4 = new zlb
            int r5 = defpackage.woc.m
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            int r5 = defpackage.yea.E0
            eqe r1 = new eqe
            r1.<init>(r5)
            r4.<init>(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq3.t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean w() {
        m83 m83 = this.m;
        if (m83 == null) {
            return false;
        }
        u83 u83 = (u83) m83.h.getValue();
        p83 p83 = u83 instanceof p83 ? (p83) u83 : null;
        return p83 != null && p83.b;
    }

    public final c64 x() {
        dp3 dp3 = hdb.b;
        ckb.c.getClass();
        return new c64(":profile/avatars?id=" + this.a + "&type=contact");
    }

    public final amb y() {
        tab tab;
        CharSequence charSequence;
        mab mab = (mab) this.e.a.getValue();
        if (mab == null || (tab = mab.a) == null || (charSequence = tab.e) == null) {
            return null;
        }
        return ((gcb) this.p.getValue()).a(2, charSequence, false);
    }
}
