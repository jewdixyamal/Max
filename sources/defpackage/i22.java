package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i22  reason: default package */
public final class i22 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ l22 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i22(l22 l22, Continuation continuation) {
        super(2, continuation);
        this.Y = l22;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((i22) n((vcb) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        i22 i22 = new i22(this.Y, continuation);
        i22.X = obj;
        return i22;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        pnf.o(this.Y.s0, (vcb) this.X);
        return e5f.a;
    }
}
