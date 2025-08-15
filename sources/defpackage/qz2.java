package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* renamed from: qz2  reason: default package */
public final class qz2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsTabWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qz2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.Y = chatsTabWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((qz2) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qz2 qz2 = new qz2(continuation, this.Y);
        qz2.X = obj;
        return qz2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        ChatsTabWidget chatsTabWidget = this.Y;
        chatsTabWidget.y0.g(list);
        chatsTabWidget.A0.M(list);
        return e5f.a;
    }
}
