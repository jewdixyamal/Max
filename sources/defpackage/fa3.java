package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* renamed from: fa3  reason: default package */
public final class fa3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ComplaintBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fa3(Continuation continuation, ComplaintBottomSheet complaintBottomSheet) {
        super(2, continuation);
        this.Y = complaintBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fa3) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fa3 fa3 = new fa3(continuation, this.Y);
        fa3.X = obj;
        return fa3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (tpa.f((ma3) this.X, ma3.a)) {
            ((wha) this.Y.o.getValue()).i();
            return e5f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
