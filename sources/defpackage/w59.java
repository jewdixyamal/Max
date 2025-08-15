package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: w59  reason: default package */
public final class w59 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w59(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((w59) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        w59 w59 = new w59(continuation, this.Y);
        w59.X = obj;
        return w59;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bxc bxc = (bxc) this.X;
        bc7[] bc7Arr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = this.Y;
        if (messagesListWidget.r0().w() == 0) {
            messagesListWidget.r0().t1(new x59(messagesListWidget, bxc));
        } else {
            messagesListWidget.r0().u1("ScrollButton");
            MessagesListWidget.o0(messagesListWidget, bxc);
        }
        return e5f.a;
    }
}
