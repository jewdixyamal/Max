package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z69  reason: default package */
public final class z69 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ a79 Y;
    public final /* synthetic */ y69 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z69(a79 a79, y69 y69, Continuation continuation) {
        super(2, continuation);
        this.Y = a79;
        this.Z = y69;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z69) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new z69(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            this.X = 1;
            if (kld.a(this.Z, this) == tx3) {
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
