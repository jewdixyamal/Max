package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bn2  reason: default package */
public final class bn2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ sx3 s0;
    public final /* synthetic */ cn2 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bn2(t03 t03, Continuation continuation, sx3 sx3, cn2 cn2) {
        super(2, continuation);
        this.Z = t03;
        this.s0 = sx3;
        this.t0 = cn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bn2) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bn2 bn2 = new bn2((t03) this.Z, continuation, this.s0, this.t0);
        bn2.Y = obj;
        return bn2;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            an2 an2 = new an2((on5) this.Y, this.s0, this.t0);
            this.X = 1;
            if (this.Z.d(an2, this) == tx3) {
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
