package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: f49  reason: default package */
public final class f49 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ kv0 t0;
    public final /* synthetic */ fv0 u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f49(n59 n59, Long l, String str, kv0 kv0, fv0 fv0, Continuation continuation) {
        super(2, continuation);
        this.Y = n59;
        this.Z = l;
        this.s0 = str;
        this.t0 = kv0;
        this.u0 = fv0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new f49(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            m5d m5d = this.Y.x0;
            long longValue = this.Z.longValue();
            this.X = 1;
            if (m5d.D(longValue, this.s0, this.t0, this.u0, this) == tx3) {
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
