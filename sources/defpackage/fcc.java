package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: fcc  reason: default package */
public final class fcc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordExitBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fcc(Continuation continuation, RecordExitBottomSheet recordExitBottomSheet) {
        super(2, continuation);
        this.Y = recordExitBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fcc) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fcc fcc = new fcc(continuation, this.Y);
        fcc.X = obj;
        return fcc;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        icc icc = (icc) this.X;
        bc7[] bc7Arr = RecordExitBottomSheet.G0;
        RecordExitBottomSheet recordExitBottomSheet = this.Y;
        recordExitBottomSheet.F0().setText(icc.a.b(recordExitBottomSheet.getContext()));
        TextView E0 = recordExitBottomSheet.E0();
        jqe jqe = icc.b;
        E0.setText(jqe != null ? jqe.b(recordExitBottomSheet.getContext()) : null);
        int i = 0;
        recordExitBottomSheet.E0().setVisibility(jqe != null ? 0 : 8);
        CharSequence b = icc.e.b(recordExitBottomSheet.getContext());
        recordExitBottomSheet.D0().setTitle(b);
        recordExitBottomSheet.D0().setVisibility((b == null || b.length() == 0) ^ true ? 0 : 8);
        yz2 A0 = recordExitBottomSheet.A0();
        if (!icc.f) {
            i = 8;
        }
        A0.setVisibility(i);
        OneMeButton B0 = recordExitBottomSheet.B0();
        hcc hcc = icc.c;
        B0.setMode(hcc.c);
        B0.setText(hcc.b.b(B0.getContext()));
        tu0.K(B0, 300, new hq(recordExitBottomSheet, 5, icc));
        OneMeButton C0 = recordExitBottomSheet.C0();
        hcc hcc2 = icc.d;
        C0.setMode(hcc2.c);
        C0.setText(hcc2.b.b(C0.getContext()));
        tu0.K(C0, 300, new e0d(12, recordExitBottomSheet));
        return e5f.a;
    }
}
