package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sca  reason: default package */
public final class sca extends ffe implements a66 {
    public int X;
    public final /* synthetic */ uca Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sca(uca uca, Continuation continuation) {
        super(2, continuation);
        this.Y = uca;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sca) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sca(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = this.Y.k(this);
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
