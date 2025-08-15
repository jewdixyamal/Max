package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: li2  reason: default package */
public final class li2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public li2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((li2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        li2 li2 = new li2(continuation, this.Y);
        li2.X = obj;
        return li2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        jqe jqe = ((dj2) this.X).a;
        ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
        CharSequence b = jqe != null ? jqe.b(chatMediaViewerScreen.getContext()) : null;
        if (b == null) {
            b = "";
        }
        if (b.length() > 0) {
            bc7[] bc7Arr = ChatMediaViewerScreen.K0;
            chatMediaViewerScreen.C0().setTitle(b);
        }
        return e5f.a;
    }
}
