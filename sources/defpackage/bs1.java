package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bs1  reason: default package */
public final class bs1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cs1 Y;
    public final /* synthetic */ oi0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bs1(cs1 cs1, oi0 oi0, Continuation continuation) {
        super(2, continuation);
        this.Y = cs1;
        this.Z = oi0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bs1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bs1(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            l51 l51 = new l51(this.Z.a);
            this.X = 1;
            if (kld.a(l51, this) == tx3) {
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
