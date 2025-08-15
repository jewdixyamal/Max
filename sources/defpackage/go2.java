package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: go2  reason: default package */
public final class go2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public go2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((go2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        go2 go2 = new go2(continuation, this.Y);
        go2.X = obj;
        return go2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        xy8 xy8 = (xy8) this.X;
        bc7[] bc7Arr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        if (chatScreen.P0().d1.a.getValue() != null) {
            ChatScreen.x0(chatScreen, !(chatScreen.J0().Y.a.getValue() instanceof qzc) ? lr0.b : xy8 == null ? lr0.c : lr0.a);
        }
        return e5f.a;
    }
}
