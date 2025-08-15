package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: bo2  reason: default package */
public final class bo2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bo2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bo2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bo2 bo2 = new bo2(continuation, this.Y);
        bo2.X = obj;
        return bo2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        chatScreen.getClass();
        ((View) chatScreen.d1.T0(chatScreen, ChatScreen.k1[21])).setBackground((Drawable) this.X);
        return e5f.a;
    }
}
