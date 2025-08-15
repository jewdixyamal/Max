package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dva  reason: default package */
public final class dva extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jva Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dva(jva jva, Continuation continuation) {
        super(2, continuation);
        this.Y = jva;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dva) n(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dva(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            jva jva = this.Y;
            jva.getClass();
            Object k = j1e.k(new eva(jva, (Continuation) null), this);
            if (k != tx3) {
                k = e5f;
            }
            if (k == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
