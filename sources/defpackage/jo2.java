package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: jo2  reason: default package */
public final class jo2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jo2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jo2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jo2 jo2 = new jo2(continuation, this.Y);
        jo2.X = obj;
        return jo2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        fg9 fg9 = (fg9) this.X;
        bc7[] bc7Arr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        chatScreen.getClass();
        if (fg9.a > 0) {
            chatScreen.N0().c(String.valueOf(fg9.a), fg9.b, new fn2(chatScreen, 5), new gn2(chatScreen, 1));
        } else if (chatScreen.N0().b()) {
            chatScreen.N0().a();
        }
        return e5f.a;
    }
}
