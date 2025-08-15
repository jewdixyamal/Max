package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: we2  reason: default package */
public final class we2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ye2 Y;
    public final /* synthetic */ gs9 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public we2(ye2 ye2, gs9 gs9, Continuation continuation) {
        super(2, continuation);
        this.Y = ye2;
        this.Z = gs9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((we2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new we2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ((k4a) ((pk) this.Y.Z.getValue())).J(this.Z, this);
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
