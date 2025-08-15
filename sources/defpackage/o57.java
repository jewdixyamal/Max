package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* renamed from: o57  reason: default package */
public final class o57 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InviteByPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o57(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.Y = inviteByPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((o57) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        o57 o57 = new o57(continuation, this.Y);
        o57.X = obj;
        return o57;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        l57 l57 = (l57) this.X;
        if (l57 instanceof l57) {
            InviteByPhoneScreen inviteByPhoneScreen = this.Y;
            ((cn3) inviteByPhoneScreen.w0.getValue()).a(inviteByPhoneScreen.getContext(), l57.a);
            return e5f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
