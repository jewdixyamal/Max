package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sz0  reason: default package */
public final class sz0 extends ffe implements a66 {
    public final /* synthetic */ yz0 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sz0(yz0 yz0, Continuation continuation) {
        super(2, continuation);
        this.X = yz0;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sz0) n((mm3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sz0(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = yz0.G0;
        this.X.l();
        return e5f.a;
    }
}
