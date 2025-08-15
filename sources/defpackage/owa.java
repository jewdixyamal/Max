package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.chat.PickChatMembers;

/* renamed from: owa  reason: default package */
public final class owa extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickChatMembers Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public owa(Continuation continuation, PickChatMembers pickChatMembers) {
        super(2, continuation);
        this.Y = pickChatMembers;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((owa) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        owa owa = new owa(continuation, this.Y);
        owa.X = obj;
        return owa;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (((Boolean) this.X).booleanValue()) {
            bc7[] bc7Arr = PickChatMembers.x0;
            PickChatMembers pickChatMembers = this.Y;
            ((eua) pickChatMembers.u0.getValue()).e(new l5g(pickChatMembers, 1));
        }
        return e5f.a;
    }
}
