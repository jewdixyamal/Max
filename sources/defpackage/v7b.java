package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: v7b  reason: default package */
public final class v7b extends ffe implements a66 {
    public int X;
    public final /* synthetic */ w7b Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v7b(w7b w7b, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = w7b;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v7b) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new v7b(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            w7b w7b = this.Y;
            kld kld = w7b.t0;
            int i2 = ft4.o;
            m32 Q = nu0.Q(kld, z7.S(this.Z, kt4.MILLISECONDS));
            xw xwVar = new xw(10, (Object) w7b);
            this.X = 1;
            if (Q.d(xwVar, this) == tx3) {
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
