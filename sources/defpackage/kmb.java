package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: kmb  reason: default package */
public final class kmb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cnb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kmb(cnb cnb, Continuation continuation) {
        super(2, continuation);
        this.Y = cnb;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((kmb) n((chb) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kmb kmb = new kmb(this.Y, continuation);
        kmb.X = obj;
        return kmb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        chb chb = (chb) this.X;
        boolean z = chb instanceof zgb;
        cnb cnb = this.Y;
        if (z) {
            zgb zgb = (zgb) chb;
            Long l = zgb.a;
            long g = cnb.O0.g();
            if (l != null && l.longValue() == g) {
                j47.T(cnb.a, ((w9a) cnb.u()).b(), (vx3) null, new qmb(cnb, (Continuation) null), 2);
                pnf.o(cnb.z0, new zlb(zgb.b, Integer.valueOf(woc.I)));
            }
        } else if (chb instanceof ahb) {
            Long l2 = ((ahb) chb).a;
            long g2 = cnb.O0.g();
            if (l2 != null && l2.longValue() == g2) {
                pnf.o(cnb.z0, new zlb(new eqe(yea.Z), Integer.valueOf(yfa.k)));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
