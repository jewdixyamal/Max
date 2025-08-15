package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fhb  reason: default package */
public final class fhb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ hhb Y;
    public final /* synthetic */ oi0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fhb(hhb hhb, oi0 oi0, Continuation continuation) {
        super(2, continuation);
        this.Y = hhb;
        this.Z = oi0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fhb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fhb(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            hhb hhb = this.Y;
            kld kld = hhb.a;
            oi0 oi0 = this.Z;
            ygb ygb = new ygb(new Long(oi0.a), hhb.a(hhb, oi0.b));
            this.X = 1;
            if (kld.a(ygb, this) == tx3) {
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
