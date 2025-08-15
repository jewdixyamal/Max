package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gcc  reason: default package */
public final class gcc extends ffe implements a66 {
    public final /* synthetic */ kcc X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gcc(kcc kcc, Continuation continuation) {
        super(2, continuation);
        this.X = kcc;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((gcc) n((wvc) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gcc(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        pnf.o(this.X.u0, cj1.D);
        return e5f.a;
    }
}
