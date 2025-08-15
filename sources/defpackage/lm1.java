package defpackage;

import android.graphics.Point;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: lm1  reason: default package */
public final class lm1 implements ye1 {
    public final /* synthetic */ mm1 a;

    public lm1(mm1 mm1) {
        this.a = mm1;
    }

    public final void H(gg1 gg1) {
        Object value;
        km1 km1 = this.a.Y0;
        if (km1 != null) {
            yxc yxc = CallScreen.R0;
            q0e q0e = ((ui1) km1).a.D0().c.n;
            do {
                value = q0e.getValue();
            } while (!q0e.c(value, to1.a((to1) value, (gg1) null, (gg1) null, gg1, (nnf) null, false, (u9f) null, 0, 251)));
        }
    }

    public final void N() {
        km1 km1 = this.a.Y0;
        if (km1 != null) {
            yxc yxc = CallScreen.R0;
            ((ui1) km1).a.D0().Z.e();
        }
    }

    public final void S(gg1 gg1) {
        km1 km1 = this.a.Y0;
        if (km1 != null) {
            yxc yxc = CallScreen.R0;
            ((ui1) km1).a.D0().v(gg1);
        }
    }

    public final void v(gg1 gg1, Point point) {
        km1 km1 = this.a.Y0;
        if (km1 != null) {
            yxc yxc = CallScreen.R0;
            ((ui1) km1).a.D0().x(gg1, point);
        }
    }

    public final void y(gg1 gg1) {
        km1 km1 = this.a.Y0;
        if (km1 != null) {
            yxc yxc = CallScreen.R0;
            ((ui1) km1).a.D0().Z.c(gg1);
        }
    }
}
