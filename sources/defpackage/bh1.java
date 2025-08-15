package defpackage;

import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* renamed from: bh1  reason: default package */
public final class bh1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ CallRateBottomSheet Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bh1(Continuation continuation, View view, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.Y = view;
        this.Z = callRateBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bh1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bh1 bh1 = new bh1(continuation, this.Y, this.Z);
        bh1.X = obj;
        return bh1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List<ih1> list = (List) this.X;
        CallRateBottomSheet callRateBottomSheet = this.Z;
        TransitionManager.beginDelayedTransition((ViewGroup) this.Y, callRateBottomSheet.B0);
        b5c A0 = callRateBottomSheet.A0();
        A0.A0.clear();
        A0.removeAllViews();
        callRateBottomSheet.A0().setVisibility(list.isEmpty() ^ true ? 0 : 8);
        for (ih1 ih1 : list) {
            callRateBottomSheet.A0().a(ih1.a, String.valueOf(ih1.b.b(callRateBottomSheet.getContext())));
        }
        return e5f.a;
    }
}
