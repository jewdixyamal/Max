package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;

/* renamed from: ecc  reason: default package */
public final class ecc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordExitBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ecc(Continuation continuation, RecordExitBottomSheet recordExitBottomSheet) {
        super(2, continuation);
        this.Y = recordExitBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ecc) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ecc ecc = new ecc(continuation, this.Y);
        ecc.X = obj;
        return ecc;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = RecordExitBottomSheet.G0;
        this.Y.D0().setDescription((CharSequence) this.X);
        return e5f.a;
    }
}
