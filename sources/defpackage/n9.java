package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.addmembers.AddChatMembersScreen;

/* renamed from: n9  reason: default package */
public final class n9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AddChatMembersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n9(Continuation continuation, AddChatMembersScreen addChatMembersScreen) {
        super(2, continuation);
        this.Y = addChatMembersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((n9) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n9 n9Var = new n9(continuation, this.Y);
        n9Var.X = obj;
        return n9Var;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (((wm9) this.X) instanceof g43) {
            this.Y.getRouter().C();
        }
        return e5f.a;
    }
}
