package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: eo2  reason: default package */
public final class eo2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eo2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((eo2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        eo2 eo2 = new eo2(continuation, this.Y);
        eo2.X = obj;
        return eo2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ez8 ez8 = (ez8) this.X;
        boolean z = true;
        if (!(ez8.b.getAction() == 3 || ez8.b.getAction() == 1)) {
            z = false;
        }
        this.Y.A0 = z;
        return e5f.a;
    }
}
