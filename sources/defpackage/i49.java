package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i49  reason: default package */
public final class i49 extends ffe implements a66 {
    public final /* synthetic */ n59 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i49(n59 n59, Continuation continuation) {
        super(2, continuation);
        this.X = n59;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((i49) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new i49(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        n59.u(this.X);
        return e5f.a;
    }
}
