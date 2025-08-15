package defpackage;

import android.os.Looper;
import kotlin.coroutines.Continuation;

/* renamed from: f13  reason: default package */
public final class f13 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ qp4 Y;
    public final /* synthetic */ k56 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f13(qp4 qp4, u4a u4a, Continuation continuation) {
        super(2, continuation);
        this.Y = qp4;
        this.Z = u4a;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((f13) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        f13 f13 = new f13(this.Y, (u4a) this.Z, continuation);
        f13.X = obj;
        return f13;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        if (!tpa.f(Looper.myLooper(), Looper.getMainLooper())) {
            qp4 qp4 = this.Y;
            w03 w03 = new w03((w7c) ((td) qp4.o).o, qp4, 1);
            v7c v7c = (v7c) ((pl8) qp4.Y).o;
            mn5 x = od2.x(od2.d0(new zn5(new w03(new t03(v7c, 0), qp4, 0), new x03(qp4, (Continuation) null)), new y03(3, (Continuation) null, 0)));
            q0e q0e = (q0e) qp4.s0;
            od2.L(new cp5(new ac(new zn5(new t03(new w03(od2.E(new qn5(2, new mn5[]{(w7c) ((wva) qp4.c).c, w03, v7c, x, q0e})), qp4, 2), 11), new z03(qp4, (Continuation) null), 5), 18, new a13(qp4, (Continuation) null, 0)), new a13(qp4, (Continuation) null, 1)), sx3);
            k56 k56 = this.Z;
            od2.L(new zn5((w7c) qp4.t0, new b13(qp4, k56, (Continuation) null), 5), sx3);
            od2.L(new zn5(q0e, new c13(qp4, k56, (Continuation) null), 5), sx3);
            return e5f.a;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
