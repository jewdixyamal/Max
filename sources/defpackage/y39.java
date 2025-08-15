package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: y39  reason: default package */
public final class y39 extends ffe implements a66 {
    public final /* synthetic */ n59 X;
    public final /* synthetic */ ej7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y39(n59 n59, ej7 ej7, Continuation continuation) {
        super(2, continuation);
        this.X = n59;
        this.Y = ej7;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((y39) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new y39(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        n59 n59 = this.X;
        rg1 rg1 = n59.c;
        ej7 ej7 = this.Y;
        rg1.j(((aj7) ej7).a, true, false, false, new yf3(n59, 19, ej7));
        return e5f.a;
    }
}
