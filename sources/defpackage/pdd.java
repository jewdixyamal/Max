package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pdd  reason: default package */
public final class pdd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rdd Y;
    public final /* synthetic */ tbd Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pdd(rdd rdd, tbd tbd, Continuation continuation) {
        super(2, continuation);
        this.Y = rdd;
        this.Z = tbd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pdd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pdd(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.b;
            udd udd = new udd(this.Z);
            this.X = 1;
            if (kld.a(udd, this) == tx3) {
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
