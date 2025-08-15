package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ai2  reason: default package */
public final class ai2 extends ffe implements a66 {
    public final /* synthetic */ gi2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ai2(gi2 gi2, Continuation continuation) {
        super(2, continuation);
        this.X = gi2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ai2) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ai2(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        gi2.s(this.X);
        return e5f.a;
    }
}
