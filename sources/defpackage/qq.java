package defpackage;

import android.widget.TextView;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.appearancesettings.singletheme.AppearanceSettingsScreen;
import one.me.sdk.arch.Widget;

/* renamed from: qq  reason: default package */
public final class qq {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ Widget c;

    public /* synthetic */ qq(TextView textView, Widget widget, int i) {
        this.a = i;
        this.b = textView;
        this.c = widget;
    }

    public final void a(float f) {
        Widget widget = this.c;
        TextView textView = this.b;
        int i = 8;
        switch (this.a) {
            case 0:
                if (!(f == 1.0f)) {
                    i = 0;
                }
                textView.setVisibility(i);
                bc7[] bc7Arr = AppearanceSettingsMultiThemeScreen.s0;
                int e = ote.e(tu0.G(f), 0, 5);
                kxc kxc = (kxc) ((hp) ((AppearanceSettingsMultiThemeScreen) widget).Y.getValue());
                kxc.k(e, "app.extra.text.size.mode");
                kxc.i.e(Integer.valueOf(e));
                return;
            default:
                if (!(f == 1.0f)) {
                    i = 0;
                }
                textView.setVisibility(i);
                bc7[] bc7Arr2 = AppearanceSettingsScreen.Z;
                int e2 = ote.e(tu0.G(f), 0, 5);
                kxc kxc2 = (kxc) ((hp) ((AppearanceSettingsScreen) widget).Y.getValue());
                kxc2.k(e2, "app.extra.text.size.mode");
                kxc2.i.e(Integer.valueOf(e2));
                return;
        }
    }
}
