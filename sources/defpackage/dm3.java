package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dm3  reason: default package */
public final class dm3 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ jm3 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dm3(t03 t03, Continuation continuation, jm3 jm3) {
        super(2, continuation);
        this.Z = t03;
        this.s0 = jm3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dm3) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dm3 dm3 = new dm3((t03) this.Z, continuation, this.s0);
        dm3.Y = obj;
        return dm3;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zq zqVar = new zq((on5) this.Y, (Object) this.s0, 5);
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
