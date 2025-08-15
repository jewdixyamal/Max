package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* renamed from: bzd  reason: default package */
public final class bzd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StartConversationScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bzd(Continuation continuation, StartConversationScreen startConversationScreen) {
        super(2, continuation);
        this.Y = startConversationScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bzd) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bzd bzd = new bzd(continuation, this.Y);
        bzd.X = obj;
        return bzd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ryd ryd = (ryd) this.X;
        if (ryd instanceof ryd) {
            StartConversationScreen startConversationScreen = this.Y;
            ((cn3) startConversationScreen.Z.getValue()).a(startConversationScreen.getContext(), ryd.a);
            return e5f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
