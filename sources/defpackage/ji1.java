package defpackage;

import java.util.ArrayList;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: ji1  reason: default package */
public final class ji1 implements yu3 {
    public final /* synthetic */ CallScreen a;

    public ji1(CallScreen callScreen) {
        this.a = callScreen;
    }

    public final void a(uu3 uu3, uu3 uu32, boolean z) {
    }

    public final void b(uu3 uu3, uu3 uu32, boolean z) {
        q0e q0e;
        Object value;
        yxc yxc = CallScreen.R0;
        CallScreen callScreen = this.a;
        el1 D0 = callScreen.D0();
        uu3 uu33 = callScreen;
        while (uu33.getParentController() != null) {
            uu33 = uu33.getParentController();
        }
        ArrayList arrayList = null;
        foc foc = uu33 instanceof foc ? (foc) uu33 : null;
        znc T = foc != null ? foc.T() : null;
        if (T != null) {
            arrayList = T.e();
        }
        boolean z2 = true ^ (arrayList == null || arrayList.isEmpty());
        do {
            q0e = D0.I0;
            value = q0e.getValue();
            ((Boolean) value).getClass();
        } while (!q0e.c(value, Boolean.valueOf(z2)));
    }
}
