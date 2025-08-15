package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: zn2  reason: default package */
public final class zn2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zn2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zn2 zn2 = new zn2(continuation, this.Y);
        zn2.X = obj;
        return zn2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        bc7[] bc7Arr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        chatScreen.O0().setVisibility(booleanValue ? 0 : 8);
        q7c q7c = chatScreen.X0;
        if (booleanValue) {
            j03 j03 = (j03) q7c.T0(chatScreen, ChatScreen.k1[17]);
            if (!tpa.f(j03.c(), "video_msg_controller")) {
                coc coc = new coc(new VideoMessageWidget(), (String) null, (zu3) null, (zu3) null, false, -1);
                coc.d("video_msg_controller");
                j03.a.R(coc);
            }
        } else {
            ((j03) q7c.T0(chatScreen, ChatScreen.k1[17])).a();
        }
        return e5f.a;
    }
}
