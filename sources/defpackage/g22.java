package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: g22  reason: default package */
public final class g22 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ l22 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g22(l22 l22, Continuation continuation) {
        super(2, continuation);
        this.Y = l22;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((g22) n((y12) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g22 g22 = new g22(this.Y, continuation);
        g22.X = obj;
        return g22;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        y12 y12 = (y12) this.X;
        l22 l22 = this.Y;
        l22.X.setValue(y12.a);
        l22.c.setValue(y12.b);
        return e5f.a;
    }
}
