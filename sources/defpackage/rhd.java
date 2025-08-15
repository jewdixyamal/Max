package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: rhd  reason: default package */
public final class rhd extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cid Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rhd(cid cid, Continuation continuation) {
        super(2, continuation);
        this.Z = cid;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rhd) n((ge3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rhd rhd = new rhd(this.Z, continuation);
        rhd.Y = obj;
        return rhd;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            if (tpa.f((ge3) this.Y, ge3.a)) {
                this.X = 1;
                if (cid.q(this.Z, this) == tx3) {
                    return tx3;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
