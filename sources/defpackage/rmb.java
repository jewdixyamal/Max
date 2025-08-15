package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rmb  reason: default package */
public final class rmb extends ffe implements a66 {
    public final /* synthetic */ cnb X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rmb(cnb cnb, long j, Continuation continuation) {
        super(2, continuation);
        this.X = cnb;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((rmb) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rmb(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = cnb.S0;
        cnb cnb = this.X;
        ((jz2) cnb.t()).l().Q(this.Y);
        pnf.o(cnb.A0, pkb.b);
        return e5f.a;
    }
}
