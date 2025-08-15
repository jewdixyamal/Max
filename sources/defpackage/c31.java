package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: c31  reason: default package */
public final class c31 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l31 Y;
    public final /* synthetic */ e52 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c31(l31 l31, e52 e52, Continuation continuation) {
        super(2, continuation);
        this.Y = l31;
        this.Z = e52;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c31) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new c31(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (((xb9) this.Y.i.getValue()).o(this.Z, this) == tx3) {
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
