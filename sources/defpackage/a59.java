package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a59  reason: default package */
public final class a59 extends ffe implements a66 {
    public final /* synthetic */ n59 X;
    public final /* synthetic */ cu8 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a59(n59 n59, cu8 cu8, Continuation continuation) {
        super(2, continuation);
        this.X = n59;
        this.Y = cu8;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((a59) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new a59(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        long j = this.Y.b;
        bc7[] bc7Arr = n59.D1;
        this.X.K(j, false, false, false);
        return e5f.a;
    }
}
