package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: th2  reason: default package */
public final class th2 extends ffe implements a66 {
    public final /* synthetic */ gi2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public th2(gi2 gi2, Continuation continuation) {
        super(2, continuation);
        this.X = gi2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((th2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new th2(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = gi2.R0;
        wha wha = (wha) this.X.x0.getValue();
        wha.g(new eqe(yea.U1));
        wha.e(new kia(woc.n));
        return wha.i();
    }
}
