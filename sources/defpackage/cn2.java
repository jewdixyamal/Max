package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: cn2  reason: default package */
public final class cn2 extends pab {
    public final y7g f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final String k = cn2.class.getName();
    public final je7 l;
    public final khe m;
    public final khe n;
    public final je7 o;
    public final je7 p;
    public final je7 q;
    public final je7 r;
    public final je7 s;
    public final AtomicLong t;

    public cn2(long j2, sx3 sx3, y7g y7g) {
        super(j2);
        this.f = y7g;
        xcb xcb = xcb.a;
        je7 c = xcb.c();
        this.g = c;
        this.h = xcb.e();
        je7 f2 = xcb.f();
        this.i = f2;
        this.j = xcb.g();
        xcb.d();
        this.l = xcb.getAccessor().d(fl7.class);
        this.m = new khe(new m52(22));
        this.n = new khe(new m52(23));
        this.o = xcb.getAccessor().d(r12.class);
        this.p = xcb.b();
        this.q = tu0.r(3, new m52(24));
        this.r = tu0.r(3, new m52(25));
        this.s = xcb.getAccessor().d(c97.class);
        this.t = new AtomicLong();
        od2.L(od2.F(new zn5(new t03(new ac(new mqc(new bn2(new t03(((jz2) ((iy2) c.getValue())).m(j2), 11), (Continuation) null, sx3, this)), 12, this), 11), new lq0(2, this, cn2.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", 4, 8), 5), ((w9a) ((kke) f2.getValue())).a()), sx3);
    }

    public final void C(Continuation continuation) {
    }

    public final e52 D() {
        return (e52) ((jz2) ((iy2) this.g.getValue())).m(this.a).a.getValue();
    }

    public final void a(Continuation continuation) {
    }

    public final boolean b() {
        e52 D = D();
        if (D != null) {
            return D.a();
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r7, android.graphics.RectF r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.vm2
            if (r0 == 0) goto L_0x0013
            r0 = r9
            vm2 r0 = (defpackage.vm2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            vm2 r0 = new vm2
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            java.util.concurrent.atomic.AtomicLong r6 = r0.o
            defpackage.od2.a0(r9)
            goto L_0x0059
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            defpackage.od2.a0(r9)
            e52 r9 = r6.D()
            if (r9 != 0) goto L_0x003d
            return r3
        L_0x003d:
            a20 r8 = defpackage.nd7.k(r8)
            java.util.concurrent.atomic.AtomicLong r2 = r6.t
            je7 r6 = r6.o
            java.lang.Object r6 = r6.getValue()
            r12 r6 = (defpackage.r12) r6
            r0.o = r2
            r0.Z = r4
            long r4 = r9.a
            java.lang.Long r9 = r6.a(r4, r7, r8)
            if (r9 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r6 = r2
        L_0x0059:
            java.lang.Number r9 = (java.lang.Number) r9
            long r7 = r9.longValue()
            r6.set(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn2.c(java.lang.String, android.graphics.RectF, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d() {
    }

    public final ka1 e() {
        return new jkb(this.a, hdb.LOCAL_CHAT);
    }

    public final long g() {
        return this.t.get();
    }

    public final String h() {
        k92 k92;
        e52 D = D();
        if (D == null || (k92 = D.b) == null) {
            return null;
        }
        return k92.I;
    }

    public final Long i() {
        return Long.valueOf(this.a);
    }

    public final Long j() {
        e52 D = D();
        if (D != null) {
            return Long.valueOf(D.b.a);
        }
        return null;
    }

    public final int k() {
        e52 D = D();
        return (D == null || !D.I()) ? 1 : 3;
    }

    public final hdb l() {
        return hdb.LOCAL_CHAT;
    }

    public final long m() {
        return this.a;
    }

    public final Object n(Continuation continuation) {
        return D();
    }

    public final boolean p() {
        e52 D = D();
        return D != null && D.I();
    }

    public final boolean q() {
        e52 D = D();
        return D != null && D.d0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r7 = r7.b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.wm2
            if (r0 == 0) goto L_0x0013
            r0 = r7
            wm2 r0 = (defpackage.wm2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            wm2 r0 = new wm2
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 == r5) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            defpackage.od2.a0(r7)
            goto L_0x0076
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            defpackage.od2.a0(r7)
            goto L_0x0072
        L_0x0037:
            defpackage.od2.a0(r7)
            e52 r7 = r6.D()
            if (r7 == 0) goto L_0x0047
            boolean r7 = r7.S()
            if (r7 != r5) goto L_0x0047
            goto L_0x0053
        L_0x0047:
            e52 r7 = r6.D()
            if (r7 == 0) goto L_0x0073
            boolean r7 = r7.b()
            if (r7 != r5) goto L_0x0073
        L_0x0053:
            e52 r7 = r6.D()
            if (r7 == 0) goto L_0x0060
            k92 r7 = r7.b
            if (r7 == 0) goto L_0x0060
            java.lang.String r7 = r7.I
            goto L_0x0061
        L_0x0060:
            r7 = r4
        L_0x0061:
            je7 r6 = r6.s
            java.lang.Object r6 = r6.getValue()
            c97 r6 = (defpackage.c97) r6
            r0.Y = r5
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L_0x0072
            return r1
        L_0x0072:
            return r4
        L_0x0073:
            r0.Y = r3
            r7 = r4
        L_0x0076:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn2.t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final e5f u() {
        e52 D = D();
        mab mab = (mab) this.e.a.getValue();
        e5f e5f = e5f.a;
        if (D == null || mab == null) {
            return e5f;
        }
        List h2 = D.h();
        String g2 = D.g(kk0.b, jk0.a);
        tab tab = mab.a;
        e5f e5f2 = e5f;
        tab tab2 = r4;
        tab tab3 = new tab(tab.a, tab.b, h2, g2, tab.e, tab.f, tab.g, tab.h, tab.i, tab.j, tab.k);
        f(mab.a(mab, tab2, (List) null, 6));
        return e5f2;
    }

    public final Object v(long j2, boolean z, Continuation continuation) {
        Object t0 = j47.t0(((w9a) ((kke) this.i.getValue())).b(), new xm2(this, j2, z, (Continuation) null), continuation);
        return t0 == tx3.a ? t0 : e5f.a;
    }

    public final c64 x() {
        dp3 dp3 = hdb.b;
        ckb.c.getClass();
        return new c64(":profile/avatars?id=" + this.a + "&type=local_chat");
    }

    public final amb y() {
        tab tab;
        CharSequence charSequence;
        mab mab = (mab) this.e.a.getValue();
        if (mab == null || (tab = mab.a) == null || (charSequence = tab.e) == null) {
            return null;
        }
        int k2 = k();
        e52 D = D();
        je7 je7 = this.r;
        boolean z = true;
        if (D == null || !D.c()) {
            gcb gcb = (gcb) je7.getValue();
            e52 D2 = D();
            if (D2 == null || !D2.b0()) {
                z = false;
            }
            return gcb.a(k2, charSequence, z);
        }
        gcb gcb2 = (gcb) je7.getValue();
        gcb2.getClass();
        int s2 = au1.s(k2);
        if (s2 == 0) {
            gqe gqe = new gqe(yea.p1, ys.m0(new Object[]{charSequence}));
            kl7 l2 = j1e.l();
            l2.add(new mg3(wea.Q, new eqe(yea.m1), 1, false));
            l2.add(new mg3(wea.y, new eqe(yea.n1), 3, false));
            return new vlb(gqe, (jqe) null, j1e.d(l2), (Bundle) null);
        } else if (s2 == 1) {
            return gcb2.c();
        } else {
            if (s2 == 2) {
                gqe gqe2 = new gqe(yea.l1, ys.m0(new Object[]{charSequence}));
                eqe eqe = new eqe(yea.k1);
                kl7 l3 = j1e.l();
                l3.add(new mg3(wea.Q, new eqe(yea.m1), 1, false));
                l3.add(new mg3(wea.y, new eqe(yea.n1), 3, false));
                return new vlb(gqe2, eqe, j1e.d(l3), (Bundle) null);
            } else if (s2 == 3) {
                return gcb2.c();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final amb z(long j2) {
        String d;
        uj3 uj3 = (uj3) ((ds3) this.h.getValue()).c(j2).a.getValue();
        if (uj3 == null || (d = uj3.d()) == null) {
            return null;
        }
        gcb gcb = (gcb) this.r.getValue();
        int k2 = k();
        gcb.getClass();
        int s2 = au1.s(k2);
        if (s2 == 0) {
            return new vlb(new gqe(yea.l2, ys.m0(new Object[]{d})), (jqe) null, y53.M(new mg3(wea.B0, new eqe(yea.f2), 1, false), new mg3(wea.D0, new eqe(yea.h2), 1, false), new mg3(wea.C0, new eqe(yea.g2), 2, false)), dy7.g(new kpa("profile:participant_id_for_action", Long.valueOf(j2))));
        }
        if (s2 == 1 || s2 == 2 || s2 == 3) {
            return gcb.c();
        }
        throw new NoWhenBranchMatchedException();
    }
}
