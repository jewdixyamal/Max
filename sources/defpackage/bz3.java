package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bz3  reason: default package */
public final class bz3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cz3 Y;
    public final /* synthetic */ oi0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bz3(cz3 cz3, oi0 oi0, Continuation continuation) {
        super(2, continuation);
        this.Y = cz3;
        this.Z = oi0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bz3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bz3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            xy3 xy3 = new xy3(this.Z.a);
            this.X = 1;
            if (kld.a(xy3, this) == tx3) {
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
