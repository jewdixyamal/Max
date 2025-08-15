package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: cnb  reason: default package */
public final class cnb extends pnf {
    public static final /* synthetic */ bc7[] S0;
    public final s35 A0 = new s35(0);
    public final w4d B0 = mqd.D();
    public final w4d C0 = mqd.D();
    public final w4d D0 = mqd.D();
    public final w4d E0 = mqd.D();
    public final je7 F0 = tu0.r(3, new lab(21));
    public final je7 G0 = tu0.r(3, new lab(22));
    public final je7 H0 = tu0.r(3, new lab(23));
    public final q0e I0;
    public final w7c J0;
    public final q0e K0;
    public final w7c L0;
    public final q0e M0;
    public final w7c N0;
    public final pab O0;
    public final AtomicReference P0;
    public final Context Q0;
    public boolean R0;
    public final je7 X;
    public final je7 Y;
    public final ehb Z;
    public final hdb b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final aab y0;
    public final s35 z0 = new s35(0);

    static {
        Class<cnb> cls = cnb.class;
        S0 = new bc7[]{new oi9(cls, "leaveChatJob", "getLeaveChatJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "attacheClickJob", "getAttacheClickJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "openCallJob", "getOpenCallJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;")};
    }

    public cnb(long j, hdb hdb, boolean z, y7g y7g) {
        pab pab;
        this.b = hdb;
        String name = cnb.class.getName();
        xcb xcb = xcb.a;
        je7 e = xcb.e();
        this.c = xcb.c();
        this.o = xcb.getAccessor().d(zfc.class);
        this.X = xcb.getAccessor().d(s8g.class);
        this.Y = xcb.f();
        ehb ehb = (ehb) xcb.getAccessor().c(ehb.class);
        this.Z = ehb;
        this.s0 = xcb.getAccessor().d(eua.class);
        this.t0 = xcb.d();
        this.u0 = xcb.getAccessor().d(y7d.class);
        this.v0 = xcb.getAccessor().d(kk5.class);
        this.w0 = xcb.getAccessor().d(vj7.class);
        this.x0 = xcb.getAccessor().d(fl7.class);
        this.y0 = new aab((ad) xcb.getAccessor().c(ad.class), (q33) xcb.getAccessor().c(q33.class));
        nz4 nz4 = nz4.a;
        q0e a = r0e.a(nz4);
        this.I0 = a;
        this.J0 = new w7c(a);
        q0e a2 = r0e.a(nz4);
        this.K0 = a2;
        this.L0 = new w7c(a2);
        q0e a3 = r0e.a((Object) null);
        this.M0 = a3;
        this.N0 = new w7c(a3);
        this.P0 = new AtomicReference();
        this.Q0 = (Context) xcb.getAccessor().c(Context.class);
        hm9.m(name, "inited by " + hdb + ":#" + j, new Object[0]);
        int ordinal = hdb.ordinal();
        if (ordinal == 0) {
            e52 e52 = (e52) ((jz2) t()).m(j).a.getValue();
            uj3 l = e52 != null ? e52.l() : null;
            if (e52 == null || !e52.H()) {
                pab = (e52 == null || !e52.M() || l == null) ? new cn2(j, this.a, y7g) : new cq3(l.n(), this.a, z);
            } else if (l != null) {
                pab = new nq0(l.n(), this.a);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else if (ordinal == 1) {
            pab = new pab(j);
        } else if (ordinal == 2) {
            uj3 uj3 = (uj3) ((ds3) ((khe) e).getValue()).c(j).a.getValue();
            pab = (uj3 == null || !uj3.t()) ? new cq3(j, this.a, z) : new nq0(j, this.a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.O0 = pab;
        od2.L(od2.F(new zn5(new t03(pab.e, 11), new jmb(this, (Continuation) null), 5), ((w9a) u()).a()), this.a);
        od2.L(new zn5(new v7c(ehb.b), new kmb(this, (Continuation) null), 5), this.a);
    }

    public final void A() {
        pnf.o(this.z0, new ulb(new eqe(yea.p0), new imb(this, 0)));
    }

    public final void B() {
        vlb vlb;
        vlb vlb2;
        tab tab = (tab) this.M0.getValue();
        Object obj = tab != null ? tab.e : null;
        if (obj == null) {
            obj = "";
        }
        int k = this.O0.k();
        if (k != 0) {
            gcb gcb = (gcb) this.G0.getValue();
            gcb.getClass();
            int s = au1.s(k);
            if (s != 0) {
                if (s == 1) {
                    eqe eqe = new eqe(yea.M0);
                    eqe eqe2 = new eqe(yea.N0);
                    kl7 l = j1e.l();
                    l.add(new mg3(wea.B, new eqe(yea.L0), 1, false));
                    l.add(gcb.b());
                    vlb2 = new vlb(eqe, eqe2, j1e.d(l), (Bundle) null);
                } else if (s == 2) {
                    eqe eqe3 = new eqe(yea.K0);
                    eqe eqe4 = new eqe(yea.J0);
                    kl7 l2 = j1e.l();
                    l2.add(new mg3(wea.r, new eqe(yea.i0), 1, false));
                    l2.add(new mg3(wea.A, new eqe(yea.I0), 1, false));
                    l2.add(gcb.b());
                    vlb2 = new vlb(eqe3, eqe4, j1e.d(l2), (Bundle) null);
                } else if (s == 3) {
                    vlb = gcb.c();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                vlb = vlb2;
            } else {
                gqe gqe = new gqe(yea.O0, ys.m0(new Object[]{obj}));
                kl7 l3 = j1e.l();
                l3.add(new mg3(wea.r, new eqe(yea.i0), 1, false));
                l3.add(new mg3(wea.B, new eqe(yea.L0), 1, false));
                l3.add(gcb.b());
                vlb = new vlb(gqe, (jqe) null, j1e.d(l3), (Bundle) null);
            }
            pnf.o(this.z0, vlb);
        }
    }

    public final void C(boolean z) {
        pnf.o(this.z0, new ulb(new eqe(z ? yea.n0 : yea.q0), new xa1((Object) this, z, 4)));
    }

    public final void D() {
        this.P0.set((Object) null);
        pnf.o(this.z0, new zlb(new eqe(yea.Y), Integer.valueOf(woc.I)));
    }

    public final void p() {
        this.O0.d();
        ehb ehb = this.Z;
        ehb.a.f(ehb);
        bc7[] bc7Arr = S0;
        bc7 bc7 = bc7Arr[0];
        w4d w4d = this.B0;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(this, bc7Arr[0], (Object) null);
        bc7 bc72 = bc7Arr[1];
        w4d w4d2 = this.C0;
        x77 x772 = (x77) w4d2.T0(this, bc72);
        if (x772 != null) {
            x772.cancel((CancellationException) null);
        }
        w4d2.o1(this, bc7Arr[1], (Object) null);
    }

    public final void q() {
        Long i = this.O0.i();
        if (i != null) {
            pnf.o(this.z0, new ulb(new eqe(yea.B0), new nq2(this, i.longValue(), 3)));
        }
    }

    public final String r() {
        String h = this.O0.h();
        if (h == null) {
            return "";
        }
        if (tpa.s()) {
            pnf.o(this.z0, new zlb(new eqe(yea.s1), Integer.valueOf(woc.u)));
        }
        return h;
    }

    public final void s() {
        Long i;
        if (!this.R0 && (i = this.O0.i()) != null) {
            long longValue = i.longValue();
            this.R0 = true;
            lx3 plus = ((w9a) u()).b().plus(xq9.a);
            omb omb = new omb(this, longValue, (Continuation) null);
            j47.S(this.a, plus, vx3.c, omb);
        }
    }

    public final iy2 t() {
        return (iy2) this.c.getValue();
    }

    public final kke u() {
        return (kke) this.Y.getValue();
    }

    public final void v(String str) {
        vxd S = j47.S(this.a, ((w9a) u()).b(), vx3.b, new pmb(this, str, (Continuation) null));
        this.E0.o1(this, S0[3], S);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, mec] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, lec] */
    public final void w(boolean z) {
        ? obj = new Object();
        pab pab = this.O0;
        hdb l = pab.l();
        if (l != null) {
            obj.a = l;
            ? obj2 = new Object();
            obj2.a = pab.m();
            vxd n = pnf.n(this, (lx3) null, vx3.b, new vmb(obj, obj2, this, z, (Continuation) null), 1);
            this.D0.o1(this, S0[2], n);
        }
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [e47, java.lang.Object] */
    public final void x(int i, String str, lk7 lk7) {
        String str2;
        pab pab = this.O0;
        char c2 = 4;
        boolean z = pab.p() ? true : pab instanceof nq0 ? true : pab.r() ? true : true;
        long m = pab.m();
        aab aab = this.y0;
        aab.getClass();
        int s = au1.s(ju0.B(str) ? 3 : ju0.C(str) ? 2 : 1);
        if (s != 0) {
            if (s == 1) {
                c2 = 3;
            } else if (s == 2) {
                c2 = 2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (lk7 != lk7.X) {
            c2 = 1;
        }
        int i2 = 1;
        if (c2 != 1) {
            i2 = 2;
            if (c2 != 2) {
                i2 = 3;
                if (c2 != 3) {
                    i2 = 4;
                    if (c2 != 4) {
                        throw null;
                    }
                }
            }
        }
        kpa kpa = new kpa("element_type", Integer.valueOf(i2));
        kpa kpa2 = new kpa("source_id", Long.valueOf(m));
        int i3 = 1;
        if (!z) {
            i3 = 2;
            if (!z) {
                i3 = 3;
                if (!z) {
                    i3 = 4;
                    if (!z) {
                        throw null;
                    }
                }
            }
        }
        Map a0 = mz7.a0(kpa, kpa2, new kpa("source_type", Integer.valueOf(i3)));
        ? obj = new Object();
        obj.a = System.currentTimeMillis();
        obj.c = "CHAT_PROFILE_CLICKABLE_ELEMENT_ACTIONS";
        if (i == 1) {
            str2 = "clicked_clickable_element";
        } else if (i == 2) {
            str2 = "clicked_open_context_menu";
        } else if (i == 3) {
            str2 = "clicked_copy";
        } else if (i == 4) {
            str2 = "clicked_in_context_menu";
        } else {
            throw null;
        }
        obj.o = str2;
        q33 q33 = (q33) aab.b;
        obj.b = ((hyc) q33).t();
        obj.b(a0);
        obj.X = ((t33) q33).F();
        ((ad) aab.a).j(obj.c());
    }

    public final void y() {
        if (!((eua) this.s0.getValue()).b(eua.l)) {
            pnf.o(this.z0, slb.a);
            return;
        }
        j47.T(this.a, ((w9a) u()).b(), (vx3) null, new ymb(this, (Continuation) null), 2);
    }

    public final void z() {
        this.P0.set((Object) null);
        pnf.o(this.z0, new zlb(new eqe(yea.Y), Integer.valueOf(woc.I)));
    }
}
