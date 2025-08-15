package defpackage;

import android.view.View;
import android.widget.TextView;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.appearancesettings.singletheme.AppearanceSettingsScreen;

/* renamed from: oq  reason: default package */
public final /* synthetic */ class oq implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tha b;
    public final /* synthetic */ TextView c;

    public /* synthetic */ oq(tha tha, TextView textView, int i) {
        this.a = i;
        this.b = tha;
        this.c = textView;
    }

    public final void onClick(View view) {
        TextView textView = this.c;
        mi6 mi6 = mi6.CONTEXT_CLICK;
        tha tha = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = AppearanceSettingsMultiThemeScreen.s0;
                if (tha.getValue() != 1.0f) {
                    pag.F(textView, mi6);
                }
                tha.setValue(1.0f);
                return;
            default:
                bc7[] bc7Arr2 = AppearanceSettingsScreen.Z;
                if (tha.getValue() != 1.0f) {
                    pag.F(textView, mi6);
                }
                tha.setValue(1.0f);
                return;
        }
    }
}
