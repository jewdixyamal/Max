package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: odd  reason: default package */
public final class odd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rdd Y;
    public final /* synthetic */ vbd Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public odd(rdd rdd, vbd vbd, Continuation continuation) {
        super(2, continuation);
        this.Y = rdd;
        this.Z = vbd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((odd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new odd(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.b;
            vdd vdd = new vdd(this.Z);
            this.X = 1;
            if (kld.a(vdd, this) == tx3) {
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
