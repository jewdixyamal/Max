package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cx2  reason: default package */
public final class cx2 extends ffe implements a66 {
    public final /* synthetic */ nx2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cx2(nx2 nx2, Continuation continuation) {
        super(2, continuation);
        this.X = nx2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((cx2) n((on5) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cx2(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.X.b.b();
        return e5f.a;
    }
}
