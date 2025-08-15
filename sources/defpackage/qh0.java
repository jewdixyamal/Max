package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qh0  reason: default package */
public final class qh0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rh0 Y;
    public final /* synthetic */ oi0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qh0(rh0 rh0, oi0 oi0, Continuation continuation) {
        super(2, continuation);
        this.Y = rh0;
        this.Z = oi0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qh0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qh0(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            oi0 oi0 = this.Z;
            ph0 ph0 = new ph0(oi0.a, oi0.b);
            this.X = 1;
            if (kld.a(ph0, this) == tx3) {
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
