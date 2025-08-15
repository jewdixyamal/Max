package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: c3e  reason: default package */
public final class c3e extends ffe implements a66 {
    public final /* synthetic */ i3e X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c3e(i3e i3e, Continuation continuation) {
        super(2, continuation);
        this.X = i3e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c3e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new c3e(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        e52 e52 = (e52) ((jz2) ((iy2) this.X.s0.getValue())).m(this.X.b).a.getValue();
        e5f e5f = e5f.a;
        if (e52 == null) {
            return e5f;
        }
        q0e q0e = this.X.z0;
        e52.k0();
        q0e.setValue(e52.u0);
        return e5f;
    }
}
