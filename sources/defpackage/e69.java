package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: e69  reason: default package */
public final class e69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((e69) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        e69 e69 = new e69(continuation, this.Y);
        e69.X = obj;
        return e69;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        bc7[] bc7Arr = MessagesListWidget.X0;
        this.Y.w0().setVisibility(booleanValue ^ true ? 0 : 8);
        return e5f.a;
    }
}
