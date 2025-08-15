package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: qy2  reason: default package */
public final class qy2 extends ffe implements a66 {
    public ti9 X;
    public int Y;
    public final /* synthetic */ ti9 Z;
    public final /* synthetic */ ty2 s0;
    public final /* synthetic */ long t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qy2(q0e q0e, Continuation continuation, ty2 ty2, long j) {
        super(2, continuation);
        this.Z = q0e;
        this.s0 = ty2;
        this.t0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qy2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qy2((q0e) this.Z, continuation, this.s0, this.t0);
    }

    public final Object o(Object obj) {
        ti9 ti9;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        ty2 ty2 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            ti9 ti92 = this.Z;
            this.X = ti92;
            this.Y = 1;
            Comparable d = ty2.d(ty2, this.t0, this);
            if (d == tx3) {
                return tx3;
            }
            ti9 ti93 = ti92;
            obj = d;
            ti9 = ti93;
        } else if (i == 1) {
            ti9 = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e52 e52 = (e52) obj;
        if (e52 != null) {
            long j = e52.b.a;
            if (j != 0) {
                ((ti9) ((ConcurrentHashMap) ty2.Z).computeIfAbsent(new Long(j), new sy2(new py2(e52, 0)))).setValue(e52);
            }
        } else {
            e52 = null;
        }
        ti9.setValue(e52);
        return e5f.a;
    }
}
