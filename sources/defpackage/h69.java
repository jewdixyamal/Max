package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: h69  reason: default package */
public final class h69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((h69) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h69 h69 = new h69(continuation, this.Y);
        h69.X = obj;
        return h69;
    }

    public final Object o(Object obj) {
        int K;
        od2.a0(obj);
        u5f u5f = (u5f) this.X;
        long a = u5f.a();
        bc7[] bc7Arr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = this.Y;
        messagesListWidget.getClass();
        bc7[] bc7Arr2 = MessagesListWidget.X0;
        bc7 bc7 = bc7Arr2[2];
        messagesListWidget.o.b(messagesListWidget, Long.valueOf(a));
        r5f r5f = messagesListWidget.F0;
        if (r5f != null) {
            bc7 bc72 = bc7Arr2[4];
            r5f.c = ((Boolean) messagesListWidget.Y.a(messagesListWidget)).booleanValue() ? 0 : u5f.a();
            messagesListWidget.u0().Y();
            if ((u5f instanceof t5f) && (K = messagesListWidget.A0.K(((t5f) u5f).a)) >= 0) {
                messagesListWidget.M0.e = -1;
                messagesListWidget.u0().getLinearLayoutManager().n1(K, messagesListWidget.u0().getMeasuredHeight() - r5f.i().getMeasuredHeight());
            }
        }
        return e5f.a;
    }
}
