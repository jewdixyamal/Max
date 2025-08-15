package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: gxa  reason: default package */
public final class gxa extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickSubscribersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gxa(PickSubscribersScreen pickSubscribersScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = pickSubscribersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((gxa) n((Set) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gxa gxa = new gxa(this.Y, continuation);
        gxa.X = obj;
        return gxa;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        long[] E0 = x53.E0((Set) this.X);
        bc7[] bc7Arr = PickSubscribersScreen.z0;
        PickSubscribersScreen pickSubscribersScreen = this.Y;
        pickSubscribersScreen.getClass();
        bc7 bc7 = PickSubscribersScreen.z0[0];
        pickSubscribersScreen.t0.b(pickSubscribersScreen, E0);
        return e5f.a;
    }
}
