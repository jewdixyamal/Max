package defpackage;

import android.view.View;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* renamed from: jc8  reason: default package */
public final /* synthetic */ class jc8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View[] b;

    public /* synthetic */ jc8(View[] viewArr, int i) {
        this.a = i;
        this.b = viewArr;
    }

    public final Object invoke() {
        e5f e5f = e5f.a;
        View[] viewArr = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = MediaKeyboardWidget.C0;
                for (View visibility : viewArr) {
                    visibility.setVisibility(0);
                }
                return e5f;
            default:
                bc7[] bc7Arr2 = MediaKeyboardWidget.C0;
                for (View visibility2 : viewArr) {
                    visibility2.setVisibility(8);
                }
                return e5f;
        }
    }
}
