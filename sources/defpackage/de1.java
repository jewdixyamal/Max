package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;

/* renamed from: de1  reason: default package */
public final class de1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallMoreBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public de1(Continuation continuation, CallMoreBottomSheet callMoreBottomSheet) {
        super(2, continuation);
        this.Y = callMoreBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((de1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        de1 de1 = new de1(continuation, this.Y);
        de1.X = obj;
        return de1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (tpa.f((wm9) this.X, cj1.D)) {
            this.Y.s0(true);
        }
        return e5f.a;
    }
}
