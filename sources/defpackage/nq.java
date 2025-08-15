package defpackage;

import android.view.View;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;

/* renamed from: nq  reason: default package */
public final /* synthetic */ class nq implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppearanceSettingsMultiThemeScreen b;

    public /* synthetic */ nq(AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen, int i) {
        this.a = i;
        this.b = appearanceSettingsMultiThemeScreen;
    }

    public final Object invoke(Object obj) {
        AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                bc7[] bc7Arr = AppearanceSettingsMultiThemeScreen.s0;
                kr m0 = appearanceSettingsMultiThemeScreen.m0();
                m0.getClass();
                pnf.o(m0.C0, g43.b);
                return e5f.a;
            default:
                int intValue = ((Integer) obj).intValue();
                jv5 jv5 = appearanceSettingsMultiThemeScreen.Z;
                boolean z = false;
                if (jv5.j() > 0 && ((wre) ((ol7) jv5.C(intValue))).a) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
