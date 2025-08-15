package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pj  reason: default package */
public final class pj extends ffe implements a66 {
    public final /* synthetic */ rj X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pj(rj rjVar, Continuation continuation) {
        super(2, continuation);
        this.X = rjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((pj) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pj(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        rj rjVar = this.X;
        ld2 ld2 = (ld2) ((lr2) rjVar.f.getValue());
        ld2.t.j(-1);
        ld2.v.j(-1);
        ((t6b) rjVar.d.getValue()).a();
        ((jz2) ((iy2) rjVar.e.getValue())).l().O();
        ((ci0) rjVar.g.getValue()).a(ht2.a);
        return e5f.a;
    }
}
