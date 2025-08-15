package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ch1  reason: default package */
public final class ch1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallRateBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ch1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.Y = callRateBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ch1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ch1 ch1 = new ch1(continuation, this.Y);
        ch1.X = obj;
        return ch1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        bc7[] bc7Arr = CallRateBottomSheet.I0;
        CallRateBottomSheet callRateBottomSheet = this.Y;
        callRateBottomSheet.getClass();
        ((OneMeButton) callRateBottomSheet.G0.T0(callRateBottomSheet, CallRateBottomSheet.I0[6])).setVisibility(booleanValue ? 0 : 8);
        return e5f.a;
    }
}
