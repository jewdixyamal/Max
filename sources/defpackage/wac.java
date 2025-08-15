package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wac  reason: default package */
public final class wac extends ffe implements a66 {
    public final /* synthetic */ cbc X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wac(cbc cbc, Continuation continuation) {
        super(2, continuation);
        this.X = cbc;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((wac) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wac(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        jac jac = this.X.c;
        eqe eqe = new eqe(mga.e);
        jac.getClass();
        pnf.o(jac.b, new gac(eqe));
        return e5f.a;
    }
}
