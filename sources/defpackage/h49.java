package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h49  reason: default package */
public final class h49 extends ffe implements a66 {
    public e52 X;
    public int Y;
    public final /* synthetic */ n59 Z;
    public final /* synthetic */ axc s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h49(n59 n59, axc axc, Continuation continuation) {
        super(2, continuation);
        this.Z = n59;
        this.s0 = axc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h49(this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        e52 e52;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            e52 e522 = (e52) this.Z.o1.a.getValue();
            if (e522 == null) {
                return e5f;
            }
            long j = this.Z.b.a;
            this.X = e522;
            this.Y = 1;
            p82 l = ((jz2) ((iy2) ((lx8) this.Z.Q0.getValue()).b.getValue())).l();
            l.getClass();
            l.h(j, true, new v72(j, 0));
            l.m.c(new tc2(j, 0L));
            if (e5f == tx3) {
                return tx3;
            }
            e52 = e522;
        } else if (i == 1) {
            e52 = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qz7 qz7 = this.Z.u0;
        long j2 = this.s0.a;
        String str = (String) qz7.b;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, ey8.h(j2, "Marking as read reaction for message="), (Throwable) null);
        }
        ((p7c) ((je7) qz7.c).getValue()).d(e52.b.a, e52.n(), j2, false, false, false, true);
        return e5f;
    }
}
