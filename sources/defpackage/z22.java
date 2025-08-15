package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z22  reason: default package */
public final class z22 extends ffe implements a66 {
    public final /* synthetic */ a32 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z22(a32 a32, Continuation continuation) {
        super(2, continuation);
        this.X = a32;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((z22) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new z22(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        a32 a32 = this.X;
        ((jz2) ((iy2) a32.o.getValue())).l().Q(a32.b);
        pnf.o(a32.Z, pkb.b);
        return e5f.a;
    }
}
