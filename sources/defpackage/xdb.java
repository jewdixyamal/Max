package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xdb  reason: default package */
public final class xdb extends ffe implements a66 {
    public final /* synthetic */ feb X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xdb(feb feb, Continuation continuation) {
        super(2, continuation);
        this.X = feb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xdb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xdb(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = feb.G0;
        feb feb = this.X;
        long t = ((hyc) ((q33) feb.x0.getValue())).t();
        long j = feb.c;
        int i = (t > j ? 1 : (t == j ? 0 : -1));
        e5f e5f = e5f.a;
        if (i == 0) {
            pnf.o(feb.C0, new kdb(new eqe(vea.g1), (Integer) null));
            return e5f;
        }
        gfb.c.getClass();
        pnf.o(feb.B0, new c64(":profile?id=" + j + "&type=contact"));
        return e5f;
    }
}
