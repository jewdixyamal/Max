package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: eu2  reason: default package */
public final class eu2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ pu2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eu2(pu2 pu2, Continuation continuation) {
        super(2, continuation);
        this.Y = pu2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eu2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new eu2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.Y.u0.set(true);
            this.Y.w0.clear();
            this.Y.a.h.clear();
            pu2 pu2 = this.Y;
            pu2.a.j = pu2;
            pu2 pu22 = this.Y;
            this.X = 1;
            if (pu22.d(this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.Y.v0.set(false);
        return e5f.a;
    }
}
