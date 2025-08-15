package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: c69  reason: default package */
public final class c69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((c69) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        c69 c69 = new c69(continuation, this.Y);
        c69.X = obj;
        return c69;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        String str = this.Y.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            int size = list.size();
            Object i0 = x53.i0(list);
            MessageModel messageModel = i0 instanceof MessageModel ? (MessageModel) i0 : null;
            String m = messageModel != null ? messageModel.m() : null;
            Object q0 = x53.q0(list);
            MessageModel messageModel2 = q0 instanceof MessageModel ? (MessageModel) q0 : null;
            String m2 = messageModel2 != null ? messageModel2.m() : null;
            ir6.d(us7, str, "Got new messages on UI, size=" + size + ", first=" + m + ", last=" + m2, (Throwable) null);
        }
        kp.x(this.Y.u0(), new h76(this.Y, 13, list));
        return e5f.a;
    }
}
