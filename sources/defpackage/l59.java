package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l59  reason: default package */
public final class l59 extends ffe implements a66 {
    public final /* synthetic */ n59 X;
    public final /* synthetic */ ta3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l59(n59 n59, ua3 ua3, Continuation continuation) {
        super(2, continuation);
        this.X = n59;
        this.Y = ua3;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((l59) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l59(this.X, (ua3) this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = n59.D1;
        n59 n59 = this.X;
        wha C = n59.C();
        C.e(nia.a);
        C.g(new eqe(oda.m0));
        C.f(new sia(new eqe(oda.n0)));
        C.d(new yt8(4, (Object) (ua3) this.Y));
        n59.M(C);
        C.i();
        return e5f.a;
    }
}
