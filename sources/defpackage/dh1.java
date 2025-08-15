package defpackage;

import android.transition.TransitionManager;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.sdk.arch.Widget;

/* renamed from: dh1  reason: default package */
public final class dh1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallRateBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dh1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.Y = callRateBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((dh1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dh1 dh1 = new dh1(continuation, this.Y);
        dh1.X = obj;
        return dh1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        hh1 hh1 = (hh1) this.X;
        boolean f = tpa.f(hh1, gh1.a);
        CallRateBottomSheet callRateBottomSheet = this.Y;
        if (f) {
            bc7[] bc7Arr = CallRateBottomSheet.I0;
            TransitionManager.beginDelayedTransition((ViewGroup) callRateBottomSheet.getView(), callRateBottomSheet.B0);
            bc7[] bc7Arr2 = CallRateBottomSheet.I0;
            ((n04) callRateBottomSheet.H0.T0(callRateBottomSheet, bc7Arr2[7])).setVisibility(0);
            ((w4c) callRateBottomSheet.E0.T0(callRateBottomSheet, bc7Arr2[4])).setVisibility(8);
            callRateBottomSheet.A0().setVisibility(8);
        } else if (tpa.f(hh1, eh1.a)) {
            bc7[] bc7Arr3 = CallRateBottomSheet.I0;
            callRateBottomSheet.A0().v0.g();
        } else if (tpa.f(hh1, fh1.a)) {
            wha wha = new wha((Widget) callRateBottomSheet);
            wha.g(new eqe(b8a.F0));
            wha.a(new eqe(b8a.E0));
            wha.e(new kia(yfa.n));
            wha.i();
            callRateBottomSheet.s0(true);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
