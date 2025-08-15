package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cq2  reason: default package */
public final class cq2 extends ffe implements a66 {
    public final /* synthetic */ rq2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cq2(rq2 rq2, Continuation continuation) {
        super(2, continuation);
        this.X = rq2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cq2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cq2(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        rq2 rq2 = this.X;
        e52 e52 = (e52) rq2.Y0.a.getValue();
        e5f e5f = e5f.a;
        if (e52 != null) {
            long j = e52.b.a;
            sna sna = (sna) rq2.I0.getValue();
            sna.getClass();
            if (j != 0) {
                sna.f(j, b10.STICKER, 0);
            }
        }
        return e5f;
    }
}
