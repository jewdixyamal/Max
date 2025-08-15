package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qhf  reason: default package */
public final class qhf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ vhf Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhf(Object obj, Continuation continuation, vhf vhf, long j) {
        super(2, continuation);
        this.Y = obj;
        this.Z = vhf;
        this.s0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qhf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qhf(this.Y, continuation, this.Z, this.s0);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long longValue = ((Number) this.Y).longValue();
            this.X = 1;
            obj = vhf.a(this.Z, this.s0, longValue, this);
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
