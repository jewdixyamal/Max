package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ea2  reason: default package */
public final class ea2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ka2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ea2(ka2 ka2, Continuation continuation) {
        super(2, continuation);
        this.Y = ka2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ea2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ea2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        rfb rfb;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ka2 ka2 = this.Y;
            boolean z = ka2.B;
            q0e q0e = ka2.b;
            if (z) {
                iv4 c = ka2.c();
                meb meb = (meb) q0e.getValue();
                boolean z2 = (meb == null || meb.a == null) ? false : true;
                c.getClass();
                eqe eqe = new eqe(vea.l);
                kl7 l = j1e.l();
                l.add(new mg3(sea.a0, new eqe(vea.s), 3, false));
                l.add(new mg3(sea.Z, new eqe(vea.r), 3, false));
                if (z2) {
                    l.add(new mg3(sea.X, new eqe(vea.o), 1, false));
                }
                l.add(new mg3(sea.W, new eqe(vea.k), 2, false));
                rfb = new rfb(eqe, (jqe) null, j1e.d(l));
            } else {
                iv4 c2 = ka2.c();
                meb meb2 = (meb) q0e.getValue();
                boolean z3 = (meb2 == null || meb2.a == null) ? false : true;
                c2.getClass();
                eqe eqe2 = new eqe(vea.m);
                kl7 l2 = j1e.l();
                l2.add(new mg3(sea.a0, new eqe(vea.s), 3, false));
                l2.add(new mg3(sea.Z, new eqe(vea.r), 3, false));
                if (z3) {
                    l2.add(new mg3(sea.X, new eqe(vea.o), 1, false));
                }
                l2.add(new mg3(sea.W, new eqe(vea.k), 2, false));
                rfb = new rfb(eqe2, (jqe) null, j1e.d(l2));
            }
            kld kld = ka2.d;
            this.X = 1;
            if (kld.a(rfb, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
