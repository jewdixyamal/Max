package defpackage;

import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: orb  reason: default package */
public final class orb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ rrb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public orb(Continuation continuation, rrb rrb) {
        super(2, continuation);
        this.Y = rrb;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((orb) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        orb orb = new orb(continuation, this.Y);
        orb.X = obj;
        return orb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        brb brb = (brb) this.X;
        float f = rrb.H0;
        rrb rrb = this.Y;
        rrb.getClass();
        if (brb instanceof arb) {
            hv1 cameraApi = rrb.getCameraApi();
            ExecutorService executorService = rrb.s0;
            if (executorService == null) {
                executorService = null;
            }
            cameraApi.d(executorService);
        } else if (brb instanceof yqb) {
            rrb.getCameraApi().a(((yqb) brb).a);
        } else if (brb instanceof zqb) {
            rrb.getCameraApi().g();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
