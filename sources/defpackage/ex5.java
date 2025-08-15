package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ex5  reason: default package */
public final class ex5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jx5 Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ex5(jx5 jx5, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = jx5;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ex5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ex5(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (((zb2) ((ta2) this.Y.Z.getValue())).c(this.Z, this) == tx3) {
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
