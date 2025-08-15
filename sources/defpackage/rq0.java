package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rq0  reason: default package */
public final class rq0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ uq0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rq0(uq0 uq0, Continuation continuation) {
        super(2, continuation);
        this.Y = uq0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rq0) n((zs2) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rq0(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = uq0.a(this.Y, this);
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
