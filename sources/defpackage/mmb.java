package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mmb  reason: default package */
public final class mmb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cnb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mmb(cnb cnb, Continuation continuation) {
        super(2, continuation);
        this.Y = cnb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mmb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mmb(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        cnb cnb = this.Y;
        if (i == 0) {
            od2.a0(obj);
            pab pab = cnb.O0;
            this.X = 1;
            pab.a(this);
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pnf.o(cnb.z0, new ulb(new eqe(yea.F0), new imb(cnb, 2)));
        return e5f;
    }
}
