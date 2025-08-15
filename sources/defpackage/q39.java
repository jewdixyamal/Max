package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: q39  reason: default package */
public final class q39 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q39(n59 n59, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = n59;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((q39) n((xw3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        q39 q39 = new q39(this.Y, this.Z, continuation);
        q39.X = obj;
        return q39;
    }

    public final Object o(Object obj) {
        pnd pnd;
        od2.a0(obj);
        xw3 xw3 = (xw3) this.X;
        if (xw3 instanceof ww3) {
            pnd = new pnd(((ww3) xw3).a, 0, (eqe) null, 6);
        } else if (xw3 instanceof vw3) {
            pnd = new pnd(((vw3) xw3).a, 0, (eqe) null, 6);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        n59 n59 = this.Y;
        pnf.o(n59.u1, pnd);
        n59.x1.remove(new Long(this.Z));
        return e5f.a;
    }
}
