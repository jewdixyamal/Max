package defpackage;

import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* renamed from: i25  reason: default package */
public final /* synthetic */ class i25 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnterPinCodeScreen b;

    public /* synthetic */ i25(EnterPinCodeScreen enterPinCodeScreen, int i) {
        this.a = i;
        this.b = enterPinCodeScreen;
    }

    public final Object invoke() {
        e5f e5f = e5f.a;
        EnterPinCodeScreen enterPinCodeScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = EnterPinCodeScreen.X;
                mr0.I(enterPinCodeScreen.getView());
                i3a onBackPressedDispatcher = enterPinCodeScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return e5f;
            default:
                bc7[] bc7Arr2 = EnterPinCodeScreen.X;
                o25 o25 = (o25) enterPinCodeScreen.c.getValue();
                if (!o25.t0) {
                    pnf.o(o25.Z, e5f);
                }
                return e5f;
        }
    }
}
