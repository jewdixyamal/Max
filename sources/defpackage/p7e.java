package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p7e  reason: default package */
public final class p7e extends ffe implements a66 {
    public int X;
    public final /* synthetic */ a8e Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p7e(a8e a8e, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = a8e;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p7e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new p7e(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        a8e a8e = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = a8e.C0;
            db3 d = ((sc5) a8e.s0.getValue()).d(this.Z, false);
            this.X = 1;
            if (s36.e(d, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pnf.o(a8e.A0, new ued(woc.w, new eqe(hja.l)));
        return e5f.a;
    }
}
