package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tl0  reason: default package */
public final class tl0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ yl0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tl0(Object obj, Continuation continuation, yl0 yl0) {
        super(2, continuation);
        this.Y = obj;
        this.Z = yl0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tl0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tl0(this.Y, continuation, this.Z);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long longValue = ((Number) this.Y).longValue();
            this.X = 1;
            obj = ((ds3) this.Z.e.getValue()).b(longValue, this);
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
