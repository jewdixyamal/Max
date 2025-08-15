package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: emc  reason: default package */
public final class emc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ hmc Y;
    public final /* synthetic */ m56 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public emc(hmc hmc, k5d k5d, Continuation continuation) {
        super(2, continuation);
        this.Y = hmc;
        this.Z = k5d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((emc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new emc(this.Y, (k5d) this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            hmc hmc = this.Y;
            ilc m = hmc.b.m();
            m44 m44 = new m44(hmc, (k5d) this.Z, (Continuation) null, 2);
            this.X = 1;
            if (z04.e0(m, m44, this) == tx3) {
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
