package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rq5  reason: default package */
public final class rq5 extends ffe implements a66 {
    public final /* synthetic */ xm7 X;
    public final /* synthetic */ g2a Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rq5(xm7 xm7, gu1 gu1, Continuation continuation) {
        super(2, continuation);
        this.X = xm7;
        this.Y = gu1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((rq5) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rq5(this.X, (gu1) this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.X.f(this.Y);
        return e5f.a;
    }
}
