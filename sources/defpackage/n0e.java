package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n0e  reason: default package */
public final class n0e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ mec s0;
    public final /* synthetic */ on5 t0;
    public final /* synthetic */ long u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n0e(mn5 mn5, mec mec, on5 on5, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = mn5;
        this.s0 = mec;
        this.t0 = on5;
        this.u0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n0e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n0e n0e = new n0e(this.Z, this.s0, this.t0, this.u0, continuation);
        n0e.Y = obj;
        return n0e;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            on5 on5 = this.t0;
            long j = this.u0;
            m0e m0e = new m0e(this.s0, on5, (sx3) this.Y, j);
            this.X = 1;
            if (this.Z.d(m0e, this) == tx3) {
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
