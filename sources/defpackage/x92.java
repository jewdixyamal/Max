package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: x92  reason: default package */
public final class x92 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ka2 Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x92(int i, ka2 ka2, Continuation continuation) {
        super(2, continuation);
        this.Y = ka2;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x92) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new x92(this.Z, this.Y, continuation);
    }

    public final Object o(Object obj) {
        rfb rfb;
        rfb rfb2;
        tx3 tx3 = tx3.a;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                ka2 ka2 = this.Y;
                wu4 wu4 = (wu4) ka2.i.getValue();
                eqe eqe = null;
                String str = wu4 != null ? wu4.d : null;
                if (str == null) {
                    str = "";
                }
                e52 p = ka2.p();
                boolean z = p != null && p.c();
                int i = sea.r;
                kld kld = ka2.d;
                int i2 = this.Z;
                if (i2 == i) {
                    iv4 c = ka2.c();
                    e52 p2 = ka2.p();
                    boolean z2 = p2 != null && p2.c();
                    c.getClass();
                    gqe gqe = new gqe(vea.S, ys.m0(new Object[]{str}));
                    if (z2) {
                        eqe = new eqe(vea.Q);
                    }
                    kl7 l = j1e.l();
                    if (z2) {
                        l.add(new mg3(sea.A, new eqe(vea.s0), 1, false));
                    }
                    l.add(new mg3(sea.u, z2 ? new eqe(vea.R) : new eqe(vea.M), 1, false));
                    l.add(new mg3(sea.s, new eqe(vea.N), 2, false));
                    rfb rfb3 = new rfb(gqe, eqe, j1e.d(l));
                    this.X = 1;
                    if (kld.a(rfb3, this) == tx3) {
                        return tx3;
                    }
                } else if (i2 == sea.k) {
                    ka2.c().getClass();
                    rfb rfb4 = new rfb(new gqe(vea.D, ys.m0(new Object[]{str})), (jqe) null, y53.M(new mg3(sea.m, new eqe(vea.B), 3, false), new mg3(sea.l, new eqe(vea.C), 2, false)));
                    this.X = 2;
                    if (kld.a(rfb4, this) == tx3) {
                        return tx3;
                    }
                } else if (i2 == sea.z) {
                    if (z) {
                        ka2.c().getClass();
                        rfb2 = new rfb(new eqe(vea.u0), new gqe(vea.t0, ys.m0(new Object[]{str})), y53.M(new mg3(sea.A, new eqe(vea.s0), 1, false), new mg3(sea.B, new eqe(vea.r0), 2, false)));
                    } else {
                        ka2.c().getClass();
                        rfb2 = new rfb(new eqe(vea.u0), new gqe(vea.t0, ys.m0(new Object[]{str})), y53.M(new mg3(sea.C, new eqe(vea.q0), 1, false), new mg3(sea.B, new eqe(vea.r0), 2, false)));
                    }
                    this.X = 3;
                    if (kld.a(rfb2, this) == tx3) {
                        return tx3;
                    }
                } else if (i2 == sea.n) {
                    iv4 c2 = ka2.c();
                    e52 p3 = ka2.p();
                    boolean z3 = p3 != null && p3.c();
                    c2.getClass();
                    gqe gqe2 = new gqe(vea.L, ys.m0(new Object[]{str}));
                    if (z3) {
                        eqe = new eqe(vea.J);
                    }
                    kl7 l2 = j1e.l();
                    if (z3) {
                        l2.add(new mg3(sea.w, new eqe(vea.n0), 1, false));
                    }
                    l2.add(new mg3(sea.q, z3 ? new eqe(vea.K) : new eqe(vea.E), 1, false));
                    l2.add(new mg3(sea.o, new eqe(vea.F), 2, false));
                    rfb rfb5 = new rfb(gqe2, eqe, j1e.d(l2));
                    this.X = 4;
                    if (kld.a(rfb5, this) == tx3) {
                        return tx3;
                    }
                } else if (i2 == sea.v) {
                    if (z) {
                        ka2.c().getClass();
                        rfb = new rfb(new eqe(vea.p0), new gqe(vea.o0, ys.m0(new Object[]{str})), y53.M(new mg3(sea.w, new eqe(vea.n0), 1, false), new mg3(sea.x, new eqe(vea.m0), 2, false)));
                    } else {
                        ka2.c().getClass();
                        rfb = new rfb(new eqe(vea.p0), new gqe(vea.o0, ys.m0(new Object[]{str})), y53.M(new mg3(sea.y, new eqe(vea.l0), 1, false), new mg3(sea.x, new eqe(vea.m0), 2, false)));
                    }
                    this.X = 5;
                    if (kld.a(rfb, this) == tx3) {
                        return tx3;
                    }
                } else if (i2 == sea.h) {
                    ka2.c().getClass();
                    rfb rfb6 = new rfb(new gqe(vea.A, ys.m0(new Object[]{str})), new eqe(vea.z), y53.M(new mg3(sea.j, new eqe(vea.x), 1, false), new mg3(sea.i, new eqe(vea.y), 2, false)));
                    this.X = 6;
                    if (kld.a(rfb6, this) == tx3) {
                        return tx3;
                    }
                } else {
                    int i3 = sea.E;
                    long j = ka2.n;
                    if (i2 == i3) {
                        gfb.c.getClass();
                        c64 c64 = new c64(":profile/member_permissions?id=" + j);
                        this.X = 7;
                        if (kld.a(c64, this) == tx3) {
                            return tx3;
                        }
                    } else if (i2 == sea.g) {
                        ifb ifb = new ifb(j, reb.LOCAL_CHAT);
                        this.X = 8;
                        if (kld.a(ifb, this) == tx3) {
                            return tx3;
                        }
                    } else if (i2 == sea.h0) {
                        lfb lfb = new lfb(j);
                        this.X = 9;
                        if (kld.a(lfb, this) == tx3) {
                            return tx3;
                        }
                    } else if (i2 == sea.D) {
                        gfb.c.getClass();
                        c64 c642 = new c64(":profile/change-owner?chat_id=" + j + "&leave_chat=false");
                        this.X = 10;
                        if (kld.a(c642, this) == tx3) {
                            return tx3;
                        }
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                od2.a0(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
