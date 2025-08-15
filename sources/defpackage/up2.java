package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: up2  reason: default package */
public final class up2 extends ffe implements a66 {
    public qp4 X;
    public int Y;
    public final /* synthetic */ rq2 Z;
    public final /* synthetic */ CharSequence s0;
    public final /* synthetic */ Long t0;
    public final /* synthetic */ Long u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public up2(rq2 rq2, CharSequence charSequence, Long l, Long l2, Continuation continuation) {
        super(2, continuation);
        this.Z = rq2;
        this.s0 = charSequence;
        this.t0 = l;
        this.u0 = l2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((up2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new up2(this.Z, this.s0, this.t0, this.u0, continuation);
    }

    public final Object o(Object obj) {
        qp4 qp4;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            rq2 rq2 = this.Z;
            qp4 = rq2.t0;
            this.X = qp4;
            this.Y = 1;
            obj = rq2.y(this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            qp4 = this.X;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qp4 qp42 = qp4;
        long longValue = ((Number) obj).longValue();
        this.X = null;
        this.Y = 2;
        Object t02 = j47.t0(((w9a) ((kke) ((je7) qp42.t0).getValue())).b(), new pp4(qp42, longValue, this.s0, this.u0, this.t0, (Continuation) null), this);
        if (t02 != tx3) {
            t02 = e5f;
        }
        return t02 == tx3 ? tx3 : e5f;
    }
}
