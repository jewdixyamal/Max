package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: y32  reason: default package */
public final class y32 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mn5 Y;
    public final /* synthetic */ z5d Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y32(mn5 mn5, z5d z5d, Continuation continuation) {
        super(2, continuation);
        this.Y = mn5;
        this.Z = z5d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y32) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new y32(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (this.Y.d(this.Z, this) == tx3) {
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
