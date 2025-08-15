package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fe1  reason: default package */
public final class fe1 extends ffe implements a66 {
    public final /* synthetic */ ie1 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fe1(ie1 ie1, Continuation continuation) {
        super(2, continuation);
        this.X = ie1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fe1) n((wvc) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fe1(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        pnf.o(this.X.u0, cj1.D);
        return e5f.a;
    }
}
