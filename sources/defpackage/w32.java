package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: w32  reason: default package */
public final class w32 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ x32 Z;
    public final /* synthetic */ on5 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w32(x32 x32, on5 on5, Continuation continuation) {
        super(2, continuation);
        this.Z = x32;
        this.s0 = on5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w32) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        w32 w32 = new w32(this.Z, this.s0, continuation);
        w32.Y = obj;
        return w32;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Object obj2 = new Object();
            x32 x32 = this.Z;
            mn5 mn5 = x32.o;
            p32 p32 = new p32(obj2, (sx3) this.Y, x32, this.s0, 1);
            this.X = 1;
            if (mn5.d(p32, this) == tx3) {
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
