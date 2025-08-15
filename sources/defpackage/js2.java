package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: js2  reason: default package */
public final class js2 extends ffe implements a66 {
    public final /* synthetic */ ks2 X;
    public final /* synthetic */ e52 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public js2(ks2 ks2, e52 e52, Continuation continuation) {
        super(2, continuation);
        this.X = ks2;
        this.Y = e52;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((js2) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new js2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ks2.q(this.X, this.Y.a);
        return e5f.a;
    }
}
