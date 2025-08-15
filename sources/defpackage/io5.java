package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: io5  reason: default package */
public final class io5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mn5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public io5(mn5 mn5, Continuation continuation) {
        super(2, continuation);
        this.Y = mn5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((io5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new io5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (od2.q(this.Y, this) == tx3) {
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
