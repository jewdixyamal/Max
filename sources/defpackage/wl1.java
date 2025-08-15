package defpackage;

import android.content.Intent;
import android.view.View;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: wl1  reason: default package */
public final /* synthetic */ class wl1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yl1 b;

    public /* synthetic */ wl1(yl1 yl1, int i) {
        this.a = i;
        this.b = yl1;
    }

    public final void onClick(View view) {
        yl1 yl1 = this.b;
        switch (this.a) {
            case 0:
                xl1 xl1 = yl1.G0;
                if (xl1 != null) {
                    yxc yxc = CallScreen.R0;
                    ((ti1) xl1).a.D0().w(false, (Intent) null);
                    return;
                }
                return;
            default:
                xl1 xl12 = yl1.G0;
                if (xl12 != null) {
                    yxc yxc2 = CallScreen.R0;
                    ((ti1) xl12).a.D0().c.h.a(!yl1.H0);
                    return;
                }
                return;
        }
    }
}
