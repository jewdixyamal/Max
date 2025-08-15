package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.startconversation.chat.PickChatMembers;

/* renamed from: mwa  reason: default package */
public final class mwa extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickChatMembers Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mwa(Continuation continuation, PickChatMembers pickChatMembers) {
        super(2, continuation);
        this.Y = pickChatMembers;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((mwa) n((Set) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mwa mwa = new mwa(continuation, this.Y);
        mwa.X = obj;
        return mwa;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        long[] E0 = x53.E0((Set) this.X);
        bc7[] bc7Arr = PickChatMembers.x0;
        PickChatMembers pickChatMembers = this.Y;
        pickChatMembers.getClass();
        bc7 bc7 = PickChatMembers.x0[0];
        pickChatMembers.t0.b(pickChatMembers, E0);
        return e5f.a;
    }
}
