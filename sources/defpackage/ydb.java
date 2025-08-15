package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ydb  reason: default package */
public final class ydb extends ffe implements a66 {
    public final /* synthetic */ feb X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ydb(feb feb, Continuation continuation) {
        super(2, continuation);
        this.X = feb;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ydb) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ydb(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = feb.G0;
        feb feb = this.X;
        e52 s = feb.s();
        long j = feb.c;
        boolean z = false;
        if (s != null && s.Y(j)) {
            z = true;
        }
        if (((hyc) ((q33) feb.x0.getValue())).t() != j && !z) {
            pnf.o(feb.C0, new kdb(new eqe(vea.h1), new Integer(rea.b)));
        }
        return e5f.a;
    }
}
