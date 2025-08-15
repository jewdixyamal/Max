package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* renamed from: rz2  reason: default package */
public final class rz2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsTabWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rz2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.Y = chatsTabWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((rz2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rz2 rz2 = new rz2(continuation, this.Y);
        rz2.X = obj;
        return rz2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int intValue = ((Number) this.X).intValue();
        bc7[] bc7Arr = ChatsTabWidget.C0;
        ChatsTabWidget chatsTabWidget = this.Y;
        if (!(chatsTabWidget.n0().getCurrentItem() == intValue && chatsTabWidget.m0().getSelectedTabPosition() == intValue)) {
            chatsTabWidget.n0().e(intValue, false);
            chatsTabWidget.m0().q(intValue, 0.0f, true, true, true);
        }
        return e5f.a;
    }
}
