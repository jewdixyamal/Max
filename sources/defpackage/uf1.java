package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* renamed from: uf1  reason: default package */
public final class uf1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallOpponentsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uf1(Continuation continuation, CallOpponentsListWidget callOpponentsListWidget) {
        super(2, continuation);
        this.Y = callOpponentsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((uf1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uf1 uf1 = new uf1(continuation, this.Y);
        uf1.X = obj;
        return uf1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof wj1) {
            wj1 wj1 = (wj1) wm9;
            bc7[] bc7Arr = CallOpponentsListWidget.H0;
            CallOpponentsListWidget callOpponentsListWidget = this.Y;
            callOpponentsListWidget.getClass();
            znc znc = null;
            if (wj1 instanceof gj1) {
                bc7[] bc7Arr2 = BottomSheetWidget.x0;
                ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet = new ConfirmAddOpponentToCallBottomSheet();
                confirmAddOpponentToCallBottomSheet.setTargetController(callOpponentsListWidget);
                uu3 uu3 = callOpponentsListWidget;
                while (uu3.getParentController() != null) {
                    uu3 = uu3.getParentController();
                }
                foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                if (foc != null) {
                    znc = foc.T();
                }
                confirmAddOpponentToCallBottomSheet.z0(callOpponentsListWidget);
                if (znc != null) {
                    coc coc = new coc(confirmAddOpponentToCallBottomSheet, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc, true, "BottomSheetWidget");
                    znc.G(coc);
                }
            } else if (wj1 instanceof kj1) {
                bc7[] bc7Arr3 = BottomSheetWidget.x0;
                ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = new ConfirmRemoveOpponentToCallBottomSheet(((kj1) wj1).D, 0, 2, (z84) null);
                confirmRemoveOpponentToCallBottomSheet.setTargetController(callOpponentsListWidget);
                uu3 uu32 = callOpponentsListWidget;
                while (uu32.getParentController() != null) {
                    uu32 = uu32.getParentController();
                }
                foc foc2 = uu32 instanceof foc ? (foc) uu32 : null;
                if (foc2 != null) {
                    znc = foc2.T();
                }
                confirmRemoveOpponentToCallBottomSheet.z0(callOpponentsListWidget);
                if (znc != null) {
                    coc coc2 = new coc(confirmRemoveOpponentToCallBottomSheet, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc2, true, "BottomSheetWidget");
                    znc.G(coc2);
                }
            } else if (wj1 instanceof aj1) {
                callOpponentsListWidget.getRouter().B(callOpponentsListWidget);
            } else if (wj1 instanceof qj1) {
                je1.c.Z1(((qj1) wj1).D, callOpponentsListWidget.getContext().getString(b8a.O1), CallOpponentsListWidget.class.getName());
            } else if (wj1 instanceof ej1) {
                tpa.o(callOpponentsListWidget.getContext(), ((ej1) wj1).D);
                if (tpa.s()) {
                    String string = callOpponentsListWidget.getContext().getString(f0c.call_link_share_dialog_share_link_copy);
                    wha wha = new wha((Widget) callOpponentsListWidget);
                    wha.h(string);
                    wha.d(new ho1(3, (k56) null));
                    wha.c(new eia(0, 0, 0, 3));
                    wha.i();
                }
            } else {
                boolean z = wj1 instanceof uj1;
                je7 je7 = callOpponentsListWidget.o;
                if (z) {
                    ((tnd) je7.getValue()).getClass();
                    tnd.b(dj1.a, new s25((uj1) wj1, callOpponentsListWidget, 0, 2));
                } else if (wj1 instanceof vj1) {
                    ((tnd) je7.getValue()).getClass();
                    tnd.b(dj1.b, new s25(callOpponentsListWidget, (vj1) wj1, 0, 1));
                }
            }
        } else if (wm9 instanceof c64) {
            je1.c.R1((c64) wm9);
        }
        return e5f.a;
    }
}
