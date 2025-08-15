package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: iu5  reason: default package */
public final class iu5 extends ffe implements a66 {
    public final /* synthetic */ nu5 X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iu5(nu5 nu5, long j, Continuation continuation) {
        super(2, continuation);
        this.X = nu5;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((iu5) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new iu5(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = nu5.D0;
        this.X.s(this.Y);
        return e5f.a;
    }
}
