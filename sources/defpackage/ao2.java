package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: ao2  reason: default package */
public final class ao2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ao2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ao2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ao2 ao2 = new ao2(continuation, this.Y);
        ao2.X = obj;
        return ao2;
    }

    public final Object o(Object obj) {
        Object value;
        od2.a0(obj);
        Boolean bool = (Boolean) this.X;
        bool.booleanValue();
        bc7[] bc7Arr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        chatScreen.getClass();
        uu3 b = ((j03) chatScreen.X0.T0(chatScreen, ChatScreen.k1[17])).b();
        VideoMessageWidget videoMessageWidget = b instanceof VideoMessageWidget ? (VideoMessageWidget) b : null;
        if (videoMessageWidget != null) {
            q0e q0e = ((ljf) videoMessageWidget.c.getValue()).b;
            do {
                value = q0e.getValue();
                ((Boolean) value).getClass();
            } while (!q0e.c(value, bool));
        }
        return e5f.a;
    }
}
