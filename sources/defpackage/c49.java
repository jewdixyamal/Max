package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: c49  reason: default package */
public final class c49 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c49(n59 n59, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = n59;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new c49(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        long j = this.Z;
        n59 n59 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ab6.a((ab6) n59.Y0.getValue(), j, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uj3 uj3 = (uj3) obj;
        int i2 = (j > ((hyc) n59.y0).t() ? 1 : (j == ((hyc) n59.y0).t() ? 0 : -1));
        s35 s35 = n59.u1;
        if (i2 == 0) {
            pnf.o(s35, new pnd(new eqe(jpc.A2), 0, (eqe) null, 6));
        } else if (uj3 == null || uj3.k() != 0 || uj3.w()) {
            pnf.o(s35, new pnd(new eqe(oda.Q0), 0, (eqe) null, 6));
        } else {
            u29.c.getClass();
            pnf.o(n59.v1, new c64(":profile?id=" + j + "&type=contact"));
        }
        return e5f.a;
    }
}
