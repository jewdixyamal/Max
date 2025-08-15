package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: jm1  reason: default package */
public final /* synthetic */ class jm1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ mm1 c;

    public /* synthetic */ jm1(Context context, mm1 mm1, int i) {
        this.a = i;
        this.b = context;
        this.c = mm1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return mm1.x(this.b, this.c);
            default:
                xg1 xg1 = new xg1(this.b);
                xg1.setPipTheme(qp4.u0.p(xg1).c);
                xg1.setPipMode(ug1.b);
                xg1.setId(View.generateViewId());
                mm1 mm1 = this.c;
                xg1.setListener(new rxd(6, mm1));
                xg1.setVisibility(8);
                xg1.setVideoLayoutUpdatesControllerProvider(new hm1(mm1, 3));
                return xg1;
        }
    }
}
