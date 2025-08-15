package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: r52  reason: default package */
public final class r52 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ u52 s0;
    public final /* synthetic */ long t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r52(w7c w7c, Continuation continuation, u52 u52, long j) {
        super(2, continuation);
        this.Z = w7c;
        this.s0 = u52;
        this.t0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r52) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        r52 r52 = new r52((w7c) this.Z, continuation, this.s0, this.t0);
        r52.Y = obj;
        return r52;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            q52 q52 = new q52((on5) this.Y, this.s0, this.t0);
            this.X = 1;
            if (this.Z.d(q52, this) == tx3) {
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
