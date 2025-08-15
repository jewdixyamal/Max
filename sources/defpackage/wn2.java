package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: wn2  reason: default package */
public final class wn2 extends ffe implements a66 {
    public final /* synthetic */ ChatScreen X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        e5f e5f = e5f.a;
        ((wn2) n(bool, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wn2(continuation, this.X);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = ChatScreen.k1;
        this.X.y0();
        return e5f.a;
    }
}
