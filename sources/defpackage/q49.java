package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: q49  reason: default package */
public final class q49 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q49(n59 n59, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = n59;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new q49(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            r79 r = n59.r(this.Y);
            this.X = 1;
            obj = r.a(this.Z, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
