package defpackage;

import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.phoneutils.SelectCountryBottomSheet;

/* renamed from: y17  reason: default package */
public final /* synthetic */ class y17 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputPhoneScreen b;

    public /* synthetic */ y17(InputPhoneScreen inputPhoneScreen, int i) {
        this.a = i;
        this.b = inputPhoneScreen;
    }

    public final Object invoke() {
        InputPhoneScreen inputPhoneScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = InputPhoneScreen.E0;
                return new x37(inputPhoneScreen.getRouter());
            default:
                bc7[] bc7Arr2 = InputPhoneScreen.E0;
                bc7[] bc7Arr3 = BottomSheetWidget.x0;
                SelectCountryBottomSheet selectCountryBottomSheet = new SelectCountryBottomSheet(dy7.g(new kpa("is_narnia_available", Boolean.FALSE)));
                selectCountryBottomSheet.setTargetController(inputPhoneScreen);
                uu3 uu3 = inputPhoneScreen;
                while (uu3.getParentController() != null) {
                    uu3 = uu3.getParentController();
                }
                znc znc = null;
                foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                if (foc != null) {
                    znc = foc.T();
                }
                znc znc2 = znc;
                selectCountryBottomSheet.z0(inputPhoneScreen);
                if (znc2 != null) {
                    coc coc = new coc(selectCountryBottomSheet, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc, true, "BottomSheetWidget");
                    znc2.G(coc);
                }
                return e5f.a;
        }
    }
}
