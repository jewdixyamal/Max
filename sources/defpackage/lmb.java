package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lmb  reason: default package */
public final class lmb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cnb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lmb(cnb cnb, Continuation continuation) {
        super(2, continuation);
        this.Y = cnb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lmb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lmb(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        cnb cnb = this.Y;
        if (i == 0) {
            od2.a0(obj);
            pab pab = cnb.O0;
            this.X = 1;
            obj = pab.n(this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e52 e52 = (e52) obj;
        e5f e5f = e5f.a;
        if (e52 == null) {
            return e5f;
        }
        pnf.o(cnb.A0, new gkb(e52.a));
        return e5f;
    }
}
