package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rjb  reason: default package */
public final class rjb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zjb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rjb(zjb zjb, Continuation continuation) {
        super(2, continuation);
        this.Y = zjb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rjb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rjb(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zjb zjb = this.Y;
            this.X = 1;
            if (zjb.q(zjb, (ljb) zjb.z0.getValue(), this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
