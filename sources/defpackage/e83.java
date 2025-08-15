package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e83  reason: default package */
public final class e83 extends ffe implements a66 {
    public final /* synthetic */ m83 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e83(m83 m83, Continuation continuation) {
        super(2, continuation);
        this.X = m83;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((e83) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e83(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        m83 m83 = this.X;
        m83.getClass();
        vxd T = j47.T(m83.k, (lx3) null, vx3.b, new k83(m83, (Continuation) null), 1);
        m83.l.o1(m83, m83.m[0], T);
        return e5f.a;
    }
}
