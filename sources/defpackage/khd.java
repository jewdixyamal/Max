package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: khd  reason: default package */
public final class khd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsPrivacyScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public khd(Continuation continuation, SettingsPrivacyScreen settingsPrivacyScreen) {
        super(2, continuation);
        this.Y = settingsPrivacyScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((khd) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        khd khd = new khd(continuation, this.Y);
        khd.X = obj;
        return khd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        boolean z = wm9 instanceof aed;
        znc znc = null;
        SettingsPrivacyScreen settingsPrivacyScreen = this.Y;
        if (z) {
            aed aed = (aed) wm9;
            bc7[] bc7Arr = SettingsPrivacyScreen.Z;
            settingsPrivacyScreen.getClass();
            bc7[] bc7Arr2 = BottomSheetWidget.x0;
            jqe jqe = aed.b;
            Bundle bundle = new Bundle();
            bundle.putParcelable("title", jqe);
            bundle.putBundle(ApiProtocol.PARAM_PAYLOAD, (Bundle) null);
            wuc wuc = aed.d;
            if (wuc != null) {
                bundle.putString("stat_screen", wuc.name());
            }
            for (zdd zdd : aed.c) {
                boolean z2 = zdd.c;
                jqe jqe2 = zdd.a;
                int i = zdd.b;
                if (z2) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
                    if (parcelableArrayList == null) {
                        parcelableArrayList = new ArrayList();
                    }
                    parcelableArrayList.add(new mg3(i, jqe2, 1, false));
                    bundle.putParcelableArrayList("buttons", parcelableArrayList);
                } else {
                    ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("buttons");
                    if (parcelableArrayList2 == null) {
                        parcelableArrayList2 = new ArrayList();
                    }
                    parcelableArrayList2.add(new mg3(i, jqe2, 3, false));
                    bundle.putParcelableArrayList("buttons", parcelableArrayList2);
                }
            }
            ConfirmationBottomSheet confirmationBottomSheet = new ConfirmationBottomSheet(bundle);
            confirmationBottomSheet.setTargetController(settingsPrivacyScreen);
            uu3 uu3 = settingsPrivacyScreen;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
            if (foc != null) {
                znc = foc.T();
            }
            confirmationBottomSheet.z0(settingsPrivacyScreen);
            if (znc != null) {
                coc coc = new coc(confirmationBottomSheet, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc, true, "BottomSheetWidget");
                znc.G(coc);
            }
        } else if (wm9 instanceof c64) {
            ihd.c.R1((c64) wm9);
        } else if (wm9 instanceof bed) {
            wha wha = new wha((Widget) settingsPrivacyScreen);
            wha.g(((bed) wm9).b);
            wha.i();
        } else if (wm9 instanceof ydd) {
            EnterPinCodeScreen enterPinCodeScreen = new EnterPinCodeScreen();
            enterPinCodeScreen.setTargetController(settingsPrivacyScreen);
            settingsPrivacyScreen.getRouter().G(i24.e(enterPinCodeScreen, new mcf(), new mcf()));
        } else if (wm9 instanceof xdd) {
            bc7[] bc7Arr3 = BottomSheetWidget.x0;
            ChangeDisabledDialog changeDisabledDialog = new ChangeDisabledDialog();
            changeDisabledDialog.setTargetController(settingsPrivacyScreen);
            uu3 uu32 = settingsPrivacyScreen;
            while (uu32.getParentController() != null) {
                uu32 = uu32.getParentController();
            }
            foc foc2 = uu32 instanceof foc ? (foc) uu32 : null;
            if (foc2 != null) {
                znc = foc2.T();
            }
            changeDisabledDialog.z0(settingsPrivacyScreen);
            if (znc != null) {
                coc coc2 = new coc(changeDisabledDialog, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc2, true, "change-disabled");
                znc.G(coc2);
            }
        }
        bc7[] bc7Arr4 = SettingsPrivacyScreen.Z;
        settingsPrivacyScreen.m0().L0.f();
        return e5f.a;
    }
}
