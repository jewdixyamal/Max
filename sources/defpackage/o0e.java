package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o0e  reason: default package */
public final class o0e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ mec s0;
    public final /* synthetic */ long t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o0e(cp5 cp5, mec mec, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = cp5;
        this.s0 = mec;
        this.t0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o0e) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        o0e o0e = new o0e((cp5) this.Z, this.s0, this.t0, continuation);
        o0e.Y = obj;
        return o0e;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long j = this.t0;
            n0e n0e = new n0e(this.Z, this.s0, (on5) this.Y, j, (Continuation) null);
            this.X = 1;
            if (j1e.k(n0e, this) == tx3) {
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
