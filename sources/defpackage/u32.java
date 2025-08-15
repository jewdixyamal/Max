package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u32  reason: default package */
public final class u32 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ x32 Y;
    public final /* synthetic */ on5 Z;
    public final /* synthetic */ Object s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u32(x32 x32, on5 on5, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Y = x32;
        this.Z = on5;
        this.s0 = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u32) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new u32(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            c66 c66 = this.Y.X;
            this.X = 1;
            if (c66.invoke(this.Z, this.s0, this) == tx3) {
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
