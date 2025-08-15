package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bq2  reason: default package */
public final class bq2 extends ffe implements a66 {
    public long X;
    public int Y;
    public final /* synthetic */ rq2 Z;
    public final /* synthetic */ Long s0;
    public final /* synthetic */ long t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bq2(rq2 rq2, Long l, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = rq2;
        this.s0 = l;
        this.t0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bq2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bq2(this.Z, this.s0, this.t0, continuation);
    }

    public final Object o(Object obj) {
        long j;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        rq2 rq2 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            e52 e52 = (e52) rq2.Y0.a.getValue();
            if (e52 != null) {
                long j2 = e52.a;
                this.X = j2;
                this.Y = 1;
                obj = ((x19) rq2.H0.getValue()).a(j2, this.s0, this);
                if (obj == tx3) {
                    return tx3;
                }
                j = j2;
            }
            return e5f;
        } else if (i == 1) {
            long j3 = this.X;
            od2.a0(obj);
            j = j3;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u8d u8d = new u8d(j, this.t0, 1);
        u8d.b = (bw8) obj;
        rq2.r(rq2).a(new v8d(u8d));
        return e5f;
    }
}
