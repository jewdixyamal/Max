package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* renamed from: nlb  reason: default package */
public final /* synthetic */ class nlb implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qlb b;

    public /* synthetic */ nlb(qlb qlb, int i) {
        this.a = i;
        this.b = qlb;
    }

    public final Object invoke(Object obj) {
        vlb vlb;
        vlb vlb2;
        switch (this.a) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                cnb r0 = ((ProfileScreen) this.b.X).r0();
                String h = r0.O0.h();
                if (h != null) {
                    pnf.o(r0.z0, new rlb(new gqe(yoc.i, ys.m0(new Object[]{h}))));
                }
                return e5f.a;
            default:
                int intValue = ((Integer) obj).intValue();
                ProfileScreen profileScreen = (ProfileScreen) this.b.X;
                profileScreen.getClass();
                if (intValue == wea.l) {
                    profileScreen.r0().w(false);
                } else if (intValue == wea.q1) {
                    profileScreen.r0().w(true);
                } else if (intValue == wea.m1) {
                    cnb r02 = profileScreen.r0();
                    Long i = r02.O0.i();
                    if (i != null) {
                        pnf.o(r02.A0, new qkb(i.longValue()));
                    }
                } else if (intValue == wea.W0) {
                    cnb r03 = profileScreen.r0();
                    gcb gcb = (gcb) r03.G0.getValue();
                    gcb.getClass();
                    eqe eqe = new eqe(yea.v2);
                    kl7 l = j1e.l();
                    l.add(new mg3(wea.S0, new eqe(yea.x2), 3, false));
                    l.add(new mg3(wea.T0, new eqe(yea.y2), 3, false));
                    l.add(new mg3(wea.R0, new eqe(yea.w2), 3, false));
                    l.add(new mg3(wea.U0, new eqe(yea.z2), 1, false));
                    l.add(gcb.b());
                    pnf.o(r03.z0, new vlb(eqe, (jqe) null, j1e.d(l), (Bundle) null));
                } else if (intValue == wea.V0) {
                    cnb r04 = profileScreen.r0();
                    Long i2 = r04.O0.i();
                    if (i2 != null) {
                        ((jz2) r04.t()).l().g0(i2.longValue());
                        pnf.o(r04.z0, new zlb(new eqe(yea.B2), Integer.valueOf(woc.n)));
                    }
                } else if (intValue == wea.o1) {
                    cnb r05 = profileScreen.r0();
                    j47.T(r05.a, ((w9a) r05.u()).a(), (vx3) null, new wmb(r05, (Continuation) null), 2);
                } else if (intValue == wea.n1) {
                    cnb r06 = profileScreen.r0();
                    j47.T(r06.a, ((w9a) r06.u()).b(), (vx3) null, new zmb(r06, (Continuation) null), 2);
                } else if (intValue == wea.p1) {
                    cnb r07 = profileScreen.r0();
                    j47.T(r07.a, ((w9a) r07.u()).b(), (vx3) null, new bnb(r07, (Continuation) null), 2);
                } else if (intValue == wea.H0) {
                    cnb r08 = profileScreen.r0();
                    Long j = r08.O0.j();
                    if (j != null) {
                        pnf.o(r08.A0, new ekb(j.longValue()));
                    }
                } else {
                    CharSequence charSequence2 = "";
                    if (intValue == wea.J0) {
                        cnb r09 = profileScreen.r0();
                        pab pab = r09.O0;
                        pab.getClass();
                        if (pab instanceof nq0) {
                            r09.q();
                        } else {
                            tab tab = (tab) r09.M0.getValue();
                            CharSequence charSequence3 = tab != null ? tab.e : null;
                            if (charSequence3 != null) {
                                charSequence2 = charSequence3;
                            }
                            int k = pab.k();
                            if (k != 0) {
                                gcb gcb2 = (gcb) r09.G0.getValue();
                                gcb2.getClass();
                                int s = au1.s(k);
                                if (s == 0) {
                                    gqe gqe = new gqe(yea.D0, ys.m0(new Object[]{charSequence2}));
                                    kl7 l2 = j1e.l();
                                    l2.add(new mg3(wea.x, new eqe(yea.z0), 1, false));
                                    l2.add(gcb2.b());
                                    vlb2 = new vlb(gqe, (jqe) null, j1e.d(l2), (Bundle) null);
                                } else if (s == 1) {
                                    eqe eqe2 = new eqe(yea.A0);
                                    gqe gqe2 = new gqe(yea.C0, ys.m0(new Object[]{charSequence2}));
                                    kl7 l3 = j1e.l();
                                    l3.add(new mg3(wea.x, new eqe(yea.z0), 1, false));
                                    l3.add(gcb2.b());
                                    vlb2 = new vlb(eqe2, gqe2, j1e.d(l3), (Bundle) null);
                                } else if (s == 2) {
                                    eqe eqe3 = new eqe(yea.y0);
                                    eqe eqe4 = new eqe(yea.x0);
                                    kl7 l4 = j1e.l();
                                    l4.add(new mg3(wea.x, new eqe(yea.z0), 1, false));
                                    l4.add(gcb2.b());
                                    vlb2 = new vlb(eqe3, eqe4, j1e.d(l4), (Bundle) null);
                                } else if (s == 3) {
                                    vlb = gcb2.c();
                                    pnf.o(r09.z0, vlb);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                                vlb = vlb2;
                                pnf.o(r09.z0, vlb);
                            }
                        }
                    } else if (intValue == wea.P0) {
                        cnb r010 = profileScreen.r0();
                        Long i3 = r010.O0.i();
                        if (i3 != null) {
                            long longValue = i3.longValue();
                            ckb.c.getClass();
                            pnf.o(r010.A0, new c64(":complaint?chat_id=" + longValue));
                        }
                    } else if (intValue == wea.I0) {
                        cnb r011 = profileScreen.r0();
                        tab tab2 = (tab) r011.M0.getValue();
                        CharSequence charSequence4 = tab2 != null ? tab2.e : null;
                        if (charSequence4 != null) {
                            charSequence2 = charSequence4;
                        }
                        gcb gcb3 = (gcb) r011.G0.getValue();
                        gcb3.getClass();
                        gqe gqe3 = new gqe(yea.V, ys.m0(new Object[]{charSequence2}));
                        eqe eqe5 = new eqe(yea.U);
                        kl7 l5 = j1e.l();
                        l5.add(new mg3(wea.m, new eqe(yea.T), 1, false));
                        l5.add(gcb3.b());
                        pnf.o(r011.z0, new vlb(gqe3, eqe5, j1e.d(l5), (Bundle) null));
                    } else {
                        int i4 = wea.K0;
                        if (intValue == i4) {
                            profileScreen.r0().B();
                        } else if (intValue == wea.Q0) {
                            cnb r012 = profileScreen.r0();
                            r012.getClass();
                            pnf.o(r012.z0, new ulb(new eqe(yea.H2), new imb(r012, 1)));
                        } else if (intValue == wea.M0) {
                            profileScreen.r0().A();
                        } else if (intValue == wea.L0 || intValue == i4) {
                            pab pab2 = profileScreen.r0().O0;
                            pab2.getClass();
                            if (pab2 instanceof nq0) {
                                profileScreen.r0().C(false);
                            } else {
                                profileScreen.r0().B();
                            }
                        } else if (intValue == wea.O0 || intValue == wea.N0) {
                            cnb r013 = profileScreen.r0();
                            amb y = r013.O0.y();
                            if (y != null) {
                                pnf.o(r013.z0, y);
                            }
                        }
                    }
                }
                return e5f.a;
        }
    }
}
