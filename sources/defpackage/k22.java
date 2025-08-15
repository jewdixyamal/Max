package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k22  reason: default package */
public final class k22 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l22 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k22(l22 l22, Continuation continuation) {
        super(2, continuation);
        this.Y = l22;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k22) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new k22(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            z12 z12 = this.Y.b;
            this.X = 1;
            if (z12.j(this) == tx3) {
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
