package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: ev2  reason: default package */
public final class ev2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListSearchScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ev2(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ev2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ev2 ev2 = new ev2(continuation, this.Y);
        ev2.X = obj;
        return ev2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.D0.E((List) this.X);
        return e5f.a;
    }
}
