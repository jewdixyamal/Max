package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xjb  reason: default package */
public final class xjb extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ zjb s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xjb(ujb ujb, Continuation continuation, zjb zjb) {
        super(2, continuation);
        this.Z = ujb;
        this.s0 = zjb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xjb) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xjb xjb = new xjb((ujb) this.Z, continuation, this.s0);
        xjb.Y = obj;
        return xjb;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zq zqVar = new zq((on5) this.Y, (Object) this.s0, 10);
            this.X = 1;
            if (this.Z.d(zqVar, this) == tx3) {
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
