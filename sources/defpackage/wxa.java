package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wxa  reason: default package */
public final class wxa extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ eya Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wxa(Object obj, Continuation continuation, eya eya) {
        super(2, continuation);
        this.X = obj;
        this.Y = eya;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wxa) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wxa(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        kzc kzc = (kzc) this.X;
        int i = kzc.a;
        eya eya = this.Y;
        return i == 4 ? ((tya) eya.u0.getValue()).a(kzc.X, true) : eya.q(eya, ((vu2) eya.t0.getValue()).a(kzc.o));
    }
}
