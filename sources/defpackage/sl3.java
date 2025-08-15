package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: sl3  reason: default package */
public final class sl3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ jm3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sl3(int i, jm3 jm3, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = jm3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sl3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sl3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        int i;
        tx3 tx3 = tx3.a;
        int i2 = this.X;
        e5f e5f = e5f.a;
        if (i2 == 0) {
            od2.a0(obj);
            eqe eqe = null;
            jm3 jm3 = this.Z;
            int i3 = this.Y;
            if (i3 == 256) {
                j47.T(jm3.a, ((w9a) jm3.q()).b(), (vx3) null, new wl3(jm3, false, (Continuation) null), 2);
            } else if (i3 == 128) {
                this.X = 1;
                if (jm3.n(jm3, this) == tx3) {
                    return tx3;
                }
            } else if (i3 == sea.e0) {
                this.X = 2;
                if (jm3.n(jm3, this) == tx3) {
                    return tx3;
                }
            } else if (i3 == 64) {
                this.X = 3;
                kld kld = jm3.d;
                jm3.c().getClass();
                eqe eqe2 = new eqe(vea.h0);
                kl7 l = j1e.l();
                Iterator it = hv4.a.iterator();
                while (true) {
                    u1 u1Var = (u1) it;
                    if (u1Var.hasNext()) {
                        faf faf = (faf) u1Var.next();
                        int ordinal = faf.ordinal();
                        if (ordinal == 0) {
                            i = sea.b;
                        } else if (ordinal == 1) {
                            i = sea.c;
                        } else if (ordinal == 2) {
                            i = sea.d;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        l.add(new mg3(i, new aqe(uea.a, faf.b), 2, false));
                    } else {
                        Object a = kld.a(new rfb(eqe2, (jqe) null, j1e.d(l)), this);
                        if (a != tx3) {
                            a = e5f;
                        }
                        if (a == tx3) {
                            return tx3;
                        }
                    }
                }
            } else if (i3 == 512) {
                this.X = 4;
                kld kld2 = jm3.d;
                iv4 c = jm3.c();
                boolean q = ((wr1) ((kr1) jm3.u.getValue())).q();
                c.getClass();
                eqe eqe3 = new eqe(vea.z0);
                if (q) {
                    eqe = new eqe(vea.x0);
                }
                kl7 l2 = j1e.l();
                l2.add(new mg3(sea.k0, q ? new eqe(vea.w0) : new eqe(vea.y0), 1, false));
                l2.add(new mg3(sea.e, new eqe(vea.E0), 2, false));
                Object a2 = kld2.a(new rfb(eqe3, eqe, j1e.d(l2)), this);
                if (a2 != tx3) {
                    a2 = e5f;
                }
                if (a2 == tx3) {
                    return tx3;
                }
            } else if (i3 == sea.v0) {
                kld kld3 = jm3.d;
                ifb ifb = new ifb(jm3.n, reb.CONTACT);
                this.X = 5;
                if (kld3.a(ifb, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
