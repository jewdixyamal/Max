package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: y92  reason: default package */
public final class y92 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ka2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y92(ka2 ka2, Continuation continuation) {
        super(2, continuation);
        this.Y = ka2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y92) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new y92(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ka2 ka2 = this.Y;
            boolean z = ka2.B && ka2.C;
            long j = ka2.n;
            ((s8g) ka2.u.getValue()).a(new g8d(j, z));
            if (z) {
                kld kld = ka2.d;
                mfb mfb = new mfb(j);
                this.X = 1;
                if (kld.a(mfb, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
