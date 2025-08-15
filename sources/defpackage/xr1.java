package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xr1  reason: default package */
public final class xr1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cs1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xr1(cs1 cs1, Continuation continuation) {
        super(2, continuation);
        this.Y = cs1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xr1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xr1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            n51 n51 = n51.a;
            this.X = 1;
            if (kld.a(n51, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
