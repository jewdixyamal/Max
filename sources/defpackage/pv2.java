package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: pv2  reason: default package */
public final class pv2 extends ffe implements a66 {
    public final /* synthetic */ gw2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pv2(gw2 gw2, Continuation continuation) {
        super(2, continuation);
        this.X = gw2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((pv2) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pv2(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        gw2 gw2 = this.X;
        k9c k9c = gw2.b;
        k9c.getClass();
        new qa3(new c0a(new ty9(qy9.j(k9c.a.E(p82.I)), new j9c(k9c, 2), 1), new j9c(k9c, 5)), 0, new c0a(new ty9(new ty9(qy9.j(k9c.b.j(el3.r, el3.t)), new j9c(k9c, 6), 1), new j9c(k9c, 0), 1), new j9c(k9c, 4))).k(k9c.c).i(new iq1(new p4c(8), 0, new fa4(4)));
        q0e q0e = gw2.E0;
        ov2 ov2 = (ov2) q0e.getValue();
        it6 it6 = ov2.c;
        q0e.m((Object) null, ov2.a(ov2, (nv2) null, new it6(it6.a, nz4.a, it6.c), (ArrayList) null, false, 27));
        return e5f.a;
    }
}
