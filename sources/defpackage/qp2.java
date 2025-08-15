package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qp2  reason: default package */
public final class qp2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ e52 Y;
    public final /* synthetic */ rq2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qp2(e52 e52, rq2 rq2, Continuation continuation) {
        super(2, continuation);
        this.Y = e52;
        this.Z = rq2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qp2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        c64 c64;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            rq2 rq2 = this.Z;
            long t = ((hyc) ((q33) rq2.x0.getValue())).t();
            e52 e52 = this.Y;
            boolean f = e52.b.f(t);
            long j = e52.a;
            if (f) {
                vo2.c.getClass();
                c64 = new c64(":profile/attaches?id=" + j);
            } else {
                vo2 vo2 = vo2.c;
                boolean w = rq2.w();
                vo2.getClass();
                c64 = new c64(":profile?id=" + j + "&type=local_chat&is_opened_from_dialog=" + w);
            }
            kld kld = rq2.a1;
            this.X = 1;
            if (kld.a(c64, this) == tx3) {
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
