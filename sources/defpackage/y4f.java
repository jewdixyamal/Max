package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: y4f  reason: default package */
public final class y4f extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ on5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y4f(on5 on5, Continuation continuation) {
        super(2, continuation);
        this.Z = on5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y4f) n(obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        y4f y4f = new y4f(this.Z, continuation);
        y4f.Y = obj;
        return y4f;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Object obj2 = this.Y;
            this.X = 1;
            if (this.Z.a(obj2, this) == tx3) {
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
