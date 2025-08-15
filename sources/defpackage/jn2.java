package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: jn2  reason: default package */
public final class jn2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jn2) n((gk6) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jn2 jn2 = new jn2(continuation, this.Y);
        jn2.X = obj;
        return jn2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        gk6 gk6 = (gk6) this.X;
        kpa kpa = gk6 == null ? null : new kpa(new Long(gk6.b), gk6.d);
        bc7[] bc7Arr = ChatScreen.k1;
        this.Y.H0().q(kpa);
        return e5f.a;
    }
}
