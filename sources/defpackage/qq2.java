package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qq2  reason: default package */
public final class qq2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rq2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qq2(rq2 rq2, Continuation continuation) {
        super(2, continuation);
        this.Y = rq2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qq2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qq2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        rq2 rq2 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = rq2.y(this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((jz2) rq2.X).l().g0(((Number) obj).longValue());
        pnf.o(rq2.b1, new ep2(yoc.K, (Integer) null, new Integer(woc.m), 2));
        return e5f.a;
    }
}
