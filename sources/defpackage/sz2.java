package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* renamed from: sz2  reason: default package */
public final class sz2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsTabWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sz2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.Y = chatsTabWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sz2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sz2 sz2 = new sz2(continuation, this.Y);
        sz2.X = obj;
        return sz2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int size = ((List) this.X).size();
        ChatsTabWidget chatsTabWidget = this.Y;
        if (size > 1) {
            bc7[] bc7Arr = ChatsTabWidget.C0;
            chatsTabWidget.m0().setVisibility(0);
            chatsTabWidget.n0().setUserInputEnabled(true);
        } else {
            bc7[] bc7Arr2 = ChatsTabWidget.C0;
            chatsTabWidget.m0().setVisibility(8);
            chatsTabWidget.n0().setUserInputEnabled(false);
        }
        return e5f.a;
    }
}
