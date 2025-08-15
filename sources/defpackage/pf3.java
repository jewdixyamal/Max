package defpackage;

import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* renamed from: pf3  reason: default package */
public final /* synthetic */ class pf3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPinCodeScreen b;

    public /* synthetic */ pf3(ConfirmPinCodeScreen confirmPinCodeScreen, int i) {
        this.a = i;
        this.b = confirmPinCodeScreen;
    }

    public final Object invoke() {
        ConfirmPinCodeScreen confirmPinCodeScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ConfirmPinCodeScreen.Y;
                i3a onBackPressedDispatcher = confirmPinCodeScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return e5f.a;
            default:
                bc7[] bc7Arr2 = ConfirmPinCodeScreen.Y;
                bc7 bc7 = ConfirmPinCodeScreen.Y[0];
                return new wf3((String) confirmPinCodeScreen.a.a(confirmPinCodeScreen));
        }
    }
}
