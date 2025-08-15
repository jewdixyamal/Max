package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: es2  reason: default package */
public final class es2 extends ffe implements a66 {
    public final /* synthetic */ ks2 X;
    public final /* synthetic */ zy3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public es2(ks2 ks2, zy3 zy3, Continuation continuation) {
        super(2, continuation);
        this.X = ks2;
        this.Y = zy3;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((es2) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new es2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ks2.q(this.X, ((yy3) this.Y).b);
        return e5f.a;
    }
}
