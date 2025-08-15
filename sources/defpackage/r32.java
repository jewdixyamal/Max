package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: r32  reason: default package */
public final class r32 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ s32 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r32(s32 s32, Continuation continuation) {
        super(2, continuation);
        this.Z = s32;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r32) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        r32 r32 = new r32(this.Z, continuation);
        r32.Y = obj;
        return r32;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (this.Z.n((on5) this.Y, this) == tx3) {
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
