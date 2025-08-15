package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* renamed from: jr0  reason: default package */
public final /* synthetic */ class jr0 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetWidget b;

    public /* synthetic */ jr0(BottomSheetWidget bottomSheetWidget, int i) {
        this.a = i;
        this.b = bottomSheetWidget;
    }

    public final Object invoke() {
        Window window;
        View currentFocus;
        e5f e5f = e5f.a;
        View view = null;
        BottomSheetWidget bottomSheetWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = BottomSheetWidget.x0;
                Activity activity = bottomSheetWidget.getActivity();
                if (!(activity == null || (window = activity.getWindow()) == null || (currentFocus = window.getCurrentFocus()) == null)) {
                    currentFocus.clearFocus();
                    int i = vc7.a;
                    if (vc7.b(vc7.c)) {
                        boolean y0 = bottomSheetWidget.y0();
                        bc7 bc7 = BottomSheetWidget.x0[0];
                        bottomSheetWidget.v0.b(bottomSheetWidget, Boolean.valueOf(y0));
                        mr0.I(currentFocus);
                    }
                    view = currentFocus;
                }
                bottomSheetWidget.u0 = view;
                return e5f;
            default:
                View view2 = bottomSheetWidget.u0;
                if (view2 != null) {
                    view2.requestFocus();
                    bc7 bc72 = BottomSheetWidget.x0[0];
                    if (((Boolean) bottomSheetWidget.v0.a(bottomSheetWidget)).booleanValue()) {
                        mr0.V(view2);
                    }
                }
                bottomSheetWidget.u0 = null;
                return e5f;
        }
    }
}
