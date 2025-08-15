package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hu5  reason: default package */
public final class hu5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ nu5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hu5(nu5 nu5, Continuation continuation) {
        super(2, continuation);
        this.Y = nu5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hu5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hu5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        nu5 nu5 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            ta2 ta2 = nu5.X;
            this.X = 1;
            if (((zb2) ta2).c(nu5.b, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pnf.o(nu5.x0, new nt5(false));
        return e5f.a;
    }
}
