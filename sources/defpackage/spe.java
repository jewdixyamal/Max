package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: spe  reason: default package */
public final class spe extends ffe implements a66 {
    public final /* synthetic */ tpe X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public spe(tpe tpe, Continuation continuation) {
        super(2, continuation);
        this.X = tpe;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((spe) n((e5f) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new spe(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.X.c.clear();
        return e5f.a;
    }
}
