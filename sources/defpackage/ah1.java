package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* renamed from: ah1  reason: default package */
public final class ah1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallRateBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ah1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.Y = callRateBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ah1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ah1 ah1 = new ah1(continuation, this.Y);
        ah1.X = obj;
        return ah1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = CallRateBottomSheet.I0;
        CallRateBottomSheet callRateBottomSheet = this.Y;
        callRateBottomSheet.getClass();
        ((w4c) callRateBottomSheet.E0.T0(callRateBottomSheet, CallRateBottomSheet.I0[4])).setButtonToolDataList((List) this.X);
        return e5f.a;
    }
}
