package defpackage;

import one.me.calllist.ui.CallHistoryScreen;

/* renamed from: o81  reason: default package */
public final /* synthetic */ class o81 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallHistoryScreen b;

    public /* synthetic */ o81(CallHistoryScreen callHistoryScreen, int i) {
        this.a = i;
        this.b = callHistoryScreen;
    }

    public final Object invoke() {
        q0e q0e;
        Object value;
        CallHistoryScreen callHistoryScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = CallHistoryScreen.C0;
                u81 n0 = callHistoryScreen.n0();
                do {
                    q0e = n0.Z;
                    value = q0e.getValue();
                    s81 s81 = (s81) value;
                } while (!q0e.c(value, new s81()));
                ((cla) callHistoryScreen.Y.T0(callHistoryScreen, CallHistoryScreen.C0[1])).a();
                return e5f.a;
            case 1:
                bc7[] bc7Arr2 = CallHistoryScreen.C0;
                je7 je7 = iyc.p;
                je7 je72 = iyc.d;
                je7 je73 = iyc.g;
                je7 a2 = iyc.a();
                return new u81(callHistoryScreen.b, a2, new m5d(je7, je72, callHistoryScreen.a, je73), (rg1) callHistoryScreen.o.getValue());
            case 2:
                bc7[] bc7Arr3 = CallHistoryScreen.C0;
                return new rg1(new khe(new o81(callHistoryScreen, 3)), new l5g(callHistoryScreen, 0));
            default:
                bc7[] bc7Arr4 = CallHistoryScreen.C0;
                return callHistoryScreen.getRouter();
        }
    }
}
