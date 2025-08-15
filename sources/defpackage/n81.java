package defpackage;

import android.view.View;
import one.me.calllist.ui.CallHistoryScreen;

/* renamed from: n81  reason: default package */
public final /* synthetic */ class n81 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallHistoryScreen b;

    public /* synthetic */ n81(CallHistoryScreen callHistoryScreen, int i) {
        this.a = i;
        this.b = callHistoryScreen;
    }

    public final void onClick(View view) {
        CallHistoryScreen callHistoryScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = CallHistoryScreen.C0;
                u81 n0 = callHistoryScreen.n0();
                k11 k11 = new k11(11);
                rg1 rg1 = n0.o;
                rg1.c();
                rg1.j = true;
                eua e = rg1.e();
                l5g l5g = rg1.a;
                if (!e.a(false, l5g)) {
                    rg1.l = k11;
                    rg1.h = null;
                    rg1.i = false;
                    return;
                } else if (!((gh3) rg1.d.getValue()).f()) {
                    l5g.b();
                    return;
                } else {
                    k11.invoke();
                    return;
                }
            default:
                ((eua) callHistoryScreen.b.getValue()).f(new l5g(callHistoryScreen, 0), eua.h, 160);
                return;
        }
    }
}
