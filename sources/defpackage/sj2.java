package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sj2  reason: default package */
public final class sj2 extends ffe implements a66 {
    public final /* synthetic */ ck2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sj2(ck2 ck2, Continuation continuation) {
        super(2, continuation);
        this.X = ck2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sj2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sj2(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = ck2.d1;
        ck2 ck2 = this.X;
        sb8 x = ck2.x();
        w7c w7c = ck2.W0;
        sb8 sb8 = ((ej2) w7c.a.getValue()).a;
        boolean z = x instanceof qb8;
        e5f e5f = e5f.a;
        kld kld = ck2.X0;
        if (!z || !tpa.f(sb8, x)) {
            kld.g(Boolean.FALSE);
            return e5f;
        }
        ej2 ej2 = new ej2((qb8) null, 3);
        q0e q0e = ck2.V0;
        q0e.m((Object) null, ej2);
        q0e.setValue((ej2) w7c.a.getValue());
        kld.g(Boolean.TRUE);
        return e5f;
    }
}
