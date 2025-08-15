package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;

/* renamed from: z81  reason: default package */
public final class z81 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallIncomingScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z81(CallIncomingScreen callIncomingScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = callIncomingScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((z81) n((c91) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z81 z81 = new z81(this.Y, continuation);
        z81.X = obj;
        return z81;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        c91 c91 = (c91) this.X;
        boolean z = c91 instanceof a91;
        CallIncomingScreen callIncomingScreen = this.Y;
        if (z) {
            crd crd = CallIncomingScreen.Z;
            callIncomingScreen.getClass();
            no1 no1 = (no1) callIncomingScreen.c.T0(callIncomingScreen, CallIncomingScreen.s0[0]);
            a91 a91 = (a91) c91;
            md0 md0 = a91.a.c;
            bc7[] bc7Arr = no1.s1;
            no1.getClass();
            String str = md0 != null ? md0.b : null;
            uc0 uc0 = md0 != null ? md0.a : null;
            s5a s5a = no1.G0;
            s5a.h(s5a, str, uc0);
            s5a.setCustomOverlay((od0) null);
            no1.setName(a91.a.b);
            no1.setStatus(a91.c);
            no1.Q(ztb.ic_cancel_call_25, f0c.call_incoming_decline_accessibility, new e11(0, callIncomingScreen.m0(), e91.class, "declineCall", "declineCall()V", 0, 1));
            no1.R(true, ztb.ic_call_22, f0c.call_incoming_accept_accessibility, new e11(0, callIncomingScreen, CallIncomingScreen.class, "acceptCallIfPossible", "acceptCallIfPossible()V", 0, 2));
        } else if (c91 instanceof b91) {
            crd crd2 = CallIncomingScreen.Z;
            dy7.D(callIncomingScreen.requireActivity(), ((b91) c91).a);
            e91 m0 = callIncomingScreen.m0();
            m0.Y.c(m0);
            View requireView = callIncomingScreen.requireView();
            if (requireView.getMeasuredWidth() == 0 || requireView.getMeasuredHeight() == 0) {
                callIncomingScreen.requireView().post(new b(21, (Object) callIncomingScreen));
            } else {
                callIncomingScreen.getRouter().B(callIncomingScreen);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
