package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ojb  reason: default package */
public final class ojb extends ffe implements a66 {
    public final /* synthetic */ zjb X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ojb(zjb zjb, Continuation continuation) {
        super(2, continuation);
        this.X = zjb;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ojb) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ojb(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wha wha = (wha) this.X.Y.getValue();
        wha.g(new eqe(vea.I1));
        wha.e(new kia(woc.I));
        wha.i();
        return e5f.a;
    }
}
