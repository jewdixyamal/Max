package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wo2  reason: default package */
public final class wo2 extends ffe implements a66 {
    public final /* synthetic */ rq2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wo2(rq2 rq2, Continuation continuation) {
        super(2, continuation);
        this.X = rq2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((wo2) n((aj5) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wo2(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        pnf.o(this.X.b1, new ep2(u8a.m, new Integer(u8a.l), (Integer) null, 4));
        return e5f.a;
    }
}
