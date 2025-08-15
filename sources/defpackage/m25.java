package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* renamed from: m25  reason: default package */
public final class m25 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ EnterPinCodeScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m25(Continuation continuation, EnterPinCodeScreen enterPinCodeScreen) {
        super(2, continuation);
        this.Y = enterPinCodeScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((m25) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m25 m25 = new m25(continuation, this.Y);
        m25.X = obj;
        return m25;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        e5f e5f = (e5f) this.X;
        bc7[] bc7Arr = BottomSheetWidget.x0;
        ForgotPinCodeDialog forgotPinCodeDialog = new ForgotPinCodeDialog();
        EnterPinCodeScreen enterPinCodeScreen = this.Y;
        forgotPinCodeDialog.setTargetController(enterPinCodeScreen);
        uu3 uu3 = enterPinCodeScreen;
        while (uu3.getParentController() != null) {
            uu3 = uu3.getParentController();
        }
        znc znc = null;
        foc foc = uu3 instanceof foc ? (foc) uu3 : null;
        if (foc != null) {
            znc = foc.T();
        }
        znc znc2 = znc;
        forgotPinCodeDialog.z0(enterPinCodeScreen);
        if (znc2 != null) {
            coc coc = new coc(forgotPinCodeDialog, (String) null, (zu3) null, (zu3) null, false, -1);
            wg0.l(false, coc, true, "forgot-pin");
            znc2.G(coc);
        }
        return e5f.a;
    }
}
