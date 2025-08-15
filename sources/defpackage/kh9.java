package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kh9  reason: default package */
public final class kh9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ uh9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kh9(uh9 uh9, Continuation continuation) {
        super(2, continuation);
        this.Y = uh9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kh9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kh9(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long j = uh9.J;
            this.X = 1;
            if (j47.y(j, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = uh9.K;
        this.Y.k(false);
        return e5f.a;
    }
}
