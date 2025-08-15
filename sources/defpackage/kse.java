package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kse  reason: default package */
public final class kse extends ffe implements a66 {
    public final /* synthetic */ lse X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kse(lse lse, String str, Continuation continuation) {
        super(2, continuation);
        this.X = lse;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((kse) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kse(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        pq9 pq9 = qp4.u0;
        lse lse = this.X;
        qp4 b = pq9.b(lse.b);
        String str = this.Y;
        b.l(str, true);
        lse.o.setValue(lse.q());
        pnf.o(lse.X, new jse(str));
        return e5f.a;
    }
}
