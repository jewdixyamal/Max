package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xac  reason: default package */
public final class xac extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cbc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xac(cbc cbc, Continuation continuation) {
        super(2, continuation);
        this.Y = cbc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xac) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xac(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (j47.x(200, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bc7[] bc7Arr = cbc.G0;
        cbc cbc = this.Y;
        vxd S = j47.S(cbc.a, ((w9a) ((kke) cbc.X.getValue())).b(), vx3.b, new zac(cbc, (Continuation) null));
        cbc.F0.o1(cbc, cbc.G0[1], S);
        return e5f.a;
    }
}
