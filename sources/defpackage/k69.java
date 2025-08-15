package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: k69  reason: default package */
public final class k69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((k69) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k69 k69 = new k69(continuation, this.Y);
        k69.X = obj;
        return k69;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        e5f e5f = (e5f) this.X;
        bc7[] bc7Arr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = this.Y;
        EndlessRecyclerView2 u0 = messagesListWidget.u0();
        if (u0.getScrollState() == 0) {
            messagesListWidget.p0().e(u0, false);
        }
        return e5f.a;
    }
}
