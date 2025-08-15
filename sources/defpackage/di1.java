package defpackage;

import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: di1  reason: default package */
public final /* synthetic */ class di1 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallScreen b;

    public /* synthetic */ di1(CallScreen callScreen, int i) {
        this.a = i;
        this.b = callScreen;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        CallScreen callScreen = this.b;
        switch (this.a) {
            case 0:
                yxc yxc = CallScreen.R0;
                callScreen.D0().c.a((nnf) obj);
                return e5f;
            case 1:
                if (((Boolean) obj).booleanValue() && !callScreen.t0) {
                    callScreen.D0().t(true);
                }
                callScreen.z0.c();
                return e5f;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                yxc yxc2 = CallScreen.R0;
                if (!booleanValue) {
                    callScreen.D0().t(false);
                }
                return e5f;
        }
    }
}
