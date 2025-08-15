package defpackage;

import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: ze3  reason: default package */
public final /* synthetic */ class ze3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPhoneScreen b;

    public /* synthetic */ ze3(ConfirmPhoneScreen confirmPhoneScreen, int i) {
        this.a = i;
        this.b = confirmPhoneScreen;
    }

    public final Object invoke() {
        ConfirmPhoneScreen confirmPhoneScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ConfirmPhoneScreen.C0;
                confirmPhoneScreen.getClass();
                bc7[] bc7Arr2 = ConfirmPhoneScreen.C0;
                bc7 bc7 = bc7Arr2[2];
                int intValue = ((Number) confirmPhoneScreen.X.a(confirmPhoneScreen)).intValue();
                bc7 bc72 = bc7Arr2[0];
                bc7 bc73 = bc7Arr2[1];
                lt7 lt7 = lt7.a;
                lt7.getClass();
                return new of3(intValue, (String) confirmPhoneScreen.c.a(confirmPhoneScreen), (String) confirmPhoneScreen.o.a(confirmPhoneScreen), new khe(new m57(16)), new khe(new m57(18)), new khe(new m57(17)), lt7.getAccessor().d(kke.class), lt7.getAccessor().d(gh3.class));
            case 1:
                bc7[] bc7Arr3 = ConfirmPhoneScreen.C0;
                return new x37(confirmPhoneScreen.getRouter());
            default:
                bc7[] bc7Arr4 = ConfirmPhoneScreen.C0;
                return z7.B(confirmPhoneScreen.getContext(), v0c.oneme_login_confirm_timer);
        }
    }
}
