package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: omb  reason: default package */
public final class omb extends ffe implements a66 {
    public final /* synthetic */ cnb X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public omb(cnb cnb, long j, Continuation continuation) {
        super(2, continuation);
        this.X = cnb;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((omb) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new omb(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        cnb cnb = this.X;
        zfc.a((zfc) cnb.o.getValue(), this.Y);
        pnf.o(cnb.A0, pkb.b);
        return e5f.a;
    }
}
