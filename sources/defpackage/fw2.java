package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fw2  reason: default package */
public final class fw2 extends ffe implements a66 {
    public final /* synthetic */ gw2 X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fw2(gw2 gw2, long j, Continuation continuation) {
        super(2, continuation);
        this.X = gw2;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fw2) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fw2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = gw2.Q0;
        p82 l = ((jz2) this.X.s()).l();
        p82 p82 = l;
        cqc.a(new y72(p82, this.Y, ((p7b) l.n).a.n(), 0), l.z, (f6) null, new un0(18), (ztc) null);
        return e5f.a;
    }
}
