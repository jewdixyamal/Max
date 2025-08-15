package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: f79  reason: default package */
public final class f79 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ n79 Z;
    public final /* synthetic */ je7 s0;
    public final /* synthetic */ je7 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f79(je7 je7, je7 je72, n79 n79, Continuation continuation) {
        super(2, continuation);
        this.Z = n79;
        this.s0 = je7;
        this.t0 = je72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f79) n((kua) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        f79 f79 = new f79(this.s0, this.t0, this.Z, continuation);
        f79.Y = obj;
        return f79;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        n79 n79 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            q0e q0e = n79.v0;
            this.X = 1;
            q0e.setValue((kua) this.Y);
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j47.T(n79.u0, (lx3) null, (vx3) null, new e79(this.s0, this.t0, n79, (Continuation) null), 3);
        return e5f;
    }
}
