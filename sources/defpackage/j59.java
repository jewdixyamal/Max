package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: j59  reason: default package */
public final class j59 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ n59 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j59(j31 j31, Continuation continuation, n59 n59) {
        super(2, continuation);
        this.Z = j31;
        this.s0 = n59;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j59) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j59 j59 = new j59((j31) this.Z, continuation, this.s0);
        j59.Y = obj;
        return j59;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zq zqVar = new zq((on5) this.Y, (Object) this.s0, 8);
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
