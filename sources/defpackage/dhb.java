package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dhb  reason: default package */
public final class dhb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ehb Y;
    public final /* synthetic */ chb Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dhb(ehb ehb, chb chb, Continuation continuation) {
        super(2, continuation);
        this.Y = ehb;
        this.Z = chb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dhb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dhb(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.b;
            this.X = 1;
            if (kld.a(this.Z, this) == tx3) {
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
