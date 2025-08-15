package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cf5  reason: default package */
public final class cf5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ g0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cf5(g0 g0Var, Continuation continuation) {
        super(2, continuation);
        this.Y = g0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cf5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cf5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            g0 g0Var = this.Y;
            this.X = 1;
            sy1 sy1 = new sy1(1, v3c.u(this));
            sy1.n();
            sy1.d(new af5(g0Var, 0));
            g0Var.m(new bf5(0, sy1), new cs(2));
            obj = sy1.m();
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
