package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: ry2  reason: default package */
public final class ry2 extends ffe implements a66 {
    public ti9 X;
    public int Y;
    public final /* synthetic */ ti9 Z;
    public final /* synthetic */ ty2 s0;
    public final /* synthetic */ long t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ry2(q0e q0e, Continuation continuation, ty2 ty2, long j) {
        super(2, continuation);
        this.Z = q0e;
        this.s0 = ty2;
        this.t0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ry2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ry2((q0e) this.Z, continuation, this.s0, this.t0);
    }

    public final Object o(Object obj) {
        ti9 ti9;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        long j = this.t0;
        ty2 ty2 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            ti9 ti92 = this.Z;
            this.X = ti92;
            this.Y = 1;
            Comparable e = ty2.e(ty2, j, this);
            if (e == tx3) {
                return tx3;
            }
            ti9 ti93 = ti92;
            obj = e;
            ti9 = ti93;
        } else if (i == 1) {
            ti9 = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e52 e52 = (e52) obj;
        e52 e522 = null;
        if (e52 == null) {
            ((k4a) ((pk) ((je7) ty2.b).getValue())).j(j);
            e52 = null;
        }
        if (e52 != null) {
            ((ti9) ((ConcurrentHashMap) ty2.Y).computeIfAbsent(new Long(e52.a), new sy2(new py2(e52, 1)))).setValue(e52);
            e522 = e52;
        }
        ti9.setValue(e522);
        return e5f.a;
    }
}
