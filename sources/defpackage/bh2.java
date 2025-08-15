package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bh2  reason: default package */
public final class bh2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ dh2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bh2(dh2 dh2, Continuation continuation) {
        super(2, continuation);
        this.Y = dh2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bh2) n((e52) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bh2 bh2 = new bh2(this.Y, continuation);
        bh2.X = obj;
        return bh2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        e52 e52 = (e52) this.X;
        q0e q0e = this.Y.b;
        String g = e52.g(kk0.c, jk0.a);
        e52.l0();
        q0e.m((Object) null, new ch2(new tka(g, e52.x0, e52.f(), (od0) null, 24), e52.q()));
        return e5f.a;
    }
}
