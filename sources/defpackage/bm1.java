package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: bm1  reason: default package */
public final /* synthetic */ class bm1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dm1 b;

    public /* synthetic */ bm1(dm1 dm1, int i) {
        this.a = i;
        this.b = dm1;
    }

    public final void onClick(View view) {
        dm1 dm1 = this.b;
        switch (this.a) {
            case 0:
                cm1 cm1 = dm1.M0;
                if (cm1 != null) {
                    yxc yxc = CallScreen.R0;
                    ((CallScreen) ((w4d) cm1).b).D0().Z.e();
                    return;
                }
                return;
            default:
                cm1 cm12 = dm1.M0;
                if (cm12 != null) {
                    gg1 gg1 = dm1.R0;
                    yxc yxc2 = CallScreen.R0;
                    ((CallScreen) ((w4d) cm12).b).D0().Z.c(gg1);
                    return;
                }
                return;
        }
    }
}
