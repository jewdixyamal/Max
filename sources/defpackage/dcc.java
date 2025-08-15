package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;

/* renamed from: dcc  reason: default package */
public final class dcc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordExitBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dcc(Continuation continuation, RecordExitBottomSheet recordExitBottomSheet) {
        super(2, continuation);
        this.Y = recordExitBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((dcc) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dcc dcc = new dcc(continuation, this.Y);
        dcc.X = obj;
        return dcc;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (tpa.f((wm9) this.X, cj1.D)) {
            this.Y.s0(true);
        }
        return e5f.a;
    }
}
