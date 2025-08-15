package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* renamed from: pp2  reason: default package */
public final class pp2 extends ffe implements a66 {
    public final /* synthetic */ rq2 X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pp2(rq2 rq2, View view, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = rq2;
        this.Y = view;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pp2(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        rq2 rq2 = this.X;
        e52 e52 = (e52) rq2.Y0.a.getValue();
        e5f e5f = e5f.a;
        if (e52 == null) {
            return e5f;
        }
        boolean z = !e52.V((q33) rq2.x0.getValue());
        kl7 l = j1e.l();
        if (rq2.w() && !e52.H() && this.Z) {
            l.add(new tt3(xoc.J0, (jqe) new eqe(yoc.N), new Integer(woc.n2), (Integer) null, 20));
        }
        boolean M = e52.M();
        k92 k92 = e52.b;
        if ((M || k92.c != i92.c) && !e52.T() && !e52.L()) {
            l.add(new tt3(xoc.H0, (jqe) new eqe(yoc.M), new Integer(woc.O0), (Integer) null, 20));
        }
        if (!e52.S()) {
            l.add(new tt3(z ? xoc.G0 : xoc.F0, (jqe) new eqe(yoc.L), new Integer(z ? woc.w1 : woc.v1), (Integer) null, 20));
            if (!e52.I() || e52.c0()) {
                l.add(new tt3(xoc.E0, (jqe) new eqe(yoc.j), new Integer(woc.c), (Integer) null, 20));
            }
        }
        if (e52.I() && e52.a0()) {
            l.add(new tt3(xoc.I0, (jqe) new eqe(yoc.z), new Integer(woc.Z1), (Integer) null, 20));
        }
        kl7 d = j1e.d(l);
        kpa kpa = new kpa("chat_server_id", new Long(k92.a));
        uj3 l2 = e52.l();
        pnf.o(rq2.b1, new dp2(d, dy7.g(kpa, new kpa("contact_id", l2 != null ? new Long(l2.n()) : null)), this.Y));
        return e5f;
    }
}
