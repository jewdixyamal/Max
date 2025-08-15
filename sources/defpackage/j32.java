package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: j32  reason: default package */
public final class j32 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ on5 Z;
    public final /* synthetic */ l32 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j32(on5 on5, l32 l32, Continuation continuation) {
        super(2, continuation);
        this.Z = on5;
        this.s0 = l32;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j32) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j32 j32 = new j32(this.Z, this.s0, continuation);
        j32.Y = obj;
        return j32;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            p8c m = this.s0.m((sx3) this.Y);
            this.X = 1;
            Object v = fp3.v(this.Z, m, true, this);
            if (v != tx3) {
                v = e5f;
            }
            if (v == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
