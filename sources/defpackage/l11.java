package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: l11  reason: default package */
public final /* synthetic */ class l11 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p11 b;

    public /* synthetic */ l11(p11 p11, int i) {
        this.a = i;
        this.b = p11;
    }

    public final Object invoke() {
        Object value;
        e5f e5f = e5f.a;
        p11 p11 = this.b;
        switch (this.a) {
            case 0:
                p11.V0 = null;
                o11 o11 = p11.P0;
                if (o11 != null) {
                    bc7[] bc7Arr = CallBottomPanelWidget.s0;
                    q0e q0e = ((CallBottomPanelWidget) ((sy4) o11).b).n0().r().n;
                    do {
                        value = q0e.getValue();
                    } while (!q0e.c(value, to1.a((to1) value, (gg1) null, (gg1) null, (gg1) null, (nnf) null, true, (u9f) null, 0, 223)));
                }
                return e5f;
            case 1:
                return qp4.u0.p(p11).c;
            case 2:
                View t = br7.t(p11, rvb.call_bottom_control_container);
                return t == null ? p11 : t;
            default:
                p11.U0 = null;
                return e5f;
        }
    }
}
