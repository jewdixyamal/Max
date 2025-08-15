package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bc2  reason: default package */
public final class bc2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cc2 Y;
    public final /* synthetic */ dc2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bc2(cc2 cc2, dc2 dc2, Continuation continuation) {
        super(2, continuation);
        this.Y = cc2;
        this.Z = dc2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bc2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bc2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            xb9 q = this.Y.q();
            int i2 = ft4.o;
            long R = z7.R(2, kt4.SECONDS);
            this.X = 1;
            if (q.l(this.Z, R, this) == tx3) {
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
