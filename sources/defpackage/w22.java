package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.sdk.arch.Widget;

/* renamed from: w22  reason: default package */
public final class w22 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChangeOwnerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w22(Continuation continuation, ChangeOwnerScreen changeOwnerScreen) {
        super(2, continuation);
        this.Y = changeOwnerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((w22) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        w22 w22 = new w22(continuation, this.Y);
        w22.X = obj;
        return w22;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        x22 x22 = (x22) this.X;
        if (x22 instanceof x22) {
            wha wha = new wha((Widget) this.Y);
            wha.g(x22.a);
            Integer num = x22.b;
            if (num != null) {
                wha.e(new kia(num.intValue()));
            }
            wha.i();
            return e5f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
