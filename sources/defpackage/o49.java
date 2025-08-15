package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o49  reason: default package */
public final class o49 extends ffe implements a66 {
    public final /* synthetic */ n59 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o49(n59 n59, Continuation continuation) {
        super(2, continuation);
        this.X = n59;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((o49) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new o49(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = n59.D1;
        n59 n59 = this.X;
        wha C = n59.C();
        C.e(new kia(woc.n));
        C.g(new eqe(oda.x0));
        n59.M(C);
        C.i();
        return e5f.a;
    }
}
