package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: fmc  reason: default package */
public final class fmc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ hmc Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ int s0 = 2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fmc(hmc hmc, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = hmc;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fmc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fmc(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            List singletonList = Collections.singletonList(new Long(this.Z));
            this.X = 1;
            hmc hmc = this.Y;
            Object t0 = j47.t0(((w9a) hmc.a).b(), new gmc(hmc, singletonList, this.s0, (Continuation) null), this);
            if (t0 != tx3) {
                t0 = e5f;
            }
            if (t0 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
