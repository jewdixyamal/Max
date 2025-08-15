package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rn5  reason: default package */
public final class rn5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ c66 Z;
    public final /* synthetic */ on5 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rn5(c66 c66, on5 on5, Continuation continuation) {
        super(2, continuation);
        this.Z = c66;
        this.s0 = on5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rn5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rn5 rn5 = new rn5(this.Z, this.s0, continuation);
        rn5.Y = obj;
        return rn5;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (this.Z.invoke((sx3) this.Y, this.s0, this) == tx3) {
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
