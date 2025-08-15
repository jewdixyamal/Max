package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n39  reason: default package */
public final class n39 extends ffe implements a66 {
    public final /* synthetic */ n59 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n39(n59 n59, Continuation continuation) {
        super(2, continuation);
        this.X = n59;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((n39) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new n39(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        i00 i00 = this.X.z0;
        vxd L = od2.L(new zn5(new t03(i00.a.c, 11), new h00(i00, (Continuation) null), 5), i00.c);
        i00.d.o1(i00, i00.f[0], L);
        return e5f.a;
    }
}
