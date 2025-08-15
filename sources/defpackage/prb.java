package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: prb  reason: default package */
public final class prb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ rrb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public prb(Continuation continuation, rrb rrb) {
        super(2, continuation);
        this.Y = rrb;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((prb) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        prb prb = new prb(continuation, this.Y);
        prb.X = obj;
        return prb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        rrb.a(this.Y, (gv1) this.X);
        return e5f.a;
    }
}
