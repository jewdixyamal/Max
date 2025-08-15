package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bnb  reason: default package */
public final class bnb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cnb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnb(cnb cnb, Continuation continuation) {
        super(2, continuation);
        this.Y = cnb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bnb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bnb(this.Y, continuation);
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
            pab.C(this);
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pnf.o(cnb.z0, new zlb(new eqe(yea.G0), new Integer(woc.n)));
        return e5f;
    }
}
