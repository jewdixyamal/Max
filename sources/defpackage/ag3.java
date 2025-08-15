package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;

/* renamed from: ag3  reason: default package */
public final class ag3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmRemoveOpponentToCallBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ag3(Continuation continuation, ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet) {
        super(2, continuation);
        this.Y = confirmRemoveOpponentToCallBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ag3) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ag3 ag3 = new ag3(continuation, this.Y);
        ag3.X = obj;
        return ag3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof vj1) {
            ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = this.Y;
            int intValue = ((Number) confirmRemoveOpponentToCallBottomSheet.A0.getValue()).intValue();
            ((tnd) confirmRemoveOpponentToCallBottomSheet.z0.getValue()).getClass();
            tnd.b(dj1.b, new s25(confirmRemoveOpponentToCallBottomSheet, (vj1) wm9, intValue, 1));
            confirmRemoveOpponentToCallBottomSheet.s0(true);
        }
        return e5f.a;
    }
}
