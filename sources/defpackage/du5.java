package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: du5  reason: default package */
public final class du5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ nu5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public du5(Object obj, Continuation continuation, nu5 nu5) {
        super(2, continuation);
        this.Y = obj;
        this.Z = nu5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((du5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new du5(this.Y, continuation, this.Z);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long longValue = ((Number) this.Y).longValue();
            bc7[] bc7Arr = nu5.D0;
            this.X = 1;
            obj = ((jz2) ((iy2) this.Z.Z.getValue())).k(longValue, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e52 e52 = (e52) obj;
        if (e52 != null) {
            return new Long(e52.a);
        }
        return null;
    }
}
