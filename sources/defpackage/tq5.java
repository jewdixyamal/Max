package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tq5  reason: default package */
public final class tq5 extends ffe implements a66 {
    public final /* synthetic */ xm7 X;
    public final /* synthetic */ g2a Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tq5(xm7 xm7, g2a g2a, Continuation continuation) {
        super(2, continuation);
        this.X = xm7;
        this.Y = g2a;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((tq5) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tq5(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.X.j(this.Y);
        return e5f.a;
    }
}
