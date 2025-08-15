package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: led  reason: default package */
public final class led extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ped Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public led(ped ped, Continuation continuation) {
        super(2, continuation);
        this.Y = ped;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((led) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new led(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        ped ped = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            Object t0 = j47.t0(((w9a) ((kke) ped.s0.getValue())).b(), new med(ped, (Continuation) null), this);
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
        bc7[] bc7Arr = ped.z0;
        ped.q(0);
        return e5f;
    }
}
