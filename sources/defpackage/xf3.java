package defpackage;

import android.view.View;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;

/* renamed from: xf3  reason: default package */
public final /* synthetic */ class xf3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmRemoveOpponentToCallBottomSheet b;

    public /* synthetic */ xf3(ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet, int i) {
        this.a = i;
        this.b = confirmRemoveOpponentToCallBottomSheet;
    }

    public final void onClick(View view) {
        ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = this.b;
        switch (this.a) {
            case 0:
                int i = ConfirmRemoveOpponentToCallBottomSheet.B0;
                cg3 cg3 = (cg3) confirmRemoveOpponentToCallBottomSheet.y0.getValue();
                cg3.o.d(cg3.b);
                return;
            default:
                int i2 = ConfirmRemoveOpponentToCallBottomSheet.B0;
                confirmRemoveOpponentToCallBottomSheet.s0(true);
                return;
        }
    }
}
