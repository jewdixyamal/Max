package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zh2  reason: default package */
public final class zh2 extends ffe implements a66 {
    public final /* synthetic */ l20 X;
    public final /* synthetic */ gi2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zh2(l20 l20, gi2 gi2, Continuation continuation) {
        super(2, continuation);
        this.X = l20;
        this.Y = gi2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zh2) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zh2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int i = this.X.d() ? yea.R1 : yea.S1;
        bc7[] bc7Arr = gi2.R0;
        wha wha = (wha) this.Y.x0.getValue();
        wha.g(new eqe(i));
        wha.e(new kia(woc.n));
        wha.i();
        return e5f.a;
    }
}
