package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e72  reason: default package */
public final class e72 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ k72 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e72(t03 t03, Continuation continuation, k72 k72) {
        super(2, continuation);
        this.Z = t03;
        this.s0 = k72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e72) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        e72 e72 = new e72((t03) this.Z, continuation, this.s0);
        e72.Y = obj;
        return e72;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zq zqVar = new zq((on5) this.Y, (Object) this.s0, 1);
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
