package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: hs7  reason: default package */
public final class hs7 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ je7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hs7(je7 je7, Continuation continuation) {
        super(2, continuation);
        this.Z = je7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hs7) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hs7 hs7 = new hs7(this.Z, continuation);
        hs7.Y = obj;
        return hs7;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            hmc hmc = (hmc) this.Z.getValue();
            this.X = 1;
            Object t0 = j47.t0(((w9a) hmc.a).b(), new cmc(hmc, (List) this.Y, (Continuation) null), this);
            if (t0 != tx3) {
                t0 = e5f;
            }
            if (t0 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
