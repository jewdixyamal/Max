package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: i69  reason: default package */
public final class i69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((i69) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        i69 i69 = new i69(continuation, this.Y);
        i69.X = obj;
        return i69;
    }

    public final Object o(Object obj) {
        y6c y6c;
        od2.a0(obj);
        s6c s6c = (s6c) this.X;
        bc7[] bc7Arr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = this.Y;
        messagesListWidget.getClass();
        if (s6c instanceof s6c) {
            if ((!s6c.e || messagesListWidget.s0().a(s6c.c)) && (y6c = messagesListWidget.W0) != null) {
                String str = s6c.d;
                y6c.e(s6c.b, s6c.a, str);
            }
            return e5f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
