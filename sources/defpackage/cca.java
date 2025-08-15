package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cca  reason: default package */
public final class cca extends ffe implements a66 {
    public int X;
    public final /* synthetic */ eca Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cca(eca eca, Continuation continuation) {
        super(2, continuation);
        this.Y = eca;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cca) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cca(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ((ya9) this.Y.c.getValue()).d(this);
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
