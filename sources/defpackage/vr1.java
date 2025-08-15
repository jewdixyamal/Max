package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vr1  reason: default package */
public final class vr1 extends ffe implements a66 {
    public final /* synthetic */ wr1 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vr1(wr1 wr1, Continuation continuation) {
        super(2, continuation);
        this.X = wr1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((vr1) n((fqa) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vr1(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = wr1.K;
        wr1 wr1 = this.X;
        bt1 m = wr1.m();
        String str = wr1.j().c;
        boolean z = wr1.j().h;
        m.getClass();
        bt1.c(m, "BAD_CONNECTION_ALERT", str, "BAD_NETWORK", (Long) null, (String) null, (String) null, z, 56);
        return e5f.a;
    }
}
