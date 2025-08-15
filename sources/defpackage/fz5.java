package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fz5  reason: default package */
public final class fz5 extends ffe implements a66 {
    public final /* synthetic */ iz5 X;
    public final /* synthetic */ StringBuilder Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fz5(iz5 iz5, StringBuilder sb, Continuation continuation) {
        super(2, continuation);
        this.X = iz5;
        this.Y = sb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fz5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fz5(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wha wha = (wha) this.X.k.getValue();
        wha.h(this.Y);
        return wha.i();
    }
}
