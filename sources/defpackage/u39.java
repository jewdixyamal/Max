package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u39  reason: default package */
public final class u39 extends ffe implements a66 {
    public final /* synthetic */ n59 X;
    public final /* synthetic */ w69 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u39(n59 n59, w69 w69, Continuation continuation) {
        super(2, continuation);
        this.X = n59;
        this.Y = w69;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((u39) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new u39(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        long j = this.Y.a;
        bc7[] bc7Arr = n59.D1;
        this.X.K(j, true, true, false);
        return e5f.a;
    }
}
