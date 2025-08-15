package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: czc  reason: default package */
public final class czc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ezc Y;
    public final /* synthetic */ jl2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public czc(ezc ezc, jl2 jl2, Continuation continuation) {
        super(2, continuation);
        this.Y = ezc;
        this.Z = jl2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((czc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new czc(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            azc azc = new azc(this.Z);
            this.X = 1;
            if (kld.a(azc, this) == tx3) {
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
