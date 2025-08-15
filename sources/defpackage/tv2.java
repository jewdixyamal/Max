package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tv2  reason: default package */
public final class tv2 extends ffe implements a66 {
    public final /* synthetic */ gw2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tv2(gw2 gw2, Continuation continuation) {
        super(2, continuation);
        this.X = gw2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((tv2) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tv2(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        gw2 gw2 = this.X;
        yx7 yx7 = gw2.o;
        String str = ((ov2) gw2.E0.getValue()).b;
        yx7.getClass();
        hm9.m("yx7", "loadNextMessages", new Object[0]);
        if (!cqc.c(yx7.l)) {
            hm9.m("yx7", "searchMessagesInternal: is loading, return", new Object[0]);
        } else {
            au auVar = new au(str, !oag.t(yx7.s) ? yx7.s : null);
            tle tle = (tle) yx7.d;
            tle.getClass();
            q1a q1a = new q1a(1, new ypc(tle, 9, auVar));
            ztc ztc = yx7.c;
            drd i = q1a.i(ztc);
            fme fme = yx7.f;
            fme.getClass();
            drd i2 = i.j(new dme(fme, 1, 0)).m(ztc).i(yx7.b);
            iq1 iq1 = new iq1(new sx7(yx7, str, 0), 2, new rx7(yx7, 1));
            i2.k(iq1);
            yx7.l = iq1;
        }
        return e5f.a;
    }
}
