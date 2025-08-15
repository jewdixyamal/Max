package defpackage;

import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;

/* renamed from: a01  reason: default package */
public final /* synthetic */ class a01 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallAdminSettingsScreen b;

    public /* synthetic */ a01(CallAdminSettingsScreen callAdminSettingsScreen, int i) {
        this.a = i;
        this.b = callAdminSettingsScreen;
    }

    public final Object invoke() {
        CallAdminSettingsScreen callAdminSettingsScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = CallAdminSettingsScreen.t0;
                return new q1d(qp4.u0.o(callAdminSettingsScreen.getContext()).c, new ync(13, callAdminSettingsScreen), new l(17, callAdminSettingsScreen), 4);
            default:
                bc7[] bc7Arr2 = CallAdminSettingsScreen.t0;
                return new b01(callAdminSettingsScreen);
        }
    }
}
