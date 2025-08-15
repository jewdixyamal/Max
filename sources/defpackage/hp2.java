package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hp2  reason: default package */
public final class hp2 extends ffe implements a66 {
    public z23 X;
    public int Y;
    public final /* synthetic */ rq2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hp2(rq2 rq2, Continuation continuation) {
        super(2, continuation);
        this.Z = rq2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hp2(this.Z, continuation);
    }

    public final Object o(Object obj) {
        z23 z23;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            rq2 rq2 = this.Z;
            z23 = rq2.s0;
            this.X = z23;
            this.Y = 1;
            obj = rq2.y(this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            z23 = this.X;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj).longValue();
        this.X = null;
        this.Y = 2;
        if (z23.f(longValue, this) == tx3) {
            return tx3;
        }
        return e5f.a;
    }
}
