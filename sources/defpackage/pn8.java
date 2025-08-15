package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pn8  reason: default package */
public final class pn8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rn8 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pn8(rn8 rn8, Continuation continuation) {
        super(2, continuation);
        this.Y = rn8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pn8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pn8(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.d;
            mn8 mn8 = mn8.a;
            this.X = 1;
            if (kld.a(mn8, this) == tx3) {
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
