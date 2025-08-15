package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fv7  reason: default package */
public final class fv7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mv7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fv7(mv7 mv7, Continuation continuation) {
        super(2, continuation);
        this.Y = mv7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fv7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fv7(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            vu7 vu7 = new vu7(this.Y, 2);
            this.X = 1;
            if (ema.C(vu7, this) == tx3) {
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
