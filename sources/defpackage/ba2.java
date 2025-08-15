package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ba2  reason: default package */
public final class ba2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ ka2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ba2(int i, ka2 ka2, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = ka2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ba2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ba2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        switch (i) {
            case 0:
                od2.a0(obj);
                int i2 = sea.u;
                ka2 ka2 = this.Z;
                int i3 = this.Y;
                if (i3 == i2) {
                    e52 p = ka2.p();
                    if (p == null || !p.c()) {
                        this.X = 2;
                        ka2.n(ka2);
                        if (e5f == tx3) {
                            return tx3;
                        }
                    } else {
                        kld kld = ka2.d;
                        ka2.c().getClass();
                        rfb rfb = new rfb(new eqe(vea.P), (jqe) null, y53.M(new mg3(sea.t, new eqe(vea.O), 1, false), new mg3(sea.s, new eqe(vea.N), 2, false)));
                        this.X = 1;
                        if (kld.a(rfb, this) == tx3) {
                            return tx3;
                        }
                    }
                } else if (i3 == sea.q) {
                    e52 p2 = ka2.p();
                    if (p2 == null || !p2.c()) {
                        this.X = 4;
                        ka2.n(ka2);
                        if (e5f == tx3) {
                            return tx3;
                        }
                    } else {
                        kld kld2 = ka2.d;
                        ka2.c().getClass();
                        rfb rfb2 = new rfb(new eqe(vea.I), new eqe(vea.H), y53.M(new mg3(sea.p, new eqe(vea.G), 1, false), new mg3(sea.o, new eqe(vea.F), 2, false)));
                        this.X = 3;
                        if (kld2.a(rfb2, this) == tx3) {
                            return tx3;
                        }
                    }
                } else if (i3 == sea.t || i3 == sea.p) {
                    this.X = 5;
                    ka2.n(ka2);
                    if (e5f == tx3) {
                        return tx3;
                    }
                } else if (i3 == sea.m || i3 == sea.j) {
                    this.X = 6;
                    bc7[] bc7Arr = ka2.E;
                    Object t0 = j47.t0(((w9a) ka2.q()).b(), new y92(ka2, (Continuation) null), this);
                    if (t0 != tx3) {
                        t0 = e5f;
                    }
                    if (t0 == tx3) {
                        return tx3;
                    }
                } else if (i3 == sea.C || i3 == sea.y) {
                    this.X = 7;
                    bc7[] bc7Arr2 = ka2.E;
                    vxd S = j47.S(ka2.a, ((w9a) ka2.q()).b(), vx3.b, new aa2(ka2, (Continuation) null));
                    ka2.y.o1(ka2, ka2.E[0], S);
                    if (e5f == tx3) {
                        return tx3;
                    }
                } else if (i3 == sea.A || i3 == sea.w) {
                    kld kld3 = ka2.d;
                    gfb.c.getClass();
                    c64 c64 = new c64(":profile/change-owner?chat_id=" + ka2.n + "&leave_chat=true");
                    this.X = 8;
                    if (kld3.a(c64, this) == tx3) {
                        return tx3;
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
                od2.a0(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
