package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: un2  reason: default package */
public final class un2 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public un2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        e5f e5f = e5f.a;
        ((un2) n(bool, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        un2 un2 = new un2(continuation, this.Y);
        un2.X = ((Boolean) obj).booleanValue();
        return un2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (this.X) {
            ChatScreen chatScreen = this.Y;
            chatScreen.getRouter().B(chatScreen);
        }
        return e5f.a;
    }
}
