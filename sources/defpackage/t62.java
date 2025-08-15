package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: t62  reason: default package */
public final class t62 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ k72 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t62(k72 k72, Continuation continuation) {
        super(2, continuation);
        this.Y = k72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t62) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new t62(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            k72 k72 = this.Y;
            kld kld = k72.f;
            bc7[] bc7Arr = k72.x;
            kl7 l = j1e.l();
            o22 o22 = (o22) k72.i.getValue();
            if ((o22 != null ? o22.b : null) == n22.c) {
                l.add(new tt3(sea.A0, (jqe) new eqe(vea.N1), Integer.valueOf(wfa.U), Integer.valueOf(woc.O1), Integer.valueOf(wfa.P)));
            }
            tcb tcb = new tcb(j1e.d(l));
            this.X = 1;
            if (kld.a(tcb, this) == tx3) {
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
