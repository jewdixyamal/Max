package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* renamed from: czd  reason: default package */
public final class czd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StartConversationScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public czd(Continuation continuation, StartConversationScreen startConversationScreen) {
        super(2, continuation);
        this.Y = startConversationScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((czd) n((c64) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        czd czd = new czd(continuation, this.Y);
        czd.X = obj;
        return czd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        syd.c.R1((c64) this.X);
        return e5f.a;
    }
}
