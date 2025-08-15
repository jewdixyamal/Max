package defpackage;

import android.os.Bundle;
import android.view.View;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* renamed from: ic8  reason: default package */
public final /* synthetic */ class ic8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaKeyboardWidget b;

    public /* synthetic */ ic8(MediaKeyboardWidget mediaKeyboardWidget, int i) {
        this.a = i;
        this.b = mediaKeyboardWidget;
    }

    public final void onClick(View view) {
        MediaKeyboardWidget mediaKeyboardWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = MediaKeyboardWidget.C0;
                sc7 sc7 = sc7.c;
                mediaKeyboardWidget.getClass();
                bc7 bc7 = MediaKeyboardWidget.C0[0];
                long longValue = ((Number) mediaKeyboardWidget.a.a(mediaKeyboardWidget)).longValue();
                f64 P1 = sc7.P1();
                P1.b(":stickers/showcase?chat_id=" + longValue, (Bundle) null);
                return;
            default:
                bc7[] bc7Arr2 = MediaKeyboardWidget.C0;
                View view2 = mediaKeyboardWidget.getView();
                if (view2 != null) {
                    pag.F(view2, mi6.KEYBOARD_TAP);
                }
                pnf.o(((cc8) mediaKeyboardWidget.c.getValue()).X, vb8.a);
                return;
        }
    }
}
