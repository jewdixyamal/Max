package defpackage;

import android.view.View;

/* renamed from: h11  reason: default package */
public final /* synthetic */ class h11 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j11 b;

    public /* synthetic */ h11(j11 j11, int i) {
        this.a = i;
        this.b = j11;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = rvb.call_bottom_control_container;
                j11 j11 = this.b;
                View t = br7.t(j11, i);
                return t == null ? j11 : t;
            default:
                return qp4.u0.p(this.b).c;
        }
    }
}
