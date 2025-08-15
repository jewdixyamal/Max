package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: pbc  reason: default package */
public final class pbc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pbc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((pbc) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pbc pbc = new pbc(continuation, this.Y);
        pbc.X = obj;
        return pbc;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (tpa.f((cac) this.X, cac.a)) {
            bc7[] bc7Arr = RecordControlsWidget.b1;
            cbc I0 = this.Y.I0();
            if (I0.v0.getValue() instanceof sac) {
                I0.z();
            }
            pnf.o(I0.A0, pac.a);
            return e5f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
