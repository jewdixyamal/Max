package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: g5g  reason: default package */
public final class g5g extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ a66 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g5g(a66 a66, Continuation continuation) {
        super(2, continuation);
        this.Z = a66;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g5g) n(obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g5g g5g = new g5g(this.Z, continuation);
        g5g.Y = obj;
        return g5g;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Object obj2 = this.Y;
            this.X = 1;
            if (this.Z.invoke(obj2, this) == tx3) {
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
