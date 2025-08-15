package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* renamed from: zg1  reason: default package */
public final class zg1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallRateBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zg1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.Y = callRateBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zg1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zg1 zg1 = new zg1(continuation, this.Y);
        zg1.X = obj;
        return zg1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = CallRateBottomSheet.I0;
        CallRateBottomSheet callRateBottomSheet = this.Y;
        callRateBottomSheet.getClass();
        ((TextView) callRateBottomSheet.D0.T0(callRateBottomSheet, CallRateBottomSheet.I0[3])).setText(((jqe) this.X).b(callRateBottomSheet.getContext()));
        return e5f.a;
    }
}
