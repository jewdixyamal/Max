package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: to8  reason: default package */
public final class to8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ bp8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public to8(Object obj, Continuation continuation, bp8 bp8) {
        super(2, continuation);
        this.Y = obj;
        this.Z = bp8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((to8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new to8(this.Y, continuation, this.Z);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        bp8 bp8 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            long longValue = ((Number) this.Y).longValue();
            this.X = 1;
            obj = ((ds3) bp8.t0.getValue()).b(longValue, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uj3 uj3 = (uj3) obj;
        if (uj3 != null) {
            return ((pc4) bp8.w0.getValue()).f(uj3);
        }
        return null;
    }
}
