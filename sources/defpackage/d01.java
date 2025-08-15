package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* renamed from: d01  reason: default package */
public final class d01 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallAdminSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d01(Continuation continuation, CallAdminSettingsScreen callAdminSettingsScreen) {
        super(2, continuation);
        this.Y = callAdminSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((d01) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        d01 d01 = new d01(continuation, this.Y);
        d01.X = obj;
        return d01;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        boolean z = wm9 instanceof pj1;
        CallAdminSettingsScreen callAdminSettingsScreen = this.Y;
        if (z) {
            bc7[] bc7Arr = BottomSheetWidget.x0;
            RecordExitBottomSheet recordExitBottomSheet = new RecordExitBottomSheet(ccc.b, Boolean.FALSE);
            recordExitBottomSheet.setTargetController(callAdminSettingsScreen);
            uu3 uu3 = callAdminSettingsScreen;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            znc znc = null;
            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
            if (foc != null) {
                znc = foc.T();
            }
            znc znc2 = znc;
            recordExitBottomSheet.z0(callAdminSettingsScreen);
            if (znc2 != null) {
                coc coc = new coc(recordExitBottomSheet, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc, true, "BottomSheetWidget");
                znc2.G(coc);
            }
        } else if (wm9 instanceof uj1) {
            bc7[] bc7Arr2 = CallAdminSettingsScreen.t0;
            ((tnd) callAdminSettingsScreen.Y.getValue()).getClass();
            tnd.b(dj1.a, new s25((uj1) wm9, callAdminSettingsScreen, 0, 2));
        }
        return e5f.a;
    }
}
