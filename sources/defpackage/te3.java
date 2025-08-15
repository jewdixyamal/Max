package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;

/* renamed from: te3  reason: default package */
public final class te3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmAddOpponentToCallBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public te3(Continuation continuation, ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet) {
        super(2, continuation);
        this.Y = confirmAddOpponentToCallBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((te3) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        te3 te3 = new te3(continuation, this.Y);
        te3.X = obj;
        return te3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof c64) {
            je1.c.R1((c64) wm9);
            this.Y.s0(true);
        }
        return e5f.a;
    }
}
