package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.addmembers.AddChatMembersScreen;

/* renamed from: l9  reason: default package */
public final class l9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AddChatMembersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l9(Continuation continuation, AddChatMembersScreen addChatMembersScreen) {
        super(2, continuation);
        this.Y = addChatMembersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((l9) n((Set) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l9 l9Var = new l9(continuation, this.Y);
        l9Var.X = obj;
        return l9Var;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        long[] E0 = x53.E0((Set) this.X);
        bc7[] bc7Arr = AddChatMembersScreen.x0;
        AddChatMembersScreen addChatMembersScreen = this.Y;
        addChatMembersScreen.getClass();
        bc7 bc7 = AddChatMembersScreen.x0[1];
        addChatMembersScreen.u0.b(addChatMembersScreen, E0);
        return e5f.a;
    }
}
