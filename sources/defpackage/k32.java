package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k32  reason: default package */
public final class k32 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ l32 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k32(l32 l32, Continuation continuation) {
        super(2, continuation);
        this.Z = l32;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k32) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k32 k32 = new k32(this.Z, continuation);
        k32.Y = obj;
        return k32;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (this.Z.j((iab) this.Y, this) == tx3) {
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
