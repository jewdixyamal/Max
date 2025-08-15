package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jk  reason: default package */
public final class jk extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ bkb Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jk(bkb bkb, Continuation continuation) {
        super(2, continuation);
        this.Z = bkb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jk) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jk jkVar = new jk(this.Z, continuation);
        jkVar.Y = obj;
        return jkVar;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            this.Y = sx3;
            bkb bkb = this.Z;
            this.X = 1;
            sy1 sy1 = new sy1(1, v3c.u(this));
            sy1.n();
            ((cx7) bkb.b).dispatch(sx3.getCoroutineContext(), new re(2, sy1));
            if (sy1.m() == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            sx3 sx32 = (sx3) this.Y;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
