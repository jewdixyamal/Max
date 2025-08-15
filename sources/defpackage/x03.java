package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: x03  reason: default package */
public final class x03 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ qp4 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x03(qp4 qp4, Continuation continuation) {
        super(2, continuation);
        this.Z = qp4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x03) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        x03 x03 = new x03(this.Z, continuation);
        x03.Y = obj;
        return x03;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            gq9 y = ((pl8) this.Z.Y).y();
            this.X = 1;
            if (((on5) this.Y).a(y, this) == tx3) {
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
