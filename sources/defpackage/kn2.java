package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: kn2  reason: default package */
public final class kn2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((kn2) n((lr0) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kn2 kn2 = new kn2(continuation, this.Y);
        kn2.X = obj;
        return kn2;
    }

    public final Object o(Object obj) {
        Object value;
        od2.a0(obj);
        lr0 lr0 = (lr0) this.X;
        bc7[] bc7Arr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        g39 H0 = chatScreen.H0();
        boolean f = tpa.f(lr0.name(), "SEARCH");
        q0e q0e = H0.b;
        do {
            value = q0e.getValue();
            ((Boolean) value).getClass();
        } while (!q0e.c(value, Boolean.valueOf(f)));
        ChatScreen.x0(chatScreen, lr0);
        return e5f.a;
    }
}
