package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* renamed from: yx2  reason: default package */
public final class yx2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yx2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yx2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yx2 yx2 = new yx2(continuation, this.Y);
        yx2.X = obj;
        return yx2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.G0.E((List) this.X);
        return e5f.a;
    }
}
