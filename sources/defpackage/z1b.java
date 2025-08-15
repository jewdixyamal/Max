package defpackage;

import android.view.ViewGroup;
import one.me.calls.ui.ui.pip.PipScreen;

/* renamed from: z1b  reason: default package */
public final /* synthetic */ class z1b implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PipScreen b;

    public /* synthetic */ z1b(PipScreen pipScreen, int i) {
        this.a = i;
        this.b = pipScreen;
    }

    public final Object invoke() {
        PipScreen pipScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = PipScreen.o;
                xg1 xg1 = new xg1(pipScreen.getContext());
                xg1.setPipTheme(qp4.u0.p(xg1).c);
                xg1.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                xg1.setVideoLayoutUpdatesControllerProvider(new z1b(pipScreen, 2));
                xg1.setBackgroundCorners(0.0f);
                return xg1;
            case 1:
                bc7[] bc7Arr2 = PipScreen.o;
                n31 n31 = n31.a;
                return new t1b((oqa) n31.getAccessor().c(oqa.class), n31.d(), n31.c(), new rxd(25, pipScreen), yi1.b());
            default:
                bc7[] bc7Arr3 = PipScreen.o;
                return (ugf) ((t1b) pipScreen.b.getValue()).Y.getValue();
        }
    }
}
