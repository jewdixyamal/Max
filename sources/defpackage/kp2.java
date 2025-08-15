package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: kp2  reason: default package */
public final class kp2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rq2 Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ Long s0;
    public final /* synthetic */ CharSequence t0;
    public final /* synthetic */ List u0;
    public final /* synthetic */ boolean v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kp2(rq2 rq2, Long l, Long l2, CharSequence charSequence, List list, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = rq2;
        this.Z = l;
        this.s0 = l2;
        this.t0 = charSequence;
        this.u0 = list;
        this.v0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kp2(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            dv4 dv4 = this.Y.Y;
            long longValue = this.Z.longValue();
            long longValue2 = this.s0.longValue();
            this.X = 1;
            if (dv4.a(longValue, longValue2, this.t0, this.u0, this.v0, this) == tx3) {
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
