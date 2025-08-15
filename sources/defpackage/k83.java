package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k83  reason: default package */
public final class k83 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ m83 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k83(m83 m83, Continuation continuation) {
        super(2, continuation);
        this.Y = m83;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k83) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new k83(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (m83.b(this.Y, this) == tx3) {
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
