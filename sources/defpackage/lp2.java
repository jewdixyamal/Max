package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lp2  reason: default package */
public final class lp2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ rq2 Z;
    public final /* synthetic */ cz5 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lp2(long j, rq2 rq2, cz5 cz5, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = rq2;
        this.s0 = cz5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lp2(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        rq2 rq2 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            lu0 q = rq2.q(rq2);
            this.X = 1;
            obj = zo2.d.c(this.Y, 1, q, this.s0, false, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pnf.o(rq2.b1, (zo2) obj);
        return e5f.a;
    }
}
