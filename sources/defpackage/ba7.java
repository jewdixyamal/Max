package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ba7  reason: default package */
public final class ba7 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ c8d Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ba7(c8d c8d, Continuation continuation) {
        super(2, continuation);
        this.Z = c8d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ba7) n((z97) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ba7 ba7 = new ba7(this.Z, continuation);
        ba7.Y = obj;
        return ba7;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zt0 zt0 = (zt0) this.Z.o;
            this.X = 1;
            if (zt0.o((z97) this.Y, this) == tx3) {
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
