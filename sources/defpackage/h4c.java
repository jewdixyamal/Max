package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;

/* renamed from: h4c  reason: default package */
public final class h4c extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RaiseHandActionBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h4c(RaiseHandActionBottomSheet raiseHandActionBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.Y = raiseHandActionBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((h4c) n((l4c) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h4c h4c = new h4c(this.Y, continuation);
        h4c.X = obj;
        return h4c;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        l4c l4c = (l4c) this.X;
        bc7[] bc7Arr = RaiseHandActionBottomSheet.B0;
        RaiseHandActionBottomSheet raiseHandActionBottomSheet = this.Y;
        raiseHandActionBottomSheet.getClass();
        bc7[] bc7Arr2 = RaiseHandActionBottomSheet.B0;
        int i = 0;
        ((TextView) raiseHandActionBottomSheet.z0.T0(raiseHandActionBottomSheet, bc7Arr2[0])).setText(l4c.a.b(raiseHandActionBottomSheet.getContext()));
        q7c q7c = raiseHandActionBottomSheet.A0;
        jqe jqe = l4c.b;
        if (jqe != null) {
            ((TextView) q7c.T0(raiseHandActionBottomSheet, bc7Arr2[1])).setText(jqe.b(raiseHandActionBottomSheet.getContext()));
        }
        TextView textView = (TextView) q7c.T0(raiseHandActionBottomSheet, bc7Arr2[1]);
        if (jqe == null) {
            i = 8;
        }
        textView.setVisibility(i);
        return e5f.a;
    }
}
