package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fy7  reason: default package */
public final class fy7 extends ffe implements a66 {
    public final /* synthetic */ l84 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fy7(l84 l84, Continuation continuation) {
        super(2, continuation);
        this.X = l84;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fy7) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fy7(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        q9b q9b = q9b.s0;
        q9b.s0.Y.a(new fdc(6, this.X));
        return e5f.a;
    }
}
