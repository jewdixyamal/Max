package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* renamed from: qf3  reason: default package */
public final class qf3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPinCodeScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qf3(Continuation continuation, ConfirmPinCodeScreen confirmPinCodeScreen) {
        super(2, continuation);
        this.Y = confirmPinCodeScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((qf3) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qf3 qf3 = new qf3(continuation, this.Y);
        qf3.X = obj;
        return qf3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int ordinal = ((tf3) this.X).ordinal();
        ConfirmPinCodeScreen confirmPinCodeScreen = this.Y;
        if (ordinal == 0) {
            ConfirmPinCodeScreen.m0(confirmPinCodeScreen).setErrorText((CharSequence) null);
            jg3 jg3 = ConfirmPinCodeScreen.m0(confirmPinCodeScreen).J0;
            int childCount = jg3.getChildCount();
            for (int i = 0; i < childCount; i++) {
                l17 H0 = jg3.H0(i);
                if (H0 != null) {
                    ((ptd) H0).H0.setText((CharSequence) null);
                }
            }
            jg3.K0();
            ConfirmPinCodeScreen.m0(confirmPinCodeScreen).setState(gg3.NORMAL);
        } else if (ordinal == 1) {
            ConfirmPinCodeScreen.m0(confirmPinCodeScreen).setErrorText((CharSequence) null);
            ConfirmPinCodeScreen.m0(confirmPinCodeScreen).setState(gg3.SUCCESS);
        } else if (ordinal == 2) {
            ConfirmPinCodeScreen.m0(confirmPinCodeScreen).setErrorText(z7.B(confirmPinCodeScreen.getContext(), p1c.oneme_settings_privacy_onboarding_error_pin_code_equals));
            ConfirmPinCodeScreen.m0(confirmPinCodeScreen).setState(gg3.ERROR);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
