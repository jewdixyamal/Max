package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: rn2  reason: default package */
public final class rn2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rn2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rn2(continuation, this.Y);
    }

    public final Object o(Object obj) {
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        ChatScreen chatScreen = this.Y;
        if (i == 0) {
            od2.a0(obj);
            if (chatScreen.getView() != null && !chatScreen.I0().n()) {
                rq2 P0 = chatScreen.P0();
                this.X = 1;
                obj2 = P0.y(this);
                if (obj2 == tx3) {
                    return tx3;
                }
            }
            return e5f;
        } else if (i == 1) {
            od2.a0(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj2).longValue();
        bc7[] bc7Arr = ChatScreen.k1;
        znc I0 = chatScreen.I0();
        String str = chatScreen.L0;
        long j = chatScreen.getArgs().getLong("load_mark");
        long j2 = chatScreen.getArgs().getLong("message_id");
        Object obj3 = chatScreen.getArgs().get("highlights");
        List list = obj3 instanceof List ? (List) obj3 : null;
        if (list == null) {
            list = nz4.a;
        }
        MessagesListWidget messagesListWidget = new MessagesListWidget(str, longValue, j, list, j2, chatScreen.getArgs().getBoolean("highlight_message"), chatScreen.getArgs().getBoolean("from_forward"), (z84) null);
        messagesListWidget.I0 = chatScreen.Z0;
        I0.R(new coc(messagesListWidget, (String) null, (zu3) null, (zu3) null, false, -1));
        return e5f;
    }
}
