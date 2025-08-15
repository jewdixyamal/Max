package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;

/* renamed from: sn2  reason: default package */
public final class sn2 extends ffe implements a66 {
    public final /* synthetic */ ChatScreen X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sn2) n((kce) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sn2(continuation, this.X);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = ChatScreen.k1;
        ChatScreen chatScreen = this.X;
        if (chatScreen.M0().b() == null) {
            j03 M0 = chatScreen.M0();
            boolean f = tpa.f(M0.c(), "SuggestionsWidgetTag");
            String str = chatScreen.L0;
            if (!f) {
                coc coc = new coc(new SuggestionsWidget(str, (z84) null), (String) null, (zu3) null, (zu3) null, false, -1);
                coc.d("SuggestionsWidgetTag");
                M0.a.R(coc);
            }
            znc childRouter = chatScreen.getChildRouter(chatScreen.L0());
            childRouter.e = 1;
            childRouter.Q(false);
            if (!childRouter.n()) {
                childRouter.R(i24.e(new SuggestionsWidget(str, (z84) null), (zu3) null, (zu3) null));
            }
        }
        return e5f.a;
    }
}
