package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: ub2  reason: default package */
public final class ub2 extends ffe implements a66 {
    public zb2 X;
    public int Y;
    public final /* synthetic */ zb2 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ e52 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ub2(zb2 zb2, long j, e52 e52, Continuation continuation) {
        super(2, continuation);
        this.Z = zb2;
        this.s0 = j;
        this.t0 = e52;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ub2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ub2(this.Z, this.s0, this.t0, continuation);
    }

    public final Object o(Object obj) {
        zb2 zb2;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            zb2 zb22 = this.Z;
            if (zb22.E0.get()) {
                ConcurrentHashMap concurrentHashMap = zb22.F0;
                long j = this.s0;
                concurrentHashMap.put(new Long(j), new tb2((Object) zb22, j, (Object) this.t0, 0));
                return e5f;
            }
            alc e = zb22.e();
            this.X = zb22;
            this.Y = 1;
            obj = e.d(this);
            if (obj == tx3) {
                return tx3;
            }
            zb2 = zb22;
        } else if (i == 1) {
            zb2 = this.X;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.X = null;
        this.Y = 2;
        return zb2.j(zb2, (List) obj, false, this) == tx3 ? tx3 : e5f;
    }
}
