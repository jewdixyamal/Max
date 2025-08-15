package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: jxa  reason: default package */
public final class jxa extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickSubscribersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jxa(PickSubscribersScreen pickSubscribersScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = pickSubscribersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jxa) n((twa) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jxa jxa = new jxa(this.Y, continuation);
        jxa.X = obj;
        return jxa;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        twa twa = (twa) this.X;
        boolean z = twa instanceof swa;
        PickSubscribersScreen pickSubscribersScreen = this.Y;
        if (z) {
            bc7[] bc7Arr = PickSubscribersScreen.z0;
            pickSubscribersScreen.x0().setProgressEnabled(false);
            syd.c.b2(new wz7(pickSubscribersScreen, twa, 16));
        } else if (tpa.f(twa, rwa.a)) {
            bc7[] bc7Arr2 = PickSubscribersScreen.z0;
            pickSubscribersScreen.x0().setProgressEnabled(false);
            syd.c.b2(new fxa(pickSubscribersScreen, 1));
            wha wha = new wha((Widget) pickSubscribersScreen);
            wha.g(new eqe(aja.a));
            wha.e(new kia(woc.u1));
            wha.i();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
