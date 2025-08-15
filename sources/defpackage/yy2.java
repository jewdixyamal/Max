package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yy2  reason: default package */
public final class yy2 extends ffe implements a66 {
    public final /* synthetic */ je7 X;
    public final /* synthetic */ jz2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yy2(je7 je7, jz2 jz2, Continuation continuation) {
        super(2, continuation);
        this.X = je7;
        this.Y = jz2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yy2) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yy2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ((p82) this.X.getValue()).G = this.Y.b;
        return e5f.a;
    }
}
