package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sb6  reason: default package */
public final class sb6 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ xb6 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sb6(Object obj, Continuation continuation, xb6 xb6) {
        super(2, continuation);
        this.Y = obj;
        this.Z = xb6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sb6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sb6(this.Y, continuation, this.Z);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long longValue = ((Number) this.Y).longValue();
            tp7 tp7 = (tp7) this.Z.c.getValue();
            tp7.getClass();
            q1a b = tp7.b(tp7, longValue, false, 26);
            this.X = 1;
            obj = s36.f(b, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
