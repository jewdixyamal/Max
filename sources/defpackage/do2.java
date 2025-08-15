package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: do2  reason: default package */
public final class do2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public do2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((do2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        do2 do2 = new do2(continuation, this.Y);
        do2.X = obj;
        return do2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof g43) {
            this.Y.getRouter().C();
        } else if (wm9 instanceof c64) {
            vo2.c.R1((c64) wm9);
        }
        return e5f.a;
    }
}
