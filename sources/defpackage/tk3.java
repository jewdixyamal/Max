package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tk3  reason: default package */
public final class tk3 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ zk3 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tk3(t03 t03, Continuation continuation, zk3 zk3) {
        super(2, continuation);
        this.Z = t03;
        this.s0 = zk3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tk3) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tk3 tk3 = new tk3((t03) this.Z, continuation, this.s0);
        tk3.Y = obj;
        return tk3;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zq zqVar = new zq((on5) this.Y, (Object) this.s0, 4);
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
