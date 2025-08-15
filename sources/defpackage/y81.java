package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;

/* renamed from: y81  reason: default package */
public final class y81 extends FrameLayout implements bk1 {
    public final /* synthetic */ CallIncomingScreen a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y81(CallIncomingScreen callIncomingScreen, Context context) {
        super(context);
        this.a = callIncomingScreen;
        setId(rvb.call_screen_incoming_container_id);
        setBackgroundColor(qp4.u0.p(this).c.b().k);
        no1 no1 = new no1(getContext(), (AttributeSet) null);
        no1.setId(rvb.call_incoming_avatar);
        no1.setMode(jo1.a);
        no1.setBackgroundState(ko1.b);
        addView(no1, -1, -1);
    }

    public final void a(boolean z) {
        if (z) {
            CallIncomingScreen callIncomingScreen = this.a;
            if (callIncomingScreen.getView() != null) {
                ((no1) callIncomingScreen.c.T0(callIncomingScreen, CallIncomingScreen.s0[0])).a(z);
            }
        }
    }

    public final void h(kl7 kl7, boolean z, long j) {
        crd crd = CallIncomingScreen.Z;
        CallIncomingScreen callIncomingScreen = this.a;
        callIncomingScreen.getClass();
        ((no1) callIncomingScreen.c.T0(callIncomingScreen, CallIncomingScreen.s0[0])).h(kl7, z, j);
    }
}
